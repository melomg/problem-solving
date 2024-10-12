package hackerrank

fun main() {

    /**
     * @see: <a href="https://www.hackerrank.com/challenges/bon-appetit/problem">bon-appetit</>
     * @param bill: an array of integers representing the cost of each item ordered
     * @param k: an integer representing the zero-based index of the item Anna doesn't eat
     * @param b: the amount of money that Anna contributed to the bill
     * @return Amount of money that Brian owes
     */
    fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Int {
        val fair = (bill.sum() - bill[k]) / 2
        return b - fair
    }

    fun testBonAppetit(name: String, output: Int) {
        val lines = readInputForHackerRank(name)

        val k = lines[0].trimEnd().split(" ")[1].toInt()
        val bill = lines[1].trimEnd().split(" ").map { it.toInt() }.toTypedArray()
        val b = lines[2].trim().toInt()

        check(bonAppetit(bill, k, b) == output)
    }

    testBonAppetit("BonAppetit_test1", 5)
    testBonAppetit("BonAppetit_test2", 0)
}
