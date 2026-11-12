package dq2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ldq2/f;", "Landroid/os/Parcelable;", "", "verificationId", "Lmp2/b;", "verificationState", "Lmp2/a;", "methodType", "value", "Ldq2/a;", "a2AContext", "Leq2/a;", "a2WContext", "verifyUrl", "selectUrl", "selfUrl", "<init>", "(Ljava/lang/String;Lmp2/b;Lmp2/a;Ljava/lang/String;Ldq2/a;Leq2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mp2.b f60807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mp2.a f60808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f60809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dq2.a f60810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eq2.a f60811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f60812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f60813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f60814i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readString(), parcel.readInt() == 0 ? null : mp2.b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : mp2.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : dq2.a.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? eq2.a.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(String str, mp2.b bVar, mp2.a aVar, String str2, dq2.a aVar2, eq2.a aVar3, String str3, String str4, String str5, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : aVar, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : aVar2, (i14 & 32) != 0 ? null : aVar3, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f60806a, fVar.f60806a) && this.f60807b == fVar.f60807b && this.f60808c == fVar.f60808c && s.g(this.f60809d, fVar.f60809d) && s.g(this.f60810e, fVar.f60810e) && s.g(this.f60811f, fVar.f60811f) && s.g(this.f60812g, fVar.f60812g) && s.g(this.f60813h, fVar.f60813h) && s.g(this.f60814i, fVar.f60814i);
    }

    public final int hashCode() {
        String str = this.f60806a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        mp2.b bVar = this.f60807b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        mp2.a aVar = this.f60808c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f60809d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        dq2.a aVar2 = this.f60810e;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        eq2.a aVar3 = this.f60811f;
        int iHashCode6 = (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str3 = this.f60812g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f60813h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f60814i;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FitPayVerificationMethod(verificationId=");
        sb3.append(this.f60806a);
        sb3.append(", verificationState=");
        sb3.append(this.f60807b);
        sb3.append(", methodType=");
        sb3.append(this.f60808c);
        sb3.append(", value=");
        sb3.append(this.f60809d);
        sb3.append(", a2AContext=");
        sb3.append(this.f60810e);
        sb3.append(", a2WContext=");
        sb3.append(this.f60811f);
        sb3.append(", verifyUrl=");
        sn.a.t(sb3, this.f60812g, ", selectUrl=", this.f60813h, ", selfUrl=");
        return am.j.o(this.f60814i, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f60806a);
        mp2.b bVar = this.f60807b;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        mp2.a aVar = this.f60808c;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.f60809d);
        dq2.a aVar2 = this.f60810e;
        if (aVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar2.writeToParcel(parcel, i14);
        }
        eq2.a aVar3 = this.f60811f;
        if (aVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar3.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f60812g);
        parcel.writeString(this.f60813h);
        parcel.writeString(this.f60814i);
    }

    public f(String str, mp2.b bVar, mp2.a aVar, String str2, dq2.a aVar2, eq2.a aVar3, String str3, String str4, String str5) {
        this.f60806a = str;
        this.f60807b = bVar;
        this.f60808c = aVar;
        this.f60809d = str2;
        this.f60810e = aVar2;
        this.f60811f = aVar3;
        this.f60812g = str3;
        this.f60813h = str4;
        this.f60814i = str5;
    }

    public f() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
