package com.huami.watch.transport.httpsupport.autotrigger;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import com.huami.watch.transport.httpsupport.autotrigger.baseautoalarm.AutoAlarmQueue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class WifiTransAutomaticAlarm {
    public static final String TRIGGER_ACTION = "com.huami.watch.wifiuploaddata.AUTOMATIC";
    public static String name = "auto_wifi_upload_alert";
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
            Log.i(WifiTransAutomaticAlarm.name, "autoAlarmAlert:com.huami.watch.wifiuploaddata.AUTOMATIC");
            if (Settings.Global.getInt(WifiTransAutomaticAlarm.this.b.getContentResolver(), "airplane_mode_on", 0) == 1) {
                str = WifiTransAutomaticAlarm.name;
                str2 = "maybe switched on the air plane mode...";
            } else {
                WifiTransAutomaticAlarm.this.b.sendBroadcast(new Intent(WifiTransAutomaticAlarm.TRIGGER_ACTION));
                str = WifiTransAutomaticAlarm.name;
                str2 = "send:com.huami.watch.wifiuploaddata.AUTOMATIC";
            }
            Log.i(str, str2);
            return true;
        }
    }

    public WifiTransAutomaticAlarm(Context context) {
        this.b = context;
        b();
    }

    private void b() {
        this.c = new a();
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new AutoAlarmQueue.AutoAlarm(2000, 11, 0, 30, this.c));
        this.a.add(new AutoAlarmQueue.AutoAlarm(2001, 22, 0, 30, this.c));
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
