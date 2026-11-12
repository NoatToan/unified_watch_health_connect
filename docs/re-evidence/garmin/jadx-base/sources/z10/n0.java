package z10;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz10/n0;", "", "", "title", "message", "confirmButtonText", "cancelButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f201172d;

    public n0(String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.f201169a = str;
        this.f201170b = str2;
        this.f201171c = str3;
        this.f201172d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f201169a.equals(n0Var.f201169a) && this.f201170b.equals(n0Var.f201170b) && this.f201171c.equals(n0Var.f201171c) && this.f201172d.equals(n0Var.f201172d);
    }

    public final int hashCode() {
        return this.f201172d.hashCode() + wr.g.j(wr.g.j(this.f201169a.hashCode() * 31, 31, this.f201170b), 31, this.f201171c);
    }

    public final String toString() {
        return e5.h(p6.b.i("ConsentConfirmation(title=", this.f201169a, ", message=", this.f201170b, ", confirmButtonText="), this.f201171c, ", cancelButtonText=", this.f201172d, ")");
    }
}
