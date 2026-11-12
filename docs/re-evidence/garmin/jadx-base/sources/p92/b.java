package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp92/b;", "", "", "consumerKey", "consumerSecret", "userToken", "userSecret", "oauth2AccessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f136576e;

    public b(String str, String str2, String str3, String str4, String str5) {
        hb.a.p(str, str2, str3, str4, str5);
        this.f136572a = str;
        this.f136573b = str2;
        this.f136574c = str3;
        this.f136575d = str4;
        this.f136576e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f136572a.equals(bVar.f136572a) && this.f136573b.equals(bVar.f136573b) && this.f136574c.equals(bVar.f136574c) && this.f136575d.equals(bVar.f136575d) && this.f136576e.equals(bVar.f136576e);
    }

    public final int hashCode() {
        return this.f136576e.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.f136572a.hashCode() * 31, 31, this.f136573b), 31, this.f136574c), 31, this.f136575d);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GCAuthData(consumerKey=", this.f136572a, ", consumerSecret=", this.f136573b, ", userToken=");
        sn.a.t(sbI, this.f136574c, ", userSecret=", this.f136575d, ", oauth2AccessToken=");
        return am.j.o(this.f136576e, ")", sbI);
    }
}
