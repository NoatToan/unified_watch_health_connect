package ll0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import d6.i;
import e23.l;
import e23.r;
import f5.z0;
import gl1.y;
import gt1.t;
import h5.e0;
import i3.mh;
import i3.v5;
import java.util.List;
import jl0.g;
import k62.k;
import l72.c1;
import o4.q1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.q2;
import s5.i0;
import s5.x0;
import u1.w;
import vb.h;
import w5.b0;
import w5.c0;
import w5.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<il0.a, Unit> f113339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ il0.a f113340b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super il0.a, Unit> lVar, il0.a aVar) {
            this.f113339a = lVar;
            this.f113340b = aVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f113339a.invoke(this.f113340b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<il0.a, Unit> f113341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ il0.a f113342b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super il0.a, Unit> lVar, il0.a aVar) {
            this.f113341a = lVar;
            this.f113342b = aVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f113341a.invoke(this.f113342b);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ll0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2165c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2165c f113343a = new C2165c();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f113344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f113345b;

        public d(l lVar, List list) {
            this.f113344a = lVar;
            this.f113345b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f113344a.invoke(this.f113345b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f113346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f113347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f113348c;

        public e(List list, l lVar, l lVar2) {
            this.f113346a = list;
            this.f113347b = lVar;
            this.f113348c = lVar2;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:32:0x0092  */
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
                il0.a aVar = (il0.a) this.f113346a.get(iIntValue);
                mVar2.C(-1899585083);
                h4.r.a aVar2 = h4.r.S;
                l lVar = this.f113347b;
                boolean zB = mVar2.B(lVar) | mVar2.B(aVar);
                Object objQ = mVar2.q();
                m.a aVar3 = m.f135153a;
                if (zB) {
                    objQ = new a(lVar, aVar);
                    mVar2.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a(lVar, aVar);
                        mVar2.K(objQ);
                    }
                }
                e23.a aVar4 = (e23.a) objQ;
                l lVar2 = this.f113348c;
                boolean zB2 = mVar2.B(lVar2) | mVar2.B(aVar);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new b(lVar2, aVar);
                    mVar2.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new b(lVar2, aVar);
                        mVar2.K(objQ2);
                    }
                }
                g.a(aVar, w.f(239, aVar4, (e23.a) objQ2, aVar2, null, false), null, mVar2, 0, 4);
                v5.a(0.0f, 0, 3, q2.e(d92.b.f58623a, mVar2), null, mVar2);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0VarE = mVar.E(-884065871);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarE, R.string.golf_downloaded_courses_confirm_course_removal_title), y.P(R.string.golf_downloaded_courses_confirm_course_removal_message, new Object[]{str}, o0VarE), null, null, y.Q(o0VarE, R.string.lbl_remove), false, false, aVar, y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, (i15 << 21) & 234881024, (i15 >> 6) & 14, 217);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(str, aVar, aVar2, i14, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, e23.a aVar, l lVar, e23.a aVar2, m mVar, int i14) {
        f fVar2;
        f fVar3;
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(632663519);
        int i15 = i14 | 2 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(f.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    fVar3 = (f) u1VarResolveViewModel;
                }
            } else {
                o0VarE.e();
                fVar3 = fVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(fVar3.f113357d, o0VarE);
            z02.d.a(((ll0.d) p1VarC.getF182175a()).f113349a, z3.f.c(1727165732, new at1.f(aVar2, aVar, 27), o0VarE), null, null, null, z3.f.c(-1989650392, new lb0.a(lVar, 5, p1VarC, fVar3), o0VarE), o0VarE, 196656, 28);
            fVar2 = fVar3;
        } else {
            o0VarE.e();
            fVar2 = fVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(fVar2, aVar, lVar, aVar2, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    public static final void c(List<il0.a> list, l<? super il0.a, Unit> lVar, l<? super il0.a, Unit> lVar2, m mVar, int i14) {
        o0 o0VarE = mVar.E(529331174);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(list) | ((i15 & 896) == 256) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new k(list, 26, lVar2, lVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k(list, 26, lVar2, lVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(null, null, null, null, null, null, false, null, (l) objQ, o0VarE, 0, 511);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kh0.r(list, lVar, lVar2, i14, 1);
        }
    }

    public static final void d(m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1491942970);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            String strP = y.P(R.string.golf_downloaded_courses_no_data_message_list_view, new Object[]{Marker.ANY_NON_NULL_MARKER}, o0VarE);
            int iH = d53.w.H(strP, Marker.ANY_NON_NULL_MARKER, 0, false, 6);
            f0.f182097b.getClass();
            s5.c cVar = new s5.c(strP, p13.w.c(new s5.c.d(new i0(0L, 0L, f0.f182105j, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (j) null), iH, iH + 1)), null, 4, null);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97931h;
            h4.r rVarC2 = uVar.c(aVar, h4.d.a.f81525c);
            d92.b.f58625c.getClass();
            mh.d(cVar, c2.l.C(rVarC2, 0.0f, j92.b.f97899b.f97922g, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0Var, o0VarE, 0, 0, 262140);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lk0.a(i14);
        }
    }
}
