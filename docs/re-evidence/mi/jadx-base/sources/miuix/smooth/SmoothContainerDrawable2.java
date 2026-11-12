package miuix.smooth;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import defpackage.e3n;
import defpackage.p5j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothContainerDrawable2 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContainerState f26878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26879b;
    public int c;
    public float[] d;
    public float[] e;
    public float f;
    public Paint g;
    public RectF h;
    public Path i;
    public boolean j;

    public static final class ContainerState extends Drawable.ConstantState {
        ChildDrawableWrapper mChildDrawableWrapper;
        int mLayerType;
        float[] mRadii;
        float mRadius;
        int mStrokeColor;
        int mStrokeWidth;
        boolean mUseSmooth;

        public ContainerState() {
            this.mLayerType = 0;
            this.mChildDrawableWrapper = new ChildDrawableWrapper();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return true;
        }

        public int getAlpha() {
            return this.mChildDrawableWrapper.mDrawable.getAlpha();
        }

        public Rect getBounds() {
            return this.mChildDrawableWrapper.mDrawable.getBounds();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChildDrawableWrapper.mDrawable.getChangingConfigurations();
        }

        public Rect getDirtyBounds() {
            return this.mChildDrawableWrapper.mDrawable.getDirtyBounds();
        }

        public int getIntrinsicHeight() {
            return this.mChildDrawableWrapper.mDrawable.getIntrinsicHeight();
        }

        public int getIntrinsicWidth() {
            return this.mChildDrawableWrapper.mDrawable.getIntrinsicWidth();
        }

        public int getOpacity() {
            return this.mChildDrawableWrapper.mDrawable.getOpacity();
        }

        public boolean getPadding(Rect rect) {
            return this.mChildDrawableWrapper.mDrawable.getPadding(rect);
        }

        public final boolean isStateful() {
            return this.mChildDrawableWrapper.mDrawable.isStateful();
        }

        public void jumpToCurrentState() {
            this.mChildDrawableWrapper.mDrawable.jumpToCurrentState();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new SmoothContainerDrawable2(null, 0 == true ? 1 : 0, this);
        }

        public void onBoundsChange(Rect rect) {
            this.mChildDrawableWrapper.mDrawable.setBounds(rect);
        }

        public boolean onStateChange(int[] iArr) {
            return isStateful() && this.mChildDrawableWrapper.mDrawable.setState(iArr);
        }

        public void setAlpha(int i) {
            this.mChildDrawableWrapper.mDrawable.setAlpha(i);
            this.mChildDrawableWrapper.mDrawable.invalidateSelf();
        }

        public void setBounds(Rect rect) {
            this.mChildDrawableWrapper.mDrawable.setBounds(rect);
        }

        public void setChangingConfigurations(int i) {
            this.mChildDrawableWrapper.mDrawable.setChangingConfigurations(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mChildDrawableWrapper.mDrawable.setColorFilter(colorFilter);
        }

        public void setDither(boolean z) {
            this.mChildDrawableWrapper.mDrawable.setDither(z);
        }

        public void setFilterBitmap(boolean z) {
            this.mChildDrawableWrapper.mDrawable.setFilterBitmap(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new SmoothContainerDrawable2(resources, null, this);
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            this.mChildDrawableWrapper.mDrawable.setBounds(i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new SmoothContainerDrawable2(resources, theme, this);
        }

        public ContainerState(ContainerState containerState, SmoothContainerDrawable2 smoothContainerDrawable2, Resources resources, Resources.Theme theme) {
            this.mLayerType = 0;
            this.mChildDrawableWrapper = new ChildDrawableWrapper(containerState.mChildDrawableWrapper, smoothContainerDrawable2, resources, theme);
            this.mRadius = containerState.mRadius;
            this.mRadii = containerState.mRadii;
            this.mStrokeWidth = containerState.mStrokeWidth;
            this.mStrokeColor = containerState.mStrokeColor;
            this.mLayerType = containerState.mLayerType;
            this.mUseSmooth = containerState.mUseSmooth;
        }
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public final void a(Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        this.i.reset();
        RectF rectF = this.h;
        rectF.left = bounds.left;
        rectF.top = bounds.top;
        rectF.right = bounds.right;
        rectF.bottom = bounds.bottom;
        float[] fArr = this.d;
        if (fArr == null) {
            Path path = this.i;
            float f = this.f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } else {
            this.i.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        canvas.clipPath(this.i);
        int i = this.f26879b;
        float f2 = i * 0.5f;
        if (i != 0) {
            int iSave2 = canvas.save();
            this.h.inset(f2, f2);
            this.i.reset();
            float[] fArr2 = this.d;
            if (fArr2 == null) {
                Path path2 = this.i;
                RectF rectF2 = this.h;
                float f3 = this.f;
                path2.addRoundRect(rectF2, f3 - f2, f3 - f2, Path.Direction.CW);
            } else {
                float[] fArr3 = (float[]) fArr2.clone();
                this.e = fArr3;
                float[] fArr4 = this.d;
                fArr3[0] = fArr4[0] - f2;
                fArr3[1] = fArr4[1] - f2;
                fArr3[2] = fArr4[2] - f2;
                fArr3[3] = fArr4[3] - f2;
                this.i.addRoundRect(this.h, fArr3, Path.Direction.CCW);
            }
            canvas.clipPath(this.i);
            this.f26878a.mChildDrawableWrapper.mDrawable.draw(canvas);
            canvas.restoreToCount(iSave2);
            canvas.drawPath(this.i, this.g);
        } else {
            this.f26878a.mChildDrawableWrapper.mDrawable.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.f26878a.mChildDrawableWrapper.mDrawable.applyTheme(theme);
    }

    public final Rect b() {
        return this.f26878a.getBounds();
    }

    public Drawable c() {
        ContainerState containerState = this.f26878a;
        if (containerState != null) {
            return containerState.mChildDrawableWrapper.mDrawable;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        ContainerState containerState = this.f26878a;
        return (containerState != null && containerState.canApplyTheme()) || super.canApplyTheme();
    }

    public float d() {
        return this.f26878a.mRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        a(canvas);
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("child")) {
                do {
                    next = xmlPullParser.next();
                } while (next == 4);
                if (next != 2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <child> tag requires a 'drawable' attribute or child tag defining a drawable");
                }
                ChildDrawableWrapper childDrawableWrapper = new ChildDrawableWrapper();
                Drawable drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                childDrawableWrapper.mDrawable = drawableCreateFromXmlInner;
                drawableCreateFromXmlInner.setCallback(this);
                this.f26878a.mChildDrawableWrapper = childDrawableWrapper;
                return;
            }
        }
    }

    public final void f() {
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.g.setColor(this.c);
        this.g.setStrokeWidth(this.f26879b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f26878a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26878a;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f26878a.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26878a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26878a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f26878a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(b(), d());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f26878a.getPadding(rect);
    }

    public void h(Drawable drawable) {
        if (this.f26878a != null) {
            ChildDrawableWrapper childDrawableWrapper = new ChildDrawableWrapper();
            childDrawableWrapper.mDrawable = drawable;
            drawable.setCallback(this);
            this.f26878a.mChildDrawableWrapper = childDrawableWrapper;
        }
    }

    public void i(float[] fArr) {
        ContainerState containerState = this.f26878a;
        containerState.mRadii = fArr;
        this.d = fArr;
        if (fArr == null) {
            containerState.mRadius = 0.0f;
            this.f = 0.0f;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayG = g(resources, theme, attributeSet, p5j.u);
        j(typedArrayG.getDimensionPixelSize(p5j.v, 0));
        if (typedArrayG.hasValue(p5j.w) || typedArrayG.hasValue(p5j.x) || typedArrayG.hasValue(p5j.z) || typedArrayG.hasValue(p5j.y)) {
            float dimensionPixelSize = typedArrayG.getDimensionPixelSize(p5j.w, 0);
            float dimensionPixelSize2 = typedArrayG.getDimensionPixelSize(p5j.x, 0);
            float dimensionPixelSize3 = typedArrayG.getDimensionPixelSize(p5j.z, 0);
            float dimensionPixelSize4 = typedArrayG.getDimensionPixelSize(p5j.y, 0);
            i(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        n(typedArrayG.getDimensionPixelSize(p5j.C, 0));
        m(typedArrayG.getColor(p5j.B, 0));
        k(typedArrayG.getInt(p5j.A, 0));
        this.j = typedArrayG.getBoolean(p5j.D, true);
        Boolean bool = e3n.f16229a;
        if (bool != null) {
            this.j = bool.booleanValue();
        }
        if (this.j) {
            l(true);
        }
        typedArrayG.recycle();
        e(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f26878a.isStateful();
    }

    public void j(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        ContainerState containerState = this.f26878a;
        containerState.mRadius = f;
        containerState.mRadii = null;
        this.f = f;
        this.d = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f26878a.jumpToCurrentState();
    }

    public void k(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Layer type can only be one of: LAYER_TYPE_NONE, LAYER_TYPE_SOFTWARE or LAYER_TYPE_HARDWARE");
        }
        ContainerState containerState = this.f26878a;
        if (containerState.mLayerType != i) {
            containerState.mLayerType = i;
            invalidateSelf();
        }
    }

    public final void l(boolean z) {
        e3n.c(this, z);
        this.f26878a.mUseSmooth = z;
    }

    public void m(int i) {
        ContainerState containerState = this.f26878a;
        if (containerState.mStrokeColor != i) {
            containerState.mStrokeColor = i;
            this.c = i;
            this.g.setColor(i);
            invalidateSelf();
        }
    }

    public void n(int i) {
        ContainerState containerState = this.f26878a;
        if (containerState.mStrokeWidth != i) {
            containerState.mStrokeWidth = i;
            this.f26879b = i;
            this.g.setStrokeWidth(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f26878a.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.f26878a.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f26878a.setAlpha(i);
        this.g.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f26878a.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26878a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f26878a.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f26878a.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public static class ChildDrawableWrapper {
        Drawable mDrawable;

        public ChildDrawableWrapper() {
            this.mDrawable = new GradientDrawable();
        }

        public ChildDrawableWrapper(ChildDrawableWrapper childDrawableWrapper, SmoothContainerDrawable2 smoothContainerDrawable2, Resources resources, Resources.Theme theme) {
            Drawable drawableNewDrawable;
            Drawable drawable = childDrawableWrapper.mDrawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState == null) {
                    drawableNewDrawable = drawable;
                } else if (resources == null) {
                    drawableNewDrawable = constantState.newDrawable();
                } else if (theme == null) {
                    drawableNewDrawable = constantState.newDrawable(resources);
                } else {
                    drawableNewDrawable = constantState.newDrawable(resources, theme);
                }
                drawableNewDrawable.setLayoutDirection(drawable.getLayoutDirection());
                drawableNewDrawable.setBounds(drawable.getBounds());
                drawableNewDrawable.setLevel(drawable.getLevel());
                drawableNewDrawable.setCallback(smoothContainerDrawable2);
            } else {
                drawableNewDrawable = null;
            }
            this.mDrawable = drawableNewDrawable;
        }
    }

    public SmoothContainerDrawable2() {
        this.h = new RectF();
        this.i = new Path();
        this.f26878a = new ContainerState();
        f();
    }

    private SmoothContainerDrawable2(Resources resources, Resources.Theme theme, ContainerState containerState) {
        this.h = new RectF();
        this.i = new Path();
        this.f26878a = new ContainerState(containerState, this, resources, theme);
        this.f26879b = containerState.mStrokeWidth;
        this.c = containerState.mStrokeColor;
        this.d = containerState.mRadii;
        this.f = containerState.mRadius;
        boolean z = containerState.mUseSmooth;
        this.j = z;
        l(z);
        f();
    }
}
