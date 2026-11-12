package com.huami.mifit.sportlib.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\"\u0010%\u001a\u00020\u00028F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/huami/mifit/sportlib/model/PauseModel;", "", "", "component1", "", "component2", "component3", "component4", "component5", "pauseStartTime", "pauseDuration", "startIndex", "endIndex", "type", "copy", "", "toString", "hashCode", "other", "", "equals", "J", "getPauseStartTime", "()J", "setPauseStartTime", "(J)V", LogUtil.I, "getPauseDuration", "()I", "setPauseDuration", "(I)V", "getStartIndex", "setStartIndex", "getEndIndex", "setEndIndex", "getType", "setType", "pauseEndTime", "getPauseEndTime", "setPauseEndTime", "<init>", "(JIIII)V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PauseModel {
    private int endIndex;
    private int pauseDuration;
    private long pauseEndTime;
    private long pauseStartTime;
    private int startIndex;
    private int type;

    public PauseModel(long j, int i, int i2, int i3, int i4) {
        this.pauseStartTime = j;
        this.pauseDuration = i;
        this.startIndex = i2;
        this.endIndex = i3;
        this.type = i4;
    }

    public static /* synthetic */ PauseModel copy$default(PauseModel pauseModel, long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = pauseModel.pauseStartTime;
        }
        long j2 = j;
        if ((i5 & 2) != 0) {
            i = pauseModel.pauseDuration;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = pauseModel.startIndex;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = pauseModel.endIndex;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = pauseModel.type;
        }
        return pauseModel.copy(j2, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPauseStartTime() {
        return this.pauseStartTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPauseDuration() {
        return this.pauseDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final PauseModel copy(long pauseStartTime, int pauseDuration, int startIndex, int endIndex, int type) {
        return new PauseModel(pauseStartTime, pauseDuration, startIndex, endIndex, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PauseModel)) {
            return false;
        }
        PauseModel pauseModel = (PauseModel) other;
        return this.pauseStartTime == pauseModel.pauseStartTime && this.pauseDuration == pauseModel.pauseDuration && this.startIndex == pauseModel.startIndex && this.endIndex == pauseModel.endIndex && this.type == pauseModel.type;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getPauseDuration() {
        return this.pauseDuration;
    }

    public final long getPauseEndTime() {
        return this.pauseStartTime + ((long) this.pauseDuration);
    }

    public final long getPauseStartTime() {
        return this.pauseStartTime;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((b.a(this.pauseStartTime) * 31) + this.pauseDuration) * 31) + this.startIndex) * 31) + this.endIndex) * 31) + this.type;
    }

    public final void setEndIndex(int i) {
        this.endIndex = i;
    }

    public final void setPauseDuration(int i) {
        this.pauseDuration = i;
    }

    public final void setPauseEndTime(long j) {
        this.pauseEndTime = j;
    }

    public final void setPauseStartTime(long j) {
        this.pauseStartTime = j;
    }

    public final void setStartIndex(int i) {
        this.startIndex = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "PauseModel(pauseStartTime=" + this.pauseStartTime + ", pauseDuration=" + this.pauseDuration + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", type=" + this.type + ")";
    }
}
