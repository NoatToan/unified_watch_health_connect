package ly0;

import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lly0/s;", "", "Li53/c;", "Lcom/garmin/android/library/mapsdkadapter/q;", "polylines", "Lcom/garmin/android/library/mapsdkadapter/p;", "markers", "coursePolyline", "<init>", "(Li53/c;Li53/c;Lcom/garmin/android/library/mapsdkadapter/q;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<com.garmin.android.library.mapsdkadapter.q> f115383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<com.garmin.android.library.mapsdkadapter.p> f115384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.q f115385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f115386d;

    public s(i53.c<com.garmin.android.library.mapsdkadapter.q> cVar, i53.c<com.garmin.android.library.mapsdkadapter.p> cVar2, com.garmin.android.library.mapsdkadapter.q qVar) {
        this.f115383a = cVar;
        this.f115384b = cVar2;
        this.f115385c = qVar;
        this.f115386d = o13.m.b(new ll0.b(10));
    }

    public static s a(s sVar, i53.c cVar, com.garmin.android.library.mapsdkadapter.q qVar) {
        i53.c<com.garmin.android.library.mapsdkadapter.q> cVar2 = sVar.f115383a;
        sVar.getClass();
        return new s(cVar2, cVar, qVar);
    }

    public final ie2.l b() {
        Integer numF = ((qw0.s) this.f115386d.getValue()).F();
        return new ie2.l(numF != null ? numF.intValue() : 0, false, null, 0.0f, null, null, null, null, null, null, null, null, 4094, null);
    }

    public final boolean c() {
        i53.c<com.garmin.android.library.mapsdkadapter.p> cVar;
        i53.c<com.garmin.android.library.mapsdkadapter.q> cVar2 = this.f115383a;
        return (cVar2 != null && (cVar2.isEmpty() ^ true)) || ((cVar = this.f115384b) != null && (cVar.isEmpty() ^ true)) || this.f115385c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f115383a, sVar.f115383a) && p005kotlin.jvm.internal.s.g(this.f115384b, sVar.f115384b) && p005kotlin.jvm.internal.s.g(this.f115385c, sVar.f115385c);
    }

    public final int hashCode() {
        i53.c<com.garmin.android.library.mapsdkadapter.q> cVar = this.f115383a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        i53.c<com.garmin.android.library.mapsdkadapter.p> cVar2 = this.f115384b;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        com.garmin.android.library.mapsdkadapter.q qVar = this.f115385c;
        return iHashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "ThumbnailMapData(polylines=" + this.f115383a + ", markers=" + this.f115384b + ", coursePolyline=" + this.f115385c + ")";
    }

    public s() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ s(i53.c cVar, i53.c cVar2, com.garmin.android.library.mapsdkadapter.q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : cVar2, (i14 & 4) != 0 ? null : qVar);
    }
}
