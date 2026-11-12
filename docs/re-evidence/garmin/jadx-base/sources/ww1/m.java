package ww1;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lww1/m;", "Lww1/r;", "", "planId", "", "planName", "", "finished", "coachName", "Lrt1/r;", "planDistanceType", "Lorg/joda/time/DateTime;", "raceDate", "Lam/x0;", "activityType", "", "numWeeksDuration", "<init>", "(JLjava/lang/String;ZLjava/lang/String;Lrt1/r;Lorg/joda/time/DateTime;Lam/x0;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends r {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f187829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rt1.r f187830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f187831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0 f187832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f187833h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : rt1.r.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), (x0) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(long j8, String str, boolean z14, String str2, rt1.r rVar, DateTime dateTime, x0 x0Var, int i14) {
        str.getClass();
        x0Var.getClass();
        this.f187826a = j8;
        this.f187827b = str;
        this.f187828c = z14;
        this.f187829d = str2;
        this.f187830e = rVar;
        this.f187831f = dateTime;
        this.f187832g = x0Var;
        this.f187833h = i14;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final x0 getF187832g() {
        return this.f187832g;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF187833h() {
        return this.f187833h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF187826a() {
        return this.f187826a;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF187827b() {
        return this.f187827b;
    }

    @Override // ww1.r
    /* JADX INFO: renamed from: h, reason: from getter */
    public final DateTime getF187831f() {
        return this.f187831f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f187826a);
        parcel.writeString(this.f187827b);
        parcel.writeInt(this.f187828c ? 1 : 0);
        parcel.writeString(this.f187829d);
        rt1.r rVar = this.f187830e;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rVar.name());
        }
        parcel.writeSerializable(this.f187831f);
        parcel.writeParcelable(this.f187832g, i14);
        parcel.writeInt(this.f187833h);
    }
}
