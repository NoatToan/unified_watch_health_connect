package com.github.mikephil.chartingv2.highlight;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class Highlight {
    private int mDataSetIndex;
    private Range mRange;
    private int mStackIndex;
    private int mXIndex;

    public Highlight(int i14, int i15) {
        this.mStackIndex = -1;
        this.mXIndex = i14;
        this.mDataSetIndex = i15;
    }

    public boolean equalTo(Highlight highlight) {
        return highlight != null && this.mDataSetIndex == highlight.mDataSetIndex && this.mXIndex == highlight.mXIndex && this.mStackIndex == highlight.mStackIndex;
    }

    public int getDataSetIndex() {
        return this.mDataSetIndex;
    }

    public Range getRange() {
        return this.mRange;
    }

    public int getStackIndex() {
        return this.mStackIndex;
    }

    public int getXIndex() {
        return this.mXIndex;
    }

    public String toString() {
        return "Highlight, xIndex: " + this.mXIndex + ", dataSetIndex: " + this.mDataSetIndex + ", stackIndex (only stacked barentry): " + this.mStackIndex;
    }

    public Highlight(int i14, int i15, int i16) {
        this(i14, i15);
        this.mStackIndex = i16;
    }

    public Highlight(int i14, int i15, int i16, Range range) {
        this(i14, i15, i16);
        this.mRange = range;
    }
}
