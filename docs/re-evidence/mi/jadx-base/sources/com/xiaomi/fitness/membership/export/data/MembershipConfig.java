package com.xiaomi.fitness.membership.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardUIInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/MembershipConfig;", "Landroid/os/Parcelable;", "cover", "", "title", CardUIInfo.KEY_SUBTITILE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCover", "()Ljava/lang/String;", "getTitle", "getSubTitle", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MembershipConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MembershipConfig> CREATOR = new Creator();

    @Nullable
    private final String cover;

    @SerializedName("sub_title")
    @NotNull
    private final String subTitle;

    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MembershipConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MembershipConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MembershipConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MembershipConfig[] newArray(int i) {
            return new MembershipConfig[i];
        }
    }

    public MembershipConfig(@Nullable String str, @NotNull String title, @NotNull String subTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        this.cover = str;
        this.title = title;
        this.subTitle = subTitle;
    }

    public static /* synthetic */ MembershipConfig copy$default(MembershipConfig membershipConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = membershipConfig.cover;
        }
        if ((i & 2) != 0) {
            str2 = membershipConfig.title;
        }
        if ((i & 4) != 0) {
            str3 = membershipConfig.subTitle;
        }
        return membershipConfig.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final MembershipConfig copy(@Nullable String cover, @NotNull String title, @NotNull String subTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        return new MembershipConfig(cover, title, subTitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipConfig)) {
            return false;
        }
        MembershipConfig membershipConfig = (MembershipConfig) other;
        return Intrinsics.areEqual(this.cover, membershipConfig.cover) && Intrinsics.areEqual(this.title, membershipConfig.title) && Intrinsics.areEqual(this.subTitle, membershipConfig.subTitle);
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.cover;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode();
    }

    @NotNull
    public String toString() {
        return "MembershipConfig(cover=" + this.cover + ", title=" + this.title + ", subTitle=" + this.subTitle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.cover);
        dest.writeString(this.title);
        dest.writeString(this.subTitle);
    }
}
