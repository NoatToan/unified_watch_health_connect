package com.mapbox.maps.extension.observable.eventdata;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.RenderMode;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@e
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/RenderFrameFinishedEventData;", "", "begin", "", TtmlNode.END, "renderMode", "Lcom/mapbox/maps/extension/observable/model/RenderMode;", "needsRepaint", "", "placementChanged", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/RenderMode;ZZ)V", "getBegin", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNeedsRepaint", "()Z", "getPlacementChanged", "getRenderMode", "()Lcom/mapbox/maps/extension/observable/model/RenderMode;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/RenderMode;ZZ)Lcom/mapbox/maps/extension/observable/eventdata/RenderFrameFinishedEventData;", "equals", "other", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RenderFrameFinishedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName(TtmlNode.END)
    private final Long end;

    @SerializedName("needs-repaint")
    private final boolean needsRepaint;

    @SerializedName("placement-changed")
    private final boolean placementChanged;

    @SerializedName("render-mode")
    private final RenderMode renderMode;

    public RenderFrameFinishedEventData(long j8, Long l14, RenderMode renderMode, boolean z14, boolean z15) {
        renderMode.getClass();
        this.begin = j8;
        this.end = l14;
        this.renderMode = renderMode;
        this.needsRepaint = z14;
        this.placementChanged = z15;
    }

    public static /* synthetic */ RenderFrameFinishedEventData copy$default(RenderFrameFinishedEventData renderFrameFinishedEventData, long j8, Long l14, RenderMode renderMode, boolean z14, boolean z15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = renderFrameFinishedEventData.begin;
        }
        long j14 = j8;
        if ((i14 & 2) != 0) {
            l14 = renderFrameFinishedEventData.end;
        }
        Long l15 = l14;
        if ((i14 & 4) != 0) {
            renderMode = renderFrameFinishedEventData.renderMode;
        }
        RenderMode renderMode2 = renderMode;
        if ((i14 & 8) != 0) {
            z14 = renderFrameFinishedEventData.needsRepaint;
        }
        boolean z16 = z14;
        if ((i14 & 16) != 0) {
            z15 = renderFrameFinishedEventData.placementChanged;
        }
        return renderFrameFinishedEventData.copy(j14, l15, renderMode2, z16, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBegin() {
        return this.begin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RenderMode getRenderMode() {
        return this.renderMode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNeedsRepaint() {
        return this.needsRepaint;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPlacementChanged() {
        return this.placementChanged;
    }

    public final RenderFrameFinishedEventData copy(long begin, Long end, RenderMode renderMode, boolean needsRepaint, boolean placementChanged) {
        renderMode.getClass();
        return new RenderFrameFinishedEventData(begin, end, renderMode, needsRepaint, placementChanged);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderFrameFinishedEventData)) {
            return false;
        }
        RenderFrameFinishedEventData renderFrameFinishedEventData = (RenderFrameFinishedEventData) other;
        return this.begin == renderFrameFinishedEventData.begin && s.g(this.end, renderFrameFinishedEventData.end) && this.renderMode == renderFrameFinishedEventData.renderMode && this.needsRepaint == renderFrameFinishedEventData.needsRepaint && this.placementChanged == renderFrameFinishedEventData.placementChanged;
    }

    public final long getBegin() {
        return this.begin;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final boolean getNeedsRepaint() {
        return this.needsRepaint;
    }

    public final boolean getPlacementChanged() {
        return this.placementChanged;
    }

    public final RenderMode getRenderMode() {
        return this.renderMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l14 = this.end;
        int iHashCode2 = (this.renderMode.hashCode() + ((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31;
        boolean z14 = this.needsRepaint;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iHashCode2 + r14) * 31;
        boolean z15 = this.placementChanged;
        return i14 + (z15 ? 1 : z15);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("RenderFrameFinishedEventData(begin=");
        sb3.append(this.begin);
        sb3.append(", end=");
        sb3.append(this.end);
        sb3.append(", renderMode=");
        sb3.append(this.renderMode);
        sb3.append(", needsRepaint=");
        sb3.append(this.needsRepaint);
        sb3.append(", placementChanged=");
        return j.t(sb3, this.placementChanged, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
