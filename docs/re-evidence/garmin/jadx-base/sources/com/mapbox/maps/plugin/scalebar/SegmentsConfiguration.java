package com.mapbox.maps.plugin.scalebar;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import lc.u0;
import o13.u;
import o2.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n0\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J`\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n0\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\"R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010(R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010,R:\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010,¨\u0006/"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/SegmentsConfiguration;", "", "", "unitDistance", "unitBarWidth", "", "rectCount", "", "", "labelTexts", "Lo13/u;", "labelMarginsAndAnchor", "<init>", "(FFILjava/util/List;Ljava/util/List;)V", "component1", "()F", "component2", "component3", "()I", "component4", "()Ljava/util/List;", "component5", "copy", "(FFILjava/util/List;Ljava/util/List;)Lcom/mapbox/maps/plugin/scalebar/SegmentsConfiguration;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getUnitDistance", "setUnitDistance", "(F)V", "getUnitBarWidth", "setUnitBarWidth", "I", "getRectCount", "setRectCount", "(I)V", "Ljava/util/List;", "getLabelTexts", "setLabelTexts", "(Ljava/util/List;)V", "getLabelMarginsAndAnchor", "setLabelMarginsAndAnchor", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SegmentsConfiguration {
    private List<u<Float, Float, Float>> labelMarginsAndAnchor;
    private List<String> labelTexts;
    private int rectCount;
    private float unitBarWidth;
    private float unitDistance;

    public SegmentsConfiguration(float f14, float f15, int i14, List<String> list, List<u<Float, Float, Float>> list2) {
        list.getClass();
        list2.getClass();
        this.unitDistance = f14;
        this.unitBarWidth = f15;
        this.rectCount = i14;
        this.labelTexts = list;
        this.labelMarginsAndAnchor = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentsConfiguration copy$default(SegmentsConfiguration segmentsConfiguration, float f14, float f15, int i14, List list, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f14 = segmentsConfiguration.unitDistance;
        }
        if ((i15 & 2) != 0) {
            f15 = segmentsConfiguration.unitBarWidth;
        }
        if ((i15 & 4) != 0) {
            i14 = segmentsConfiguration.rectCount;
        }
        if ((i15 & 8) != 0) {
            list = segmentsConfiguration.labelTexts;
        }
        if ((i15 & 16) != 0) {
            list2 = segmentsConfiguration.labelMarginsAndAnchor;
        }
        List list3 = list2;
        int i16 = i14;
        return segmentsConfiguration.copy(f14, f15, i16, list, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getUnitDistance() {
        return this.unitDistance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getUnitBarWidth() {
        return this.unitBarWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRectCount() {
        return this.rectCount;
    }

    public final List<String> component4() {
        return this.labelTexts;
    }

    public final List<u<Float, Float, Float>> component5() {
        return this.labelMarginsAndAnchor;
    }

    public final SegmentsConfiguration copy(float unitDistance, float unitBarWidth, int rectCount, List<String> labelTexts, List<u<Float, Float, Float>> labelMarginsAndAnchor) {
        labelTexts.getClass();
        labelMarginsAndAnchor.getClass();
        return new SegmentsConfiguration(unitDistance, unitBarWidth, rectCount, labelTexts, labelMarginsAndAnchor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentsConfiguration)) {
            return false;
        }
        SegmentsConfiguration segmentsConfiguration = (SegmentsConfiguration) other;
        return Float.compare(this.unitDistance, segmentsConfiguration.unitDistance) == 0 && Float.compare(this.unitBarWidth, segmentsConfiguration.unitBarWidth) == 0 && this.rectCount == segmentsConfiguration.rectCount && s.g(this.labelTexts, segmentsConfiguration.labelTexts) && s.g(this.labelMarginsAndAnchor, segmentsConfiguration.labelMarginsAndAnchor);
    }

    public final List<u<Float, Float, Float>> getLabelMarginsAndAnchor() {
        return this.labelMarginsAndAnchor;
    }

    public final List<String> getLabelTexts() {
        return this.labelTexts;
    }

    public final int getRectCount() {
        return this.rectCount;
    }

    public final float getUnitBarWidth() {
        return this.unitBarWidth;
    }

    public final float getUnitDistance() {
        return this.unitDistance;
    }

    public int hashCode() {
        return this.labelMarginsAndAnchor.hashCode() + u0.b(q2.d(this.rectCount, f.d(this.unitBarWidth, Float.hashCode(this.unitDistance) * 31, 31), 31), 31, this.labelTexts);
    }

    public final void setLabelMarginsAndAnchor(List<u<Float, Float, Float>> list) {
        list.getClass();
        this.labelMarginsAndAnchor = list;
    }

    public final void setLabelTexts(List<String> list) {
        list.getClass();
        this.labelTexts = list;
    }

    public final void setRectCount(int i14) {
        this.rectCount = i14;
    }

    public final void setUnitBarWidth(float f14) {
        this.unitBarWidth = f14;
    }

    public final void setUnitDistance(float f14) {
        this.unitDistance = f14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SegmentsConfiguration(unitDistance=");
        sb3.append(this.unitDistance);
        sb3.append(", unitBarWidth=");
        sb3.append(this.unitBarWidth);
        sb3.append(", rectCount=");
        sb3.append(this.rectCount);
        sb3.append(", labelTexts=");
        sb3.append(this.labelTexts);
        sb3.append(", labelMarginsAndAnchor=");
        return c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.labelMarginsAndAnchor, sb3);
    }
}
