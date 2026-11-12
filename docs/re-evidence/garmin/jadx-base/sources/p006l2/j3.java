package p006l2;

import a2.j;
import b5.t0;
import b5.w;
import c2.q;
import e23.l;
import e23.p;
import f4.s;
import java.util.ArrayList;
import java.util.List;
import kd0.h6;
import kg.f;
import kotlin.t1;
import kotlin.t3;
import o13.r;
import o4.s0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w0;
import p1.q0;
import p13.d0;
import p3.a2;
import p3.c2;
import p3.h0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.c;
import s5.i0;
import s5.o;
import s5.r0;
import t13.d;
import u1.u0;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll2/j3;", "", "Ls5/c;", "initialText", "<init>", "(Ls5/c;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f108587a = p0.n(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f108588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s<l<k2, Unit>> f108589c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2 f108591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d2 d2Var, d<? super a> dVar) {
            super(2, dVar);
            this.f108591b = d2Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f108591b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f108590a;
            if (i14 == 0) {
                r.b(obj);
                this.f108590a = 1;
                d2 d2Var = this.f108591b;
                d2Var.getClass();
                Object objCollect = d2Var.f108442a.c().collect(new c2(new q0(0, 1, null), d2Var), this);
                if (objCollect != obj2) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l2/j3$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements h0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f108593b;

        public b(l lVar) {
            this.f108593b = lVar;
        }

        @Override // p3.h0
        public final void dispose() {
            j3.this.f108589c.remove(this.f108593b);
        }
    }

    public j3(c cVar) {
        w2 w2Var = new w2(4);
        cVar.getClass();
        c.b bVar = new c.b(cVar);
        ArrayList arrayList = bVar.f157143c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            c.b.C2962b c2962b = (c.b.C2962b) arrayList.get(i14);
            c.b.C2962b.a aVar = c.b.C2962b.f157144e;
            List list = (List) w2Var.invoke(c2962b.a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i15 = 0; i15 < size2; i15++) {
                c.d dVar = (c.d) list.get(i15);
                c.b.C2962b.f157144e.getClass();
                arrayList3.add(new c.b.C2962b(dVar.f157149a, dVar.f157150b, dVar.f157151c, dVar.f157152d));
            }
            d0.v(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f108588b = bVar.k();
        this.f108589c = new s<>();
    }

    public static c.d c(c.d dVar, s5.q0 q0Var) {
        o oVar = q0Var.f157281b;
        int iC = oVar.c(oVar.f157257f - 1, false);
        if (dVar.f157150b < iC) {
            return c.d.a(dVar, null, 0, Math.min(dVar.f157151c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(m mVar, int i14) {
        boolean z14;
        int i15;
        o0 o0VarE = mVar.E(1154651354);
        char c14 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        boolean z15 = false;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            t3 t3Var = (t3) o0VarE.A(t1.f91501s);
            c cVar = this.f108588b;
            List listA = cVar.a(cVar.f157138b.length());
            int size = listA.size();
            int i17 = 0;
            while (i17 < size) {
                c.d dVar = (c.d) listA.get(i17);
                int i18 = dVar.f157150b;
                T t7 = dVar.f157149a;
                if (i18 != dVar.f157151c) {
                    o0VarE.C(725478935);
                    Object objQ = o0VarE.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = f.b(o0VarE);
                    }
                    j jVar = (j) objQ;
                    h4.r rVarA = s0.a(h4.r.S, new jt1.d(27, this, dVar));
                    Object objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new w2(5);
                        o0VarE.K(objQ2);
                    }
                    h4.r rVarA2 = u0.a(v.c((l) objQ2, rVarA, z15).then(new q3(new hc0.c(21, this, dVar))), jVar);
                    w.f15928a.getClass();
                    h4.r rVarA3 = t0.a(rVarA2, w.a.f15932d);
                    boolean zR = o0VarE.r(this) | o0VarE.B(dVar) | o0VarE.r(t3Var);
                    Object objQ3 = o0VarE.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new k11.h(this, dVar, t3Var);
                        o0VarE.K(objQ3);
                    }
                    q.a(u1.w.e(rVarA3, jVar, (e23.a) objQ3), o0VarE, 0);
                    s5.m mVar2 = (s5.m) t7;
                    r0 f157243b = mVar2.getF157243b();
                    if (f157243b != null) {
                        if (f157243b.f157286a == null && f157243b.f157287b == null && f157243b.f157288c == null && f157243b.f157289d == null) {
                            i15 = 716130110;
                            z14 = false;
                        } else {
                            o0VarE.C(726303039);
                            Object objQ4 = o0VarE.q();
                            if (objQ4 == c2565a) {
                                objQ4 = new d2(jVar);
                                o0VarE.K(objQ4);
                            }
                            d2 d2Var = (d2) objQ4;
                            Unit unit = Unit.INSTANCE;
                            Object objQ5 = o0VarE.q();
                            if (objQ5 == c2565a) {
                                objQ5 = new a(d2Var, null);
                                o0VarE.K(objQ5);
                            }
                            l0.e((p) objQ5, unit, o0VarE);
                            a2 a2Var = d2Var.f108443b;
                            a2 a2Var2 = d2Var.f108443b;
                            Boolean boolValueOf = Boolean.valueOf((a2Var.getIntValue() & 2) != 0);
                            Boolean boolValueOf2 = Boolean.valueOf((a2Var2.getIntValue() & 1) != 0);
                            Boolean boolValueOf3 = Boolean.valueOf((a2Var2.getIntValue() & 4) != 0);
                            r0 f157243b2 = mVar2.getF157243b();
                            i0 i0Var = f157243b2 != null ? f157243b2.f157286a : null;
                            r0 f157243b3 = mVar2.getF157243b();
                            i0 i0Var2 = f157243b3 != null ? f157243b3.f157287b : null;
                            r0 f157243b4 = mVar2.getF157243b();
                            i0 i0Var3 = f157243b4 != null ? f157243b4.f157288c : null;
                            r0 f157243b5 = mVar2.getF157243b();
                            Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, i0Var, i0Var2, i0Var3, f157243b5 != null ? f157243b5.f157289d : null};
                            boolean zR2 = o0VarE.r(this) | o0VarE.B(dVar);
                            Object objQ6 = o0VarE.q();
                            if (zR2 || objQ6 == c2565a) {
                                objQ6 = new jt1.d(this, dVar, d2Var);
                                o0VarE.K(objQ6);
                            }
                            b(objArr, (l) objQ6, o0VarE, (i16 << 6) & 896);
                            z14 = false;
                        }
                        o0VarE.g0(z14);
                    } else {
                        z14 = false;
                        i15 = 716130110;
                    }
                    o0VarE.C(i15);
                    o0VarE.g0(z14);
                } else {
                    z14 = z15;
                    o0VarE.C(716130110);
                }
                o0VarE.g0(z14);
                i17++;
                z15 = z14;
                c14 = c14;
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kk1.h(this, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    public final void b(Object[] objArr, l<? super k2, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2083052099);
        int i15 = (i14 & 48) == 0 ? (o0VarE.r(lVar) ? 32 : 16) | i14 : i14;
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        o0VarE.N(-358306546, Integer.valueOf(objArr.length));
        int i16 = i15 | (o0VarE.k(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i16 |= o0VarE.r(obj) ? 4 : 0;
        }
        o0VarE.g0(false);
        if ((i16 & 14) == 0) {
            i16 |= 2;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            w0 w0Var = new w0(2);
            w0Var.a(lVar);
            w0Var.b(objArr);
            ArrayList<Object> arrayList = w0Var.f105816a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zR = o0VarE.r(this) | ((i16 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new t(this, lVar, 1);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new t(this, lVar, 1);
                    o0VarE.K(objQ);
                }
            }
            l0.d(array, (l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, objArr, lVar, i14, 12);
        }
    }
}
