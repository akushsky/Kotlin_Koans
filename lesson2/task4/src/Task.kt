class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return MyDateIterator(this)
    }
}

class MyDateIterator(val dateRange: DateRange) : Iterator<MyDate> {
    var currentDate: MyDate = dateRange.start

    override fun hasNext(): Boolean {
        return currentDate <= dateRange.end
    }

    override fun next(): MyDate {
        val retDate: MyDate = currentDate
        currentDate = retDate.nextDay()
        return retDate
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
