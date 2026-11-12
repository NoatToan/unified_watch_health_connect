package vn;

import ak0.r;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.ve;
import j20.x;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import sn.h;
import tn.k;
import wn.g;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, wn.a<h> aVar, h hVar, im.b bVar, e23.a<Unit> aVar2, boolean z14, boolean z15, m mVar, int i14, int i15) {
        int i16;
        wn.a<h> aVar3;
        boolean z16;
        boolean z17;
        o0 o0Var;
        boolean z18;
        boolean z19;
        p2 p2VarI0;
        boolean z24;
        o0 o0VarL = vb.h.l(529135692, aVar2, str, mVar);
        if ((i14 & 6) == 0) {
            i16 = (o0VarL.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            aVar3 = aVar;
            i16 |= o0VarL.r(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarL.B(hVar) : o0VarL.r(hVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarL.r(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarL.r(aVar2) ? 16384 : 8192;
        }
        int i17 = 196608 | i16;
        int i18 = i15 & 64;
        if (i18 == 0) {
            if ((1572864 & i14) == 0) {
                z16 = z15;
                i17 |= o0VarL.h(z16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((599187 & i17) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarL.n(i17 & 1, z17)) {
                if (i18 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                x1 x1Var = n.f135158a;
                Context context = (Context) o0VarL.A(AndroidCompositionLocals_androidKt.f6042b);
                o0Var = o0VarL;
                ve.a(null, null, k.b(d92.b.f58623a, o0VarL), 0L, 0.0f, 0.0f, null, f.c(1305723665, new e11.n(str, aVar3, hVar, z24, bVar, aVar2, context, new l22.a(context), 19), o0VarL), o0Var, 12582912, 123);
                z19 = z24;
                z18 = true;
            } else {
                o0Var = o0VarL;
                o0Var.e();
                z18 = z14;
                z19 = z16;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new r(str, aVar, hVar, bVar, aVar2, z18, z19, i14, i15);
            }
        }
        i17 = 1769472 | i16;
        z16 = z15;
        if ((599187 & i17) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarL.n(i17 & 1, z17)) {
            if (i18 != 0) {
                z24 = true;
            } else {
                z24 = z16;
            }
            x1 x1Var2 = n.f135158a;
            Context context2 = (Context) o0VarL.A(AndroidCompositionLocals_androidKt.f6042b);
            o0Var = o0VarL;
            ve.a(null, null, k.b(d92.b.f58623a, o0VarL), 0L, 0.0f, 0.0f, null, f.c(1305723665, new e11.n(str, aVar3, hVar, z24, bVar, aVar2, context2, new l22.a(context2), 19), o0VarL), o0Var, 12582912, 123);
            z19 = z24;
            z18 = true;
        } else {
            o0Var = o0VarL;
            o0Var.e();
            z18 = z14;
            z19 = z16;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(str, aVar, hVar, bVar, aVar2, z18, z19, i14, i15);
        }
    }

    public static final String b(g gVar, Context context, l22.a aVar) {
        String str;
        String str2;
        String str3 = "";
        if (gVar == null || (str = gVar.f186102c) == null) {
            str = "";
        }
        String strC = c(gVar, context);
        if (gVar != null && (str2 = gVar.f186101b) != null) {
            str3 = str2;
        }
        oi0.b bVar = new oi0.b(aVar, strC);
        bVar.b();
        bVar.c();
        bVar.l();
        bVar.K();
        bVar.M();
        String str4 = bVar.f132238b;
        oi0.b bVar2 = new oi0.b(aVar, str3);
        bVar2.b();
        bVar2.c();
        bVar2.l();
        bVar2.K();
        bVar2.M();
        return x.d(str, ", ", str4, StringUtils.SPACE, bVar2.f132238b);
    }

    public static final String c(g gVar, Context context) {
        String str;
        if (gVar != null && (str = gVar.f186100a) != null) {
            return str;
        }
        String string = context.getString(R.string.no_value);
        string.getClass();
        return string;
    }
}
