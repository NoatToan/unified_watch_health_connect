package w5;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public static final Typeface a(Typeface typeface, e0.d dVar, Context context) {
        String strB;
        boolean z14;
        float f182090b;
        s0.f182161a.getClass();
        if (typeface == null) {
            return null;
        }
        List<e0.a> list = dVar.f182093a;
        List<e0.a> list2 = dVar.f182093a;
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal = s0.f182162b;
        Paint paint = threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        g6.e eVarB = xy2.b.b(context);
        int i14 = 0;
        int i15 = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i15 == 0) {
            strB = i6.b.b(list2, null, new w40.d(eVarB), 31);
        } else {
            int size = list2.size();
            String strConcat = "";
            boolean z15 = false;
            while (i14 < size) {
                e0.a aVar = list2.get(i14);
                if (p005kotlin.jvm.internal.s.g(aVar.getF182091a(), "wght")) {
                    f182090b = j23.t.d(aVar.getF182090b() + i15, 1.0f, 1000.0f);
                    z14 = true;
                } else {
                    z14 = z15;
                    f182090b = aVar.getF182090b();
                }
                if (i14 != 0) {
                    strConcat = strConcat.concat(",");
                }
                strConcat = strConcat + CoreConstants.SINGLE_QUOTE_CHAR + aVar.getF182091a() + "' " + f182090b;
                i14++;
                z15 = z14;
            }
            if (z15) {
                strB = strConcat;
            } else {
                float fD = j23.t.d(i15 + 400.0f, 1.0f, 1000.0f);
                if (!list2.isEmpty()) {
                    strConcat = strConcat.concat(",");
                }
                strB = strConcat + "'wght' " + fD;
            }
        }
        paint.setFontVariationSettings(strB);
        return paint.getTypeface();
    }
}
