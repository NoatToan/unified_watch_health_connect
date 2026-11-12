package o51;

import android.os.Parcelable;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo51/e;", "", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "", "Lcom/garmin/android/library/mapsdkadapter/MapTypeId;", "mapType", "", "is3DMapFeatureSupported", "is3DMapEnabled", "Li53/c;", "Lle2/d;", "polylines", "Lke2/b;", "bounds", "Lle2/c;", "markersPreview", "markersFullScreen", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/i$d;IZZLi53/c;Li53/c;Li53/c;Li53/c;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i.d f129228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f129229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f129231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<le2.d> f129232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<ke2.b> f129233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<le2.c> f129234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<le2.c> f129235h;

    static {
        Parcelable.Creator<ke2.b> creator = ke2.b.CREATOR;
    }

    public e(com.garmin.android.library.mapsdkadapter.i.d dVar, int i14, boolean z14, boolean z15, i53.c cVar, i53.c cVar2, i53.c cVar3, i53.c cVar4, int i15, p005kotlin.jvm.internal.j jVar) {
        this(dVar, i14, z14, z15, (i15 & 16) != 0 ? l.b() : cVar, (i15 & 32) != 0 ? l.b() : cVar2, (i15 & 64) != 0 ? l.b() : cVar3, (i15 & 128) != 0 ? l.b() : cVar4);
    }

    public static e a(e eVar, com.garmin.android.library.mapsdkadapter.i.d dVar, int i14, boolean z14, int i15) {
        if ((i15 & 1) != 0) {
            dVar = eVar.f129228a;
        }
        com.garmin.android.library.mapsdkadapter.i.d dVar2 = dVar;
        if ((i15 & 2) != 0) {
            i14 = eVar.f129229b;
        }
        int i16 = i14;
        boolean z15 = eVar.f129230c;
        if ((i15 & 8) != 0) {
            z14 = eVar.f129231d;
        }
        i53.c<le2.d> cVar = eVar.f129232e;
        i53.c<ke2.b> cVar2 = eVar.f129233f;
        i53.c<le2.c> cVar3 = eVar.f129234g;
        i53.c<le2.c> cVar4 = eVar.f129235h;
        dVar2.getClass();
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        return new e(dVar2, i16, z15, z14, cVar, cVar2, cVar3, cVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f129228a == eVar.f129228a && this.f129229b == eVar.f129229b && this.f129230c == eVar.f129230c && this.f129231d == eVar.f129231d && s.g(this.f129232e, eVar.f129232e) && s.g(this.f129233f, eVar.f129233f) && s.g(this.f129234g, eVar.f129234g) && s.g(this.f129235h, eVar.f129235h);
    }

    public final int hashCode() {
        return this.f129235h.hashCode() + l2.a(this.f129234g, l2.a(this.f129233f, l2.a(this.f129232e, q6.f.g(q6.f.g(q2.d(this.f129229b, this.f129228a.hashCode() * 31, 31), 31, this.f129230c), 31, this.f129231d), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PaceProMapState(mapProvider=");
        sb3.append(this.f129228a);
        sb3.append(", mapType=");
        sb3.append(this.f129229b);
        sb3.append(", is3DMapFeatureSupported=");
        kg.f.q(", is3DMapEnabled=", ", polylines=", sb3, this.f129230c, this.f129231d);
        q6.f.w(sb3, this.f129232e, ", bounds=", this.f129233f, ", markersPreview=");
        sb3.append(this.f129234g);
        sb3.append(", markersFullScreen=");
        sb3.append(this.f129235h);
        sb3.append(")");
        return sb3.toString();
    }

    public e(com.garmin.android.library.mapsdkadapter.i.d dVar, int i14, boolean z14, boolean z15, i53.c<le2.d> cVar, i53.c<ke2.b> cVar2, i53.c<le2.c> cVar3, i53.c<le2.c> cVar4) {
        dVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        this.f129228a = dVar;
        this.f129229b = i14;
        this.f129230c = z14;
        this.f129231d = z15;
        this.f129232e = cVar;
        this.f129233f = cVar2;
        this.f129234g = cVar3;
        this.f129235h = cVar4;
    }
}
