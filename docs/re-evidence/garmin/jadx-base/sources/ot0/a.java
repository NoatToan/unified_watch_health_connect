package ot0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lot0/a;", "Landroid/os/Parcelable;", "", "userProfileId", "", "totalNumber", "lastSyncTime", "", "ranking", "profileImageSmall", "profileImageMedium", "fullName", "displayName", "", "isKidPlayer", "", "avatarId", "Lb12/b;", "headerItemUserProfileImageData", "listItemUserProfileImageData", "<init>", "(Ljava/lang/String;DLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILb12/b;Lb12/b;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2539a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f133707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f133708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f133709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f133710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f133711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f133712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f133713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f133714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f133715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b12.b f133716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b12.b f133717l;

    /* JADX INFO: renamed from: ot0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2539a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            double d14 = parcel.readDouble();
            String string2 = parcel.readString();
            long j8 = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(string, d14, string2, j8, string3, string4, string5, string6, boolValueOf, parcel.readInt(), (b12.b) parcel.readParcelable(a.class.getClassLoader()), (b12.b) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, double d14, String str2, long j8, String str3, String str4, String str5, String str6, Boolean bool, int i14, b12.b bVar, b12.b bVar2, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? 0.0d : d14, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? 0L : j8, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : str5, (i15 & 128) != 0 ? null : str6, (i15 & 256) == 0 ? bool : null, (i15 & 512) != 0 ? 0 : i14, (i15 & 1024) != 0 ? b12.b.f14386g : bVar, (i15 & 2048) != 0 ? b12.b.f14386g : bVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f133706a, aVar.f133706a) && Double.compare(this.f133707b, aVar.f133707b) == 0 && s.g(this.f133708c, aVar.f133708c) && this.f133709d == aVar.f133709d && s.g(this.f133710e, aVar.f133710e) && s.g(this.f133711f, aVar.f133711f) && s.g(this.f133712g, aVar.f133712g) && s.g(this.f133713h, aVar.f133713h) && s.g(this.f133714i, aVar.f133714i) && this.f133715j == aVar.f133715j && s.g(this.f133716k, aVar.f133716k) && s.g(this.f133717l, aVar.f133717l);
    }

    public final int hashCode() {
        String str = this.f133706a;
        int iB = org.apache.commons.lang3.e.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f133707b);
        String str2 = this.f133708c;
        int iE = q6.f.e((iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f133709d);
        String str3 = this.f133710e;
        int iHashCode = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133711f;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133712g;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133713h;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f133714i;
        return this.f133717l.hashCode() + ((this.f133716k.hashCode() + q2.d(this.f133715j, (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdHocChallengeParticipantListItem(userProfileId=");
        sb3.append(this.f133706a);
        sb3.append(", totalNumber=");
        sb3.append(this.f133707b);
        am.j.y(sb3, ", lastSyncTime=", this.f133708c, ", ranking=");
        p6.b.k(this.f133709d, ", profileImageSmall=", this.f133710e, sb3);
        sn.a.t(sb3, ", profileImageMedium=", this.f133711f, ", fullName=", this.f133712g);
        sb3.append(", displayName=");
        sb3.append(this.f133713h);
        sb3.append(", isKidPlayer=");
        sb3.append(this.f133714i);
        sb3.append(", avatarId=");
        sb3.append(this.f133715j);
        sb3.append(", headerItemUserProfileImageData=");
        sb3.append(this.f133716k);
        sb3.append(", listItemUserProfileImageData=");
        sb3.append(this.f133717l);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f133706a);
        parcel.writeDouble(this.f133707b);
        parcel.writeString(this.f133708c);
        parcel.writeLong(this.f133709d);
        parcel.writeString(this.f133710e);
        parcel.writeString(this.f133711f);
        parcel.writeString(this.f133712g);
        parcel.writeString(this.f133713h);
        Boolean bool = this.f133714i;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeInt(this.f133715j);
        parcel.writeParcelable(this.f133716k, i14);
        parcel.writeParcelable(this.f133717l, i14);
    }

    public a(String str, double d14, String str2, long j8, String str3, String str4, String str5, String str6, Boolean bool, int i14, b12.b bVar, b12.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.f133706a = str;
        this.f133707b = d14;
        this.f133708c = str2;
        this.f133709d = j8;
        this.f133710e = str3;
        this.f133711f = str4;
        this.f133712g = str5;
        this.f133713h = str6;
        this.f133714i = bool;
        this.f133715j = i14;
        this.f133716k = bVar;
        this.f133717l = bVar2;
    }

    public a() {
        this(null, 0.0d, null, 0L, null, null, null, null, null, 0, null, null, 4095, null);
    }
}
