package s1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls1/p2;", "Ls1/r;", "V", "", "vectorValue", "Ls1/b0;", "easing", "Ls1/t;", "arcMode", "<init>", "(Ls1/r;Ls1/b0;ILkotlin/jvm/internal/j;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class p2<V extends r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f155692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f155693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f155694c;

    private p2(V v14, b0 b0Var, int i14) {
        this.f155692a = v14;
        this.f155693b = b0Var;
        this.f155694c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f155692a, p2Var.f155692a) || !p005kotlin.jvm.internal.s.g(this.f155693b, p2Var.f155693b)) {
            return false;
        }
        int i14 = p2Var.f155694c;
        t.a aVar = t.f155740b;
        return this.f155694c == i14;
    }

    public final int hashCode() {
        int iHashCode = (this.f155693b.hashCode() + (this.f155692a.hashCode() * 31)) * 31;
        t.a aVar = t.f155740b;
        return Integer.hashCode(this.f155694c) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VectorizedKeyframeSpecElementInfo(vectorValue=");
        sb3.append(this.f155692a);
        sb3.append(", easing=");
        sb3.append(this.f155693b);
        sb3.append(", arcMode=");
        t.a aVar = t.f155740b;
        sb3.append((Object) ("ArcMode(value=" + this.f155694c + CoreConstants.RIGHT_PARENTHESIS_CHAR));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ p2(r rVar, b0 b0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(rVar, b0Var, i14);
    }
}
