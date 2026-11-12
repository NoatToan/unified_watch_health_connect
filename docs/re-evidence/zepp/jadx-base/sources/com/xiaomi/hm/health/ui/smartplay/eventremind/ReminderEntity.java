package com.xiaomi.hm.health.ui.smartplay.eventremind;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;

/* JADX INFO: loaded from: classes22.dex */
public class ReminderEntity {

    @SerializedName("createdDate")
    public long createdDate;

    @SerializedName("from")
    public int from;

    @SerializedName("id")
    public int id;

    @SerializedName("loop")
    public String loop;

    @SerializedName(AdRemindParserKt.KEY_OP)
    public int op;

    @SerializedName("startDate")
    public String startDate;

    @SerializedName(AdRemindParserKt.KEY_STOP_DATE)
    public String stopDate;

    @SerializedName("title")
    public String title;

    public String toString() {
        return "createdDate: " + this.createdDate + "\nfrom: " + this.from + "\nid: " + this.id + "\nloop: " + this.loop + "\nop: " + this.op + "\nstartDate: " + this.startDate + "\nstopDate: " + this.stopDate + "\ntitle: " + this.title;
    }
}
