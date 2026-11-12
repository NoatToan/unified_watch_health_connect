package kb0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.v;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(v vVar, v vVar2, List<mb0.b> list, boolean z14, String str, e23.l<? super v, Unit> lVar, e23.l<? super v, Unit> lVar2, e23.l<? super mb0.b, Unit> lVar3, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14, int i15) {
        String str2;
        e23.l<? super v, Unit> lVar4;
        e23.l<? super v, Unit> lVar5;
        e23.l<? super mb0.b, Unit> lVar6;
        e23.a<Unit> aVar4;
        e23.a<Unit> aVar5;
        int i16;
        o0 o0Var;
        boolean z15;
        boolean z16;
        String strJ;
        boolean z17;
        list.getClass();
        str.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1119106349);
        int i17 = (o0VarE.r(vVar) ? 4 : 2) | i14 | (o0VarE.r(vVar2) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            str2 = str;
            i17 |= o0VarE.B(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i14) == 0) {
            lVar4 = lVar;
            i17 |= o0VarE.r(lVar4) ? 131072 : 65536;
        } else {
            lVar4 = lVar;
        }
        if ((1572864 & i14) == 0) {
            lVar5 = lVar2;
            i17 |= o0VarE.r(lVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar5 = lVar2;
        }
        if ((12582912 & i14) == 0) {
            lVar6 = lVar3;
            i17 |= o0VarE.r(lVar6) ? 8388608 : 4194304;
        } else {
            lVar6 = lVar3;
        }
        if ((100663296 & i14) == 0) {
            aVar4 = aVar;
            i17 |= o0VarE.r(aVar4) ? 67108864 : 33554432;
        } else {
            aVar4 = aVar;
        }
        if ((805306368 & i14) == 0) {
            i17 |= o0VarE.r(aVar2) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            aVar5 = aVar3;
            i16 = i15 | (o0VarE.r(aVar5) ? 4 : 2);
        } else {
            aVar5 = aVar3;
            i16 = i15;
        }
        int i18 = i17;
        if (o0VarE.n(i18 & 1, ((i17 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(mb0.g.NONE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean zB = o0VarE.B(list);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z15 = false;
                            break;
                        }
                        Iterator it3 = it;
                        if (((mb0.b) it.next()).f117716b == mb0.c.ALREADY_SELECTED_NOT_CLICKABLE) {
                            z15 = true;
                            break;
                        }
                        it = it3;
                    }
                } else {
                    z15 = false;
                    break;
                }
                objQ2 = Boolean.valueOf(z15);
                o0VarE.K(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            if (zBooleanValue) {
                z16 = false;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1760348187, R.string.custom_sleep_windows_repeat_title, o0VarE, false);
            } else {
                z16 = false;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1760269044, R.string.custom_sleep_windows_title, o0VarE, false);
            }
            String str3 = strJ;
            String strJ2 = zBooleanValue ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1760160730, R.string.custom_sleep_windows_repeat_text, o0VarE, z16) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1760082579, R.string.custom_sleep_windows_text, o0VarE, z16);
            if (!list.isEmpty()) {
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z17 = false;
                        break;
                    } else if (((mb0.b) it4.next()).f117716b == mb0.c.SELECTED) {
                        z17 = true;
                        break;
                    }
                }
            } else {
                z17 = z16;
            }
            String strQ = y.Q(o0VarE, R.string.lbl_next);
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81537o;
            boolean z18 = (i18 & 1879048192) == 536870912;
            Object objQ3 = o0VarE.q();
            if (z18 || objQ3 == p3.m.a.f135155b) {
                objQ3 = new j22.d(aVar2, 24);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            da0.p.b("user_profile_advanced_sleep_windows_screen", str3, null, strJ2, null, strQ, (e23.a) objQ3, z17, null, null, false, null, null, false, false, aVar5, null, null, null, null, aVar6, z3.f.c(1091913171, new dv0.e(list, lVar6, str2, vVar, vVar2, lVar5, lVar4, z14, aVar4, context, p1Var), o0VarE), o0Var, 6, (i16 << 15) & 458752, 432, 2064148);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.i(vVar, vVar2, list, z14, str, lVar, lVar2, lVar3, aVar, aVar2, aVar3, i14, i15, 1);
        }
    }
}
