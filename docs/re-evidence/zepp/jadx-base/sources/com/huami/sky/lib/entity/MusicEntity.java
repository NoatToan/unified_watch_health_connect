package com.huami.sky.lib.entity;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity(tableName = "music_entity")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/huami/sky/lib/entity/MusicEntity;", "", "", "component1", "Lcom/huami/sky/lib/entity/MusicInfo;", "component2", "", "component3", "", "Lcom/huami/sky/lib/entity/MusicTags;", "component4", "time", "musicClip", "animationUrl", "tags", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getTime", "()J", "setTime", "(J)V", "Lcom/huami/sky/lib/entity/MusicInfo;", "getMusicClip", "()Lcom/huami/sky/lib/entity/MusicInfo;", "Ljava/lang/String;", "getAnimationUrl", "()Ljava/lang/String;", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "<init>", "(JLcom/huami/sky/lib/entity/MusicInfo;Ljava/lang/String;Ljava/util/List;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicEntity {

    @NotNull
    private final String animationUrl;

    @Embedded
    @NotNull
    private final MusicInfo musicClip;

    @NotNull
    private final List<MusicTags> tags;

    @PrimaryKey
    private long time;

    public MusicEntity(long j, @NotNull MusicInfo musicInfo, @NotNull String str, @NotNull List<MusicTags> list) {
        this.time = j;
        this.musicClip = musicInfo;
        this.animationUrl = str;
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicEntity copy$default(MusicEntity musicEntity, long j, MusicInfo musicInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicEntity.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            musicInfo = musicEntity.musicClip;
        }
        MusicInfo musicInfo2 = musicInfo;
        if ((i & 4) != 0) {
            str = musicEntity.animationUrl;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = musicEntity.tags;
        }
        return musicEntity.copy(j2, musicInfo2, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MusicInfo getMusicClip() {
        return this.musicClip;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    @NotNull
    public final List<MusicTags> component4() {
        return this.tags;
    }

    @NotNull
    public final MusicEntity copy(long time, @NotNull MusicInfo musicClip, @NotNull String animationUrl, @NotNull List<MusicTags> tags) {
        return new MusicEntity(time, musicClip, animationUrl, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicEntity)) {
            return false;
        }
        MusicEntity musicEntity = (MusicEntity) other;
        return this.time == musicEntity.time && Intrinsics.areEqual(this.musicClip, musicEntity.musicClip) && Intrinsics.areEqual(this.animationUrl, musicEntity.animationUrl) && Intrinsics.areEqual(this.tags, musicEntity.tags);
    }

    @NotNull
    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    @NotNull
    public final MusicInfo getMusicClip() {
        return this.musicClip;
    }

    @NotNull
    public final List<MusicTags> getTags() {
        return this.tags;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((b.a(this.time) * 31) + this.musicClip.hashCode()) * 31) + this.animationUrl.hashCode()) * 31) + this.tags.hashCode();
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "MusicEntity(time=" + this.time + ", musicClip=" + this.musicClip + ", animationUrl=" + this.animationUrl + ", tags=" + this.tags + ")";
    }
}
