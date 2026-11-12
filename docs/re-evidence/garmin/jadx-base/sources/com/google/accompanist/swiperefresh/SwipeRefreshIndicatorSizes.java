package com.google.accompanist.swiperefresh;

import ch.qos.logback.core.CoreConstants;
import g6.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import tn.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lcom/google/accompanist/swiperefresh/SwipeRefreshIndicatorSizes;", "", "Lg6/f;", "size", "arcRadius", "strokeWidth", "arrowWidth", "arrowHeight", "<init>", "(FFFFFLkotlin/jvm/internal/j;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "copy-RyVG9vg", "(FFFFF)Lcom/google/accompanist/swiperefresh/SwipeRefreshIndicatorSizes;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getSize-D9Ej5fM", "getArcRadius-D9Ej5fM", "getStrokeWidth-D9Ej5fM", "getArrowWidth-D9Ej5fM", "getArrowHeight-D9Ej5fM", "swiperefresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final /* data */ class SwipeRefreshIndicatorSizes {
    private final float arcRadius;
    private final float arrowHeight;
    private final float arrowWidth;
    private final float size;
    private final float strokeWidth;

    private SwipeRefreshIndicatorSizes(float f14, float f15, float f16, float f17, float f18) {
        this.size = f14;
        this.arcRadius = f15;
        this.strokeWidth = f16;
        this.arrowWidth = f17;
        this.arrowHeight = f18;
    }

    /* JADX INFO: renamed from: copy-RyVG9vg$default, reason: not valid java name */
    public static /* synthetic */ SwipeRefreshIndicatorSizes m77copyRyVG9vg$default(SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes, float f14, float f15, float f16, float f17, float f18, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            f14 = swipeRefreshIndicatorSizes.size;
        }
        if ((i14 & 2) != 0) {
            f15 = swipeRefreshIndicatorSizes.arcRadius;
        }
        if ((i14 & 4) != 0) {
            f16 = swipeRefreshIndicatorSizes.strokeWidth;
        }
        if ((i14 & 8) != 0) {
            f17 = swipeRefreshIndicatorSizes.arrowWidth;
        }
        if ((i14 & 16) != 0) {
            f18 = swipeRefreshIndicatorSizes.arrowHeight;
        }
        float f19 = f18;
        float f22 = f16;
        return swipeRefreshIndicatorSizes.m83copyRyVG9vg(f14, f15, f22, f17, f19);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArcRadius() {
        return this.arcRadius;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrowWidth() {
        return this.arrowWidth;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrowHeight() {
        return this.arrowHeight;
    }

    /* JADX INFO: renamed from: copy-RyVG9vg, reason: not valid java name */
    public final SwipeRefreshIndicatorSizes m83copyRyVG9vg(float size, float arcRadius, float strokeWidth, float arrowWidth, float arrowHeight) {
        return new SwipeRefreshIndicatorSizes(size, arcRadius, strokeWidth, arrowWidth, arrowHeight, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeRefreshIndicatorSizes)) {
            return false;
        }
        SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes = (SwipeRefreshIndicatorSizes) other;
        return f.c(this.size, swipeRefreshIndicatorSizes.size) && f.c(this.arcRadius, swipeRefreshIndicatorSizes.arcRadius) && f.c(this.strokeWidth, swipeRefreshIndicatorSizes.strokeWidth) && f.c(this.arrowWidth, swipeRefreshIndicatorSizes.arrowWidth) && f.c(this.arrowHeight, swipeRefreshIndicatorSizes.arrowHeight);
    }

    /* JADX INFO: renamed from: getArcRadius-D9Ej5fM, reason: not valid java name */
    public final float m84getArcRadiusD9Ej5fM() {
        return this.arcRadius;
    }

    /* JADX INFO: renamed from: getArrowHeight-D9Ej5fM, reason: not valid java name */
    public final float m85getArrowHeightD9Ej5fM() {
        return this.arrowHeight;
    }

    /* JADX INFO: renamed from: getArrowWidth-D9Ej5fM, reason: not valid java name */
    public final float m86getArrowWidthD9Ej5fM() {
        return this.arrowWidth;
    }

    /* JADX INFO: renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m87getSizeD9Ej5fM() {
        return this.size;
    }

    /* JADX INFO: renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m88getStrokeWidthD9Ej5fM() {
        return this.strokeWidth;
    }

    public int hashCode() {
        float f14 = this.size;
        f.a aVar = f.f75994b;
        return Float.hashCode(this.arrowHeight) + q6.f.d(this.arrowWidth, q6.f.d(this.strokeWidth, q6.f.d(this.arcRadius, Float.hashCode(f14) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SwipeRefreshIndicatorSizes(size=");
        k.l(this.size, ", arcRadius=", sb3);
        k.l(this.arcRadius, ", strokeWidth=", sb3);
        k.l(this.strokeWidth, ", arrowWidth=", sb3);
        k.l(this.arrowWidth, ", arrowHeight=", sb3);
        sb3.append((Object) f.d(this.arrowHeight));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ SwipeRefreshIndicatorSizes(float f14, float f15, float f16, float f17, float f18, j jVar) {
        this(f14, f15, f16, f17, f18);
    }
}
