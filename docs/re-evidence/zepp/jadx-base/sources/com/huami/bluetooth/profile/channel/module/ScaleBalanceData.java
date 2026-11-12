package com.huami.bluetooth.profile.channel.module;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.scale.BalanceResult;
import com.huami.bluetooth.utils.BufByteDecoder;
import defpackage.b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0002)*B;\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\bR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\b¨\u0006+"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData;", "", "Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$MeasureStatus;", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "status", "timestamp", "score", "duration", "progress", "copy", "(Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$MeasureStatus;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData;", "", "toString", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$MeasureStatus;", "getStatus", "()Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$MeasureStatus;", "b", "J", "getTimestamp", "()J", "c", "Ljava/lang/Integer;", "getScore", GoogleApiAvailabilityLight.a, "getDuration", "e", "getProgress", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$MeasureStatus;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Companion", "MeasureStatus", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScaleBalanceData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int f = 4;
    private static final int g = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final MeasureStatus status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer score;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer progress;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$Companion;", "", "", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/module/scale/BalanceResult;", "Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData;", "parse", "", c.p, LogUtil.I, "TIME_STAMP_BYTES", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BalanceResult<ScaleBalanceData> parse(@NotNull byte[] bytes) {
            try {
                Result.Companion companion = Result.Companion;
                byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bytes, new IntRange(2, bytes.length - 1));
                BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
                bufByteDecoder.append(bArrSliceArray);
                int i = bufByteDecoder.readByte();
                if (i != 0) {
                    return BalanceResult.INSTANCE.fail("Error", i);
                }
                MeasureStatus measureStatusFromValue = MeasureStatus.INSTANCE.fromValue(bufByteDecoder.readByte());
                MeasureStatus measureStatus = MeasureStatus.STATUS_MEASURING;
                return BalanceResult.INSTANCE.success(new ScaleBalanceData(measureStatusFromValue, (measureStatusFromValue == measureStatus || measureStatusFromValue == MeasureStatus.STATUS_MEASURE_FINISH) ? bufByteDecoder.readLong(4) : -1L, measureStatusFromValue == MeasureStatus.STATUS_MEASURE_FINISH ? Integer.valueOf(bufByteDecoder.readByte()) : null, measureStatusFromValue == measureStatus ? Integer.valueOf(bufByteDecoder.readByte()) : null, measureStatusFromValue == measureStatus ? Integer.valueOf(bufByteDecoder.readByte()) : null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                    objM3845constructorimpl = BalanceResult.Companion.fail$default(BalanceResult.INSTANCE, "Parse balance response error", 0, 2, null);
                }
                return (BalanceResult) objM3845constructorimpl;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$MeasureStatus;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "STATUS_UNKNOWN", "STATUS_MEASURING", "STATUS_MEASURE_FINISH", "STATUS_MEASURE_EXIT", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public enum MeasureStatus {
        STATUS_UNKNOWN(-1),
        STATUS_MEASURING(0),
        STATUS_MEASURE_FINISH(1),
        STATUS_MEASURE_EXIT(2);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$MeasureStatus$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData$MeasureStatus;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:13:0x001d  */
            /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final MeasureStatus fromValue(int value) {
                for (MeasureStatus measureStatus : MeasureStatus.values()) {
                    if (measureStatus.getValue() == value) {
                        if (measureStatus == null) {
                            return MeasureStatus.STATUS_UNKNOWN;
                        }
                        return measureStatus;
                    }
                }
                measureStatus = null;
                if (measureStatus == null) {
                    return MeasureStatus.STATUS_UNKNOWN;
                }
                return measureStatus;
            }
        }

        MeasureStatus(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public ScaleBalanceData(@NotNull MeasureStatus measureStatus, long j, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.status = measureStatus;
        this.timestamp = j;
        this.score = num;
        this.duration = num2;
        this.progress = num3;
    }

    public static /* synthetic */ ScaleBalanceData copy$default(ScaleBalanceData scaleBalanceData, MeasureStatus measureStatus, long j, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            measureStatus = scaleBalanceData.status;
        }
        if ((i & 2) != 0) {
            j = scaleBalanceData.timestamp;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            num = scaleBalanceData.score;
        }
        Integer num4 = num;
        if ((i & 8) != 0) {
            num2 = scaleBalanceData.duration;
        }
        Integer num5 = num2;
        if ((i & 16) != 0) {
            num3 = scaleBalanceData.progress;
        }
        return scaleBalanceData.copy(measureStatus, j2, num4, num5, num3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MeasureStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getProgress() {
        return this.progress;
    }

    @NotNull
    public final ScaleBalanceData copy(@NotNull MeasureStatus status, long timestamp, @Nullable Integer score, @Nullable Integer duration, @Nullable Integer progress) {
        return new ScaleBalanceData(status, timestamp, score, duration, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleBalanceData)) {
            return false;
        }
        ScaleBalanceData scaleBalanceData = (ScaleBalanceData) other;
        return this.status == scaleBalanceData.status && this.timestamp == scaleBalanceData.timestamp && Intrinsics.areEqual(this.score, scaleBalanceData.score) && Intrinsics.areEqual(this.duration, scaleBalanceData.duration) && Intrinsics.areEqual(this.progress, scaleBalanceData.progress);
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getProgress() {
        return this.progress;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @NotNull
    public final MeasureStatus getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((this.status.hashCode() * 31) + b.a(this.timestamp)) * 31;
        Integer num = this.score;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.duration;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.progress;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScaleBalanceData(status=" + this.status + ", timestamp=" + this.timestamp + ", score=" + this.score + ", duration=" + this.duration + ", progress=" + this.progress + ')';
    }

    public /* synthetic */ ScaleBalanceData(MeasureStatus measureStatus, long j, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(measureStatus, j, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3);
    }
}
