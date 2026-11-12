package mk1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c.q;
import c.w;
import c2.x2;
import c42.d0;
import c42.e0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import e23.l;
import e23.r;
import gl1.y;
import hk1.j;
import hk1.p;
import hk1.u;
import hk1.v;
import java.util.List;
import l30.y0;
import l72.p2;
import l72.r1;
import mh1.x;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f119154a = new a();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f119155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f119156b;

        public b(l lVar, List list) {
            this.f119155a = lVar;
            this.f119156b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f119155a.invoke(this.f119156b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f119157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f119158b;

        public c(List list, l lVar) {
            this.f119157a = list;
            this.f119158b = lVar;
        }

        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                j jVar = (j) this.f119157a.get(iIntValue);
                mVar2.C(-730276848);
                if (jVar instanceof u) {
                    mVar2.C(807728387);
                    f.b((u) jVar, mVar2, 0);
                    mVar2.f();
                } else if (jVar instanceof p) {
                    mVar2.C(807730257);
                    f.a((p) jVar, this.f119158b, mVar2, 0);
                    mVar2.f();
                } else {
                    mVar2.C(-730123089);
                    mVar2.f();
                }
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    public static final void a(p pVar, l<? super p, Unit> lVar, m mVar, int i14) {
        String str = pVar.f84181a;
        lVar.getClass();
        o0 o0VarE = mVar.E(-902911907);
        int i15 = (o0VarE.B(pVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_my_fitness_pal_talkback);
            if (s.g(str, v.f84199e.f84204a)) {
                str = strQ;
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str);
            b92.a aVarB = c0235a.b();
            p2 p2Var = p2.f111205a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            String str2 = pVar.f84181a;
            boolean z14 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new mk1.b(lVar, pVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new mk1.b(lVar, pVar);
                    o0VarE.K(objQ);
                }
            }
            int i16 = b92.a.f16960b;
            p2Var.g(str2, rVarF, aVarB, null, null, false, false, (e23.a) objQ, o0VarE, 48, 248);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(pVar, lVar, i14, 24);
        }
    }

    public static final void b(u uVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-829517168);
        int i15 = (o0VarE.B(uVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r1.b(y.Q(o0VarE, uVar.f84197a), null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m92.f(uVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:69:0x0175  */
    /* JADX WARN: Code duplicated, block: B:81:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h hVar, String str, boolean z14, dk1.a aVar, l lVar, e23.a aVar2, e23.a aVar3, m mVar, int i14) {
        h hVar2;
        int i15;
        h hVar3;
        boolean z15;
        int i16;
        Context context;
        boolean z16;
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(640184108);
        int i17 = i14 | 2 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.B(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(h.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                h hVar4 = (h) u1VarResolveViewModel;
                i15 = i17 & (-15);
                hVar3 = hVar4;
            } else {
                o0VarE.e();
                i15 = i17 & (-15);
                hVar3 = hVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(hVar3.f119161c, o0VarE);
            m3.s sVarE = m3.l.e(o0VarE);
            g.h hVar5 = new g.h();
            boolean zR = o0VarE.r(hVar3);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zR) {
                objQ = new x(hVar3, 1);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new x(hVar3, 1);
                    o0VarE.K(objQ);
                }
            }
            q qVarC = w.c(hVar5, (l) objQ, o0VarE, 0);
            int i18 = i15 & 7168;
            boolean zR2 = ((i15 & 57344) == 16384) | (i18 == 2048) | o0VarE.r(context2) | o0VarE.r(qVarC);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                z15 = false;
                i16 = 131072;
                objQ2 = new ev2.f(aVar, context2, qVarC, lVar, 28);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    z15 = false;
                    i16 = 131072;
                    objQ2 = new ev2.f(aVar, context2, qVarC, lVar, 28);
                    o0VarE.K(objQ2);
                } else {
                    z15 = false;
                    i16 = 131072;
                }
            }
            l lVar2 = (l) objQ2;
            Boolean boolValueOf = Boolean.valueOf(z14);
            boolean zR3 = o0VarE.r(hVar3) | ((i15 & 896) == 256 ? true : z15);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new mk1.c(z14, hVar3, null);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new mk1.c(z14, hVar3, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((e23.p) objQ3, boolValueOf, o0VarE);
            boolean zR4 = ((i15 & 112) == 32 ? true : z15) | (i18 != 2048 ? z15 : true) | o0VarE.r(context2) | o0VarE.r(qVarC);
            Object objQ4 = o0VarE.q();
            if (zR4) {
                context = context2;
                z16 = true;
                d dVar = new d(str, aVar, context, qVarC, null);
                o0VarE.K(dVar);
                objQ4 = dVar;
            } else {
                aVar4.getClass();
                if (objQ4 == m.a.f135155b) {
                    context = context2;
                    z16 = true;
                    d dVar2 = new d(str, aVar, context, qVarC, null);
                    o0VarE.K(dVar2);
                    objQ4 = dVar2;
                } else {
                    context = context2;
                    z16 = true;
                }
            }
            l0.e((e23.p) objQ4, str, o0VarE);
            Boolean boolValueOf2 = Boolean.valueOf(((h.a) p1VarC.getF182175a()).f119166e);
            boolean zB = o0VarE.B(p1VarC);
            if ((458752 & i15) == i16) {
                z15 = z16;
            }
            boolean z17 = zB | z15;
            Object objQ5 = o0VarE.q();
            if (z17) {
                objQ5 = new e(aVar2, p1VarC, null);
                o0VarE.K(objQ5);
            } else {
                aVar4.getClass();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new e(aVar2, p1VarC, null);
                    o0VarE.K(objQ5);
                }
            }
            l0.e((e23.p) objQ5, boolValueOf2, o0VarE);
            hVar2 = hVar3;
            z02.d.a(((h.a) p1VarC.getF182175a()).f119162a, z3.f.c(1007502769, new ll1.g(aVar3, 9), o0VarE), null, null, null, z3.f.c(2140570037, new ix.h(hVar3, sVarE, p1VarC, context, lVar2), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
            hVar2 = hVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(hVar2, str, z14, aVar, lVar, aVar2, aVar3, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    public static final void d(List<? extends j> list, l<? super p, Unit> lVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(-1638226915);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean zR = o0VarE.r(list) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new d0(list, lVar, 4);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d0(list, lVar, 4);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarF, null, null, null, null, null, false, null, (l) objQ, o0VarE, 6, 510);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e0(lVar, i14, 8, list);
        }
    }
}
