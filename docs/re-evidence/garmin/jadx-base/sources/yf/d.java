package yf;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyf/d;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(FFFF)V", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f196840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f196841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f196842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f196843d;

    public d(float f14, float f15, float f16, float f17) {
        this.f196840a = f14;
        this.f196841b = f15;
        this.f196842c = f16;
        this.f196843d = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f196840a, dVar.f196840a) == 0 && Float.compare(this.f196841b, dVar.f196841b) == 0 && Float.compare(this.f196842c, dVar.f196842c) == 0 && Float.compare(this.f196843d, dVar.f196843d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f196843d) + q6.f.d(this.f196842c, q6.f.d(this.f196841b, Float.hashCode(this.f196840a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ViewBox(left=");
        sb3.append(this.f196840a);
        sb3.append(", top=");
        sb3.append(this.f196841b);
        sb3.append(", right=");
        sb3.append(this.f196842c);
        sb3.append(", bottom=");
        return q6.f.p(sb3, this.f196843d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
