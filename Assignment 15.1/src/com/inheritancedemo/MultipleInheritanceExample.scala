package com.inheritancedemo

object MultipleInheritanceExample {
  def main(args: Array[String]): Unit = {

    trait FirstTrait {
      var distance: Int = _
      def update = {
        distance = distance + 5
      }
    }

    trait SecondTrait {
      var driverVar: Int = _
      def update = {
        driverVar = driverVar + 1
      }
    }

    class FirstSecondTrait extends FirstTrait with SecondTrait {
      distance = 3;
      driverVar = 6;
      override def update = {
        super[FirstTrait].update
        super[SecondTrait].update
      }
    }

    var firstSceondTrait = new FirstSecondTrait
    firstSceondTrait.update
    println(firstSceondTrait.driverVar)
    println(firstSceondTrait.distance)
  }
}
