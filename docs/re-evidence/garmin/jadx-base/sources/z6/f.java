package z6;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f202613a;

    public static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static HandlerThread f202614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static Handler f202615f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f202616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f202617b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f202618c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WindowOnFrameMetricsAvailableListenerC3780a f202619d = new WindowOnFrameMetricsAvailableListenerC3780a();

        /* JADX INFO: renamed from: z6.f$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC3780a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC3780a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i14) {
                a aVar = a.this;
                int i15 = aVar.f202616a;
                int i16 = aVar.f202616a;
                if ((i15 & 1) != 0) {
                    a.a(aVar.f202617b[0], frameMetrics.getMetric(8));
                }
                if ((i16 & 2) != 0) {
                    a.a(aVar.f202617b[1], frameMetrics.getMetric(1));
                }
                if ((i16 & 4) != 0) {
                    a.a(aVar.f202617b[2], frameMetrics.getMetric(3));
                }
                if ((i16 & 8) != 0) {
                    a.a(aVar.f202617b[3], frameMetrics.getMetric(4));
                }
                if ((i16 & 16) != 0) {
                    a.a(aVar.f202617b[4], frameMetrics.getMetric(5));
                }
                if ((i16 & 64) != 0) {
                    a.a(aVar.f202617b[6], frameMetrics.getMetric(7));
                }
                if ((i16 & 32) != 0) {
                    a.a(aVar.f202617b[5], frameMetrics.getMetric(6));
                }
                if ((i16 & 128) != 0) {
                    a.a(aVar.f202617b[7], frameMetrics.getMetric(0));
                }
                if ((i16 & 256) != 0) {
                    a.a(aVar.f202617b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i14) {
            this.f202616a = i14;
        }

        public static void a(SparseIntArray sparseIntArray, long j8) {
            if (sparseIntArray != null) {
                int i14 = (int) ((500000 + j8) / 1000000);
                if (j8 >= 0) {
                    sparseIntArray.put(i14, sparseIntArray.get(i14) + 1);
                }
            }
        }
    }

    public static class b {
    }

    public f(int i14) {
        this.f202613a = new a(i14);
    }

    public final void a(Activity activity) {
        a aVar = this.f202613a;
        ArrayList<WeakReference<Activity>> arrayList = aVar.f202618c;
        for (WeakReference<Activity> weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(aVar.f202619d);
    }

    public f() {
        this(1);
    }
}
