package cf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcf/m;", "", "", "workSpecId", "", "generation", "<init>", "(Ljava/lang/String;I)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26930b;

    public m(String str, int i14) {
        str.getClass();
        this.f26929a = str;
        this.f26930b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f26929a.equals(mVar.f26929a) && this.f26930b == mVar.f26930b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26930b) + (this.f26929a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb3.append(this.f26929a);
        sb3.append(", generation=");
        return ds.e0.j(sb3, this.f26930b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
