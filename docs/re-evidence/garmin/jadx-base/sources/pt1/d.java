package pt1;

import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpt1/d;", "", "Lke2/b;", "userLocation", "cameraLocation", "Lle2/a;", "currentBoundingBoxState", "", "zoomLevel", "savedBoundingBoxState", "", "mapType", "Li53/c;", "Lle2/d;", "visiblePolylines", "Lle2/c;", "visibleMarkers", "", "areTrailsSelected", "locationPermissionGranted", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "is3DMapEnabled", "bearing", "pitch", "<init>", "(Lke2/b;Lke2/b;Lle2/a;FLle2/a;ILi53/c;Li53/c;ZZLcom/garmin/android/library/mapsdkadapter/i$d;ZFF)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke2.b f140825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke2.b f140826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le2.a f140827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f140828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final le2.a f140829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f140830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<le2.d> f140831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<le2.c> f140832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f140833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f140834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i.d f140835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f140836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f140837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f140838n;

    public d(ke2.b bVar, ke2.b bVar2, le2.a aVar, float f14, le2.a aVar2, int i14, i53.c cVar, i53.c cVar2, boolean z14, boolean z15, com.garmin.android.library.mapsdkadapter.i.d dVar, boolean z16, float f15, float f16, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? us1.a.f172360a : bVar, (i15 & 2) != 0 ? us1.a.f172360a : bVar2, (i15 & 4) != 0 ? new le2.a(null, null, 3, null) : aVar, (i15 & 8) != 0 ? -1.0f : f14, (i15 & 16) == 0 ? aVar2 : null, (i15 & 32) != 0 ? dt1.h.TERRAIN.f61135a : i14, (i15 & 64) != 0 ? j53.l.b() : cVar, (i15 & 128) != 0 ? j53.l.b() : cVar2, (i15 & 256) != 0 ? false : z14, (i15 & 512) != 0 ? false : z15, (i15 & 1024) != 0 ? com.garmin.android.library.mapsdkadapter.i.d.GOOGLE : dVar, (i15 & 2048) == 0 ? z16 : false, (i15 & 4096) != 0 ? 0.0f : f15, (i15 & 8192) != 0 ? 0.0f : f16);
    }

    public static d a(d dVar, ke2.b bVar, ke2.b bVar2, le2.a aVar, float f14, le2.a aVar2, int i14, i53.c cVar, i53.c cVar2, boolean z14, boolean z15, com.garmin.android.library.mapsdkadapter.i.d dVar2, boolean z16, float f15, int i15) {
        ke2.b bVar3 = (i15 & 1) != 0 ? dVar.f140825a : bVar;
        ke2.b bVar4 = (i15 & 2) != 0 ? dVar.f140826b : bVar2;
        le2.a aVar3 = (i15 & 4) != 0 ? dVar.f140827c : aVar;
        float f16 = (i15 & 8) != 0 ? dVar.f140828d : f14;
        le2.a aVar4 = (i15 & 16) != 0 ? dVar.f140829e : aVar2;
        int i16 = (i15 & 32) != 0 ? dVar.f140830f : i14;
        i53.c cVar3 = (i15 & 64) != 0 ? dVar.f140831g : cVar;
        i53.c cVar4 = (i15 & 128) != 0 ? dVar.f140832h : cVar2;
        boolean z17 = (i15 & 256) != 0 ? dVar.f140833i : z14;
        boolean z18 = (i15 & 512) != 0 ? dVar.f140834j : z15;
        com.garmin.android.library.mapsdkadapter.i.d dVar3 = (i15 & 1024) != 0 ? dVar.f140835k : dVar2;
        boolean z19 = (i15 & 2048) != 0 ? dVar.f140836l : z16;
        float f17 = (i15 & 4096) != 0 ? dVar.f140837m : f15;
        float f18 = dVar.f140838n;
        dVar.getClass();
        bVar3.getClass();
        bVar4.getClass();
        aVar3.getClass();
        cVar3.getClass();
        cVar4.getClass();
        dVar3.getClass();
        return new d(bVar3, bVar4, aVar3, f16, aVar4, i16, cVar3, cVar4, z17, z18, dVar3, z19, f17, f18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f140825a, dVar.f140825a) && p005kotlin.jvm.internal.s.g(this.f140826b, dVar.f140826b) && p005kotlin.jvm.internal.s.g(this.f140827c, dVar.f140827c) && Float.compare(this.f140828d, dVar.f140828d) == 0 && p005kotlin.jvm.internal.s.g(this.f140829e, dVar.f140829e) && this.f140830f == dVar.f140830f && p005kotlin.jvm.internal.s.g(this.f140831g, dVar.f140831g) && p005kotlin.jvm.internal.s.g(this.f140832h, dVar.f140832h) && this.f140833i == dVar.f140833i && this.f140834j == dVar.f140834j && this.f140835k == dVar.f140835k && this.f140836l == dVar.f140836l && Float.compare(this.f140837m, dVar.f140837m) == 0 && Float.compare(this.f140838n, dVar.f140838n) == 0;
    }

    public final int hashCode() {
        int iD = q6.f.d(this.f140828d, (this.f140827c.hashCode() + ((this.f140826b.hashCode() + (this.f140825a.hashCode() * 31)) * 31)) * 31, 31);
        le2.a aVar = this.f140829e;
        return Float.hashCode(this.f140838n) + q6.f.d(this.f140837m, q6.f.g((this.f140835k.hashCode() + q6.f.g(q6.f.g(l2.a(this.f140832h, l2.a(this.f140831g, q2.d(this.f140830f, (iD + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31), 31, this.f140833i), 31, this.f140834j)) * 31, 31, this.f140836l), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MapAreaUiState(userLocation=");
        sb3.append(this.f140825a);
        sb3.append(", cameraLocation=");
        sb3.append(this.f140826b);
        sb3.append(", currentBoundingBoxState=");
        sb3.append(this.f140827c);
        sb3.append(", zoomLevel=");
        sb3.append(this.f140828d);
        sb3.append(", savedBoundingBoxState=");
        sb3.append(this.f140829e);
        sb3.append(", mapType=");
        sb3.append(this.f140830f);
        sb3.append(", visiblePolylines=");
        q6.f.w(sb3, this.f140831g, ", visibleMarkers=", this.f140832h, ", areTrailsSelected=");
        kg.f.q(", locationPermissionGranted=", ", mapProvider=", sb3, this.f140833i, this.f140834j);
        sb3.append(this.f140835k);
        sb3.append(", is3DMapEnabled=");
        sb3.append(this.f140836l);
        sb3.append(", bearing=");
        sb3.append(this.f140837m);
        sb3.append(", pitch=");
        sb3.append(this.f140838n);
        sb3.append(")");
        return sb3.toString();
    }

    public d() {
        this(null, null, null, 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 0.0f, 16383, null);
    }

    public d(ke2.b bVar, ke2.b bVar2, le2.a aVar, float f14, le2.a aVar2, int i14, i53.c<le2.d> cVar, i53.c<le2.c> cVar2, boolean z14, boolean z15, com.garmin.android.library.mapsdkadapter.i.d dVar, boolean z16, float f15, float f16) {
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        dVar.getClass();
        this.f140825a = bVar;
        this.f140826b = bVar2;
        this.f140827c = aVar;
        this.f140828d = f14;
        this.f140829e = aVar2;
        this.f140830f = i14;
        this.f140831g = cVar;
        this.f140832h = cVar2;
        this.f140833i = z14;
        this.f140834j = z15;
        this.f140835k = dVar;
        this.f140836l = z16;
        this.f140837m = f15;
        this.f140838n = f16;
    }
}
