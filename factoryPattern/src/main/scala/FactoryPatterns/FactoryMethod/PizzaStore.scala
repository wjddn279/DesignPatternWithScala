package FactoryPatterns.FactoryMethod

import FactoryPatterns.Pizza

abstract class PizzaStore {
  def ordering(region: String): Unit = {

  }

  def create(region: String): Pizza:
}
