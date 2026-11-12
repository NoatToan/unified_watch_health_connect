package ps;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lps/d1;", "Landroid/os/Parcelable;", "", "activityId", "", "duration", "distance", "avgSpeed", "cumulativeTime", "Lam/x0;", "activityType", "", "isPersonalRecord", "startTime", "endTime", "", "secondLine", "thirdLine", "<init>", "(Ljava/lang/Long;DDDDLam/x0;ZDDLjava/lang/String;Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d1 implements Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f139785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f139786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f139787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f139788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f139789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public am.x0 f139790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f139791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f139792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f139793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f139794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f139795k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d1> {
        @Override // android.os.Parcelable.Creator
        public final d1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d1(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), am.x0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d1[] newArray(int i14) {
            return new d1[i14];
        }
    }

    public /* synthetic */ d1(Long l14, double d14, double d15, double d16, double d17, am.x0 x0Var, boolean z14, double d18, double d19, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, d14, d15, d16, d17, x0Var, z14, d18, d19, (i14 & 512) != 0 ? null : str, (i14 & 1024) != 0 ? null : str2);
    }

    public static d1 b(d1 d1Var) {
        Long l14 = d1Var.f139785a;
        double d14 = d1Var.f139786b;
        double d15 = d1Var.f139787c;
        double d16 = d1Var.f139788d;
        double d17 = d1Var.f139789e;
        am.x0 x0Var = d1Var.f139790f;
        boolean z14 = d1Var.f139791g;
        double d18 = d1Var.f139792h;
        double d19 = d1Var.f139793i;
        String str = d1Var.f139794j;
        String str2 = d1Var.f139795k;
        d1Var.getClass();
        x0Var.getClass();
        return new d1(l14, d14, d15, d16, d17, x0Var, z14, d18, d19, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return p005kotlin.jvm.internal.s.g(this.f139785a, d1Var.f139785a) && Double.compare(this.f139786b, d1Var.f139786b) == 0 && Double.compare(this.f139787c, d1Var.f139787c) == 0 && Double.compare(this.f139788d, d1Var.f139788d) == 0 && Double.compare(this.f139789e, d1Var.f139789e) == 0 && this.f139790f == d1Var.f139790f && this.f139791g == d1Var.f139791g && Double.compare(this.f139792h, d1Var.f139792h) == 0 && Double.compare(this.f139793i, d1Var.f139793i) == 0 && p005kotlin.jvm.internal.s.g(this.f139794j, d1Var.f139794j) && p005kotlin.jvm.internal.s.g(this.f139795k, d1Var.f139795k);
    }

    public final int hashCode() {
        Long l14 = this.f139785a;
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q6.f.g((this.f139790f.hashCode() + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f139786b), 31, this.f139787c), 31, this.f139788d), 31, this.f139789e)) * 31, 31, this.f139791g), 31, this.f139792h), 31, this.f139793i);
        String str = this.f139794j;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f139795k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        double d14 = this.f139786b;
        double d15 = this.f139787c;
        double d16 = this.f139788d;
        double d17 = this.f139789e;
        am.x0 x0Var = this.f139790f;
        double d18 = this.f139792h;
        double d19 = this.f139793i;
        String str = this.f139794j;
        String str2 = this.f139795k;
        StringBuilder sb3 = new StringBuilder("MultisportLeg(activityId=");
        sb3.append(this.f139785a);
        sb3.append(", duration=");
        sb3.append(d14);
        am.j.x(sb3, ", distance=", d15, ", avgSpeed=");
        sb3.append(d16);
        am.j.x(sb3, ", cumulativeTime=", d17, ", activityType=");
        sb3.append(x0Var);
        sb3.append(", isPersonalRecord=");
        sb3.append(this.f139791g);
        sb3.append(", startTime=");
        sb3.append(d18);
        am.j.x(sb3, ", endTime=", d19, ", secondLine=");
        return e5.h(sb3, str, ", thirdLine=", str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f139785a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeDouble(this.f139786b);
        parcel.writeDouble(this.f139787c);
        parcel.writeDouble(this.f139788d);
        parcel.writeDouble(this.f139789e);
        this.f139790f.writeToParcel(parcel, i14);
        parcel.writeInt(this.f139791g ? 1 : 0);
        parcel.writeDouble(this.f139792h);
        parcel.writeDouble(this.f139793i);
        parcel.writeString(this.f139794j);
        parcel.writeString(this.f139795k);
    }

    public d1(Long l14, double d14, double d15, double d16, double d17, am.x0 x0Var, boolean z14, double d18, double d19, String str, String str2) {
        x0Var.getClass();
        this.f139785a = l14;
        this.f139786b = d14;
        this.f139787c = d15;
        this.f139788d = d16;
        this.f139789e = d17;
        this.f139790f = x0Var;
        this.f139791g = z14;
        this.f139792h = d18;
        this.f139793i = d19;
        this.f139794j = str;
        this.f139795k = str2;
    }
}
