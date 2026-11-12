package b81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import g81.a0;
import g81.b0;
import gl1.y;
import java.util.ArrayList;
import m92.o;
import o82.g;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16397a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130851d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16397a = iArr;
        }
    }

    public static final void a(DateTime dateTime, DateTime dateTime2, g gVar, n61.f fVar, m mVar, int i14) {
        gVar.getClass();
        o0 o0VarE = mVar.E(2083735871);
        int i15 = 4;
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(dateTime) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(dateTime2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(gVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 2048 : 1024;
        }
        boolean z14 = true;
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(true) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l22.a aVar = new l22.a(context);
            int i17 = a.f16397a[gVar.ordinal()];
            if (i17 != 1 && i17 == 2) {
                i15 = 5;
            }
            int i18 = i15;
            n61.c enduranceScore = fVar.getEnduranceScore();
            ArrayList arrayList = null;
            a0 a0VarA = b0.a(fVar, aVar, enduranceScore != null ? enduranceScore.b() : null);
            if (a0VarA != null) {
                i53.c<t71.a> cVar = a0VarA.f76266c.f76427c;
                ArrayList arrayList2 = new ArrayList();
                for (t71.a aVar2 : cVar) {
                    LocalDate localDate = aVar2.f163084b;
                    if (!localDate.isBefore(dateTime.toLocalDate()) && !localDate.isAfter(dateTime2.toLocalDate())) {
                        arrayList2.add(aVar2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z14 = false;
            }
            if (z14) {
                o0VarE.C(1416584995);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1414086395);
                o.a(null, y.Q(o0VarE, R.string.lbl_endurance_score), null, null, z3.f.c(677385690, new a03.g(arrayList3, context, dateTime, dateTime2, i18, 9), o0VarE), null, null, o0VarE, 24576, 109);
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(dateTime, dateTime2, gVar, fVar, i14, 10);
        }
    }
}
