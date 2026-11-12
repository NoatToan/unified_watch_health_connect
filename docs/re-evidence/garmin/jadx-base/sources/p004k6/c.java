package p004k6;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.l;
import e23.p;
import f5.z0;
import g6.o;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import java.util.UUID;
import kotlin.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.h0;
import p3.i0;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import p5.v;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<i0, h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f103007a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar) {
            super(1);
            this.f103007a = wVar;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            w wVar = this.f103007a;
            wVar.show();
            return new p004k6.b(wVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f103008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f103009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f103010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f103011d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar, e23.a<Unit> aVar, u uVar, o oVar) {
            super(0);
            this.f103008a = wVar;
            this.f103009b = aVar;
            this.f103010c = uVar;
            this.f103011d = oVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f103008a.f(this.f103009b, this.f103010c, this.f103011d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: k6.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C1977c extends w implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f103012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f103013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<m, Integer, Unit> f103014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f103015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f103016e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1977c(e23.a<Unit> aVar, u uVar, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
            super(2);
            this.f103012a = aVar;
            this.f103013b = uVar;
            this.f103014c = pVar;
            this.f103015d = i14;
            this.f103016e = i15;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            num.intValue();
            c.a(this.f103012a, this.f103013b, this.f103014c, mVar, p0.t(this.f103015d | 1), this.f103016e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends w implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<p<m, Integer, Unit>> f103017a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x3<? extends p<? super m, ? super Integer, Unit>> x3Var) {
            super(2);
            this.f103017a = x3Var;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
                r.a aVar = r.S;
                Object objQ = mVar2.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p004k6.d.f103019a;
                    mVar2.K(objQ);
                }
                c.b(v.c((l) objQ, aVar, false), this.f103017a.getF182175a(), mVar2, 0, 0);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e extends w implements e23.a<UUID> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f103018a = new e();

        public e() {
            super(0);
        }

        @Override // e23.a
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(e23.a<Unit> aVar, u uVar, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        int i16;
        u uVar2;
        int i17;
        boolean z14;
        u uVar3;
        p2 p2VarI0;
        View view2;
        g6.c cVar;
        o oVar;
        o0.b bVarG;
        p1 p1VarQ;
        Object objQ;
        m.a.C2565a c2565a;
        UUID uuid;
        boolean zB;
        Object objQ2;
        w wVar;
        boolean zR;
        Object objQ3;
        boolean z15;
        boolean zK;
        Object objQ4;
        int i18;
        o0 o0VarE = mVar.E(826668973);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i19 = i15 & 2;
        if (i19 == 0) {
            if ((i14 & 48) == 0) {
                uVar2 = uVar;
                i16 |= o0VarE.B(uVar2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.r(pVar)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i17 = i16;
            if ((i17 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                if (i19 != 0) {
                    uVar3 = new u(false, false, false, 7, (j) null);
                } else {
                    uVar3 = uVar2;
                }
                x1 x1Var = n.f135158a;
                view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                cVar = (g6.c) o0VarE.A(t1.f91490h);
                oVar = (o) o0VarE.A(t1.f91496n);
                bVarG = o0VarE.g();
                p1VarQ = p0.q(pVar, o0VarE);
                Object[] objArr = new Object[0];
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e.f103018a;
                    o0VarE.K(objQ);
                }
                uuid = (UUID) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
                zB = o0VarE.B(view2) | o0VarE.B(cVar) | o0VarE.k(uVar3.f103113g) | o0VarE.B(uVar3.f103114h);
                objQ2 = o0VarE.q();
                if (zB || objQ2 == c2565a) {
                    w wVar2 = new w(aVar, uVar3, view2, oVar, cVar, uuid);
                    z3.e eVar = new z3.e(-1338939603, true, new d(p1VarQ));
                    t tVar = wVar2.f103118d;
                    tVar.setParentCompositionContext(bVarG);
                    tVar.f103099b.setValue(eVar);
                    tVar.f103103f = true;
                    tVar.createComposition();
                    o0VarE.K(wVar2);
                    objQ2 = wVar2;
                }
                wVar = (w) objQ2;
                zR = o0VarE.r(wVar);
                objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new a(wVar);
                    o0VarE.K(objQ3);
                }
                l0.a(wVar, (l) objQ3, o0VarE);
                boolean zR2 = o0VarE.r(wVar);
                if ((i17 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zK = zR2 | z15 | ((i17 & 112) == 32) | o0VarE.k(oVar.ordinal());
                objQ4 = o0VarE.q();
                if (zK || objQ4 == c2565a) {
                    objQ4 = new b(wVar, aVar, uVar3, oVar);
                    o0VarE.K(objQ4);
                }
                l0.i((e23.a) objQ4, o0VarE);
            } else {
                o0VarE.e();
                uVar3 = uVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new C1977c(aVar, uVar3, pVar, i14, i15);
            }
        }
        i16 |= 48;
        uVar2 = uVar;
        if ((i14 & 384) == 0) {
            if (o0VarE.r(pVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i16 |= i18;
        }
        i17 = i16;
        if ((i17 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            if (i19 != 0) {
                uVar3 = new u(false, false, false, 7, (j) null);
            } else {
                uVar3 = uVar2;
            }
            x1 x1Var2 = n.f135158a;
            view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            cVar = (g6.c) o0VarE.A(t1.f91490h);
            oVar = (o) o0VarE.A(t1.f91496n);
            bVarG = o0VarE.g();
            p1VarQ = p0.q(pVar, o0VarE);
            Object[] objArr2 = new Object[0];
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e.f103018a;
                o0VarE.K(objQ);
            }
            uuid = (UUID) d4.a.e(objArr2, (e23.a) objQ, o0VarE, 48);
            zB = o0VarE.B(view2) | o0VarE.B(cVar) | o0VarE.k(uVar3.f103113g) | o0VarE.B(uVar3.f103114h);
            objQ2 = o0VarE.q();
            if (zB) {
                w wVar3 = new w(aVar, uVar3, view2, oVar, cVar, uuid);
                z3.e eVar2 = new z3.e(-1338939603, true, new d(p1VarQ));
                t tVar2 = wVar3.f103118d;
                tVar2.setParentCompositionContext(bVarG);
                tVar2.f103099b.setValue(eVar2);
                tVar2.f103103f = true;
                tVar2.createComposition();
                o0VarE.K(wVar3);
                objQ2 = wVar3;
            } else {
                w wVar4 = new w(aVar, uVar3, view2, oVar, cVar, uuid);
                z3.e eVar3 = new z3.e(-1338939603, true, new d(p1VarQ));
                t tVar3 = wVar4.f103118d;
                tVar3.setParentCompositionContext(bVarG);
                tVar3.f103099b.setValue(eVar3);
                tVar3.f103103f = true;
                tVar3.createComposition();
                o0VarE.K(wVar4);
                objQ2 = wVar4;
            }
            wVar = (w) objQ2;
            zR = o0VarE.r(wVar);
            objQ3 = o0VarE.q();
            if (zR) {
                objQ3 = new a(wVar);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new a(wVar);
                o0VarE.K(objQ3);
            }
            l0.a(wVar, (l) objQ3, o0VarE);
            boolean zR3 = o0VarE.r(wVar);
            if ((i17 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            zK = zR3 | z15 | ((i17 & 112) == 32) | o0VarE.k(oVar.ordinal());
            objQ4 = o0VarE.q();
            if (zK) {
                objQ4 = new b(wVar, aVar, uVar3, oVar);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new b(wVar, aVar, uVar3, oVar);
                o0VarE.K(objQ4);
            }
            l0.i((e23.a) objQ4, o0VarE);
        } else {
            o0VarE.e();
            uVar3 = uVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new C1977c(aVar, uVar3, pVar, i14, i15);
        }
    }

    public static final void b(r rVar, p pVar, m mVar, int i14, int i15) {
        int i16;
        o0 o0VarE = mVar.E(1090521195);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            if (i17 != 0) {
                rVar = r.S;
            }
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p004k6.e.f103028a;
                o0VarE.K(objQ);
            }
            z0 z0Var = (z0) objQ;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
            int i18 = (((((i16 << 3) & 112) | (((i16 >> 3) & 14) | 384)) << 6) & 896) | 6;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, z0Var, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            b4.c(g.a.f81813j, Integer.valueOf(iHashCode), o0VarE);
            b4.b(g.a.f81814k, o0VarE);
            b4.c(g.a.f81807d, rVarC, o0VarE);
            e5.q((i18 >> 6) & 14, pVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(rVar, pVar, i14, i15);
        }
    }
}
