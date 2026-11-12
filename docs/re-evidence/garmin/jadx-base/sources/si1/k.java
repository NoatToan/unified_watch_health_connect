package si1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lsi1/k;", "Landroid/os/Parcelable;", "", "isLoading", "isError", "", "unitId", "subscriptionResponseEmpty", "Lsi1/r;", "subscriptionState", "isMessengerAppInstalled", "isDeviceConnected", "showDirectActivationBanner", "showEmergencyInfoAlert", "showFinishInReachSetupBanner", "Lsi1/e;", "deviceActivationStatus", "<init>", "(ZZJZLsi1/r;ZZZZZLsi1/e;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f159396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f159397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f159398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f159399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f159400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f159401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f159402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f159403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f159404k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            boolean z16;
            Parcel parcel2;
            r rVarCreateFromParcel;
            boolean z17;
            boolean z18;
            parcel.getClass();
            boolean z19 = false;
            boolean z24 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z19 = true;
            }
            long j8 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z14 = true;
                z15 = true;
                z16 = false;
            } else {
                z14 = true;
                z15 = z19;
                z16 = z15;
            }
            if (parcel.readInt() == 0) {
                rVarCreateFromParcel = null;
                parcel2 = parcel;
            } else {
                parcel2 = parcel;
                rVarCreateFromParcel = r.CREATOR.createFromParcel(parcel2);
            }
            r rVar = rVarCreateFromParcel;
            if (parcel2.readInt() == 0) {
                z14 = z16;
            }
            if (parcel2.readInt() != 0) {
                z17 = z16;
                z18 = z14;
            } else {
                z17 = z16;
                z18 = z17;
            }
            boolean z25 = parcel2.readInt() != 0 ? z14 : z17;
            if (parcel.readInt() == 0) {
                z14 = z17;
            }
            if (parcel.readInt() != 0) {
                z17 = z14;
            }
            return new k(z24, z19, j8, z15, rVar, z14, z18, z25, z14, z17, e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(boolean z14, boolean z15, long j8, boolean z16, r rVar, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, j8, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? null : rVar, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? false : z18, (i14 & 128) != 0 ? false : z19, (i14 & 256) != 0 ? false : z24, (i14 & 512) != 0 ? false : z25, (i14 & 1024) != 0 ? e.UNKNOWN : eVar);
    }

    public static k b(k kVar, boolean z14, boolean z15, r rVar, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, e eVar, int i14) {
        boolean z25 = (i14 & 1) != 0 ? kVar.f159394a : z14;
        boolean z26 = (i14 & 2) != 0 ? kVar.f159395b : z15;
        long j8 = kVar.f159396c;
        boolean z27 = kVar.f159397d;
        r rVar2 = (i14 & 16) != 0 ? kVar.f159398e : rVar;
        boolean z28 = (i14 & 32) != 0 ? kVar.f159399f : z16;
        boolean z29 = (i14 & 64) != 0 ? kVar.f159400g : z17;
        boolean z34 = (i14 & 128) != 0 ? kVar.f159401h : z18;
        boolean z35 = (i14 & 256) != 0 ? kVar.f159402i : z19;
        boolean z36 = (i14 & 512) != 0 ? kVar.f159403j : z24;
        e eVar2 = (i14 & 1024) != 0 ? kVar.f159404k : eVar;
        kVar.getClass();
        eVar2.getClass();
        return new k(z25, z26, j8, z27, rVar2, z28, z29, z34, z35, z36, eVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f159394a == kVar.f159394a && this.f159395b == kVar.f159395b && this.f159396c == kVar.f159396c && this.f159397d == kVar.f159397d && p005kotlin.jvm.internal.s.g(this.f159398e, kVar.f159398e) && this.f159399f == kVar.f159399f && this.f159400g == kVar.f159400g && this.f159401h == kVar.f159401h && this.f159402i == kVar.f159402i && this.f159403j == kVar.f159403j && this.f159404k == kVar.f159404k;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.e(q6.f.g(Boolean.hashCode(this.f159394a) * 31, 31, this.f159395b), 31, this.f159396c), 31, this.f159397d);
        r rVar = this.f159398e;
        return this.f159404k.hashCode() + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iG + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.f159399f), 31, this.f159400g), 31, this.f159401h), 31, this.f159402i), 31, this.f159403j);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("InReachManageSubscriptionViewState(isLoading=", ", isError=", ", unitId=", this.f159394a, this.f159395b);
        sbM.append(this.f159396c);
        sbM.append(", subscriptionResponseEmpty=");
        sbM.append(this.f159397d);
        sbM.append(", subscriptionState=");
        sbM.append(this.f159398e);
        sbM.append(", isMessengerAppInstalled=");
        sbM.append(this.f159399f);
        com.airbnb.lottie.animation.keyframe.a.v(", isDeviceConnected=", ", showDirectActivationBanner=", sbM, this.f159400g, this.f159401h);
        com.airbnb.lottie.animation.keyframe.a.v(", showEmergencyInfoAlert=", ", showFinishInReachSetupBanner=", sbM, this.f159402i, this.f159403j);
        sbM.append(", deviceActivationStatus=");
        sbM.append(this.f159404k);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f159394a ? 1 : 0);
        parcel.writeInt(this.f159395b ? 1 : 0);
        parcel.writeLong(this.f159396c);
        parcel.writeInt(this.f159397d ? 1 : 0);
        r rVar = this.f159398e;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f159399f ? 1 : 0);
        parcel.writeInt(this.f159400g ? 1 : 0);
        parcel.writeInt(this.f159401h ? 1 : 0);
        parcel.writeInt(this.f159402i ? 1 : 0);
        parcel.writeInt(this.f159403j ? 1 : 0);
        parcel.writeString(this.f159404k.name());
    }

    public k(boolean z14, boolean z15, long j8, boolean z16, r rVar, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, e eVar) {
        eVar.getClass();
        this.f159394a = z14;
        this.f159395b = z15;
        this.f159396c = j8;
        this.f159397d = z16;
        this.f159398e = rVar;
        this.f159399f = z17;
        this.f159400g = z18;
        this.f159401h = z19;
        this.f159402i = z24;
        this.f159403j = z25;
        this.f159404k = eVar;
    }
}
