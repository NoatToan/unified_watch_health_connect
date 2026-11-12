package z72;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o13.z;
import o4.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz72/l;", "", "", "proportion", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(FJLkotlin/jvm/internal/j;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f202960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f202961b;

    private l(float f14, long j8) {
        this.f202960a = f14;
        this.f202961b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f202960a, lVar.f202960a) == 0 && d0.d(this.f202961b, lVar.f202961b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f202960a) * 31;
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        return Long.hashCode(this.f202961b) + iHashCode;
    }

    public final String toString() {
        return "GaugeSection(proportion=" + this.f202960a + ", color=" + d0.j(this.f202961b) + ")";
    }

    public /* synthetic */ l(float f14, long j8, p005kotlin.jvm.internal.j jVar) {
        this(f14, j8);
    }
}
