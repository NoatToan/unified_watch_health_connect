package com.mapbox.maps.renderer;

import am.j;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/renderer/RenderEvent;", "", "runnable", "Ljava/lang/Runnable;", "needRender", "", "(Ljava/lang/Runnable;Z)V", "getNeedRender", "()Z", "getRunnable", "()Ljava/lang/Runnable;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RenderEvent {
    private final boolean needRender;
    private final Runnable runnable;

    public RenderEvent(Runnable runnable, boolean z14) {
        this.runnable = runnable;
        this.needRender = z14;
    }

    public static /* synthetic */ RenderEvent copy$default(RenderEvent renderEvent, Runnable runnable, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            runnable = renderEvent.runnable;
        }
        if ((i14 & 2) != 0) {
            z14 = renderEvent.needRender;
        }
        return renderEvent.copy(runnable, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Runnable getRunnable() {
        return this.runnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNeedRender() {
        return this.needRender;
    }

    public final RenderEvent copy(Runnable runnable, boolean needRender) {
        return new RenderEvent(runnable, needRender);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderEvent)) {
            return false;
        }
        RenderEvent renderEvent = (RenderEvent) other;
        return s.g(this.runnable, renderEvent.runnable) && this.needRender == renderEvent.needRender;
    }

    public final boolean getNeedRender() {
        return this.needRender;
    }

    public final Runnable getRunnable() {
        return this.runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        Runnable runnable = this.runnable;
        int iHashCode = (runnable == null ? 0 : runnable.hashCode()) * 31;
        boolean z14 = this.needRender;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return iHashCode + r14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("RenderEvent(runnable=");
        sb3.append(this.runnable);
        sb3.append(", needRender=");
        return j.t(sb3, this.needRender, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
