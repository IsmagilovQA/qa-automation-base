package main.appium.listeners

import org.junit.platform.engine.TestExecutionResult
import org.junit.platform.launcher.TestExecutionListener
import org.junit.platform.launcher.TestIdentifier
import org.junit.platform.launcher.TestPlan

class TestListenerSelenide : TestExecutionListener {

    override fun testPlanExecutionStarted(testPlan: TestPlan?) {
        println("|----- START -----|\n")
    }

    override fun executionFinished(testIdentifier: TestIdentifier?, testExecutionResult: TestExecutionResult?) {
        if (testIdentifier!!.isTest) println("Finish: ${testIdentifier.displayName}")
    }

    override fun executionSkipped(testIdentifier: TestIdentifier?, reason: String?) {
        if (testIdentifier!!.isTest) println("Skip: ${testIdentifier.displayName}\nReason: $reason")
    }

    override fun testPlanExecutionFinished(testPlan: TestPlan?) {
        println("|----- FINISH -----|")
    }
}