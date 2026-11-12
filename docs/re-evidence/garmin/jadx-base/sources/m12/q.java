package m12;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm12/q;", "", "", "hasDeviceBackups", "Lcom/garmin/android/apps/connectmobile/userprofile/model/r;", "userProfilePrivacyDto", "Lnj1/e;", "userPrivacyDto", "requireReviewFollowerRequests", "<init>", "(Ljava/lang/Boolean;Lcom/garmin/android/apps/connectmobile/userprofile/model/r;Lnj1/e;Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f115855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.model.r f115856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj1.e f115857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f115858d;

    static {
        Parcelable.Creator<nj1.e> creator = nj1.e.CREATOR;
        Parcelable.Creator<com.garmin.android.apps.connectmobile.userprofile.model.r> creator2 = com.garmin.android.apps.connectmobile.userprofile.model.r.CREATOR;
    }

    public q(Boolean bool, com.garmin.android.apps.connectmobile.userprofile.model.r rVar, nj1.e eVar, boolean z14) {
        this.f115855a = bool;
        this.f115856b = rVar;
        this.f115857c = eVar;
        this.f115858d = z14;
    }

    public static q a(q qVar, com.garmin.android.apps.connectmobile.userprofile.model.r rVar, nj1.e eVar, boolean z14, int i14) {
        Boolean bool = qVar.f115855a;
        if ((i14 & 2) != 0) {
            rVar = qVar.f115856b;
        }
        if ((i14 & 4) != 0) {
            eVar = qVar.f115857c;
        }
        if ((i14 & 8) != 0) {
            z14 = qVar.f115858d;
        }
        return new q(bool, rVar, eVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f115855a, qVar.f115855a) && p005kotlin.jvm.internal.s.g(this.f115856b, qVar.f115856b) && p005kotlin.jvm.internal.s.g(this.f115857c, qVar.f115857c) && this.f115858d == qVar.f115858d;
    }

    public final int hashCode() {
        Boolean bool = this.f115855a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar = this.f115856b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        nj1.e eVar = this.f115857c;
        return Boolean.hashCode(this.f115858d) + ((iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProfileData(hasDeviceBackups=" + this.f115855a + ", userProfilePrivacyDto=" + this.f115856b + ", userPrivacyDto=" + this.f115857c + ", requireReviewFollowerRequests=" + this.f115858d + ")";
    }
}
