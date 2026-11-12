package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes3.dex */
final class c {
    public final String a;
    public final float b;
    public final float c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final int h;
    public final float i;
    public final int j;

    public c(String id) {
        this(id, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE);
    }

    public c(String id, float position, float line, int lineType, int lineAnchor, float width, float height, int textSizeType, float textSize, int verticalType) {
        this.a = id;
        this.b = position;
        this.c = line;
        this.d = lineType;
        this.e = lineAnchor;
        this.f = width;
        this.g = height;
        this.h = textSizeType;
        this.i = textSize;
        this.j = verticalType;
    }
}
