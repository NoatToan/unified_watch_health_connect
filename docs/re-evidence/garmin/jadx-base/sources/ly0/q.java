package ly0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.f0;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import f5.g0;
import f5.z0;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l3.p1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class q {
    /* JADX WARN: Code duplicated, block: B:100:0x0182  */
    /* JADX WARN: Code duplicated, block: B:103:0x0189  */
    /* JADX WARN: Code duplicated, block: B:105:0x0190  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0180  */
    public static final void a(GCMMapView gCMMapView, e23.a<Unit> aVar, e23.l<? super GCMMapView, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, p3.m mVar, int i14, int i15) {
        int i16;
        e23.l<? super GCMMapView, Unit> lVar3;
        int i17;
        e23.l<? super Boolean, Unit> lVar4;
        int i18;
        boolean z14;
        e23.l<? super GCMMapView, Unit> lVar5;
        e23.l<? super Boolean, Unit> lVar6;
        p2 p2VarI0;
        e23.l<? super GCMMapView, Unit> lVar7;
        e23.l<? super Boolean, Unit> lVar8;
        h4.r.a aVar2;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar3;
        h5.g.a.b bVar;
        boolean z15;
        Object objQ;
        p3.m.a aVar4;
        boolean z16;
        Object objQ2;
        boolean z17;
        Object objQ3;
        boolean z18;
        Object objQ4;
        gCMMapView.getClass();
        o0 o0VarE = mVar.E(-1852610223);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(gCMMapView) : o0VarE.r(gCMMapView) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                lVar3 = lVar;
                i16 |= o0VarE.r(lVar3) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    lVar4 = lVar2;
                    if (o0VarE.r(lVar4)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i19 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i17 != 0) {
                        lVar8 = null;
                    } else {
                        lVar8 = lVar4;
                    }
                    x1 x1Var = p3.n.f135158a;
                    aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(aVar2, o0VarE);
                    h5.g.V.getClass();
                    aVar3 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    u uVar = u.f22885a;
                    h4.r rVarG = c2.l.g(x2.f(aVar2, 1.0f), 1.7777778f);
                    if ((i16 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ = o0VarE.q();
                    aVar4 = p3.m.f135153a;
                    if (z15) {
                        objQ = new k11.n(lVar8, 18);
                        o0VarE.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k11.n(lVar8, 18);
                            o0VarE.K(objQ);
                        }
                    }
                    h4.r rVarH = g0.h(rVarG, (e23.l) objQ);
                    if ((i16 & 14) != 4 || ((i16 & 8) != 0 && o0VarE.r(gCMMapView))) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ2 = o0VarE.q();
                    if (z16) {
                        objQ2 = new kp2.a(gCMMapView, 18);
                        o0VarE.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new kp2.a(gCMMapView, 18);
                            o0VarE.K(objQ2);
                        }
                    }
                    e23.l lVar9 = (e23.l) objQ2;
                    if ((i16 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ3 = o0VarE.q();
                    if (z17) {
                        objQ3 = new k11.n(lVar7, 19);
                        o0VarE.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new k11.n(lVar7, 19);
                            o0VarE.K(objQ3);
                        }
                    }
                    p002j6.c.b(lVar9, rVarH, (e23.l) objQ3, o0VarE, 0, 0);
                    h4.r rVarD = uVar.d(aVar2);
                    if ((i16 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z18) {
                        objQ4 = new ll0.a(aVar, 7);
                        o0VarE.K(objQ4);
                    } else {
                        aVar4.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ll0.a(aVar, 7);
                            o0VarE.K(objQ4);
                        }
                    }
                    c2.q.a(w.d(rVarD, false, null, null, (e23.a) objQ4, 15), o0VarE, 0);
                    o0VarE.g0(true);
                    lVar5 = lVar7;
                    lVar6 = lVar8;
                } else {
                    o0VarE.e();
                    lVar5 = lVar3;
                    lVar6 = lVar4;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f0(i14, i15, 21, gCMMapView, aVar, lVar5, lVar6);
                }
            }
            i16 |= 3072;
            lVar4 = lVar2;
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i19 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar3;
                }
                if (i17 != 0) {
                    lVar8 = null;
                } else {
                    lVar8 = lVar4;
                }
                x1 x1Var2 = p3.n.f135158a;
                aVar2 = h4.r.S;
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar2 = u.f22885a;
                h4.r rVarG2 = c2.l.g(x2.f(aVar2, 1.0f), 1.7777778f);
                if ((i16 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z15) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new k11.n(lVar8, 18);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new k11.n(lVar8, 18);
                    o0VarE.K(objQ);
                }
                h4.r rVarH2 = g0.h(rVarG2, (e23.l) objQ);
                if ((i16 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                objQ2 = o0VarE.q();
                if (z16) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new kp2.a(gCMMapView, 18);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new kp2.a(gCMMapView, 18);
                    o0VarE.K(objQ2);
                }
                e23.l lVar10 = (e23.l) objQ2;
                if ((i16 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ3 = o0VarE.q();
                if (z17) {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new k11.n(lVar7, 19);
                        o0VarE.K(objQ3);
                    }
                } else {
                    objQ3 = new k11.n(lVar7, 19);
                    o0VarE.K(objQ3);
                }
                p002j6.c.b(lVar10, rVarH2, (e23.l) objQ3, o0VarE, 0, 0);
                h4.r rVarD2 = uVar2.d(aVar2);
                if ((i16 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ4 = o0VarE.q();
                if (z18) {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new ll0.a(aVar, 7);
                        o0VarE.K(objQ4);
                    }
                } else {
                    objQ4 = new ll0.a(aVar, 7);
                    o0VarE.K(objQ4);
                }
                c2.q.a(w.d(rVarD2, false, null, null, (e23.a) objQ4, 15), o0VarE, 0);
                o0VarE.g0(true);
                lVar5 = lVar7;
                lVar6 = lVar8;
            } else {
                o0VarE.e();
                lVar5 = lVar3;
                lVar6 = lVar4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f0(i14, i15, 21, gCMMapView, aVar, lVar5, lVar6);
            }
        }
        i16 |= 384;
        lVar3 = lVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                lVar4 = lVar2;
                if (o0VarE.r(lVar4)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i19 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar3;
                }
                if (i17 != 0) {
                    lVar8 = null;
                } else {
                    lVar8 = lVar4;
                }
                x1 x1Var3 = p3.n.f135158a;
                aVar2 = h4.r.S;
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar3 = u.f22885a;
                h4.r rVarG3 = c2.l.g(x2.f(aVar2, 1.0f), 1.7777778f);
                if ((i16 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z15) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new k11.n(lVar8, 18);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new k11.n(lVar8, 18);
                    o0VarE.K(objQ);
                }
                h4.r rVarH3 = g0.h(rVarG3, (e23.l) objQ);
                if ((i16 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                objQ2 = o0VarE.q();
                if (z16) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new kp2.a(gCMMapView, 18);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new kp2.a(gCMMapView, 18);
                    o0VarE.K(objQ2);
                }
                e23.l lVar11 = (e23.l) objQ2;
                if ((i16 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ3 = o0VarE.q();
                if (z17) {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new k11.n(lVar7, 19);
                        o0VarE.K(objQ3);
                    }
                } else {
                    objQ3 = new k11.n(lVar7, 19);
                    o0VarE.K(objQ3);
                }
                p002j6.c.b(lVar11, rVarH3, (e23.l) objQ3, o0VarE, 0, 0);
                h4.r rVarD3 = uVar3.d(aVar2);
                if ((i16 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ4 = o0VarE.q();
                if (z18) {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new ll0.a(aVar, 7);
                        o0VarE.K(objQ4);
                    }
                } else {
                    objQ4 = new ll0.a(aVar, 7);
                    o0VarE.K(objQ4);
                }
                c2.q.a(w.d(rVarD3, false, null, null, (e23.a) objQ4, 15), o0VarE, 0);
                o0VarE.g0(true);
                lVar5 = lVar7;
                lVar6 = lVar8;
            } else {
                o0VarE.e();
                lVar5 = lVar3;
                lVar6 = lVar4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f0(i14, i15, 21, gCMMapView, aVar, lVar5, lVar6);
            }
        }
        i16 |= 3072;
        lVar4 = lVar2;
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i19 != 0) {
                lVar7 = null;
            } else {
                lVar7 = lVar3;
            }
            if (i17 != 0) {
                lVar8 = null;
            } else {
                lVar8 = lVar4;
            }
            x1 x1Var4 = p3.n.f135158a;
            aVar2 = h4.r.S;
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar4 = u.f22885a;
            h4.r rVarG4 = c2.l.g(x2.f(aVar2, 1.0f), 1.7777778f);
            if ((i16 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ = o0VarE.q();
            aVar4 = p3.m.f135153a;
            if (z15) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k11.n(lVar8, 18);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new k11.n(lVar8, 18);
                o0VarE.K(objQ);
            }
            h4.r rVarH4 = g0.h(rVarG4, (e23.l) objQ);
            if ((i16 & 14) != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            objQ2 = o0VarE.q();
            if (z16) {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new kp2.a(gCMMapView, 18);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new kp2.a(gCMMapView, 18);
                o0VarE.K(objQ2);
            }
            e23.l lVar12 = (e23.l) objQ2;
            if ((i16 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objQ3 = o0VarE.q();
            if (z17) {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new k11.n(lVar7, 19);
                    o0VarE.K(objQ3);
                }
            } else {
                objQ3 = new k11.n(lVar7, 19);
                o0VarE.K(objQ3);
            }
            p002j6.c.b(lVar12, rVarH4, (e23.l) objQ3, o0VarE, 0, 0);
            h4.r rVarD4 = uVar4.d(aVar2);
            if ((i16 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            objQ4 = o0VarE.q();
            if (z18) {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new ll0.a(aVar, 7);
                    o0VarE.K(objQ4);
                }
            } else {
                objQ4 = new ll0.a(aVar, 7);
                o0VarE.K(objQ4);
            }
            c2.q.a(w.d(rVarD4, false, null, null, (e23.a) objQ4, 15), o0VarE, 0);
            o0VarE.g0(true);
            lVar5 = lVar7;
            lVar6 = lVar8;
        } else {
            o0VarE.e();
            lVar5 = lVar3;
            lVar6 = lVar4;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(i14, i15, 21, gCMMapView, aVar, lVar5, lVar6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    public static final void b(s sVar, String str, r rVar, e23.a aVar, p3.m mVar, int i14) {
        LinkedHashMap linkedHashMap;
        Object dVar;
        sVar.getClass();
        rVar.getClass();
        o0 o0VarE = mVar.E(-247448200);
        int i15 = i14 | (o0VarE.B(sVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                linkedHashMap = rVar.f115382a;
                dVar = linkedHashMap.get(str);
                if (dVar == null) {
                    dVar = new ry0.d(d(context, sVar), false);
                    linkedHashMap.put(str, dVar);
                }
                objQ = (ry0.d) dVar;
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    linkedHashMap = rVar.f115382a;
                    dVar = linkedHashMap.get(str);
                    if (dVar == null) {
                        dVar = new ry0.d(d(context, sVar), false);
                        linkedHashMap.put(str, dVar);
                    }
                    objQ = (ry0.d) dVar;
                    o0VarE.K(objQ);
                }
            }
            ry0.d dVar2 = (ry0.d) objQ;
            GCMMapView gCMMapView = dVar2.f155067a;
            int i16 = i15 & 14;
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new kp2.a(sVar, 17);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new kp2.a(sVar, 17);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            boolean zB = o0VarE.B(dVar2) | (i16 == 4);
            Object objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new p1(23, dVar2, sVar);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new p1(23, dVar2, sVar);
                    o0VarE.K(objQ3);
                }
            }
            a(gCMMapView, aVar, lVar, (e23.l) objQ3, o0VarE, GCMMapView.f38734k | ((i15 >> 6) & 112), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c((Object) sVar, str, (Object) rVar, (o13.h) aVar, i14, 23);
        }
    }

    public static final void c(s sVar, GCMMapView gCMMapView) {
        gCMMapView.getClass();
        sVar.getClass();
        ArrayList arrayList = new ArrayList();
        i53.c<com.garmin.android.library.mapsdkadapter.q> cVar = sVar.f115383a;
        if (cVar != null) {
            Iterator<com.garmin.android.library.mapsdkadapter.q> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().f50328a.f93153a);
            }
        }
        com.garmin.android.library.mapsdkadapter.q qVar = sVar.f115385c;
        if (qVar != null) {
            arrayList.addAll(qVar.f50328a.f93153a);
        }
        int i14 = sVar.b().f93136a;
        qe2.h mapProxy = gCMMapView.getMapProxy();
        if (mapProxy.f144584a.getF50241b()) {
            mapProxy.setMapType(i14);
            com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                aVar.b((com.garmin.android.library.mapsdkadapter.f) it3.next());
            }
            com.garmin.android.library.mapsdkadapter.e eVarA = aVar.a();
            if (eVarA != null) {
                mapProxy.j(eVarA, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
            }
        }
    }

    public static final GCMMapView d(Context context, s sVar) {
        GCMMapView gCMMapView = new GCMMapView(context);
        gCMMapView.f(null, ((qw0.s) sVar.f115386d.getValue()).H(), sVar.b(), new p(sVar, gCMMapView));
        gCMMapView.onCreate(null);
        return gCMMapView;
    }
}
