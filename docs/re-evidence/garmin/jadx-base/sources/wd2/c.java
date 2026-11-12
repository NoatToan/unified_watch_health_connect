package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwd2/c;", "", "", "latitudeSemicircles", "longitudeSemicircles", "<init>", "(II)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184404b;

    public c(int i14, int i15) {
        this.f184403a = i14;
        this.f184404b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f184403a == cVar.f184403a && this.f184404b == cVar.f184404b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184404b) + (Integer.hashCode(this.f184403a) * 31);
    }

    public final String toString() {
        return am.j.g(this.f184403a, this.f184404b, "CurrentLocation(latitudeSemicircles=", ", longitudeSemicircles=", ")");
    }
}
