package com.huami.watch.transport.httpsupport.autotrigger;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import com.huami.watch.transport.httpsupport.autotrigger.baseautoalarm.AutoAlarmQueue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TransportDataAutomaticAlarm {
    public static final String TRIGGER_ACTION = "com.huami.watch.http_support.TRANS_AUTOMATIC";
    public static String name = "automatic_trans_alert";
    private List<AutoAlarmQueue.AutoAlarm> a;
    private Context b;
    private AutoAlarmQueue.AutoAlarmAlertListener c;

    public class a implements AutoAlarmQueue.AutoAlarmAlertListener {
        public a() {
        }

        @Override // com.huami.watch.transport.httpsupport.autotrigger.baseautoalarm.AutoAlarmQueue.AutoAlarmAlertListener
        public boolean autoAlarmAlert(AutoAlarmQueue.AutoAlarm autoAlarm) {
            String str;
            String str2;
            Log.i(TransportDataAutomaticAlarm.name, "autoAlarmAlert:com.huami.watch.http_support.TRANS_AUTOMATIC");
            if (Settings.Global.getInt(TransportDataAutomaticAlarm.this.b.getContentResolver(), "airplane_mode_on", 0) == 1) {
                str = TransportDataAutomaticAlarm.name;
                str2 = "maybe switched on the air plane mode...";
            } else {
                TransportDataAutomaticAlarm.this.b.sendBroadcast(new Intent(TransportDataAutomaticAlarm.TRIGGER_ACTION));
                str = TransportDataAutomaticAlarm.name;
                str2 = "send:com.huami.watch.http_support.TRANS_AUTOMATIC";
            }
            Log.i(str, str2);
            return true;
        }
    }

    public TransportDataAutomaticAlarm(Context context) {
        this.b = context;
        b();
    }

    private void b() {
        AutoTransTriggerTransporter.getInstance(this.b);
        this.c = new a();
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new AutoAlarmQueue.AutoAlarm(1000, 7, 0, 5, this.c));
        this.a.add(new AutoAlarmQueue.AutoAlarm(1001, 13, 0, 5, this.c));
        this.a.add(new AutoAlarmQueue.AutoAlarm(1002, 21, 45, 5, this.c));
        this.a.add(new AutoAlarmQueue.AutoAlarm(1003, 23, 0, 5, this.c));
    }

    public List<AutoAlarmQueue.AutoAlarm> getAutoAlarmList() {
        return this.a;
    }

    public AutoAlarmQueue.AutoAlarmAlertListener getListener() {
        return this.c;
    }

    public String getName() {
        return name;
    }
}
