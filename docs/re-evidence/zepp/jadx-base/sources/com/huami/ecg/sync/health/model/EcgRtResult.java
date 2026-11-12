package com.huami.ecg.sync.health.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/B-\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/huami/ecg/sync/health/model/EcgRtResult;", "", "", "success", "", "toString", "component1", "", "component2", "", "component3", "Lcom/huami/ecg/sync/health/model/SensorRecord;", "component4", "measureType", "measureSecond", "recevDatas", "sensorRecord", "copy", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getMeasureType", "()Ljava/lang/String;", "setMeasureType", "(Ljava/lang/String;)V", "b", LogUtil.I, "getMeasureSecond", "()I", "setMeasureSecond", "(I)V", "c", "J", "getRecevDatas", "()J", "setRecevDatas", "(J)V", GoogleApiAvailabilityLight.a, "Lcom/huami/ecg/sync/health/model/SensorRecord;", "getSensorRecord", "()Lcom/huami/ecg/sync/health/model/SensorRecord;", "setSensorRecord", "(Lcom/huami/ecg/sync/health/model/SensorRecord;)V", "<init>", "(Ljava/lang/String;IJLcom/huami/ecg/sync/health/model/SensorRecord;)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class EcgRtResult {
    public static final int BIOID_MIN_TIME = 25;
    public static final double MIN_PERCENT = 0.9d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String measureType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int measureSecond;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long recevDatas;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private SensorRecord sensorRecord;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ double b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(double d) {
            super(0);
            this.b = d;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "effectiveLength is:" + this.b + "recevDatas:" + EcgRtResult.this.getRecevDatas();
        }
    }

    public EcgRtResult(@NotNull String str, int i, long j, @Nullable SensorRecord sensorRecord) {
        this.measureType = str;
        this.measureSecond = i;
        this.recevDatas = j;
        this.sensorRecord = sensorRecord;
    }

    public static /* synthetic */ EcgRtResult copy$default(EcgRtResult ecgRtResult, String str, int i, long j, SensorRecord sensorRecord, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ecgRtResult.measureType;
        }
        if ((i2 & 2) != 0) {
            i = ecgRtResult.measureSecond;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = ecgRtResult.recevDatas;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            sensorRecord = ecgRtResult.sensorRecord;
        }
        return ecgRtResult.copy(str, i3, j2, sensorRecord);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMeasureType() {
        return this.measureType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMeasureSecond() {
        return this.measureSecond;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRecevDatas() {
        return this.recevDatas;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SensorRecord getSensorRecord() {
        return this.sensorRecord;
    }

    @NotNull
    public final EcgRtResult copy(@NotNull String measureType, int measureSecond, long recevDatas, @Nullable SensorRecord sensorRecord) {
        return new EcgRtResult(measureType, measureSecond, recevDatas, sensorRecord);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgRtResult)) {
            return false;
        }
        EcgRtResult ecgRtResult = (EcgRtResult) other;
        return Intrinsics.areEqual(this.measureType, ecgRtResult.measureType) && this.measureSecond == ecgRtResult.measureSecond && this.recevDatas == ecgRtResult.recevDatas && Intrinsics.areEqual(this.sensorRecord, ecgRtResult.sensorRecord);
    }

    public final int getMeasureSecond() {
        return this.measureSecond;
    }

    @NotNull
    public final String getMeasureType() {
        return this.measureType;
    }

    public final long getRecevDatas() {
        return this.recevDatas;
    }

    @Nullable
    public final SensorRecord getSensorRecord() {
        return this.sensorRecord;
    }

    public int hashCode() {
        String str = this.measureType;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.measureSecond) * 31;
        long j = this.recevDatas;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        SensorRecord sensorRecord = this.sensorRecord;
        return i + (sensorRecord != null ? sensorRecord.hashCode() : 0);
    }

    public final void setMeasureSecond(int i) {
        this.measureSecond = i;
    }

    public final void setMeasureType(@NotNull String str) {
        this.measureType = str;
    }

    public final void setRecevDatas(long j) {
        this.recevDatas = j;
    }

    public final void setSensorRecord(@Nullable SensorRecord sensorRecord) {
        this.sensorRecord = sensorRecord;
    }

    public final boolean success() {
        if (!Intrinsics.areEqual(this.measureType, MeasureContentType.BIO_ID)) {
            double d = ((double) this.measureSecond) * 0.9d * ((double) 250);
            HMLog.info("onlinemeasure", new a(d));
            if (this.recevDatas > d) {
                return true;
            }
        } else if (this.recevDatas > 6250) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EcgRtResult:recevDatas:");
        sb.append(this.recevDatas);
        sb.append(",lost:");
        SensorRecord sensorRecord = this.sensorRecord;
        sb.append(sensorRecord != null ? Integer.valueOf(sensorRecord.getLostPackage()) : null);
        return sb.toString();
    }

    public /* synthetic */ EcgRtResult(String str, int i, long j, SensorRecord sensorRecord, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? null : sensorRecord);
    }
}
