package FactoryPatterns

abstract class Pizza {
  val name: String
  val dough: String
  val sauce: String
  val topping: String

  def prepare(): Unit = {
    println("준비중:" + name)
    println("도우를 돌리는 중...")
    println("소스를 뿌리는 중...")
    println("토핑을 올리는 중...")
  }

  def bake(): Unit = {
    println("빵을 굽는 중")
  }

  def cut(): Unit = {
    println("빵을 자르는 중")
  }

  def box(): Unit = {
    println("상자에 답는 중")
  }
}