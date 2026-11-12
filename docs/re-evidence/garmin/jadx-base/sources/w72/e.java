package w72;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw72/e;", "", "Lw72/g;", "route", "Lu4/d;", "selectedIcon", "unselectedIcon", "", "iconTextId", "<init>", "(Lw72/g;Lu4/d;Lu4/d;Ljava/lang/String;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f183519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.d f183520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.d f183521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f183522d;

    public e(g gVar, u4.d dVar, u4.d dVar2, String str) {
        gVar.getClass();
        dVar.getClass();
        dVar2.getClass();
        str.getClass();
        this.f183519a = gVar;
        this.f183520b = dVar;
        this.f183521c = dVar2;
        this.f183522d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f183519a.equals(eVar.f183519a) && this.f183520b.equals(eVar.f183520b) && this.f183521c.equals(eVar.f183521c) && this.f183522d.equals(eVar.f183522d);
    }

    public final int hashCode() {
        return this.f183522d.hashCode() + ((this.f183521c.hashCode() + ((this.f183520b.hashCode() + (this.f183519a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CatalogTopLevelDestination(route=" + this.f183519a + ", selectedIcon=" + this.f183520b + ", unselectedIcon=" + this.f183521c + ", iconTextId=" + this.f183522d + ")";
    }
}
