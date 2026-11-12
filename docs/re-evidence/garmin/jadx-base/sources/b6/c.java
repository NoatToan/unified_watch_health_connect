package b6;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import g6.q;
import g6.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import o4.f0;
import p005kotlin.math.MathKt;
import p13.y;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final float a(long j8, float f14, g6.c cVar) {
        q.f76018b.getClass();
        if (q.b(j8, q.f76020d)) {
            return f14;
        }
        long jC = q.c(j8);
        r.a aVar = r.f76022b;
        aVar.getClass();
        if (r.b(jC, r.f76023c)) {
            return cVar.g0(j8);
        }
        aVar.getClass();
        if (r.b(jC, r.f76024d)) {
            return q.d(j8) * f14;
        }
        return Float.NaN;
    }

    public static final float b(long j8, float f14, g6.c cVar) {
        float fD;
        long jC = q.c(j8);
        r.f76022b.getClass();
        if (r.b(jC, r.f76023c)) {
            if (cVar.getF75992b() <= 1.05d) {
                return cVar.g0(j8);
            }
            fD = q.d(j8) / q.d(cVar.D(f14));
        } else {
            if (!r.b(jC, r.f76024d)) {
                return Float.NaN;
            }
            fD = q.d(j8);
        }
        return fD * f14;
    }

    public static final void c(Spannable spannable, long j8, int i14, int i15) {
        if (j8 != 16) {
            spannable.setSpan(new ForegroundColorSpan(f0.j(j8)), i14, i15, 33);
        }
    }

    public static final void d(Spannable spannable, long j8, g6.c cVar, int i14, int i15) {
        long jC = q.c(j8);
        r.f76022b.getClass();
        if (r.b(jC, r.f76023c)) {
            spannable.setSpan(new AbsoluteSizeSpan(MathKt.c(cVar.g0(j8)), false), i14, i15, 33);
        } else if (r.b(jC, r.f76024d)) {
            spannable.setSpan(new RelativeSizeSpan(q.d(j8)), i14, i15, 33);
        }
    }

    public static final void e(Spannable spannable, z5.c cVar, int i14, int i15) {
        if (cVar != null) {
            a.f16162a.getClass();
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            Iterator<z5.b> it = cVar.f202443a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f202440a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i14, i15, 33);
        }
    }
}
