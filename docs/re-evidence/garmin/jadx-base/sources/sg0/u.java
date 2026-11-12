package sg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsg0/u;", "Landroid/os/Parcelable;", "Lue0/l;", "childAccount", "Lnj1/b;", "profilePrivacy", "stepsPrivacy", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "badgesPrivacy", "activitiesPrivacy", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "hasUpdatedPrivacy", "hasConsentsToReview", "reviewContactsList", "showPrivacyPolicy", "isLivetrackCapable", "isSafetyFeatureCapable", "<init>", "(Lue0/l;Lnj1/b;Lnj1/b;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;Lnj1/b;ZLjava/lang/String;ZZZZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.l f159156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj1.b f159157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj1.b f159158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PrivacyType f159159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nj1.b f159160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f159161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f159162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f159163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f159164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f159165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f159166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f159167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f159168m;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            ue0.l lVar = (ue0.l) parcel.readParcelable(u.class.getClassLoader());
            nj1.b bVar = (nj1.b) parcel.readParcelable(u.class.getClassLoader());
            nj1.b bVar2 = (nj1.b) parcel.readParcelable(u.class.getClassLoader());
            PrivacyType privacyTypeValueOf = parcel.readInt() == 0 ? null : PrivacyType.valueOf(parcel.readString());
            nj1.b bVar3 = (nj1.b) parcel.readParcelable(u.class.getClassLoader());
            boolean z14 = false;
            boolean z15 = true;
            PrivacyType privacyType = privacyTypeValueOf;
            boolean z16 = parcel.readInt() != 0;
            String string = parcel.readString();
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            boolean z18 = parcel.readInt() != 0 ? true : z14;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z15 : z14);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = r8;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z15 : false);
            }
            return new u(lVar, bVar, bVar2, privacyType, bVar3, z16, string, z17, z14, z15, z18, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    static {
        Parcelable.Creator<nj1.b> creator = nj1.b.CREATOR;
        Parcelable.Creator<ue0.l> creator2 = ue0.l.CREATOR;
    }

    public /* synthetic */ u(ue0.l lVar, nj1.b bVar, nj1.b bVar2, PrivacyType privacyType, nj1.b bVar3, boolean z14, String str, boolean z15, boolean z16, boolean z17, boolean z18, Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : lVar, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : bVar2, (i14 & 8) != 0 ? null : privacyType, (i14 & 16) != 0 ? null : bVar3, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? null : str, (i14 & 128) != 0 ? false : z15, (i14 & 256) != 0 ? false : z16, (i14 & 512) != 0 ? false : z17, (i14 & 1024) == 0 ? z18 : false, (i14 & 2048) != 0 ? null : bool, (i14 & 4096) != 0 ? null : bool2);
    }

    public static u b(u uVar, nj1.b bVar, nj1.b bVar2, PrivacyType privacyType, nj1.b bVar3, boolean z14, String str, boolean z15, boolean z16, boolean z17, Boolean bool, Boolean bool2, int i14) {
        ue0.l lVar = uVar.f159156a;
        nj1.b bVar4 = (i14 & 2) != 0 ? uVar.f159157b : bVar;
        nj1.b bVar5 = (i14 & 4) != 0 ? uVar.f159158c : bVar2;
        PrivacyType privacyType2 = (i14 & 8) != 0 ? uVar.f159159d : privacyType;
        nj1.b bVar6 = (i14 & 16) != 0 ? uVar.f159160e : bVar3;
        boolean z18 = (i14 & 32) != 0 ? uVar.f159161f : z14;
        String str2 = (i14 & 64) != 0 ? uVar.f159162g : str;
        boolean z19 = uVar.f159163h;
        boolean z24 = (i14 & 256) != 0 ? uVar.f159164i : z15;
        boolean z25 = (i14 & 512) != 0 ? uVar.f159165j : z16;
        boolean z26 = (i14 & 1024) != 0 ? uVar.f159166k : z17;
        Boolean bool3 = (i14 & 2048) != 0 ? uVar.f159167l : bool;
        Boolean bool4 = (i14 & 4096) != 0 ? uVar.f159168m : bool2;
        uVar.getClass();
        return new u(lVar, bVar4, bVar5, privacyType2, bVar6, z18, str2, z19, z24, z25, z26, bool3, bool4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f159156a, uVar.f159156a) && p005kotlin.jvm.internal.s.g(this.f159157b, uVar.f159157b) && p005kotlin.jvm.internal.s.g(this.f159158c, uVar.f159158c) && this.f159159d == uVar.f159159d && p005kotlin.jvm.internal.s.g(this.f159160e, uVar.f159160e) && this.f159161f == uVar.f159161f && p005kotlin.jvm.internal.s.g(this.f159162g, uVar.f159162g) && this.f159163h == uVar.f159163h && this.f159164i == uVar.f159164i && this.f159165j == uVar.f159165j && this.f159166k == uVar.f159166k && p005kotlin.jvm.internal.s.g(this.f159167l, uVar.f159167l) && p005kotlin.jvm.internal.s.g(this.f159168m, uVar.f159168m);
    }

    public final int hashCode() {
        ue0.l lVar = this.f159156a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        nj1.b bVar = this.f159157b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        nj1.b bVar2 = this.f159158c;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        PrivacyType privacyType = this.f159159d;
        int iHashCode4 = (iHashCode3 + (privacyType == null ? 0 : privacyType.hashCode())) * 31;
        nj1.b bVar3 = this.f159160e;
        int iG = q6.f.g((iHashCode4 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31, 31, this.f159161f);
        String str = this.f159162g;
        int iG2 = q6.f.g(q6.f.g(q6.f.g(q6.f.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f159163h), 31, this.f159164i), 31, this.f159165j), 31, this.f159166k);
        Boolean bool = this.f159167l;
        int iHashCode5 = (iG2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f159168m;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChildUiState(childAccount=");
        sb3.append(this.f159156a);
        sb3.append(", profilePrivacy=");
        sb3.append(this.f159157b);
        sb3.append(", stepsPrivacy=");
        sb3.append(this.f159158c);
        sb3.append(", badgesPrivacy=");
        sb3.append(this.f159159d);
        sb3.append(", activitiesPrivacy=");
        sb3.append(this.f159160e);
        sb3.append(", isLoading=");
        sb3.append(this.f159161f);
        sb3.append(", error=");
        v.h.C(this.f159162g, ", hasUpdatedPrivacy=", ", hasConsentsToReview=", sb3, this.f159163h);
        kg.f.q(", reviewContactsList=", ", showPrivacyPolicy=", sb3, this.f159164i, this.f159165j);
        sb3.append(this.f159166k);
        sb3.append(", isLivetrackCapable=");
        sb3.append(this.f159167l);
        sb3.append(", isSafetyFeatureCapable=");
        return p6.b.f(sb3, this.f159168m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f159156a, i14);
        parcel.writeParcelable(this.f159157b, i14);
        parcel.writeParcelable(this.f159158c, i14);
        PrivacyType privacyType = this.f159159d;
        if (privacyType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(privacyType.name());
        }
        parcel.writeParcelable(this.f159160e, i14);
        parcel.writeInt(this.f159161f ? 1 : 0);
        parcel.writeString(this.f159162g);
        parcel.writeInt(this.f159163h ? 1 : 0);
        parcel.writeInt(this.f159164i ? 1 : 0);
        parcel.writeInt(this.f159165j ? 1 : 0);
        parcel.writeInt(this.f159166k ? 1 : 0);
        Boolean bool = this.f159167l;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.f159168m;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
    }

    public u(ue0.l lVar, nj1.b bVar, nj1.b bVar2, PrivacyType privacyType, nj1.b bVar3, boolean z14, String str, boolean z15, boolean z16, boolean z17, boolean z18, Boolean bool, Boolean bool2) {
        this.f159156a = lVar;
        this.f159157b = bVar;
        this.f159158c = bVar2;
        this.f159159d = privacyType;
        this.f159160e = bVar3;
        this.f159161f = z14;
        this.f159162g = str;
        this.f159163h = z15;
        this.f159164i = z16;
        this.f159165j = z17;
        this.f159166k = z18;
        this.f159167l = bool;
        this.f159168m = bool2;
    }

    public u() {
        this(null, null, null, null, null, false, null, false, false, false, false, null, null, 8191, null);
    }
}
