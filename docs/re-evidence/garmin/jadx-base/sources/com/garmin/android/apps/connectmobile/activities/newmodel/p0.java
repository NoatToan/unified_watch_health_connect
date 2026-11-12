package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import aq.r3;
import c22.l3;
import c22.q3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/p0;", "Landroid/os/Parcelable;", "", "duration", "distance", "targetValue", "<init>", "(DDD)V", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f29631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f29632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f29633c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p0> {
        @Override // android.os.Parcelable.Creator
        public final p0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new p0(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final p0[] newArray(int i14) {
            return new p0[i14];
        }
    }

    public p0() {
        this(0.0d, 0.0d, 0.0d);
    }

    public static double b(double d14, r3 r3Var) {
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        boolean zY = lVar.y();
        if (r3Var != r3.SPEED) {
            if (r3Var != r3.PACE) {
                return (r3Var == r3.SPLIT_AVG_POWER_PER_KG || r3Var == r3.POWER_PER_KG) ? d14 / lVar.v3() : d14;
            }
            l3.f23124b.getClass();
            return l3.a.p(d14, zY);
        }
        if (zY) {
            l3.f23124b.getClass();
            return l3.a.i(d14, q3.KILOMETER_PER_HOUR);
        }
        l3.f23124b.getClass();
        return l3.a.i(d14, q3.MILE_PER_HOUR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.f29631a);
        parcel.writeDouble(this.f29632b);
        parcel.writeDouble(this.f29633c);
    }

    private p0(double d14, double d15, double d16) {
        this.f29631a = d14;
        this.f29632b = d15;
        this.f29633c = d16;
    }

    public /* synthetic */ p0(double d14, double d15, double d16, p005kotlin.jvm.internal.j jVar) {
        this(d14, d15, d16);
    }
}
