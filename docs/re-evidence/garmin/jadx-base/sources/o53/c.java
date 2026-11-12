package o53;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\t\nB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u000b\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lo53/c;", "T", "", "", "Lo53/i0;", "deferreds", "<init>", "([Lo53/i0;)V", "notCompletedCount", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f129311b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0<T>[] f129312a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\bR\b\u0012\u0004\u0012\u00028\u00000\t0\u00078\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lo53/c$a;", "Lo53/o1;", "Lo53/j;", "", "continuation", "<init>", "(Lo53/c;Lo53/j;)V", "Lh53/b;", "Lo53/c$b;", "Lo53/c;", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends o1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f129313h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j<List<? extends T>> f129314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public u0 f129315f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(j<? super List<? extends T>> jVar) {
            this.f129314e = jVar;
        }

        @Override // o53.o1
        public final boolean i() {
            return false;
        }

        @Override // o53.o1
        public final void j(Throwable th3) {
            j<List<? extends T>> jVar = this.f129314e;
            if (th3 != null) {
                u53.x xVarG = jVar.G(th3);
                if (xVarG != null) {
                    jVar.B(xVarG);
                    b bVar = (b) f129313h.get(this);
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c.f129311b;
            c<T> cVar = c.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(cVar) == 0) {
                i0<T>[] i0VarArr = cVar.f129312a;
                ArrayList arrayList = new ArrayList(i0VarArr.length);
                for (i0<T> i0Var : i0VarArr) {
                    arrayList.add(i0Var.f());
                }
                int i14 = o13.q.f128596b;
                jVar.resumeWith(arrayList);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo53/c$b;", "Lo53/i;", "", "Lo53/c$a;", "Lo53/c;", "nodes", "<init>", "(Lo53/c;[Lo53/c$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<T>.a[] f129317a;

        public b(c cVar, c<T>.a[] aVarArr) {
            this.f129317a = aVarArr;
        }

        @Override // o53.i
        public final void a(Throwable th3) {
            b();
        }

        public final void b() {
            for (c<T>.a aVar : this.f129317a) {
                u0 u0Var = aVar.f129315f;
                if (u0Var == null) {
                    p005kotlin.jvm.internal.s.m("handle");
                    throw null;
                }
                u0Var.dispose();
            }
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f129317a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(i0<? extends T>[] i0VarArr) {
        this.f129312a = i0VarArr;
        this.notCompletedCount$volatile = i0VarArr.length;
    }
}
