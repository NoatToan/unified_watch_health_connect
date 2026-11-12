package com.xiaomi.fitness.membership.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "Landroid/os/Parcelable;", Feature.WATCHFACE, "Lcom/xiaomi/fitness/membership/export/data/WatchFaceConfig;", "home", "Lcom/xiaomi/fitness/membership/export/data/HomeConfig;", "member", "Lcom/xiaomi/fitness/membership/export/data/MembershipConfig;", "<init>", "(Lcom/xiaomi/fitness/membership/export/data/WatchFaceConfig;Lcom/xiaomi/fitness/membership/export/data/HomeConfig;Lcom/xiaomi/fitness/membership/export/data/MembershipConfig;)V", "getWatchface", "()Lcom/xiaomi/fitness/membership/export/data/WatchFaceConfig;", "getHome", "()Lcom/xiaomi/fitness/membership/export/data/HomeConfig;", "getMember", "()Lcom/xiaomi/fitness/membership/export/data/MembershipConfig;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VipConfigInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VipConfigInfo> CREATOR = new Creator();

    @Nullable
    private final HomeConfig home;

    @Nullable
    private final MembershipConfig member;

    @Nullable
    private final WatchFaceConfig watchface;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VipConfigInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipConfigInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VipConfigInfo(parcel.readInt() == 0 ? null : WatchFaceConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : HomeConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MembershipConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipConfigInfo[] newArray(int i) {
            return new VipConfigInfo[i];
        }
    }

    public VipConfigInfo(@Nullable WatchFaceConfig watchFaceConfig, @Nullable HomeConfig homeConfig, @Nullable MembershipConfig membershipConfig) {
        this.watchface = watchFaceConfig;
        this.home = homeConfig;
        this.member = membershipConfig;
    }

    public static /* synthetic */ VipConfigInfo copy$default(VipConfigInfo vipConfigInfo, WatchFaceConfig watchFaceConfig, HomeConfig homeConfig, MembershipConfig membershipConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            watchFaceConfig = vipConfigInfo.watchface;
        }
        if ((i & 2) != 0) {
            homeConfig = vipConfigInfo.home;
        }
        if ((i & 4) != 0) {
            membershipConfig = vipConfigInfo.member;
        }
        return vipConfigInfo.copy(watchFaceConfig, homeConfig, membershipConfig);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WatchFaceConfig getWatchface() {
        return this.watchface;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HomeConfig getHome() {
        return this.home;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MembershipConfig getMember() {
        return this.member;
    }

    @NotNull
    public final VipConfigInfo copy(@Nullable WatchFaceConfig watchface, @Nullable HomeConfig home, @Nullable MembershipConfig member) {
        return new VipConfigInfo(watchface, home, member);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipConfigInfo)) {
            return false;
        }
        VipConfigInfo vipConfigInfo = (VipConfigInfo) other;
        return Intrinsics.areEqual(this.watchface, vipConfigInfo.watchface) && Intrinsics.areEqual(this.home, vipConfigInfo.home) && Intrinsics.areEqual(this.member, vipConfigInfo.member);
    }

    @Nullable
    public final HomeConfig getHome() {
        return this.home;
    }

    @Nullable
    public final MembershipConfig getMember() {
        return this.member;
    }

    @Nullable
    public final WatchFaceConfig getWatchface() {
        return this.watchface;
    }

    public int hashCode() {
        WatchFaceConfig watchFaceConfig = this.watchface;
        int iHashCode = (watchFaceConfig == null ? 0 : watchFaceConfig.hashCode()) * 31;
        HomeConfig homeConfig = this.home;
        int iHashCode2 = (iHashCode + (homeConfig == null ? 0 : homeConfig.hashCode())) * 31;
        MembershipConfig membershipConfig = this.member;
        return iHashCode2 + (membershipConfig != null ? membershipConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VipConfigInfo(watchface=" + this.watchface + ", home=" + this.home + ", member=" + this.member + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        WatchFaceConfig watchFaceConfig = this.watchface;
        if (watchFaceConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            watchFaceConfig.writeToParcel(dest, flags);
        }
        HomeConfig homeConfig = this.home;
        if (homeConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            homeConfig.writeToParcel(dest, flags);
        }
        MembershipConfig membershipConfig = this.member;
        if (membershipConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            membershipConfig.writeToParcel(dest, flags);
        }
    }
}
