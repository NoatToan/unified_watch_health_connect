package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.stand.StandDetectConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/settingitem/settingitem/StandDetectSettingItem;", "", "<init>", "()V", "reminderEnable", "", "getReminderEnable", "()Z", "setReminderEnable", "(Z)V", "reminderStartTime", "", "getReminderStartTime", "()I", "setReminderStartTime", "(I)V", "reminderEndTime", "getReminderEndTime", "setReminderEndTime", "detectNapEnable", "getDetectNapEnable", "setDetectNapEnable", "napStartTime", "getNapStartTime", "setNapStartTime", "napEndTime", "getNapEndTime", "setNapEndTime", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandDetectSettingItem {

    @SerializedName("detect_nap_enable")
    private boolean detectNapEnable;

    @SerializedName("reminder_enable")
    private boolean reminderEnable;

    @SerializedName("reminder_start_time")
    private int reminderStartTime = 800;

    @SerializedName("reminder_end_time")
    private int reminderEndTime = 2100;

    @SerializedName("nap_start_time")
    private int napStartTime = 1200;

    @SerializedName("nap_end_time")
    private int napEndTime = StandDetectConstants.DETECT_IGNORE_NOTICE_END;

    public final boolean getDetectNapEnable() {
        return this.detectNapEnable;
    }

    public final int getNapEndTime() {
        return this.napEndTime;
    }

    public final int getNapStartTime() {
        return this.napStartTime;
    }

    public final boolean getReminderEnable() {
        return this.reminderEnable;
    }

    public final int getReminderEndTime() {
        return this.reminderEndTime;
    }

    public final int getReminderStartTime() {
        return this.reminderStartTime;
    }

    public final void setDetectNapEnable(boolean z) {
        this.detectNapEnable = z;
    }

    public final void setNapEndTime(int i) {
        this.napEndTime = i;
    }

    public final void setNapStartTime(int i) {
        this.napStartTime = i;
    }

    public final void setReminderEnable(boolean z) {
        this.reminderEnable = z;
    }

    public final void setReminderEndTime(int i) {
        this.reminderEndTime = i;
    }

    public final void setReminderStartTime(int i) {
        this.reminderStartTime = i;
    }
}
