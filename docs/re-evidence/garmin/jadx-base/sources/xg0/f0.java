package xg0;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.feed.activity.view.MediaComponentKt$MediaComponent$1$2$1$1", f = "MediaComponent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Integer, Unit> f190764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h2.j0 f190765b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Integer, Unit> lVar, h2.j0 j0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f190764a = lVar;
            this.f190765b = j0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f190764a, this.f190765b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f190764a.invoke(new Integer(this.f190765b.l()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02c7  */
    public static final void a(h4.r rVar, final h2.j0 j0Var, final n nVar, final wg0.a aVar, final boolean z14, final rs.c<wg0.d> cVar, final rs.d<wg0.d> dVar, e23.l<? super Integer, Unit> lVar, p3.m mVar, final int i14, final int i15) {
        final h4.r rVar2;
        int i16;
        final rs.c<wg0.d> cVar2;
        final rs.d<wg0.d> dVar2;
        e23.l<? super Integer, Unit> lVar2;
        final e23.l<? super Integer, Unit> lVar3;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        ArrayList arrayList;
        t13.d dVar3;
        e23.l<? super Integer, Unit> lVar4;
        i53.c cVarE;
        ArrayList arrayList2;
        Context context;
        wf.f.a aVar2;
        ArrayList arrayList3;
        e23.l<? super Integer, Unit> lVar5;
        e23.l<? super Integer, Unit> lVar6;
        j0Var.getClass();
        nVar.getClass();
        aVar.getClass();
        cVar.getClass();
        o0 o0VarE = mVar.E(2040204755);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(nVar) : o0VarE.r(nVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            cVar2 = cVar;
            i16 |= o0VarE.r(cVar2) ? 131072 : 65536;
        } else {
            cVar2 = cVar;
        }
        if ((1572864 & i14) == 0) {
            dVar2 = dVar;
            i16 |= o0VarE.r(dVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            dVar2 = dVar;
        }
        int i18 = i15 & 128;
        if (i18 != 0) {
            i16 |= 12582912;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((i14 & 12582912) == 0) {
                i16 |= o0VarE.r(lVar2) ? 8388608 : 4194304;
            }
        }
        int i19 = i16;
        if (o0VarE.n(i19 & 1, (i19 & 4793491) != 4793490)) {
            h4.r rVar3 = i17 != 0 ? h4.r.S : rVar2;
            final e23.l<? super Integer, Unit> lVar7 = i18 != 0 ? null : lVar2;
            x1 x1Var = p3.n.f135158a;
            wg0.l lVar8 = aVar.f185059r;
            if (lVar8 != null) {
                o0VarE.C(1658082310);
                ArrayList arrayListD = lVar8.d();
                if (arrayListD.isEmpty()) {
                    o0VarE.g0(false);
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final h4.r rVar4 = rVar3;
                    final int i24 = 0;
                    pVar = new e23.p() { // from class: xg0.d0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i24) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    f0.a(rVar4, j0Var, nVar, aVar, z14, cVar2, dVar2, lVar7, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    f0.a(rVar4, j0Var, nVar, aVar, z14, cVar2, dVar2, lVar7, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    h4.r rVar5 = rVar3;
                    wg0.d dVar4 = lVar8.f185102a;
                    o0VarE.C(-68300469);
                    ArrayList arrayList4 = new ArrayList();
                    Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    if (arrayListD.isEmpty()) {
                        i53.c cVarE2 = i53.a.e(arrayList4);
                        o0VarE.g0(false);
                        cVarE = cVarE2;
                        arrayList = arrayListD;
                        dVar3 = null;
                        lVar4 = lVar7;
                    } else {
                        wf.f.a aVar3 = new wf.f.a(context2);
                        Bitmap.Config config = Bitmap.Config.RGB_565;
                        hf.f.c<cg.d.a> cVar3 = wf.h.f184985a;
                        aVar3.b().b(wf.h.f184986b, config);
                        int i25 = 0;
                        for (Object obj : arrayListD) {
                            int i26 = i25 + 1;
                            if (i25 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            wg0.f fVar = (wg0.f) obj;
                            if (fVar instanceof wg0.d) {
                                o0VarE.C(761175276);
                                aVar2 = aVar3;
                                arrayList2 = arrayList4;
                                arrayList3 = arrayListD;
                                lVar5 = lVar7;
                                context = context2;
                                arrayList2.add(z3.f.c(902256713, new e11.n(context2, new r0(), cVar, dVar, aVar, dVar4, nVar, z14), o0VarE));
                                o0VarE.g0(false);
                            } else {
                                arrayList2 = arrayList4;
                                context = context2;
                                aVar2 = aVar3;
                                arrayList3 = arrayListD;
                                lVar5 = lVar7;
                                if (fVar instanceof wg0.c) {
                                    o0VarE.C(762372806);
                                    wg0.c cVar4 = (wg0.c) fVar;
                                    ps.j jVar = cVar4.f185077b;
                                    String feedUrl = jVar.getFeedUrl();
                                    if (feedUrl == null) {
                                        feedUrl = jVar.getMediumUrl();
                                    }
                                    aVar2.f184930c = feedUrl;
                                    arrayList2.add(z3.f.c(-1860986062, new ug0.c(nVar, aVar, cVar4, i25, aVar2.a()), o0VarE));
                                    o0VarE.g0(false);
                                } else if (fVar instanceof wg0.k) {
                                    o0VarE.C(763281912);
                                    wg0.k kVar = (wg0.k) fVar;
                                    aVar2.f184930c = am.j.m("https://img.youtube.com/vi/", kVar.f185099b, "/hqdefault.jpg");
                                    arrayList2.add(z3.f.c(979655953, new vx1.b(nVar, 27, kVar, aVar2.a()), o0VarE));
                                    o0VarE.g0(false);
                                } else {
                                    if (!(fVar instanceof wg0.g)) {
                                        throw kg.f.h(o0VarE, 994386527, false);
                                    }
                                    o0VarE.C(764588872);
                                    wg0.g gVar = (wg0.g) fVar;
                                    aVar2.f184930c = gVar.f185090a;
                                    arrayList2.add(z3.f.c(-474669328, new vx1.b(nVar, 28, gVar, aVar2.a()), o0VarE));
                                    o0VarE.g0(false);
                                }
                            }
                            context2 = context;
                            lVar7 = lVar5;
                            arrayList4 = arrayList2;
                            aVar3 = aVar2;
                            i25 = i26;
                            arrayListD = arrayList3;
                        }
                        arrayList = arrayListD;
                        dVar3 = null;
                        lVar4 = lVar7;
                        cVarE = i53.a.e(arrayList4);
                        x1 x1Var2 = p3.n.f135158a;
                        o0VarE.g0(false);
                    }
                    if (lVar4 == null) {
                        o0VarE.C(-1885837978);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1885837977);
                        Integer numValueOf = Integer.valueOf(j0Var.l());
                        boolean z15 = ((i19 & 29360128) == 8388608) | ((i19 & 112) == 32);
                        Object objQ = o0VarE.q();
                        if (z15) {
                            objQ = new a(lVar4, j0Var, dVar3);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new a(lVar4, j0Var, dVar3);
                                o0VarE.K(objQ);
                            }
                        }
                        l0.e((e23.p) objQ, numValueOf, o0VarE);
                        o0VarE.g0(false);
                    }
                    int i27 = (i19 & 14) | 1769472 | ((i19 << 21) & 234881024);
                    rVar3 = rVar5;
                    lVar6 = lVar4;
                    m82.d.b(rVar3, cVarE, 0.0f, null, 0.0f, null, null, null, j0Var, arrayList.size() <= 2 ? 0 : 1, false, null, o0VarE, i27, 0, 3228);
                    o0VarE.g0(false);
                }
                p2VarI0.f135219d = pVar;
            }
            o0VarE.C(1658082309);
            o0VarE.g0(false);
            lVar6 = lVar7;
            rVar2 = rVar3;
            lVar3 = lVar6;
        } else {
            o0VarE.e();
            lVar3 = lVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i28 = 1;
            pVar = new e23.p() { // from class: xg0.d0
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i28) {
                        case 0:
                            ((Integer) obj3).getClass();
                            f0.a(rVar2, j0Var, nVar, aVar, z14, cVar, dVar, lVar3, (p3.m) obj2, p0.t(i14 | 1), i15);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            f0.a(rVar2, j0Var, nVar, aVar, z14, cVar, dVar, lVar3, (p3.m) obj2, p0.t(i14 | 1), i15);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
