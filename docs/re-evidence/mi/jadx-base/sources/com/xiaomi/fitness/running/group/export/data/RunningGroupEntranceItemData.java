package com.xiaomi.fitness.running.group.export.data;

import com.google.gson.annotations.SerializedName;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceItemData;", "", "id", "", MedicalIdSPContract.PREF_AVATAR_PATH, "name", "joinCount", "", "tag", "isJoin", "isRecommend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getAvatar", "getName", "getJoinCount", "()I", "getTag", "join", "", "getJoin", "()Z", "recommend", "getRecommend", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "running-group-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RunningGroupEntranceItemData {

    @NotNull
    private final String avatar;

    @SerializedName(CirculateDeviceInfo.GROUP_ID)
    @NotNull
    private final String id;

    @SerializedName("is_join")
    private final int isJoin;

    @SerializedName("is_recommend")
    private final int isRecommend;

    @SerializedName("join_num")
    private final int joinCount;

    @NotNull
    private final String name;

    @NotNull
    private final String tag;

    public RunningGroupEntranceItemData(@NotNull String id, @NotNull String avatar, @NotNull String name, int i, @NotNull String tag, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.id = id;
        this.avatar = avatar;
        this.name = name;
        this.joinCount = i;
        this.tag = tag;
        this.isJoin = i2;
        this.isRecommend = i3;
    }

    public static /* synthetic */ RunningGroupEntranceItemData copy$default(RunningGroupEntranceItemData runningGroupEntranceItemData, String str, String str2, String str3, int i, String str4, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = runningGroupEntranceItemData.id;
        }
        if ((i4 & 2) != 0) {
            str2 = runningGroupEntranceItemData.avatar;
        }
        String str5 = str2;
        if ((i4 & 4) != 0) {
            str3 = runningGroupEntranceItemData.name;
        }
        String str6 = str3;
        if ((i4 & 8) != 0) {
            i = runningGroupEntranceItemData.joinCount;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            str4 = runningGroupEntranceItemData.tag;
        }
        String str7 = str4;
        if ((i4 & 32) != 0) {
            i2 = runningGroupEntranceItemData.isJoin;
        }
        int i6 = i2;
        if ((i4 & 64) != 0) {
            i3 = runningGroupEntranceItemData.isRecommend;
        }
        return runningGroupEntranceItemData.copy(str, str5, str6, i5, str7, i6, i3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getJoinCount() {
        return this.joinCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIsJoin() {
        return this.isJoin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getIsRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public final RunningGroupEntranceItemData copy(@NotNull String id, @NotNull String avatar, @NotNull String name, int joinCount, @NotNull String tag, int isJoin, int isRecommend) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new RunningGroupEntranceItemData(id, avatar, name, joinCount, tag, isJoin, isRecommend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningGroupEntranceItemData)) {
            return false;
        }
        RunningGroupEntranceItemData runningGroupEntranceItemData = (RunningGroupEntranceItemData) other;
        return Intrinsics.areEqual(this.id, runningGroupEntranceItemData.id) && Intrinsics.areEqual(this.avatar, runningGroupEntranceItemData.avatar) && Intrinsics.areEqual(this.name, runningGroupEntranceItemData.name) && this.joinCount == runningGroupEntranceItemData.joinCount && Intrinsics.areEqual(this.tag, runningGroupEntranceItemData.tag) && this.isJoin == runningGroupEntranceItemData.isJoin && this.isRecommend == runningGroupEntranceItemData.isRecommend;
    }

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getJoin() {
        return this.isJoin == 1;
    }

    public final int getJoinCount() {
        return this.joinCount;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getRecommend() {
        return this.isRecommend == 1;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.avatar.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.joinCount)) * 31) + this.tag.hashCode()) * 31) + Integer.hashCode(this.isJoin)) * 31) + Integer.hashCode(this.isRecommend);
    }

    public final int isJoin() {
        return this.isJoin;
    }

    public final int isRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public String toString() {
        return "RunningGroupEntranceItemData(id=" + this.id + ", avatar=" + this.avatar + ", name=" + this.name + ", joinCount=" + this.joinCount + ", tag=" + this.tag + ", isJoin=" + this.isJoin + ", isRecommend=" + this.isRecommend + ")";
    }
}
