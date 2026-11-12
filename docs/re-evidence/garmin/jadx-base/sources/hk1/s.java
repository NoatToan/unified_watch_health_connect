package hk1;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhk1/s;", "", "Lhk1/r;", "thirdPartyBasicData", "", "Lhk1/d;", "", "capabilitiesData", "Ls92/g;", "consentText", "<init>", "(Lhk1/r;Ljava/util/Map;Ls92/g;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f84189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<d, Boolean> f84190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s92.g f84191c;

    public s(r rVar, Map<d, Boolean> map, s92.g gVar) {
        rVar.getClass();
        map.getClass();
        this.f84189a = rVar;
        this.f84190b = map;
        this.f84191c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f84189a.equals(sVar.f84189a) && this.f84190b.equals(sVar.f84190b) && p005kotlin.jvm.internal.s.g(this.f84191c, sVar.f84191c);
    }

    public final int hashCode() {
        int iB = am.j.b(this.f84190b, this.f84189a.hashCode() * 31, 31);
        s92.g gVar = this.f84191c;
        return iB + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "ThirdPartyDetailsData(thirdPartyBasicData=" + this.f84189a + ", capabilitiesData=" + this.f84190b + ", consentText=" + this.f84191c + ")";
    }
}
