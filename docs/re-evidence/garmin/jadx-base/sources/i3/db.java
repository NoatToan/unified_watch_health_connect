package i3;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/db;", "", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Lh3/b;", "rippleAlpha", "<init>", "(JLh3/b;Lkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f87862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.b f87863b;

    /* JADX WARN: Illegal instructions before constructor call */
    public db(long j8, h3.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j8 = o4.d0.f128832k;
        }
        this(j8, (i14 & 2) != 0 ? null : bVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return o4.d0.d(this.f87862a, dbVar.f87862a) && p005kotlin.jvm.internal.s.g(this.f87863b, dbVar.f87863b);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        int iHashCode = Long.hashCode(this.f87862a) * 31;
        h3.b bVar = this.f87863b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RippleConfiguration(color=");
        r1.q2.m(this.f87862a, ", rippleAlpha=", sb3);
        sb3.append(this.f87863b);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    private db(long j8, h3.b bVar) {
        this.f87862a = j8;
        this.f87863b = bVar;
    }

    public /* synthetic */ db(long j8, h3.b bVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, bVar);
    }
}
