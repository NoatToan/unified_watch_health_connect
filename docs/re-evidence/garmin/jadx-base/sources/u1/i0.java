package u1;

import android.os.Build;
import android.widget.EdgeEffect;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu1/i0;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f167546a = new i0();

    private i0() {
    }

    public static float a(EdgeEffect edgeEffect, float f14, float f15, g6.c cVar) {
        float f16 = j0.f167574a;
        double f75991a = cVar.getF75991a() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f14) * 0.35f;
        double d14 = ((double) j0.f167574a) * f75991a;
        if (((float) (Math.exp((j0.f167575b / j0.f167576c) * Math.log(dAbs / d14)) * d14)) > b(edgeEffect) * f15) {
            return 0.0f;
        }
        c(edgeEffect, MathKt.c(f14));
        return f14;
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        l.f167596a.getClass();
        return l.b(edgeEffect);
    }

    public static void c(EdgeEffect edgeEffect, int i14) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i14);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i14);
        }
    }

    public static float d(EdgeEffect edgeEffect, float f14, float f15) {
        if (Build.VERSION.SDK_INT >= 31) {
            l.f167596a.getClass();
            return l.c(edgeEffect, f14, f15);
        }
        edgeEffect.onPull(f14, f15);
        return f14;
    }

    public static void e(EdgeEffect edgeEffect, float f14) {
        if (!(edgeEffect instanceof q0)) {
            edgeEffect.onRelease();
            return;
        }
        q0 q0Var = (q0) edgeEffect;
        float f15 = q0Var.f167659b + f14;
        q0Var.f167659b = f15;
        if (Math.abs(f15) > q0Var.f167658a) {
            q0Var.onRelease();
        }
    }
}
