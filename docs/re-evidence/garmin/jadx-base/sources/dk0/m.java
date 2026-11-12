package dk0;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldk0/m;", "", "", "title", "headerTitle", "headerSubtitle", "Li53/c;", "Luj0/c;", "plans", "featuresTitle", "Lbk0/a;", "features", "Ldk0/f;", "disclaimer", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li53/c;Ljava/lang/String;Li53/c;Ldk0/f;Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<uj0.c> f60205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f60206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<bk0.a> f60207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f60208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f60209h;

    public m(String str, String str2, String str3, i53.c<uj0.c> cVar, String str4, i53.c<bk0.a> cVar2, f fVar, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cVar.getClass();
        str4.getClass();
        cVar2.getClass();
        fVar.getClass();
        str5.getClass();
        this.f60202a = str;
        this.f60203b = str2;
        this.f60204c = str3;
        this.f60205d = cVar;
        this.f60206e = str4;
        this.f60207f = cVar2;
        this.f60208g = fVar;
        this.f60209h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f60202a.equals(mVar.f60202a) && this.f60203b.equals(mVar.f60203b) && this.f60204c.equals(mVar.f60204c) && this.f60205d.equals(mVar.f60205d) && this.f60206e.equals(mVar.f60206e) && this.f60207f.equals(mVar.f60207f) && this.f60208g.equals(mVar.f60208g) && this.f60209h.equals(mVar.f60209h);
    }

    public final int hashCode() {
        return this.f60209h.hashCode() + ((this.f60208g.hashCode() + l2.a(this.f60207f, wr.g.j(l2.a(this.f60205d, wr.g.j(wr.g.j(this.f60202a.hashCode() * 31, 31, this.f60203b), 31, this.f60204c), 31), 31, this.f60206e), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GCPlusPlanSelectionScreenData(title=", this.f60202a, ", headerTitle=", this.f60203b, ", headerSubtitle=");
        sbI.append(this.f60204c);
        sbI.append(", plans=");
        sbI.append(this.f60205d);
        sbI.append(", featuresTitle=");
        sbI.append(this.f60206e);
        sbI.append(", features=");
        sbI.append(this.f60207f);
        sbI.append(", disclaimer=");
        sbI.append(this.f60208g);
        sbI.append(", cta=");
        sbI.append(this.f60209h);
        sbI.append(")");
        return sbI.toString();
    }
}
