package md0;

import c2.j;
import c2.y;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import f12.l;
import f12.u;
import h4.k;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import l72.g1;
import l72.r1;
import li0.c0;
import li0.d0;
import li0.k0;
import li0.l0;
import m72.o;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"md0/h$a", "Lli0/f;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends li0.f {
        public a(b0 b0Var) {
            super(b0Var, null, null, 6, null);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1099610929);
        final int i15 = 0;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(new d0(new b12.b(lVar.z4("PREMIUM_PROFILE"), null, u.a(lVar.j()), null, null, 26, null), li0.b0.FOLLOW, null, bVar.getUserFullName(), false, "42 mutual friends", null, null, null, 468, null));
                o0VarE.K(objQ2);
            }
            final p1 p1Var = (p1) objQ2;
            final a aVar = new a(b0Var);
            r.a aVar2 = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            w13.c cVar = li0.b0.f112638m;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            p13.c.b bVar3 = new p13.c.b();
            while (bVar3.hasNext()) {
                arrayList.add(((li0.b0) bVar3.next()).name());
            }
            li0.b0 b0Var3 = ((d0) p1Var.getF182175a()).f112649b;
            String strName = b0Var3 != null ? b0Var3.name() : null;
            if (strName == null) {
                strName = "";
            }
            Object objQ3 = o0VarE.q();
            if (objQ3 == m.a.f135155b) {
                objQ3 = new f(p1Var, 0);
                o0VarE.K(objQ3);
            }
            g1.b(null, "Button state", arrayList, strName, null, null, null, false, false, null, (e23.l) objQ3, o0VarE, 48, 1009);
            r1.b("General", z3.f.c(868794590, new p() { // from class: md0.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = i15;
                    p1 p1Var2 = p1Var;
                    switch (i16) {
                        case 0:
                            m mVar2 = (m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                c0.f112641a.a((d0) p1Var2.getF182175a(), aVar, null, null, mVar2, d0.f112647j | (li0.f.f112658h << 3), 12);
                            } else {
                                mVar2.e();
                            }
                            break;
                        case 1:
                            m mVar3 = (m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                c0.f112641a.d((d0) p1Var2.getF182175a(), aVar, null, mVar3, d0.f112647j | (li0.f.f112658h << 3), 4);
                            } else {
                                mVar3.e();
                            }
                            break;
                        case 2:
                            m mVar4 = (m) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                x1 x1Var4 = n.f135158a;
                                c0.f112641a.c((d0) p1Var2.getF182175a(), aVar, true, null, mVar4, d0.f112647j | 384 | (li0.f.f112658h << 3), 8);
                            } else {
                                mVar4.e();
                            }
                            break;
                        default:
                            m mVar5 = (m) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                x1 x1Var5 = n.f135158a;
                                d0 d0Var = (d0) p1Var2.getF182175a();
                                float f14 = SyslogConstants.LOG_LOCAL4;
                                g6.f.a aVar4 = g6.f.f75994b;
                                k0.g(d0Var, aVar, f14, null, mVar5, d0.f112647j | 384 | (li0.f.f112658h << 3), 8);
                            } else {
                                mVar5.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 54, 0);
            final int i16 = 1;
            r1.b("Pending", z3.f.c(-712332921, new p() { // from class: md0.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    p1 p1Var2 = p1Var;
                    switch (i17) {
                        case 0:
                            m mVar2 = (m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                c0.f112641a.a((d0) p1Var2.getF182175a(), aVar, null, null, mVar2, d0.f112647j | (li0.f.f112658h << 3), 12);
                            } else {
                                mVar2.e();
                            }
                            break;
                        case 1:
                            m mVar3 = (m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                c0.f112641a.d((d0) p1Var2.getF182175a(), aVar, null, mVar3, d0.f112647j | (li0.f.f112658h << 3), 4);
                            } else {
                                mVar3.e();
                            }
                            break;
                        case 2:
                            m mVar4 = (m) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                x1 x1Var4 = n.f135158a;
                                c0.f112641a.c((d0) p1Var2.getF182175a(), aVar, true, null, mVar4, d0.f112647j | 384 | (li0.f.f112658h << 3), 8);
                            } else {
                                mVar4.e();
                            }
                            break;
                        default:
                            m mVar5 = (m) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                x1 x1Var5 = n.f135158a;
                                d0 d0Var = (d0) p1Var2.getF182175a();
                                float f14 = SyslogConstants.LOG_LOCAL4;
                                g6.f.a aVar4 = g6.f.f75994b;
                                k0.g(d0Var, aVar, f14, null, mVar5, d0.f112647j | 384 | (li0.f.f112658h << 3), 8);
                            } else {
                                mVar5.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 54, 0);
            final int i17 = 2;
            r1.b("Horizontal Suggestion", z3.f.c(-1127659738, new p() { // from class: md0.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i17;
                    p1 p1Var2 = p1Var;
                    switch (i18) {
                        case 0:
                            m mVar2 = (m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                c0.f112641a.a((d0) p1Var2.getF182175a(), aVar, null, null, mVar2, d0.f112647j | (li0.f.f112658h << 3), 12);
                            } else {
                                mVar2.e();
                            }
                            break;
                        case 1:
                            m mVar3 = (m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                c0.f112641a.d((d0) p1Var2.getF182175a(), aVar, null, mVar3, d0.f112647j | (li0.f.f112658h << 3), 4);
                            } else {
                                mVar3.e();
                            }
                            break;
                        case 2:
                            m mVar4 = (m) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                x1 x1Var4 = n.f135158a;
                                c0.f112641a.c((d0) p1Var2.getF182175a(), aVar, true, null, mVar4, d0.f112647j | 384 | (li0.f.f112658h << 3), 8);
                            } else {
                                mVar4.e();
                            }
                            break;
                        default:
                            m mVar5 = (m) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                x1 x1Var5 = n.f135158a;
                                d0 d0Var = (d0) p1Var2.getF182175a();
                                float f14 = SyslogConstants.LOG_LOCAL4;
                                g6.f.a aVar4 = g6.f.f75994b;
                                k0.g(d0Var, aVar, f14, null, mVar5, d0.f112647j | 384 | (li0.f.f112658h << 3), 8);
                            } else {
                                mVar5.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 54, 0);
            final int i18 = 3;
            r1.b("Vertical Suggestion", z3.f.c(-1542986555, new p() { // from class: md0.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    p1 p1Var2 = p1Var;
                    switch (i19) {
                        case 0:
                            m mVar2 = (m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                c0.f112641a.a((d0) p1Var2.getF182175a(), aVar, null, null, mVar2, d0.f112647j | (li0.f.f112658h << 3), 12);
                            } else {
                                mVar2.e();
                            }
                            break;
                        case 1:
                            m mVar3 = (m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                c0.f112641a.d((d0) p1Var2.getF182175a(), aVar, null, mVar3, d0.f112647j | (li0.f.f112658h << 3), 4);
                            } else {
                                mVar3.e();
                            }
                            break;
                        case 2:
                            m mVar4 = (m) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                x1 x1Var4 = n.f135158a;
                                c0.f112641a.c((d0) p1Var2.getF182175a(), aVar, true, null, mVar4, d0.f112647j | 384 | (li0.f.f112658h << 3), 8);
                            } else {
                                mVar4.e();
                            }
                            break;
                        default:
                            m mVar5 = (m) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                x1 x1Var5 = n.f135158a;
                                d0 d0Var = (d0) p1Var2.getF182175a();
                                float f14 = SyslogConstants.LOG_LOCAL4;
                                g6.f.a aVar4 = g6.f.f75994b;
                                k0.g(d0Var, aVar, f14, null, mVar5, d0.f112647j | 384 | (li0.f.f112658h << 3), 8);
                            } else {
                                mVar5.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 54, 0);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(i14, 21);
        }
    }
}
