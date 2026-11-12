package bk0;

import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbk0/l;", "", "Lo4/v0;", "image", "", "lottieUrl", "<init>", "(Lo4/v0;Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f18495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18496b;

    public l(v0 v0Var, String str) {
        this.f18495a = v0Var;
        this.f18496b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f18495a, lVar.f18495a) && s.g(this.f18496b, lVar.f18496b);
    }

    public final int hashCode() {
        v0 v0Var = this.f18495a;
        int iHashCode = (v0Var == null ? 0 : v0Var.hashCode()) * 31;
        String str = this.f18496b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "GCPlusFeatureMedia(image=" + this.f18495a + ", lottieUrl=" + this.f18496b + ")";
    }
}
