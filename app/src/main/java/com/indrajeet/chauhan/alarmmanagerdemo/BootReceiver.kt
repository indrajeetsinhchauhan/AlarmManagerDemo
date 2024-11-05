package com.indrajeet.chauhan.alarmmanagerdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            Log.d("AMDT", "BootReceiver onReceive: boot completed")
            val mainActivity = MainActivity()
            Log.d("AMDT", "BootReceiver onReceive: scheduling alarm")
            mainActivity.scheduleAlarm()
        }
    }
}
