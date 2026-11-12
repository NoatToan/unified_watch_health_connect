package com.xiaomi.fitness.heartrate.camera;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.e43;
import defpackage.f43;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/BmpMonitorHelper;", "", "", "startUp", "()V", "", "avgRed", "avgGreen", "Lf43;", "extractBmp", "(FF)Lf43;", "", "isFingerTip", "(FF)Z", CervicalMucusRecord.Appearance.CLEAR, "", "TAG", "Ljava/lang/String;", "", "getAvgCurBmp", "()I", "avgCurBmp", "<init>", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BmpMonitorHelper {

    @NotNull
    public static final BmpMonitorHelper INSTANCE = new BmpMonitorHelper();

    @NotNull
    private static final String TAG = "BmpMonitorHelper";

    private BmpMonitorHelper() {
    }

    public final void clear() {
        try {
            e43.c();
        } catch (Exception e) {
            Logger.e(TAG, "clear: ", e);
        }
    }

    @Nullable
    public final f43 extractBmp(float avgRed, float avgGreen) {
        try {
            return e43.d(avgRed, avgGreen);
        } catch (Throwable th) {
            Logger.e(TAG, "extractBmp error:", th);
            return null;
        }
    }

    public final int getAvgCurBmp() {
        try {
            int[] iArrF = e43.f();
            int length = iArrF.length;
            if (length == 0) {
                return -2;
            }
            int i = 0;
            for (int i2 : iArrF) {
                i += i2;
            }
            return i / length;
        } catch (Exception e) {
            Logger.e(TAG, "getAvgCurBmp: ", e);
            return -2;
        }
    }

    public final boolean isFingerTip(float avgRed, float avgGreen) {
        return e43.g(avgRed, avgGreen);
    }

    public final void startUp() {
        try {
            clear();
            int fps = CameraConfiguration.INSTANCE.getFps();
            int i = fps - 2;
            if (i >= 30) {
                fps = i;
            }
            e43.i(fps);
        } catch (Exception e) {
            Logger.e(TAG, "BmpMonitor start up error: %s", e.getMessage(), e);
        }
    }
}
