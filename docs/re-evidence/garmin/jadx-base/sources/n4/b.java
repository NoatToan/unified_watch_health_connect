package n4;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln4/b;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(FFFF)V", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f123537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f123538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f123539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f123540d;

    public b(float f14, float f15, float f16, float f17) {
        this.f123537a = f14;
        this.f123538b = f15;
        this.f123539c = f16;
        this.f123540d = f17;
    }

    public final void a(float f14, float f15, float f16, float f17) {
        this.f123537a = Math.max(f14, this.f123537a);
        this.f123538b = Math.max(f15, this.f123538b);
        this.f123539c = Math.min(f16, this.f123539c);
        this.f123540d = Math.min(f17, this.f123540d);
    }

    public final boolean b() {
        return (this.f123537a >= this.f123539c) | (this.f123538b >= this.f123540d);
    }

    public final void c(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        this.f123537a += fIntBitsToFloat;
        this.f123538b += fIntBitsToFloat2;
        this.f123539c += fIntBitsToFloat;
        this.f123540d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + gl1.d.d0(this.f123537a) + ", " + gl1.d.d0(this.f123538b) + ", " + gl1.d.d0(this.f123539c) + ", " + gl1.d.d0(this.f123540d) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
