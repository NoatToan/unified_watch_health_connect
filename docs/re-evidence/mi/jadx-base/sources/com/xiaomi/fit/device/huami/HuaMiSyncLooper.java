package com.xiaomi.fit.device.huami;

import android.os.HandlerThread;
import android.os.Looper;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/device/huami/HuaMiSyncLooper;", "", "<init>", "()V", "sWorkerLooper", "Landroid/os/Looper;", "useCount", "", "TAG", "", "get", "quitSafely", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiSyncLooper {

    @NotNull
    public static final HuaMiSyncLooper INSTANCE = new HuaMiSyncLooper();

    @NotNull
    private static final String TAG = "HuaMiSyncLooper";

    @Nullable
    private static volatile Looper sWorkerLooper;
    private static int useCount;

    private HuaMiSyncLooper() {
    }

    @NotNull
    public final Looper get() {
        if (useCount < 0) {
            useCount = 0;
        }
        if (sWorkerLooper == null) {
            synchronized (HuaMiSyncLooper.class) {
                try {
                    if (sWorkerLooper == null) {
                        HandlerThread handlerThread = new HandlerThread("HuaMiSync");
                        handlerThread.start();
                        sWorkerLooper = handlerThread.getLooper();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = useCount + 1;
        useCount = i;
        Logger.i("HuaMiSyncLooperuseCount:" + i, new Object[0]);
        Looper looper = sWorkerLooper;
        Intrinsics.checkNotNull(looper);
        return looper;
    }

    public final void quitSafely() {
        int i = useCount - 1;
        useCount = i;
        Logger.i("HuaMiSyncLooperquitSafely:" + i, new Object[0]);
        if (sWorkerLooper == null || useCount != 0) {
            return;
        }
        synchronized (HuaMiSyncLooper.class) {
            try {
                if (sWorkerLooper != null) {
                    Looper looper = sWorkerLooper;
                    Intrinsics.checkNotNull(looper);
                    looper.quitSafely();
                    sWorkerLooper = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
