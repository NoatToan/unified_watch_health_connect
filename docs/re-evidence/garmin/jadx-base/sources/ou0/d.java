package ou0;

import c80.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wd2.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lou0/d;", "", "", "hasSubscription", "Lc80/p;", "liveTrackPremiumStatus", "liveTrackSmsStatus", "Lwd2/k;", "profileUrl", "<init>", "(Ljava/lang/Boolean;Lc80/p;Lc80/p;Lwd2/k;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f133974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f133975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f133976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f133977d;

    public /* synthetic */ d(Boolean bool, p pVar, p pVar2, k kVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : pVar, (i14 & 4) != 0 ? null : pVar2, (i14 & 8) != 0 ? null : kVar);
    }

    public final boolean a() {
        return s.g(this.f133974a, Boolean.TRUE) && !(this.f133976c instanceof p.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f133974a, dVar.f133974a) && s.g(this.f133975b, dVar.f133975b) && s.g(this.f133976c, dVar.f133976c) && s.g(this.f133977d, dVar.f133977d);
    }

    public final int hashCode() {
        Boolean bool = this.f133974a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        p pVar = this.f133975b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        p pVar2 = this.f133976c;
        int iHashCode3 = (iHashCode2 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        k kVar = this.f133977d;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "LiveTrackPlusData(hasSubscription=" + this.f133974a + ", liveTrackPremiumStatus=" + this.f133975b + ", liveTrackSmsStatus=" + this.f133976c + ", profileUrl=" + this.f133977d + ")";
    }

    public d(Boolean bool, p pVar, p pVar2, k kVar) {
        this.f133974a = bool;
        this.f133975b = pVar;
        this.f133976c = pVar2;
        this.f133977d = kVar;
    }

    public d() {
        this(null, null, null, null, 15, null);
    }
}
