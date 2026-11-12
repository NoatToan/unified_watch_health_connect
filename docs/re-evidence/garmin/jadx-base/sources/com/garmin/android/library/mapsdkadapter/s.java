package com.garmin.android.library.mapsdkadapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/s;", "Landroid/os/Parcelable;", "Lcom/garmin/android/library/mapsdkadapter/f;", FirebaseAnalytics.Param.LOCATION, "", "intensity", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;D)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f50334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f50335b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s(f.CREATOR.createFromParcel(parcel), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(f fVar, double d14) {
        fVar.getClass();
        this.f50334a = fVar;
        this.f50335b = d14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f50334a, sVar.f50334a) && Double.compare(this.f50335b, sVar.f50335b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f50335b) + (this.f50334a.hashCode() * 31);
    }

    public final String toString() {
        return "WeightedGeoPoint(location=" + this.f50334a + ", intensity=" + this.f50335b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f50334a.writeToParcel(parcel, i14);
        parcel.writeDouble(this.f50335b);
    }

    public /* synthetic */ s(f fVar, double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fVar, (i14 & 2) != 0 ? 1.0d : d14);
    }
}
