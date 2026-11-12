package mr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmr/b;", "", "Lmr/e;", "networkingCustomization", "Lmr/d;", "tabsCustomization", "Lmr/c;", "overviewCustomization", "Los/a;", "mapCustomization", "Lmr/a;", "chartsCustomization", "<init>", "(Lmr/e;Lmr/d;Lmr/c;Los/a;Lmr/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f120239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f120240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f120241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final os.a f120242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f120243e;

    public /* synthetic */ b(e eVar, d dVar, c cVar, os.a aVar, a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : eVar, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? new os.e() : aVar, (i14 & 16) != 0 ? null : aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f120239a, bVar.f120239a) && p005kotlin.jvm.internal.s.g(this.f120240b, bVar.f120240b) && p005kotlin.jvm.internal.s.g(this.f120241c, bVar.f120241c) && p005kotlin.jvm.internal.s.g(this.f120242d, bVar.f120242d) && p005kotlin.jvm.internal.s.g(this.f120243e, bVar.f120243e);
    }

    public final int hashCode() {
        e eVar = this.f120239a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        d dVar = this.f120240b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.f120241c;
        int iHashCode3 = (this.f120242d.hashCode() + ((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        a aVar = this.f120243e;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityCustomization(networkingCustomization=" + this.f120239a + ", tabsCustomization=" + this.f120240b + ", overviewCustomization=" + this.f120241c + ", mapCustomization=" + this.f120242d + ", chartsCustomization=" + this.f120243e + ")";
    }

    public b(e eVar, d dVar, c cVar, os.a aVar, a aVar2) {
        aVar.getClass();
        this.f120239a = eVar;
        this.f120240b = dVar;
        this.f120241c = cVar;
        this.f120242d = aVar;
        this.f120243e = aVar2;
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }
}
