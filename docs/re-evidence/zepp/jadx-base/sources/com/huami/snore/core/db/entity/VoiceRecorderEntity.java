package com.huami.snore.core.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.snore.core.dto.VoiceType;
import defpackage.b;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity(tableName = "voice_recorder_table")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003JS\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\"\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;", "", "", "component1", "", "component2", "component3", "Lcom/huami/snore/core/dto/VoiceType;", "component4", "Ljava/util/Date;", "component5", "component6", "", "component7", "id", "uid", "duration", "type", "startTime", "filePath", "uploaded", "copy", "toString", "", "hashCode", "other", "equals", "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "getDuration", "setDuration", "Lcom/huami/snore/core/dto/VoiceType;", "getType", "()Lcom/huami/snore/core/dto/VoiceType;", "setType", "(Lcom/huami/snore/core/dto/VoiceType;)V", "Ljava/util/Date;", "getStartTime", "()Ljava/util/Date;", "setStartTime", "(Ljava/util/Date;)V", "getFilePath", "setFilePath", "Z", "getUploaded", "()Z", "setUploaded", "(Z)V", "<init>", "(JLjava/lang/String;JLcom/huami/snore/core/dto/VoiceType;Ljava/util/Date;Ljava/lang/String;Z)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceRecorderEntity {
    private long duration;

    @ColumnInfo(name = "file_path")
    @Nullable
    private String filePath;

    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "start_time")
    @Nullable
    private Date startTime;

    @NotNull
    private VoiceType type;

    @NotNull
    private String uid;
    private boolean uploaded;

    public VoiceRecorderEntity() {
        this(0L, null, 0L, null, null, null, false, 127, null);
    }

    public VoiceRecorderEntity(long j, @NotNull String str, long j2, @NotNull VoiceType voiceType, @Nullable Date date, @Nullable String str2, boolean z) {
        this.id = j;
        this.uid = str;
        this.duration = j2;
        this.type = voiceType;
        this.startTime = date;
        this.filePath = str2;
        this.uploaded = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VoiceType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    @NotNull
    public final VoiceRecorderEntity copy(long id, @NotNull String uid, long duration, @NotNull VoiceType type, @Nullable Date startTime, @Nullable String filePath, boolean uploaded) {
        return new VoiceRecorderEntity(id, uid, duration, type, startTime, filePath, uploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceRecorderEntity)) {
            return false;
        }
        VoiceRecorderEntity voiceRecorderEntity = (VoiceRecorderEntity) other;
        return this.id == voiceRecorderEntity.id && Intrinsics.areEqual(this.uid, voiceRecorderEntity.uid) && this.duration == voiceRecorderEntity.duration && this.type == voiceRecorderEntity.type && Intrinsics.areEqual(this.startTime, voiceRecorderEntity.startTime) && Intrinsics.areEqual(this.filePath, voiceRecorderEntity.filePath) && this.uploaded == voiceRecorderEntity.uploaded;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final Date getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final VoiceType getType() {
        return this.type;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public int hashCode() {
        int iA = ((((((b.a(this.id) * 31) + this.uid.hashCode()) * 31) + b.a(this.duration)) * 31) + this.type.hashCode()) * 31;
        Date date = this.startTime;
        int iHashCode = (iA + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.filePath;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.uploaded;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setStartTime(@Nullable Date date) {
        this.startTime = date;
    }

    public final void setType(@NotNull VoiceType voiceType) {
        this.type = voiceType;
    }

    public final void setUid(@NotNull String str) {
        this.uid = str;
    }

    public final void setUploaded(boolean z) {
        this.uploaded = z;
    }

    @NotNull
    public String toString() {
        return "VoiceRecorderEntity(id=" + this.id + ", uid=" + this.uid + ", duration=" + this.duration + ", type=" + this.type + ", startTime=" + this.startTime + ", filePath=" + this.filePath + ", uploaded=" + this.uploaded + ")";
    }

    public /* synthetic */ VoiceRecorderEntity(long j, String str, long j2, VoiceType voiceType, Date date, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? VoiceType.SNORE : voiceType, (i & 16) != 0 ? null : date, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? false : z);
    }
}
