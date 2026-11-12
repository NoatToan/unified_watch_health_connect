package s21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls21/c0;", "", "", "consentTypeId", "version", "locale", "Li53/c;", "Ls92/b;", "blocks", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<s92.b> f156087d;

    public c0(String str, String str2, String str3, i53.c<s92.b> cVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cVar.getClass();
        this.f156084a = str;
        this.f156085b = str2;
        this.f156086c = str3;
        this.f156087d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f156084a.equals(c0Var.f156084a) && this.f156085b.equals(c0Var.f156085b) && this.f156086c.equals(c0Var.f156086c) && this.f156087d.equals(c0Var.f156087d);
    }

    public final int hashCode() {
        return this.f156087d.hashCode() + wr.g.j(wr.g.j(this.f156084a.hashCode() * 31, 31, this.f156085b), 31, this.f156086c);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RevokeConsentBlocks(consentTypeId=", this.f156084a, ", version=", this.f156085b, ", locale=");
        sbI.append(this.f156086c);
        sbI.append(", blocks=");
        sbI.append(this.f156087d);
        sbI.append(")");
        return sbI.toString();
    }
}
