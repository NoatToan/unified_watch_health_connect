package le2;

import com.garmin.android.library.mapsdkadapter.i;
import e23.p;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lle2/b;", "", "Lke2/b;", "userLocation", "Li53/c;", "Lle2/d;", "polylines", "Lle2/c;", "markers", "Lkotlin/Function2;", "", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "", "shouldClusterMarkers", "<init>", "(Lke2/b;Li53/c;Li53/c;Le23/p;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke2.b f112054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<d> f112055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<c> f112056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<Float, i.d, Boolean> f112057d;

    public b(ke2.b bVar, i53.c cVar, i53.c cVar2, p pVar, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? l.b() : cVar, (i14 & 4) != 0 ? l.b() : cVar2, (i14 & 8) != 0 ? new l71.i(14) : pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f112054a, bVar.f112054a) && s.g(this.f112055b, bVar.f112055b) && s.g(this.f112056c, bVar.f112056c) && s.g(this.f112057d, bVar.f112057d);
    }

    public final int hashCode() {
        return this.f112057d.hashCode() + l2.a(this.f112056c, l2.a(this.f112055b, this.f112054a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MapState(userLocation=" + this.f112054a + ", polylines=" + this.f112055b + ", markers=" + this.f112056c + ", shouldClusterMarkers=" + this.f112057d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ke2.b bVar, i53.c<d> cVar, i53.c<c> cVar2, p<? super Float, ? super i.d, Boolean> pVar) {
        bVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        pVar.getClass();
        this.f112054a = bVar;
        this.f112055b = cVar;
        this.f112056c = cVar2;
        this.f112057d = pVar;
    }
}
