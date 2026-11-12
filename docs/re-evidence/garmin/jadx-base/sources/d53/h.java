package d53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld53/h;", "", "", "value", "Lj23/l;", "range", "<init>", "(Ljava/lang/String;Lj23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j23.l f57689b;

    public h(String str, j23.l lVar) {
        str.getClass();
        lVar.getClass();
        this.f57688a = str;
        this.f57689b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f57688a.equals(hVar.f57688a) && this.f57689b.equals(hVar.f57689b);
    }

    public final int hashCode() {
        return this.f57689b.hashCode() + (this.f57688a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f57688a + ", range=" + this.f57689b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
