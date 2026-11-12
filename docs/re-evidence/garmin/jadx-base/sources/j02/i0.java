package j02;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj02/i0;", "", "", TtmlNode.START, TtmlNode.END, "<init>", "(FF)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f96071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f96072b;

    public i0(float f14, float f15) {
        this.f96071a = f14;
        this.f96072b = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Float.compare(this.f96071a, i0Var.f96071a) == 0 && Float.compare(this.f96072b, i0Var.f96072b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f96072b) + (Float.hashCode(this.f96071a) * 31);
    }

    public final String toString() {
        return am.j.l("ScrollAreaOffsets(start=", this.f96071a, ", end=", this.f96072b, ")");
    }
}
