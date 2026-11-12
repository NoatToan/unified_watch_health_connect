package com.xmlywind.sdk.videoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class VideoPlayerTextureView extends TextureView {
    public int a;
    public int b;

    public VideoPlayerTextureView(Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        this.a = 0;
        this.b = 0;
    }

    public VideoPlayerTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        this.a = 0;
        this.b = 0;
    }

    public void a(int i, int i2) {
        if (this.a == i && this.b == i2) {
            return;
        }
        this.a = i;
        this.b = i2;
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2 A[PHI: r2 r14
      0x00f2: PHI (r2v11 int) = (r2v8 int), (r2v8 int), (r2v14 int), (r2v14 int) binds: [B:47:0x00fe, B:48:0x0100, B:39:0x00e9, B:40:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r14v5 int) = (r14v4 int), (r14v4 int), (r14v2 int), (r14v2 int) binds: [B:47:0x00fe, B:48:0x0100, B:39:0x00e9, B:40:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size;
        int size2;
        int i5;
        int i6;
        Log.i("ResizeTextureView", "onMeasure  [" + hashCode() + "] ");
        int rotation = (int) getRotation();
        int i7 = this.a;
        int i8 = this.b;
        int measuredHeight = ((View) getParent()).getMeasuredHeight();
        int measuredWidth = ((View) getParent()).getMeasuredWidth();
        if (measuredWidth != 0 && measuredHeight != 0 && i7 != 0 && i8 != 0 && VideoAdView.f == 1) {
            if (rotation == 90 || rotation == 270) {
                measuredWidth = measuredHeight;
                measuredHeight = measuredWidth;
            }
            i8 = (i7 * measuredHeight) / measuredWidth;
        }
        if (rotation == 90 || rotation == 270) {
            i3 = i;
            i4 = i2;
        } else {
            i4 = i;
            i3 = i2;
        }
        int defaultSize = TextureView.getDefaultSize(i7, i4);
        int defaultSize2 = TextureView.getDefaultSize(i8, i3);
        if (i7 <= 0 || i8 <= 0) {
            size = defaultSize2;
            size2 = defaultSize;
        } else {
            int mode = View.MeasureSpec.getMode(i4);
            size2 = View.MeasureSpec.getSize(i4);
            int mode2 = View.MeasureSpec.getMode(i3);
            size = View.MeasureSpec.getSize(i3);
            Log.i("ResizeTextureView", "widthMeasureSpec  [" + View.MeasureSpec.toString(i4) + "]");
            Log.i("ResizeTextureView", "heightMeasureSpec [" + View.MeasureSpec.toString(i3) + "]");
            if (mode == 1073741824 && mode2 == 1073741824) {
                i6 = i7 * size;
                int i9 = size2 * i8;
                if (i6 < i9) {
                    size2 = i6 / i8;
                } else if (i6 > i9) {
                    size = i9 / i7;
                } else {
                    defaultSize = size2;
                    defaultSize2 = size;
                    size = defaultSize2;
                    size2 = defaultSize;
                }
            } else if (mode == 1073741824) {
                int i10 = (size2 * i8) / i7;
                if (mode2 != Integer.MIN_VALUE || i10 <= size) {
                    size = i10;
                } else {
                    i6 = size * i7;
                    size2 = i6 / i8;
                }
            } else if (mode2 == 1073741824) {
                i5 = (size * i7) / i8;
                if (mode != Integer.MIN_VALUE || i5 <= size2) {
                    size2 = i5;
                } else {
                    size = (size2 * i8) / i7;
                }
            } else {
                if (mode2 != Integer.MIN_VALUE || i8 <= size) {
                    i5 = i7;
                    size = i8;
                } else {
                    i5 = (size * i7) / i8;
                }
                if (mode != Integer.MIN_VALUE || i5 <= size2) {
                    size2 = i5;
                } else {
                    size = (size2 * i8) / i7;
                }
            }
        }
        if (measuredWidth == 0 || measuredHeight == 0 || i7 == 0 || i8 == 0) {
            i7 = size2;
            i8 = size;
        } else {
            int i11 = VideoAdView.f;
            if (i11 != 3) {
                if (i11 != 2) {
                    i7 = size2;
                    i8 = size;
                } else {
                    if (rotation == 90 || rotation == 270) {
                        int i12 = measuredWidth;
                        measuredWidth = measuredHeight;
                        measuredHeight = i12;
                    }
                    double d = ((double) i8) / ((double) i7);
                    double d2 = measuredHeight;
                    double d3 = measuredWidth;
                    double d4 = d2 / d3;
                    if (d > d4) {
                        i8 = (int) (((double) size) * (d3 / ((double) size2)));
                        i7 = measuredWidth;
                    } else if (d < d4) {
                        i7 = (int) (((double) size2) * (d2 / ((double) size)));
                        i8 = measuredHeight;
                    } else {
                        i7 = size2;
                        i8 = size;
                    }
                }
            }
        }
        setMeasuredDimension(i7, i8);
    }

    @Override // android.view.View
    public void setRotation(float f) {
        if (f != getRotation()) {
            super.setRotation(f);
            requestLayout();
        }
    }
}
