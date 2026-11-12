package xz;

import com.github.mikephil.charting.data.BarEntry;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BK\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eBK\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxz/e;", "Lcom/github/mikephil/charting/data/BarEntry;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "", "data", "", "gradientColors", "maxYValue", "", "isTopRounded", "isBottomRounded", "<init>", "(FFLjava/lang/Object;[IFZZ)V", "", "(F[FLjava/lang/Object;[IFZZ)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends BarEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f192734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f192735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f192736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f192737d;

    public /* synthetic */ e(float f14, float f15, Object obj, int[] iArr, float f16, boolean z14, boolean z15, int i14, j jVar) {
        this(f14, f15, (i14 & 4) != 0 ? null : obj, iArr, (i14 & 16) != 0 ? 0.0f : f16, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? false : z15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f14, float f15, Object obj, int[] iArr, float f16, boolean z14, boolean z15) {
        super(f14, f15, obj);
        iArr.getClass();
        this.f192734a = iArr;
        this.f192735b = f16;
        this.f192736c = z14;
        this.f192737d = z15;
    }

    public /* synthetic */ e(float f14, float[] fArr, Object obj, int[] iArr, float f15, boolean z14, boolean z15, int i14, j jVar) {
        this(f14, fArr, (i14 & 4) != 0 ? null : obj, iArr, (i14 & 16) != 0 ? 0.0f : f15, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? false : z15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f14, float[] fArr, Object obj, int[] iArr, float f15, boolean z14, boolean z15) {
        super(f14, fArr, obj);
        fArr.getClass();
        iArr.getClass();
        this.f192734a = iArr;
        this.f192735b = f15;
        this.f192736c = z14;
        this.f192737d = z15;
    }
}
