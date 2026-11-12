package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/l;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/v;", "userProfile", "connectionProfile", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/v;Lcom/garmin/android/apps/connectmobile/badges/service/model/v;)V", "a", "Lcom/garmin/android/apps/connectmobile/badges/service/model/v;", "d", "()Lcom/garmin/android/apps/connectmobile/badges/service/model/v;", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("user")
    private final v userProfile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connection")
    private final v connectionProfile;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readInt() == 0 ? null : v.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? v.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(v vVar, v vVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : vVar, (i14 & 2) != 0 ? null : vVar2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getConnectionProfile() {
        return this.connectionProfile;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getUserProfile() {
        return this.userProfile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfile, lVar.userProfile) && p005kotlin.jvm.internal.s.g(this.connectionProfile, lVar.connectionProfile);
    }

    public final int hashCode() {
        v vVar = this.userProfile;
        int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        v vVar2 = this.connectionProfile;
        return iHashCode + (vVar2 != null ? vVar2.hashCode() : 0);
    }

    public final String toString() {
        return "CompareBadgesDTO(userProfile=" + this.userProfile + ", connectionProfile=" + this.connectionProfile + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        v vVar = this.userProfile;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vVar.writeToParcel(parcel, i14);
        }
        v vVar2 = this.connectionProfile;
        if (vVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vVar2.writeToParcel(parcel, i14);
        }
    }

    public l(v vVar, v vVar2) {
        this.userProfile = vVar;
        this.connectionProfile = vVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
