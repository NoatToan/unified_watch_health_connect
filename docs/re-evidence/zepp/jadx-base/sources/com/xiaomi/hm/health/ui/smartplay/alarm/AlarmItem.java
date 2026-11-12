package com.xiaomi.hm.health.ui.smartplay.alarm;

import com.xiaomi.hm.health.databases.model.Alarm;

/* JADX INFO: loaded from: classes22.dex */
public class AlarmItem {
    public static final int TYPE_ALARM = 1;
    public static final int TYPE_TITLE_NORMAL = 2;
    public static final int TYPE_TITLE_SMART = 3;
    public Alarm alarm;
    public String title;
    public int type;

    public AlarmItem() {
    }

    public AlarmItem(String str, int i) {
        this.type = i;
        this.title = str;
    }

    public AlarmItem(Alarm alarm) {
        this.type = 1;
        this.alarm = alarm;
    }
}
