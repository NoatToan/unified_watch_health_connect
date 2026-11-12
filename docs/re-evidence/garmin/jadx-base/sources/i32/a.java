package i32;

import android.view.animation.Interpolator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li32/a;", "Landroid/view/animation/Interpolator;", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1743a f90780a = new C1743a(null);

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f14) {
        double d14 = f14;
        C1743a c1743a = f90780a;
        if (d14 < 0.3374d) {
            float f15 = f14 * 1.1226f;
            c1743a.getClass();
            return f15 * f15 * 8.0f;
        }
        if (d14 < 0.483d) {
            float f16 = f14 - 0.43f;
            c1743a.getClass();
            return (f16 * f16 * 8.0f * 3.5f) + 1.25f;
        }
        if (d14 < 0.7257d) {
            float f17 = f14 - 0.62f;
            c1743a.getClass();
            return (f17 * f17 * 8.0f * 2.5f) + 0.8f;
        }
        if (d14 < 0.8617d) {
            float f18 = f14 - 0.795f;
            c1743a.getClass();
            return (f18 * f18 * 8.0f * (-3.5f)) + 1.15f;
        }
        float f19 = (f14 * 1.1226f) - 1.0435f;
        c1743a.getClass();
        return (f19 * f19 * 8.0f) + 0.95f;
    }

    /* JADX INFO: renamed from: i32.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li32/a$a;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1743a {
        public /* synthetic */ C1743a(j jVar) {
            this();
        }

        private C1743a() {
        }
    }
}
