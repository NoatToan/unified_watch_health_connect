package n92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln92/f;", "", "", TtmlNode.START, TtmlNode.END, "<init>", "(II)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f125077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125078b;

    public /* synthetic */ f(int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? 0 : i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f125077a == fVar.f125077a && this.f125078b == fVar.f125078b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f125078b) + (Integer.hashCode(this.f125077a) * 31);
    }

    public final String toString() {
        return am.j.g(this.f125077a, this.f125078b, "LongestLabelWidth(start=", ", end=", ")");
    }

    public f(int i14, int i15) {
        this.f125077a = i14;
        this.f125078b = i15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        int i14 = 0;
        this(i14, i14, 3, null);
    }
}
