package ie2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lie2/g;", "", "", "colors", "", "startPoints", "<init>", "([I[F)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f93123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f93124b;

    public g(int[] iArr, float[] fArr) {
        iArr.getClass();
        fArr.getClass();
        this.f93123a = iArr;
        this.f93124b = fArr;
        if (iArr.length != fArr.length) {
            vb.h.s("colors and startPoints should be same length");
            throw null;
        }
        if (iArr.length == 0) {
            vb.h.s("No colors have been defined");
            throw null;
        }
        int length = fArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            float[] fArr2 = this.f93124b;
            if (fArr2[i14] <= fArr2[i14 - 1]) {
                vb.h.s("startPoints should be in increasing order");
                throw null;
            }
        }
    }
}
