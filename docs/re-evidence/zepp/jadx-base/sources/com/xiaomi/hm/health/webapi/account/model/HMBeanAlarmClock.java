package com.xiaomi.hm.health.webapi.account.model;

import com.google.gson.annotations.SerializedName;
import com.huami.network.base.model.Bean;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Calendar;

/* JADX INFO: loaded from: classes22.dex */
public class HMBeanAlarmClock extends Bean implements Comparable<HMBeanAlarmClock> {

    @SerializedName("index")
    private long a = -1;

    @SerializedName("visible")
    private boolean b;

    @SerializedName("calendar")
    private Calendar c;

    @SerializedName(Constants.ENABLED)
    private boolean d;

    @SerializedName("isUpdate")
    private boolean e;

    @SerializedName("mDays")
    private int f;

    @SerializedName("mSmartWakeupDuration")
    private int g;

    @SerializedName("lazySleepEnable")
    private boolean h;

    @SerializedName("mDaysForSupportCalendar")
    private int i;

    @SerializedName("isSmart")
    public boolean isSmart;

    public Calendar getCalendar() {
        return this.c;
    }

    public int getDaysForSupportCalendar() {
        return this.i;
    }

    public long getIndex() {
        return this.a;
    }

    @Override // com.huami.network.base.model.Bean
    public String[] getParses() {
        return new String[0];
    }

    public int getmDays() {
        return this.f;
    }

    public int getmSmartWakeupDuration() {
        return this.g;
    }

    public boolean isEnabled() {
        return this.d;
    }

    public boolean isLazySleepEnable() {
        return this.h;
    }

    public boolean isUpdate() {
        return this.e;
    }

    public boolean isVisible() {
        return this.b;
    }

    public void setCalendar(Calendar calendar) {
        this.c = calendar;
    }

    public void setDaysForSupportCalendar(int i) {
        this.i = i;
    }

    public void setEnabled(boolean z) {
        this.d = z;
    }

    public void setIndex(long j) {
        this.a = j;
    }

    public void setIsUpdate(boolean z) {
        this.e = z;
    }

    public void setLazySleepEnable(boolean z) {
        this.h = z;
    }

    public void setVisible(boolean z) {
        this.b = z;
    }

    public void setmDays(int i) {
        this.f = i;
    }

    public void setmSmartWakeupDuration(int i) {
        this.g = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(HMBeanAlarmClock hMBeanAlarmClock) {
        if (hMBeanAlarmClock == null) {
            return 0;
        }
        return (int) (this.a - hMBeanAlarmClock.getIndex());
    }
}
