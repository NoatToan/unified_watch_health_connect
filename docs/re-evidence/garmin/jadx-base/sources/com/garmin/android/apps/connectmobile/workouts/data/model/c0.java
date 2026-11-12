package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/c0;", "Landroid/os/Parcelable;", "", "planId", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "durationInWeeks", "<init>", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;I)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f48134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f48135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48136d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c0(parcel.readLong(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public c0(long j8, DateTime dateTime, DateTime dateTime2, int i14) {
        dateTime.getClass();
        dateTime2.getClass();
        this.f48133a = j8;
        this.f48134b = dateTime;
        this.f48135c = dateTime2;
        this.f48136d = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f48133a == c0Var.f48133a && this.f48134b.equals(c0Var.f48134b) && this.f48135c.equals(c0Var.f48135c) && this.f48136d == c0Var.f48136d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48136d) + ds.e0.a(ds.e0.a(Long.hashCode(this.f48133a) * 31, this.f48134b, 31), this.f48135c, 31);
    }

    public final String toString() {
        return "TrainingPlanScheduleData(planId=" + this.f48133a + ", startDate=" + this.f48134b + ", endDate=" + this.f48135c + ", durationInWeeks=" + this.f48136d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f48133a);
        parcel.writeSerializable(this.f48134b);
        parcel.writeSerializable(this.f48135c);
        parcel.writeInt(this.f48136d);
    }
}
