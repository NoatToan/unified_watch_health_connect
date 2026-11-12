package bk0;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbk0/k;", "", "", "title", "Lrj0/b;", FirebaseAnalytics.Param.DESTINATION, "<init>", "(Ljava/lang/String;Lrj0/b;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj0.b f18494b;

    public k(String str, rj0.b bVar) {
        str.getClass();
        bVar.getClass();
        this.f18493a = str;
        this.f18494b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f18493a.equals(kVar.f18493a) && this.f18494b == kVar.f18494b;
    }

    public final int hashCode() {
        return this.f18494b.hashCode() + (this.f18493a.hashCode() * 31);
    }

    public final String toString() {
        return "GCPlusFeatureLink(title=" + this.f18493a + ", destination=" + this.f18494b + ")";
    }
}
