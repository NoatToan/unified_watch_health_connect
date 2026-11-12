package a3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La3/g1;", "", "Lk2/a;", "small", "medium", "large", "<init>", "(Lk2/a;Lk2/a;Lk2/a;)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2.a f671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2.a f672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2.a f673c;

    /* JADX WARN: Illegal instructions before constructor call */
    public g1(k2.a aVar, k2.a aVar2, k2.a aVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            g6.f.a aVar4 = g6.f.f75994b;
            aVar = k2.i.a(4);
        }
        if ((i14 & 2) != 0) {
            g6.f.a aVar5 = g6.f.f75994b;
            aVar2 = k2.i.a(4);
        }
        if ((i14 & 4) != 0) {
            g6.f.a aVar6 = g6.f.f75994b;
            aVar3 = k2.i.a(0);
        }
        this(aVar, aVar2, aVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return p005kotlin.jvm.internal.s.g(this.f671a, g1Var.f671a) && p005kotlin.jvm.internal.s.g(this.f672b, g1Var.f672b) && p005kotlin.jvm.internal.s.g(this.f673c, g1Var.f673c);
    }

    public final int hashCode() {
        return this.f673c.hashCode() + ((this.f672b.hashCode() + (this.f671a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f671a + ", medium=" + this.f672b + ", large=" + this.f673c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public g1(k2.a aVar, k2.a aVar2, k2.a aVar3) {
        this.f671a = aVar;
        this.f672b = aVar2;
        this.f673c = aVar3;
    }

    public g1() {
        this(null, null, null, 7, null);
    }
}
