package com.xiaomi.hm.health.bt.profile.hr;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateData;", "", "", "toString", "", "a", LogUtil.I, "getMax", "()I", "max", "b", "getMin", "min", "c", "getAvg", "avg", GoogleApiAvailabilityLight.a, "getSilence", "silence", "", "data", "<init>", "([B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HeartRateData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int max;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int min;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int avg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int silence;

    public HeartRateData(@NotNull byte[] bArr) {
        if (bArr.length != 4) {
            this.max = 0;
            this.min = 0;
            this.avg = 0;
            this.silence = 0;
            return;
        }
        this.max = ByteUtilsKt.toInt(bArr, 1, 0);
        this.min = ByteUtilsKt.toInt(bArr, 1, 1);
        this.avg = ByteUtilsKt.toInt(bArr, 1, 2);
        this.silence = ByteUtilsKt.toInt(bArr, 1, 3);
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getSilence() {
        return this.silence;
    }

    @NotNull
    public String toString() {
        return "{max = " + this.max + ", min = " + this.min + ", avg = " + this.avg + ", silence = " + this.silence + '}';
    }
}
