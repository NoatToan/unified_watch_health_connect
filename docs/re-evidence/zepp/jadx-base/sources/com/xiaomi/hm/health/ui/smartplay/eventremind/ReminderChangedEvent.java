package com.xiaomi.hm.health.ui.smartplay.eventremind;

/* JADX INFO: loaded from: classes22.dex */
public class ReminderChangedEvent {
    public static final int FROM_DEVICE = 0;
    public static final int FROM_UI_ADD = 2;
    public static final int FROM_UI_DELETE = 1;
    private int a;

    public ReminderChangedEvent(int i) {
        this.a = i;
    }

    public boolean isFromDevice() {
        return this.a == 0;
    }
}
