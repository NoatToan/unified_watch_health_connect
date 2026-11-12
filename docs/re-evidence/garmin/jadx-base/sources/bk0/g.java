package bk0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbk0/g;", "", "Lbk0/l;", "media", "", "title", "description", "Lbk0/k;", "link", "<init>", "(Lbk0/l;Ljava/lang/String;Ljava/lang/String;Lbk0/k;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f18484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f18487d;

    public g(l lVar, String str, String str2, k kVar) {
        lVar.getClass();
        str.getClass();
        str2.getClass();
        this.f18484a = lVar;
        this.f18485b = str;
        this.f18486c = str2;
        this.f18487d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f18484a.equals(gVar.f18484a) && this.f18485b.equals(gVar.f18485b) && this.f18486c.equals(gVar.f18486c) && s.g(this.f18487d, gVar.f18487d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.f18484a.hashCode() * 31, 31, this.f18485b), 31, this.f18486c);
        k kVar = this.f18487d;
        return iJ + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "GCPlusFeatureEducationPageData(media=" + this.f18484a + ", title=" + this.f18485b + ", description=" + this.f18486c + ", link=" + this.f18487d + ")";
    }
}
