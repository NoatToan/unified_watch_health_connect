package ww1;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lww1/o;", "Lww1/r;", "", "planId", "", "planName", "Lorg/joda/time/DateTime;", "raceDate", "Lam/x0;", "activityType", "", "numWeeksDuration", "<init>", "(JLjava/lang/String;Lorg/joda/time/DateTime;Lam/x0;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o extends r {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f187843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f187844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f187845e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readLong(), parcel.readString(), (DateTime) parcel.readSerializable(), (x0) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public o(long j8, String str, DateTime dateTime, x0 x0Var, int i14) {
        str.getClass();
        x0Var.getClass();
        this.f187841a = j8;
        this.f187842b = str;
        this.f187843c = dateTime;
        this.f187844d = x0Var;
        this.f187845e = i14;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final x0 getF187844d() {
        return this.f187844d;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF187845e() {
        return this.f187845e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f187841a == oVar.f187841a && p005kotlin.jvm.internal.s.g(this.f187842b, oVar.f187842b) && p005kotlin.jvm.internal.s.g(this.f187843c, oVar.f187843c) && this.f187844d == oVar.f187844d && this.f187845e == oVar.f187845e;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF187841a() {
        return this.f187841a;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF187842b() {
        return this.f187842b;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: h, reason: from getter */
    public final DateTime getF187843c() {
        return this.f187843c;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f187841a) * 31, 31, this.f187842b);
        DateTime dateTime = this.f187843c;
        return Integer.hashCode(this.f187845e) + ((this.f187844d.hashCode() + ((iJ + (dateTime == null ? 0 : dateTime.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f187841a, "CompletedITP(planId=", ", planName=", this.f187842b);
        sbK.append(", raceDate=");
        sbK.append(this.f187843c);
        sbK.append(", activityType=");
        sbK.append(this.f187844d);
        return u0.k(sbK, ", numWeeksDuration=", this.f187845e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f187841a);
        parcel.writeString(this.f187842b);
        parcel.writeSerializable(this.f187843c);
        parcel.writeParcelable(this.f187844d, i14);
        parcel.writeInt(this.f187845e);
    }
}
