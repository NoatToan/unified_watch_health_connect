package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.mifit.sportlib.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0018\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u001b\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/TxStepMode;", "Ljava/io/Serializable;", "", "toString", "", "a", "J", "getTime", "()J", "time", "", "b", "[B", "getData", "()[B", "data", "", "c", LogUtil.I, "getStepFreq", "()I", Constants.DATA_KEY_STEP_FREQ, GoogleApiAvailabilityLight.a, "getStepCount", "stepCount", "e", "getStepStride", "stepStride", "<init>", "(J[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TxStepMode implements Serializable {
    public static final int DATA_LEN = 6;
    private static final int f = 2;
    private static final int g = 2;
    private static final int h = 2;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final byte[] data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int stepFreq;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int stepCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int stepStride;

    public TxStepMode(long j, @NotNull byte[] bArr) {
        this.time = j;
        this.data = bArr;
        if (bArr.length < 6) {
            this.stepFreq = 0;
            this.stepCount = 0;
            this.stepStride = 0;
        } else {
            this.stepFreq = ByteUtilsKt.toInt(bArr, 2, 0);
            this.stepCount = ByteUtilsKt.toInt(bArr, 2, 2);
            this.stepStride = ByteUtilsKt.toInt(bArr, 2, 4);
        }
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    public final int getStepFreq() {
        return this.stepFreq;
    }

    public final int getStepStride() {
        return this.stepStride;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public String toString() {
        return "TxStepMode(time=" + this.time + ", stepCount=" + this.stepCount + ", stepStride=" + this.stepStride + ", stepFreq=" + this.stepFreq + ')';
    }
}
