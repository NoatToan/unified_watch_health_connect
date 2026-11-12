package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/UserPkDetail;", "", "userInfo", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "pkScoreList", "", "Lcom/xiaomi/fitness/active/pk/net/model/PkScoreItem;", "totalScore", "", "<init>", "(Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;Ljava/util/List;J)V", "getUserInfo", "()Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "getPkScoreList", "()Ljava/util/List;", "getTotalScore", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserPkDetail {

    @SerializedName("pk_scores")
    @Nullable
    private final List<PkScoreItem> pkScoreList;

    @SerializedName("total_pk_score")
    private final long totalScore;

    @SerializedName("user_info")
    @Nullable
    private final UserInfo userInfo;

    public UserPkDetail(@Nullable UserInfo userInfo, @Nullable List<PkScoreItem> list, long j) {
        this.userInfo = userInfo;
        this.pkScoreList = list;
        this.totalScore = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserPkDetail copy$default(UserPkDetail userPkDetail, UserInfo userInfo, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            userInfo = userPkDetail.userInfo;
        }
        if ((i & 2) != 0) {
            list = userPkDetail.pkScoreList;
        }
        if ((i & 4) != 0) {
            j = userPkDetail.totalScore;
        }
        return userPkDetail.copy(userInfo, list, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    @Nullable
    public final List<PkScoreItem> component2() {
        return this.pkScoreList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotalScore() {
        return this.totalScore;
    }

    @NotNull
    public final UserPkDetail copy(@Nullable UserInfo userInfo, @Nullable List<PkScoreItem> pkScoreList, long totalScore) {
        return new UserPkDetail(userInfo, pkScoreList, totalScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPkDetail)) {
            return false;
        }
        UserPkDetail userPkDetail = (UserPkDetail) other;
        return Intrinsics.areEqual(this.userInfo, userPkDetail.userInfo) && Intrinsics.areEqual(this.pkScoreList, userPkDetail.pkScoreList) && this.totalScore == userPkDetail.totalScore;
    }

    @Nullable
    public final List<PkScoreItem> getPkScoreList() {
        return this.pkScoreList;
    }

    public final long getTotalScore() {
        return this.totalScore;
    }

    @Nullable
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        UserInfo userInfo = this.userInfo;
        int iHashCode = (userInfo == null ? 0 : userInfo.hashCode()) * 31;
        List<PkScoreItem> list = this.pkScoreList;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Long.hashCode(this.totalScore);
    }

    @NotNull
    public String toString() {
        return "UserPkDetail(userInfo=" + this.userInfo + ", pkScoreList=" + this.pkScoreList + ", totalScore=" + this.totalScore + ")";
    }
}
