package androidx.lifecycle;

import android.app.Activity;
import android.os.Handler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/e1;", "Landroidx/lifecycle/n0;", "<init>", "()V", "b", "a", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1 implements n0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f7874i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e1 f7875j = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7877b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f7880e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7878c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7879d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f7881f = new o0(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0.c f7882g = new a0.c(this, 13);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f7883h = new c();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/e1$a;", "", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }

        private a() {
        }

        public static final void a(Activity activity, f1.a aVar) {
            activity.registerActivityLifecycleCallbacks(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/e1$c", "", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {
        public c() {
        }
    }

    private e1() {
    }

    public final void a() {
        int i14 = this.f7877b + 1;
        this.f7877b = i14;
        if (i14 == 1) {
            if (this.f7878c) {
                this.f7881f.g(b0.a.ON_RESUME);
                this.f7878c = false;
            } else {
                Handler handler = this.f7880e;
                handler.getClass();
                handler.removeCallbacks(this.f7882g);
            }
        }
    }

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public final b0 getF158017a() {
        return this.f7881f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/e1$b;", "", "<init>", "()V", "Landroidx/lifecycle/e1;", "newInstance", "Landroidx/lifecycle/e1;", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
