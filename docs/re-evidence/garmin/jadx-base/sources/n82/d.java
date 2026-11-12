package n82;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln82/d;", "", "Lo82/a;", "pageKey", "Lo82/g;", "intervalType", "<init>", "(Lo82/a;Lo82/g;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o82.a f124956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f124957b;

    public d(o82.a aVar, o82.g gVar) {
        aVar.getClass();
        gVar.getClass();
        this.f124956a = aVar;
        this.f124957b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f124956a.equals(dVar.f124956a) && this.f124957b == dVar.f124957b;
    }

    public final int hashCode() {
        return this.f124957b.hashCode() + (this.f124956a.hashCode() * 31);
    }

    public final String toString() {
        return "DatePagerPageData(pageKey=" + this.f124956a + ", intervalType=" + this.f124957b + ")";
    }
}
