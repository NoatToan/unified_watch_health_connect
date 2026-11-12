package androidx.work;

import android.content.Context;
import g8.i;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import t13.g;
import ue.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/d;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkerParameters f11422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f11423f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/CoroutineWorker$a;", "Lo53/z;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11424a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x53.c f11425b = s0.f129406a;

        private a() {
        }

        @Override // o53.z
        public final void dispatch(g gVar, Runnable runnable) {
            gVar.getClass();
            runnable.getClass();
            f11425b.dispatch(gVar, runnable);
        }

        @Override // o53.z
        public final boolean isDispatchNeeded(g gVar) {
            gVar.getClass();
            return f11425b.isDispatchNeeded(gVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f11422e = workerParameters;
        this.f11423f = a.f11424a;
    }

    @Override // androidx.work.d
    public final androidx.concurrent.futures.b.d a() {
        return t.a(this.f11423f.plus(i.c()), new ue.g(this, null));
    }

    @Override // androidx.work.d
    public final androidx.concurrent.futures.b.d b() {
        a aVar = a.f11424a;
        g gVar = this.f11423f;
        if (s.g(gVar, aVar)) {
            gVar = this.f11422e.f11430e;
        }
        gVar.getClass();
        return t.a(gVar.plus(i.c()), new b(this, null));
    }

    public abstract Object c(t13.d<? super d.a> dVar);
}
