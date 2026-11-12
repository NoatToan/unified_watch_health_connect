package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PointerEvents;
import defpackage.agj;
import defpackage.cm8;
import defpackage.exk;
import defpackage.fxk;
import defpackage.hej;
import defpackage.idj;
import defpackage.j0s;
import defpackage.m8h;
import defpackage.mdj;
import defpackage.poc;
import defpackage.ptq;
import defpackage.qcj;
import defpackage.rbf;
import defpackage.rcj;
import defpackage.sk1;
import defpackage.vah;

/* JADX INFO: loaded from: classes4.dex */
public class ReactViewGroup extends ViewGroup implements mdj, qcj, hej, idj, agj {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private b mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private final ptq mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private int mLayoutDirection;
    private boolean mNeedsOffscreenAlphaCompositing;
    private m8h mOnInterceptTouchEventListener;
    private String mOverflow;
    private Path mPath;
    private PointerEvents mPointerEvents;
    private ReactViewBackgroundDrawable mReactBackgroundDrawable;
    private boolean mRemoveClippedSubviews;

    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReactViewGroup f7595a;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f7595a.getRemoveClippedSubviews()) {
                this.f7595a.updateSubviewClipStatus(view);
            }
        }

        public b(ReactViewGroup reactViewGroup) {
            this.f7595a = reactViewGroup;
        }
    }

    public ReactViewGroup(Context context) {
        super(context);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mPointerEvents = PointerEvents.AUTO;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
        setClipChildren(false);
        this.mDrawingOrderHelper = new ptq(this);
    }

    private void addInArray(View view, int i) {
        View[] viewArr = (View[]) sk1.c(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i == i2) {
            if (length == i2) {
                View[] viewArr2 = new View[length + 12];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i3 = this.mAllChildrenCount;
            this.mAllChildrenCount = i3 + 1;
            viewArr[i3] = view;
            return;
        }
        if (i >= i2) {
            throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
        }
        if (length == i2) {
            View[] viewArr3 = new View[length + 12];
            this.mAllChildren = viewArr3;
            System.arraycopy(viewArr, 0, viewArr3, 0, i);
            System.arraycopy(viewArr, i, this.mAllChildren, i + 1, i2 - i);
            viewArr = this.mAllChildren;
        } else {
            System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
        }
        viewArr[i] = view;
        this.mAllChildrenCount++;
    }

    private void dispatchOverflowDraw(Canvas canvas) {
        float f;
        boolean z;
        float f2;
        Path path;
        String str = this.mOverflow;
        if (str != null) {
            str.hashCode();
            if (!str.equals("hidden")) {
                if (str.equals("visible") && (path = this.mPath) != null) {
                    path.rewind();
                    return;
                }
                return;
            }
            float width = getWidth();
            float height = getHeight();
            ReactViewBackgroundDrawable reactViewBackgroundDrawable = this.mReactBackgroundDrawable;
            float f3 = 0.0f;
            if (reactViewBackgroundDrawable != null) {
                RectF rectFK = reactViewBackgroundDrawable.k();
                float f4 = rectFK.top;
                if (f4 > 0.0f || rectFK.left > 0.0f || rectFK.bottom > 0.0f || rectFK.right > 0.0f) {
                    f2 = rectFK.left + 0.0f;
                    f = f4 + 0.0f;
                    width -= rectFK.right;
                    height -= rectFK.bottom;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
                float[] borderRadii = getBorderRadii(this.mReactBackgroundDrawable);
                float f5 = borderRadii[0];
                float f6 = borderRadii[1];
                float f7 = borderRadii[2];
                float f8 = borderRadii[3];
                if (f5 > 0.0f || f6 > 0.0f || f7 > 0.0f || f8 > 0.0f) {
                    if (this.mPath == null) {
                        this.mPath = new Path();
                    }
                    this.mPath.rewind();
                    z = true;
                    this.mPath.addRoundRect(new RectF(f2, f, width, height), new float[]{Math.max(f5 - rectFK.left, 0.0f), Math.max(f5 - rectFK.top, 0.0f), Math.max(f6 - rectFK.right, 0.0f), Math.max(f6 - rectFK.top, 0.0f), Math.max(f7 - rectFK.right, 0.0f), Math.max(f7 - rectFK.bottom, 0.0f), Math.max(f8 - rectFK.left, 0.0f), Math.max(f8 - rectFK.bottom, 0.0f)}, Path.Direction.CW);
                    canvas.clipPath(this.mPath);
                    f3 = f2;
                    width = width;
                    height = height;
                } else {
                    z = false;
                    f3 = f2;
                }
            } else {
                f = 0.0f;
                z = false;
            }
            if (z) {
                return;
            }
            canvas.clipRect(new RectF(f3, f, width, height));
        }
    }

    private float[] getBorderRadii(ReactViewBackgroundDrawable reactViewBackgroundDrawable) {
        float f;
        float f2;
        float fM = reactViewBackgroundDrawable.m();
        float fH = reactViewBackgroundDrawable.h(fM, ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_LEFT);
        float fH2 = reactViewBackgroundDrawable.h(fM, ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_RIGHT);
        float fH3 = reactViewBackgroundDrawable.h(fM, ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_LEFT);
        float fH4 = reactViewBackgroundDrawable.h(fM, ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_RIGHT);
        boolean z = this.mLayoutDirection == 1;
        float fG = reactViewBackgroundDrawable.g(ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_START);
        float fG2 = reactViewBackgroundDrawable.g(ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_END);
        float fG3 = reactViewBackgroundDrawable.g(ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_START);
        float fG4 = reactViewBackgroundDrawable.g(ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_END);
        if (poc.d().b(getContext())) {
            if (!j0s.a(fG)) {
                fH = fG;
            }
            if (!j0s.a(fG2)) {
                fH2 = fG2;
            }
            if (!j0s.a(fG3)) {
                fH3 = fG3;
            }
            if (!j0s.a(fG4)) {
                fH4 = fG4;
            }
            f = z ? fH2 : fH;
            if (!z) {
                fH = fH2;
            }
            f2 = z ? fH4 : fH3;
            if (z) {
                fH4 = fH3;
            }
        } else {
            float f3 = z ? fG2 : fG;
            if (!z) {
                fG = fG2;
            }
            float f4 = z ? fG4 : fG3;
            if (!z) {
                fG3 = fG4;
            }
            if (!j0s.a(f3)) {
                fH = f3;
            }
            if (!j0s.a(fG)) {
                fH2 = fG;
            }
            if (!j0s.a(f4)) {
                fH3 = f4;
            }
            if (j0s.a(fG3)) {
                f = fH;
                fH = fH2;
                f2 = fH3;
            } else {
                f = fH;
                fH = fH2;
                f2 = fH3;
                fH4 = fG3;
            }
        }
        return new float[]{f, fH, fH4, f2};
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private ReactViewBackgroundDrawable getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new ReactViewBackgroundDrawable(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mReactBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
            boolean zG = poc.d().g(getContext());
            this.mLayoutDirection = zG ? 1 : 0;
            this.mReactBackgroundDrawable.A(zG ? 1 : 0);
        }
        return this.mReactBackgroundDrawable;
    }

    private int indexOfChildInAllChildren(View view) {
        int i = this.mAllChildrenCount;
        View[] viewArr = (View[]) sk1.c(this.mAllChildren);
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    private void removeFromArray(int i) {
        View[] viewArr = (View[]) sk1.c(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        if (i == i2 - 1) {
            int i3 = i2 - 1;
            this.mAllChildrenCount = i3;
            viewArr[i3] = null;
        } else {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, i + 1, viewArr, i, (i2 - i) - 1);
            int i4 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i4;
            viewArr[i4] = null;
        }
    }

    private void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    private void updateClippingToRect(Rect rect) {
        sk1.c(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            updateSubviewClipStatus(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateSubviewClipStatus(Rect rect, int i, int i2) {
        GLSurfaceView gLSurfaceView = ((View[]) sk1.c(this.mAllChildren))[i];
        Rect rect2 = sHelperRect;
        rect2.set(gLSurfaceView.getLeft(), gLSurfaceView.getTop(), gLSurfaceView.getRight(), gLSurfaceView.getBottom());
        boolean zIntersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = gLSurfaceView.getAnimation();
        boolean z = (animation == null || animation.hasEnded()) ? false : true;
        if (!zIntersects && gLSurfaceView.getParent() != null && !z) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (zIntersects && gLSurfaceView.getParent() == null) {
            super.addViewInLayout(gLSurfaceView, i - i2, sDefaultLayoutParam, true);
            invalidate();
        } else if (!zIntersects) {
            return;
        }
        if (gLSurfaceView instanceof qcj) {
            qcj qcjVar = (qcj) gLSurfaceView;
            if (qcjVar.getRemoveClippedSubviews()) {
                qcjVar.updateClippingRect();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.mDrawingOrderHelper.b(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
        super.addView(view, i, layoutParams);
    }

    public void addViewWithSubviewClippingEnabled(View view, int i) {
        addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException e) {
            cm8.j("ReactNative", "NullPointerException when executing ViewGroup.dispatchDraw method", e);
        } catch (StackOverflowError e2) {
            exk exkVarA = fxk.a(this);
            if (exkVarA != null) {
                exkVarA.handleException(e2);
            } else {
                if (!(getContext() instanceof ReactContext)) {
                    throw e2;
                }
                ((ReactContext) getContext()).handleException(new IllegalViewOperationException("StackOverflowException", this, e2));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e) {
            cm8.j("ReactNative", "NullPointerException when executing dispatchProvideStructure", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((ReactViewBackgroundDrawable) getBackground()).j();
        }
        return 0;
    }

    public Drawable getBorderRadiusMask() {
        float[] fArr;
        ReactViewBackgroundDrawable reactViewBackgroundDrawable = this.mReactBackgroundDrawable;
        if (reactViewBackgroundDrawable == null) {
            fArr = null;
        } else {
            float[] borderRadii = getBorderRadii(reactViewBackgroundDrawable);
            float f = borderRadii[0];
            float f2 = borderRadii[1];
            float f3 = borderRadii[2];
            float f4 = borderRadii[3];
            fArr = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(-1);
        return shapeDrawable;
    }

    public View getChildAtWithSubviewClippingEnabled(int i) {
        return ((View[]) sk1.c(this.mAllChildren))[i];
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return this.mDrawingOrderHelper.a(i, i2);
    }

    @Override // defpackage.qcj
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // defpackage.idj
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public String getOverflow() {
        return this.mOverflow;
    }

    @Override // defpackage.hej
    public PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // defpackage.qcj
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // defpackage.agj
    public int getZIndexMappedChildIndex(int i) {
        return this.mDrawingOrderHelper.d() ? this.mDrawingOrderHelper.a(getChildCount(), i) : i;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PointerEvents pointerEvents;
        m8h m8hVar = this.mOnInterceptTouchEventListener;
        if ((m8hVar != null && m8hVar.a(this, motionEvent)) || (pointerEvents = this.mPointerEvents) == PointerEvents.NONE || pointerEvents == PointerEvents.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        rbf.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        ReactViewBackgroundDrawable reactViewBackgroundDrawable = this.mReactBackgroundDrawable;
        if (reactViewBackgroundDrawable != null) {
            reactViewBackgroundDrawable.A(this.mLayoutDirection);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PointerEvents pointerEvents = this.mPointerEvents;
        return (pointerEvents == PointerEvents.NONE || pointerEvents == PointerEvents.BOX_NONE) ? false : true;
    }

    public void removeAllViewsWithSubviewClippingEnabled() {
        sk1.a(this.mRemoveClippedSubviews);
        sk1.c(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        this.mDrawingOrderHelper.c(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        this.mDrawingOrderHelper.c(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
        super.removeViewAt(i);
    }

    public void removeViewWithSubviewClippingEnabled(View view) {
        sk1.a(this.mRemoveClippedSubviews);
        sk1.c(this.mClippingRect);
        sk1.c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int iIndexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (this.mAllChildren[iIndexOfChildInAllChildren].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < iIndexOfChildInAllChildren; i2++) {
                if (this.mAllChildren[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(iIndexOfChildInAllChildren - i, 1);
        }
        removeFromArray(iIndexOfChildInAllChildren);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals("visible")) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.mBackfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (i == 0 && this.mReactBackgroundDrawable == null) {
            return;
        }
        getOrCreateReactViewBackground().x(i);
    }

    public void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().t(i, f, f2);
    }

    public void setBorderRadius(float f) {
        getOrCreateReactViewBackground().y(f);
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().v(str);
    }

    public void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().w(i, f);
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    @Override // defpackage.mdj
    public void setOnInterceptTouchEventListener(m8h m8hVar) {
        this.mOnInterceptTouchEventListener = m8hVar;
    }

    public void setOpacityIfPossible(float f) {
        if ((getAnimation() instanceof vah) && f != ((vah) getAnimation()).a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("clearAnimation mBackfaceOpacity = ");
            sb.append(this.mBackfaceOpacity);
            sb.append("set opacity = ");
            sb.append(f);
            clearAnimation();
        }
        this.mBackfaceOpacity = f;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z;
        if (z) {
            Rect rect = new Rect();
            this.mClippingRect = rect;
            rcj.a(this, rect);
            int childCount = getChildCount();
            this.mAllChildrenCount = childCount;
            this.mAllChildren = new View[Math.max(12, childCount)];
            this.mChildrenLayoutChangeListener = new b();
            for (int i = 0; i < this.mAllChildrenCount; i++) {
                View childAt = getChildAt(i);
                this.mAllChildren[i] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        sk1.c(this.mClippingRect);
        sk1.c(this.mAllChildren);
        sk1.c(this.mChildrenLayoutChangeListener);
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        updateClippingToRect(this.mClippingRect);
        this.mAllChildren = null;
        this.mClippingRect = null;
        this.mAllChildrenCount = 0;
        this.mChildrenLayoutChangeListener = null;
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        updateBackgroundDrawable(null);
        if (this.mReactBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.qcj
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            sk1.c(this.mClippingRect);
            sk1.c(this.mAllChildren);
            rcj.a(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    @Override // defpackage.agj
    public void updateDrawingOrder() {
        this.mDrawingOrderHelper.e();
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
        invalidate();
    }

    public void addViewWithSubviewClippingEnabled(View view, int i, ViewGroup.LayoutParams layoutParams) {
        sk1.a(this.mRemoveClippedSubviews);
        sk1.c(this.mClippingRect);
        sk1.c(this.mAllChildren);
        addInArray(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.mAllChildren[i3].getParent() == null) {
                i2++;
            }
        }
        updateSubviewClipStatus(this.mClippingRect, i, i2);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    public void setBorderRadius(float f, int i) {
        getOrCreateReactViewBackground().z(f, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubviewClipStatus(View view) {
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        sk1.c(this.mClippingRect);
        sk1.c(this.mAllChildren);
        Rect rect = sHelperRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (this.mClippingRect.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
            int i = 0;
            for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                View view2 = this.mAllChildren[i2];
                if (view2 == view) {
                    updateSubviewClipStatus(this.mClippingRect, i2, i);
                    return;
                } else {
                    if (view2.getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }
}
