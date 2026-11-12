package com.huawei.agconnect.apms;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class fed extends edc implements Window.OnFrameMetricsAvailableListener {
    public static HandlerThread def;
    public static Handler efg;
    public SparseIntArray[] bcd = new SparseIntArray[9];
    public ArrayList<WeakReference<Activity>> cde = new ArrayList<>();
    public int abc = 1;

    public static void abc(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray == null || j < 0) {
            return;
        }
        int i = (int) ((j + 500000) / 1000000);
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
    }

    @Override // com.huawei.agconnect.apms.edc
    public final SparseIntArray[] bcd(Activity activity) {
        for (WeakReference<Activity> weakReference : this.cde) {
            if (weakReference.get() == activity) {
                this.cde.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this);
        return this.bcd;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        if ((this.abc & 1) != 0) {
            SparseIntArray[] sparseIntArrayArr = this.bcd;
            if (sparseIntArrayArr.length > 0) {
                abc(sparseIntArrayArr[0], frameMetrics.getMetric(8));
            }
        }
        if ((this.abc & 2) != 0) {
            SparseIntArray[] sparseIntArrayArr2 = this.bcd;
            if (1 < sparseIntArrayArr2.length) {
                abc(sparseIntArrayArr2[1], frameMetrics.getMetric(1));
            }
        }
        if ((this.abc & 4) != 0) {
            SparseIntArray[] sparseIntArrayArr3 = this.bcd;
            if (2 < sparseIntArrayArr3.length) {
                abc(sparseIntArrayArr3[2], frameMetrics.getMetric(3));
            }
        }
        if ((this.abc & 16) != 0) {
            SparseIntArray[] sparseIntArrayArr4 = this.bcd;
            if (4 < sparseIntArrayArr4.length) {
                abc(sparseIntArrayArr4[4], frameMetrics.getMetric(5));
            }
        }
        if ((this.abc & 64) != 0) {
            SparseIntArray[] sparseIntArrayArr5 = this.bcd;
            if (6 < sparseIntArrayArr5.length) {
                abc(sparseIntArrayArr5[6], frameMetrics.getMetric(7));
            }
        }
        if ((this.abc & 8) != 0) {
            SparseIntArray[] sparseIntArrayArr6 = this.bcd;
            if (3 < sparseIntArrayArr6.length) {
                abc(sparseIntArrayArr6[3], frameMetrics.getMetric(4));
            }
        }
        if ((this.abc & 32) != 0) {
            SparseIntArray[] sparseIntArrayArr7 = this.bcd;
            if (5 < sparseIntArrayArr7.length) {
                abc(sparseIntArrayArr7[5], frameMetrics.getMetric(6));
            }
        }
        if ((this.abc & 128) != 0) {
            SparseIntArray[] sparseIntArrayArr8 = this.bcd;
            if (7 < sparseIntArrayArr8.length) {
                abc(sparseIntArrayArr8[7], frameMetrics.getMetric(0));
            }
        }
        if ((this.abc & 256) != 0) {
            SparseIntArray[] sparseIntArrayArr9 = this.bcd;
            if (8 < sparseIntArrayArr9.length) {
                abc(sparseIntArrayArr9[8], frameMetrics.getMetric(2));
            }
        }
    }

    @Override // com.huawei.agconnect.apms.edc
    public final void abc(Activity activity) {
        if (def == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            def = handlerThread;
            handlerThread.start();
            Looper looper = def.getLooper();
            if (looper == null) {
                return;
            } else {
                efg = new Handler(looper);
            }
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = this.bcd;
            if (sparseIntArrayArr[i] == null && (this.abc & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this, efg);
        this.cde.add(new WeakReference<>(activity));
    }
}
