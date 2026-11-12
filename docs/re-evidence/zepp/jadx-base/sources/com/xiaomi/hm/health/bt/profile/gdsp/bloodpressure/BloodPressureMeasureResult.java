package com.xiaomi.hm.health.bt.profile.gdsp.bloodpressure;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import defpackage.b;
import kotlin.Metadata;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bloodpressure/BloodPressureMeasureResult;", "", "", "toString", "", "component1", "", "component2", "component3", "component4", "component5", "timestamp", "timeZone", "diastolic", "systolic", Constants.DATA_KEY_HR, "copy", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", LogUtil.I, "getTimeZone", "()I", "c", "getDiastolic", GoogleApiAvailabilityLight.a, "getSystolic", "e", "getHr", "<init>", "(JIIII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureMeasureResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int timeZone;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int diastolic;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int systolic;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int hr;

    public BloodPressureMeasureResult(long j, int i, int i2, int i3, int i4) {
        this.timestamp = j;
        this.timeZone = i;
        this.diastolic = i2;
        this.systolic = i3;
        this.hr = i4;
    }

    public static /* synthetic */ BloodPressureMeasureResult copy$default(BloodPressureMeasureResult bloodPressureMeasureResult, long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = bloodPressureMeasureResult.timestamp;
        }
        long j2 = j;
        if ((i5 & 2) != 0) {
            i = bloodPressureMeasureResult.timeZone;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = bloodPressureMeasureResult.diastolic;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = bloodPressureMeasureResult.systolic;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = bloodPressureMeasureResult.hr;
        }
        return bloodPressureMeasureResult.copy(j2, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDiastolic() {
        return this.diastolic;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSystolic() {
        return this.systolic;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHr() {
        return this.hr;
    }

    @NotNull
    public final BloodPressureMeasureResult copy(long timestamp, int timeZone, int diastolic, int systolic, int hr) {
        return new BloodPressureMeasureResult(timestamp, timeZone, diastolic, systolic, hr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureMeasureResult)) {
            return false;
        }
        BloodPressureMeasureResult bloodPressureMeasureResult = (BloodPressureMeasureResult) other;
        return this.timestamp == bloodPressureMeasureResult.timestamp && this.timeZone == bloodPressureMeasureResult.timeZone && this.diastolic == bloodPressureMeasureResult.diastolic && this.systolic == bloodPressureMeasureResult.systolic && this.hr == bloodPressureMeasureResult.hr;
    }

    public final int getDiastolic() {
        return this.diastolic;
    }

    public final int getHr() {
        return this.hr;
    }

    public final int getSystolic() {
        return this.systolic;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((b.a(this.timestamp) * 31) + this.timeZone) * 31) + this.diastolic) * 31) + this.systolic) * 31) + this.hr;
    }

    @NotNull
    public String toString() {
        return "BloodPressureMeasureResult<timestamp:" + this.timestamp + ", timeZone:" + this.timeZone + ", diastolic:" + this.diastolic + ", systolic:" + this.systolic + ", hr:" + this.hr + Typography.greater;
    }
}
