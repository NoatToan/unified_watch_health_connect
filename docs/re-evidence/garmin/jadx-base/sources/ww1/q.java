package ww1;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lww1/q;", "Lww1/r;", "", "planId", "", "planName", "Lorg/joda/time/DateTime;", "raceDate", "Lam/x0;", "activityType", "", "numWeeksDuration", "<init>", "(JLjava/lang/String;Lorg/joda/time/DateTime;Lam/x0;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q extends r {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f187855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f187856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f187857e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q(parcel.readLong(), parcel.readString(), (DateTime) parcel.readSerializable(), (x0) parcel.readParcelable(q.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public q(long j8, String str, DateTime dateTime, x0 x0Var, int i14) {
        str.getClass();
        x0Var.getClass();
        this.f187853a = j8;
        this.f187854b = str;
        this.f187855c = dateTime;
        this.f187856d = x0Var;
        this.f187857e = i14;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final x0 getF187856d() {
        return this.f187856d;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF187857e() {
        return this.f187857e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f187853a == qVar.f187853a && p005kotlin.jvm.internal.s.g(this.f187854b, qVar.f187854b) && p005kotlin.jvm.internal.s.g(this.f187855c, qVar.f187855c) && this.f187856d == qVar.f187856d && this.f187857e == qVar.f187857e;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF187853a() {
        return this.f187853a;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF187854b() {
        return this.f187854b;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: h, reason: from getter */
    public final DateTime getF187855c() {
        return this.f187855c;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f187853a) * 31, 31, this.f187854b);
        DateTime dateTime = this.f187855c;
        return Integer.hashCode(this.f187857e) + ((this.f187856d.hashCode() + ((iJ + (dateTime == null ? 0 : dateTime.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f187853a, "CompletedStatic(planId=", ", planName=", this.f187854b);
        sbK.append(", raceDate=");
        sbK.append(this.f187855c);
        sbK.append(", activityType=");
        sbK.append(this.f187856d);
        return u0.k(sbK, ", numWeeksDuration=", this.f187857e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f187853a);
        parcel.writeString(this.f187854b);
        parcel.writeSerializable(this.f187855c);
        parcel.writeParcelable(this.f187856d, i14);
        parcel.writeInt(this.f187857e);
    }
}
