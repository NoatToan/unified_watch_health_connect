package qw1;

import j23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqw1/a;", "", "Lj23/l;", "phaseDaysRange", "", "phaseLabel", "<init>", "(Lj23/l;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f148373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148374b;

    public a(l lVar, String str) {
        lVar.getClass();
        str.getClass();
        this.f148373a = lVar;
        this.f148374b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f148373a.equals(aVar.f148373a) && this.f148374b.equals(aVar.f148374b);
    }

    public final int hashCode() {
        return this.f148374b.hashCode() + (this.f148373a.hashCode() * 31);
    }

    public final String toString() {
        return "ITPPhase(phaseDaysRange=" + this.f148373a + ", phaseLabel=" + this.f148374b + ")";
    }
}
