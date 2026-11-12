package a03;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {
    public static final Object a(Map map, float f14, boolean z14) {
        if (map.isEmpty()) {
            vb.h.s("The anchors were empty when trying to find the closest anchor");
            return null;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
            float f15 = z14 ? fFloatValue - f14 : f14 - fFloatValue;
            if (f15 < 0.0f) {
                f15 = Float.POSITIVE_INFINITY;
            }
            do {
                Object next2 = it.next();
                float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                float f16 = z14 ? fFloatValue2 - f14 : f14 - fFloatValue2;
                if (f16 < 0.0f) {
                    f16 = Float.POSITIVE_INFINITY;
                }
                if (Float.compare(f15, f16) > 0) {
                    next = next2;
                    f15 = f16;
                }
            } while (it.hasNext());
        }
        return ((Map.Entry) next).getKey();
    }
}
