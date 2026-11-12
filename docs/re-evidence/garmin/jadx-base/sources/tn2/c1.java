package tn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltn2/c1;", "", "", "response", "", "isSelectResult", "<init>", "(Ljava/lang/String;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165534b;

    public c1(String str, boolean z14) {
        str.getClass();
        this.f165533a = str;
        this.f165534b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f165533a.equals(c1Var.f165533a) && this.f165534b == c1Var.f165534b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165534b) + (this.f165533a.hashCode() * 31);
    }

    public final String toString() {
        return n23.j.g("RApduObject(response=", this.f165533a, ", isSelectResult=", this.f165534b, ")");
    }
}
