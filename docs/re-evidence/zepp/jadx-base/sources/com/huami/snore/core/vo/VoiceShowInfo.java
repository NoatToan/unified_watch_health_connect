package com.huami.snore.core.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\bC\u0010DJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\fHÆ\u0003Ja\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\fHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010$\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b\u0015\u0010=\"\u0004\b>\u0010?R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010<\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?¨\u0006E"}, d2 = {"Lcom/huami/snore/core/vo/VoiceShowInfo;", "", "", "component1", "", "component2", "component3", "Lcom/huami/snore/core/dto/VoiceType;", "component4", "Ljava/util/Date;", "component5", "component6", "", "component7", "component8", "id", "durationStr", "duration", "type", "startTime", "filePath", "isPlaying", "uploaded", "copy", "toString", "", "hashCode", "other", "equals", "a", "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "b", "Ljava/lang/String;", "getDurationStr", "()Ljava/lang/String;", "setDurationStr", "(Ljava/lang/String;)V", "c", "getDuration", "setDuration", GoogleApiAvailabilityLight.a, "Lcom/huami/snore/core/dto/VoiceType;", "getType", "()Lcom/huami/snore/core/dto/VoiceType;", "setType", "(Lcom/huami/snore/core/dto/VoiceType;)V", "e", "Ljava/util/Date;", "getStartTime", "()Ljava/util/Date;", "setStartTime", "(Ljava/util/Date;)V", "f", "getFilePath", "setFilePath", "g", "Z", "()Z", "setPlaying", "(Z)V", "h", "getUploaded", "setUploaded", "<init>", "(JLjava/lang/String;JLcom/huami/snore/core/dto/VoiceType;Ljava/util/Date;Ljava/lang/String;ZZ)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceShowInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String durationStr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private long duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private VoiceType type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Date startTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private String filePath;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private boolean isPlaying;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private boolean uploaded;

    public VoiceShowInfo() {
        this(0L, null, 0L, null, null, null, false, false, 255, null);
    }

    public VoiceShowInfo(long j, @Nullable String str, long j2, @Nullable VoiceType voiceType, @Nullable Date date, @Nullable String str2, boolean z, boolean z2) {
        this.id = j;
        this.durationStr = str;
        this.duration = j2;
        this.type = voiceType;
        this.startTime = date;
        this.filePath = str2;
        this.isPlaying = z;
        this.uploaded = z2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDurationStr() {
        return this.durationStr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @Nullable
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
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    @NotNull
    public final VoiceShowInfo copy(long id, @Nullable String durationStr, long duration, @Nullable VoiceType type, @Nullable Date startTime, @Nullable String filePath, boolean isPlaying, boolean uploaded) {
        return new VoiceShowInfo(id, durationStr, duration, type, startTime, filePath, isPlaying, uploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceShowInfo)) {
            return false;
        }
        VoiceShowInfo voiceShowInfo = (VoiceShowInfo) other;
        return this.id == voiceShowInfo.id && Intrinsics.areEqual(this.durationStr, voiceShowInfo.durationStr) && this.duration == voiceShowInfo.duration && this.type == voiceShowInfo.type && Intrinsics.areEqual(this.startTime, voiceShowInfo.startTime) && Intrinsics.areEqual(this.filePath, voiceShowInfo.filePath) && this.isPlaying == voiceShowInfo.isPlaying && this.uploaded == voiceShowInfo.uploaded;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getDurationStr() {
        return this.durationStr;
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

    @Nullable
    public final VoiceType getType() {
        return this.type;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iA = b.a(this.id) * 31;
        String str = this.durationStr;
        int iHashCode = (((iA + (str == null ? 0 : str.hashCode())) * 31) + b.a(this.duration)) * 31;
        VoiceType voiceType = this.type;
        int iHashCode2 = (iHashCode + (voiceType == null ? 0 : voiceType.hashCode())) * 31;
        Date date = this.startTime;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.filePath;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isPlaying;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode4 + r1) * 31;
        boolean z2 = this.uploaded;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setDurationStr(@Nullable String str) {
        this.durationStr = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public final void setStartTime(@Nullable Date date) {
        this.startTime = date;
    }

    public final void setType(@Nullable VoiceType voiceType) {
        this.type = voiceType;
    }

    public final void setUploaded(boolean z) {
        this.uploaded = z;
    }

    @NotNull
    public String toString() {
        return "VoiceShowInfo(id=" + this.id + ", durationStr=" + this.durationStr + ", duration=" + this.duration + ", type=" + this.type + ", startTime=" + this.startTime + ", filePath=" + this.filePath + ", isPlaying=" + this.isPlaying + ", uploaded=" + this.uploaded + ")";
    }

    public /* synthetic */ VoiceShowInfo(long j, String str, long j2, VoiceType voiceType, Date date, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? null : voiceType, (i & 16) != 0 ? null : date, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false);
    }
}
