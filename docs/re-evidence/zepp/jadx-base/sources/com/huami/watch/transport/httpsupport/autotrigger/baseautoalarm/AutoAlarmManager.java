package com.huami.watch.transport.httpsupport.autotrigger.baseautoalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class AutoAlarmManager {
    public static String TAG = "com.huami.watch.transport.httpsupport.autotrigger.baseautoalarm.AutoAlarmManager";
    private static AutoAlarmManager d;
    private Context c;
    private AutoAlarmBroadCastReceiver b = new AutoAlarmBroadCastReceiver();
    private HashMap<String, AutoAlarmQueue> a = new HashMap<>();

    public class AutoAlarmBroadCastReceiver extends BroadcastReceiver {
        public static final String ACTION = "com.huami.watch.http_support.AUTOMATIC_TRANS_DATA";

        public AutoAlarmBroadCastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.i(AutoAlarmBroadCastReceiver.class.getName(), "receive:" + intent.getAction());
            if (TextUtils.equals("android.intent.action.TIMEZONE_CHANGED", intent.getAction()) || TextUtils.equals("android.intent.action.DATE_CHANGED", intent.getAction()) || TextUtils.equals("android.intent.action.TIME_SET", intent.getAction())) {
                AutoAlarmManager.getInstance(context).onTimeChanged();
            } else if (TextUtils.equals(intent.getAction(), ACTION)) {
                AutoAlarmManager.getInstance(context).onAlert(intent.getStringExtra("name"), intent.getIntExtra("id", 0));
            }
        }
    }

    private AutoAlarmManager(Context context) {
        this.c = context;
        b();
    }

    private List<AutoAlarmQueue.AutoAlarm> a(String str) {
        return new ArrayList();
    }

    private void b() {
        if (this.c != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(AutoAlarmBroadCastReceiver.ACTION);
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.DATE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_SET");
            this.c.registerReceiver(this.b, intentFilter);
        }
    }

    public static AutoAlarmManager getInstance(Context context) {
        if (d == null) {
            synchronized (AutoAlarmManager.class) {
                if (d == null) {
                    d = new AutoAlarmManager(context);
                }
            }
        }
        return d;
    }

    public AutoAlarmManager addAutoAlarms(String str, String str2) {
        this.a.put(str, new AutoAlarmQueue(this.c, str, a(str2)));
        return this;
    }

    public AutoAlarmManager addAutoAlarms(String str, List<AutoAlarmQueue.AutoAlarm> list) {
        this.a.put(str, new AutoAlarmQueue(this.c, str, list));
        Log.i(TAG, "autoAlarmQueues.add:" + str);
        return this;
    }

    public void clear(String str) {
        HashMap<String, AutoAlarmQueue> map = this.a;
        if (map == null) {
            return;
        }
        AutoAlarmQueue autoAlarmQueue = map.get(str);
        if (autoAlarmQueue != null) {
            autoAlarmQueue.clear();
        }
        Log.i(TAG, "clear");
    }

    public void clearAll() {
        AutoAlarmBroadCastReceiver autoAlarmBroadCastReceiver;
        Set<String> setKeySet = this.a.keySet();
        if (this.a == null || setKeySet.size() <= 0) {
            return;
        }
        Iterator<String> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            AutoAlarmQueue autoAlarmQueue = this.a.get(it2.next());
            if (autoAlarmQueue != null) {
                autoAlarmQueue.clear();
            }
        }
        Context context = this.c;
        if (context != null && (autoAlarmBroadCastReceiver = this.b) != null) {
            context.unregisterReceiver(autoAlarmBroadCastReceiver);
        }
        d = null;
        Log.i(TAG, "clearAll");
    }

    public void onAlert(String str, long j) {
        AutoAlarmQueue autoAlarmQueue;
        HashMap<String, AutoAlarmQueue> map = this.a;
        if (map == null || map.size() <= 0 || (autoAlarmQueue = this.a.get(str)) == null) {
            return;
        }
        autoAlarmQueue.notice(this.c, j);
        Log.i(TAG, "onAlert:" + str + ",id:" + j);
    }

    public void onTimeChanged() {
        Log.i(TAG, "onTimeChanged");
        Set<String> setKeySet = this.a.keySet();
        if (this.a == null || setKeySet.size() <= 0) {
            return;
        }
        Iterator<String> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            this.a.get(it2.next()).timeChanged(this.c);
        }
    }
}
