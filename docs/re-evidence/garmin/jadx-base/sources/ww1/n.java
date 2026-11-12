package ww1;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lww1/n;", "Lww1/r;", "", "planId", "", "planName", "Lorg/joda/time/DateTime;", "raceDate", "Ltw1/n;", "planType", "Lvt1/o;", "trainingType", "Lam/x0;", "activityType", "", "numWeeksDuration", "<init>", "(JLjava/lang/String;Lorg/joda/time/DateTime;Ltw1/n;Lvt1/o;Lam/x0;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n extends r {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f187836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tw1.n f187837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt1.o f187838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f187839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f187840g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readLong(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : tw1.n.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? vt1.o.valueOf(parcel.readString()) : null, (x0) parcel.readParcelable(n.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(long j8, String str, DateTime dateTime, tw1.n nVar, vt1.o oVar, x0 x0Var, int i14) {
        str.getClass();
        x0Var.getClass();
        this.f187834a = j8;
        this.f187835b = str;
        this.f187836c = dateTime;
        this.f187837d = nVar;
        this.f187838e = oVar;
        this.f187839f = x0Var;
        this.f187840g = i14;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final x0 getF187856d() {
        return this.f187839f;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF187857e() {
        return this.f187840g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f187834a == nVar.f187834a && p005kotlin.jvm.internal.s.g(this.f187835b, nVar.f187835b) && p005kotlin.jvm.internal.s.g(this.f187836c, nVar.f187836c) && p005kotlin.jvm.internal.s.g(this.f187837d, nVar.f187837d) && this.f187838e == nVar.f187838e && this.f187839f == nVar.f187839f && this.f187840g == nVar.f187840g;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF187853a() {
        return this.f187834a;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF187854b() {
        return this.f187835b;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: h, reason: from getter */
    public final DateTime getF187855c() {
        return this.f187836c;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f187834a) * 31, 31, this.f187835b);
        DateTime dateTime = this.f187836c;
        int iHashCode = (iJ + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        tw1.n nVar = this.f187837d;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        vt1.o oVar = this.f187838e;
        return Integer.hashCode(this.f187840g) + ((this.f187839f.hashCode() + ((iHashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f187834a, "CompletedFBT(planId=", ", planName=", this.f187835b);
        sbK.append(", raceDate=");
        sbK.append(this.f187836c);
        sbK.append(", planType=");
        sbK.append(this.f187837d);
        sbK.append(", trainingType=");
        sbK.append(this.f187838e);
        sbK.append(", activityType=");
        sbK.append(this.f187839f);
        return u0.k(sbK, ", numWeeksDuration=", this.f187840g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f187834a);
        parcel.writeString(this.f187835b);
        parcel.writeSerializable(this.f187836c);
        tw1.n nVar = this.f187837d;
        if (nVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nVar.writeToParcel(parcel, i14);
        }
        vt1.o oVar = this.f187838e;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(oVar.name());
        }
        parcel.writeParcelable(this.f187839f, i14);
        parcel.writeInt(this.f187840g);
    }
}
