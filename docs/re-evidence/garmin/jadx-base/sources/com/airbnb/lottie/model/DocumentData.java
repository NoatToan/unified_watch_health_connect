package com.airbnb.lottie.model;

import android.graphics.PointF;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
public class DocumentData {
    public float baselineShift;
    public PointF boxPosition;
    public PointF boxSize;
    public int color;
    public String fontName;
    public Justification justification;
    public float lineHeight;
    public float size;
    public int strokeColor;
    public boolean strokeOverFill;
    public float strokeWidth;
    public String text;
    public int tracking;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f14, Justification justification, int i14, float f15, float f16, int i15, int i16, float f17, boolean z14, PointF pointF, PointF pointF2) {
        set(str, str2, f14, justification, i14, f15, f16, i15, i16, f17, z14, pointF, pointF2);
    }

    public int hashCode() {
        int iOrdinal = ((this.justification.ordinal() + (((int) (g.j(this.text.hashCode() * 31, 31, this.fontName) + this.size)) * 31)) * 31) + this.tracking;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.lineHeight);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.color;
    }

    public void set(String str, String str2, float f14, Justification justification, int i14, float f15, float f16, int i15, int i16, float f17, boolean z14, PointF pointF, PointF pointF2) {
        this.text = str;
        this.fontName = str2;
        this.size = f14;
        this.justification = justification;
        this.tracking = i14;
        this.lineHeight = f15;
        this.baselineShift = f16;
        this.color = i15;
        this.strokeColor = i16;
        this.strokeWidth = f17;
        this.strokeOverFill = z14;
        this.boxPosition = pointF;
        this.boxSize = pointF2;
    }

    public DocumentData() {
    }
}
