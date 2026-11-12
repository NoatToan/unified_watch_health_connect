package li0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lli0/d0;", "Landroid/os/Parcelable;", "Lb12/b;", "userProfileImageData", "Lli0/b0;", "buttonState", "", "displayName", "fullName", "", "isCurrentUser", "hintText", "", "requestIdSent", "requestIdReceived", "Lli0/n0;", "followStatusData", "<init>", "(Lb12/b;Lli0/b0;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lli0/n0;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f112647j = b12.b.f14385f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b12.b f112648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f112649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f112652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f112653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f112654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f112655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n0 f112656i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            b0 b0VarValueOf;
            Long l14;
            parcel.getClass();
            b12.b bVar = (b12.b) parcel.readParcelable(d0.class.getClassLoader());
            if (parcel.readInt() == 0) {
                b0VarValueOf = null;
                l14 = null;
            } else {
                b0VarValueOf = b0.valueOf(parcel.readString());
                l14 = null;
            }
            Long l15 = l14;
            return new d0(bVar, b0VarValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong()), (n0) (parcel.readInt() == 0 ? l15 : n0.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i14) {
            return new d0[i14];
        }
    }

    public /* synthetic */ d0(b12.b bVar, b0 b0Var, String str, String str2, boolean z14, String str3, Long l14, Long l15, n0 n0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : b0Var, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : l14, (i14 & 128) != 0 ? null : l15, (i14 & 256) != 0 ? null : n0Var);
    }

    public static d0 b(d0 d0Var, b12.b bVar, b0 b0Var, String str, String str2, Long l14, Long l15, n0 n0Var, int i14) {
        if ((i14 & 1) != 0) {
            bVar = d0Var.f112648a;
        }
        b12.b bVar2 = bVar;
        if ((i14 & 2) != 0) {
            b0Var = d0Var.f112649b;
        }
        b0 b0Var2 = b0Var;
        if ((i14 & 4) != 0) {
            str = d0Var.f112650c;
        }
        String str3 = str;
        String str4 = d0Var.f112651d;
        boolean z14 = d0Var.f112652e;
        String str5 = (i14 & 32) != 0 ? d0Var.f112653f : str2;
        Long l16 = (i14 & 64) != 0 ? d0Var.f112654g : l14;
        Long l17 = (i14 & 128) != 0 ? d0Var.f112655h : l15;
        n0 n0Var2 = (i14 & 256) != 0 ? d0Var.f112656i : n0Var;
        d0Var.getClass();
        return new d0(bVar2, b0Var2, str3, str4, z14, str5, l16, l17, n0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.f112648a, d0Var.f112648a) && this.f112649b == d0Var.f112649b && p005kotlin.jvm.internal.s.g(this.f112650c, d0Var.f112650c) && p005kotlin.jvm.internal.s.g(this.f112651d, d0Var.f112651d) && this.f112652e == d0Var.f112652e && p005kotlin.jvm.internal.s.g(this.f112653f, d0Var.f112653f) && p005kotlin.jvm.internal.s.g(this.f112654g, d0Var.f112654g) && p005kotlin.jvm.internal.s.g(this.f112655h, d0Var.f112655h) && p005kotlin.jvm.internal.s.g(this.f112656i, d0Var.f112656i);
    }

    public final int hashCode() {
        b12.b bVar = this.f112648a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        b0 b0Var = this.f112649b;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        String str = this.f112650c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f112651d;
        int iG = q6.f.g((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f112652e);
        String str3 = this.f112653f;
        int iHashCode4 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.f112654g;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f112655h;
        int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        n0 n0Var = this.f112656i;
        return iHashCode6 + (n0Var != null ? n0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FollowItemViewData(userProfileImageData=");
        sb3.append(this.f112648a);
        sb3.append(", buttonState=");
        sb3.append(this.f112649b);
        sb3.append(", displayName=");
        sn.a.t(sb3, this.f112650c, ", fullName=", this.f112651d, ", isCurrentUser=");
        fb1.c.w(", hintText=", this.f112653f, ", requestIdSent=", sb3, this.f112652e);
        kg.f.s(sb3, this.f112654g, ", requestIdReceived=", this.f112655h, ", followStatusData=");
        sb3.append(this.f112656i);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f112648a, i14);
        b0 b0Var = this.f112649b;
        if (b0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(b0Var.name());
        }
        parcel.writeString(this.f112650c);
        parcel.writeString(this.f112651d);
        parcel.writeInt(this.f112652e ? 1 : 0);
        parcel.writeString(this.f112653f);
        Long l14 = this.f112654g;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f112655h;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        n0 n0Var = this.f112656i;
        if (n0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            n0Var.writeToParcel(parcel, i14);
        }
    }

    public d0(b12.b bVar, b0 b0Var, String str, String str2, boolean z14, String str3, Long l14, Long l15, n0 n0Var) {
        this.f112648a = bVar;
        this.f112649b = b0Var;
        this.f112650c = str;
        this.f112651d = str2;
        this.f112652e = z14;
        this.f112653f = str3;
        this.f112654g = l14;
        this.f112655h = l15;
        this.f112656i = n0Var;
    }

    public d0() {
        this(null, null, null, null, false, null, null, null, null, 511, null);
    }
}
