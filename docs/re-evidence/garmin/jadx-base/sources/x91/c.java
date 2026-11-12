package x91;

import androidx.room.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.z;
import gl1.y;
import i3.e9;
import i3.fe;
import i3.mc;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.screen.AddManualPersonalRecordScreenKt$AddManualPersonalRecordScreen$onDismissBottomSheetRequested$1$1$1", f = "AddManualPersonalRecordScreen.kt", l = {79}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f189598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f189599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f189599b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f189599b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f189598a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f189598a = 1;
                if (this.f189599b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189600a;

        static {
            int[] iArr = new int[q91.a.values().length];
            try {
                iArr[q91.a.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q91.a.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q91.a.SWIMMING_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q91.a.ASCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q91.a.POWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q91.a.TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f189600a = iArr;
        }
    }

    public static final void a(aa1.c cVar, fe feVar, e23.l<? super Long, Unit> lVar, e23.l<? super String, Unit> lVar2, e23.a<Unit> aVar, e23.l<? super q91.b, Unit> lVar3, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        fe feVar2;
        o0 o0Var;
        cVar.getClass();
        feVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarP = a0.p(lVar3, aVar2, mVar, 2032647670);
        int i15 = i14 | (o0VarP.B(cVar) ? 4 : 2) | (o0VarP.r(lVar) ? 256 : 128) | (o0VarP.r(lVar2) ? 2048 : 1024) | (o0VarP.r(aVar) ? 16384 : 8192) | (o0VarP.r(lVar3) ? 131072 : 65536) | (o0VarP.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarP.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new x1.b(11);
                o0VarP.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarP, 48);
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a) {
                objQ2 = new wy2.c(29);
                o0VarP.K(objQ2);
            }
            mc mcVarF = e9.f(true, (e23.l) objQ2, o0VarP, 54, 0);
            Object[] objArr2 = new Object[0];
            Object objQ3 = o0VarP.q();
            if (objQ3 == c2565a) {
                objQ3 = new x1.b(9);
                o0VarP.K(objQ3);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ3, o0VarP, 48);
            Object[] objArr3 = new Object[0];
            Object objQ4 = o0VarP.q();
            if (objQ4 == c2565a) {
                objQ4 = new x1.b(10);
                o0VarP.K(objQ4);
            }
            p1 p1Var3 = (p1) d4.a.e(objArr3, (e23.a) objQ4, o0VarP, 48);
            Object objQ5 = o0VarP.q();
            if (objQ5 == c2565a) {
                objQ5 = l0.j(t13.h.f161748a, o0VarP);
                o0VarP.K(objQ5);
            }
            b0 b0Var = (b0) objQ5;
            boolean zR = o0VarP.r(b0Var) | o0VarP.B(mcVarF) | o0VarP.B(p1Var2);
            Object objQ6 = o0VarP.q();
            if (zR || objQ6 == c2565a) {
                objQ6 = new fo.j(b0Var, mcVarF, p1Var2, 20);
                o0VarP.K(objQ6);
            }
            e23.a aVar3 = (e23.a) objQ6;
            boolean z14 = cVar.f2233a;
            z3.e eVarC = z3.f.c(1307357883, new vx1.b(cVar, 22, aVar2, aVar), o0VarP);
            feVar2 = feVar;
            z3.e eVarC2 = z3.f.c(-1043637508, new p21.b(feVar2, 29), o0VarP);
            z3.e eVarC3 = z3.f.c(493310911, new c42.d(cVar, p1Var, lVar, p1Var3, lVar2, p1Var2, mcVarF, aVar3, lVar3), o0VarP);
            o0Var = o0VarP;
            z02.d.a(z14, eVarC, eVarC2, null, null, eVarC3, o0Var, 197040, 24);
        } else {
            feVar2 = feVar;
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(cVar, feVar2, lVar, lVar2, aVar, lVar3, aVar2, i14, 26);
        }
    }

    public static final void b(aa1.c cVar, boolean z14, e23.l<? super String, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        String strJ;
        String strL;
        boolean z15;
        String strL2;
        boolean z16;
        o0 o0VarE = mVar.E(982214735);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            q91.d dVar = cVar.f2234b;
            q91.b bVar = cVar.f2244l;
            if (dVar == null) {
                o0VarE.C(-452576535);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-452576534);
                q91.a aVar2 = dVar.f143581c;
                int[] iArr = b.f189600a;
                if (iArr[aVar2.ordinal()] == 6) {
                    o0VarE.C(-1089495183);
                    u91.e.a(x2.f(h4.r.S, 1.0f), y.Q(o0VarE, R.string.lbl_time), cVar.f2242j, cVar.f2243k, z14, lVar2, z3.f.c(945905060, new x91.b(cVar, lVar), o0VarE), o0VarE, ((i15 << 9) & 57344) | 1572870 | ((i15 << 6) & 458752));
                    o0VarE.g0(false);
                    z16 = false;
                } else {
                    o0VarE.C(-1087901442);
                    int i16 = iArr[dVar.f143581c.ordinal()];
                    if (i16 == 1) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1143469074, R.string.lbl_weight, o0VarE, false);
                    } else if (i16 == 2 || i16 == 3) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1143464688, R.string.lbl_distance, o0VarE, false);
                    } else if (i16 == 4) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1143461701, R.string.activities_ascent_label, o0VarE, false);
                    } else if (i16 != 5) {
                        o0VarE.C(-1087398221);
                        o0VarE.g0(false);
                        strJ = "";
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1143458406, R.string.activity_details_power, o0VarE, false);
                    }
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String str = cVar.f2241i;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = cVar.f2242j;
                    String str3 = strJ;
                    String str4 = str;
                    String str5 = cVar.f2243k;
                    Integer numValueOf = bVar != null ? Integer.valueOf(bVar.f143548a) : null;
                    if (numValueOf == null) {
                        o0VarE.C(-1086853860);
                        o0VarE.g0(false);
                        strL = null;
                    } else {
                        strL = u0.l(o0VarE, -1086853859, numValueOf, o0VarE, false);
                    }
                    if (strL == null) {
                        strL = "";
                    }
                    boolean zR = h0.R(x.k(q91.b.MILE, q91.b.KILOMETER, q91.b.KILOGRAM, q91.b.POUND), bVar);
                    boolean z17 = cVar.f2246n;
                    Integer numValueOf2 = bVar != null ? Integer.valueOf(bVar.f143549b) : null;
                    if (numValueOf2 == null) {
                        o0VarE.C(-1086239812);
                        z15 = false;
                        o0VarE.g0(false);
                        strL2 = null;
                    } else {
                        z15 = false;
                        strL2 = u0.l(o0VarE, -1086239811, numValueOf2, o0VarE, false);
                    }
                    int i17 = (i15 & 57344) | 48 | ((i15 << 9) & 458752);
                    z16 = z15;
                    z.a(str3, str4, str2, strL, rVarF, z17, str5, strL2 != null ? strL2 : "", null, 0, 0, false, zR, false, aVar, lVar, o0VarE, 24576, i17, 9984);
                    o0VarE = o0VarE;
                    o0VarE.g0(z16);
                }
                o0VarE.g0(z16);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug2.p(cVar, lVar, lVar2, aVar, z14, i14, 9);
        }
    }
}
