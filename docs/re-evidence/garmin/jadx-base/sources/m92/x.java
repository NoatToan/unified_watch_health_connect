package m92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm92/x;", "", "", TtmlNode.LEFT, TtmlNode.RIGHT, "<init>", "(FF)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f117454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117455b;

    public x(float f14, float f15) {
        this.f117454a = f14;
        this.f117455b = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f117454a, xVar.f117454a) == 0 && Float.compare(this.f117455b, xVar.f117455b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f117455b) + (Float.hashCode(this.f117454a) * 31);
    }

    public final String toString() {
        return am.j.l("HorizontalInsets(left=", this.f117454a, ", right=", this.f117455b, ")");
    }
}
