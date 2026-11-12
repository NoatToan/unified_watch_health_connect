package x91;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.p1;
import h2.j0;
import i3.fe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<q91.d, Unit> f189633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ aa1.f f189634b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super q91.d, Unit> lVar, aa1.f fVar) {
            this.f189633a = lVar;
            this.f189634b = fVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f189633a.invoke(this.f189634b.f2270a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f189635a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f189636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f189637b;

        public c(e23.l lVar, List list) {
            this.f189636a = lVar;
            this.f189637b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f189636a.invoke(this.f189637b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f189638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f189639b;

        public d(e23.l lVar, List list) {
            this.f189638a = lVar;
            this.f189639b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f189638a.invoke(this.f189639b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f189640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f189641b;

        public e(List list, e23.l lVar) {
            this.f189640a = list;
            this.f189641b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006c  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
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
                x1 x1Var = p3.n.f135158a;
                aa1.f fVar = (aa1.f) this.f189640a.get(iIntValue);
                mVar2.C(-808004182);
                e23.l lVar = this.f189641b;
                boolean zB = mVar2.B(lVar) | mVar2.r(fVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new a(lVar, fVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(lVar, fVar);
                        mVar2.K(objQ);
                    }
                }
                u91.j.a(fVar, (e23.a) objQ, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    public static final void a(i53.c<aa1.f> cVar, e23.l<? super q91.d, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(287738077);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d50.j(3, lVar, cVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d50.j(3, lVar, cVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b71.m(i14, lVar, cVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    public static final void b(aa1.h hVar, fe feVar, e23.l<? super q91.d, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        hVar.getClass();
        feVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarP = fb1.c.p(aVar3, aVar4, mVar, -1375231828);
        int i15 = i14 | (o0VarP.B(hVar) ? 4 : 2) | (o0VarP.r(lVar) ? 256 : 128) | (o0VarP.r(aVar) ? 2048 : 1024) | (o0VarP.r(aVar2) ? 16384 : 8192) | (o0VarP.r(aVar3) ? 131072 : 65536) | (o0VarP.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarP.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            int iG0 = h0.g0(hVar.f2297i, hVar.f2294f);
            if (iG0 < 0) {
                iG0 = 0;
            }
            o0VarP.N(1252158260, Integer.valueOf(iG0));
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarP.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (z14) {
                objQ = new q(hVar, 0);
                o0VarP.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q(hVar, 0);
                    o0VarP.K(objQ);
                }
            }
            h2.b bVarB = h2.o0.b(iG0, (e23.a) objQ, o0VarP, 0, 2);
            o0VarP.g0(false);
            boolean z15 = (i15 & 57344) == 16384;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new wv0.v(aVar2, 9);
                o0VarP.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new wv0.v(aVar2, 9);
                    o0VarP.K(objQ2);
                }
            }
            w.a(0, 1, (e23.a) objQ2, o0VarP, false);
            z02.d.a(hVar.f2289a, z3.f.c(-1351351097, new vx1.b(aVar2, 24, hVar, aVar), o0VarP), z3.f.c(-2010417178, new f(feVar, 3), o0VarP), null, null, z3.f.c(307351875, new wv0.e(hVar, aVar3, aVar4, bVarB, lVar), o0VarP), o0VarP, 197040, 24);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k((Object) hVar, (Object) feVar, (e23.l) lVar, (e23.a) aVar, (o13.h) aVar2, (o13.h) aVar3, (o13.h) aVar4, i14, 28);
        }
    }

    public static final void c(j0 j0Var, aa1.h hVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(993530835);
        int i15 = (o0VarE.B(j0Var) ? 4 : 2) | i14 | (o0VarE.B(hVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            i53.c<q91.g> cVar = hVar.f2294f;
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            Iterator<q91.g> it = cVar.iterator();
            while (it.hasNext()) {
                String string = context.getString(it.next().f143598b);
                string.getClass();
                arrayList.add(new p1(string, null, null, 6, null));
            }
            g02.t.a(j0Var, b0Var, i53.a.e(arrayList), g6.f.a(f14), o0VarE, i15 & 14, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(j0Var, hVar, i14, 0);
        }
    }
}
