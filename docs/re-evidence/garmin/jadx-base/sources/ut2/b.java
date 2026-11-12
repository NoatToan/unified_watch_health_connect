package ut2;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static /* synthetic */ int[] f172626d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj2.b.d f172627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f172629c;

    public b(bj2.b.d dVar, int i14, int i15) {
        this.f172627a = dVar;
        this.f172628b = i14;
        this.f172629c = i15;
    }

    public static /* synthetic */ int[] a() {
        int[] iArr = f172626d;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[bj2.b.d.valuesCustom().length];
        try {
            iArr2[bj2.b.d.GFX_N_ORNTNS.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[bj2.b.d.GFX_ORNTN_0.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[bj2.b.d.GFX_ORNTN_180.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bj2.b.d.GFX_ORNTN_270.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[bj2.b.d.GFX_ORNTN_90.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f172626d = iArr2;
        return iArr2;
    }

    public final void b(int[] iArr, int[] iArr2) {
        int i14 = a()[this.f172627a.ordinal()];
        int i15 = this.f172628b;
        if (i14 == 2) {
            iArr2[0] = iArr[1];
            iArr2[1] = (i15 - 1) - iArr[0];
            return;
        }
        int i16 = this.f172629c;
        if (i14 == 3) {
            iArr2[0] = (i15 - 1) - iArr[0];
            iArr2[1] = (i16 - 1) - iArr[1];
        } else if (i14 != 4) {
            iArr2[0] = iArr[0];
            iArr2[1] = iArr[1];
        } else {
            iArr2[0] = (i16 - 1) - iArr[1];
            iArr2[1] = iArr[0];
        }
    }

    public final void c(int[] iArr, int[] iArr2) {
        int i14 = a()[this.f172627a.ordinal()];
        if (i14 == 2 || i14 == 4) {
            iArr2[0] = iArr[1];
            iArr2[1] = iArr[0];
        } else {
            iArr2[0] = iArr[0];
            iArr2[1] = iArr[1];
        }
    }
}
