package com.huami.ecg.core.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/ecg/core/model/EcgExData;", "", "", "isDiagnosisAccelerated", "", "setDiagnosisAccelerated", "", EcgExData.d, "setSpeededTime", "getAcceleratedTime", "", "component1", "component2", "accState", "accTime", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getAccState", "()I", "setAccState", "(I)V", "b", "J", "getAccTime", "()J", "setAccTime", "(J)V", "<init>", "(IJ)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class EcgExData {
    public static final int DIAGNOSIS_ACC = 1;
    public static final int DIAGNOSIS_NORMAL = 0;
    private static final String c = "diagnosisSpeededStatus";
    private static final String d = "speededTime";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(c)
    private int accState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(d)
    private long accTime;

    public EcgExData() {
        this(0, 0L, 3, null);
    }

    public EcgExData(int i, long j) {
        this.accState = i;
        this.accTime = j;
    }

    public static /* synthetic */ EcgExData copy$default(EcgExData ecgExData, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ecgExData.accState;
        }
        if ((i2 & 2) != 0) {
            j = ecgExData.accTime;
        }
        return ecgExData.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAccState() {
        return this.accState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAccTime() {
        return this.accTime;
    }

    @NotNull
    public final EcgExData copy(int accState, long accTime) {
        return new EcgExData(accState, accTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgExData)) {
            return false;
        }
        EcgExData ecgExData = (EcgExData) other;
        return this.accState == ecgExData.accState && this.accTime == ecgExData.accTime;
    }

    public final int getAccState() {
        return this.accState;
    }

    public final long getAccTime() {
        return this.accTime;
    }

    public final long getAcceleratedTime() {
        return this.accTime;
    }

    public int hashCode() {
        int i = this.accState * 31;
        long j = this.accTime;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isDiagnosisAccelerated() {
        return this.accState == 1;
    }

    public final void setAccState(int i) {
        this.accState = i;
    }

    public final void setAccTime(long j) {
        this.accTime = j;
    }

    public final void setDiagnosisAccelerated() {
        this.accState = 1;
    }

    public final void setSpeededTime(long speededTime) {
        this.accTime = speededTime;
    }

    @NotNull
    public String toString() {
        return "EcgExData(accState=" + this.accState + ", accTime=" + this.accTime + ")";
    }

    public /* synthetic */ EcgExData(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? -1L : j);
    }
}
