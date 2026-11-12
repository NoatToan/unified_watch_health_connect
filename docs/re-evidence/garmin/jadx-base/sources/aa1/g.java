package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Laa1/g;", "Landroid/os/Parcelable;", "Lq91/d;", "personalRecordType", "", "hasPersonalRecordCandidate", "hasPersonalRecord", "", "title", "titleContentDescription", "formattedStartDate", "recordDateIso", "formattedValue", "formattedValueContentDescription", "previousFormattedValue", "previousFormattedValueContentDescription", "", "iconResId", "shouldHighlightAsNew", "hasRequestInProgress", "<init>", "(Lq91/d;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZ)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q91.d f2275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f2284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f2286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2288n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            boolean z16;
            Integer num;
            parcel.getClass();
            q91.d dVar = (q91.d) parcel.readParcelable(g.class.getClassLoader());
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z18 = z15;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z19 = true;
            String string8 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                z19 = z18;
            }
            if (parcel.readInt() != 0) {
                num = numValueOf;
                z16 = true;
            } else {
                Integer num2 = numValueOf;
                z16 = z18;
                num = num2;
            }
            return new g(dVar, z17, z14, string, string2, string3, string4, string5, string6, string7, string8, num, z19, z16);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(q91.d dVar, boolean z14, boolean z15, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, z14, z15, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? null : str7, (i14 & 1024) != 0 ? null : str8, (i14 & 2048) != 0 ? null : num, (i14 & 4096) != 0 ? false : z16, (i14 & 8192) != 0 ? false : z17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2275a == gVar.f2275a && this.f2276b == gVar.f2276b && this.f2277c == gVar.f2277c && s.g(this.f2278d, gVar.f2278d) && s.g(this.f2279e, gVar.f2279e) && s.g(this.f2280f, gVar.f2280f) && s.g(this.f2281g, gVar.f2281g) && s.g(this.f2282h, gVar.f2282h) && s.g(this.f2283i, gVar.f2283i) && s.g(this.f2284j, gVar.f2284j) && s.g(this.f2285k, gVar.f2285k) && s.g(this.f2286l, gVar.f2286l) && this.f2287m == gVar.f2287m && this.f2288n == gVar.f2288n;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(this.f2275a.hashCode() * 31, 31, this.f2276b), 31, this.f2277c);
        String str = this.f2278d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2279e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2280f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2281g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2282h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2283i;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2284j;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f2285k;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f2286l;
        return Boolean.hashCode(this.f2288n) + q6.f.g((iHashCode8 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f2287m);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PersonalRecordTypeState(personalRecordType=");
        sb3.append(this.f2275a);
        sb3.append(", hasPersonalRecordCandidate=");
        sb3.append(this.f2276b);
        sb3.append(", hasPersonalRecord=");
        fb1.c.w(", title=", this.f2278d, ", titleContentDescription=", sb3, this.f2277c);
        sn.a.t(sb3, this.f2279e, ", formattedStartDate=", this.f2280f, ", recordDateIso=");
        sn.a.t(sb3, this.f2281g, ", formattedValue=", this.f2282h, ", formattedValueContentDescription=");
        sn.a.t(sb3, this.f2283i, ", previousFormattedValue=", this.f2284j, ", previousFormattedValueContentDescription=");
        fb1.c.u(this.f2286l, this.f2285k, ", iconResId=", ", shouldHighlightAsNew=", sb3);
        return com.airbnb.lottie.animation.keyframe.a.f(", hasRequestInProgress=", ")", sb3, this.f2287m, this.f2288n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f2275a, i14);
        parcel.writeInt(this.f2276b ? 1 : 0);
        parcel.writeInt(this.f2277c ? 1 : 0);
        parcel.writeString(this.f2278d);
        parcel.writeString(this.f2279e);
        parcel.writeString(this.f2280f);
        parcel.writeString(this.f2281g);
        parcel.writeString(this.f2282h);
        parcel.writeString(this.f2283i);
        parcel.writeString(this.f2284j);
        parcel.writeString(this.f2285k);
        Integer num = this.f2286l;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeInt(this.f2287m ? 1 : 0);
        parcel.writeInt(this.f2288n ? 1 : 0);
    }

    public g(q91.d dVar, boolean z14, boolean z15, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, boolean z16, boolean z17) {
        dVar.getClass();
        this.f2275a = dVar;
        this.f2276b = z14;
        this.f2277c = z15;
        this.f2278d = str;
        this.f2279e = str2;
        this.f2280f = str3;
        this.f2281g = str4;
        this.f2282h = str5;
        this.f2283i = str6;
        this.f2284j = str7;
        this.f2285k = str8;
        this.f2286l = num;
        this.f2287m = z16;
        this.f2288n = z17;
    }
}
