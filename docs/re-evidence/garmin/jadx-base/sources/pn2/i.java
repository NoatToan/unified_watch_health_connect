package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lpn2/i;", "Landroid/os/Parcelable;", "Lpn2/h;", "provision", "userHistory", "topUp", FirebaseAnalytics.Event.REFUND, "updateUserInfo", "<init>", "(Lpn2/h;Lpn2/h;Lpn2/h;Lpn2/h;Lpn2/h;)V", "a", "Lpn2/h;", "b", "()Lpn2/h;", "h", "c", "f", "d", JWKParameterNames.RSA_EXPONENT, "g", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("provision")
    private final h provision;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userHistory")
    private final h userHistory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("topUp")
    private final h topUp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Event.REFUND)
    private final h refund;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateUserInfo")
    private final h updateUserInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<h> creator = h.CREATOR;
            return new i(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(h hVar, h hVar2, h hVar3, h hVar4, h hVar5) {
        hVar.getClass();
        hVar2.getClass();
        hVar3.getClass();
        hVar4.getClass();
        hVar5.getClass();
        this.provision = hVar;
        this.userHistory = hVar2;
        this.topUp = hVar3;
        this.refund = hVar4;
        this.updateUserInfo = hVar5;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getProvision() {
        return this.provision;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getRefund() {
        return this.refund;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.provision, iVar.provision) && p005kotlin.jvm.internal.s.g(this.userHistory, iVar.userHistory) && p005kotlin.jvm.internal.s.g(this.topUp, iVar.topUp) && p005kotlin.jvm.internal.s.g(this.refund, iVar.refund) && p005kotlin.jvm.internal.s.g(this.updateUserInfo, iVar.updateUserInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getTopUp() {
        return this.topUp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h getUpdateUserInfo() {
        return this.updateUserInfo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h getUserHistory() {
        return this.userHistory;
    }

    public final int hashCode() {
        return this.updateUserInfo.hashCode() + ((this.refund.hashCode() + ((this.topUp.hashCode() + ((this.userHistory.hashCode() + (this.provision.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FNMaintenanceTimesDto(provision=" + this.provision + ", userHistory=" + this.userHistory + ", topUp=" + this.topUp + ", refund=" + this.refund + ", updateUserInfo=" + this.updateUserInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.provision.writeToParcel(parcel, i14);
        this.userHistory.writeToParcel(parcel, i14);
        this.topUp.writeToParcel(parcel, i14);
        this.refund.writeToParcel(parcel, i14);
        this.updateUserInfo.writeToParcel(parcel, i14);
    }
}
