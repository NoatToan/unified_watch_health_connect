package com.huami.sky.lib.entity;

import com.huami.sky.lib.constant.MusicPauseFrom;
import com.huami.sky.lib.constant.MusicPlayRecordEnum;
import com.huami.sky.lib.constant.WebConstant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/sky/lib/entity/MusicPlayRecord;", "", "", "component1", "Lcom/huami/sky/lib/constant/MusicPlayRecordEnum;", "component2", "", "component3", "Lcom/huami/sky/lib/constant/MusicPauseFrom;", "component4", "id", "status", "time", WebConstant.QueryParam.PAUSE_TYPE, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/huami/sky/lib/constant/MusicPlayRecordEnum;", "getStatus", "()Lcom/huami/sky/lib/constant/MusicPlayRecordEnum;", "J", "getTime", "()J", "Lcom/huami/sky/lib/constant/MusicPauseFrom;", "getPauseType", "()Lcom/huami/sky/lib/constant/MusicPauseFrom;", "<init>", "(Ljava/lang/String;Lcom/huami/sky/lib/constant/MusicPlayRecordEnum;JLcom/huami/sky/lib/constant/MusicPauseFrom;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicPlayRecord {

    @NotNull
    private final String id;

    @Nullable
    private final MusicPauseFrom pauseType;

    @NotNull
    private final MusicPlayRecordEnum status;
    private final long time;

    public MusicPlayRecord(@NotNull String str, @NotNull MusicPlayRecordEnum musicPlayRecordEnum, long j, @Nullable MusicPauseFrom musicPauseFrom) {
        this.id = str;
        this.status = musicPlayRecordEnum;
        this.time = j;
        this.pauseType = musicPauseFrom;
    }

    public static /* synthetic */ MusicPlayRecord copy$default(MusicPlayRecord musicPlayRecord, String str, MusicPlayRecordEnum musicPlayRecordEnum, long j, MusicPauseFrom musicPauseFrom, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicPlayRecord.id;
        }
        if ((i & 2) != 0) {
            musicPlayRecordEnum = musicPlayRecord.status;
        }
        MusicPlayRecordEnum musicPlayRecordEnum2 = musicPlayRecordEnum;
        if ((i & 4) != 0) {
            j = musicPlayRecord.time;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            musicPauseFrom = musicPlayRecord.pauseType;
        }
        return musicPlayRecord.copy(str, musicPlayRecordEnum2, j2, musicPauseFrom);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MusicPlayRecordEnum getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MusicPauseFrom getPauseType() {
        return this.pauseType;
    }

    @NotNull
    public final MusicPlayRecord copy(@NotNull String id, @NotNull MusicPlayRecordEnum status, long time, @Nullable MusicPauseFrom pauseType) {
        return new MusicPlayRecord(id, status, time, pauseType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicPlayRecord)) {
            return false;
        }
        MusicPlayRecord musicPlayRecord = (MusicPlayRecord) other;
        return Intrinsics.areEqual(this.id, musicPlayRecord.id) && this.status == musicPlayRecord.status && this.time == musicPlayRecord.time && this.pauseType == musicPlayRecord.pauseType;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final MusicPauseFrom getPauseType() {
        return this.pauseType;
    }

    @NotNull
    public final MusicPlayRecordEnum getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + b.a(this.time)) * 31;
        MusicPauseFrom musicPauseFrom = this.pauseType;
        return iHashCode + (musicPauseFrom == null ? 0 : musicPauseFrom.hashCode());
    }

    @NotNull
    public String toString() {
        return "MusicPlayRecord(id=" + this.id + ", status=" + this.status + ", time=" + this.time + ", pauseType=" + this.pauseType + ")";
    }

    public /* synthetic */ MusicPlayRecord(String str, MusicPlayRecordEnum musicPlayRecordEnum, long j, MusicPauseFrom musicPauseFrom, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, musicPlayRecordEnum, j, (i & 8) != 0 ? null : musicPauseFrom);
    }
}
