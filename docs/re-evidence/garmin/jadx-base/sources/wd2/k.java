package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwd2/k;", "", "", "path", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184516b;

    public k(String str, String str2) {
        str2.getClass();
        this.f184515a = str;
        this.f184516b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f184515a, kVar.f184515a) && p005kotlin.jvm.internal.s.g(this.f184516b, kVar.f184516b);
    }

    public final int hashCode() {
        String str = this.f184515a;
        return this.f184516b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v.e0.g("LiveTrackProfileUrlResult(path=", this.f184515a, ", origin=", this.f184516b, ")");
    }

    public /* synthetic */ k(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, str2);
    }
}
