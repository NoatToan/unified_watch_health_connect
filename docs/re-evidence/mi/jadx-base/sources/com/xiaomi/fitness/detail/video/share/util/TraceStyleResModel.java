package com.xiaomi.fitness.detail.video.share.util;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0005R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\u0005R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0005R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0005R\u0018\u0010\u0014\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "", "typeId", "", "<init>", "(I)V", "getTypeId", "()I", "startIcon", "getStartIcon", "setStartIcon", "endIcon", "getEndIcon", "setEndIcon", "traceBgColor", "getTraceBgColor", "setTraceBgColor", "traceColor", "getTraceColor", "setTraceColor", "shouldBeCentered", "", "getShouldBeCentered", "()Z", "setShouldBeCentered", "(Z)V", "isDefault", "setDefault", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TraceStyleResModel {
    private boolean isDefault;
    private final int typeId;

    public TraceStyleResModel(int i) {
        this.typeId = i;
    }

    public abstract int getEndIcon();

    public abstract boolean getShouldBeCentered();

    public abstract int getStartIcon();

    public abstract int getTraceBgColor();

    public abstract int getTraceColor();

    public final int getTypeId() {
        return this.typeId;
    }

    /* JADX INFO: renamed from: isDefault, reason: from getter */
    public boolean getIsDefault() {
        return this.isDefault;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public abstract void setEndIcon(int i);

    public abstract void setShouldBeCentered(boolean z);

    public abstract void setStartIcon(int i);

    public abstract void setTraceBgColor(int i);

    public abstract void setTraceColor(int i);
}
