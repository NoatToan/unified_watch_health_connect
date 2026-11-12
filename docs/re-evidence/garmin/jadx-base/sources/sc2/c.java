package sc2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsc2/c;", "", "Lsc2/o;", "oAuth2ITData", "Lve2/k;", "mfaTokenData", "", "rawServerJson", "<init>", "(Lsc2/o;Lve2/k;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f158488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve2.k f158489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158490c;

    public c(o oVar, ve2.k kVar, String str) {
        oVar.getClass();
        this.f158488a = oVar;
        this.f158489b = kVar;
        this.f158490c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f158488a.equals(cVar.f158488a) && s.g(this.f158489b, cVar.f158489b) && s.g(this.f158490c, cVar.f158490c);
    }

    public final int hashCode() {
        int iHashCode = this.f158488a.hashCode() * 31;
        ve2.k kVar = this.f158489b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.f158490c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IT2RequestResultData(oAuth2ITData=");
        sb3.append(this.f158488a);
        sb3.append(", mfaTokenData=");
        sb3.append(this.f158489b);
        sb3.append(", rawServerJson=");
        return am.j.o(this.f158490c, ")", sb3);
    }
}
