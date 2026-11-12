package com.huami.sky.lib.entity;

import androidx.room.Entity;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity(primaryKeys = {"userId", "sleepStartTime"}, tableName = "musicTag")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003JI\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010 R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\"\u0010\u001a¨\u0006%"}, d2 = {"Lcom/huami/sky/lib/entity/UserMusicTag;", "", "", "component1", "", "component2", "", "Lcom/huami/sky/lib/entity/MusicTags;", "component3", "Lcom/huami/sky/lib/entity/RelaxInfo;", "component4", "component5", "userId", "sleepStartTime", "musicTags", "scores", "daysOfContinuous", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "J", "getSleepStartTime", "()J", "Ljava/util/List;", "getMusicTags", "()Ljava/util/List;", "getScores", "getDaysOfContinuous", "<init>", "(Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserMusicTag {

    @Nullable
    private final String daysOfContinuous;

    @NotNull
    private final List<MusicTags> musicTags;

    @NotNull
    private final List<RelaxInfo> scores;
    private final long sleepStartTime;

    @NotNull
    private final String userId;

    public UserMusicTag(@NotNull String str, long j, @NotNull List<MusicTags> list, @NotNull List<RelaxInfo> list2, @Nullable String str2) {
        this.userId = str;
        this.sleepStartTime = j;
        this.musicTags = list;
        this.scores = list2;
        this.daysOfContinuous = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserMusicTag copy$default(UserMusicTag userMusicTag, String str, long j, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userMusicTag.userId;
        }
        if ((i & 2) != 0) {
            j = userMusicTag.sleepStartTime;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            list = userMusicTag.musicTags;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = userMusicTag.scores;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            str2 = userMusicTag.daysOfContinuous;
        }
        return userMusicTag.copy(str, j2, list3, list4, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSleepStartTime() {
        return this.sleepStartTime;
    }

    @NotNull
    public final List<MusicTags> component3() {
        return this.musicTags;
    }

    @NotNull
    public final List<RelaxInfo> component4() {
        return this.scores;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDaysOfContinuous() {
        return this.daysOfContinuous;
    }

    @NotNull
    public final UserMusicTag copy(@NotNull String userId, long sleepStartTime, @NotNull List<MusicTags> musicTags, @NotNull List<RelaxInfo> scores, @Nullable String daysOfContinuous) {
        return new UserMusicTag(userId, sleepStartTime, musicTags, scores, daysOfContinuous);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMusicTag)) {
            return false;
        }
        UserMusicTag userMusicTag = (UserMusicTag) other;
        return Intrinsics.areEqual(this.userId, userMusicTag.userId) && this.sleepStartTime == userMusicTag.sleepStartTime && Intrinsics.areEqual(this.musicTags, userMusicTag.musicTags) && Intrinsics.areEqual(this.scores, userMusicTag.scores) && Intrinsics.areEqual(this.daysOfContinuous, userMusicTag.daysOfContinuous);
    }

    @Nullable
    public final String getDaysOfContinuous() {
        return this.daysOfContinuous;
    }

    @NotNull
    public final List<MusicTags> getMusicTags() {
        return this.musicTags;
    }

    @NotNull
    public final List<RelaxInfo> getScores() {
        return this.scores;
    }

    public final long getSleepStartTime() {
        return this.sleepStartTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.userId.hashCode() * 31) + b.a(this.sleepStartTime)) * 31) + this.musicTags.hashCode()) * 31) + this.scores.hashCode()) * 31;
        String str = this.daysOfContinuous;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "UserMusicTag(userId=" + this.userId + ", sleepStartTime=" + this.sleepStartTime + ", musicTags=" + this.musicTags + ", scores=" + this.scores + ", daysOfContinuous=" + this.daysOfContinuous + ")";
    }
}
