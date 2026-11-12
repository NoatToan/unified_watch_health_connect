package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class gmh {

    @RequiresApi(26)
    public static class a {
        public static float[] a(Path path, float f) {
            return path.approximate(f);
        }
    }

    @RequiresApi(26)
    public static Collection<dmh> a(Path path, @FloatRange(from = 0.0d) float f) {
        float[] fArrA = a.a(path, f);
        int length = fArrA.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = fArrA[i2];
            float f3 = fArrA[i2 + 1];
            float f4 = fArrA[i2 + 2];
            float f5 = fArrA[i3];
            float f6 = fArrA[i3 + 1];
            float f7 = fArrA[i3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new dmh(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
