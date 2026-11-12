package j02;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj02/a;", "", "", TtmlNode.START, TtmlNode.END, "top", "bottom", "<init>", "(FFFF)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f96014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f96015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f96016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f96017d;

    public a(float f14, float f15, float f16, float f17) {
        this.f96014a = f14;
        this.f96015b = f15;
        this.f96016c = f16;
        this.f96017d = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f96014a, aVar.f96014a) == 0 && Float.compare(this.f96015b, aVar.f96015b) == 0 && Float.compare(this.f96016c, aVar.f96016c) == 0 && Float.compare(this.f96017d, aVar.f96017d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f96017d) + q6.f.d(this.f96016c, q6.f.d(this.f96015b, Float.hashCode(this.f96014a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbI = v.e0.i("AbsolutePixelPadding(start=", this.f96014a, ", end=", this.f96015b, ", top=");
        sbI.append(this.f96016c);
        sbI.append(", bottom=");
        sbI.append(this.f96017d);
        sbI.append(")");
        return sbI.toString();
    }
}
