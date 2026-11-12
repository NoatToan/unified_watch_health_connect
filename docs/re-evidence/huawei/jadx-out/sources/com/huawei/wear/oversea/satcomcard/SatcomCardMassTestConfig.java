package com.huawei.wear.oversea.satcomcard;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes20.dex */
public class SatcomCardMassTestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("IsMsgCustomized")
    private int f30708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("MaxMsgCnt")
    private int f30709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("MassTestPeriod")
    private String f30710c;

    @SerializedName("BeiDouAuditCycle")
    private int d;

    @SerializedName("BeidouAuditWaitDay")
    private int e;

    @SerializedName("PresetMsg")
    private String g;

    @SerializedName("SatcomStopTips")
    private String j;

    /* JADX INFO: loaded from: classes46.dex */
    public interface AuditCycleType {
        public static final int DEFAULT = 0;
        public static final int FIX_CYCLE = 1;
    }

    public int a() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public String d() {
        return this.f30710c;
    }
}
