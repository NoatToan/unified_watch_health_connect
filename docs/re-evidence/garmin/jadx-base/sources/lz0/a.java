package lz0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llz0/a;", "", "", "profilePk", "", "disconnected", "<init>", "(IZ)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115393b;

    public a(int i14, boolean z14) {
        this.f115392a = i14;
        this.f115393b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f115392a == aVar.f115392a && this.f115393b == aVar.f115393b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115393b) + (Integer.hashCode(this.f115392a) * 31);
    }

    public final String toString() {
        return "NewsFeedEditedConnection(profilePk=" + this.f115392a + ", disconnected=" + this.f115393b + ")";
    }
}
