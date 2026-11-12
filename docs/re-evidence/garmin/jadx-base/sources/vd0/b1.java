package vd0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import l72.i3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f177173a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f177175b;

        static {
            int[] iArr = new int[je0.g.values().length];
            try {
                iArr[je0.g.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[je0.g.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f177174a = iArr;
            int[] iArr2 = new int[g2.values().length];
            try {
                iArr2[g2.SEVEN_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g2.TOTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f177175b = iArr2;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f177173a = 96;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(pe0.f fVar, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, zc.d dVar, e23.l lVar, e23.a aVar6, p3.m mVar, int i14) {
        e23.a aVar7;
        p3.o0 o0Var;
        boolean z16;
        int i15;
        boolean z17;
        char c14;
        int i16;
        p3.p1 p1Var;
        p3.p1 p1Var2;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1651104935);
        int i17 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536) | (o0VarE.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar5) ? 8388608 : 4194304) | (o0VarE.r(dVar) ? 67108864 : 33554432) | (o0VarE.r(lVar) ? 536870912 : 268435456);
        char c15 = o0VarE.r(aVar6) ? (char) 4 : (char) 2;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (c15 & 3) == 2) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new l22.a(context);
                o0VarE.K(objQ);
            }
            l22.a aVar8 = (l22.a) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = Boolean.valueOf(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y());
                o0VarE.K(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var4 = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p3.p1 p1Var5 = (p3.p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p3.p0.n(g2.SEVEN_DAY);
                o0VarE.K(objQ6);
            }
            p3.p1 p1Var6 = (p3.p1) objQ6;
            je0.j jVar = fVar != null ? fVar.f137427h : null;
            je0.j jVar2 = je0.j.ACTIVE;
            int i18 = R.string.lbl_gear_retire;
            if (jVar == jVar2) {
                i15 = -1868876607;
                z16 = false;
            } else {
                z16 = false;
                i15 = -1868875133;
                i18 = R.string.lbl_gear_unretire;
            }
            i3 i3Var = new i3("retire", com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i18, o0VarE, z16), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_remove);
            d92.b.f58623a.getClass();
            o0Var = o0VarE;
            z02.d.a((fVar == null || z14) ? true : z16, z3.f.c(-615186828, new r11.k(fVar, aVar, i3Var, new i3("remove", strQ, false, o4.d0.a(d92.b.a(o0VarE).k().e()), (o4.d0) null, (u4.d) null, (String) null, 116, (p005kotlin.jvm.internal.j) null), aVar4, p1Var3, p1Var5), o0VarE), null, null, null, z3.f.c(385218288, new f21.r(fVar, dVar, aVar3, aVar8, aVar2, lVar, zBooleanValue, p1Var4, p1Var6), o0VarE), o0Var, 196656, 28);
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0Var.C(-2088653745);
                l72.c1 c1Var = l72.c1.f110940a;
                c22.x0.f23314a.getClass();
                String strW = gl1.d.W(c22.x0.f23689w8);
                String strW2 = gl1.d.W(c22.x0.f23672v8);
                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_remove);
                String strQ3 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                boolean z18 = (i17 & 29360128) == 8388608;
                Object objQ7 = o0Var.q();
                if (z18 || objQ7 == c2565a) {
                    p1Var2 = p1Var5;
                    objQ7 = new p40.j0(aVar5, p1Var2, 20);
                    o0Var.K(objQ7);
                } else {
                    p1Var2 = p1Var5;
                }
                e23.a<Unit> aVar9 = (e23.a) objQ7;
                Object objQ8 = o0Var.q();
                if (objQ8 == c2565a) {
                    objQ8 = new c(p1Var2, 9);
                    o0Var.K(objQ8);
                }
                z17 = false;
                c14 = 4;
                c1Var.a(false, strW, strW2, null, null, strQ2, true, false, aVar9, strQ3, (e23.a) objQ8, o0Var, 1572864, 6, 153);
                o0Var.g0(false);
            } else {
                z17 = false;
                c14 = 4;
                o0Var.C(-2088130775);
                o0Var.g0(false);
            }
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0Var.C(-2088067597);
                l72.c1 c1Var2 = l72.c1.f110940a;
                c22.x0.f23314a.getClass();
                String strW3 = gl1.d.W(c22.x0.f23723y8);
                String strW4 = gl1.d.W(c22.x0.f23706x8);
                String strQ4 = gl1.y.Q(o0Var, R.string.lbl_gear_retire);
                String strQ5 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                int i19 = i17 & 3670016;
                i16 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                boolean z19 = i19 == 1048576 ? true : z17;
                Object objQ9 = o0Var.q();
                if (z19 || objQ9 == c2565a) {
                    aVar7 = aVar4;
                    p1Var = p1Var3;
                    objQ9 = new p40.j0(aVar7, p1Var, 21);
                    o0Var.K(objQ9);
                } else {
                    aVar7 = aVar4;
                    p1Var = p1Var3;
                }
                e23.a<Unit> aVar10 = (e23.a) objQ9;
                Object objQ10 = o0Var.q();
                if (objQ10 == r15) {
                    objQ10 = new c(p1Var, 10);
                    o0Var.K(objQ10);
                }
                c1Var2.a(false, strW3, strW4, null, null, strQ4, false, false, aVar10, strQ5, (e23.a) objQ10, o0Var, 0, 6, 217);
                o0Var.g0(z17);
            } else {
                aVar7 = aVar4;
                i16 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                o0Var.C(-2087579223);
                o0Var.g0(z17);
            }
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0Var.C(-2087514123);
                l72.c1 c1Var3 = l72.c1.f110940a;
                c22.x0.f23314a.getClass();
                String strW5 = gl1.d.W(c22.x0.T8);
                String strW6 = gl1.d.W(c22.x0.U8);
                String strQ6 = gl1.y.Q(o0Var, R.string.lbl_gear_unretire);
                String strQ7 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                boolean z24 = (i17 & 3670016) == i16 ? true : z17;
                Object objQ11 = o0Var.q();
                if (z24 || objQ11 == r15) {
                    objQ11 = new p40.j0(aVar7, p1Var4, 22);
                    o0Var.K(objQ11);
                }
                e23.a<Unit> aVar11 = (e23.a) objQ11;
                Object objQ12 = o0Var.q();
                if (objQ12 == r15) {
                    objQ12 = new c(p1Var4, 11);
                    o0Var.K(objQ12);
                }
                c1Var3.a(false, strW5, strW6, null, null, strQ6, false, false, aVar11, strQ7, (e23.a) objQ12, o0Var, 0, 6, 217);
                o0Var.g0(z17);
            } else {
                o0Var.C(-2087027671);
                o0Var.g0(z17);
            }
            if (z15) {
                o0Var.C(-2086999771);
                l72.c1 c1Var4 = l72.c1.f110940a;
                String strQ8 = gl1.y.Q(o0Var, R.string.msg_something_went_wrong_please_try_again_later);
                String strQ9 = gl1.y.Q(o0Var, R.string.lbl_ok);
                boolean z25 = (c15 & 14) != c14 ? z17 : true;
                Object objQ13 = o0Var.q();
                if (z25 || objQ13 == r15) {
                    objQ13 = new ux1.g(aVar6, 13);
                    o0Var.K(objQ13);
                }
                c1Var4.a(false, null, strQ8, null, null, strQ9, false, false, (e23.a) objQ13, null, null, o0Var, 0, 0, 1755);
                o0Var.g0(z17);
            } else {
                o0Var.C(-2086749911);
                o0Var.g0(z17);
            }
        } else {
            aVar7 = aVar4;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.f0(fVar, z14, z15, aVar, aVar2, aVar3, aVar7, aVar5, dVar, lVar, aVar6, i14);
        }
    }

    public static final void b(pe0.i iVar, l22.a aVar, boolean z14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(473230212);
        int i15 = (o0VarE.B(iVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar2, 0.0f, eVar.f97918c, 1);
            z3.e eVarC = z3.f.c(1608448779, new z(i16, aVar, iVar, z14), o0VarE);
            int i17 = (l72.x0.f111348c << 6) | 48;
            x0Var.e(rVarA, eVarC, o0VarE, i17, 0);
            bVar.getClass();
            x0Var.e(c2.l.A(aVar2, 0.0f, eVar.f97918c, 1), z3.f.c(-580880460, new a0(aVar, iVar, i16), o0VarE), o0VarE, i17, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(i14, aVar, iVar, z14);
        }
    }
}
