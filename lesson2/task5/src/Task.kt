import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervalMany: Pair<TimeInterval, Int>): MyDate = addTimeIntervals(timeIntervalMany.first, timeIntervalMany.second)

operator fun TimeInterval.times(i: Int): Pair<TimeInterval, Int> {
    return Pair(this, i)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
     return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

