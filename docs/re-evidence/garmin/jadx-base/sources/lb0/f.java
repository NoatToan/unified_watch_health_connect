package lb0;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llb0/f;", "", "", "text", "accessibilityTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111711b;

    public f(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f111710a = str;
        this.f111711b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f111710a.equals(fVar.f111710a) && this.f111711b.equals(fVar.f111711b);
    }

    public final int hashCode() {
        return this.f111711b.hashCode() + (this.f111710a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("SelectorOption(text=", this.f111710a, ", accessibilityTag=", this.f111711b, ")");
    }
}
