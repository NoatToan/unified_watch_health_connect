package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2049a;

    @RequiresApi(24)
    public static class a extends b {
        public static HandlerThread e;
        public static Handler f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f2051b = new SparseIntArray[9];
        public final ArrayList<WeakReference<Activity>> c = new ArrayList<>();
        public Window.OnFrameMetricsAvailableListener d = new WindowOnFrameMetricsAvailableListenerC0022a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0022a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0022a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                a aVar = a.this;
                if ((aVar.f2050a & 1) != 0) {
                    aVar.f(aVar.f2051b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f2050a & 2) != 0) {
                    aVar2.f(aVar2.f2051b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f2050a & 4) != 0) {
                    aVar3.f(aVar3.f2051b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f2050a & 8) != 0) {
                    aVar4.f(aVar4.f2051b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f2050a & 16) != 0) {
                    aVar5.f(aVar5.f2051b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f2050a & 64) != 0) {
                    aVar6.f(aVar6.f2051b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f2050a & 32) != 0) {
                    aVar7.f(aVar7.f2051b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f2050a & 128) != 0) {
                    aVar8.f(aVar8.f2051b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f2050a & 256) != 0) {
                    aVar9.f(aVar9.f2051b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i) {
            this.f2050a = i;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                e = handlerThread;
                handlerThread.start();
                f = new Handler(e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f2051b;
                if (sparseIntArrayArr[i] == null && (this.f2050a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.d, f);
            this.c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f2051b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference<Activity> weakReference : this.c) {
                if (weakReference.get() == activity) {
                    this.c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.f2051b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f2051b;
            this.f2051b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
                    this.c.remove(size);
                }
            }
            return this.f2051b;
        }

        public void f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / FolmeCore.NANOS_TO_MS);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    public static class b {
        public void a(Activity activity) {
            throw null;
        }

        public SparseIntArray[] b() {
            throw null;
        }

        public SparseIntArray[] c(Activity activity) {
            throw null;
        }

        public SparseIntArray[] d() {
            throw null;
        }

        public SparseIntArray[] e() {
            throw null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f2049a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f2049a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f2049a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f2049a.d();
    }

    public SparseIntArray[] e() {
        return this.f2049a.e();
    }

    public FrameMetricsAggregator(int i) {
        this.f2049a = new a(i);
    }
}
