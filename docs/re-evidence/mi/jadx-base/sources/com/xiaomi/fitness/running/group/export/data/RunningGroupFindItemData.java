package com.xiaomi.fitness.running.group.export.data;

import com.google.gson.annotations.SerializedName;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/running/group/export/data/RunningGroupFindItemData;", "", CardInfo.KEY_CARD_GROUP_ID, "", MedicalIdSPContract.PREF_AVATAR_PATH, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getAvatar", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "running-group-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RunningGroupFindItemData {

    @NotNull
    private final String avatar;

    @SerializedName(CirculateDeviceInfo.GROUP_ID)
    @NotNull
    private final String groupId;

    public RunningGroupFindItemData(@NotNull String groupId, @NotNull String avatar) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.groupId = groupId;
        this.avatar = avatar;
    }

    public static /* synthetic */ RunningGroupFindItemData copy$default(RunningGroupFindItemData runningGroupFindItemData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runningGroupFindItemData.groupId;
        }
        if ((i & 2) != 0) {
            str2 = runningGroupFindItemData.avatar;
        }
        return runningGroupFindItemData.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final RunningGroupFindItemData copy(@NotNull String groupId, @NotNull String avatar) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new RunningGroupFindItemData(groupId, avatar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningGroupFindItemData)) {
            return false;
        }
        RunningGroupFindItemData runningGroupFindItemData = (RunningGroupFindItemData) other;
        return Intrinsics.areEqual(this.groupId, runningGroupFindItemData.groupId) && Intrinsics.areEqual(this.avatar, runningGroupFindItemData.avatar);
    }

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        return (this.groupId.hashCode() * 31) + this.avatar.hashCode();
    }

    @NotNull
    public String toString() {
        return "RunningGroupFindItemData(groupId=" + this.groupId + ", avatar=" + this.avatar + ")";
    }
}
