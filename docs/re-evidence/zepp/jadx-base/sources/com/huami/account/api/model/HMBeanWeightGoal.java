package com.huami.account.api.model;

import com.google.gson.annotations.SerializedName;
import com.huami.network.base.model.Bean;
import com.xiaomi.hm.health.device.event.StatEvent;

/* JADX INFO: loaded from: classes4.dex */
public class HMBeanWeightGoal extends Bean {
    public static final int WEIGHTGOAL_NEED_DELETE = -1;
    public static final int WEIGHTGOAL_NEED_SYNC = 0;
    public static final int WEIGHTGOAL_SYNCED = 1;

    @SerializedName("uid")
    private long a;

    @SerializedName("fuid")
    private long b;

    @SerializedName("goal_type")
    private int c;

    @SerializedName("currentval")
    private float d;

    @SerializedName(StatEvent.EventParams.TYPE_CARD_GOAL)
    private float e;

    @SerializedName("date_time")
    private long f;

    @SerializedName("height")
    private int g;
    private int h = 1;

    public float getCurrentVal() {
        return this.d;
    }

    public long getDatetime() {
        return this.f;
    }

    public long getFuid() {
        return this.b;
    }

    public float getGoal() {
        return this.e;
    }

    public int getGoalType() {
        return this.c;
    }

    public int getHeight() {
        return this.g;
    }

    @Override // com.huami.network.base.model.Bean
    public String[] getParses() {
        return new String[0];
    }

    public int getSynced() {
        return this.h;
    }

    public long getUid() {
        return this.a;
    }

    public void setCurrentVal(float f) {
        this.d = f;
    }

    public void setDatetime(long j) {
        this.f = j;
    }

    public void setFuid(long j) {
        this.b = j;
    }

    public void setGoal(float f) {
        this.e = f;
    }

    public void setGoalType(int i) {
        this.c = i;
    }

    public void setHeight(int i) {
        this.g = i;
    }

    public void setSynced(int i) {
        this.h = i;
    }

    public void setUid(long j) {
        this.a = j;
    }
}
