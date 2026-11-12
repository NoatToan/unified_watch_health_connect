package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PointF f38366a = new PointF();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int b(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static boolean d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void c(gq gqVar, Path path) {
        path.reset();
        PointF pointFE = gqVar.e();
        path.moveTo(pointFE.x, pointFE.y);
        f38366a.set(pointFE.x, pointFE.y);
        for (int i = 0; i < gqVar.a().size(); i++) {
            fr frVar = gqVar.a().get(i);
            PointF pointFA = frVar.a();
            PointF pointFB = frVar.b();
            PointF pointFC = frVar.c();
            PointF pointF = f38366a;
            if (pointFA.equals(pointF) && pointFB.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
            } else {
                path.cubicTo(pointFA.x, pointFA.y, pointFB.x, pointFB.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
        }
        if (gqVar.d()) {
            path.close();
        }
    }

    static int c(float f, float f2) {
        return e((int) f, (int) f2);
    }

    private static int e(int i, int i2) {
        return i - (i2 * b(i, i2));
    }

    private static int b(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) < 0 && i % i2 != 0) ? i3 - 1 : i3;
    }

    public static int b(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void d(fo foVar, int i, List<fo> list, fo foVar2, KeyPathElementContent keyPathElementContent) {
        if (foVar.e(keyPathElementContent.getName(), i)) {
            list.add(foVar2.c(keyPathElementContent.getName()).e(keyPathElementContent));
        }
    }
}
