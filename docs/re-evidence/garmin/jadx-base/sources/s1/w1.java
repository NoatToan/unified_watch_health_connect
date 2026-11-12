package s1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;
import s1.t1.a;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rw0.b f155835a = new rw0.b(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f155836b = o13.m.a(o13.n.NONE, new ro0.h(14));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s1/w1$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t1 f155837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t1.a f155838b;

        public a(t1 t1Var, t1.a aVar) {
            this.f155837a = t1Var;
            this.f155838b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p3.h0
        public final void dispose() {
            x3 x3Var;
            t1 t1Var = this.f155837a;
            t1Var.getClass();
            t1.a.C2947a c2947a = (t1.a.C2947a) this.f155838b.f155758c.getF182175a();
            if (c2947a == null || (x3Var = c2947a.f155760a) == null) {
                return;
            }
            t1Var.f155752i.remove(x3Var);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s1/w1$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t1 f155839a;

        public b(t1 t1Var) {
            this.f155839a = t1Var;
        }

        @Override // p3.h0
        public final void dispose() {
            t1 t1Var = this.f155839a;
            t1Var.k();
            t1Var.f155744a.e();
        }
    }

    public static final <S, T, V extends r> void a(t1<S> t1Var, t1<S>.d<T, V> dVar, T t7, T t14, f0<T> f0Var, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(867041821);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t1Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(t7) : o0VarE.r(t7) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(t14) : o0VarE.r(t14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(f0Var) : o0VarE.r(f0Var) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (t1Var.i()) {
                dVar.n(t7, t14, f0Var);
            } else {
                dVar.o(t14, f0Var);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(t1Var, dVar, t7, t14, f0Var, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static final <S, T, V extends r> t1<S>.a<T, V> b(t1<S> t1Var, c2<T, V> c2Var, String str, p3.m mVar, int i14, int i15) {
        t1.a.C2947a c2947a;
        if ((i15 & 2) != 0) {
            str = "DeferredAnimation";
        }
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(t1Var);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zB) {
            objQ = t1Var.new a(c2Var, str);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = t1Var.new a(c2Var, str);
                mVar.K(objQ);
            }
        }
        t1<S>.a<T, V> aVar2 = (t1.a) objQ;
        boolean zB2 = mVar.B(t1Var) | mVar.r(aVar2);
        Object objQ2 = mVar.q();
        if (zB2) {
            objQ2 = new rk0.g(14, t1Var, aVar2);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new rk0.g(14, t1Var, aVar2);
                mVar.K(objQ2);
            }
        }
        p3.l0.a(aVar2, (e23.l) objQ2, mVar);
        if (t1Var.i() && (c2947a = (t1.a.C2947a) aVar2.f155758c.getF182175a()) != null) {
            t1<S> t1Var2 = t1.this;
            c2947a.f155760a.n(c2947a.f155762c.invoke(t1Var2.f().c()), c2947a.f155762c.invoke(t1Var2.f().f()), c2947a.f155761b.invoke(t1Var2.f()));
        }
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public static final t1.d c(t1 t1Var, Object obj, Object obj2, f0 f0Var, c2 c2Var, String str, p3.m mVar, int i14) {
        f4.f fVarA;
        e23.l<Object, Unit> f68793s;
        e23.l<Object, Unit> lVar;
        f4.f fVarB;
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(t1Var);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zB) {
            f4.f.f68735e.getClass();
            fVarA = f4.f.a.a();
            if (fVarA != null) {
                f68793s = fVarA.getF68733f();
            } else {
                f68793s = null;
            }
            lVar = f68793s;
            fVarB = f4.f.a.b(fVarA);
            r rVar = (r) c2Var.a().invoke(obj2);
            rVar.d();
            Object dVar = new t1.d(obj, rVar, c2Var, str);
            f4.f.a.e(fVarA, fVarB, lVar);
            mVar.K(dVar);
            objQ = dVar;
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                f4.f.f68735e.getClass();
                fVarA = f4.f.a.a();
                if (fVarA != null) {
                    f68793s = fVarA.getF68733f();
                } else {
                    f68793s = null;
                }
                lVar = f68793s;
                fVarB = f4.f.a.b(fVarA);
                try {
                    r rVar2 = (r) c2Var.a().invoke(obj2);
                    rVar2.d();
                    Object dVar2 = new t1.d(obj, rVar2, c2Var, str);
                    f4.f.a.e(fVarA, fVarB, lVar);
                    mVar.K(dVar2);
                    objQ = dVar2;
                } catch (Throwable th3) {
                    f4.f.a.e(fVarA, fVarB, lVar);
                    throw th3;
                }
            }
        }
        t1.d dVar3 = (t1.d) objQ;
        a(t1Var, dVar3, obj, obj2, f0Var, mVar, 0);
        boolean zB2 = mVar.B(t1Var) | mVar.B(dVar3);
        Object objQ2 = mVar.q();
        if (zB2) {
            objQ2 = new rk0.g(15, t1Var, dVar3);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new rk0.g(15, t1Var, dVar3);
                mVar.K(objQ2);
            }
        }
        p3.l0.a(dVar3, (e23.l) objQ2, mVar);
        return dVar3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    public static final t1 d(a2 a2Var, String str, p3.m mVar, int i14) {
        f4.f fVarA;
        e23.l<Object, Unit> f68793s;
        f4.f fVarB;
        p3.x1 x1Var = p3.n.f135158a;
        int i15 = (i14 & 14) ^ 6;
        int i16 = 1;
        boolean z14 = (i15 > 4 && mVar.B(a2Var)) || (i14 & 6) == 4;
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (z14) {
            f4.f.f68735e.getClass();
            fVarA = f4.f.a.a();
            if (fVarA != null) {
                f68793s = fVarA.getF68733f();
            } else {
                f68793s = null;
            }
            fVarB = f4.f.a.b(fVarA);
            Object t1Var = new t1(a2Var, str);
            f4.f.a.e(fVarA, fVarB, f68793s);
            mVar.K(t1Var);
            objQ = t1Var;
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                f4.f.f68735e.getClass();
                fVarA = f4.f.a.a();
                if (fVarA != null) {
                    f68793s = fVarA.getF68733f();
                } else {
                    f68793s = null;
                }
                fVarB = f4.f.a.b(fVarA);
                try {
                    Object t1Var2 = new t1(a2Var, str);
                    f4.f.a.e(fVarA, fVarB, f68793s);
                    mVar.K(t1Var2);
                    objQ = t1Var2;
                } catch (Throwable th3) {
                    f4.f.a.e(fVarA, fVarB, f68793s);
                    throw th3;
                }
            }
        }
        t1 t1Var3 = (t1) objQ;
        if (a2Var instanceof a1) {
            mVar.C(-1357607479);
            a1 a1Var = (a1) a2Var;
            T f182175a = a1Var.f155463c.getF182175a();
            T f182175a2 = a1Var.f155462b.getF182175a();
            boolean z15 = (i15 > 4 && mVar.B(a2Var)) || (i14 & 6) == 4;
            Object objQ2 = mVar.q();
            if (z15) {
                objQ2 = new y1(a2Var, null);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new y1(a2Var, null);
                    mVar.K(objQ2);
                }
            }
            p3.l0.f(f182175a, f182175a2, (e23.p) objQ2, mVar);
            mVar.f();
        } else {
            mVar.C(-1357145920);
            t1Var3.a(a2Var.b(), mVar, 0);
            mVar.f();
        }
        boolean zB = mVar.B(t1Var3);
        Object objQ3 = mVar.q();
        if (zB) {
            objQ3 = new u1(t1Var3, i16);
            mVar.K(objQ3);
        } else {
            aVar.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new u1(t1Var3, i16);
                mVar.K(objQ3);
            }
        }
        p3.l0.a(t1Var3, (e23.l) objQ3, mVar);
        return t1Var3;
    }

    public static final <T> t1<T> e(T t7, String str, p3.m mVar, int i14, int i15) {
        if ((i15 & 2) != 0) {
            str = null;
        }
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = new t1(t7, str);
            mVar.K(objQ);
        }
        t1<T> t1Var = (t1) objQ;
        t1Var.a(t7, mVar, (i14 & 8) | 48 | (i14 & 14));
        Object objQ2 = mVar.q();
        if (objQ2 == c2565a) {
            objQ2 = new u1(t1Var, 0);
            mVar.K(objQ2);
        }
        p3.l0.a(t1Var, (e23.l) objQ2, mVar);
        return t1Var;
    }
}
