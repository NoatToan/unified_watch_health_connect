package com.huami.devicerecorder.model;

import android.content.res.AssetFileDescriptor;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bF\u0010GJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003Je\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001R\u0019\u0010\u0013\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0014\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010!\"\u0004\b>\u0010?R$\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/huami/devicerecorder/model/RecordFile;", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "Landroid/content/res/AssetFileDescriptor;", "component9", "id", "recordTime", "duration", "localPath", "serverPath", "valid", "hasSynced", "fileSize", "fileDescriptor", "copy", "toString", "a", "J", "getId", "()J", "b", "getRecordTime", "c", LogUtil.I, "getDuration", "()I", "setDuration", "(I)V", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getLocalPath", "()Ljava/lang/String;", "setLocalPath", "(Ljava/lang/String;)V", "e", "getServerPath", "setServerPath", "f", "Z", "getValid", "()Z", "setValid", "(Z)V", "g", "getHasSynced", "setHasSynced", "h", "getFileSize", "setFileSize", "(J)V", "i", "Landroid/content/res/AssetFileDescriptor;", "getFileDescriptor", "()Landroid/content/res/AssetFileDescriptor;", "setFileDescriptor", "(Landroid/content/res/AssetFileDescriptor;)V", "<init>", "(JJILjava/lang/String;Ljava/lang/String;ZZJLandroid/content/res/AssetFileDescriptor;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RecordFile {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long recordTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private String localPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private String serverPath;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private boolean valid;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private boolean hasSynced;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private long fileSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private AssetFileDescriptor fileDescriptor;

    public RecordFile(long j, long j2, int i, @NotNull String str, @NotNull String str2, boolean z, boolean z2, long j3, @Nullable AssetFileDescriptor assetFileDescriptor) {
        this.id = j;
        this.recordTime = j2;
        this.duration = i;
        this.localPath = str;
        this.serverPath = str2;
        this.valid = z;
        this.hasSynced = z2;
        this.fileSize = j3;
        this.fileDescriptor = assetFileDescriptor;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRecordTime() {
        return this.recordTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getServerPath() {
        return this.serverPath;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHasSynced() {
        return this.hasSynced;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AssetFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @NotNull
    public final RecordFile copy(long id, long recordTime, int duration, @NotNull String localPath, @NotNull String serverPath, boolean valid, boolean hasSynced, long fileSize, @Nullable AssetFileDescriptor fileDescriptor) {
        return new RecordFile(id, recordTime, duration, localPath, serverPath, valid, hasSynced, fileSize, fileDescriptor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RecordFile.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.devicerecorder.model.RecordFile");
        RecordFile recordFile = (RecordFile) other;
        return this.id == recordFile.id && this.recordTime == recordFile.recordTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final AssetFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final boolean getHasSynced() {
        return this.hasSynced;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getLocalPath() {
        return this.localPath;
    }

    public final long getRecordTime() {
        return this.recordTime;
    }

    @NotNull
    public final String getServerPath() {
        return this.serverPath;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        return (b.a(this.id) * 31) + b.a(this.recordTime);
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setFileDescriptor(@Nullable AssetFileDescriptor assetFileDescriptor) {
        this.fileDescriptor = assetFileDescriptor;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setHasSynced(boolean z) {
        this.hasSynced = z;
    }

    public final void setLocalPath(@NotNull String str) {
        this.localPath = str;
    }

    public final void setServerPath(@NotNull String str) {
        this.serverPath = str;
    }

    public final void setValid(boolean z) {
        this.valid = z;
    }

    @NotNull
    public String toString() {
        return "RecordFile(id=" + this.id + ", recordTime=" + this.recordTime + ", duration=" + this.duration + ", localPath=" + this.localPath + ", serverPath=" + this.serverPath + ", valid=" + this.valid + ", hasSynced=" + this.hasSynced + ", fileSize=" + this.fileSize + ", fileDescriptor=" + this.fileDescriptor + ")";
    }

    public /* synthetic */ RecordFile(long j, long j2, int i, String str, String str2, boolean z, boolean z2, long j3, AssetFileDescriptor assetFileDescriptor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, str, str2, z, z2, j3, (i2 & 256) != 0 ? null : assetFileDescriptor);
    }
}
