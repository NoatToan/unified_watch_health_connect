package m63;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm63/a0;", "Lm63/m1;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 extends m1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k63.l.b f116912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o13.t f116913n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String str, int i14) {
        super(str, null, i14, 2, null);
        str.getClass();
        this.f116912m = k63.l.b.f103252a;
        this.f116913n = o13.m.b(new a83.a(i14, str, this, 10));
    }

    @Override // m63.m1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k63.e)) {
            return false;
        }
        k63.e eVar = (k63.e) obj;
        return eVar.getF103234b() == k63.l.b.f103252a && p005kotlin.jvm.internal.s.g(this.f116983a, eVar.getF103221c()) && p005kotlin.jvm.internal.s.g(k1.b(this), k1.b(eVar));
    }

    @Override // m63.m1, k63.e
    /* JADX INFO: renamed from: getKind */
    public final k63.l getF103234b() {
        return this.f116912m;
    }

    @Override // m63.m1, k63.e
    public final k63.e h(int i14) {
        return ((k63.e[]) this.f116913n.getValue())[i14];
    }

    @Override // m63.m1
    public final int hashCode() {
        int iHashCode = this.f116983a.hashCode();
        Iterator<String> it = new k63.j(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i14 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i14 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // m63.m1
    public final String toString() {
        return p13.h0.k0(new k63.j(this), ", ", androidx.room.a0.m(new StringBuilder(), this.f116983a, CoreConstants.LEFT_PARENTHESIS_CHAR), ")", null, 56);
    }
}
