package defpackage;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes4.dex */
public class ldm implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24944a;

    public ldm(float f) {
        this.f24944a = f;
    }

    public static float a(ReadableMap readableMap) {
        if (readableMap.getType("springDamping").equals(ReadableType.Number)) {
            return (float) readableMap.getDouble("springDamping");
        }
        return 0.5f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        double dPow = Math.pow(2.0d, (-10.0f) * f);
        float f2 = this.f24944a;
        return (float) ((dPow * Math.sin(((((double) (f - (f2 / 4.0f))) * 3.141592653589793d) * 2.0d) / ((double) f2))) + 1.0d);
    }
}
