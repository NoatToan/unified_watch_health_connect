package ww1;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lww1/p;", "Lww1/r;", "", "planId", "", "planName", "Lorg/joda/time/DateTime;", "raceDate", "Ltw1/n;", "planType", "Lvt1/o;", "trainingType", "Lam/x0;", "activityType", "", "numWeeksDuration", "<init>", "(JLjava/lang/String;Lorg/joda/time/DateTime;Ltw1/n;Lvt1/o;Lam/x0;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p extends r {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f187848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tw1.n f187849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt1.o f187850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f187851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f187852g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new p(parcel.readLong(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : tw1.n.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? vt1.o.valueOf(parcel.readString()) : null, (x0) parcel.readParcelable(p.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public p(long j8, String str, DateTime dateTime, tw1.n nVar, vt1.o oVar, x0 x0Var, int i14) {
        str.getClass();
        x0Var.getClass();
        this.f187846a = j8;
        this.f187847b = str;
        this.f187848c = dateTime;
        this.f187849d = nVar;
        this.f187850e = oVar;
        this.f187851f = x0Var;
        this.f187852g = i14;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final x0 getF187856d() {
        return this.f187851f;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF187857e() {
        return this.f187852g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f187846a == pVar.f187846a && p005kotlin.jvm.internal.s.g(this.f187847b, pVar.f187847b) && p005kotlin.jvm.internal.s.g(this.f187848c, pVar.f187848c) && p005kotlin.jvm.internal.s.g(this.f187849d, pVar.f187849d) && this.f187850e == pVar.f187850e && this.f187851f == pVar.f187851f && this.f187852g == pVar.f187852g;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF187853a() {
        return this.f187846a;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF187854b() {
        return this.f187847b;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: h, reason: from getter */
    public final DateTime getF187855c() {
        return this.f187848c;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f187846a) * 31, 31, this.f187847b);
        DateTime dateTime = this.f187848c;
        int iHashCode = (iJ + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        tw1.n nVar = this.f187849d;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        vt1.o oVar = this.f187850e;
        return Integer.hashCode(this.f187852g) + ((this.f187851f.hashCode() + ((iHashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f187846a, "CompletedSTP(planId=", ", planName=", this.f187847b);
        sbK.append(", raceDate=");
        sbK.append(this.f187848c);
        sbK.append(", planType=");
        sbK.append(this.f187849d);
        sbK.append(", trainingType=");
        sbK.append(this.f187850e);
        sbK.append(", activityType=");
        sbK.append(this.f187851f);
        return u0.k(sbK, ", numWeeksDuration=", this.f187852g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f187846a);
        parcel.writeString(this.f187847b);
        parcel.writeSerializable(this.f187848c);
        tw1.n nVar = this.f187849d;
        if (nVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nVar.writeToParcel(parcel, i14);
        }
        vt1.o oVar = this.f187850e;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(oVar.name());
        }
        parcel.writeParcelable(this.f187851f, i14);
        parcel.writeInt(this.f187852g);
    }
}
