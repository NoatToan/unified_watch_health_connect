package cf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcf/i;", "", "", "workSpecId", "", "generation", "systemId", "<init>", "(Ljava/lang/String;II)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26922c;

    public i(String str, int i14, int i15) {
        str.getClass();
        this.f26920a = str;
        this.f26921b = i14;
        this.f26922c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f26920a.equals(iVar.f26920a) && this.f26921b == iVar.f26921b && this.f26922c == iVar.f26922c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26922c) + q2.d(this.f26921b, this.f26920a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb3.append(this.f26920a);
        sb3.append(", generation=");
        sb3.append(this.f26921b);
        sb3.append(", systemId=");
        return ds.e0.j(sb3, this.f26922c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
