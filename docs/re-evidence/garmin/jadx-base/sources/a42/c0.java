package a42;

import am.x0;
import am.z0;
import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import b21.d7;
import b21.j0;
import c2.x2;
import ca0.b1;
import ca0.f2;
import ca0.g2;
import ca0.h2;
import ca0.i1;
import ca0.i2;
import ca0.o1;
import ca0.r0;
import ca0.s1;
import ca0.u0;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import i3.d6;
import i3.fe;
import i3.mh;
import java.util.List;
import java.util.Locale;
import lc.m0;
import lc.y;
import o4.m1;
import org.joda.time.DateTime;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.q2;
import sg0.e1;
import sg0.o0;
import sg0.y0;
import w52.v0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f990f;

    public /* synthetic */ c0(fe feVar, lw1.f fVar, m0 m0Var, e23.a aVar, x3 x3Var) {
        this.f985a = 21;
        this.f987c = feVar;
        this.f988d = fVar;
        this.f990f = m0Var;
        this.f986b = aVar;
        this.f989e = x3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        gj0.a aVar;
        u82.d dVar = (u82.d) this.f986b;
        yi0.c cVar = (yi0.c) this.f988d;
        yi0.b bVar = (yi0.b) this.f989e;
        e23.l lVar = (e23.l) this.f987c;
        e23.l lVar2 = (e23.l) this.f990f;
        u82.f fVar = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar);
        if ((iC & 48) == 0) {
            iC |= (iC & 64) == 0 ? mVar.B(fVar) : mVar.r(fVar) ? 32 : 16;
        }
        if (mVar.n(iC & 1, (iC & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            o82.a aVar2 = (o82.a) p13.h0.c0(dVar.b());
            if (aVar2 == null) {
                mVar.C(2104140956);
                mVar.f();
                aVar = null;
            } else {
                mVar.C(2104140957);
                aVar = (gj0.a) ((u82.f) dVar.c(aVar2, mVar).getF182175a()).a();
                mVar.f();
            }
            dj0.i.b(aVar, (gj0.d) fVar.a(), cVar, bVar, lVar, lVar2, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:6:0x0042  */
    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        zs.c cVar = (zs.c) this.f988d;
        m0 m0Var = (m0) this.f989e;
        e23.a aVar = (e23.a) this.f986b;
        e23.l lVar = (e23.l) this.f987c;
        Context context = (Context) this.f990f;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((r1.l) obj).getClass();
        ((lc.v) obj2).getClass();
        x1 x1Var = p3.n.f135158a;
        boolean zR = mVar.r(m0Var) | mVar.B(aVar);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zR) {
            objQ = new dt.b(m0Var, aVar, 0);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new dt.b(m0Var, aVar, 0);
                mVar.K(objQ);
            }
        }
        e23.a aVar3 = (e23.a) objQ;
        boolean zB = mVar.B(lVar);
        Object objQ2 = mVar.q();
        if (zB) {
            objQ2 = new a40.a(lVar, 24);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new a40.a(lVar, 24);
                mVar.K(objQ2);
            }
        }
        e23.a aVar4 = (e23.a) objQ2;
        boolean zR2 = mVar.r(m0Var);
        Object objQ3 = mVar.q();
        if (zR2) {
            objQ3 = new u0(m0Var, 24);
            mVar.K(objQ3);
        } else {
            aVar2.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new u0(m0Var, 24);
                mVar.K(objQ3);
            }
        }
        e23.a aVar5 = (e23.a) objQ3;
        boolean zR3 = mVar.r(context) | mVar.r(cVar);
        Object objQ4 = mVar.q();
        if (zR3) {
            objQ4 = new dt.c(context, cVar, 0);
            mVar.K(objQ4);
        } else {
            aVar2.getClass();
            if (objQ4 == p3.m.a.f135155b) {
                objQ4 = new dt.c(context, cVar, 0);
                mVar.K(objQ4);
            }
        }
        et.q.a(cVar, aVar3, aVar4, aVar5, (e23.a) objQ4, mVar, 0);
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        v0 v0Var = (v0) this.f988d;
        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) this.f989e;
        e23.l lVar = (e23.l) this.f987c;
        e23.a aVar = (e23.a) this.f986b;
        m0 m0Var = (m0) this.f990f;
        lc.v vVar = (lc.v) obj2;
        p3.m mVar = (p3.m) obj3;
        q2.t((Integer) obj4, (r1.l) obj, vVar);
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = Integer.valueOf(((e62.k) lc.w.a(vVar, s0.f105811a.b(e62.k.class))).f63214a);
            mVar.K(objQ);
        }
        int iIntValue = ((Number) objQ).intValue();
        boolean zR = mVar.r(m0Var);
        Object objQ2 = mVar.q();
        if (zR || objQ2 == c2565a) {
            objQ2 = new u0(m0Var, 25);
            mVar.K(objQ2);
        }
        e62.l.a(v0Var, fVar, iIntValue, lVar, aVar, (e23.a) objQ2, mVar, 384);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x003d  */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        i53.f fVar = (i53.f) this.f987c;
        yd1.b bVar = (yd1.b) this.f988d;
        d52.q qVar = (d52.q) this.f989e;
        o82.a aVar = (o82.a) this.f990f;
        e23.a aVar2 = (e23.a) this.f986b;
        u82.f fVar2 = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((c2.t) obj).getClass();
        fVar2.getClass();
        x1 x1Var = p3.n.f135158a;
        boolean zR = mVar.r(qVar);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new d52.j(qVar, 3);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new d52.j(qVar, 3);
                mVar.K(objQ);
            }
        }
        g52.r.b(fVar, bVar, (e23.l) objQ, z3.f.c(1514159148, new g52.p(fVar2, aVar, aVar2, 0), mVar), mVar, 3072);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x007e  */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        p1 p1Var = (p1) this.f987c;
        e23.a aVar = (e23.a) this.f986b;
        k62.k kVar = (k62.k) this.f988d;
        fv0.d dVar = (fv0.d) this.f989e;
        d6 d6Var = (d6) this.f990f;
        p3.m mVar = (p3.m) obj3;
        q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
        x1 x1Var = p3.n.f135158a;
        mVar.L(-1614864554);
        v9.a.f176280a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
        if (viewModelStoreOwnerA == null) {
            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(k62.d.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        k62.d dVar2 = (k62.d) u1VarResolveViewModel;
        T f182175a = p1Var.getF182175a();
        boolean zB = mVar.B(p1Var) | mVar.r(dVar2);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new k62.p(p1Var, dVar2, null);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new k62.p(p1Var, dVar2, null);
                mVar.K(objQ);
            }
        }
        l0.e((e23.p) objQ, f182175a, mVar);
        k62.b.d(dVar2, aVar, kVar, dVar, d6Var, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0054  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) this.f987c;
        dk1.a aVar = (dk1.a) this.f988d;
        m0 m0Var = (m0) this.f989e;
        e23.a aVar2 = (e23.a) this.f986b;
        e23.a aVar3 = (e23.a) this.f990f;
        lc.v vVar = (lc.v) obj2;
        p3.m mVar = (p3.m) obj3;
        q2.t((Integer) obj4, (r1.l) obj, vVar);
        x1 x1Var = p3.n.f135158a;
        boolean zBooleanValue = ((Boolean) p0.c(vVar.a().d(Boolean.FALSE, "connected_app_list_updated"), mVar, 0).getF182175a()).booleanValue();
        boolean zR = mVar.r(m0Var);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new ky0.w(m0Var, 1);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ky0.w(m0Var, 1);
                mVar.K(objQ);
            }
        }
        mk1.f.c(null, str, zBooleanValue, aVar, (e23.l) objQ, aVar2, aVar3, mVar, 0);
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        PreviewCatalogActivity previewCatalogActivity = (PreviewCatalogActivity) this.f987c;
        m0 m0Var = (m0) this.f988d;
        String str = (String) this.f989e;
        e23.a<Unit> aVar = (e23.a) this.f986b;
        m72.i iVar = (m72.i) this.f990f;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        int i14 = PreviewCatalogActivity.f49781a;
        ((r1.l) obj).getClass();
        ((lc.v) obj2).getClass();
        x1 x1Var = p3.n.f135158a;
        previewCatalogActivity.N9(m0Var, str, aVar, iVar.a(), mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:6:0x003d  */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        String strR;
        fe feVar = (fe) this.f987c;
        final lw1.f fVar = (lw1.f) this.f988d;
        final m0 m0Var = (m0) this.f990f;
        e23.a aVar = (e23.a) this.f986b;
        x3 x3Var = (x3) this.f989e;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((r1.l) obj).getClass();
        ((lc.v) obj2).getClass();
        x1 x1Var = p3.n.f135158a;
        fg0.k kVar = ((lw1.a) x3Var.getF182175a()).f115082h;
        final int i14 = 0;
        if (kVar != null) {
            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
            strR = kVar.r(false);
            if (strR == null) {
                strR = "";
            }
        } else {
            strR = "";
        }
        boolean zR = mVar.r(fVar) | mVar.r(m0Var);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zR) {
            objQ = new e23.a() { // from class: nw1.a
                @Override // e23.a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            fVar.B4(true);
                            y.l(m0Var, d.c.INSTANCE);
                            break;
                        default:
                            fVar.B4(false);
                            y.l(m0Var, d.c.INSTANCE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new e23.a() { // from class: nw1.a
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                fVar.B4(true);
                                y.l(m0Var, d.c.INSTANCE);
                                break;
                            default:
                                fVar.B4(false);
                                y.l(m0Var, d.c.INSTANCE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ);
            }
        }
        e23.a aVar3 = (e23.a) objQ;
        boolean zR2 = mVar.r(fVar) | mVar.r(m0Var);
        Object objQ2 = mVar.q();
        if (zR2) {
            final int i15 = 1;
            objQ2 = new e23.a() { // from class: nw1.a
                @Override // e23.a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            fVar.B4(true);
                            y.l(m0Var, d.c.INSTANCE);
                            break;
                        default:
                            fVar.B4(false);
                            y.l(m0Var, d.c.INSTANCE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                final int i16 = 1;
                objQ2 = new e23.a() { // from class: nw1.a
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                fVar.B4(true);
                                y.l(m0Var, d.c.INSTANCE);
                                break;
                            default:
                                fVar.B4(false);
                                y.l(m0Var, d.c.INSTANCE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ2);
            }
        }
        lw1.k.a(strR, feVar, aVar3, (e23.a) objQ2, aVar, mVar, 48);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        yq1.e eVar = (yq1.e) this.f987c;
        n82.f fVar = (n82.f) this.f988d;
        e23.a aVar = (e23.a) this.f986b;
        p1 p1Var = (p1) this.f989e;
        p1 p1Var2 = (p1) this.f990f;
        o82.g gVar = (o82.g) obj;
        o82.a aVar2 = (o82.a) obj2;
        p3.m mVar = (p3.m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar, aVar2);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar2) ? 32 : 16;
        }
        int i15 = i14;
        if (mVar.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = pq1.h.c.f139596a[gVar.ordinal()];
            if (i16 == 1) {
                mVar.C(1134258812);
                u82.e.b(aVar2, eVar.f198807h, null, false, z3.f.c(-1401472789, new c0(fVar, aVar2, eVar, p1Var, p1Var2, 23), mVar), mVar, ((i15 >> 3) & 14) | 24576, 12);
                mVar.f();
            } else if (i16 == 2 || i16 == 3) {
                mVar.C(1134309962);
                u82.e.b(aVar2, eVar.f198808i, null, false, z3.f.c(1436548628, new d52.n(aVar2, gVar, fVar, aVar, 1), mVar), mVar, ((i15 >> 3) & 14) | 24576, 12);
                mVar.f();
            } else if (i16 != 4) {
                mVar.C(1134353143);
                mVar.f();
            } else {
                mVar.C(1134341422);
                xq1.j.a(((yq1.d) p1Var2.getF182175a()).f198793c, eVar, aVar2, fVar, aVar, mVar, (i15 << 3) & 896);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        n82.f fVar = (n82.f) this.f986b;
        o82.a aVar = (o82.a) this.f987c;
        yq1.e eVar = (yq1.e) this.f988d;
        p1 p1Var = (p1) this.f989e;
        p1 p1Var2 = (p1) this.f990f;
        u82.f fVar2 = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((c2.t) obj).getClass();
        fVar2.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= (iIntValue & 64) == 0 ? mVar.B(fVar2) : mVar.r(fVar2) ? 32 : 16;
        }
        int i14 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = mVar.B(fVar) | mVar.B(aVar) | mVar.r(eVar);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new pq1.h.b(fVar, aVar, eVar, null);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new pq1.h.b(fVar, aVar, eVar, null);
                    mVar.K(objQ);
                }
            }
            int i15 = jq1.g.f100008e;
            l0.e((e23.p) objQ, fVar2, mVar);
            jq1.g gVar = (jq1.g) fVar2.a();
            DateTime dateTimeK = vb.h.k(aVar.f130843a);
            tf0.i iVar = eVar.f198805f;
            boolean z14 = ((yq1.d) p1Var2.getF182175a()).f198796f;
            boolean zR = mVar.r(eVar);
            Object objQ2 = mVar.q();
            if (zR) {
                objQ2 = new pq1.g(eVar, 0);
                mVar.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new pq1.g(eVar, 0);
                    mVar.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            boolean zR2 = mVar.r(eVar);
            Object objQ3 = mVar.q();
            if (zR2) {
                objQ3 = new pq1.g(eVar, 1);
                mVar.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new pq1.g(eVar, 1);
                    mVar.K(objQ3);
                }
            }
            e23.l lVar2 = (e23.l) objQ3;
            boolean zR3 = mVar.r(eVar);
            Object objQ4 = mVar.q();
            if (zR3) {
                objQ4 = new pq1.g(eVar, 2);
                mVar.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new pq1.g(eVar, 2);
                    mVar.K(objQ4);
                }
            }
            e23.l lVar3 = (e23.l) objQ4;
            boolean zB2 = mVar.B(p1Var);
            Object objQ5 = mVar.q();
            if (zB2) {
                objQ5 = new pp.b(p1Var, i14);
                mVar.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new pp.b(p1Var, i14);
                    mVar.K(objQ5);
                }
            }
            sq1.c.a(gVar, dateTimeK, z14, lVar, iVar, lVar2, lVar3, (e23.l) objQ5, mVar, i15 | (tf0.i.f164439d << 12));
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        final q42.y yVar = (q42.y) this.f986b;
        final n82.f fVar = (n82.f) this.f987c;
        q42.d0 d0Var = (q42.d0) this.f988d;
        Context context = (Context) this.f989e;
        c.q qVar = (c.q) this.f990f;
        o82.g gVar = (o82.g) obj;
        final o82.a aVar = (o82.a) obj2;
        p3.m mVar = (p3.m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar, aVar);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar) ? 32 : 16;
        }
        int i15 = i14;
        final int i16 = 0;
        final int i17 = 1;
        if (mVar.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i18 = q42.x.h.f142743a[gVar.ordinal()];
            if (i18 == 1) {
                mVar.C(-1397845832);
                u82.e.b(aVar, yVar.f142758n, null, false, z3.f.c(1712114407, new aa2.q(fVar, aVar, yVar, d0Var, context, qVar, 10), mVar), mVar, ((i15 >> 3) & 14) | 24576, 12);
                mVar.f();
            } else if (i18 == 2 || i18 == 3) {
                mVar.C(-1396447918);
                u82.e.b(aVar, yVar.f142759o, u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), false, z3.f.c(997007824, new e23.r() { // from class: q42.t
                    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
                    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
                    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
                    /* JADX WARN: Code duplicated, block: B:74:0x0171  */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i19 = i16;
                        boolean z14 = true;
                        p3.m.a aVar2 = p3.m.f135153a;
                        switch (i19) {
                            case 0:
                                u82.f fVar2 = (u82.f) obj6;
                                p3.m mVar2 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                ((c2.t) obj5).getClass();
                                fVar2.getClass();
                                if ((iIntValue & 48) == 0) {
                                    iIntValue |= (iIntValue & 64) == 0 ? mVar2.B(fVar2) : mVar2.r(fVar2) ? 32 : 16;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    n82.f fVar3 = fVar;
                                    boolean zB = mVar2.B(fVar3);
                                    o82.a aVar3 = aVar;
                                    boolean zB2 = zB | mVar2.B(aVar3);
                                    y yVar2 = yVar;
                                    boolean zR = zB2 | mVar2.r(yVar2);
                                    if ((iIntValue & 112) != 32 && ((iIntValue & 64) == 0 || !mVar2.r(fVar2))) {
                                        z14 = false;
                                    }
                                    boolean z15 = zR | z14;
                                    Object objQ = mVar2.q();
                                    if (z15) {
                                        x.e eVar = new x.e(fVar3, aVar3, yVar2, fVar2, null);
                                        mVar2.K(eVar);
                                        objQ = eVar;
                                    } else {
                                        aVar2.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            x.e eVar2 = new x.e(fVar3, aVar3, yVar2, fVar2, null);
                                            mVar2.K(eVar2);
                                            objQ = eVar2;
                                        }
                                    }
                                    Parcelable.Creator<l42.k> creator = l42.k.CREATOR;
                                    l0.e((e23.p) objQ, fVar2, mVar2);
                                    DateTime dateTimeK = vb.h.k(aVar3.f130843a);
                                    DateTime dateTimeK2 = vb.h.k(aVar3.f130844b);
                                    boolean zB3 = mVar2.B(fVar3);
                                    Object objQ2 = mVar2.q();
                                    if (zB3) {
                                        objQ2 = new d52.k(fVar3, 15);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new d52.k(fVar3, 15);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    t42.j.b(yVar2, dateTimeK, dateTimeK2, (e23.l) objQ2, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                u82.f fVar4 = (u82.f) obj6;
                                p3.m mVar3 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((c2.t) obj5).getClass();
                                fVar4.getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= (iIntValue2 & 64) == 0 ? mVar3.B(fVar4) : mVar3.r(fVar4) ? 32 : 16;
                                }
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    n82.f fVar5 = fVar;
                                    boolean zB4 = mVar3.B(fVar5);
                                    o82.a aVar4 = aVar;
                                    boolean zB5 = zB4 | mVar3.B(aVar4);
                                    y yVar3 = yVar;
                                    boolean zR2 = zB5 | mVar3.r(yVar3);
                                    if ((iIntValue2 & 112) != 32 && ((iIntValue2 & 64) == 0 || !mVar3.r(fVar4))) {
                                        z14 = false;
                                    }
                                    boolean z16 = zR2 | z14;
                                    Object objQ3 = mVar3.q();
                                    if (z16) {
                                        x.f fVar6 = new x.f(fVar5, aVar4, yVar3, fVar4, null);
                                        mVar3.K(fVar6);
                                        objQ3 = fVar6;
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            x.f fVar7 = new x.f(fVar5, aVar4, yVar3, fVar4, null);
                                            mVar3.K(fVar7);
                                            objQ3 = fVar7;
                                        }
                                    }
                                    Parcelable.Creator<l42.e> creator2 = l42.e.CREATOR;
                                    l0.e((e23.p) objQ3, fVar4, mVar3);
                                    DateTime dateTimeK3 = vb.h.k(aVar4.f130843a);
                                    DateTime dateTimeK4 = vb.h.k(aVar4.f130844b);
                                    boolean zB6 = mVar3.B(fVar5);
                                    Object objQ4 = mVar3.q();
                                    if (zB6) {
                                        objQ4 = new d52.k(fVar5, 16);
                                        mVar3.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new d52.k(fVar5, 16);
                                            mVar3.K(objQ4);
                                        }
                                    }
                                    t42.t.b(yVar3, dateTimeK3, dateTimeK4, (e23.l) objQ4, mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar), mVar, ((i15 >> 3) & 14) | 24576, 8);
                mVar.f();
            } else if (i18 != 4) {
                mVar.C(-1014792109);
                mVar.f();
            } else {
                mVar.C(-1395083794);
                u82.e.b(aVar, yVar.f142760p, u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), false, z3.f.c(-293643985, new e23.r() { // from class: q42.t
                    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
                    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
                    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
                    /* JADX WARN: Code duplicated, block: B:74:0x0171  */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i19 = i17;
                        boolean z14 = true;
                        p3.m.a aVar2 = p3.m.f135153a;
                        switch (i19) {
                            case 0:
                                u82.f fVar2 = (u82.f) obj6;
                                p3.m mVar2 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                ((c2.t) obj5).getClass();
                                fVar2.getClass();
                                if ((iIntValue & 48) == 0) {
                                    iIntValue |= (iIntValue & 64) == 0 ? mVar2.B(fVar2) : mVar2.r(fVar2) ? 32 : 16;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    n82.f fVar3 = fVar;
                                    boolean zB = mVar2.B(fVar3);
                                    o82.a aVar3 = aVar;
                                    boolean zB2 = zB | mVar2.B(aVar3);
                                    y yVar2 = yVar;
                                    boolean zR = zB2 | mVar2.r(yVar2);
                                    if ((iIntValue & 112) != 32 && ((iIntValue & 64) == 0 || !mVar2.r(fVar2))) {
                                        z14 = false;
                                    }
                                    boolean z15 = zR | z14;
                                    Object objQ = mVar2.q();
                                    if (z15) {
                                        x.e eVar2 = new x.e(fVar3, aVar3, yVar2, fVar2, null);
                                        mVar2.K(eVar2);
                                        objQ = eVar2;
                                    } else {
                                        aVar2.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            x.e eVar3 = new x.e(fVar3, aVar3, yVar2, fVar2, null);
                                            mVar2.K(eVar3);
                                            objQ = eVar3;
                                        }
                                    }
                                    Parcelable.Creator<l42.k> creator = l42.k.CREATOR;
                                    l0.e((e23.p) objQ, fVar2, mVar2);
                                    DateTime dateTimeK = vb.h.k(aVar3.f130843a);
                                    DateTime dateTimeK2 = vb.h.k(aVar3.f130844b);
                                    boolean zB3 = mVar2.B(fVar3);
                                    Object objQ2 = mVar2.q();
                                    if (zB3) {
                                        objQ2 = new d52.k(fVar3, 15);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new d52.k(fVar3, 15);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    t42.j.b(yVar2, dateTimeK, dateTimeK2, (e23.l) objQ2, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                u82.f fVar4 = (u82.f) obj6;
                                p3.m mVar3 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((c2.t) obj5).getClass();
                                fVar4.getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= (iIntValue2 & 64) == 0 ? mVar3.B(fVar4) : mVar3.r(fVar4) ? 32 : 16;
                                }
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    n82.f fVar5 = fVar;
                                    boolean zB4 = mVar3.B(fVar5);
                                    o82.a aVar4 = aVar;
                                    boolean zB5 = zB4 | mVar3.B(aVar4);
                                    y yVar3 = yVar;
                                    boolean zR2 = zB5 | mVar3.r(yVar3);
                                    if ((iIntValue2 & 112) != 32 && ((iIntValue2 & 64) == 0 || !mVar3.r(fVar4))) {
                                        z14 = false;
                                    }
                                    boolean z16 = zR2 | z14;
                                    Object objQ3 = mVar3.q();
                                    if (z16) {
                                        x.f fVar7 = new x.f(fVar5, aVar4, yVar3, fVar4, null);
                                        mVar3.K(fVar7);
                                        objQ3 = fVar7;
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            x.f fVar8 = new x.f(fVar5, aVar4, yVar3, fVar4, null);
                                            mVar3.K(fVar8);
                                            objQ3 = fVar8;
                                        }
                                    }
                                    Parcelable.Creator<l42.e> creator2 = l42.e.CREATOR;
                                    l0.e((e23.p) objQ3, fVar4, mVar3);
                                    DateTime dateTimeK3 = vb.h.k(aVar4.f130843a);
                                    DateTime dateTimeK4 = vb.h.k(aVar4.f130844b);
                                    boolean zB6 = mVar3.B(fVar5);
                                    Object objQ4 = mVar3.q();
                                    if (zB6) {
                                        objQ4 = new d52.k(fVar5, 16);
                                        mVar3.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new d52.k(fVar5, 16);
                                            mVar3.K(objQ4);
                                        }
                                    }
                                    t42.t.b(yVar3, dateTimeK3, dateTimeK4, (e23.l) objQ4, mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar), mVar, ((i15 >> 3) & 14) | 24576, 8);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007e  */
    /* JADX WARN: Code duplicated, block: B:6:0x004e  */
    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        n82.f fVar = (n82.f) this.f986b;
        o82.a aVar = (o82.a) this.f987c;
        qw.g gVar = (qw.g) this.f988d;
        Context context = (Context) this.f989e;
        c.q qVar = (c.q) this.f990f;
        u82.f fVar2 = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).intValue();
        ((c2.t) obj).getClass();
        fVar2.getClass();
        x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(fVar) | mVar.B(aVar) | mVar.r(gVar) | mVar.r(fVar2);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zB) {
            qw.f.b bVar = new qw.f.b(fVar, aVar, gVar, fVar2, null);
            mVar.K(bVar);
            objQ = bVar;
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                qw.f.b bVar2 = new qw.f.b(fVar, aVar, gVar, fVar2, null);
                mVar.K(bVar2);
                objQ = bVar2;
            }
        }
        l0.e((e23.p) objQ, fVar2, mVar);
        kw.p pVar = (kw.p) fVar2.a();
        boolean zR = mVar.r(context) | mVar.B(fVar) | mVar.r(qVar);
        Object objQ2 = mVar.q();
        if (zR) {
            objQ2 = new q42.u(context, fVar, qVar, 1);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new q42.u(context, fVar, qVar, 1);
                mVar.K(objQ2);
            }
        }
        tw.a.a(gVar, pVar, (e23.a) objQ2, mVar, 0);
        return Unit.INSTANCE;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        o82.g gVar = (o82.g) this.f987c;
        b63.o oVarD = (b63.o) this.f988d;
        np.c cVar = (np.c) this.f989e;
        rp.c cVar2 = (rp.c) this.f990f;
        e23.a aVar = (e23.a) this.f986b;
        p3.m mVar = (p3.m) obj3;
        q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
        x1 x1Var = p3.n.f135158a;
        if (gVar == null) {
            gVar = o82.g.f130851d;
        }
        o82.g gVar2 = gVar;
        if (oVarD == null) {
            oVarD = g22.l.d(b63.o.INSTANCE);
        }
        np.g.a(cVar, new sp.a(new n82.f.a(gVar2, null, oVarD, 2, null), i53.a.a(o82.g.f130851d, o82.g.f130853f, o82.g.f130859l)), cVar2, aVar, mVar, 64);
        return Unit.INSTANCE;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
        x1 x1Var = p3.n.f135158a;
        y0.d((e1) this.f986b, (rk0.y) this.f987c, (o0) this.f988d, (nw0.n) this.f989e, (o0) this.f990f, (p3.m) obj3, 0);
        return Unit.INSTANCE;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        u82.d dVar = (u82.d) this.f988d;
        n82.f fVar = (n82.f) this.f989e;
        e23.l lVar = (e23.l) this.f987c;
        e23.l lVar2 = (e23.l) this.f990f;
        e23.a aVar = (e23.a) this.f986b;
        o82.a aVar2 = (o82.a) obj2;
        p3.m mVar = (p3.m) obj3;
        int iD = vb.h.d((Integer) obj4, (o82.g) obj, aVar2);
        if ((iD & 48) == 0) {
            iD |= mVar.B(aVar2) ? 32 : 16;
        }
        if (mVar.n(iD & 1, (iD & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            u82.e.b(aVar2, dVar, null, false, z3.f.c(122822930, new c0((Object) fVar, (Object) aVar2, lVar, lVar2, aVar, 29), mVar), mVar, ((iD >> 3) & 14) | 24576, 12);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x031d  */
    /* JADX WARN: Code duplicated, block: B:145:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0359  */
    /* JADX WARN: Code duplicated, block: B:155:0x0376  */
    /* JADX WARN: Code duplicated, block: B:217:0x0594  */
    /* JADX WARN: Code duplicated, block: B:225:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:230:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:236:0x063e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:241:0x065d  */
    /* JADX WARN: Code duplicated, block: B:249:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:258:0x0706  */
    /* JADX WARN: Code duplicated, block: B:263:0x0725  */
    /* JADX WARN: Code duplicated, block: B:270:0x077a  */
    /* JADX WARN: Code duplicated, block: B:278:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:283:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:288:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:293:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:298:0x081c  */
    /* JADX WARN: Code duplicated, block: B:305:0x0888  */
    /* JADX WARN: Code duplicated, block: B:310:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:315:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:320:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:325:0x0904  */
    /* JADX WARN: Code duplicated, block: B:330:0x0931  */
    /* JADX WARN: Code duplicated, block: B:337:0x099f  */
    /* JADX WARN: Code duplicated, block: B:342:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:347:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:354:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:364:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:400:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        p3.m mVar;
        Object obj5;
        List<sd2.f> list;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        int i14;
        int i15;
        int i16 = this.f985a;
        int i17 = 12;
        int i18 = 3;
        List<sd2.f> list2 = null;
        p3.m.a aVar = p3.m.f135153a;
        Object obj21 = this.f986b;
        Object obj22 = this.f990f;
        Object obj23 = this.f987c;
        Object obj24 = this.f989e;
        Object obj25 = this.f988d;
        boolean z14 = true;
        z = true;
        boolean z15 = true;
        boolean z16 = false;
        switch (i16) {
            case 0:
                e23.a aVar2 = (e23.a) obj21;
                e23.l lVar = (e23.l) obj23;
                ky0.w wVar = (ky0.w) obj25;
                x3 x3Var = (x3) obj24;
                x3 x3Var2 = (x3) obj22;
                u82.f fVar = (u82.f) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar2.B(fVar) : mVar2.r(fVar) ? 32 : 16;
                }
                if (mVar2.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var = p3.n.f135158a;
                    d42.b bVar = (d42.b) fVar.a();
                    q71.e eVar = (q71.e) x3Var.getF182175a();
                    if (((e42.a) x3Var2.getF182175a()) instanceof e42.a.c) {
                        e42.a aVar3 = (e42.a) x3Var2.getF182175a();
                        aVar3.getClass();
                        list2 = ((e42.a.c) aVar3).f62873a;
                    }
                    h.a(bVar, eVar, list2, aVar2, lVar, wVar, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                List list3 = (List) obj21;
                am.y0 y0Var = (am.y0) obj23;
                String str = (String) obj25;
                gr.a aVar4 = (gr.a) obj24;
                gr.b bVar2 = (gr.b) obj22;
                int iIntValue = ((Integer) obj2).intValue();
                p3.m mVar3 = (p3.m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= mVar3.k(iIntValue) ? 32 : 16;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var = (x0) list3.get(iIntValue);
                    x0 x0Var2 = iIntValue > 0 ? (x0) list3.get(iIntValue - 1) : null;
                    x0 x0Var3 = x0.f4304m;
                    if (y0Var.l(x0Var2, x0Var3) == y0Var.l(x0Var, x0Var3) || !d53.w.J(str)) {
                        mVar = mVar3;
                        mVar.C(128156480);
                        mVar.f();
                    } else {
                        mVar3.C(127684629);
                        String upperCase = gl1.d.T(z0.g(x0Var).f4360c, mVar3, 0).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97917b;
                        float f15 = eVar2.f97920e;
                        h4.r rVarB = c2.l.B(rVarF, f15, f15, f15, f14);
                        d92.b.f58624b.getClass();
                        mh.c(upperCase, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar3), mVar3, 0, 0, 131068);
                        mVar = mVar3;
                        mVar.f();
                    }
                    z14 = x0Var == aVar4.f78516c;
                    boolean zR = mVar.r(bVar2) | mVar.k(x0Var.ordinal());
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new a11.n(27, bVar2, x0Var);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a11.n(27, bVar2, x0Var);
                            mVar.K(objQ);
                        }
                    }
                    am.p1.a(x0Var, z14, (e23.a) objQ, mVar, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                c42.b bVar3 = (c42.b) obj23;
                c42.o oVar = (c42.o) obj25;
                c42.p pVar = (c42.p) obj24;
                e23.a aVar5 = (e23.a) obj21;
                lc.y yVar = (lc.y) obj22;
                lc.v vVar = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar.getClass();
                x1 x1Var3 = p3.n.f135158a;
                boolean zB = mVar4.B(vVar);
                Object objQ2 = mVar4.q();
                if (zB) {
                    obj5 = objQ2;
                    lc.v vVarC = yVar.c(s0.f105811a.b(c42.n.c.class));
                    mVar4.K(vVarC);
                    obj5 = vVarC;
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        obj5 = objQ2;
                        lc.v vVarC2 = yVar.c(s0.f105811a.b(c42.n.c.class));
                        mVar4.K(vVarC2);
                        obj5 = vVarC2;
                    }
                }
                obj5 = objQ2;
                lc.v vVar2 = (lc.v) obj5;
                if (bVar3 == null || (list = bVar3.f24352a) == null) {
                    list = ((c42.n.c) lc.w.a(vVar2, s0.f105811a.b(c42.n.c.class))).f24420a.f24352a;
                }
                boolean zR2 = mVar4.r(list);
                Object objQ3 = mVar4.q();
                if (zR2) {
                    obj6 = objQ3;
                    ad.b bVar4 = new ad.b(list, 1);
                    mVar4.K(bVar4);
                    obj6 = bVar4;
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        obj6 = objQ3;
                        ad.b bVar5 = new ad.b(list, 1);
                        mVar4.K(bVar5);
                        obj6 = bVar5;
                    }
                }
                obj6 = objQ3;
                e23.a aVar6 = (e23.a) obj6;
                mVar4.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar4);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(c42.l.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar6);
                mVar4.R();
                c42.j.a((c42.l) u1VarResolveViewModel, oVar, pVar, aVar5, mVar4, 0);
                return Unit.INSTANCE;
            case 3:
                m0 m0Var = (m0) obj21;
                o1 o1Var = (o1) obj25;
                c50.f fVar2 = (c50.f) obj24;
                u0 u0Var = (u0) obj22;
                e23.l lVar2 = (e23.l) obj23;
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar3.getClass();
                x1 x1Var4 = p3.n.f135158a;
                b1.b bVar6 = (b1.b) lc.w.a(vVar3, s0.f105811a.b(b1.b.class));
                ta0.x xVarA = ca0.y0.a(vVar3, m0Var, mVar5);
                boolean zR3 = mVar5.r(xVarA) | mVar5.r(m0Var);
                Object objQ4 = mVar5.q();
                if (zR3) {
                    obj7 = objQ4;
                    ca0.m0 m0Var2 = new ca0.m0(xVarA, m0Var, 0);
                    mVar5.K(m0Var2);
                    obj7 = m0Var2;
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        obj7 = objQ4;
                        ca0.m0 m0Var3 = new ca0.m0(xVarA, m0Var, 0);
                        mVar5.K(m0Var3);
                        obj7 = m0Var3;
                    }
                }
                obj7 = objQ4;
                c.w.a(0, 1, (e23.a) obj7, mVar5, false);
                l90.k kVar = bVar6.f26088a;
                boolean zB2 = mVar5.B(fVar2) | mVar5.r(xVarA);
                Object objQ5 = mVar5.q();
                if (zB2) {
                    obj8 = objQ5;
                    ca0.l0 l0Var = new ca0.l0(fVar2, xVarA, 1);
                    mVar5.K(l0Var);
                    obj8 = l0Var;
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        obj8 = objQ5;
                        ca0.l0 l0Var2 = new ca0.l0(fVar2, xVarA, 1);
                        mVar5.K(l0Var2);
                        obj8 = l0Var2;
                    }
                }
                obj8 = objQ5;
                e23.l lVar3 = (e23.l) obj8;
                boolean zR4 = mVar5.r(m0Var);
                Object objQ6 = mVar5.q();
                if (zR4) {
                    obj9 = objQ6;
                    d7 d7Var = new d7(m0Var, i18);
                    mVar5.K(d7Var);
                    obj9 = d7Var;
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        obj9 = objQ6;
                        d7 d7Var2 = new d7(m0Var, i18);
                        mVar5.K(d7Var2);
                        obj9 = d7Var2;
                    }
                }
                obj9 = objQ6;
                ta0.q.b(xVarA, o1Var, kVar, lVar3, (e23.l) obj9, u0Var, lVar2, mVar5, 0);
                return Unit.INSTANCE;
            case 4:
                final o1 o1Var2 = (o1) obj23;
                final u0 u0Var2 = (u0) obj25;
                final e23.a aVar7 = (e23.a) obj21;
                m0 m0Var4 = (m0) obj24;
                c42.c0 c0Var = (c42.c0) obj22;
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar6 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar4.getClass();
                x1 x1Var5 = p3.n.f135158a;
                Context context = (Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b);
                ta0.x xVarA2 = ca0.y0.a(vVar4, m0Var4, mVar6);
                boolean zK = mVar6.k(o1Var2.ordinal()) | mVar6.B(u0Var2) | mVar6.B(aVar7);
                Object objQ7 = mVar6.q();
                if (zK) {
                    obj10 = objQ7;
                    final int i19 = z16 ? 1 : 0;
                    e23.a aVar8 = new e23.a() { // from class: ca0.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    int i24 = y0.a.f26538a[o1Var2.ordinal()];
                                    if (i24 == 1 || i24 == 2) {
                                        u0Var2.invoke();
                                    } else {
                                        aVar7.invoke();
                                    }
                                    break;
                                default:
                                    int i25 = y0.a.f26538a[o1Var2.ordinal()];
                                    if (i25 == 1 || i25 == 2) {
                                        u0Var2.invoke();
                                    } else {
                                        aVar7.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar6.K(aVar8);
                    obj10 = aVar8;
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        obj10 = objQ7;
                        final int i110 = z16 ? 1 : 0;
                        e23.a aVar9 = new e23.a() { // from class: ca0.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i110) {
                                    case 0:
                                        int i24 = y0.a.f26538a[o1Var2.ordinal()];
                                        if (i24 == 1 || i24 == 2) {
                                            u0Var2.invoke();
                                        } else {
                                            aVar7.invoke();
                                        }
                                        break;
                                    default:
                                        int i25 = y0.a.f26538a[o1Var2.ordinal()];
                                        if (i25 == 1 || i25 == 2) {
                                            u0Var2.invoke();
                                        } else {
                                            aVar7.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(aVar9);
                        obj10 = aVar9;
                    }
                }
                obj10 = objQ7;
                c.w.a(0, 1, (e23.a) obj10, mVar6, false);
                boolean zR5 = mVar6.r(m0Var4);
                Object objQ8 = mVar6.q();
                if (zR5) {
                    obj11 = objQ8;
                    d7 d7Var3 = new d7(m0Var4, 4);
                    mVar6.K(d7Var3);
                    obj11 = d7Var3;
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        obj11 = objQ8;
                        d7 d7Var4 = new d7(m0Var4, 4);
                        mVar6.K(d7Var4);
                        obj11 = d7Var4;
                    }
                }
                obj11 = objQ8;
                e23.l lVar4 = (e23.l) obj11;
                boolean zR6 = mVar6.r(m0Var4);
                Object objQ9 = mVar6.q();
                if (zR6) {
                    obj12 = objQ9;
                    d7 d7Var5 = new d7(m0Var4, 5);
                    mVar6.K(d7Var5);
                    obj12 = d7Var5;
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        obj12 = objQ9;
                        d7 d7Var6 = new d7(m0Var4, 5);
                        mVar6.K(d7Var6);
                        obj12 = d7Var6;
                    }
                }
                obj12 = objQ9;
                e23.l lVar5 = (e23.l) obj12;
                boolean zB3 = mVar6.B(c0Var) | mVar6.r(context);
                Object objQ10 = mVar6.q();
                if (zB3) {
                    obj13 = objQ10;
                    r0 r0Var = new r0(c0Var, context, 0);
                    mVar6.K(r0Var);
                    obj13 = r0Var;
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        obj13 = objQ10;
                        r0 r0Var2 = new r0(c0Var, context, 0);
                        mVar6.K(r0Var2);
                        obj13 = r0Var2;
                    }
                }
                obj13 = objQ10;
                e23.l lVar6 = (e23.l) obj13;
                boolean zR7 = mVar6.r(m0Var4);
                Object objQ11 = mVar6.q();
                if (zR7) {
                    obj14 = objQ11;
                    aa2.m mVar7 = new aa2.m(m0Var4, 25);
                    mVar6.K(mVar7);
                    obj14 = mVar7;
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        obj14 = objQ11;
                        aa2.m mVar8 = new aa2.m(m0Var4, 25);
                        mVar6.K(mVar8);
                        obj14 = mVar8;
                    }
                }
                obj14 = objQ11;
                e23.a aVar10 = (e23.a) obj14;
                boolean zK2 = mVar6.k(o1Var2.ordinal()) | mVar6.B(u0Var2) | mVar6.B(aVar7);
                Object objQ12 = mVar6.q();
                if (zK2) {
                    obj15 = objQ12;
                    final int i24 = z14 ? 1 : 0;
                    e23.a aVar11 = new e23.a() { // from class: ca0.q0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    int i25 = y0.a.f26538a[o1Var2.ordinal()];
                                    if (i25 == 1 || i25 == 2) {
                                        u0Var2.invoke();
                                    } else {
                                        aVar7.invoke();
                                    }
                                    break;
                                default:
                                    int i26 = y0.a.f26538a[o1Var2.ordinal()];
                                    if (i26 == 1 || i26 == 2) {
                                        u0Var2.invoke();
                                    } else {
                                        aVar7.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar6.K(aVar11);
                    obj15 = aVar11;
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        obj15 = objQ12;
                        final int i25 = z14 ? 1 : 0;
                        e23.a aVar12 = new e23.a() { // from class: ca0.q0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        int i26 = y0.a.f26538a[o1Var2.ordinal()];
                                        if (i26 == 1 || i26 == 2) {
                                            u0Var2.invoke();
                                        } else {
                                            aVar7.invoke();
                                        }
                                        break;
                                    default:
                                        int i27 = y0.a.f26538a[o1Var2.ordinal()];
                                        if (i27 == 1 || i27 == 2) {
                                            u0Var2.invoke();
                                        } else {
                                            aVar7.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(aVar12);
                        obj15 = aVar12;
                    }
                }
                obj15 = objQ12;
                ta0.e1.a(xVarA2, lVar4, lVar5, lVar6, aVar10, (e23.a) obj15, u0Var2, mVar6, 0);
                return Unit.INSTANCE;
            case 5:
                ca0.o0 o0Var = (ca0.o0) obj21;
                d7 d7Var7 = (d7) obj25;
                m0 m0Var5 = (m0) obj24;
                e23.l lVar7 = (e23.l) obj23;
                s1 s1Var = (s1) obj22;
                lc.v vVar5 = (lc.v) obj2;
                p3.m mVar9 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar5.getClass();
                x1 x1Var6 = p3.n.f135158a;
                boolean zB4 = mVar9.B(o0Var);
                Object objQ13 = mVar9.q();
                if (zB4) {
                    objQ13 = new i1(o0Var, 1);
                    mVar9.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new i1(o0Var, 1);
                        mVar9.K(objQ13);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ13, mVar9, false);
                ya0.c cVarA = ca0.m1.a(vVar5, s1Var, m0Var5, mVar9);
                if (cVarA == null) {
                    o0Var.invoke();
                    return Unit.INSTANCE;
                }
                boolean zB5 = mVar9.B(d7Var7) | mVar9.r(m0Var5);
                Object objQ14 = mVar9.q();
                if (zB5) {
                    objQ14 = new c42.c0(8, d7Var7, m0Var5);
                    mVar9.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new c42.c0(8, d7Var7, m0Var5);
                        mVar9.K(objQ14);
                    }
                }
                e23.p pVar2 = (e23.p) objQ14;
                boolean zR8 = mVar9.r(m0Var5);
                Object objQ15 = mVar9.q();
                if (zR8) {
                    objQ15 = new d7(m0Var5, 11);
                    mVar9.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new d7(m0Var5, 11);
                        mVar9.K(objQ15);
                    }
                }
                e23.l lVar8 = (e23.l) objQ15;
                boolean zR9 = mVar9.r(m0Var5);
                Object objQ16 = mVar9.q();
                if (zR9) {
                    objQ16 = new d7(m0Var5, i17);
                    mVar9.K(objQ16);
                } else {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new d7(m0Var5, i17);
                        mVar9.K(objQ16);
                    }
                }
                e23.l lVar9 = (e23.l) objQ16;
                boolean zR10 = mVar9.r(m0Var5);
                Object objQ17 = mVar9.q();
                if (zR10) {
                    objQ17 = new j0(m0Var5, 9);
                    mVar9.K(objQ17);
                } else {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        objQ17 = new j0(m0Var5, 9);
                        mVar9.K(objQ17);
                    }
                }
                e23.p pVar3 = (e23.p) objQ17;
                boolean zR11 = mVar9.r(m0Var5);
                Object objQ18 = mVar9.q();
                if (zR11) {
                    objQ18 = new d7(m0Var5, 13);
                    mVar9.K(objQ18);
                } else {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        objQ18 = new d7(m0Var5, 13);
                        mVar9.K(objQ18);
                    }
                }
                ya0.c0.a(cVarA, pVar2, lVar8, lVar9, pVar3, (e23.l) objQ18, o0Var, lVar7, mVar9, 0);
                return Unit.INSTANCE;
            case 6:
                e23.a aVar13 = (e23.a) obj21;
                e23.a aVar14 = (e23.a) obj25;
                m0 m0Var6 = (m0) obj24;
                x80.e eVar3 = (x80.e) obj22;
                e23.l lVar10 = (e23.l) obj23;
                p3.m mVar10 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var7 = p3.n.f135158a;
                boolean zB6 = mVar10.B(aVar13);
                Object objQ19 = mVar10.q();
                if (zB6) {
                    objQ19 = new ca0.v0(aVar13, 3);
                    mVar10.K(objQ19);
                } else {
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new ca0.v0(aVar13, 3);
                        mVar10.K(objQ19);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ19, mVar10, false);
                d90.h hVar = ((q90.c) aVar14.invoke()).f143495c.f111531p.f58442h;
                d90.h hVar2 = hVar == null ? new d90.h((d90.j) null, 0, 0, false, 15, (p005kotlin.jvm.internal.j) null) : hVar;
                q90.c cVar = (q90.c) aVar14.invoke();
                boolean zR12 = mVar10.r(m0Var6) | mVar10.r(eVar3);
                Object objQ20 = mVar10.q();
                if (zR12) {
                    objQ20 = new ca0.u1(8, m0Var6, eVar3);
                    mVar10.K(objQ20);
                } else {
                    aVar.getClass();
                    if (objQ20 == p3.m.a.f135155b) {
                        objQ20 = new ca0.u1(8, m0Var6, eVar3);
                        mVar10.K(objQ20);
                    }
                }
                e23.a aVar15 = (e23.a) objQ20;
                boolean zR13 = mVar10.r(eVar3);
                Object objQ21 = mVar10.q();
                if (zR13) {
                    objQ21 = new s1(eVar3, 4);
                    mVar10.K(objQ21);
                } else {
                    aVar.getClass();
                    if (objQ21 == p3.m.a.f135155b) {
                        objQ21 = new s1(eVar3, 4);
                        mVar10.K(objQ21);
                    }
                }
                tb0.g.a(hVar2, cVar, aVar15, (e23.a) objQ21, lVar10, null, mVar10, 0, 32);
                return Unit.INSTANCE;
            case 7:
                m0 m0Var7 = (m0) obj25;
                ca0.u1 u1Var = (ca0.u1) obj24;
                e23.l lVar11 = (e23.l) obj23;
                e23.a aVar16 = (e23.a) obj21;
                e23.a aVar17 = (e23.a) obj22;
                lc.v vVar6 = (lc.v) obj2;
                p3.m mVar11 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar6.getClass();
                x1 x1Var8 = p3.n.f135158a;
                qb0.b bVarA = f2.a(vVar6, aVar17, m0Var7, mVar11);
                l90.b bVar7 = bVarA.f143958a.f143495c;
                d90.f fVar3 = bVar7.f111531p.f58441g;
                if (fVar3 instanceof d90.f.d) {
                    mVar11.C(-637827979);
                    Unit unit = Unit.INSTANCE;
                    boolean zR14 = mVar11.r(bVarA) | mVar11.r(m0Var7);
                    Object objQ22 = mVar11.q();
                    if (zR14) {
                        obj20 = objQ22;
                        g2 g2Var = new g2(bVarA, m0Var7, null);
                        mVar11.K(g2Var);
                        obj20 = g2Var;
                    } else {
                        aVar.getClass();
                        if (objQ22 == p3.m.a.f135155b) {
                            obj20 = objQ22;
                            g2 g2Var2 = new g2(bVarA, m0Var7, null);
                            mVar11.K(g2Var2);
                            obj20 = g2Var2;
                        }
                    }
                    obj20 = objQ22;
                    l0.e((e23.p) obj20, unit, mVar11);
                    mVar11.f();
                } else if (fVar3 instanceof d90.f.e) {
                    mVar11.C(-637482608);
                    p1 p1VarC = s9.c.c(bVarA.f143967j, mVar11);
                    Unit unit2 = Unit.INSTANCE;
                    boolean zR15 = mVar11.r(bVarA);
                    Object objQ23 = mVar11.q();
                    if (zR15) {
                        obj18 = objQ23;
                        h2 h2Var = new h2(bVarA, null);
                        mVar11.K(h2Var);
                        obj18 = h2Var;
                    } else {
                        aVar.getClass();
                        if (objQ23 == p3.m.a.f135155b) {
                            obj18 = objQ23;
                            h2 h2Var2 = new h2(bVarA, null);
                            mVar11.K(h2Var2);
                            obj18 = h2Var2;
                        }
                    }
                    obj18 = objQ23;
                    l0.e((e23.p) obj18, unit2, mVar11);
                    sb0.b bVar8 = (sb0.b) p1VarC.getF182175a();
                    boolean zB7 = mVar11.B(p1VarC) | mVar11.r(m0Var7);
                    Object objQ24 = mVar11.q();
                    if (zB7) {
                        obj19 = objQ24;
                        i2 i2Var = new i2(m0Var7, p1VarC, null);
                        mVar11.K(i2Var);
                        obj19 = i2Var;
                    } else {
                        aVar.getClass();
                        if (objQ24 == p3.m.a.f135155b) {
                            obj19 = objQ24;
                            i2 i2Var2 = new i2(m0Var7, p1VarC, null);
                            mVar11.K(i2Var2);
                            obj19 = i2Var2;
                        }
                    }
                    obj19 = objQ24;
                    l0.e((e23.p) obj19, bVar8, mVar11);
                    rb0.h.b(bVar7.f111522g, bVar7.f111521f, ((d90.f.e) fVar3).f58457a, u1Var, lVar11, aVar16, mVar11, 0);
                    mVar11.f();
                } else {
                    mVar11.C(-636568139);
                    qb0.b bVarA2 = f2.a(vVar6, aVar17, m0Var7, mVar11);
                    String str2 = bVar7.f111521f;
                    o90.a aVar18 = bVar7.f111526k;
                    boolean zR16 = mVar11.r(m0Var7);
                    Object objQ25 = mVar11.q();
                    if (zR16) {
                        obj16 = objQ25;
                        u0 u0Var3 = new u0(m0Var7, 16);
                        mVar11.K(u0Var3);
                        obj16 = u0Var3;
                    } else {
                        aVar.getClass();
                        if (objQ25 == p3.m.a.f135155b) {
                            obj16 = objQ25;
                            u0 u0Var4 = new u0(m0Var7, 16);
                            mVar11.K(u0Var4);
                            obj16 = u0Var4;
                        }
                    }
                    obj16 = objQ25;
                    e23.a aVar19 = (e23.a) obj16;
                    boolean zR17 = mVar11.r(m0Var7);
                    Object objQ26 = mVar11.q();
                    if (zR17) {
                        obj17 = objQ26;
                        u0 u0Var5 = new u0(m0Var7, 17);
                        mVar11.K(u0Var5);
                        obj17 = u0Var5;
                    } else {
                        aVar.getClass();
                        if (objQ26 == p3.m.a.f135155b) {
                            obj17 = objQ26;
                            u0 u0Var6 = new u0(m0Var7, 17);
                            mVar11.K(u0Var6);
                            obj17 = u0Var6;
                        }
                    }
                    obj17 = objQ26;
                    qb0.o.a(bVarA2, fVar3, str2, aVar18, aVar19, (e23.a) obj17, lVar11, aVar16, mVar11, 0);
                    mVar11.f();
                }
                return Unit.INSTANCE;
            case 8:
                List list4 = (List) obj21;
                m00.a aVar20 = (m00.a) obj23;
                yo1.f fVar4 = (yo1.f) obj25;
                n1 n1Var = (n1) obj24;
                p1 p1Var = (p1) obj22;
                int iIntValue3 = ((Integer) obj2).intValue();
                p3.m mVar12 = (p3.m) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= mVar12.k(iIntValue3) ? 32 : 16;
                }
                if (mVar12.n(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    x1 x1Var9 = p3.n.f135158a;
                    ps.x1 x1Var10 = (ps.x1) list4.get(iIntValue3);
                    String strG = aVar20.g(Integer.valueOf(iIntValue3 + 1));
                    Object objQ27 = mVar12.q();
                    aVar.getClass();
                    if (objQ27 == p3.m.a.f135155b) {
                        objQ27 = new c42.c0(20, n1Var, p1Var);
                        mVar12.K(objQ27);
                    }
                    cq.u.d(x1Var10, strG, iIntValue3, aVar20, fVar4, (e23.p) objQ27, mVar12, 196608 | ps.x1.G1 | ((iIntValue4 << 3) & 896) | (m00.a.f115515e << 9) | (yo1.f.f198451e << 12));
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 9:
                d52.q qVar = (d52.q) obj23;
                n82.f fVar5 = (n82.f) obj25;
                e23.a aVar21 = (e23.a) obj21;
                p1 p1Var2 = (p1) obj24;
                p1 p1Var3 = (p1) obj22;
                o82.g gVar = (o82.g) obj;
                boolean z17 = false;
                o82.a aVar22 = (o82.a) obj2;
                p3.m mVar13 = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar, aVar22);
                if ((iD & 6) == 0) {
                    i14 = (mVar13.k(gVar.ordinal()) ? 4 : 2) | iD;
                } else {
                    i14 = iD;
                }
                if ((iD & 48) == 0) {
                    i14 |= mVar13.B(aVar22) ? 32 : 16;
                }
                if ((i14 & 147) != 146) {
                    z17 = true;
                }
                if (mVar13.n(i14 & 1, z17)) {
                    x1 x1Var11 = p3.n.f135158a;
                    int i26 = d52.o.c.f57609a[gVar.ordinal()];
                    if (i26 == 1) {
                        mVar13.C(-1424987329);
                        u82.e.b(aVar22, qVar.f57619h, null, false, z3.f.c(-1506866217, new c0(fVar5, aVar22, qVar, p1Var2, p1Var3, 10), mVar13), mVar13, ((i14 >> 3) & 14) | 24576, 12);
                        mVar13.f();
                    } else if (i26 == 2 || i26 == 3) {
                        mVar13.C(-1424935985);
                        u82.e.b(aVar22, qVar.f57620i, null, false, z3.f.c(-400543858, new d52.n(aVar22, gVar, fVar5, aVar21, 0), mVar13), mVar13, ((i14 >> 3) & 14) | 24576, 12);
                        mVar13.f();
                    } else if (i26 != 4) {
                        mVar13.C(-1424893229);
                        mVar13.f();
                    } else {
                        mVar13.C(-1424905229);
                        g52.r.a(((d52.r) p1Var3.getF182175a()).f57658c, qVar, aVar22, fVar5, aVar21, mVar13, (i14 << 3) & 896);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 10:
                n82.f fVar6 = (n82.f) obj21;
                o82.a aVar23 = (o82.a) obj23;
                d52.q qVar2 = (d52.q) obj25;
                p1 p1Var4 = (p1) obj24;
                p1 p1Var5 = (p1) obj22;
                u82.f fVar7 = (u82.f) obj2;
                p3.m mVar14 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((c2.t) obj).getClass();
                fVar7.getClass();
                x1 x1Var12 = p3.n.f135158a;
                boolean zB8 = mVar14.B(fVar6) | mVar14.B(aVar23) | mVar14.r(qVar2);
                Object objQ28 = mVar14.q();
                if (zB8) {
                    objQ28 = new d52.o.b(fVar6, aVar23, qVar2, null);
                    mVar14.K(objQ28);
                } else {
                    aVar.getClass();
                    if (objQ28 == p3.m.a.f135155b) {
                        objQ28 = new d52.o.b(fVar6, aVar23, qVar2, null);
                        mVar14.K(objQ28);
                    }
                }
                l0.e((e23.p) objQ28, fVar7, mVar14);
                z42.g gVar2 = (z42.g) fVar7.a();
                DateTime dateTimeK = vb.h.k(aVar23.f130843a);
                tf0.i iVar = qVar2.f57617f;
                boolean z18 = ((d52.r) p1Var5.getF182175a()).f57661f;
                boolean zR18 = mVar14.r(qVar2);
                Object objQ29 = mVar14.q();
                if (zR18) {
                    objQ29 = new cq0.g(qVar2, 10);
                    mVar14.K(objQ29);
                } else {
                    aVar.getClass();
                    if (objQ29 == p3.m.a.f135155b) {
                        objQ29 = new cq0.g(qVar2, 10);
                        mVar14.K(objQ29);
                    }
                }
                e23.a aVar24 = (e23.a) objQ29;
                boolean zR19 = mVar14.r(qVar2);
                Object objQ30 = mVar14.q();
                if (zR19) {
                    objQ30 = new d52.j(qVar2, 0);
                    mVar14.K(objQ30);
                } else {
                    aVar.getClass();
                    if (objQ30 == p3.m.a.f135155b) {
                        objQ30 = new d52.j(qVar2, 0);
                        mVar14.K(objQ30);
                    }
                }
                e23.l lVar12 = (e23.l) objQ30;
                boolean zR20 = mVar14.r(qVar2);
                Object objQ31 = mVar14.q();
                if (zR20) {
                    objQ31 = new d52.j(qVar2, 1);
                    mVar14.K(objQ31);
                } else {
                    aVar.getClass();
                    if (objQ31 == p3.m.a.f135155b) {
                        objQ31 = new d52.j(qVar2, 1);
                        mVar14.K(objQ31);
                    }
                }
                e23.l lVar13 = (e23.l) objQ31;
                boolean zB9 = mVar14.B(p1Var4);
                Object objQ32 = mVar14.q();
                if (zB9) {
                    objQ32 = new a11.m(p1Var4, i17);
                    mVar14.K(objQ32);
                } else {
                    aVar.getClass();
                    if (objQ32 == p3.m.a.f135155b) {
                        objQ32 = new a11.m(p1Var4, i17);
                        mVar14.K(objQ32);
                    }
                }
                e52.f.a(gVar2, dateTimeK, iVar, z18, aVar24, lVar12, lVar13, (e23.l) objQ32, mVar14, tf0.i.f164439d << 6);
                return Unit.INSTANCE;
            case 11:
                u82.d dVar = (u82.d) obj21;
                u82.d dVar2 = (u82.d) obj25;
                u82.d dVar3 = (u82.d) obj24;
                i53.c cVar2 = (i53.c) obj22;
                e23.l lVar14 = (e23.l) obj23;
                o82.g gVar3 = (o82.g) obj;
                o82.a aVar25 = (o82.a) obj2;
                p3.m mVar15 = (p3.m) obj3;
                int iD2 = vb.h.d((Integer) obj4, gVar3, aVar25);
                if ((iD2 & 6) == 0) {
                    i15 = iD2 | (mVar15.k(gVar3.ordinal()) ? 4 : 2);
                } else {
                    i15 = iD2;
                }
                if ((iD2 & 48) == 0) {
                    i15 |= mVar15.B(aVar25) ? 32 : 16;
                }
                if (mVar15.n(i15 & 1, (i15 & 147) != 146)) {
                    x1 x1Var13 = p3.n.f135158a;
                    if (dd1.e.b.f59203a[gVar3.ordinal()] == 1) {
                        mVar15.C(-1521429515);
                        dd1.a.f59189a.getClass();
                        u82.e.b(aVar25, dVar, null, false, dd1.a.f59190b, mVar15, ((i15 >> 3) & 14) | 24576, 12);
                        mVar15.f();
                    } else {
                        int i27 = i15;
                        mVar15.C(-1520972141);
                        u82.e.b(aVar25, gVar3 == o82.g.f130853f ? dVar2 : dVar3, null, false, z3.f.c(-1788251639, new ao1.f(7, cVar2, lVar14), mVar15), mVar15, ((i27 >> 3) & 14) | 24576, 12);
                        mVar15.f();
                    }
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 12:
                yi0.c cVar3 = (yi0.c) obj25;
                e23.l lVar15 = (e23.l) obj23;
                e23.a aVar26 = (e23.a) obj21;
                e23.a aVar27 = (e23.a) obj24;
                p1 p1Var6 = (p1) obj22;
                u82.f fVar8 = (u82.f) obj2;
                p3.m mVar16 = (p3.m) obj3;
                int iC2 = vb.h.c((Integer) obj4, (c2.t) obj, fVar8);
                if ((iC2 & 48) == 0) {
                    iC2 |= (iC2 & 64) == 0 ? mVar16.B(fVar8) : mVar16.r(fVar8) ? 32 : 16;
                }
                if (mVar16.n(iC2 & 1, (iC2 & 145) != 144)) {
                    x1 x1Var14 = p3.n.f135158a;
                    if ((iC2 & 112) != 32 && ((iC2 & 64) == 0 || !mVar16.r(fVar8))) {
                        z15 = false;
                    }
                    Object objQ33 = mVar16.q();
                    if (z15) {
                        objQ33 = new dj0.m.b(fVar8, p1Var6, null);
                        mVar16.K(objQ33);
                    } else {
                        aVar.getClass();
                        if (objQ33 == p3.m.a.f135155b) {
                            objQ33 = new dj0.m.b(fVar8, p1Var6, null);
                            mVar16.K(objQ33);
                        }
                    }
                    l0.e((e23.p) objQ33, fVar8, mVar16);
                    dj0.d.c((gj0.a) fVar8.a(), cVar3, lVar15, aVar26, aVar27, mVar16, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 13:
                return a(obj, obj2, obj3, obj4);
            case 14:
                return b(obj, obj2, obj3, obj4);
            case 15:
                g21.f0 f0Var = (g21.f0) obj21;
                g21.f0 f0Var2 = (g21.f0) obj23;
                i53.c cVar4 = (i53.c) obj25;
                i53.c cVar5 = (i53.c) obj24;
                v21.e eVar4 = (v21.e) obj22;
                int iIntValue5 = ((Integer) obj2).intValue();
                p3.m mVar17 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                x1 x1Var15 = p3.n.f135158a;
                if (iIntValue5 != 0) {
                    f0Var = f0Var2;
                }
                i53.c cVar6 = iIntValue5 == 0 ? cVar4 : cVar5;
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.e(d92.b.f58623a, mVar17), m1.f128891a);
                d92.b.f58625c.getClass();
                j92.e eVar5 = j92.b.f97899b;
                y01.r.a(wz1.i.c(c2.l.y(rVarE, eVar5.f97920e), mVar17), eVar4, f0Var, eVar5.f97921f, false, cVar6, mVar17, 0, 16);
                return Unit.INSTANCE;
            case 16:
                return c(obj, obj2, obj3, obj4);
            case 17:
                return d(obj, obj2, obj3, obj4);
            case 18:
                return e(obj, obj2, obj3, obj4);
            case 19:
                return f(obj, obj2, obj3, obj4);
            case 20:
                return g(obj, obj2, obj3, obj4);
            case 21:
                return h(obj, obj2, obj3, obj4);
            case 22:
                return i(obj, obj2, obj3, obj4);
            case 23:
                return j(obj, obj2, obj3, obj4);
            case 24:
                return k(obj, obj2, obj3, obj4);
            case 25:
                return l(obj, obj2, obj3, obj4);
            case 26:
                return n(obj, obj2, obj3, obj4);
            case 27:
                return o(obj, obj2, obj3, obj4);
            case 28:
                return q(obj, obj2, obj3, obj4);
            default:
                n82.f fVar9 = (n82.f) obj25;
                o82.a aVar28 = (o82.a) obj24;
                e23.l lVar16 = (e23.l) obj23;
                e23.l lVar17 = (e23.l) obj22;
                e23.a aVar29 = (e23.a) obj21;
                u82.f fVar10 = (u82.f) obj2;
                p3.m mVar18 = (p3.m) obj3;
                int iC3 = vb.h.c((Integer) obj4, (c2.t) obj, fVar10);
                if ((iC3 & 48) == 0) {
                    iC3 |= (iC3 & 64) == 0 ? mVar18.B(fVar10) : mVar18.r(fVar10) ? 32 : 16;
                }
                if (mVar18.n(iC3 & 1, (iC3 & 145) != 144)) {
                    x1 x1Var16 = p3.n.f135158a;
                    xp1.b bVar9 = (xp1.b) fVar10.a();
                    boolean zB10 = mVar18.B(fVar9) | mVar18.B(aVar28) | mVar18.B(lVar16) | mVar18.B(bVar9);
                    Object objQ34 = mVar18.q();
                    if (zB10) {
                        objQ34 = new up1.b.C3212b(fVar9, aVar28, lVar16, bVar9, null);
                        mVar18.K(objQ34);
                    } else {
                        aVar.getClass();
                        if (objQ34 == p3.m.a.f135155b) {
                            objQ34 = new up1.b.C3212b(fVar9, aVar28, lVar16, bVar9, null);
                            mVar18.K(objQ34);
                        }
                    }
                    l0.e((e23.p) objQ34, bVar9, mVar18);
                    up1.a.a(bVar9, fVar10 instanceof u82.f.c, lVar17, aVar29, mVar18, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c0(int i14, e23.a aVar, e23.l lVar, Object obj, Object obj2, Object obj3) {
        this.f985a = i14;
        this.f988d = obj;
        this.f989e = obj2;
        this.f987c = lVar;
        this.f986b = aVar;
        this.f990f = obj3;
    }

    public /* synthetic */ c0(Object obj, Object obj2, u1 u1Var, Object obj3, e23.a aVar, int i14) {
        this.f985a = i14;
        this.f987c = obj;
        this.f988d = obj2;
        this.f989e = u1Var;
        this.f990f = obj3;
        this.f986b = aVar;
    }

    public /* synthetic */ c0(Object obj, Object obj2, e23.a aVar, Object obj3, Object obj4, int i14) {
        this.f985a = i14;
        this.f987c = obj;
        this.f988d = obj2;
        this.f986b = aVar;
        this.f989e = obj3;
        this.f990f = obj4;
    }

    public /* synthetic */ c0(Object obj, Object obj2, e23.l lVar, e23.l lVar2, e23.a aVar, int i14) {
        this.f985a = i14;
        this.f988d = obj;
        this.f989e = obj2;
        this.f987c = lVar;
        this.f990f = lVar2;
        this.f986b = aVar;
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, e23.a aVar, Object obj4, int i14) {
        this.f985a = i14;
        this.f987c = obj;
        this.f988d = obj2;
        this.f989e = obj3;
        this.f986b = aVar;
        this.f990f = obj4;
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, e23.l lVar, o13.h hVar, int i14) {
        this.f985a = i14;
        this.f986b = obj;
        this.f988d = obj2;
        this.f989e = obj3;
        this.f987c = lVar;
        this.f990f = hVar;
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, e23.l lVar, int i14) {
        this.f985a = i14;
        this.f986b = obj;
        this.f988d = obj2;
        this.f989e = obj3;
        this.f990f = obj4;
        this.f987c = lVar;
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f985a = i14;
        this.f986b = obj;
        this.f987c = obj2;
        this.f988d = obj3;
        this.f989e = obj4;
        this.f990f = obj5;
    }

    public /* synthetic */ c0(p1 p1Var, e23.a aVar, k62.k kVar, fv0.d dVar, d6 d6Var) {
        this.f985a = 18;
        this.f987c = p1Var;
        this.f986b = aVar;
        this.f988d = kVar;
        this.f989e = dVar;
        this.f990f = d6Var;
    }

    public /* synthetic */ c0(yi0.c cVar, e23.l lVar, e23.a aVar, e23.a aVar2, p1 p1Var) {
        this.f985a = 12;
        this.f988d = cVar;
        this.f987c = lVar;
        this.f986b = aVar;
        this.f989e = aVar2;
        this.f990f = p1Var;
    }

    public /* synthetic */ c0(zs.c cVar, m0 m0Var, e23.a aVar, e23.l lVar, Context context) {
        this.f985a = 14;
        this.f988d = cVar;
        this.f989e = m0Var;
        this.f986b = aVar;
        this.f987c = lVar;
        this.f990f = context;
    }
}
