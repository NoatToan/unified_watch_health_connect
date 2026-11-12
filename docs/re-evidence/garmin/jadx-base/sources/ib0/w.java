package ib0;

import a11.g0;
import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.u1;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.permissions.MultiplePermissionsState;
import com.google.accompanist.permissions.MultiplePermissionsStateKt;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import ho.d0;
import i3.d6;
import i3.e9;
import i3.i7;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.b2;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92512a;

        static {
            int[] iArr = new int[jb0.b.values().length];
            try {
                iArr[jb0.b.f98104d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jb0.b.f98105e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92512a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0183  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    public static final void a(jb0.a aVar, e23.l<? super jb0.b, ? extends i53.c<? extends j22.a>> lVar, e23.l<? super jb0.b, Unit> lVar2, e23.l<? super jb0.b, Unit> lVar3, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        o0 o0VarE = mVar.E(1159133443);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = aVar instanceof jb0.a.C1877a;
            p3.m.a aVar4 = p3.m.f135153a;
            if (z15) {
                o0VarE.C(207788432);
                i53.c<? extends j22.a> cVarInvoke = lVar.invoke(((jb0.a.C1877a) aVar).f98100a);
                g.f fVar = new g.f();
                boolean z16 = ((i15 & 14) == 4) | ((i15 & 7168) == 2048) | ((i15 & 896) == 256);
                Object objQ = o0VarE.q();
                if (z16) {
                    objQ = new gw1.d(lVar3, 17, aVar, lVar2);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gw1.d(lVar3, 17, aVar, lVar2);
                        o0VarE.K(objQ);
                    }
                }
                c.q qVarC = c.w.c(fVar, (e23.l) objQ, o0VarE, 0);
                int i16 = i15 & 458752;
                boolean zR = o0VarE.r(qVarC) | o0VarE.B(cVarInvoke) | (i16 == 131072);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new d6(qVarC, 8, cVarInvoke, aVar3);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new d6(qVarC, 8, cVarInvoke, aVar3);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar5 = (e23.a) objQ2;
                z14 = i16 == 131072;
                Object objQ3 = o0VarE.q();
                if (z14) {
                    objQ3 = new gt1.s(aVar3, 26);
                    o0VarE.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new gt1.s(aVar3, 26);
                        o0VarE.K(objQ3);
                    }
                }
                d.b(cVarInvoke, aVar5, (e23.a) objQ3, o0VarE, 0);
                o0VarE.g0(false);
            } else if (aVar instanceof jb0.a.b) {
                o0VarE.C(208693601);
                i53.c<? extends j22.a> cVarInvoke2 = lVar.invoke(((jb0.a.b) aVar).f98100a);
                j22.b.f96736a.getClass();
                String strH = j22.b.h(cVarInvoke2);
                int i17 = i15 & 458752;
                boolean z17 = ((i15 & 57344) == 16384) | (i17 == 131072);
                Object objQ4 = o0VarE.q();
                if (z17) {
                    objQ4 = new at1.e(aVar3, aVar2, 6);
                    o0VarE.K(objQ4);
                } else {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new at1.e(aVar3, aVar2, 6);
                        o0VarE.K(objQ4);
                    }
                }
                e23.a aVar6 = (e23.a) objQ4;
                z14 = i17 == 131072;
                Object objQ5 = o0VarE.q();
                if (z14) {
                    objQ5 = new gt1.s(aVar3, 27);
                    o0VarE.K(objQ5);
                } else {
                    aVar4.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new gt1.s(aVar3, 27);
                        o0VarE.K(objQ5);
                    }
                }
                d.c(strH, aVar6, (e23.a) objQ5, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(209141520);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(aVar, lVar, lVar2, lVar3, aVar2, aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, g gVar, e23.l lVar, e23.l lVar2, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        g gVar2;
        int i15;
        final g gVar3;
        b0 b0Var;
        mc mcVar;
        a22.l lVar3;
        boolean z14;
        g gVar4;
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-828551016);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | 16 | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar4 = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                boolean z15 = (i16 & 14) == 4;
                Object objQ = o0VarE.q();
                if (z15) {
                    objQ = new a90.c(str, 5);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a90.c(str, 5);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar5 = (e23.a) objQ;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar5);
                o0VarE.g0(false);
                i15 = i16 & (-113);
                gVar3 = (g) u1VarResolveViewModel;
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                gVar3 = gVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            b2 b2Var = gVar3.f92474k;
            v90.c cVar = gVar3.f92466c;
            p1 p1VarC = s9.c.c(b2Var, o0VarE);
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var2 = (b0) objQ2;
            o13.t tVar = gVar3.f92468e;
            gVar3.f92465b.getClass();
            boolean zR = o0VarE.r(gVar3);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                final int i18 = 1;
                objQ3 = new e23.l() { // from class: ib0.l
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                jb0.c cVar2 = (jb0.c) obj;
                                cVar2.getClass();
                                gVar3.A4(cVar2);
                                break;
                            default:
                                gVar3.A4(new jb0.c.C1878c((Uri) obj));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            }
            e23.l lVar4 = (e23.l) objQ3;
            lVar4.getClass();
            g.h hVar = new g.h();
            boolean zB = o0VarE.B("input_uri") | o0VarE.B(lVar4);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new au0.g("input_uri", lVar4, 5);
                o0VarE.K(objQ4);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ4, o0VarE, 0);
            boolean zR2 = o0VarE.r(gVar3) | o0VarE.r(context);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                final int i19 = 1;
                objQ5 = new e23.l() { // from class: ib0.k
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Uri uri = (Uri) obj;
                        switch (i19) {
                            case 0:
                                uri.getClass();
                                break;
                            default:
                                uri.getClass();
                                break;
                        }
                        return gVar3.f92465b.b(context, uri);
                    }
                };
                o0VarE.K(objQ5);
            }
            e23.l lVar5 = (e23.l) objQ5;
            lVar5.getClass();
            qVarC.getClass();
            g.b bVar = new g.b();
            boolean zR3 = o0VarE.r(qVarC) | o0VarE.B(lVar5);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                objQ6 = new hy.h(13, qVarC, lVar5);
                o0VarE.K(objQ6);
            }
            c.q qVarC2 = c.w.c(bVar, (e23.l) objQ6, o0VarE, 0);
            Uri uri = (Uri) tVar.getValue();
            uri.getClass();
            boolean zR4 = o0VarE.r(gVar3) | o0VarE.r(context);
            Object objQ7 = o0VarE.q();
            if (zR4 || objQ7 == c2565a) {
                final int i24 = 0;
                objQ7 = new e23.l() { // from class: ib0.k
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Uri uri2 = (Uri) obj;
                        switch (i24) {
                            case 0:
                                uri2.getClass();
                                break;
                            default:
                                uri2.getClass();
                                break;
                        }
                        return gVar3.f92465b.b(context, uri2);
                    }
                };
                o0VarE.K(objQ7);
            }
            e23.l lVar6 = (e23.l) objQ7;
            lVar6.getClass();
            g.j jVar = new g.j();
            boolean zR5 = o0VarE.r(qVarC) | o0VarE.B(lVar6) | o0VarE.r(uri);
            Object objQ8 = o0VarE.q();
            if (zR5 || objQ8 == c2565a) {
                objQ8 = new gw1.d(qVarC, lVar6, uri, 16);
                o0VarE.K(objQ8);
            }
            c.q qVarC3 = c.w.c(jVar, (e23.l) objQ8, o0VarE, 0);
            if (!mcVarF.e() || ((f) p1VarC.getF182175a()).f92457a.isEmpty()) {
                b0Var = b0Var2;
                mcVar = mcVarF;
                lVar3 = null;
                z14 = true;
                o0VarE.C(-184627766);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-184916066);
                i53.c<String> cVar2 = ((f) p1VarC.getF182175a()).f92457a;
                boolean zR6 = o0VarE.r(gVar3);
                Object objQ9 = o0VarE.q();
                if (zR6 || objQ9 == c2565a) {
                    final int i25 = 0;
                    objQ9 = new e23.l() { // from class: ib0.l
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i25) {
                                case 0:
                                    jb0.c cVar3 = (jb0.c) obj;
                                    cVar3.getClass();
                                    gVar3.A4(cVar3);
                                    break;
                                default:
                                    gVar3.A4(new jb0.c.C1878c((Uri) obj));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ9);
                }
                e23.l lVar7 = (e23.l) objQ9;
                boolean zR7 = o0VarE.r(b0Var2) | o0VarE.B(mcVarF);
                Object objQ10 = o0VarE.q();
                if (zR7 || objQ10 == c2565a) {
                    objQ10 = new cn1.t(b0Var2, mcVarF, 20);
                    o0VarE.K(objQ10);
                }
                e23.a aVar6 = (e23.a) objQ10;
                b0Var = b0Var2;
                mcVar = mcVarF;
                lVar3 = null;
                z14 = true;
                b.a(0, aVar6, lVar7, mcVar, cVar2, o0VarE);
                o0VarE.g0(false);
            }
            jb0.b bVar2 = jb0.b.f98104d;
            r22.getClass();
            i53.f fVarA = v90.c.a(bVar2);
            ArrayList arrayList = new ArrayList(y.r(fVarA, 10));
            Iterator<E> it = fVarA.iterator();
            while (it.hasNext()) {
                arrayList.add(((j22.a) it.next()).f96735b);
            }
            MultiplePermissionsState multiplePermissionsStateRememberMultiplePermissionsState = MultiplePermissionsStateKt.rememberMultiplePermissionsState(arrayList, lVar3, o0VarE, 0, 2);
            boolean zR8 = o0VarE.r(gVar3) | o0VarE.B(multiplePermissionsStateRememberMultiplePermissionsState);
            Object objQ11 = o0VarE.q();
            if (zR8 || objQ11 == p3.m.a.f135155b) {
                objQ11 = new r(gVar3, multiplePermissionsStateRememberMultiplePermissionsState, lVar3);
                o0VarE.K(objQ11);
            }
            l0.e((e23.p) objQ11, multiplePermissionsStateRememberMultiplePermissionsState, o0VarE);
            i53.f fVarA2 = v90.c.a(jb0.b.f98105e);
            ArrayList arrayList2 = new ArrayList(y.r(fVarA2, 10));
            Iterator<E> it3 = fVarA2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((j22.a) it3.next()).f96735b);
            }
            MultiplePermissionsState multiplePermissionsStateRememberMultiplePermissionsState2 = MultiplePermissionsStateKt.rememberMultiplePermissionsState(arrayList2, lVar3, o0VarE, 0, 2);
            boolean zR9 = o0VarE.r(gVar3) | o0VarE.B(multiplePermissionsStateRememberMultiplePermissionsState2);
            Object objQ12 = o0VarE.q();
            if (zR9 || objQ12 == p3.m.a.f135155b) {
                objQ12 = new s(gVar3, multiplePermissionsStateRememberMultiplePermissionsState2, lVar3);
                o0VarE.K(objQ12);
            }
            l0.e((e23.p) objQ12, multiplePermissionsStateRememberMultiplePermissionsState2, o0VarE);
            n0 n0Var = (n0) o0VarE.A(s9.j.f158018a);
            boolean zR10 = o0VarE.r(gVar3) | o0VarE.r(n0Var);
            Object objQ13 = o0VarE.q();
            if (zR10 || objQ13 == p3.m.a.f135155b) {
                objQ13 = new hy.h(12, n0Var, gVar3);
                o0VarE.K(objQ13);
            }
            l0.a(n0Var, (e23.l) objQ13, o0VarE);
            jb0.a aVar7 = ((f) r26.getF182175a()).f92458b;
            boolean zB2 = o0VarE.B(r22);
            Object objQ14 = o0VarE.q();
            if (zB2 || objQ14 == p3.m.a.f135155b) {
                objQ14 = new t(cVar);
                o0VarE.K(objQ14);
            }
            e23.l lVar8 = (e23.l) ((k23.g) objQ14);
            boolean zR11 = o0VarE.r(gVar3);
            Object objQ15 = o0VarE.q();
            if (zR11 || objQ15 == p3.m.a.f135155b) {
                objQ15 = new u(gVar3);
                o0VarE.K(objQ15);
            }
            e23.l lVar9 = (e23.l) ((k23.g) objQ15);
            boolean zR12 = o0VarE.r(qVarC3) | o0VarE.r(r24) | o0VarE.r(qVarC2);
            Object objQ16 = o0VarE.q();
            if (zR12 || objQ16 == p3.m.a.f135155b) {
                objQ16 = new gw1.d(qVarC3, qVarC2, r24, 15);
                o0VarE.K(objQ16);
            }
            e23.l lVar10 = (e23.l) objQ16;
            boolean zR13 = o0VarE.r(gVar3);
            Object objQ17 = o0VarE.q();
            if (zR13 || objQ17 == p3.m.a.f135155b) {
                objQ17 = new o(gVar3);
                o0VarE.K(objQ17);
            }
            mc mcVar2 = mcVar;
            a(aVar7, lVar8, lVar9, lVar10, aVar, (e23.a) ((k23.g) objQ17), o0VarE, 57344 & i15);
            jb0.c cVar3 = ((f) r26.getF182175a()).f92459c;
            long j8 = ((f) r26.getF182175a()).f92462f;
            boolean zR14 = o0VarE.r(b0Var) | o0VarE.B(mcVar2);
            Object objQ18 = o0VarE.q();
            if (zR14 || objQ18 == p3.m.a.f135155b) {
                objQ18 = new cn1.t(b0Var, mcVar2, 21);
                o0VarE.K(objQ18);
            }
            e23.a aVar8 = (e23.a) objQ18;
            boolean zR15 = o0VarE.r(gVar3) | o0VarE.r(qVarC3) | o0VarE.r(r24);
            Object objQ19 = o0VarE.q();
            if (zR15 || objQ19 == p3.m.a.f135155b) {
                objQ19 = new d6(gVar3, 7, qVarC3, tVar);
                o0VarE.K(objQ19);
            }
            e23.a aVar9 = (e23.a) objQ19;
            boolean zR16 = o0VarE.r(gVar3) | o0VarE.r(qVarC2);
            Object objQ20 = o0VarE.q();
            if (zR16 || objQ20 == p3.m.a.f135155b) {
                objQ20 = new i91.c(2, gVar3, qVarC2);
                o0VarE.K(objQ20);
            }
            e23.a aVar10 = (e23.a) objQ20;
            boolean zB3 = o0VarE.B(r26) | o0VarE.r(gVar3) | ((i15 & 896) == 256 ? z14 : false) | ((458752 & i15) == 131072 ? z14 : false);
            Object objQ21 = o0VarE.q();
            if (zB3 || objQ21 == p3.m.a.f135155b) {
                gVar4 = gVar3;
                d0 d0Var = new d0((Object) p1VarC, (Object) gVar4, (Object) lVar, aVar2, 6);
                o0VarE.K(d0Var);
                objQ21 = d0Var;
            } else {
                gVar4 = gVar3;
            }
            c(cVar3, j8, aVar8, aVar9, aVar10, (e23.a) objQ21, lVar2, aVar3, o0VarE, ((i15 << 9) & 3670016) | ((i15 << 3) & 29360128));
            o0VarE = o0VarE;
            x1 x1Var2 = p3.n.f135158a;
            gVar2 = gVar4;
        } else {
            o0VarE.e();
            gVar2 = gVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.l0(str, gVar2, lVar, lVar2, aVar, aVar2, aVar3, i14, 13);
        }
    }

    public static final void c(jb0.c cVar, long j8, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar5, p3.m mVar, int i14) {
        jb0.c cVar2;
        int i15;
        e23.l<? super Float, Unit> lVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(-672602710);
        if ((i14 & 6) == 0) {
            cVar2 = cVar;
            i15 = (o0VarE.B(cVar2) ? 4 : 2) | i14;
        } else {
            cVar2 = cVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar2 = lVar;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar5) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.startup_set_profile_pic);
            String strQ2 = gl1.y.Q(o0VarE, R.string.startup_set_profile_pic_desc);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_next);
            h4.d.f81522a.getClass();
            o0Var = o0VarE;
            da0.p.b("user_profile_picture_screen", strQ, null, strQ2, null, strQ3, aVar4, false, null, null, false, null, null, false, false, aVar5, null, null, null, null, h4.d.a.f81537o, z3.f.c(1689477290, new b82.s0(lVar2, cVar2, j8, aVar, aVar2, aVar3), o0VarE), o0Var, ((i16 << 3) & 3670016) | 6, (i16 >> 6) & 458752, 432, 2064276);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(cVar, j8, aVar, aVar2, aVar3, aVar4, lVar, aVar5, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    public static final void d(t2 t2Var, jb0.b bVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(755659485);
        int i15 = i14 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarA = t2Var.a(aVar2, 1.0f, true);
            d92.b.f58623a.getClass();
            long jB = d92.b.a(o0VarE).d().a().b();
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarE = u1.n.e(rVarA, jB, k2.i.a(8));
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new gt1.s(aVar, 28);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gt1.s(aVar, 28);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22698h, aVar4, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            u4.d dVar = bVar.f98108b;
            int i16 = bVar.f98107a;
            String strQ = gl1.y.Q(o0VarE, i16);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar3.getClass();
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, f14, 0.0f, eVar.f97918c, 5);
            bVar3.getClass();
            i7.b(dVar, strQ, x2.q(rVarC2, j92.b.f97901d.f97905d), am.j.d(o0VarE), o0VarE, 0, 0);
            String strQ2 = gl1.y.Q(o0VarE, i16);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
            bVar3.getClass();
            mh.c(strQ2, c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(t2Var, bVar, aVar, i14, 18);
        }
    }
}
