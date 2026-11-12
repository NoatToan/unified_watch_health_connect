package c22;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc22/c0;", "", "", "", "xValues", "yValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Float> f23011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Float> f23012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23013c;

    public c0(List<Float> list, List<Float> list2) {
        Object objE;
        Float f14;
        list.getClass();
        list2.getClass();
        this.f23011a = list;
        this.f23012b = list2;
        float f15 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        if (list.size() != list2.size()) {
            objE = p13.j0.f134944a;
        } else {
            int size = list.size();
            int i14 = size - 1;
            ArrayList arrayList = new ArrayList(i14);
            int i15 = 0;
            int i16 = 0;
            while (i16 < i14) {
                int i17 = i16 + 1;
                arrayList.add(Float.valueOf(list.get(i17).floatValue() - list.get(i16).floatValue()));
                i16 = i17;
            }
            ArrayList arrayList2 = new ArrayList(i14);
            int i18 = 0;
            while (i18 < i14) {
                int i19 = i18 + 1;
                arrayList2.add(Float.valueOf((list2.get(i19).floatValue() - list2.get(i18).floatValue()) / ((Number) arrayList.get(i18)).floatValue()));
                i18 = i19;
            }
            int size2 = list.size();
            ArrayList arrayList3 = new ArrayList(size2);
            for (int i24 = 0; i24 < size2; i24++) {
                arrayList3.add(fValueOf);
            }
            arrayList3.set(0, arrayList2.get(0));
            arrayList3.set(i14, arrayList2.get(size - 2));
            for (int i25 = 1; i25 < i14; i25++) {
                int i26 = i25 - 1;
                if (((Number) arrayList2.get(i25)).floatValue() * ((Number) arrayList2.get(i26)).floatValue() <= 0.0f) {
                    arrayList3.set(i25, fValueOf);
                } else {
                    arrayList3.set(i25, Float.valueOf((((Number) arrayList2.get(i25)).floatValue() + ((Number) arrayList2.get(i26)).floatValue()) * 0.5f));
                }
            }
            while (i15 < i14) {
                if (((Number) arrayList2.get(i15)).floatValue() == f15) {
                    arrayList3.set(i15, fValueOf);
                    arrayList3.set(i15 + 1, fValueOf);
                    f14 = fValueOf;
                } else {
                    float fFloatValue = ((Number) arrayList3.get(i15)).floatValue() / ((Number) arrayList2.get(i15)).floatValue();
                    int i27 = i15 + 1;
                    float fFloatValue2 = ((Number) arrayList3.get(i27)).floatValue() / ((Number) arrayList2.get(i15)).floatValue();
                    double d14 = 2;
                    f14 = fValueOf;
                    float fPow = ((float) Math.pow(fFloatValue, d14)) + ((float) Math.pow(fFloatValue2, d14));
                    if (fPow > 9.0f) {
                        float fSqrt = 3.0f / ((float) Math.sqrt(fPow));
                        arrayList3.set(i15, Float.valueOf(((Number) arrayList2.get(i15)).floatValue() * fFloatValue * fSqrt));
                        arrayList3.set(i27, Float.valueOf(((Number) arrayList2.get(i15)).floatValue() * fSqrt * fFloatValue2));
                    }
                }
                i15++;
                fValueOf = f14;
                f15 = 0.0f;
            }
            objE = i53.a.e(arrayList3);
        }
        this.f23013c = objE;
    }
}
