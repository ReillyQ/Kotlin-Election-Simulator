import kotlin.math.round

class Ballot (val ProScore: Int, val NlpScore: Int, val AlpScore: Int, val GaoScore: Int, val PatScore: Int, val CcpScore: Int)

fun main() {
    val votes: MutableList<Ballot> = ArrayList()

    val proVoters = (24200000..37400000).random()
    val nlpVoters = (50600000..63800000).random()
    val alpVoters = (19800000..33000000).random()
    val gaoVoters = (24200000..37400000).random()
    val patVoters = (24200000..37400000).random()
    val ccpVoters = (37400000..50600000).random()

    var proTotal = 0.0
    var nlpTotal = 0.0
    var alpTotal = 0.0
    var gaoTotal = 0.0
    var patTotal = 0.0
    var ccpTotal = 0.0
    var totalTotal = 0.0

    for (i in 0 until proVoters) {
        votes.add(Ballot((8..10).random(), (5..10).random(), (5..10).random(), (3..8).random(), (0..5).random(), (0..5).random()))
    }

    for (i in 0 until nlpVoters) {
        votes.add(Ballot((5..10).random(), (8..10).random(), (5..10).random(), (5..10).random(), (0..5).random(), (0..5).random()))
    }

    for (i in 0 until alpVoters) {
        votes.add(Ballot((5..10).random(), (5..10).random(), (8..10).random(), (5..10).random(), (0..5).random(), (0..5).random()))
    }

    for (i in 0 until gaoVoters) {
        votes.add(Ballot((3..8).random(), (5..10).random(), (5..10).random(), (8..10).random(), (5..10).random(), (5..10).random()))
    }

    for (i in 0 until patVoters) {
        votes.add(Ballot((0..5).random(), (3..8).random(), (3..8).random(), (5..10).random(), (8..10).random(), (5..10).random()))
    }

    for (i in 0 until ccpVoters) {
        votes.add(Ballot((0..5).random(), (3..8).random(), (3..8).random(), (5..10).random(), (5..10).random(), (8..10).random()))
    }

    for (i in votes) {
        proTotal += i.ProScore
        nlpTotal += i.NlpScore
        alpTotal += i.AlpScore
        gaoTotal += i.GaoScore
        patTotal += i.PatScore
        ccpTotal += i.CcpScore
    }

    totalTotal += (proTotal + nlpTotal + alpTotal + gaoTotal + patTotal + ccpTotal)

    val proAvScore = proTotal / votes.size
    val nlpAvScore = nlpTotal / votes.size
    val alpAvScore = alpTotal / votes.size
    val gaoAvScore = gaoTotal / votes.size
    val patAvScore = patTotal / votes.size
    val ccpAvScore = ccpTotal / votes.size

    val proPortion = proTotal / totalTotal
    val nlpPortion = nlpTotal / totalTotal
    val alpPortion = alpTotal / totalTotal
    val gaoPortion = gaoTotal / totalTotal
    val patPortion = patTotal / totalTotal
    val ccpPortion = ccpTotal / totalTotal

    val proPercent = proPortion * 100
    val nlpPercent = nlpPortion * 100
    val alpPercent = alpPortion * 100
    val gaoPercent = gaoPortion * 100
    val patPercent = patPortion * 100
    val ccpPercent = ccpPortion * 100

    val seats = 17483

    val proSeats = proPortion * seats
    val nlpSeats = nlpPortion * seats
    val alpSeats = alpPortion * seats
    val gaoSeats = gaoPortion * seats
    val patSeats = patPortion * seats
    val ccpSeats = ccpPortion * seats

    println("PRO: ${round(proSeats)} seats, ${round(proPercent)}%, Average Score of $proAvScore")
    println("NLP: ${round(nlpSeats)} seats, ${round(nlpPercent)}%, Average Score of $nlpAvScore")
    println("ALP: ${round(alpSeats)} seats, ${round(alpPercent)}%, Average Score of $alpAvScore")
    println("GAO: ${round(gaoSeats)} seats, ${round(gaoPercent)}%, Average Score of $gaoAvScore")
    println("PAT: ${round(patSeats)} seats, ${round(patPercent)}%, Average Score of $patAvScore")
    println("CCP: ${round(ccpSeats)} seats, ${round(ccpPercent)}%, Average Score of $ccpAvScore")
}