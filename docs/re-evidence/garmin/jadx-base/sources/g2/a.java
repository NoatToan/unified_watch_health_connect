package g2;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\n\u000bB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lg2/a;", "Lg2/x1;", "Lg2/z1;", "Landroid/view/View$OnAttachStateChangeListener;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "b", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements x1, z1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1514a f75012h = new C1514a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f75013i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f75014a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75016c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f75020g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<a2> f75015b = new PriorityQueue<>(11, new androidx.browser.trusted.c(10));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Choreographer f75017d = Choreographer.getInstance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f75018e = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/a$b;", "Lg2/w1;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements w1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f75021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f75022b;

        @Override // g2.w1
        public final long a() {
            if (this.f75021a) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.f75022b - System.nanoTime());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    public a(View view2) {
        float refreshRate;
        this.f75014a = view2;
        f75012h.getClass();
        if (f75013i == 0) {
            Display display = view2.getDisplay();
            if (!view2.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f75013i = (long) (1000000000 / refreshRate);
        }
        view2.addOnAttachStateChangeListener(this);
        if (view2.isAttachedToWindow()) {
            this.f75019f = true;
        }
    }

    @Override // g2.z1
    public final void b(t1.a aVar) {
        a2.f75025c.getClass();
        this.f75015b.add(new a2(0, aVar));
        if (this.f75016c) {
            return;
        }
        this.f75016c = true;
        this.f75014a.post(this);
    }

    @Override // g2.z1
    public final void c(t1.a aVar) {
        a2.f75025c.getClass();
        this.f75015b.add(new a2(a2.f75026d, aVar));
        if (this.f75016c) {
            return;
        }
        this.f75016c = true;
        this.f75014a.post(this);
    }

    public final boolean d() {
        b bVar = this.f75018e;
        long jA = bVar.a();
        i6.a.a(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z14 = true;
        if (jA > 0) {
            PriorityQueue<a2> priorityQueue = this.f75015b;
            a2 a2VarPeek = priorityQueue.peek();
            a2VarPeek.getClass();
            if (!a2VarPeek.f75028b.a(bVar)) {
                priorityQueue.poll();
                z14 = false;
            }
            bVar.f75021a = false;
        }
        return z14;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        if (this.f75019f) {
            this.f75020g = j8;
            this.f75014a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        this.f75019f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        this.f75019f = false;
        this.f75014a.removeCallbacks(this);
        this.f75017d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue<a2> priorityQueue = this.f75015b;
        if (!priorityQueue.isEmpty() && this.f75016c && this.f75019f) {
            View view2 = this.f75014a;
            if (view2.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view2.getDrawingTime());
                boolean z14 = System.nanoTime() > (((long) 2) * f75013i) + nanos;
                b bVar = this.f75018e;
                bVar.f75021a = z14;
                bVar.f75022b = Math.max(this.f75020g, nanos) + f75013i;
                boolean zD = false;
                while (!priorityQueue.isEmpty() && !zD) {
                    if (bVar.f75021a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zD = d();
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } else {
                        zD = d();
                    }
                }
                if (zD) {
                    this.f75017d.postFrameCallback(this);
                } else {
                    this.f75016c = false;
                }
                i6.a.a(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f75016c = false;
    }

    /* JADX INFO: renamed from: g2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg2/a$a;", "", "<init>", "()V", "", "frameIntervalNs", "J", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1514a {
        public /* synthetic */ C1514a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1514a() {
        }
    }
}
