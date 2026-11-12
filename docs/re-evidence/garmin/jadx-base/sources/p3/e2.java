package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp3/e2;", "Lp3/e1;", "frameClock", "<init>", "(Lp3/e1;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e2 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f135071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f135072b = new a1();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos", v = 1)
    public static final class a<R> extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e23.l f135073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f135074b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f135076d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f135074b = obj;
            this.f135076d |= Integer.MIN_VALUE;
            return e2.this.v(null, this);
        }
    }

    public e2(e1 e1Var) {
        this.f135071a = e1Var;
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) t13.g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return t13.g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p3.e1
    public final <R> Object v(e23.l<? super Long, ? extends R> lVar, t13.d<? super R> dVar) throws Throwable {
        a aVar;
        boolean z14;
        Object objP;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f135076d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f135076d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f135074b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f135076d;
        if (i15 == 0) {
            o13.r.b(obj);
            a1 a1Var = this.f135072b;
            aVar.f135073a = lVar;
            aVar.f135076d = 1;
            synchronized (a1Var.f135030a) {
                z14 = a1Var.f135033d;
            }
            if (z14) {
                objP = Unit.INSTANCE;
            } else {
                o53.k kVar = new o53.k(u13.f.b(aVar), 1);
                kVar.q();
                synchronized (a1Var.f135030a) {
                    a1Var.f135031b.add(kVar);
                }
                kVar.r(new z0(a1Var, kVar));
                objP = kVar.p();
                if (objP != aVar2) {
                    objP = Unit.INSTANCE;
                }
            }
            if (objP != aVar2) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar = aVar.f135073a;
        o13.r.b(obj);
        e1 e1Var = this.f135071a;
        aVar.f135073a = null;
        aVar.f135076d = 2;
        Object objV = e1Var.v(lVar, aVar);
        return objV == aVar2 ? aVar2 : objV;
    }
}
