package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes7.dex */
public class zi3 {
    public static Path a(RectF rectF) {
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        return path;
    }

    public static Path b(RectF rectF, float f) {
        return c(rectF, f, 1);
    }

    public static Path c(RectF rectF, float f, int i) {
        Path path = new Path();
        path.addRoundRect(rectF, pxk.a(i, f), Path.Direction.CCW);
        return path;
    }
}
