package o13;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo13/p;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f128594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f128595b;

    public p(A a14, B b14) {
        this.f128594a = a14;
        this.f128595b = b14;
    }

    public final A a() {
        return this.f128594a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f128594a, pVar.f128594a) && p005kotlin.jvm.internal.s.g(this.f128595b, pVar.f128595b);
    }

    public final int hashCode() {
        A a14 = this.f128594a;
        int iHashCode = (a14 == null ? 0 : a14.hashCode()) * 31;
        B b14 = this.f128595b;
        return iHashCode + (b14 != null ? b14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(this.f128594a);
        sb3.append(", ");
        return wr.g.p(sb3, this.f128595b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
