package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.t;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Laa1/d;", "Landroid/os/Parcelable;", "", "prTitle", "prTitleContentDescription", "prFormattedTime", "", "prTimestampGMT", "prValue", "prValueContentDescription", "activityId", "personalRecordId", "activityTypeKey", "", "prNumericValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;D)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f2255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f2256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f2258j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(String str, String str2, String str3, long j8, String str4, String str5, Long l14, Long l15, String str6, double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        String str7;
        String str8;
        str2 = (i14 & 2) != 0 ? str : str2;
        if ((i14 & 32) != 0) {
            str8 = str4;
            str7 = str8;
        } else {
            str7 = str5;
            str8 = str4;
        }
        this(str, str2, str3, j8, str8, str7, l14, l15, str6, d14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f2249a, dVar.f2249a) && s.g(this.f2250b, dVar.f2250b) && s.g(this.f2251c, dVar.f2251c) && this.f2252d == dVar.f2252d && s.g(this.f2253e, dVar.f2253e) && s.g(this.f2254f, dVar.f2254f) && s.g(this.f2255g, dVar.f2255g) && s.g(this.f2256h, dVar.f2256h) && s.g(this.f2257i, dVar.f2257i) && Double.compare(this.f2258j, dVar.f2258j) == 0;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(q6.f.e(wr.g.j(wr.g.j(this.f2249a.hashCode() * 31, 31, this.f2250b), 31, this.f2251c), 31, this.f2252d), 31, this.f2253e), 31, this.f2254f);
        Long l14 = this.f2255g;
        int iHashCode = (iJ + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f2256h;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f2257i;
        return Double.hashCode(this.f2258j) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("PersonalRecordHistoryItemState(prTitle=", this.f2249a, ", prTitleContentDescription=", this.f2250b, ", prFormattedTime=");
        e5.s(this.f2252d, this.f2251c, ", prTimestampGMT=", sbI);
        sn.a.t(sbI, ", prValue=", this.f2253e, ", prValueContentDescription=", this.f2254f);
        sbI.append(", activityId=");
        sbI.append(this.f2255g);
        sbI.append(", personalRecordId=");
        sbI.append(this.f2256h);
        am.j.y(sbI, ", activityTypeKey=", this.f2257i, ", prNumericValue=");
        return t.d(this.f2258j, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f2249a);
        parcel.writeString(this.f2250b);
        parcel.writeString(this.f2251c);
        parcel.writeLong(this.f2252d);
        parcel.writeString(this.f2253e);
        parcel.writeString(this.f2254f);
        Long l14 = this.f2255g;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f2256h;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.f2257i);
        parcel.writeDouble(this.f2258j);
    }

    public d(String str, String str2, String str3, long j8, String str4, String str5, Long l14, Long l15, String str6, double d14) {
        hb.a.p(str, str2, str3, str4, str5);
        this.f2249a = str;
        this.f2250b = str2;
        this.f2251c = str3;
        this.f2252d = j8;
        this.f2253e = str4;
        this.f2254f = str5;
        this.f2255g = l14;
        this.f2256h = l15;
        this.f2257i = str6;
        this.f2258j = d14;
    }
}
