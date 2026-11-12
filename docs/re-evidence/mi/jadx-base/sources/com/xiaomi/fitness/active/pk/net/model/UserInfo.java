package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "", "userId", "", "nickName", "", "icon", "goalList", "", "Lcom/xiaomi/fitness/active/pk/net/model/DailyGoalItem;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getUserId", "()J", "getNickName", "()Ljava/lang/String;", "getIcon", "getGoalList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserInfo {

    @SerializedName("regular_goal_list")
    @Nullable
    private final List<DailyGoalItem> goalList;

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("nick_name")
    @Nullable
    private final String nickName;

    @SerializedName("user_id")
    private final long userId;

    public UserInfo(long j, @Nullable String str, @Nullable String str2, @Nullable List<DailyGoalItem> list) {
        this.userId = j;
        this.nickName = str;
        this.icon = str2;
        this.goalList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, long j, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userInfo.userId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = userInfo.nickName;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = userInfo.icon;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = userInfo.goalList;
        }
        return userInfo.copy(j2, str3, str4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final List<DailyGoalItem> component4() {
        return this.goalList;
    }

    @NotNull
    public final UserInfo copy(long userId, @Nullable String nickName, @Nullable String icon, @Nullable List<DailyGoalItem> goalList) {
        return new UserInfo(userId, nickName, icon, goalList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return this.userId == userInfo.userId && Intrinsics.areEqual(this.nickName, userInfo.nickName) && Intrinsics.areEqual(this.icon, userInfo.icon) && Intrinsics.areEqual(this.goalList, userInfo.goalList);
    }

    @Nullable
    public final List<DailyGoalItem> getGoalList() {
        return this.goalList;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.userId) * 31;
        String str = this.nickName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DailyGoalItem> list = this.goalList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserInfo(userId=" + this.userId + ", nickName=" + this.nickName + ", icon=" + this.icon + ", goalList=" + this.goalList + ")";
    }
}
