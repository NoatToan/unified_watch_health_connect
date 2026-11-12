package tb0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c2.x2;
import i3.e5;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f163641a;

        public a(e23.a<Unit> aVar) {
            this.f163641a = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                b82.c.b(x2.f(h4.r.S, 1.0f), null, z3.f.c(-1013464724, new s70.a0(this.f163641a, 8), mVar2), null, fb1.c.z(d92.b.f58623a, mVar2), mVar2, 390, 10);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(h4.r rVar, final hv.a aVar, final int i14, final boolean z14, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(180665969);
        int i16 = i15 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t52.c(16);
                o0VarE.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = o0VarE.r(aVar) | ((i16 & 7168) == 2048) | ((i16 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new e23.l() { // from class: tb0.j
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        ImageView imageView = (ImageView) obj;
                        imageView.getClass();
                        hv.a aVar2 = aVar;
                        Drawable drawableA = aVar2.a(0, i14);
                        if (drawableA == null) {
                            drawableA = aVar2.a(-1, -1);
                        }
                        imageView.setImageDrawable(drawableA);
                        imageView.setVisibility((!z14 || drawableA == null) ? 8 : 0);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            p002j6.c.b(lVar, rVar, (e23.l) objQ2, o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(rVar, aVar, i14, z14, i15, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(w wVar, String str, o90.a aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar4;
        e23.l<? super Float, Unit> lVar2;
        wVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-636522713);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(wVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            aVar4 = aVar2;
            i15 |= o0VarE.r(aVar4) ? 2048 : 1024;
        } else {
            aVar4 = aVar2;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        } else {
            lVar2 = lVar;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(wVar.f163722f, o0VarE);
            da0.p.d("device_discovery_legacy_pair_tutorial_screen", ((u) p1VarC.getF182175a()).f163711a, aVar3, null, null, null, z3.f.c(841597630, new sg2.g(12, aVar4, lVar2, str, aVar, p1VarC), o0VarE), o0VarE, ((i16 >> 6) & 896) | 12582918, 120);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b((Object) wVar, str, (Object) aVar, (Object) aVar2, (o13.h) aVar3, (o13.h) lVar, i14, 13);
        }
    }

    public static final void c(final u uVar, final String str, final e23.a<Unit> aVar, final e23.l<? super Float, Unit> lVar, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(558147821);
        int i15 = i14 | (o0VarE.r(uVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            hv.a aVar2 = uVar.f163713c;
            if (aVar2 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(uVar, str, aVar, lVar, i14, i16) { // from class: tb0.i

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f163633a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u f163634b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f163635c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163636d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.l f163637e;

                    {
                        this.f163633a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f163633a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                k.c(this.f163634b, this.f163635c, this.f163636d, this.f163637e, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                k.c(this.f163634b, this.f163635c, this.f163636d, this.f163637e, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e5.o(0, o0VarE);
                }
                n1 n1Var = (n1) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n("");
                    o0VarE.K(objQ2);
                }
                p1 p1Var = (p1) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = hb.a.n(aVar2.a(-1, -1) != null, o0VarE);
                }
                b82.c.c(z3.f.c(-580410665, new a(aVar), o0VarE), z3.f.c(1592354717, new ak0.h(lVar, aVar2, n1Var, (p1) objQ3, p1Var, str, 25), o0VarE), o0VarE, 54);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p(uVar, str, aVar, lVar, i14, i17) { // from class: tb0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f163633a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f163634b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f163635c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.a f163636d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f163637e;

                {
                    this.f163633a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f163633a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            k.c(this.f163634b, this.f163635c, this.f163636d, this.f163637e, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            k.c(this.f163634b, this.f163635c, this.f163636d, this.f163637e, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void d(h4.r rVar, hv.a aVar, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1317164515);
        int i15 = (o0VarE.r(aVar) ? 32 : 16) | i14 | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t52.c(17);
                o0VarE.K(objQ);
            }
            e23.l lVar2 = (e23.l) objQ;
            boolean zR = o0VarE.r(aVar) | ((i15 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new sy.i(aVar, lVar, 12);
                o0VarE.K(objQ2);
            }
            p002j6.c.b(lVar2, rVar, (e23.l) objQ2, o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(rVar, aVar, lVar, i14, 0);
        }
    }
}
