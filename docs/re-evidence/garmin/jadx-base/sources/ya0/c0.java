package ya0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.x2;
import ca0.o0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ew1.v1;
import i3.i7;
import i3.mh;
import i3.qa;
import kotlin.o3;
import l72.c1;
import l72.y2;
import lc.u0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import r53.o2;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 {
    /* JADX WARN: Code duplicated, block: B:101:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:113:0x0324  */
    /* JADX WARN: Code duplicated, block: B:128:0x0361  */
    /* JADX WARN: Code duplicated, block: B:142:0x039e  */
    /* JADX WARN: Code duplicated, block: B:156:0x03df  */
    /* JADX WARN: Code duplicated, block: B:170:0x0423  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:57:0x015d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:77:0x0217  */
    /* JADX WARN: Code duplicated, block: B:78:0x0221  */
    /* JADX WARN: Code duplicated, block: B:81:0x0237  */
    /* JADX WARN: Code duplicated, block: B:85:0x0255  */
    /* JADX WARN: Code duplicated, block: B:89:0x0278  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c cVar, e23.p pVar, e23.l lVar, e23.l lVar2, e23.p pVar2, e23.l lVar3, o0 o0Var, e23.l lVar4, p3.m mVar, int i14) {
        e23.l lVar5;
        String strJ;
        int i15;
        int i16;
        ViewModelStoreOwner viewModelStoreOwnerA;
        a aVar;
        p1 p1VarC;
        Object objQ;
        p3.m.a.C2565a c2565a;
        boolean zB;
        Object objQ2;
        p90.b bVar;
        boolean zR;
        Object objQ3;
        p90.a aVar2;
        boolean zB2;
        Object objQ4;
        boolean zB3;
        Object objQ5;
        o0 o0Var2 = o0Var;
        pVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        pVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        p3.o0 o0VarE = mVar.E(-1918246322);
        int i17 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(pVar2) ? 16384 : 8192) | (o0VarE.r(lVar3) ? 131072 : 65536) | (o0VarE.r(o0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar4) ? 8388608 : 4194304);
        boolean z14 = true;
        if (o0VarE.n(i17 & 1, (i17 & 4793491) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            q90.a aVar3 = (q90.a) s9.c.c((o2) cVar.f195407d.getValue(), o0VarE).getF182175a();
            boolean z15 = aVar3 instanceof q90.a.e;
            p3.m.a aVar4 = p3.m.f135153a;
            if (z15) {
                o0VarE.C(-1935600852);
                q90.a.e eVar = (q90.a.e) aVar3;
                boolean z16 = eVar.f143472d;
                l90.b bVar2 = eVar.f143470b;
                String strJ2 = z16 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1935630395, R.string.title_resetting_device, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1935545951, R.string.lbl_connecting_your_device, o0VarE, false);
                if (z16) {
                    i15 = -1935416061;
                    i16 = R.string.reset_device_description;
                } else {
                    if (eVar.f143473e) {
                        i15 = -1935303996;
                        i16 = R.string.startup_finishing_setup;
                    } else {
                        o0VarE.C(-1935220048);
                        o0VarE.g0(false);
                        strJ = null;
                    }
                    o0VarE.L(-1614864554);
                    v9.a.f176280a.getClass();
                    viewModelStoreOwnerA = v9.a.a(o0VarE);
                    if (viewModelStoreOwnerA != null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    aVar = (a) u1VarResolveViewModel;
                    p1VarC = s9.c.c(aVar.f195394c, o0VarE);
                    Boolean bool = (Boolean) p1VarC.getF182175a();
                    Boolean bool2 = Boolean.TRUE;
                    boolean zG = p005kotlin.jvm.internal.s.g(bool, bool2);
                    String str = strJ2;
                    objQ = o0VarE.q();
                    aVar4.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new j(2);
                        o0VarE.K(objQ);
                    }
                    c.w.a(48, 0, (e23.a) objQ, o0VarE, zG);
                    Boolean bool3 = (Boolean) p1VarC.getF182175a();
                    zB = o0VarE.B(p1VarC) | ((i17 & 3670016) == 1048576);
                    objQ2 = o0VarE.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new t(o0Var2, p1VarC, null);
                        o0VarE.K(objQ2);
                    }
                    l0.e((e23.p) objQ2, bool3, o0VarE);
                    c("device_pairing_ble_progress_screen", bVar2.f111521f, bVar2.f111526k, str, strJ, eVar.f143471c, eVar.f143469a, p005kotlin.jvm.internal.s.g((Boolean) p1VarC.getF182175a(), bool2), gl1.y.Q(o0VarE, R.string.lbl_cancel), o0Var, lVar4, o0VarE, ((i17 << 9) & 1879048192) | 6, (i17 >> 21) & 14, 0);
                    o0VarE = o0VarE;
                    bVar = eVar.f143474f;
                    if (bVar == null) {
                        o0VarE.C(-1933987055);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1933987054);
                        String str2 = bVar2.f111521f;
                        zR = o0VarE.r(bVar);
                        objQ3 = o0VarE.q();
                        if (zR || objQ3 == c2565a) {
                            objQ3 = new xa2.g(bVar, 19);
                            o0VarE.K(objQ3);
                        }
                        e(str2, (e23.l) objQ3, o0VarE, 0);
                        Unit unit = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    aVar2 = eVar.f143475g;
                    if (aVar2 == null) {
                        o0VarE.C(-1933684929);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1933684928);
                        String str3 = bVar2.f111521f;
                        boolean z17 = aVar2.f136456b;
                        zB2 = o0VarE.B(aVar2);
                        objQ4 = o0VarE.q();
                        if (zB2 || objQ4 == c2565a) {
                            objQ4 = new xn.r(aVar2, 16);
                            o0VarE.K(objQ4);
                        }
                        e23.a aVar5 = (e23.a) objQ4;
                        zB3 = o0VarE.B(aVar2) | o0VarE.r(aVar);
                        objQ5 = o0VarE.q();
                        if (zB3 || objQ5 == c2565a) {
                            objQ5 = new xr.a(14, aVar2, aVar);
                            o0VarE.K(objQ5);
                        }
                        d(0, aVar5, (e23.a) objQ5, str3, o0VarE, z17);
                        Unit unit2 = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA != null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                aVar = (a) u1VarResolveViewModel2;
                p1VarC = s9.c.c(aVar.f195394c, o0VarE);
                Boolean bool4 = (Boolean) p1VarC.getF182175a();
                Boolean bool5 = Boolean.TRUE;
                boolean zG2 = p005kotlin.jvm.internal.s.g(bool4, bool5);
                String str4 = strJ2;
                objQ = o0VarE.q();
                aVar4.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new j(2);
                    o0VarE.K(objQ);
                }
                c.w.a(48, 0, (e23.a) objQ, o0VarE, zG2);
                Boolean bool6 = (Boolean) p1VarC.getF182175a();
                zB = o0VarE.B(p1VarC) | ((i17 & 3670016) == 1048576);
                objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new t(o0Var2, p1VarC, null);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new t(o0Var2, p1VarC, null);
                    o0VarE.K(objQ2);
                }
                l0.e((e23.p) objQ2, bool6, o0VarE);
                c("device_pairing_ble_progress_screen", bVar2.f111521f, bVar2.f111526k, str4, strJ, eVar.f143471c, eVar.f143469a, p005kotlin.jvm.internal.s.g((Boolean) p1VarC.getF182175a(), bool5), gl1.y.Q(o0VarE, R.string.lbl_cancel), o0Var, lVar4, o0VarE, ((i17 << 9) & 1879048192) | 6, (i17 >> 21) & 14, 0);
                o0VarE = o0VarE;
                bVar = eVar.f143474f;
                if (bVar == null) {
                    o0VarE.C(-1933987055);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1933987054);
                    String str5 = bVar2.f111521f;
                    zR = o0VarE.r(bVar);
                    objQ3 = o0VarE.q();
                    if (zR) {
                        objQ3 = new xa2.g(bVar, 19);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new xa2.g(bVar, 19);
                        o0VarE.K(objQ3);
                    }
                    e(str5, (e23.l) objQ3, o0VarE, 0);
                    Unit unit3 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                aVar2 = eVar.f143475g;
                if (aVar2 == null) {
                    o0VarE.C(-1933684929);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1933684928);
                    String str6 = bVar2.f111521f;
                    boolean z18 = aVar2.f136456b;
                    zB2 = o0VarE.B(aVar2);
                    objQ4 = o0VarE.q();
                    if (zB2) {
                        objQ4 = new xn.r(aVar2, 16);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new xn.r(aVar2, 16);
                        o0VarE.K(objQ4);
                    }
                    e23.a aVar6 = (e23.a) objQ4;
                    zB3 = o0VarE.B(aVar2) | o0VarE.r(aVar);
                    objQ5 = o0VarE.q();
                    if (zB3) {
                        objQ5 = new xr.a(14, aVar2, aVar);
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new xr.a(14, aVar2, aVar);
                        o0VarE.K(objQ5);
                    }
                    d(0, aVar6, (e23.a) objQ5, str6, o0VarE, z18);
                    Unit unit4 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else if (aVar3 instanceof q90.a.f) {
                o0VarE.C(-1933119922);
                Unit unit5 = Unit.INSTANCE;
                boolean zB4 = ((i17 & 458752) == 131072) | o0VarE.B(aVar3);
                Object objQ6 = o0VarE.q();
                if (zB4) {
                    objQ6 = new u(lVar3, aVar3, null);
                    o0VarE.K(objQ6);
                } else {
                    aVar4.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new u(lVar3, aVar3, null);
                        o0VarE.K(objQ6);
                    }
                }
                l0.e((e23.p) objQ6, unit5, o0VarE);
                o0VarE.g0(false);
            } else {
                if (aVar3 instanceof q90.a.g) {
                    o0VarE.C(-1932945361);
                    l90.b bVar3 = ((q90.a.g) aVar3).f143480c;
                    c("device_pairing_ble_success_screen", bVar3.f111521f, bVar3.f111526k, gl1.y.Q(o0VarE, R.string.lbl_connecting_your_device), gl1.y.Q(o0VarE, R.string.startup_finishing_setup), false, 1.0f, false, gl1.y.Q(o0VarE, R.string.lbl_cancel), o0Var, lVar4, o0VarE, ((i17 << 9) & 1879048192) | 1769478, (i17 >> 21) & 14, 128);
                    o0Var2 = o0Var;
                    Unit unit6 = Unit.INSTANCE;
                    if ((i17 & 112) != 32) {
                        o0VarE = o0VarE;
                        z14 = false;
                    }
                    o0VarE = o0VarE;
                    boolean zB5 = z14 | o0VarE.B(aVar3);
                    Object objQ7 = o0VarE.q();
                    if (zB5) {
                        objQ7 = new v(pVar, aVar3, null);
                        o0VarE.K(objQ7);
                    } else {
                        aVar4.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new v(pVar, aVar3, null);
                            o0VarE.K(objQ7);
                        }
                    }
                    l0.e((e23.p) objQ7, unit6, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0Var2 = o0Var;
                    if (aVar3 instanceof q90.a.C2704a) {
                        o0VarE.C(-1931849511);
                        Unit unit7 = Unit.INSTANCE;
                        z14 = (i17 & 3670016) == 1048576;
                        Object objQ8 = o0VarE.q();
                        if (z14) {
                            objQ8 = new w(o0Var2, null);
                            o0VarE.K(objQ8);
                        } else {
                            aVar4.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new w(o0Var2, null);
                                o0VarE.K(objQ8);
                            }
                        }
                        l0.e((e23.p) objQ8, unit7, o0VarE);
                        o0VarE.g0(false);
                    } else if (aVar3 instanceof q90.a.c) {
                        o0VarE.C(-1931716180);
                        Unit unit8 = Unit.INSTANCE;
                        boolean zB6 = ((i17 & 896) == 256) | o0VarE.B(aVar3);
                        Object objQ9 = o0VarE.q();
                        if (zB6) {
                            lVar5 = lVar;
                            objQ9 = new x(lVar5, aVar3, null);
                            o0VarE.K(objQ9);
                        } else {
                            aVar4.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                lVar5 = lVar;
                                objQ9 = new x(lVar5, aVar3, null);
                                o0VarE.K(objQ9);
                            } else {
                                lVar5 = lVar;
                            }
                        }
                        l0.e((e23.p) objQ9, unit8, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        lVar5 = lVar;
                        if (aVar3 instanceof q90.a.b) {
                            o0VarE.C(-1931549276);
                            Unit unit9 = Unit.INSTANCE;
                            boolean zB7 = ((i17 & 7168) == 2048) | o0VarE.B(aVar3);
                            Object objQ10 = o0VarE.q();
                            if (zB7) {
                                objQ10 = new y(lVar2, aVar3, null);
                                o0VarE.K(objQ10);
                            } else {
                                aVar4.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new y(lVar2, aVar3, null);
                                    o0VarE.K(objQ10);
                                }
                            }
                            l0.e((e23.p) objQ10, unit9, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            if (!(aVar3 instanceof q90.a.d)) {
                                throw kg.f.h(o0VarE, -893722729, false);
                            }
                            o0VarE.C(-1931111215);
                            Unit unit10 = Unit.INSTANCE;
                            boolean zB8 = ((i17 & 57344) == 16384) | o0VarE.B(aVar3);
                            Object objQ11 = o0VarE.q();
                            if (zB8) {
                                objQ11 = new s(pVar2, aVar3, null);
                                o0VarE.K(objQ11);
                            } else {
                                aVar4.getClass();
                                if (objQ11 == p3.m.a.f135155b) {
                                    objQ11 = new s(pVar2, aVar3, null);
                                    o0VarE.K(objQ11);
                                }
                            }
                            l0.e((e23.p) objQ11, unit10, o0VarE);
                            o0VarE.g0(false);
                        }
                    }
                }
                lVar5 = lVar;
            }
            lVar5 = lVar;
            o0Var2 = o0Var;
        } else {
            lVar5 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vz1.j(cVar, pVar, lVar5, lVar2, pVar2, lVar3, o0Var2, lVar4, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0186  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(q90.d.b bVar, d dVar, e23.l lVar, e23.l lVar2, o0 o0Var, e23.l lVar3, p3.m mVar, int i14) {
        d dVar2;
        int i15;
        d dVar3;
        d dVar4;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar.E(-464442439);
        int i16 = i14 | (o0VarE.r(bVar) ? 4 : 2) | 16 | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(o0Var) ? 16384 : 8192) | (o0VarE.r(lVar3) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                boolean zR = o0VarE.r(bVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new xn.r(bVar, 17);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new xn.r(bVar, 17);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(d.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar2);
                o0VarE.g0(false);
                d dVar5 = (d) u1VarResolveViewModel;
                i15 = i16 & (-113);
                dVar3 = dVar5;
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                dVar3 = dVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            q90.b bVar2 = (q90.b) s9.c.c((o2) dVar3.f195422c.getValue(), o0VarE).getF182175a();
            String strJ = null;
            if (bVar2 instanceof q90.b.c) {
                o0VarE.C(-2114496060);
                q90.b.c cVar = (q90.b.c) bVar2;
                l90.b bVar3 = cVar.f143487b;
                int i18 = i15;
                String str = bVar3.f111521f;
                o90.a aVar3 = bVar3.f111526k;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_connecting_your_device);
                if (cVar.f143488c) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 347443849, R.string.startup_finishing_setup, o0VarE, false);
                } else {
                    o0VarE.C(-2114090364);
                    o0VarE.g0(false);
                }
                dVar4 = dVar3;
                c("device_pairing_btc_progress_screen", str, aVar3, strQ, strJ, false, cVar.f143486a, false, gl1.y.Q(o0VarE, R.string.lbl_cancel), o0Var, lVar3, o0VarE, ((i18 << 15) & 1879048192) | 196614, (i18 >> 15) & 14, 128);
                o0VarE.g0(false);
            } else {
                dVar4 = dVar3;
                int i19 = i15;
                if (bVar2 instanceof q90.b.d) {
                    o0VarE.C(-2113747007);
                    Unit unit = Unit.INSTANCE;
                    boolean zB = ((i19 & 896) == 256) | o0VarE.B(bVar2);
                    Object objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new z(lVar, bVar2, null);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new z(lVar, bVar2, null);
                            o0VarE.K(objQ2);
                        }
                    }
                    l0.e((e23.p) objQ2, unit, o0VarE);
                    o0VarE.g0(false);
                } else if (bVar2 instanceof q90.b.a) {
                    o0VarE.C(-2113311922);
                    Unit unit2 = Unit.INSTANCE;
                    boolean z14 = (57344 & i19) == 16384;
                    Object objQ3 = o0VarE.q();
                    if (z14) {
                        objQ3 = new a0(o0Var, null);
                        o0VarE.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new a0(o0Var, null);
                            o0VarE.K(objQ3);
                        }
                    }
                    l0.e((e23.p) objQ3, unit2, o0VarE);
                    o0VarE.g0(false);
                } else {
                    if (!(bVar2 instanceof q90.b.C2705b)) {
                        throw kg.f.h(o0VarE, 347430929, false);
                    }
                    o0VarE.C(-2113155589);
                    Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.dialog_title_device_disconnected_a);
                    Unit unit3 = Unit.INSTANCE;
                    boolean zB2 = o0VarE.B(bVar2) | o0VarE.r(context) | o0VarE.B(strQ2) | ((i19 & 7168) == 2048);
                    Object objQ4 = o0VarE.q();
                    if (zB2) {
                        b0 b0Var = new b0(bVar2, context, strQ2, lVar2, null);
                        o0VarE.K(b0Var);
                        objQ4 = b0Var;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            b0 b0Var2 = new b0(bVar2, context, strQ2, lVar2, null);
                            o0VarE.K(b0Var2);
                            objQ4 = b0Var2;
                        }
                    }
                    l0.e((e23.p) objQ4, unit3, o0VarE);
                    o0VarE.g0(false);
                }
            }
            dVar2 = dVar4;
        } else {
            o0VarE.e();
            dVar2 = dVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ta0.g0((Object) bVar, (Object) dVar2, lVar, lVar2, (o13.h) o0Var, lVar3, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x016f  */
    /* JADX WARN: Code duplicated, block: B:108:0x017b  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    public static final void c(final String str, final String str2, final o90.a aVar, final String str3, final String str4, final boolean z14, final float f14, boolean z15, final String str5, final o0 o0Var, final e23.l lVar, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        String str6;
        boolean z16;
        int i18;
        boolean z17;
        p3.o0 o0Var2;
        final boolean z18;
        p2 p2VarI0;
        boolean z19;
        int i19;
        int i24;
        int i25;
        p3.o0 o0VarE = mVar.E(1016156262);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            str6 = str3;
            i17 |= o0VarE.B(str6) ? 2048 : 1024;
        } else {
            str6 = str3;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i17 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i17 |= o0VarE.i(f14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i26 = i16 & 128;
        if (i26 == 0) {
            if ((12582912 & i14) == 0) {
                z16 = z15;
                i17 |= o0VarE.h(z16) ? 8388608 : 4194304;
            }
            if ((100663296 & i14) != 0) {
                if (o0VarE.B(str5)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i17 |= i25;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(o0Var)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i17 |= i24;
            }
            if ((i15 & 6) == 0) {
                if (o0VarE.r(lVar)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i15 | i19;
            } else {
                i18 = i15;
            }
            if ((i17 & 306783379) == 306783378 || (i18 & 3) != 2) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i17 & 1, z17)) {
                int i27 = i18;
                if (i26 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                x1 x1Var = p3.n.f135158a;
                o0Var2 = o0VarE;
                da0.p.c(str, str2, aVar, str6, false, null, null, null, null, null, false, str5, o0Var, false, null, null, false, z19, null, lVar, null, null, z3.f.c(-477559163, new e23.q() { // from class: ya0.q
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2;
                        h4.r.a aVar2;
                        j92.e eVar;
                        c2.a0 a0Var = (c2.a0) obj;
                        p3.m mVar3 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        a0Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar3.B(a0Var) ? 4 : 2;
                        }
                        if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            x1 x1Var2 = p3.n.f135158a;
                            qa.f89427a.getClass();
                            x3 x3VarB = s1.f.b(f14, qa.f89431e, null, mVar3, 0, 28);
                            y2 y2Var = y2.f111386a;
                            float fFloatValue = ((Number) x3VarB.getF182175a()).floatValue();
                            h4.r.a aVar3 = h4.r.S;
                            h4.r rVarF = x2.f(o3.c(aVar3, "device_setup_progress_bar"), 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar2 = j92.b.f97899b;
                            y2Var.a(fFloatValue, 0.0f, 0, 0, 124, 0L, 0L, c2.l.C(rVarF, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), mVar2);
                            String str7 = str4;
                            if (str7 == null) {
                                mVar2 = mVar3;
                                mVar2.C(-2032863769);
                                mVar2.f();
                                eVar = eVar2;
                                aVar2 = aVar3;
                            } else {
                                mVar2 = mVar3;
                                mVar2.C(-2032863768);
                                h4.r rVarC = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                aVar2 = aVar3;
                                eVar = eVar2;
                                mh.c(str7, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                mVar2 = mVar2;
                                mVar2.f();
                            }
                            if (z14) {
                                mVar2.C(-2032496573);
                                h4.r.a aVar4 = aVar2;
                                h4.r rVarA = a0Var.a(x2.f(aVar4, 1.0f), 1.0f, true);
                                c2.j.f22691a.getClass();
                                c2.j.c cVar = c2.j.f22696f;
                                h4.d.f81522a.getClass();
                                c2.z zVarA = c2.y.a(cVar, h4.d.a.f81537o, mVar2, 54);
                                int iHashCode = Long.hashCode(mVar2.getU());
                                i2 i2VarX = mVar2.x();
                                h4.r rVarC2 = h4.k.c(rVarA, mVar2);
                                h5.g.V.getClass();
                                h5.e0.a aVar5 = h5.g.a.f81805b;
                                if (mVar2.F() == null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar5);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, zVarA, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                h5.g.a.b bVar = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                                }
                                b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                                c2.b0 b0Var = c2.b0.f22601a;
                                String strQ = gl1.y.Q(mVar2, R.string.msg_notification_bluetooth_bonding);
                                h4.r rVarC3 = c2.l.C(x2.f(aVar4, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar4 = mVar2;
                                mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 0, 0, 130044);
                                s62.a.f157643a.getClass();
                                i7.b(v62.h0.a(t62.b.f162798a), null, x2.q(aVar4, j92.b.f97901d.f97905d), u0.f(mVar4), mVar4, 48, 0);
                                mVar4.y();
                                mVar4.f();
                            } else {
                                mVar2.C(-2031549027);
                                mVar2.f();
                            }
                        } else {
                            mVar3.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0Var2, i17 & 8190, (i17 & 29360128) | ((i17 >> 21) & 1008) | ((i27 << 27) & 1879048192), 3072, 7727088);
                z18 = z19;
            } else {
                o0Var2 = o0VarE;
                o0Var2.e();
                z18 = z16;
            }
            p2VarI0 = o0Var2.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ya0.r
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        int iT2 = p0.t(i15);
                        c0.c(str, str2, aVar, str3, str4, z14, f14, z18, str5, o0Var, lVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 12582912;
        z16 = z15;
        if ((100663296 & i14) != 0) {
            if (o0VarE.B(str5)) {
                i25 = 67108864;
            } else {
                i25 = 33554432;
            }
            i17 |= i25;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(o0Var)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i17 |= i24;
        }
        if ((i15 & 6) == 0) {
            if (o0VarE.r(lVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i15 | i19;
        } else {
            i18 = i15;
        }
        if ((i17 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (o0VarE.n(i17 & 1, z17)) {
            int i28 = i18;
            if (i26 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            x1 x1Var2 = p3.n.f135158a;
            o0Var2 = o0VarE;
            da0.p.c(str, str2, aVar, str6, false, null, null, null, null, null, false, str5, o0Var, false, null, null, false, z19, null, lVar, null, null, z3.f.c(-477559163, new e23.q() { // from class: ya0.q
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2;
                    h4.r.a aVar2;
                    j92.e eVar;
                    c2.a0 a0Var = (c2.a0) obj;
                    p3.m mVar3 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    a0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar3.B(a0Var) ? 4 : 2;
                    }
                    if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var3 = p3.n.f135158a;
                        qa.f89427a.getClass();
                        x3 x3VarB = s1.f.b(f14, qa.f89431e, null, mVar3, 0, 28);
                        y2 y2Var = y2.f111386a;
                        float fFloatValue = ((Number) x3VarB.getF182175a()).floatValue();
                        h4.r.a aVar3 = h4.r.S;
                        h4.r rVarF = x2.f(o3.c(aVar3, "device_setup_progress_bar"), 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        y2Var.a(fFloatValue, 0.0f, 0, 0, 124, 0L, 0L, c2.l.C(rVarF, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), mVar2);
                        String str7 = str4;
                        if (str7 == null) {
                            mVar2 = mVar3;
                            mVar2.C(-2032863769);
                            mVar2.f();
                            eVar = eVar2;
                            aVar2 = aVar3;
                        } else {
                            mVar2 = mVar3;
                            mVar2.C(-2032863768);
                            h4.r rVarC = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                            d92.b.f58624b.getClass();
                            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            d6.h.f57752b.getClass();
                            aVar2 = aVar3;
                            eVar = eVar2;
                            mh.c(str7, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                            mVar2 = mVar2;
                            mVar2.f();
                        }
                        if (z14) {
                            mVar2.C(-2032496573);
                            h4.r.a aVar4 = aVar2;
                            h4.r rVarA = a0Var.a(x2.f(aVar4, 1.0f), 1.0f, true);
                            c2.j.f22691a.getClass();
                            c2.j.c cVar = c2.j.f22696f;
                            h4.d.f81522a.getClass();
                            c2.z zVarA = c2.y.a(cVar, h4.d.a.f81537o, mVar2, 54);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC2 = h4.k.c(rVarA, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar5 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar5);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                            c2.b0 b0Var = c2.b0.f22601a;
                            String strQ = gl1.y.Q(mVar2, R.string.msg_notification_bluetooth_bonding);
                            h4.r rVarC3 = c2.l.C(x2.f(aVar4, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                            d92.b.f58624b.getClass();
                            x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), mVar2);
                            d6.h.f57752b.getClass();
                            p3.m mVar4 = mVar2;
                            mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 0, 0, 130044);
                            s62.a.f157643a.getClass();
                            i7.b(v62.h0.a(t62.b.f162798a), null, x2.q(aVar4, j92.b.f97901d.f97905d), u0.f(mVar4), mVar4, 48, 0);
                            mVar4.y();
                            mVar4.f();
                        } else {
                            mVar2.C(-2031549027);
                            mVar2.f();
                        }
                    } else {
                        mVar3.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var2, i17 & 8190, (i17 & 29360128) | ((i17 >> 21) & 1008) | ((i28 << 27) & 1879048192), 3072, 7727088);
            z18 = z19;
        } else {
            o0Var2 = o0VarE;
            o0Var2.e();
            z18 = z16;
        }
        p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: ya0.r
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    c0.c(str, str2, aVar, str3, str4, z14, f14, z18, str5, o0Var, lVar, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    public static final void d(int i14, e23.a aVar, e23.a aVar2, String str, p3.m mVar, boolean z14) {
        p3.o0 o0Var;
        String strP;
        p3.o0 o0VarE = mVar.E(-1190202480);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(1928118295);
                strP = gl1.y.P(R.string.string_empty_line_string_pattern, new Object[]{gl1.y.P(R.string.msg_previously_paired_device_factory_reset, new Object[]{str, str}, o0VarE), gl1.y.Q(o0VarE, R.string.msg_factory_reset_led_blinking_pattern)}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1928398721);
                strP = gl1.y.P(R.string.msg_previously_paired_device, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            }
            String strJ = z14 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1928527030, R.string.lbl_common_continue, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1928592471, R.string.lbl_connect_device, o0VarE, false);
            String strJ2 = z14 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1928699359, R.string.lbl_cancel, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1928756120, R.string.common_disconnect, o0VarE, false);
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_previously_paired_device);
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z15) {
                objQ = new l(aVar, 1);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l(aVar, 1);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new l(aVar2, 2);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new l(aVar2, 2);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            c1Var.a(false, strQ, strP, null, null, strJ, false, false, aVar4, strJ2, (e23.a) objQ2, o0Var, 6, 0, 216);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x70.f(str, z14, aVar, aVar2, i14);
        }
    }

    public static final void e(String str, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1852412750);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n("");
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_device_setup);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_done);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            z3.e eVarC = z3.f.c(1943309782, new da0.k0(p1Var, str), o0VarE);
            int i16 = i15 & 112;
            boolean z14 = i16 == 32;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new v1(lVar, p1Var, 28);
                o0VarE.K(objQ2);
            }
            e23.a<Unit> aVar = (e23.a) objQ2;
            boolean z15 = i16 == 32;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new ub0.h(lVar, 26);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            c1Var.a(false, strQ, null, eVarC, null, strQ2, false, false, aVar, strQ3, (e23.a) objQ3, o0Var, 3078, 0, 212);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.b(str, lVar, i14, 6);
        }
    }
}
