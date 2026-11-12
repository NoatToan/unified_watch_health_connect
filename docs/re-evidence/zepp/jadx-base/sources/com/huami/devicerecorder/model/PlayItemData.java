package com.huami.devicerecorder.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000b\u0010!\"\u0004\b\"\u0010#R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006)"}, d2 = {"Lcom/huami/devicerecorder/model/PlayItemData;", "", "Lcom/huami/devicerecorder/model/RecordFile;", "component1", "", "component2", "", "component3", "component4", "recordFile", "position", "isPlaying", "selected", "copy", "", "toString", "hashCode", "other", "equals", "a", "Lcom/huami/devicerecorder/model/RecordFile;", "getRecordFile", "()Lcom/huami/devicerecorder/model/RecordFile;", "setRecordFile", "(Lcom/huami/devicerecorder/model/RecordFile;)V", "b", LogUtil.I, "getPosition", "()I", "setPosition", "(I)V", "c", "Z", "()Z", "setPlaying", "(Z)V", GoogleApiAvailabilityLight.a, "getSelected", "setSelected", "<init>", "(Lcom/huami/devicerecorder/model/RecordFile;IZZ)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlayItemData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private RecordFile recordFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int position;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean isPlaying;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean selected;

    public PlayItemData(@NotNull RecordFile recordFile, int i, boolean z, boolean z2) {
        this.recordFile = recordFile;
        this.position = i;
        this.isPlaying = z;
        this.selected = z2;
    }

    public static /* synthetic */ PlayItemData copy$default(PlayItemData playItemData, RecordFile recordFile, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            recordFile = playItemData.recordFile;
        }
        if ((i2 & 2) != 0) {
            i = playItemData.position;
        }
        if ((i2 & 4) != 0) {
            z = playItemData.isPlaying;
        }
        if ((i2 & 8) != 0) {
            z2 = playItemData.selected;
        }
        return playItemData.copy(recordFile, i, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecordFile getRecordFile() {
        return this.recordFile;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final PlayItemData copy(@NotNull RecordFile recordFile, int position, boolean isPlaying, boolean selected) {
        return new PlayItemData(recordFile, position, isPlaying, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayItemData)) {
            return false;
        }
        PlayItemData playItemData = (PlayItemData) other;
        return Intrinsics.areEqual(this.recordFile, playItemData.recordFile) && this.position == playItemData.position && this.isPlaying == playItemData.isPlaying && this.selected == playItemData.selected;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final RecordFile getRecordFile() {
        return this.recordFile;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.recordFile.hashCode() * 31) + this.position) * 31;
        boolean z = this.isPlaying;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.selected;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRecordFile(@NotNull RecordFile recordFile) {
        this.recordFile = recordFile;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "PlayItemData(recordFile=" + this.recordFile + ", position=" + this.position + ", isPlaying=" + this.isPlaying + ", selected=" + this.selected + ")";
    }
}
