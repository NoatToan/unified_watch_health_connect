package yz1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyz1/d;", "", "Lyz1/u;", "status", "Lyz1/c;", "source", "", "isRefreshing", "<init>", "(Lyz1/u;Lyz1/c;Z)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f200298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f200299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f200300c;

    public /* synthetic */ d(u uVar, c cVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uVar, (i14 & 2) != 0 ? null : cVar, (i14 & 4) != 0 ? false : z14);
    }

    public static d a(d dVar, u uVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            uVar = dVar.f200298a;
        }
        c cVar = dVar.f200299b;
        if ((i14 & 4) != 0) {
            z14 = dVar.f200300c;
        }
        dVar.getClass();
        return new d(uVar, cVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f200298a == dVar.f200298a && this.f200299b == dVar.f200299b && this.f200300c == dVar.f200300c;
    }

    public final int hashCode() {
        u uVar = this.f200298a;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        c cVar = this.f200299b;
        return Boolean.hashCode(this.f200300c) + ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DataStatus(status=");
        sb3.append(this.f200298a);
        sb3.append(", source=");
        sb3.append(this.f200299b);
        sb3.append(", isRefreshing=");
        return hb.a.k(sb3, this.f200300c, ")");
    }

    public d(u uVar, c cVar, boolean z14) {
        this.f200298a = uVar;
        this.f200299b = cVar;
        this.f200300c = z14;
    }
}
