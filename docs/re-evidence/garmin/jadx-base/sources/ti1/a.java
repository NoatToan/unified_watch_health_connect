package ti1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import si1.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lti1/a;", "Landroid/os/Parcelable;", "", "isLoading", "isError", "", "unitId", "hasActiveSubscription", "eligibleForFreeTrial", "", "freeTrialDuration", "directActivationCapableDevice", "Lsi1/w;", "subscriptionPurchaseStatus", "<init>", "(ZZJZZLjava/lang/Integer;ZLsi1/w;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3086a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f164577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f164578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f164579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f164580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f164582h;

    /* JADX INFO: renamed from: ti1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3086a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            boolean z16;
            parcel.getClass();
            boolean z17 = false;
            boolean z18 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z17 = true;
            }
            long j8 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z14 = true;
                z15 = true;
                z16 = false;
            } else {
                z14 = true;
                z15 = z17;
                z16 = z15;
            }
            if (parcel.readInt() != 0) {
                z16 = z14;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                z16 = z14;
            }
            return new a(z18, z17, j8, z15, z16, numValueOf, z16, w.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(boolean z14, boolean z15, long j8, boolean z16, boolean z17, Integer num, boolean z18, w wVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? -1L : j8, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? true : z18, (i14 & 128) != 0 ? w.UNKNOWN : wVar);
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
        return this.f164575a == aVar.f164575a && this.f164576b == aVar.f164576b && this.f164577c == aVar.f164577c && this.f164578d == aVar.f164578d && this.f164579e == aVar.f164579e && s.g(this.f164580f, aVar.f164580f) && this.f164581g == aVar.f164581g && this.f164582h == aVar.f164582h;
    }

    public final int hashCode() {
        int iG = f.g(f.g(f.e(f.g(Boolean.hashCode(this.f164575a) * 31, 31, this.f164576b), 31, this.f164577c), 31, this.f164578d), 31, this.f164579e);
        Integer num = this.f164580f;
        return this.f164582h.hashCode() + f.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.f164581g);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("InReachActivationScreenState(isLoading=", ", isError=", ", unitId=", this.f164575a, this.f164576b);
        sbM.append(this.f164577c);
        sbM.append(", hasActiveSubscription=");
        sbM.append(this.f164578d);
        sbM.append(", eligibleForFreeTrial=");
        sbM.append(this.f164579e);
        sbM.append(", freeTrialDuration=");
        sbM.append(this.f164580f);
        sbM.append(", directActivationCapableDevice=");
        sbM.append(this.f164581g);
        sbM.append(", subscriptionPurchaseStatus=");
        sbM.append(this.f164582h);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f164575a ? 1 : 0);
        parcel.writeInt(this.f164576b ? 1 : 0);
        parcel.writeLong(this.f164577c);
        parcel.writeInt(this.f164578d ? 1 : 0);
        parcel.writeInt(this.f164579e ? 1 : 0);
        Integer num = this.f164580f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeInt(this.f164581g ? 1 : 0);
        parcel.writeString(this.f164582h.name());
    }

    public a(boolean z14, boolean z15, long j8, boolean z16, boolean z17, Integer num, boolean z18, w wVar) {
        wVar.getClass();
        this.f164575a = z14;
        this.f164576b = z15;
        this.f164577c = j8;
        this.f164578d = z16;
        this.f164579e = z17;
        this.f164580f = num;
        this.f164581g = z18;
        this.f164582h = wVar;
    }

    public a() {
        this(false, false, 0L, false, false, null, false, null, 255, null);
    }
}
