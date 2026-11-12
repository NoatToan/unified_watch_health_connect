package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwd2/i;", "", "", "tokenType", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184496b;

    public i(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f184495a = str;
        this.f184496b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f184495a.equals(iVar.f184495a) && this.f184496b.equals(iVar.f184496b);
    }

    public final int hashCode() {
        return this.f184496b.hashCode() + (this.f184495a.hashCode() * 31);
    }

    public final String toString() {
        return v.e0.g("GcsAuthData(tokenType=", this.f184495a, ", accessToken=", this.f184496b, ")");
    }
}
