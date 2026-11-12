package m92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm92/k0;", "", "", "xStart", "xEnd", "yEnd", "yStart", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "bottomLeft", "bottomRight", "topLeft", "topRight", "<init>", "(FFFFJFFFFLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f117388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f117390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f117391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f117392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f117393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f117394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f117395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f117396i;

    public /* synthetic */ k0(float f14, float f15, float f16, float f17, long j8, float f18, float f19, float f22, float f24, int i14, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, (i14 & 8) != 0 ? 0.0f : f17, j8, (i14 & 32) != 0 ? 0.0f : f18, (i14 & 64) != 0 ? 0.0f : f19, (i14 & 128) != 0 ? 0.0f : f22, (i14 & 256) != 0 ? 0.0f : f24, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Float.compare(this.f117388a, k0Var.f117388a) == 0 && Float.compare(this.f117389b, k0Var.f117389b) == 0 && Float.compare(this.f117390c, k0Var.f117390c) == 0 && Float.compare(this.f117391d, k0Var.f117391d) == 0 && o4.d0.d(this.f117392e, k0Var.f117392e) && Float.compare(this.f117393f, k0Var.f117393f) == 0 && Float.compare(this.f117394g, k0Var.f117394g) == 0 && Float.compare(this.f117395h, k0Var.f117395h) == 0 && Float.compare(this.f117396i, k0Var.f117396i) == 0;
    }

    public final int hashCode() {
        int iD = q6.f.d(this.f117391d, q6.f.d(this.f117390c, q6.f.d(this.f117389b, Float.hashCode(this.f117388a) * 31, 31), 31), 31);
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Float.hashCode(this.f117396i) + q6.f.d(this.f117395h, q6.f.d(this.f117394g, q6.f.d(this.f117393f, q6.f.e(iD, 31, this.f117392e), 31), 31), 31);
    }

    public final String toString() {
        String strJ = o4.d0.j(this.f117392e);
        StringBuilder sbI = v.e0.i("RangeBarConfig(xStart=", this.f117388a, ", xEnd=", this.f117389b, ", yEnd=");
        l2.n(sbI, this.f117390c, ", yStart=", this.f117391d, ", color=");
        sbI.append(strJ);
        sbI.append(", bottomLeft=");
        sbI.append(this.f117393f);
        sbI.append(", bottomRight=");
        l2.n(sbI, this.f117394g, ", topLeft=", this.f117395h, ", topRight=");
        return v.e0.e(this.f117396i, ")", sbI);
    }

    private k0(float f14, float f15, float f16, float f17, long j8, float f18, float f19, float f22, float f24) {
        this.f117388a = f14;
        this.f117389b = f15;
        this.f117390c = f16;
        this.f117391d = f17;
        this.f117392e = j8;
        this.f117393f = f18;
        this.f117394g = f19;
        this.f117395h = f22;
        this.f117396i = f24;
    }

    public /* synthetic */ k0(float f14, float f15, float f16, float f17, long j8, float f18, float f19, float f22, float f24, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, j8, f18, f19, f22, f24);
    }
}
