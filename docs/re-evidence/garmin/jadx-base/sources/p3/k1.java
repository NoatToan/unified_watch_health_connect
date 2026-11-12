package p3;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lp3/k1;", "Lp3/j3;", "<init>", "()V", "c", "a", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k1 extends j3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.t0<Object, Object> f135137b = p1.g1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f135138c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.u0<q53.w<Unit>> f135139d = p1.i1.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.t0<q53.w<Unit>, e23.l<Object, Unit>> f135140e = p1.g1.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final en0.n f135141f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp3/k1$a;", "Lp3/k1$c;", "", "obj", "Lq53/w;", "", "channel", "<init>", "(Ljava/lang/Object;Lq53/w;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f135142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q53.w<Unit> f135143b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, q53.w<? super Unit> wVar) {
            this.f135142a = obj;
            this.f135143b = wVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/k1$b;", "Lp3/k1$c;", "Lq53/w;", "", "channel", "<init>", "(Lq53/w;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q53.w<Unit> f135144a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(q53.w<? super Unit> wVar) {
            this.f135144a = wVar;
        }
    }

    public interface c {
    }

    public k1() {
        f4.f.a aVar = f4.f.f68735e;
        ov1.q qVar = new ov1.q(this, 5);
        aVar.getClass();
        this.f135141f = f4.f.a.d(qVar);
    }

    @Override // p3.j3
    public final void a(q53.w<? super Unit> wVar) {
        this.f135138c.add(new b(wVar));
    }

    @Override // p3.j3
    public final void b() {
        synchronized (this.f135131a) {
            try {
                ArrayList arrayList = this.f135138c;
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    c cVar = (c) arrayList.get(i14);
                    if (cVar instanceof a) {
                        q3.f.a(this.f135137b, ((a) cVar).f135142a, ((a) cVar).f135143b);
                    } else {
                        if (!(cVar instanceof b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        q3.f.c(this.f135137b, ((b) cVar).f135144a);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f135138c.clear();
    }

    @Override // p3.j3
    public final void c() {
        this.f135141f.c();
        this.f135138c.clear();
        this.f135140e.g();
        synchronized (this.f135131a) {
            this.f135137b.g();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p3.j3
    public final e23.l<Object, Unit> d(q53.w<? super Unit> wVar) {
        p1.t0<q53.w<Unit>, e23.l<Object, Unit>> t0Var = this.f135140e;
        e23.l<Object, Unit> lVarD = t0Var.d(wVar);
        if (lVarD == null) {
            lVarD = new o50.a(18, this, wVar);
            int i14 = t0Var.i(wVar);
            if (i14 < 0) {
                i14 = ~i14;
            }
            Object[] objArr = t0Var.f134722c;
            Object obj = objArr[i14];
            t0Var.f134721b[i14] = wVar;
            objArr[i14] = lVarD;
        }
        return lVarD;
    }

    @Override // p3.j3
    public final void e(q53.i iVar) {
        this.f135140e.k(iVar);
        a(iVar);
        b();
    }
}
