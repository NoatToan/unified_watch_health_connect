package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes14.dex */
final class TtmlRegion {
    public final float height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f53093id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE);
    }

    public TtmlRegion(String str, float f14, float f15, int i14, int i15, float f16, float f17, int i16, float f18, int i17) {
        this.f53093id = str;
        this.position = f14;
        this.line = f15;
        this.lineType = i14;
        this.lineAnchor = i15;
        this.width = f16;
        this.height = f17;
        this.textSizeType = i16;
        this.textSize = f18;
        this.verticalType = i17;
    }
}
