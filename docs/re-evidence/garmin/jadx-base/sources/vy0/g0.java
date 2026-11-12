package vy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvy0/g0;", "", "", "isSearching", "", "searchQuery", "<init>", "(ZLjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f180719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180720b;

    public /* synthetic */ g0(boolean z14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? "" : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f180719a == g0Var.f180719a && p005kotlin.jvm.internal.s.g(this.f180720b, g0Var.f180720b);
    }

    public final int hashCode() {
        return this.f180720b.hashCode() + (Boolean.hashCode(this.f180719a) * 31);
    }

    public final String toString() {
        return "SearchState(isSearching=" + this.f180719a + ", searchQuery=" + this.f180720b + ")";
    }

    public g0(boolean z14, String str) {
        str.getClass();
        this.f180719a = z14;
        this.f180720b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
