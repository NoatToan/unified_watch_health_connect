package androidx.media3.extractor.mp4;

import androidx.media3.extractor.SniffFailure;
import defpackage.apv;

/* JADX INFO: loaded from: classes4.dex */
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final apv compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, int[] iArr) {
        apv apvVarE;
        this.majorBrand = i;
        if (iArr != null) {
            apvVarE = apv.c(iArr);
        } else {
            apvVarE = apv.e();
        }
        this.compatibleBrands = apvVarE;
    }
}
