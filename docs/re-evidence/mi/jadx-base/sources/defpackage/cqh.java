package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Float f14617a = Float.valueOf(0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<Float> f14618b = new ArrayList();

    public static Float a(Float f) {
        if (f14618b.size() < 5) {
            f14618b.add(f);
            return Float.valueOf(-999999.0f);
        }
        f14618b.remove(0);
        f14618b.add(f);
        return c(f14618b);
    }

    public static Float b(float f) {
        Float fValueOf;
        if (f14617a.floatValue() == 0.0f) {
            f14617a = Float.valueOf(f);
            fValueOf = Float.valueOf(f);
        } else {
            fValueOf = (f >= 150.0f || f <= -150.0f || f14617a.floatValue() >= 150.0f || f14617a.floatValue() <= -150.0f) ? Float.valueOf((f14617a.floatValue() * 0.2f) + (f * 0.9f)) : Float.valueOf((f * 0.9f) + (f14617a.floatValue() * 0.1f));
            f14617a = fValueOf;
        }
        if (fValueOf.floatValue() >= 140.0f) {
            return Float.valueOf(140.0f);
        }
        return fValueOf.floatValue() <= 65.0f ? Float.valueOf(65.0f) : fValueOf;
    }

    public static Float c(List<Float> list) {
        Float fValueOf = Float.valueOf(0.0f);
        for (int i = 0; i < list.size(); i++) {
            fValueOf = Float.valueOf(fValueOf.floatValue() + list.get(i).floatValue());
        }
        return Float.valueOf(fValueOf.floatValue() / list.size());
    }

    public static float d(float f) {
        if (f == 0.0f) {
            f = 103.5f;
        }
        float fFloatValue = a(Float.valueOf(f)).floatValue();
        return ((((-999999.0f == fFloatValue ? b(f).floatValue() : b(fFloatValue).floatValue()) * 16.0f) - 1650.0f) / 767.0f) * 1000.0f * 0.1f * 0.5f;
    }
}
