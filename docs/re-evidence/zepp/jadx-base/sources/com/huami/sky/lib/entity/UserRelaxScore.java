package com.huami.sky.lib.entity;

import androidx.room.Embedded;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity(primaryKeys = {"userId", "createdAt"}, tableName = "relaxScore")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/sky/lib/entity/UserRelaxScore;", "", "", "component1", "Lcom/huami/sky/lib/entity/RelaxInfo;", "component2", "userId", "relaxInfo", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "Lcom/huami/sky/lib/entity/RelaxInfo;", "getRelaxInfo", "()Lcom/huami/sky/lib/entity/RelaxInfo;", "<init>", "(Ljava/lang/String;Lcom/huami/sky/lib/entity/RelaxInfo;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserRelaxScore {

    @Embedded
    @NotNull
    private final RelaxInfo relaxInfo;

    @NotNull
    private final String userId;

    public UserRelaxScore(@NotNull String str, @NotNull RelaxInfo relaxInfo) {
        this.userId = str;
        this.relaxInfo = relaxInfo;
    }

    public static /* synthetic */ UserRelaxScore copy$default(UserRelaxScore userRelaxScore, String str, RelaxInfo relaxInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userRelaxScore.userId;
        }
        if ((i & 2) != 0) {
            relaxInfo = userRelaxScore.relaxInfo;
        }
        return userRelaxScore.copy(str, relaxInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RelaxInfo getRelaxInfo() {
        return this.relaxInfo;
    }

    @NotNull
    public final UserRelaxScore copy(@NotNull String userId, @NotNull RelaxInfo relaxInfo) {
        return new UserRelaxScore(userId, relaxInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRelaxScore)) {
            return false;
        }
        UserRelaxScore userRelaxScore = (UserRelaxScore) other;
        return Intrinsics.areEqual(this.userId, userRelaxScore.userId) && Intrinsics.areEqual(this.relaxInfo, userRelaxScore.relaxInfo);
    }

    @NotNull
    public final RelaxInfo getRelaxInfo() {
        return this.relaxInfo;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.relaxInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserRelaxScore(userId=" + this.userId + ", relaxInfo=" + this.relaxInfo + ")";
    }
}
