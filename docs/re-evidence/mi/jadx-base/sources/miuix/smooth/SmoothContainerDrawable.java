package miuix.smooth;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import defpackage.f3n;
import defpackage.p5j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothContainerDrawable extends Drawable implements Drawable.Callback {
    public static final PorterDuffXfermode c = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContainerState f26876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f3n f26877b;

    public static class ChildDrawable {
        Drawable mDrawable;

        public ChildDrawable() {
        }

        public ChildDrawable(ChildDrawable childDrawable, SmoothContainerDrawable smoothContainerDrawable, Resources resources, Resources.Theme theme) {
            Drawable drawableNewDrawable;
            Drawable drawable = childDrawable.mDrawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                drawableNewDrawable = constantState == null ? drawable : resources == null ? constantState.newDrawable() : theme == null ? constantState.newDrawable(resources) : constantState.newDrawable(resources, theme);
                drawableNewDrawable.setLayoutDirection(drawable.getLayoutDirection());
                drawableNewDrawable.setBounds(drawable.getBounds());
                drawableNewDrawable.setLevel(drawable.getLevel());
                drawableNewDrawable.setCallback(smoothContainerDrawable);
            } else {
                drawableNewDrawable = null;
            }
            this.mDrawable = drawableNewDrawable;
        }
    }

    public static final class ContainerState extends Drawable.ConstantState {
        ChildDrawable mChildDrawable;
        int mLayerType;
        float[] mRadii;
        float mRadius;
        int mStrokeColor;
        int mStrokeWidth;

        public ContainerState() {
            this.mLayerType = 0;
            this.mChildDrawable = new ChildDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return true;
        }

        public int getAlpha() {
            return this.mChildDrawable.mDrawable.getAlpha();
        }

        public Rect getBounds() {
            return this.mChildDrawable.mDrawable.getBounds();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChildDrawable.mDrawable.getChangingConfigurations();
        }

        public Rect getDirtyBounds() {
            return this.mChildDrawable.mDrawable.getDirtyBounds();
        }

        public int getIntrinsicHeight() {
            return this.mChildDrawable.mDrawable.getIntrinsicHeight();
        }

        public int getIntrinsicWidth() {
            return this.mChildDrawable.mDrawable.getIntrinsicWidth();
        }

        public int getOpacity() {
            return this.mChildDrawable.mDrawable.getOpacity();
        }

        public boolean getPadding(Rect rect) {
            return this.mChildDrawable.mDrawable.getPadding(rect);
        }

        public final boolean isStateful() {
            return this.mChildDrawable.mDrawable.isStateful();
        }

        public void jumpToCurrentState() {
            this.mChildDrawable.mDrawable.jumpToCurrentState();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new SmoothContainerDrawable(null, 0 == true ? 1 : 0, this);
        }

        public void onBoundsChange(Rect rect) {
            this.mChildDrawable.mDrawable.setBounds(rect);
        }

        public boolean onStateChange(int[] iArr) {
            return isStateful() && this.mChildDrawable.mDrawable.setState(iArr);
        }

        public void setAlpha(int i) {
            this.mChildDrawable.mDrawable.setAlpha(i);
            this.mChildDrawable.mDrawable.invalidateSelf();
        }

        public void setBounds(Rect rect) {
            this.mChildDrawable.mDrawable.setBounds(rect);
        }

        public void setChangingConfigurations(int i) {
            this.mChildDrawable.mDrawable.setChangingConfigurations(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mChildDrawable.mDrawable.setColorFilter(colorFilter);
        }

        public void setDither(boolean z) {
            this.mChildDrawable.mDrawable.setDither(z);
        }

        public void setFilterBitmap(boolean z) {
            this.mChildDrawable.mDrawable.setFilterBitmap(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new SmoothContainerDrawable(resources, null, this);
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            this.mChildDrawable.mDrawable.setBounds(i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new SmoothContainerDrawable(resources, theme, this);
        }

        public ContainerState(ContainerState containerState, SmoothContainerDrawable smoothContainerDrawable, Resources resources, Resources.Theme theme) {
            this.mLayerType = 0;
            this.mChildDrawable = new ChildDrawable(containerState.mChildDrawable, smoothContainerDrawable, resources, theme);
            this.mRadius = containerState.mRadius;
            this.mRadii = containerState.mRadii;
            this.mStrokeWidth = containerState.mStrokeWidth;
            this.mStrokeColor = containerState.mStrokeColor;
            this.mLayerType = containerState.mLayerType;
        }
    }

    public final Rect a() {
        return this.f26876a.getBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.f26876a.mChildDrawable.mDrawable.applyTheme(theme);
    }

    public float b() {
        return this.f26876a.mRadius;
    }

    public int c() {
        return this.f26876a.mLayerType;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        ContainerState containerState = this.f26876a;
        return (containerState != null && containerState.canApplyTheme()) || super.canApplyTheme();
    }

    public final void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                ChildDrawable childDrawable = new ChildDrawable();
                Drawable drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                childDrawable.mDrawable = drawableCreateFromXmlInner;
                drawableCreateFromXmlInner.setCallback(this);
                this.f26876a.mChildDrawable = childDrawable;
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSaveLayer = c() != 2 ? canvas.saveLayer(a().left, a().top, a().right, a().bottom, null, 31) : -1;
        this.f26876a.mChildDrawable.mDrawable.draw(canvas);
        this.f26877b.a(canvas, c);
        if (c() != 2) {
            canvas.restoreToCount(iSaveLayer);
        }
        this.f26877b.b(canvas);
    }

    public final TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public void f(float[] fArr) {
        this.f26876a.mRadii = fArr;
        this.f26877b.k(fArr);
        if (fArr == null) {
            this.f26876a.mRadius = 0.0f;
            this.f26877b.l(0.0f);
        }
        invalidateSelf();
    }

    public void g(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        ContainerState containerState = this.f26876a;
        containerState.mRadius = f;
        containerState.mRadii = null;
        this.f26877b.l(f);
        this.f26877b.k(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f26876a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26876a;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f26876a.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26876a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26876a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f26876a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f26877b.e(a()));
        } else {
            outline.setRoundRect(a(), b());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f26876a.getPadding(rect);
    }

    public void h(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Layer type can only be one of: LAYER_TYPE_NONE, LAYER_TYPE_SOFTWARE or LAYER_TYPE_HARDWARE");
        }
        ContainerState containerState = this.f26876a;
        if (containerState.mLayerType != i) {
            containerState.mLayerType = i;
            invalidateSelf();
        }
    }

    public void i(int i) {
        ContainerState containerState = this.f26876a;
        if (containerState.mStrokeColor != i) {
            containerState.mStrokeColor = i;
            this.f26877b.m(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayE = e(resources, theme, attributeSet, p5j.l);
        g(typedArrayE.getDimensionPixelSize(p5j.m, 0));
        if (typedArrayE.hasValue(p5j.n) || typedArrayE.hasValue(p5j.o) || typedArrayE.hasValue(p5j.q) || typedArrayE.hasValue(p5j.p)) {
            float dimensionPixelSize = typedArrayE.getDimensionPixelSize(p5j.n, 0);
            float dimensionPixelSize2 = typedArrayE.getDimensionPixelSize(p5j.o, 0);
            float dimensionPixelSize3 = typedArrayE.getDimensionPixelSize(p5j.q, 0);
            float dimensionPixelSize4 = typedArrayE.getDimensionPixelSize(p5j.p, 0);
            f(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        j(typedArrayE.getDimensionPixelSize(p5j.t, 0));
        i(typedArrayE.getColor(p5j.s, 0));
        h(typedArrayE.getInt(p5j.f30026r, 0));
        typedArrayE.recycle();
        d(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f26876a.isStateful();
    }

    public void j(int i) {
        ContainerState containerState = this.f26876a;
        if (containerState.mStrokeWidth != i) {
            containerState.mStrokeWidth = i;
            this.f26877b.n(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f26876a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f26876a.onBoundsChange(rect);
        this.f26877b.i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.f26876a.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f26876a.setAlpha(i);
        this.f26877b.j(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f26876a.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26876a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f26876a.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f26876a.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public SmoothContainerDrawable() {
        this.f26877b = new f3n();
        this.f26876a = new ContainerState();
    }

    private SmoothContainerDrawable(Resources resources, Resources.Theme theme, ContainerState containerState) {
        this.f26877b = new f3n();
        this.f26876a = new ContainerState(containerState, this, resources, theme);
        this.f26877b.n(containerState.mStrokeWidth);
        this.f26877b.m(containerState.mStrokeColor);
        this.f26877b.k(containerState.mRadii);
        this.f26877b.l(containerState.mRadius);
    }
}
