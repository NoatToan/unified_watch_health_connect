package com.garmin.android.library.mapsdkadapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import me2.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000bB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/f;", "Landroid/os/Parcelable;", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "Lcom/garmin/android/library/mapsdkadapter/i$b;", "geodeticSystem", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;Lcom/garmin/android/library/mapsdkadapter/i$b;)V", "", "lat", "lng", "(DDLcom/garmin/android/library/mapsdkadapter/i$b;)V", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "(DDLcom/garmin/android/library/mapsdkadapter/i$d;)V", "(Lcom/google/android/gms/maps/model/LatLng;Lcom/garmin/android/library/mapsdkadapter/i$d;)V", "a", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f50283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.b f50284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50281c = new a(null);
    public static final Parcelable.Creator<f> CREATOR = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f50282d = new f(0.0d, 0.0d, i.b.WGS84);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f((LatLng) parcel.readParcelable(f.class.getClassLoader()), i.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(LatLng latLng, i.b bVar) {
        latLng.getClass();
        bVar.getClass();
        this.f50283a = latLng;
        this.f50284b = bVar;
    }

    public final float b(f fVar) {
        fVar.getClass();
        return this.f50284b == fVar.f50284b ? n.a(this.f50283a, fVar.f50283a) : n.a(f().f50283a, fVar.f().f50283a);
    }

    public final boolean d(f fVar, float f14) {
        fVar.getClass();
        return this.f50284b == fVar.f50284b ? z.a(f14, this.f50283a, fVar.f50283a) : z.a(f14, f().f50283a, fVar.f().f50283a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f50283a, fVar.f50283a) && this.f50284b == fVar.f50284b;
    }

    public final f f() {
        f fVarG = g(i.b.GCJ02);
        fVarG.getClass();
        return fVarG;
    }

    public final f g(i.b bVar) {
        bVar.getClass();
        if (this.f50284b == bVar) {
            return this;
        }
        i.b bVar2 = i.b.GCJ02;
        if (bVar != bVar2) {
            return null;
        }
        ie2.f fVar = ie2.f.f93122a;
        LatLng latLng = this.f50283a;
        double d14 = latLng.latitude;
        double d15 = latLng.longitude;
        fVar.getClass();
        return new f(ie2.f.a(d14, d15), bVar2);
    }

    public final int hashCode() {
        return this.f50284b.hashCode() + (this.f50283a.hashCode() * 31);
    }

    public final String toString() {
        LatLng latLng = this.f50283a;
        return String.format("(lat:%4.6f, lng:%4.6f, sys:%s)", Arrays.copyOf(new Object[]{Double.valueOf(latLng.latitude), Double.valueOf(latLng.longitude), this.f50284b}, 3));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f50283a, i14);
        parcel.writeString(this.f50284b.name());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/f$a;", "", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(double d14, double d15, i.b bVar) {
        this(new LatLng(d14, d15), bVar);
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(double d14, double d15, i.d dVar) {
        this(new LatLng(d14, d15), dVar);
        dVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(LatLng latLng, i.d dVar) {
        this(latLng, m.c(latLng, dVar));
        latLng.getClass();
        dVar.getClass();
    }
}
