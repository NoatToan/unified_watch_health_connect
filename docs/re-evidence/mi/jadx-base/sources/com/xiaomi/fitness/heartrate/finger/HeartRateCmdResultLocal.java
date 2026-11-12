package com.xiaomi.fitness.heartrate.finger;

import android.hardware.fingerprint.heartrate.HeartRateCmdResult;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020!H\u0016R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u001e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/heartrate/finger/HeartRateCmdResultLocal;", "", "origin", "Landroid/hardware/fingerprint/heartrate/HeartRateCmdResult;", "<init>", "(Landroid/hardware/fingerprint/heartrate/HeartRateCmdResult;)V", "value", "", "resultCode", "getResultCode", "()I", "resultData", "", "getResultData", "()[B", "heartRateValue", "getHeartRateValue", "ppgValue", "getPpgValue", "cmdId", "getCmdId", "dataIndex", "getDataIndex", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "parseArr", "", "reset", "toString", "", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeartRateCmdResultLocal {

    /* JADX INFO: renamed from: cmdId, reason: from kotlin metadata and from toString */
    private final int mMsgCode;
    private int dataIndex;

    /* JADX INFO: renamed from: heartRateValue, reason: from kotlin metadata and from toString */
    private int mHeartRateValue;

    /* JADX INFO: renamed from: ppgValue, reason: from kotlin metadata and from toString */
    private int mPpgValue;
    private int resultCode;

    /* JADX INFO: renamed from: resultData, reason: from kotlin metadata and from toString */
    @Nullable
    private final byte[] mResultData;
    private long timestamp;

    public HeartRateCmdResultLocal(@NotNull HeartRateCmdResult origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.mResultData = origin.mResultData;
        this.mMsgCode = origin.mResultCode;
        parseArr();
    }

    private final void parseArr() {
        this.timestamp = System.currentTimeMillis();
        byte[] bArr = this.mResultData;
        if (bArr != null && bArr.length == 0) {
            reset();
            return;
        }
        int iDecodeInt32 = ArrayUtils.decodeInt32(bArr, 0);
        if (iDecodeInt32 == 310039) {
            this.resultCode = ArrayUtils.decodeInt32(this.mResultData, 4);
            this.mPpgValue = ArrayUtils.decodeInt32(this.mResultData, 8);
        } else {
            if (iDecodeInt32 != 400000) {
                reset();
                return;
            }
            this.resultCode = ArrayUtils.decodeInt32(this.mResultData, 4);
            this.mHeartRateValue = ArrayUtils.decodeInt32(this.mResultData, 12);
            this.dataIndex = ArrayUtils.decodeInt32(this.mResultData, 20);
            this.mPpgValue = ArrayUtils.decodeInt32(this.mResultData, 28);
        }
    }

    private final void reset() {
        this.resultCode = 1;
        this.mHeartRateValue = 0;
        this.dataIndex = 0;
        this.mPpgValue = 0;
    }

    /* JADX INFO: renamed from: getCmdId, reason: from getter */
    public final int getMMsgCode() {
        return this.mMsgCode;
    }

    public final int getDataIndex() {
        return this.dataIndex;
    }

    /* JADX INFO: renamed from: getHeartRateValue, reason: from getter */
    public final int getMHeartRateValue() {
        return this.mHeartRateValue;
    }

    /* JADX INFO: renamed from: getPpgValue, reason: from getter */
    public final int getMPpgValue() {
        return this.mPpgValue;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @Nullable
    /* JADX INFO: renamed from: getResultData, reason: from getter */
    public final byte[] getMResultData() {
        return this.mResultData;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @NotNull
    public String toString() {
        return "HeartRateCmdResult{mResultCode=" + this.resultCode + ", mResultData=" + Arrays.toString(this.mResultData) + ", mHeartRateValue=" + this.mHeartRateValue + ", mPpgValue=" + this.mPpgValue + ", mMsgCode=" + this.mMsgCode + ", timestamp=" + this.timestamp + "}";
    }
}
