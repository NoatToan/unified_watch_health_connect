package pt1;

import java.util.List;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpt1/s;", "", "Lle2/d;", "polyline", "Li53/c;", "Lle2/c;", "markers", "", "Lke2/b;", "mapBounds", "<init>", "(Lle2/d;Li53/c;Ljava/util/List;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le2.d f140964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<le2.c> f140965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ke2.b> f140966c;

    public s(le2.d dVar, i53.c<le2.c> cVar, List<ke2.b> list) {
        dVar.getClass();
        cVar.getClass();
        list.getClass();
        this.f140964a = dVar;
        this.f140965b = cVar;
        this.f140966c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f140964a.equals(sVar.f140964a) && this.f140965b.equals(sVar.f140965b) && this.f140966c.equals(sVar.f140966c);
    }

    public final int hashCode() {
        return this.f140966c.hashCode() + l2.a(this.f140965b, this.f140964a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrailPolylinePreviewState(polyline=");
        sb3.append(this.f140964a);
        sb3.append(", markers=");
        sb3.append(this.f140965b);
        sb3.append(", mapBounds=");
        return u62.z.c(sb3, this.f140966c, ")");
    }
}
