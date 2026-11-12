package com.garmin.android.library.mapsdkadapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/e;", "Landroid/os/Parcelable;", "Lcom/garmin/android/library/mapsdkadapter/f;", "southwest", "northeast", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;Lcom/garmin/android/library/mapsdkadapter/f;)V", "b", "a", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class e implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f50272d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f50273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f50274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f50271c = new b(null);
    public static final Parcelable.Creator<e> CREATOR = new c();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<f> creator = f.CREATOR;
            return new e(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    static {
        f.f50281c.getClass();
        f fVar = f.f50282d;
        f50272d = new e(fVar, fVar);
    }

    public e(f fVar, f fVar2) {
        fVar.getClass();
        fVar2.getClass();
        this.f50273a = fVar;
        this.f50274b = fVar2;
        if (fVar.f50284b == fVar2.f50284b) {
            return;
        }
        vb.h.z("Geodetic system of both points should be equal.");
        throw null;
    }

    public static boolean f(e eVar, e eVar2) {
        if (eVar2 != null) {
            return eVar.f50274b.d(eVar2.f50274b, -1.0f) && eVar.f50273a.d(eVar2.f50273a, -1.0f);
        }
        eVar.getClass();
        return false;
    }

    public final boolean b(f fVar) {
        fVar.getClass();
        i.b bVar = fVar.f50284b;
        f fVar2 = this.f50273a;
        i.b bVar2 = fVar2.f50284b;
        f fVar3 = this.f50274b;
        if (bVar != bVar2) {
            return (bVar2 == i.b.WGS84 ? new e(fVar2.f(), fVar3.f()) : this).b(fVar.f());
        }
        LatLng latLng = fVar.f50283a;
        double d14 = latLng.latitude;
        LatLng latLng2 = fVar2.f50283a;
        if (latLng2.latitude > d14) {
            return false;
        }
        LatLng latLng3 = fVar3.f50283a;
        if (d14 > latLng3.latitude) {
            return false;
        }
        double d15 = latLng.longitude;
        double d16 = latLng2.longitude;
        double d17 = latLng3.longitude;
        if (d16 <= d17) {
            return d16 <= d15 && d15 <= d17;
        }
        return d16 <= d15 || d15 <= d17;
    }

    public final f d() {
        f fVar = this.f50273a;
        LatLng latLng = fVar.f50283a;
        double d14 = latLng.latitude;
        LatLng latLng2 = this.f50274b.f50283a;
        double d15 = (d14 + latLng2.latitude) / 2.0d;
        double d16 = latLng2.longitude;
        double d17 = latLng.longitude;
        if (d17 > d16) {
            d16 += 360.0d;
        }
        return new f(d15, (d16 + d17) / 2.0d, fVar.f50284b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f50273a.equals(eVar.f50273a) && this.f50274b.equals(eVar.f50274b);
    }

    public final e g(float f14) {
        LatLng latLng = this.f50274b.f50283a;
        double d14 = latLng.latitude;
        f fVar = this.f50273a;
        LatLng latLng2 = fVar.f50283a;
        double d15 = f14 - 1;
        double d16 = (d14 - latLng2.latitude) * d15;
        double d17 = (latLng.longitude - latLng2.longitude) * d15;
        a aVar = new a();
        aVar.b(new f(latLng.latitude + d16, latLng.longitude + d17, fVar.f50284b));
        aVar.b(new f(latLng2.latitude - d16, latLng2.longitude - d17, fVar.f50284b));
        e eVarA = aVar.a();
        eVarA.getClass();
        return eVarA;
    }

    public final int hashCode() {
        return this.f50274b.hashCode() + (this.f50273a.hashCode() * 31);
    }

    public final String toString() {
        return "{ SW: " + this.f50273a + ", NE: " + this.f50274b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f50273a.writeToParcel(parcel, i14);
        this.f50274b.writeToParcel(parcel, i14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/e$a;", "", "<init>", "()V", "a", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f50275a = Double.POSITIVE_INFINITY;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f50276b = Double.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f50277c = Double.NEGATIVE_INFINITY;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f50278d = Double.NaN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i.b f50279e = i.b.WGS84;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f50280f = true;

        static {
            new C1000a(null);
        }

        public final e a() {
            if (Double.isNaN(this.f50276b)) {
                return null;
            }
            return new e(new f(this.f50275a, this.f50276b, this.f50279e), new f(this.f50277c, this.f50278d, this.f50279e));
        }

        public final void b(f fVar) {
            fVar.getClass();
            i.b bVar = this.f50279e;
            i.b bVar2 = fVar.f50284b;
            if (bVar == bVar2 || this.f50280f || bVar != i.b.WGS84) {
                i.b bVar3 = i.b.GCJ02;
                if (bVar2 == bVar3 && bVar == i.b.WGS84) {
                    this.f50279e = bVar3;
                    if (!Double.isNaN(this.f50276b)) {
                        ie2.f fVar2 = ie2.f.f93122a;
                        double d14 = this.f50275a;
                        double d15 = this.f50276b;
                        fVar2.getClass();
                        LatLng latLngA = ie2.f.a(d14, d15);
                        this.f50275a = latLngA.latitude;
                        this.f50276b = latLngA.longitude;
                        LatLng latLngA2 = ie2.f.a(this.f50277c, this.f50278d);
                        this.f50277c = latLngA2.latitude;
                        this.f50278d = latLngA2.longitude;
                    }
                }
                f fVarG = fVar.g(this.f50279e);
                if (fVarG == null) {
                    return;
                }
                LatLng latLng = fVarG.f50283a;
                this.f50275a = Math.min(this.f50275a, latLng.latitude);
                this.f50277c = Math.max(this.f50277c, latLng.latitude);
                boolean zIsNaN = Double.isNaN(this.f50276b);
                double d16 = latLng.longitude;
                if (zIsNaN) {
                    this.f50276b = d16;
                    this.f50278d = d16;
                    return;
                }
                double d17 = this.f50276b;
                double d18 = this.f50278d;
                if (d17 <= d18) {
                    if (d16 <= d18 && d17 <= d16) {
                        return;
                    }
                } else if (d17 <= d16 || d16 <= d18) {
                    return;
                }
                e.f50271c.getClass();
                double d19 = ((d17 - d16) + 360.0d) % 360.0d;
                double d24 = latLng.longitude;
                if (d19 < ((d24 - this.f50278d) + 360.0d) % 360.0d) {
                    this.f50276b = d24;
                } else {
                    this.f50278d = d24;
                }
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.library.mapsdkadapter.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/e$a$a;", "", "<init>", "()V", "", "DEFAULT_CAN_TRANSFORM", "Z", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1000a {
            public /* synthetic */ C1000a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C1000a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/e$b;", "", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
