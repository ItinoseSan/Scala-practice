import java.util.Map.Entry

import scala.collection.mutable

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val dataMap:mutable.TreeMap[Integer,String] = mutable.TreeMap.empty[Integer,String]
    dataMap.put(1,"Hoge")
    dataMap.put(2,"Foo")
    dataMap.put(3,"piyo")
    print(dataMap.toStream)
  }
}