package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/p;", "Landroid/os/Parcelable;", "", "imageUuid", "Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "profileImageType", "profileFrameKey", "Lcom/garmin/android/apps/connectmobile/userprofile/model/i;", "profileImageUrlDTO", "framedProfileImageUrlDTO", "<init>", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/h;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/i;Lcom/garmin/android/apps/connectmobile/userprofile/model/i;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "f", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "c", "d", "Lcom/garmin/android/apps/connectmobile/userprofile/model/i;", "getProfileImageUrlDTO", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/i;", JWKParameterNames.RSA_EXPONENT, "getFramedProfileImageUrlDTO", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUuid")
    private final String imageUuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageType")
    private final h profileImageType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileFrameKey")
    private final String profileFrameKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrl")
    private final i profileImageUrlDTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("framedProfileImageUrl")
    private final i framedProfileImageUrlDTO;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new p(parcel.readString(), h.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? i.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public p(String str, h hVar, String str2, i iVar, i iVar2) {
        str.getClass();
        hVar.getClass();
        this.imageUuid = str;
        this.profileImageType = hVar;
        this.profileFrameKey = str2;
        this.profileImageUrlDTO = iVar;
        this.framedProfileImageUrlDTO = iVar2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageUuid() {
        return this.imageUuid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProfileFrameKey() {
        return this.profileFrameKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return s.g(this.imageUuid, pVar.imageUuid) && this.profileImageType == pVar.profileImageType && s.g(this.profileFrameKey, pVar.profileFrameKey) && s.g(this.profileImageUrlDTO, pVar.profileImageUrlDTO) && s.g(this.framedProfileImageUrlDTO, pVar.framedProfileImageUrlDTO);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getProfileImageType() {
        return this.profileImageType;
    }

    public final String g() {
        i iVar = this.profileImageUrlDTO;
        if (iVar != null) {
            return iVar.getProfileImageUrlLarge();
        }
        return null;
    }

    public final boolean h() {
        return this.profileImageType != h.UPLOADED_PHOTO;
    }

    public final int hashCode() {
        int iHashCode = (this.profileImageType.hashCode() + (this.imageUuid.hashCode() * 31)) * 31;
        String str = this.profileFrameKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.profileImageUrlDTO;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        i iVar2 = this.framedProfileImageUrlDTO;
        return iHashCode3 + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public final String toString() {
        return "UserProfileImageDTO(imageUuid=" + this.imageUuid + ", profileImageType=" + this.profileImageType + ", profileFrameKey=" + this.profileFrameKey + ", profileImageUrlDTO=" + this.profileImageUrlDTO + ", framedProfileImageUrlDTO=" + this.framedProfileImageUrlDTO + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.imageUuid);
        parcel.writeString(this.profileImageType.name());
        parcel.writeString(this.profileFrameKey);
        i iVar = this.profileImageUrlDTO;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        i iVar2 = this.framedProfileImageUrlDTO;
        if (iVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar2.writeToParcel(parcel, i14);
        }
    }
}
