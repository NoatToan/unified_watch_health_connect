package b7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f16253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f16254b;

    public f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f16253a = new int[size];
        this.f16254b = new float[size];
        for (int i14 = 0; i14 < size; i14++) {
            this.f16253a[i14] = list.get(i14).intValue();
            this.f16254b[i14] = list2.get(i14).floatValue();
        }
    }

    public f(int i14, int i15) {
        this.f16253a = new int[]{i14, i15};
        this.f16254b = new float[]{0.0f, 1.0f};
    }

    public f(int i14, int i15, int i16) {
        this.f16253a = new int[]{i14, i15, i16};
        this.f16254b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
