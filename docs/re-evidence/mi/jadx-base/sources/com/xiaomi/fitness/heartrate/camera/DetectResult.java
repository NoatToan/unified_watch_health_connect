package com.xiaomi.fitness.heartrate.camera;

import com.xiaomi.heart.bmp.MonitorStatus;
import defpackage.f43;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/DetectResult;", "", "", "toString", "()Ljava/lang/String;", "Lf43;", "bmpResult", "Lf43;", "getBmpResult", "()Lf43;", "", "isFingerTip", "Z", "()Z", "<init>", "(Lf43;Z)V", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DetectResult {

    @Nullable
    private final f43 bmpResult;
    private final boolean isFingerTip;

    public DetectResult(@Nullable f43 f43Var, boolean z) {
        this.bmpResult = f43Var;
        this.isFingerTip = z;
    }

    @Nullable
    public final f43 getBmpResult() {
        return this.bmpResult;
    }

    /* JADX INFO: renamed from: isFingerTip, reason: from getter */
    public final boolean getIsFingerTip() {
        return this.isFingerTip;
    }

    @NotNull
    public String toString() {
        MonitorStatus monitorStatusC;
        f43 f43Var = this.bmpResult;
        String string = null;
        Integer numValueOf = f43Var != null ? Integer.valueOf(f43Var.b()) : null;
        f43 f43Var2 = this.bmpResult;
        Integer numValueOf2 = f43Var2 != null ? Integer.valueOf(f43Var2.a()) : null;
        f43 f43Var3 = this.bmpResult;
        if (f43Var3 != null && (monitorStatusC = f43Var3.c()) != null) {
            string = monitorStatusC.toString();
        }
        return "DetectResult{mBmpResult currentBmp=" + numValueOf + " avgBmp=" + numValueOf2 + " status=" + string + ", mIsFingerTip=" + this.isFingerTip + "}";
    }
}
