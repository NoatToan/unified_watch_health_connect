package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import defpackage.iej;
import defpackage.iz6;
import defpackage.scj;
import defpackage.tcj;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
public class SvgView extends ReactViewGroup implements scj, tcj {
    private String mAlign;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private final Map<String, Brush> mDefinedBrushes;
    private final Map<String, VirtualView> mDefinedClipPaths;
    private final Map<String, VirtualView> mDefinedMasks;
    private final Map<String, VirtualView> mDefinedTemplates;
    private final Matrix mInvViewBoxMatrix;
    private boolean mInvertible;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private boolean mRendered;
    private boolean mResponsible;
    private final float mScale;
    int mTintColor;
    private float mVbHeight;
    private float mVbWidth;
    private SVGLength mbbHeight;
    private SVGLength mbbWidth;
    private Runnable toDataUrlTask;

    public enum Events {
        EVENT_DATA_URL("onDataURL");

        private final String mName;

        Events(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public SvgView(ReactContext reactContext) {
        super(reactContext);
        this.toDataUrlTask = null;
        this.mResponsible = false;
        this.mDefinedClipPaths = new HashMap();
        this.mDefinedTemplates = new HashMap();
        this.mDefinedMasks = new HashMap();
        this.mDefinedBrushes = new HashMap();
        this.mInvViewBoxMatrix = new Matrix();
        this.mInvertible = true;
        this.mRendered = false;
        this.mTintColor = 0;
        this.mScale = iz6.e().density;
    }

    private void clearChildCache() {
        if (this.mRendered) {
            this.mRendered = false;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).clearChildCache();
                }
            }
        }
    }

    private Bitmap drawOutput() {
        this.mRendered = true;
        float width = getWidth();
        float height = getHeight();
        if (Float.isNaN(width) || Float.isNaN(height) || width < 1.0f || height < 1.0f || Math.log10(width) + Math.log10(height) > 42.0d) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        drawChildren(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private RectF getViewBox() {
        float f = this.mMinX;
        float f2 = this.mScale;
        float f3 = this.mMinY;
        return new RectF(f * f2, f3 * f2, (f + this.mVbWidth) * f2, (f3 + this.mVbHeight) * f2);
    }

    private int hitTest(float f, float f2) {
        if (!this.mResponsible || !this.mInvertible) {
            return getId();
        }
        float[] fArr = {f, f2};
        this.mInvViewBoxMatrix.mapPoints(fArr);
        int iHitTest = -1;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                iHitTest = ((VirtualView) childAt).hitTest(fArr);
            } else if (childAt instanceof SvgView) {
                iHitTest = ((SvgView) childAt).hitTest(f, f2);
            }
            if (iHitTest != -1) {
                break;
            }
        }
        return iHitTest == -1 ? getId() : iHitTest;
    }

    public void defineBrush(Brush brush, String str) {
        this.mDefinedBrushes.put(str, brush);
    }

    public void defineClipPath(VirtualView virtualView, String str) {
        this.mDefinedClipPaths.put(str, virtualView);
    }

    public void defineMask(VirtualView virtualView, String str) {
        this.mDefinedMasks.put(str, virtualView);
    }

    public void defineTemplate(VirtualView virtualView, String str) {
        this.mDefinedTemplates.put(str, virtualView);
    }

    public synchronized void drawChildren(Canvas canvas) {
        try {
            this.mRendered = true;
            this.mCanvas = canvas;
            if (this.mAlign != null) {
                RectF viewBox = getViewBox();
                float width = canvas.getWidth();
                float height = canvas.getHeight();
                boolean z = getParent() instanceof VirtualView;
                if (z) {
                    width = (float) PropHelper.fromRelative(this.mbbWidth, width, 0.0d, this.mScale, 12.0d);
                    height = (float) PropHelper.fromRelative(this.mbbHeight, height, 0.0d, this.mScale, 12.0d);
                }
                RectF rectF = new RectF(0.0f, 0.0f, width, height);
                if (z) {
                    canvas.clipRect(rectF);
                }
                Matrix transform = ViewBox.getTransform(viewBox, rectF, this.mAlign, this.mMeetOrSlice);
                this.mInvertible = transform.invert(this.mInvViewBoxMatrix);
                canvas.concat(transform);
            }
            Paint paint = new Paint();
            paint.setFlags(385);
            paint.setTypeface(Typeface.DEFAULT);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt2 = getChildAt(i2);
                if (childAt2 instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt2;
                    int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas);
                    virtualView.render(canvas, paint, 1.0f);
                    virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                    if (virtualView.isResponsible() && !this.mResponsible) {
                        this.mResponsible = true;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void enableTouchEvents() {
        if (this.mResponsible) {
            return;
        }
        this.mResponsible = true;
    }

    public Rect getCanvasBounds() {
        return this.mCanvas.getClipBounds();
    }

    public Brush getDefinedBrush(String str) {
        return this.mDefinedBrushes.get(str);
    }

    public VirtualView getDefinedClipPath(String str) {
        return this.mDefinedClipPaths.get(str);
    }

    public VirtualView getDefinedMask(String str) {
        return this.mDefinedMasks.get(str);
    }

    public VirtualView getDefinedTemplate(String str) {
        return this.mDefinedTemplates.get(str);
    }

    @Override // defpackage.tcj
    public boolean interceptsTouchEvent(float f, float f2) {
        return true;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            if (this.mRendered) {
                this.mRendered = false;
                ((VirtualView) parent).getSvgView().invalidate();
                return;
            }
            return;
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mBitmap = null;
    }

    public boolean isResponsible() {
        return this.mResponsible;
    }

    public boolean notRendered() {
        return !this.mRendered;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getParent() instanceof VirtualView) {
            return;
        }
        super.onDraw(canvas);
        if (this.mBitmap == null) {
            this.mBitmap = drawOutput();
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            Runnable runnable = this.toDataUrlTask;
            if (runnable != null) {
                runnable.run();
                this.toDataUrlTask = null;
            }
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidate();
    }

    @Override // defpackage.scj
    public int reactTagForTouch(float f, float f2) {
        return hitTest(f, f2);
    }

    @iej(name = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
        clearChildCache();
    }

    @iej(name = "bbHeight")
    public void setBbHeight(Dynamic dynamic) {
        this.mbbHeight = SVGLength.from(dynamic);
        invalidate();
        clearChildCache();
    }

    @iej(name = "bbWidth")
    public void setBbWidth(Dynamic dynamic) {
        this.mbbWidth = SVGLength.from(dynamic);
        invalidate();
        clearChildCache();
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        SvgViewManager.setSvgView(i, this);
    }

    @iej(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.mMeetOrSlice = i;
        invalidate();
        clearChildCache();
    }

    @iej(name = "minX")
    public void setMinX(float f) {
        this.mMinX = f;
        invalidate();
        clearChildCache();
    }

    @iej(name = "minY")
    public void setMinY(float f) {
        this.mMinY = f;
        invalidate();
        clearChildCache();
    }

    @iej(customType = "Color", name = "tintColor")
    public void setTintColor(Integer num) {
        if (num == null) {
            this.mTintColor = 0;
        } else {
            this.mTintColor = num.intValue();
        }
        invalidate();
        clearChildCache();
    }

    public void setToDataUrlTask(Runnable runnable) {
        this.toDataUrlTask = runnable;
    }

    @iej(name = "vbHeight")
    public void setVbHeight(float f) {
        this.mVbHeight = f;
        invalidate();
        clearChildCache();
    }

    @iej(name = "vbWidth")
    public void setVbWidth(float f) {
        this.mVbWidth = f;
        invalidate();
        clearChildCache();
    }

    public String toDataURL() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(bitmapCreateBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public String toDataURL(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(bitmapCreateBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }
}
