package fa0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import z10.n0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfa0/c;", "", "", "isLoading", "", "adminName", "Lz10/n0;", "revokeConfirmation", "Lfa0/a;", "consentActionComplete", "Lfa0/b;", "consentParentalRequestState", "<init>", "(ZLjava/lang/String;Lz10/n0;Lfa0/a;Lfa0/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f70094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f70096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f70097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f70098e;

    public /* synthetic */ c(boolean z14, String str, n0 n0Var, a aVar, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : n0Var, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f70094a == cVar.f70094a && s.g(this.f70095b, cVar.f70095b) && s.g(this.f70096c, cVar.f70096c) && this.f70097d == cVar.f70097d && this.f70098e == cVar.f70098e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f70094a) * 31;
        String str = this.f70095b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n0 n0Var = this.f70096c;
        int iHashCode3 = (iHashCode2 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        a aVar = this.f70097d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f70098e;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "ConsentScreenState(isLoading=" + this.f70094a + ", adminName=" + this.f70095b + ", revokeConfirmation=" + this.f70096c + ", consentActionComplete=" + this.f70097d + ", consentParentalRequestState=" + this.f70098e + ")";
    }

    public c(boolean z14, String str, n0 n0Var, a aVar, b bVar) {
        this.f70094a = z14;
        this.f70095b = str;
        this.f70096c = n0Var;
        this.f70097d = aVar;
        this.f70098e = bVar;
    }

    public c() {
        this(false, null, null, null, null, 31, null);
    }
}
