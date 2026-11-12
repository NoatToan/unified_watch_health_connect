package nf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnf/o;", "Lnf/i;", "Llf/o;", "source", "", "mimeType", "Llf/e;", "dataSource", "<init>", "(Llf/o;Ljava/lang/String;Llf/e;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf.o f125762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lf.e f125764c;

    public o(lf.o oVar, String str, lf.e eVar) {
        this.f125762a = oVar;
        this.f125763b = str;
        this.f125764c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s.g(this.f125762a, oVar.f125762a) && s.g(this.f125763b, oVar.f125763b) && this.f125764c == oVar.f125764c;
    }

    public final int hashCode() {
        int iHashCode = this.f125762a.hashCode() * 31;
        String str = this.f125763b;
        return this.f125764c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f125762a + ", mimeType=" + this.f125763b + ", dataSource=" + this.f125764c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
