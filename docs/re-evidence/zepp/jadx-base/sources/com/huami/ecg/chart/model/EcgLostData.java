package com.huami.ecg.chart.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/huami/ecg/chart/model/EcgLostData;", "", "", "component1", "component2", "component3", "start", "lostLen", "type", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStart", "()I", "setStart", "(I)V", "b", "getLostLen", "setLostLen", "c", "getType", "setType", "<init>", "(III)V", "Companion", "ecg-chart_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class EcgLostData {
    public static final int BT_LOST = 1;
    public static final int ET_LOST = 0;
    public static final int FW_LOST = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int lostLen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int type;

    public EcgLostData(int i, int i2, int i3) {
        this.start = i;
        this.lostLen = i2;
        this.type = i3;
    }

    public static /* synthetic */ EcgLostData copy$default(EcgLostData ecgLostData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ecgLostData.start;
        }
        if ((i4 & 2) != 0) {
            i2 = ecgLostData.lostLen;
        }
        if ((i4 & 4) != 0) {
            i3 = ecgLostData.type;
        }
        return ecgLostData.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLostLen() {
        return this.lostLen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final EcgLostData copy(int start, int lostLen, int type) {
        return new EcgLostData(start, lostLen, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgLostData)) {
            return false;
        }
        EcgLostData ecgLostData = (EcgLostData) other;
        return this.start == ecgLostData.start && this.lostLen == ecgLostData.lostLen && this.type == ecgLostData.type;
    }

    public final int getLostLen() {
        return this.lostLen;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.start * 31) + this.lostLen) * 31) + this.type;
    }

    public final void setLostLen(int i) {
        this.lostLen = i;
    }

    public final void setStart(int i) {
        this.start = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "EcgLostData(start=" + this.start + ", lostLen=" + this.lostLen + ", type=" + this.type + ")";
    }
}
