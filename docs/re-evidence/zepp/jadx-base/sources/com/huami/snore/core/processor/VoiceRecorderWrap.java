package com.huami.snore.core.processor;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.core.dto.VoiceType;
import com.xmlywind.sdk.common.mta.PointCategory;
import defpackage.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bG\u0010HJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0016\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b\u0018\u0010;\"\u0004\b<\u0010=R\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u00106\"\u0004\b@\u00108R$\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/huami/snore/core/processor/VoiceRecorderWrap;", "", "", PointCategory.INIT, "newWrite", "", "checkValid", "", "getDurationInMills", "Lcom/huami/snore/core/dto/VoiceType;", "component1", "", "component2", "Ljava/util/Date;", "component3", "component4", "component5", "component6", "Ljava/io/RandomAccessFile;", "component7", "type", "filePath", "startTime", "duration", "isEnd", "payloadSize", "writer", "copy", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/snore/core/dto/VoiceType;", "getType", "()Lcom/huami/snore/core/dto/VoiceType;", "setType", "(Lcom/huami/snore/core/dto/VoiceType;)V", "b", "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "c", "Ljava/util/Date;", "getStartTime", "()Ljava/util/Date;", "setStartTime", "(Ljava/util/Date;)V", GoogleApiAvailabilityLight.a, "J", "getDuration", "()J", "setDuration", "(J)V", "e", "Z", "()Z", "setEnd", "(Z)V", "f", "getPayloadSize", "setPayloadSize", "g", "Ljava/io/RandomAccessFile;", "getWriter", "()Ljava/io/RandomAccessFile;", "setWriter", "(Ljava/io/RandomAccessFile;)V", "<init>", "(Lcom/huami/snore/core/dto/VoiceType;Ljava/lang/String;Ljava/util/Date;JZJLjava/io/RandomAccessFile;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceRecorderWrap {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private VoiceType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String filePath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private Date startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private long duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean isEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private long payloadSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private RandomAccessFile writer;

    public VoiceRecorderWrap() {
        this(null, null, null, 0L, false, 0L, null, 127, null);
    }

    public VoiceRecorderWrap(@NotNull VoiceType voiceType, @NotNull String str, @NotNull Date date, long j, boolean z, long j2, @Nullable RandomAccessFile randomAccessFile) {
        this.type = voiceType;
        this.filePath = str;
        this.startTime = date;
        this.duration = j;
        this.isEnd = z;
        this.payloadSize = j2;
        this.writer = randomAccessFile;
    }

    public final boolean checkValid() {
        return new File(this.filePath).exists() && new File(this.filePath).isFile() && this.duration >= 1000;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VoiceType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsEnd() {
        return this.isEnd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPayloadSize() {
        return this.payloadSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RandomAccessFile getWriter() {
        return this.writer;
    }

    @NotNull
    public final VoiceRecorderWrap copy(@NotNull VoiceType type, @NotNull String filePath, @NotNull Date startTime, long duration, boolean isEnd, long payloadSize, @Nullable RandomAccessFile writer) {
        return new VoiceRecorderWrap(type, filePath, startTime, duration, isEnd, payloadSize, writer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceRecorderWrap)) {
            return false;
        }
        VoiceRecorderWrap voiceRecorderWrap = (VoiceRecorderWrap) other;
        return this.type == voiceRecorderWrap.type && Intrinsics.areEqual(this.filePath, voiceRecorderWrap.filePath) && Intrinsics.areEqual(this.startTime, voiceRecorderWrap.startTime) && this.duration == voiceRecorderWrap.duration && this.isEnd == voiceRecorderWrap.isEnd && this.payloadSize == voiceRecorderWrap.payloadSize && Intrinsics.areEqual(this.writer, voiceRecorderWrap.writer);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getDurationInMills() {
        return System.currentTimeMillis() - this.startTime.getTime();
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getPayloadSize() {
        return this.payloadSize;
    }

    @NotNull
    public final Date getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final VoiceType getType() {
        return this.type;
    }

    @Nullable
    public final RandomAccessFile getWriter() {
        return this.writer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.type.hashCode() * 31) + this.filePath.hashCode()) * 31) + this.startTime.hashCode()) * 31) + b.a(this.duration)) * 31;
        boolean z = this.isEnd;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iA = (((iHashCode + r1) * 31) + b.a(this.payloadSize)) * 31;
        RandomAccessFile randomAccessFile = this.writer;
        return iA + (randomAccessFile == null ? 0 : randomAccessFile.hashCode());
    }

    public final void init() {
        this.type = VoiceType.SNORE;
        this.filePath = "";
        this.startTime = new Date();
        this.duration = 0L;
        this.isEnd = false;
        this.payloadSize = 0L;
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    public final void newWrite() {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(String.valueOf(this.filePath), "rw");
        } catch (FileNotFoundException unused) {
            new File(String.valueOf(this.filePath)).getParentFile().mkdirs();
            randomAccessFile = new RandomAccessFile(String.valueOf(this.filePath), "rw");
        }
        this.writer = randomAccessFile;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnd(boolean z) {
        this.isEnd = z;
    }

    public final void setFilePath(@NotNull String str) {
        this.filePath = str;
    }

    public final void setPayloadSize(long j) {
        this.payloadSize = j;
    }

    public final void setStartTime(@NotNull Date date) {
        this.startTime = date;
    }

    public final void setType(@NotNull VoiceType voiceType) {
        this.type = voiceType;
    }

    public final void setWriter(@Nullable RandomAccessFile randomAccessFile) {
        this.writer = randomAccessFile;
    }

    @NotNull
    public String toString() {
        return "VoiceRecorderWrap(type=" + this.type + ", filePath=" + this.filePath + ", startTime=" + this.startTime + ", duration=" + this.duration + ", isEnd=" + this.isEnd + ", payloadSize=" + this.payloadSize + ", writer=" + this.writer + ")";
    }

    public /* synthetic */ VoiceRecorderWrap(VoiceType voiceType, String str, Date date, long j, boolean z, long j2, RandomAccessFile randomAccessFile, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? VoiceType.SNORE : voiceType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new Date() : date, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? true : z, (i & 32) == 0 ? j2 : 0L, (i & 64) != 0 ? null : randomAccessFile);
    }
}
