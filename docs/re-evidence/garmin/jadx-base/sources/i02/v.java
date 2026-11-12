package i02;

import b5.z;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li02/v;", "", "Lb5/z;", TtmlNode.ATTR_ID, "Ln4/c;", MapboxMap.QFE_OFFSET, "<init>", "(JLn4/c;Lkotlin/jvm/internal/j;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f86928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4.c f86929b;

    public /* synthetic */ v(long j8, n4.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : cVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return z.b(this.f86928a, vVar.f86928a) && p005kotlin.jvm.internal.s.g(this.f86929b, vVar.f86929b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f86928a) * 31;
        n4.c cVar = this.f86929b;
        return iHashCode + (cVar == null ? 0 : Long.hashCode(cVar.f123544a));
    }

    public final String toString() {
        return "StartDrag(id=" + z.c(this.f86928a) + ", offset=" + this.f86929b + ")";
    }

    private v(long j8, n4.c cVar) {
        this.f86928a = j8;
        this.f86929b = cVar;
    }

    public /* synthetic */ v(long j8, n4.c cVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, cVar);
    }
}
