package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwd2/b;", "", "", "applicationVersion", "", "applicationVersionCode", "<init>", "(Ljava/lang/String;I)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184387b;

    public b(String str, int i14) {
        str.getClass();
        this.f184386a = str;
        this.f184387b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f184386a.equals(bVar.f184386a) && this.f184387b == bVar.f184387b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184387b) + (this.f184386a.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.e(this.f184387b, "ApplicationInfo(applicationVersion=", this.f184386a, ", applicationVersionCode=", ")");
    }
}
