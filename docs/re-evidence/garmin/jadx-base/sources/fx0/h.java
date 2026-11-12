package fx0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.u;
import gl1.y;
import h4.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.t1;
import o4.d0;
import o70.t;
import p13.h0;
import p13.j0;
import p13.x;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    public static final void a(Integer num, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1121492796);
        int i16 = (o0VarE.B(num) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (num == null) {
                o0VarE.C(158781466);
                o0VarE.g0(false);
                i15 = 0;
            } else {
                o0VarE.C(158781467);
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(num.intValue())), null, null, null, null, null, o0VarE, 0, 62);
                LottieComposition f182175a = lottieCompositionResultRememberLottieComposition.getF182175a();
                i15 = 0;
                LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(f182175a, false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, o0VarE, 1572912, 956);
                LottieComposition f182175a2 = lottieCompositionResultRememberLottieComposition.getF182175a();
                boolean zB = o0VarE.B(lottieAnimationStateAnimateLottieCompositionAsState);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new e(lottieAnimationStateAnimateLottieCompositionAsState, 0);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(lottieAnimationStateAnimateLottieCompositionAsState, 0);
                        o0VarE.K(objQ);
                    }
                }
                LottieAnimationKt.LottieAnimation(f182175a2, (e23.a) objQ, x2.d(r.S, 1.0f), false, false, false, null, false, null, null, null, false, false, null, null, false, o0VarE, 384, 0, 65528);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            i15 = 0;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(num, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ea  */
    public static final void b(r rVar, String str, u4.d dVar, bx0.d.c cVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        ArrayList arrayList;
        String strK0;
        long jH;
        str.getClass();
        o0 o0VarE = mVar.E(-173606658);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(cVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            String strQ = y.Q(o0VarE, R.string.mct_log_symptoms);
            Collection collection = cVar.f21670b;
            if (collection == null) {
                collection = j0.f134944a;
            }
            Iterable iterable = cVar.f21671c;
            if (iterable == null) {
                iterable = j0.f134944a;
            }
            ArrayList arrayListC0 = h0.C0(collection, iterable);
            Iterable iterable2 = cVar.f21672d;
            if (iterable2 == null) {
                iterable2 = j0.f134944a;
            }
            ArrayList arrayListZ = h0.Z(h0.D0(h0.C0(arrayListC0, iterable2), cVar.f21673e));
            boolean zIsEmpty = arrayListZ.isEmpty();
            p3.m.a aVar = p3.m.f135153a;
            if (zIsEmpty) {
                o0VarE.C(667751336);
                o0VarE.g0(false);
                strK0 = "0";
                arrayList = arrayListZ;
            } else if (arrayListZ.size() <= 12) {
                o0VarE.C(667754060);
                boolean zR = o0VarE.r(context);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new a51.m(context, 10);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a51.m(context, 10);
                        o0VarE.K(objQ);
                    }
                }
                strK0 = h0.k0(arrayListZ, ", ", null, null, (e23.l) objQ, 30);
                arrayList = arrayListZ;
                o0VarE.g0(false);
            } else {
                arrayList = arrayListZ;
                o0VarE.C(667764848);
                int i16 = 11;
                List listSubList = arrayList.subList(0, 11);
                boolean zR2 = o0VarE.r(context);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new a51.m(context, i16);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a51.m(context, i16);
                        o0VarE.K(objQ2);
                    }
                }
                strK0 = h0.k0(x.k(h0.k0(listSubList, ", ", null, null, (e23.l) objQ2, 30), y.P(R.string.more_string, new Object[]{Integer.valueOf(arrayList.size() - 11)}, o0VarE)), ". ", null, null, null, 62);
                o0VarE.g0(false);
            }
            String strK1 = h0.k0(x.k(y.Q(o0VarE, R.string.mct_symptoms_logged), strK0), ". ", null, null, null, 62);
            yz1.d dVar2 = cVar.f21669a;
            d0 d0VarE = t.P0.e(null, o0VarE, 1);
            if (d0VarE == null) {
                o0VarE.C(667778885);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(667776870);
                o0VarE.g0(false);
                jH = d0VarE.f128833a;
            }
            d0 d0VarA = d0.a(jH);
            boolean zR3 = o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new cy1.a(context, 15);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new cy1.a(context, 15);
                    o0VarE.K(objQ3);
                }
            }
            e23.a aVar2 = (e23.a) objQ3;
            z3.e eVarC = z3.f.c(-811601951, new g(strK1, arrayList, f75992b), o0VarE);
            boolean zR4 = o0VarE.r(context);
            Object objQ4 = o0VarE.q();
            if (zR4) {
                objQ4 = new cy1.a(context, 16);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new cy1.a(context, 16);
                    o0VarE.K(objQ4);
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar2, str, null, dVar, d0VarA, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ, null, null, aVar2, eVarC, (e23.a) objQ4, null, null, null, null, o0Var, (i15 & 14) | ((i15 << 3) & 896) | (57344 & (i15 << 6)), 24576, 990024);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(rVar, str, dVar, cVar, i14, 26);
        }
    }
}
