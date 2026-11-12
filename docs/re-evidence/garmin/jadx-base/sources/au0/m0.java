package au0;

import android.app.Dialog;
import android.os.Bundle;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.C;
import f5.z0;
import i3.c1;
import i3.h1;
import i3.ua;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau0/m0;", "Lr22/x;", "<init>", "()V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 extends r22.x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f12967d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f12968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f12969b = p0.n(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f12970c = p0.n(Boolean.TRUE);

    public interface a {
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements a, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f12971a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f12971a = lVar;
        }

        public final /* synthetic */ void a(boolean z14) {
            this.f12971a.invoke(Boolean.valueOf(z14));
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof a) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f12971a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Bundle arguments = getArguments();
        setCancelable(arguments != null ? arguments.getBoolean("EXTRA_CANCELABLE", true) : true);
    }

    @Override // androidx.fragment.app.i
    public final void show(androidx.fragment.app.v vVar, String str) {
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(vVar, vVar);
        aVarB.j(0, this, str, 1);
        aVarB.s(true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r22.x
    public final void u6(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1430598712);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            String string = arguments.getString("EXTRA_TITLE", "");
            String string2 = arguments.getString("EXTRA_MESSAGE", "");
            String string3 = arguments.getString("EXTRA_POSITIVE_BUTTON_TEXT", "");
            String string4 = arguments.getString("EXTRA_NEGATIVE_BUTTON_TEXT", "");
            boolean z14 = arguments.getBoolean("EXTRA_CANCELABLE", true) && !((Boolean) this.f12969b.getF182175a()).booleanValue();
            z02.b.a(false, null, null, null, false, z3.f.c(2084105598, new a42.c(this, new p004k6.u(z14, z14, p004k6.e0.Inherit, true, true, (String) null, 32, (p005kotlin.jvm.internal.j) null), string4, string3, string, string2, 8), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a61.d(this, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    public final void v6(final String str, final boolean z14, final boolean z15, final e23.a aVar, p3.m mVar, final int i14) {
        int i15;
        String str2;
        e23.a aVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        long jB;
        o0 o0VarE = mVar.E(1354372960);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (str == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 1;
                pVar = new e23.p(this) { // from class: au0.j0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ m0 f12943b;

                    {
                        this.f12943b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = i17;
                        int i19 = i14;
                        switch (i18) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj;
                                ((Integer) obj2).getClass();
                                m0.b bVar = m0.f12967d;
                                this.f12943b.v6(str, z14, z15, aVar, mVar2, p0.t(i19 | 1));
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj;
                                ((Integer) obj2).getClass();
                                m0.b bVar2 = m0.f12967d;
                                this.f12943b.v6(str, z14, z15, aVar, mVar3, p0.t(i19 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                str2 = str;
                aVar2 = aVar;
                if (z14) {
                    o0VarE.C(177332135);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).k().e();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(177333543);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).k().b();
                    o0VarE.g0(false);
                }
                long j8 = jB;
                boolean z16 = (i15 & 7168) == 2048;
                Object objQ = o0VarE.q();
                if (z16) {
                    objQ = new as.n(aVar2, 12);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new as.n(aVar2, 12);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                c1 c1Var = c1.f87691a;
                long jC = o4.d0.c(0.5f, j8, 14);
                c1Var.getClass();
                h1.c(aVar3, null, z15, null, c1.c(0L, j8, jC, o0VarE, 5), null, null, null, z3.f.c(1291493469, new as.s(str2, i16), o0VarE), o0VarE, (i15 & 896) | C.ENCODING_PCM_32BIT, 490);
            }
            p2VarI0.f135219d = pVar;
        }
        str2 = str;
        aVar2 = aVar;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i18 = 0;
            final String str3 = str2;
            final e23.a aVar4 = aVar2;
            pVar = new e23.p(this) { // from class: au0.j0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m0 f12943b;

                {
                    this.f12943b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    int i110 = i14;
                    switch (i19) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            m0.b bVar = m0.f12967d;
                            this.f12943b.v6(str3, z14, z15, aVar4, mVar2, p0.t(i110 | 1));
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            m0.b bVar2 = m0.f12967d;
                            this.f12943b.v6(str3, z14, z15, aVar4, mVar3, p0.t(i110 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:40:0x012a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:49:0x0176  */
    /* JADX WARN: Code duplicated, block: B:51:0x0189  */
    /* JADX WARN: Code duplicated, block: B:53:0x0190  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01cd  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w6(String str, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        h5.g.a.f fVar;
        boolean zBooleanValue;
        p3.m.a aVar;
        boolean zR;
        Object objQ;
        boolean z14;
        boolean zR2;
        Object objQ2;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        o0 o0VarE = mVar.E(-1765286502);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97922g;
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarF, 0.0f, f14, eVar.f97918c, 0.0f, 9);
            c2.j.f22691a.getClass();
            c2.j.d dVar = c2.j.f22693c;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(dVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = i16;
            } else {
                i15 = i16;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                zBooleanValue = ((Boolean) this.f12969b.getF182175a()).booleanValue();
                aVar = p3.m.f135153a;
                if (zBooleanValue) {
                    o0VarE.C(1950858031);
                    bVar.getClass();
                    h4.r rVarY = c2.l.y(aVar2, eVar.f97917b);
                    bVar.getClass();
                    h4.r rVarQ = x2.q(rVarY, f15);
                    z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarQ, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    bVar.getClass();
                    h4.r rVarQ2 = x2.q(aVar2, f15);
                    g6.f.a aVar4 = g6.f.f75994b;
                    o0Var = o0VarE;
                    ua.a(2, 0.0f, 0, 384, 56, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), 0L, rVarQ2, o0Var);
                    o0Var.g0(true);
                    o0Var.g0(false);
                    z14 = true;
                } else {
                    o0Var = o0VarE;
                    o0Var.C(1951383822);
                    zR = o0Var.r(this);
                    objQ = o0Var.q();
                    if (zR) {
                        objQ = new k0(this, 1);
                        o0Var.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k0(this, 1);
                            o0Var.K(objQ);
                        }
                    }
                    z14 = true;
                    v6(str, true, true, (e23.a) objQ, o0Var, (i15 & 14) | 432 | ((i15 << 6) & 57344));
                    o0Var.g0(false);
                }
                boolean zBooleanValue2 = ((Boolean) this.f12970c.getF182175a()).booleanValue();
                zR2 = o0Var.r(this);
                objQ2 = o0Var.q();
                if (zR2) {
                    objQ2 = new k0(this, 2);
                    o0Var.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new k0(this, 2);
                        o0Var.K(objQ2);
                    }
                }
                v6(str2, false, zBooleanValue2, (e23.a) objQ2, o0Var, ((i15 >> 3) & 14) | 48 | ((i15 << 6) & 57344));
                o0Var.g0(z14);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var2 = u2.f22900a;
            zBooleanValue = ((Boolean) this.f12969b.getF182175a()).booleanValue();
            aVar = p3.m.f135153a;
            if (zBooleanValue) {
                o0VarE.C(1950858031);
                bVar.getClass();
                h4.r rVarY2 = c2.l.y(aVar2, eVar.f97917b);
                bVar.getClass();
                h4.r rVarQ3 = x2.q(rVarY2, f15);
                z0VarD = c2.q.d(h4.d.a.f81528f, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarQ3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                bVar.getClass();
                h4.r rVarQ4 = x2.q(aVar2, f15);
                g6.f.a aVar5 = g6.f.f75994b;
                o0Var = o0VarE;
                ua.a(2, 0.0f, 0, 384, 56, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), 0L, rVarQ4, o0Var);
                o0Var.g0(true);
                o0Var.g0(false);
                z14 = true;
            } else {
                o0Var = o0VarE;
                o0Var.C(1951383822);
                zR = o0Var.r(this);
                objQ = o0Var.q();
                if (zR) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new k0(this, 1);
                        o0Var.K(objQ);
                    }
                } else {
                    objQ = new k0(this, 1);
                    o0Var.K(objQ);
                }
                z14 = true;
                v6(str, true, true, (e23.a) objQ, o0Var, (i15 & 14) | 432 | ((i15 << 6) & 57344));
                o0Var.g0(false);
            }
            boolean zBooleanValue3 = ((Boolean) this.f12970c.getF182175a()).booleanValue();
            zR2 = o0Var.r(this);
            objQ2 = o0Var.q();
            if (zR2) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new k0(this, 2);
                    o0Var.K(objQ2);
                }
            } else {
                objQ2 = new k0(this, 2);
                o0Var.K(objQ2);
            }
            v6(str2, false, zBooleanValue3, (e23.a) objQ2, o0Var, ((i15 >> 3) & 14) | 48 | ((i15 << 6) & 57344));
            o0Var.g0(z14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(this, str, str2, i14, 12);
        }
    }

    public final void y6(boolean z14) {
        this.f12969b.setValue(Boolean.valueOf(z14));
        boolean z15 = !z14;
        this.f12970c.setValue(Boolean.valueOf(z15));
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(z15);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lau0/m0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TITLE", "EXTRA_MESSAGE", "EXTRA_POSITIVE_BUTTON_TEXT", "EXTRA_NEGATIVE_BUTTON_TEXT", "EXTRA_CANCELABLE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
