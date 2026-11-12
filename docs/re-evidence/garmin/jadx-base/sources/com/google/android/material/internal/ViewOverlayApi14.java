package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
class ViewOverlayApi14 implements ViewOverlayImpl {
    protected OverlayViewGroup overlayViewGroup;

    public ViewOverlayApi14(Context context, ViewGroup viewGroup, View view2) {
        this.overlayViewGroup = new OverlayViewGroup(context, viewGroup, view2, this);
    }

    public static ViewOverlayApi14 createFrom(View view2) {
        ViewGroup contentView = ViewUtils.getContentView(view2);
        if (contentView == null) {
            return null;
        }
        int childCount = contentView.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = contentView.getChildAt(i14);
            if (childAt instanceof OverlayViewGroup) {
                return ((OverlayViewGroup) childAt).viewOverlay;
            }
        }
        return new ViewGroupOverlayApi14(contentView.getContext(), contentView, view2);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(Drawable drawable) {
        this.overlayViewGroup.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(Drawable drawable) {
        this.overlayViewGroup.remove(drawable);
    }

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    public static class OverlayViewGroup extends ViewGroup {
        static Method invalidateChildInParentFastMethod;
        private boolean disposed;
        ArrayList<Drawable> drawables;
        ViewGroup hostView;
        View requestingView;
        ViewOverlayApi14 viewOverlay;

        static {
            try {
                Class cls = Integer.TYPE;
                invalidateChildInParentFastMethod = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public OverlayViewGroup(Context context, ViewGroup viewGroup, View view2, ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.drawables = null;
            this.hostView = viewGroup;
            this.requestingView = view2;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.viewOverlay = viewOverlayApi14;
        }

        private void assertNotDisposed() {
            if (this.disposed) {
                h.z("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void disposeIfEmpty() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.drawables;
                if (arrayList == null || arrayList.size() == 0) {
                    this.disposed = true;
                    this.hostView.removeView(this);
                }
            }
        }

        private void getOffset(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.hostView.getLocationOnScreen(iArr2);
            this.requestingView.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void add(View view2) {
            assertNotDisposed();
            if (view2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                if (viewGroup != this.hostView && viewGroup.getParent() != null) {
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    if (viewGroup.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        this.hostView.getLocationOnScreen(iArr2);
                        view2.offsetLeftAndRight(iArr[0] - iArr2[0]);
                        view2.offsetTopAndBottom(iArr[1] - iArr2[1]);
                    }
                }
                viewGroup.removeView(view2);
                if (view2.getParent() != null) {
                    viewGroup.removeView(view2);
                }
            }
            super.addView(view2);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.hostView.getLocationOnScreen(iArr);
            this.requestingView.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.requestingView.getWidth(), this.requestingView.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.drawables;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                this.drawables.get(i14).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.hostView == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.hostView == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            getOffset(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        public ViewParent invalidateChildInParentFast(int i14, int i15, Rect rect) {
            if (this.hostView == null || invalidateChildInParentFastMethod == null) {
                return null;
            }
            try {
                getOffset(new int[2]);
                invalidateChildInParentFastMethod.invoke(this.hostView, Integer.valueOf(i14), Integer.valueOf(i15), rect);
                return null;
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
                return null;
            } catch (InvocationTargetException e14) {
                e14.printStackTrace();
                return null;
            }
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        }

        public void remove(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.drawables;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                disposeIfEmpty();
            }
        }

        @Override // android.view.View
        public boolean verifyDrawable(Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.drawables;
            return arrayList != null && arrayList.contains(drawable);
        }

        public void remove(View view2) {
            super.removeView(view2);
            disposeIfEmpty();
        }

        public void add(Drawable drawable) {
            assertNotDisposed();
            if (this.drawables == null) {
                this.drawables = new ArrayList<>();
            }
            if (this.drawables.contains(drawable)) {
                return;
            }
            this.drawables.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }
    }
}
