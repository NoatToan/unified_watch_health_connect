package com.xiaomi.fitness.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.mibi.sdk.common.CommonConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/account/MiAccountCoreInfo;", "Landroid/os/Parcelable;", "userId", "", CommonConstants.KEY_USER_NAME, "avatarAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getUserName", "getAvatarAddress", "setAvatarAddress", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MiAccountCoreInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MiAccountCoreInfo> CREATOR = new Creator();

    @Nullable
    private String avatarAddress;

    @Nullable
    private final String userId;

    @Nullable
    private final String userName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiAccountCoreInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MiAccountCoreInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MiAccountCoreInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MiAccountCoreInfo[] newArray(int i) {
            return new MiAccountCoreInfo[i];
        }
    }

    public MiAccountCoreInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.userId = str;
        this.userName = str2;
        this.avatarAddress = str3;
    }

    public static /* synthetic */ MiAccountCoreInfo copy$default(MiAccountCoreInfo miAccountCoreInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = miAccountCoreInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = miAccountCoreInfo.userName;
        }
        if ((i & 4) != 0) {
            str3 = miAccountCoreInfo.avatarAddress;
        }
        return miAccountCoreInfo.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarAddress() {
        return this.avatarAddress;
    }

    @NotNull
    public final MiAccountCoreInfo copy(@Nullable String userId, @Nullable String userName, @Nullable String avatarAddress) {
        return new MiAccountCoreInfo(userId, userName, avatarAddress);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiAccountCoreInfo)) {
            return false;
        }
        MiAccountCoreInfo miAccountCoreInfo = (MiAccountCoreInfo) other;
        return Intrinsics.areEqual(this.userId, miAccountCoreInfo.userId) && Intrinsics.areEqual(this.userName, miAccountCoreInfo.userName) && Intrinsics.areEqual(this.avatarAddress, miAccountCoreInfo.avatarAddress);
    }

    @Nullable
    public final String getAvatarAddress() {
        return this.avatarAddress;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarAddress;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAvatarAddress(@Nullable String str) {
        this.avatarAddress = str;
    }

    @NotNull
    public String toString() {
        return "MiAccountCoreInfo(userId=" + this.userId + ", userName=" + this.userName + ", avatarAddress=" + this.avatarAddress + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userId);
        dest.writeString(this.userName);
        dest.writeString(this.avatarAddress);
    }
}
