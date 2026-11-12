package m12;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lm12/u;", "", "", "displayName", "Lcom/garmin/android/apps/connectmobile/userprofile/model/r;", "initialSocialPrivacyDto", "currentSocialPrivacyDto", "Lnj1/e;", "initialPrivacyDto", "currentPrivacyDto", "", "initialRequireReviewFollowerRequests", "requireReviewFollowerRequests", "hasChildRole", "<init>", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/r;Lcom/garmin/android/apps/connectmobile/userprofile/model/r;Lnj1/e;Lnj1/e;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.model.r f115894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.model.r f115895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nj1.e f115896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nj1.e f115897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f115898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f115899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f115900h;

    static {
        Parcelable.Creator<nj1.e> creator = nj1.e.CREATOR;
        Parcelable.Creator<com.garmin.android.apps.connectmobile.userprofile.model.r> creator2 = com.garmin.android.apps.connectmobile.userprofile.model.r.CREATOR;
    }

    public u(String str, com.garmin.android.apps.connectmobile.userprofile.model.r rVar, com.garmin.android.apps.connectmobile.userprofile.model.r rVar2, nj1.e eVar, nj1.e eVar2, Boolean bool, Boolean bool2, boolean z14) {
        str.getClass();
        this.f115893a = str;
        this.f115894b = rVar;
        this.f115895c = rVar2;
        this.f115896d = eVar;
        this.f115897e = eVar2;
        this.f115898f = bool;
        this.f115899g = bool2;
        this.f115900h = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f115893a.equals(uVar.f115893a) && p005kotlin.jvm.internal.s.g(this.f115894b, uVar.f115894b) && p005kotlin.jvm.internal.s.g(this.f115895c, uVar.f115895c) && p005kotlin.jvm.internal.s.g(this.f115896d, uVar.f115896d) && p005kotlin.jvm.internal.s.g(this.f115897e, uVar.f115897e) && p005kotlin.jvm.internal.s.g(this.f115898f, uVar.f115898f) && p005kotlin.jvm.internal.s.g(this.f115899g, uVar.f115899g) && this.f115900h == uVar.f115900h;
    }

    public final int hashCode() {
        int iHashCode = this.f115893a.hashCode() * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar = this.f115894b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar2 = this.f115895c;
        int iHashCode3 = (iHashCode2 + (rVar2 == null ? 0 : rVar2.hashCode())) * 31;
        nj1.e eVar = this.f115896d;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        nj1.e eVar2 = this.f115897e;
        int iHashCode5 = (iHashCode4 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        Boolean bool = this.f115898f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f115899g;
        return Boolean.hashCode(this.f115900h) + ((iHashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SaveParams(displayName=" + this.f115893a + ", initialSocialPrivacyDto=" + this.f115894b + ", currentSocialPrivacyDto=" + this.f115895c + ", initialPrivacyDto=" + this.f115896d + ", currentPrivacyDto=" + this.f115897e + ", initialRequireReviewFollowerRequests=" + this.f115898f + ", requireReviewFollowerRequests=" + this.f115899g + ", hasChildRole=" + this.f115900h + ")";
    }
}
