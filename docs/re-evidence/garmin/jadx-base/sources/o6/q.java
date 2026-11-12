package o6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f129542a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f129543b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129544c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f129545d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f129546e = new float[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f129547f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f129548g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f129549h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f129550i = 0;

    public final void a(float f14, int i14) {
        int i15 = this.f129547f;
        int[] iArr = this.f129545d;
        if (i15 >= iArr.length) {
            this.f129545d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f129546e;
            this.f129546e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f129545d;
        int i16 = this.f129547f;
        iArr2[i16] = i14;
        float[] fArr2 = this.f129546e;
        this.f129547f = i16 + 1;
        fArr2[i16] = f14;
    }

    public final void b(int i14, int i15) {
        int i16 = this.f129544c;
        int[] iArr = this.f129542a;
        if (i16 >= iArr.length) {
            this.f129542a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f129543b;
            this.f129543b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f129542a;
        int i17 = this.f129544c;
        iArr3[i17] = i14;
        int[] iArr4 = this.f129543b;
        this.f129544c = i17 + 1;
        iArr4[i17] = i15;
    }

    public final void c(int i14, String str) {
        int i15 = this.f129550i;
        int[] iArr = this.f129548g;
        if (i15 >= iArr.length) {
            this.f129548g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f129549h;
            this.f129549h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f129548g;
        int i16 = this.f129550i;
        iArr2[i16] = i14;
        String[] strArr2 = this.f129549h;
        this.f129550i = i16 + 1;
        strArr2[i16] = str;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TypedBundle{mCountInt=");
        sb3.append(this.f129544c);
        sb3.append(", mCountFloat=");
        sb3.append(this.f129547f);
        sb3.append(", mCountString=");
        return am.j.q(sb3, this.f129550i, ", mCountBoolean=0}");
    }
}
