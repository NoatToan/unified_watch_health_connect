package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import defpackage.iej;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class TextView extends GroupView {
    double cachedAdvance;
    private TextProperties.AlignmentBaseline mAlignmentBaseline;
    private String mBaselineShift;
    private ArrayList<SVGLength> mDeltaX;
    private ArrayList<SVGLength> mDeltaY;
    TextProperties.TextLengthAdjust mLengthAdjust;
    private ArrayList<SVGLength> mPositionX;
    private ArrayList<SVGLength> mPositionY;
    private ArrayList<SVGLength> mRotate;
    SVGLength mTextLength;

    public TextView(ReactContext reactContext) {
        super(reactContext);
        this.mTextLength = null;
        this.mBaselineShift = null;
        this.mLengthAdjust = TextProperties.TextLengthAdjust.spacing;
        this.cachedAdvance = Double.NaN;
    }

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.cachedAdvance = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        if (f > 0.01f) {
            setupGlyphContext(canvas);
            clip(canvas, paint);
            getGroupPath(canvas, paint);
            drawGroup(canvas, paint, f);
        }
    }

    public TextProperties.AlignmentBaseline getAlignmentBaseline() {
        TextProperties.AlignmentBaseline alignmentBaseline;
        if (this.mAlignmentBaseline == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof TextView) && (alignmentBaseline = ((TextView) parent).mAlignmentBaseline) != null) {
                    this.mAlignmentBaseline = alignmentBaseline;
                    return alignmentBaseline;
                }
            }
        }
        if (this.mAlignmentBaseline == null) {
            this.mAlignmentBaseline = TextProperties.AlignmentBaseline.baseline;
        }
        return this.mAlignmentBaseline;
    }

    public String getBaselineShift() {
        String str;
        if (this.mBaselineShift == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof TextView) && (str = ((TextView) parent).mBaselineShift) != null) {
                    this.mBaselineShift = str;
                    return str;
                }
            }
        }
        return this.mBaselineShift;
    }

    public Path getGroupPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        pushGlyphContext();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        popGlyphContext();
        return ((VirtualView) this).mPath;
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        setupGlyphContext(canvas);
        return getGroupPath(canvas, paint);
    }

    public double getSubtreeTextChunksTotalAdvance(Paint paint) {
        if (!Double.isNaN(this.cachedAdvance)) {
            return this.cachedAdvance;
        }
        double subtreeTextChunksTotalAdvance = 0.0d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextView) {
                subtreeTextChunksTotalAdvance += ((TextView) childAt).getSubtreeTextChunksTotalAdvance(paint);
            }
        }
        this.cachedAdvance = subtreeTextChunksTotalAdvance;
        return subtreeTextChunksTotalAdvance;
    }

    public TextView getTextAnchorRoot() {
        ArrayList<FontData> arrayList = getTextRootGlyphContext().mFontContext;
        ViewParent parent = getParent();
        TextView textView = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof TextView) && arrayList.get(size).textAnchor != TextProperties.TextAnchor.start && textView.mPositionX == null; size--) {
            textView = (TextView) parent;
            parent = textView.getParent();
        }
        return textView;
    }

    public TextView getTextContainer() {
        ViewParent parent = getParent();
        TextView textView = this;
        while (parent instanceof TextView) {
            textView = (TextView) parent;
            parent = textView.getParent();
        }
        return textView;
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath == null) {
            return;
        }
        super.invalidate();
        getTextContainer().clearChildCache();
    }

    @Override // com.horcrux.svg.GroupView
    public void pushGlyphContext() {
        getTextRootGlyphContext().pushContext(((this instanceof TextPathView) || (this instanceof TSpanView)) ? false : true, this, this.mFont, this.mPositionX, this.mPositionY, this.mDeltaX, this.mDeltaY, this.mRotate);
    }

    @iej(name = "baselineShift")
    public void setBaselineShift(Dynamic dynamic) {
        this.mBaselineShift = SVGLength.toString(dynamic);
        invalidate();
    }

    @iej(name = "dx")
    public void setDeltaX(Dynamic dynamic) {
        this.mDeltaX = SVGLength.arrayFrom(dynamic);
        invalidate();
    }

    @iej(name = "dy")
    public void setDeltaY(Dynamic dynamic) {
        this.mDeltaY = SVGLength.arrayFrom(dynamic);
        invalidate();
    }

    @iej(name = "lengthAdjust")
    public void setLengthAdjust(String str) {
        this.mLengthAdjust = TextProperties.TextLengthAdjust.valueOf(str);
        invalidate();
    }

    @iej(name = "alignmentBaseline")
    public void setMethod(String str) {
        this.mAlignmentBaseline = TextProperties.AlignmentBaseline.getEnum(str);
        invalidate();
    }

    @iej(name = "x")
    public void setPositionX(Dynamic dynamic) {
        this.mPositionX = SVGLength.arrayFrom(dynamic);
        invalidate();
    }

    @iej(name = "y")
    public void setPositionY(Dynamic dynamic) {
        this.mPositionY = SVGLength.arrayFrom(dynamic);
        invalidate();
    }

    @iej(name = "rotate")
    public void setRotate(Dynamic dynamic) {
        this.mRotate = SVGLength.arrayFrom(dynamic);
        invalidate();
    }

    @iej(name = "textLength")
    public void setTextLength(Dynamic dynamic) {
        this.mTextLength = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "verticalAlign")
    public void setVerticalAlign(String str) {
        if (str != null) {
            String strTrim = str.trim();
            int iLastIndexOf = strTrim.lastIndexOf(32);
            try {
                this.mAlignmentBaseline = TextProperties.AlignmentBaseline.getEnum(strTrim.substring(iLastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.mAlignmentBaseline = TextProperties.AlignmentBaseline.baseline;
            }
            try {
                this.mBaselineShift = strTrim.substring(0, iLastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.mBaselineShift = null;
            }
        } else {
            this.mAlignmentBaseline = TextProperties.AlignmentBaseline.baseline;
            this.mBaselineShift = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.GroupView
    public Path getPath(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }
}
