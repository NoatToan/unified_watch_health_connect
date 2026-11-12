package ox2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lox2/e;", "", "", "url", "", "delayInMills", "<init>", "(Ljava/lang/String;J)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f134353b;

    public e(String str, long j8) {
        str.getClass();
        this.f134352a = str;
        this.f134353b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f134352a.equals(eVar.f134352a) && this.f134353b == eVar.f134353b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f134353b) + (this.f134352a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f134353b, "UploadStatusCheck(url=", this.f134352a, ", delayInMills=");
        sbJ.append(")");
        return sbJ.toString();
    }
}
