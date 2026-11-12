package g02;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg02/t0;", "", "", "amount", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(DJLkotlin/jvm/internal/j;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f74552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74553b;

    private t0(double d14, long j8) {
        this.f74552a = d14;
        this.f74553b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Double.compare(this.f74552a, t0Var.f74552a) == 0 && o4.d0.d(this.f74553b, t0Var.f74553b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f74552a) * 31;
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f74553b) + iHashCode;
    }

    public final String toString() {
        return "ProgressValue(amount=" + this.f74552a + ", color=" + o4.d0.j(this.f74553b) + ")";
    }

    public /* synthetic */ t0(double d14, long j8, p005kotlin.jvm.internal.j jVar) {
        this(d14, j8);
    }
}
