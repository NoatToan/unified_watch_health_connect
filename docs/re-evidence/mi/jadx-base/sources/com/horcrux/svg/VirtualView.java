package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import defpackage.cm8;
import defpackage.iej;
import defpackage.iz6;
import defpackage.y8h;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
public abstract class VirtualView extends ReactViewGroup {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    static final float MIN_OPACITY_FOR_DRAW = 0.01f;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    private double fontSize;
    private GlyphContext glyphContext;
    RectF mBox;
    private Path mCachedClipPath;
    private RectF mClientRect;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    Path mFillPath;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    String mMask;
    Matrix mMatrix;
    String mName;
    float mOpacity;
    Path mPath;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    Path mStrokePath;
    Region mStrokeRegion;
    private GroupView mTextRoot;
    Matrix mTransform;
    boolean mTransformInvertible;
    private SvgView svgView;

    /* JADX INFO: renamed from: com.horcrux.svg.VirtualView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$SVGLengthUnitType;

        static {
            int[] iArr = new int[SVGLengthUnitType.values().length];
            $SwitchMap$com$horcrux$svg$SVGLengthUnitType = iArr;
            try {
                iArr[SVGLengthUnitType.SVG_LENGTHTYPE_EMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_EXS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_CM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_MM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_PT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mMatrix = new Matrix();
        this.mTransform = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mTransformInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = iz6.e().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            } else {
                virtualView.clearCache();
            }
        }
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double fontSizeFromContext;
        switch (AnonymousClass1.$SwitchMap$com$horcrux$svg$SVGLengthUnitType[sVGLength.unit.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return sVGLength.value * fontSizeFromContext * ((double) this.mScale);
    }

    private double getCanvasDiagonal() {
        double d = this.canvasDiagonal;
        if (d != -1.0d) {
            return d;
        }
        double dSqrt = Math.sqrt(Math.pow(getCanvasWidth(), 2.0d) + Math.pow(getCanvasHeight(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = dSqrt;
        return dSqrt;
    }

    private float getCanvasHeight() {
        float f = this.canvasHeight;
        if (f != -1.0f) {
            return f;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.getGlyphContext().getHeight();
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f = this.canvasWidth;
        if (f != -1.0f) {
            return f;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.getGlyphContext().getWidth();
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d = this.fontSize;
        if (d != -1.0d) {
            return d;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.getGlyphContext();
        }
        double fontSize = this.glyphContext.getFontSize();
        this.fontSize = fontSize;
        return fontSize;
    }

    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    public void clearChildCache() {
        clearCache();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    public abstract void draw(Canvas canvas, Paint paint, float f);

    public RectF getClientRect() {
        return this.mClientRect;
    }

    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    public GroupView getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    public abstract Path getPath(Canvas canvas, Paint paint);

    public SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            cm8.i("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    public GroupView getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (virtualView != null) {
                if (virtualView instanceof GroupView) {
                    GroupView groupView = (GroupView) virtualView;
                    if (groupView.getGlyphContext() != null) {
                        this.mTextRoot = groupView;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    public boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.mClientRect;
        if (rectF == null) {
            return;
        }
        if (!(this instanceof GroupView)) {
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil = (int) Math.ceil(this.mClientRect.right);
            int iCeil2 = (int) Math.ceil(this.mClientRect.bottom);
            setLeft(iFloor);
            setTop(iFloor2);
            setRight(iCeil);
            setBottom(iCeil2);
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onMeasure(int i, int i2) {
        RectF rectF = this.mClientRect;
        int iCeil = rectF != null ? (int) Math.ceil(rectF.width()) : View.getDefaultSize(getSuggestedMinimumWidth(), i);
        RectF rectF2 = this.mClientRect;
        setMeasuredDimension(iCeil, rectF2 != null ? (int) Math.ceil(rectF2.height()) : View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    public double relativeOnHeight(SVGLength sVGLength) {
        double d;
        float canvasHeight;
        SVGLengthUnitType sVGLengthUnitType = sVGLength.unit;
        if (sVGLengthUnitType == SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER) {
            d = sVGLength.value;
            canvasHeight = this.mScale;
        } else {
            if (sVGLengthUnitType != SVGLengthUnitType.SVG_LENGTHTYPE_PERCENTAGE) {
                return fromRelativeFast(sVGLength);
            }
            d = sVGLength.value / 100.0d;
            canvasHeight = getCanvasHeight();
        }
        return d * ((double) canvasHeight);
    }

    public double relativeOnOther(SVGLength sVGLength) {
        double d;
        double canvasDiagonal;
        SVGLengthUnitType sVGLengthUnitType = sVGLength.unit;
        if (sVGLengthUnitType == SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER) {
            d = sVGLength.value;
            canvasDiagonal = this.mScale;
        } else {
            if (sVGLengthUnitType != SVGLengthUnitType.SVG_LENGTHTYPE_PERCENTAGE) {
                return fromRelativeFast(sVGLength);
            }
            d = sVGLength.value / 100.0d;
            canvasDiagonal = getCanvasDiagonal();
        }
        return d * canvasDiagonal;
    }

    public double relativeOnWidth(SVGLength sVGLength) {
        double d;
        float canvasWidth;
        SVGLengthUnitType sVGLengthUnitType = sVGLength.unit;
        if (sVGLengthUnitType == SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER) {
            d = sVGLength.value;
            canvasWidth = this.mScale;
        } else {
            if (sVGLengthUnitType != SVGLengthUnitType.SVG_LENGTHTYPE_PERCENTAGE) {
                return fromRelativeFast(sVGLength);
            }
            d = sVGLength.value / 100.0d;
            canvasWidth = getCanvasWidth();
        }
        return d * ((double) canvasWidth);
    }

    public void render(Canvas canvas, Paint paint, float f) {
        draw(canvas, paint, f);
    }

    public void restoreCanvas(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    public int saveAndSetupCanvas(Canvas canvas) {
        int iSave = canvas.save();
        canvas.concat(this.mMatrix);
        canvas.concat(this.mTransform);
        return iSave;
    }

    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF == null) {
                return;
            }
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil = (int) Math.ceil(this.mClientRect.right);
            int iCeil2 = (int) Math.ceil(this.mClientRect.bottom);
            int iCeil3 = (int) Math.ceil(this.mClientRect.width());
            int iCeil4 = (int) Math.ceil(this.mClientRect.height());
            if (!(this instanceof GroupView)) {
                setLeft(iFloor);
                setTop(iFloor2);
                setRight(iCeil);
                setBottom(iCeil2);
            }
            setMeasuredDimension(iCeil3, iCeil4);
            ((UIManagerModule) this.mContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(y8h.b(getId(), iFloor, iFloor2, iCeil3, iCeil4));
        }
    }

    @iej(name = "clipPath")
    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    @iej(defaultInt = 1, name = "clipRule")
    public void setClipRule(int i) {
        this.mClipRule = i;
        invalidate();
    }

    @iej(name = "mask")
    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    @iej(name = "matrix")
    public void setMatrix(Dynamic dynamic) {
        ReadableType type = dynamic.getType();
        if (dynamic.isNull() || !type.equals(ReadableType.Array)) {
            this.mMatrix = null;
            this.mInvMatrix = null;
            this.mInvertible = false;
        } else {
            ReadableArray readableArrayAsArray = dynamic.asArray();
            float[] fArr = sRawMatrix;
            int matrixData = PropHelper.toMatrixData(readableArrayAsArray, fArr, this.mScale);
            if (matrixData == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (matrixData != -1) {
                cm8.C("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        }
        super.invalidate();
        clearParentCache();
    }

    @iej(name = "name")
    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    @iej(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.mOpacity = f;
        invalidate();
    }

    @iej(name = "responsible")
    public void setResponsible(boolean z) {
        this.mResponsible = z;
        invalidate();
    }

    public Path getClipPath(Canvas canvas, Paint paint) {
        if (this.mClipPath != null) {
            ClipPathView clipPathView = (ClipPathView) getSvgView().getDefinedClipPath(this.mClipPath);
            if (clipPathView != null) {
                Path path = clipPathView.mClipRule == 0 ? clipPathView.getPath(canvas, paint) : clipPathView.getPath(canvas, paint, Region.Op.UNION);
                int i = clipPathView.mClipRule;
                if (i == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i != 1) {
                    cm8.C("ReactNative", "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = path;
            } else {
                cm8.C("ReactNative", "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }
}
