package ui1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lui1/b0;", "Landroid/os/Parcelable;", "", "userHasExploreAccount", "userCanAccessMessengerApp", "inReachActive", "inReachUnderExploreUserTenant", "inReachAssignedToExploreUser", "exploreUserDifferentInReach", "inReachSuspended", "<init>", "(ZZZZZZZ)V", "a", "Z", "g", "()Z", "b", "getUserCanAccessMessengerApp", "c", "d", "f", JWKParameterNames.RSA_EXPONENT, "getExploreUserDifferentInReach", "getInReachSuspended", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UserHasExploreAccount")
    private final boolean userHasExploreAccount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UserCanAccessMessengerApp")
    private final boolean userCanAccessMessengerApp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("InReachIsActive")
    private final boolean inReachActive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("InReachIsUnderExploreUsersTenant")
    private final boolean inReachUnderExploreUserTenant;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("InReachIsAssignedToExploreUser")
    private final boolean inReachAssignedToExploreUser;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ExploreUserHasDifferentInReachAssigned")
    private final boolean exploreUserDifferentInReach;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("InReachIsSuspended")
    private final boolean inReachSuspended;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b0> {
        @Override // android.os.Parcelable.Creator
        public final b0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = false;
            boolean z15 = true;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            if (parcel.readInt() != 0) {
                z14 = z15;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new b0(z16, z14, z15, z14, z15, z14, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b0[] newArray(int i14) {
            return new b0[i14];
        }
    }

    public b0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        this.userHasExploreAccount = z14;
        this.userCanAccessMessengerApp = z15;
        this.inReachActive = z16;
        this.inReachUnderExploreUserTenant = z17;
        this.inReachAssignedToExploreUser = z18;
        this.exploreUserDifferentInReach = z19;
        this.inReachSuspended = z24;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getInReachActive() {
        return this.inReachActive;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInReachAssignedToExploreUser() {
        return this.inReachAssignedToExploreUser;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.userHasExploreAccount == b0Var.userHasExploreAccount && this.userCanAccessMessengerApp == b0Var.userCanAccessMessengerApp && this.inReachActive == b0Var.inReachActive && this.inReachUnderExploreUserTenant == b0Var.inReachUnderExploreUserTenant && this.inReachAssignedToExploreUser == b0Var.inReachAssignedToExploreUser && this.exploreUserDifferentInReach == b0Var.exploreUserDifferentInReach && this.inReachSuspended == b0Var.inReachSuspended;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getInReachUnderExploreUserTenant() {
        return this.inReachUnderExploreUserTenant;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getUserHasExploreAccount() {
        return this.userHasExploreAccount;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.inReachSuspended) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.userHasExploreAccount) * 31, 31, this.userCanAccessMessengerApp), 31, this.inReachActive), 31, this.inReachUnderExploreUserTenant), 31, this.inReachAssignedToExploreUser), 31, this.exploreUserDifferentInReach);
    }

    public final String toString() {
        boolean z14 = this.userHasExploreAccount;
        boolean z15 = this.userCanAccessMessengerApp;
        boolean z16 = this.inReachActive;
        boolean z17 = this.inReachUnderExploreUserTenant;
        boolean z18 = this.inReachAssignedToExploreUser;
        boolean z19 = this.exploreUserDifferentInReach;
        boolean z24 = this.inReachSuspended;
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("InReachUserDeviceState(userHasExploreAccount=", ", userCanAccessMessengerApp=", ", inReachActive=", z14, z15);
        kg.f.q(", inReachUnderExploreUserTenant=", ", inReachAssignedToExploreUser=", sbM, z16, z17);
        kg.f.q(", exploreUserDifferentInReach=", ", inReachSuspended=", sbM, z18, z19);
        return hb.a.k(sbM, z24, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.userHasExploreAccount ? 1 : 0);
        parcel.writeInt(this.userCanAccessMessengerApp ? 1 : 0);
        parcel.writeInt(this.inReachActive ? 1 : 0);
        parcel.writeInt(this.inReachUnderExploreUserTenant ? 1 : 0);
        parcel.writeInt(this.inReachAssignedToExploreUser ? 1 : 0);
        parcel.writeInt(this.exploreUserDifferentInReach ? 1 : 0);
        parcel.writeInt(this.inReachSuspended ? 1 : 0);
    }
}
