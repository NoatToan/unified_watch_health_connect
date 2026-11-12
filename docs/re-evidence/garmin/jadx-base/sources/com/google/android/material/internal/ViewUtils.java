package com.google.android.material.internal;

import a7.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.o1;
import androidx.core.view.s0;
import androidx.core.view.z;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    public interface OnApplyWindowInsetsListener {
        m1 onApplyWindowInsets(View view2, m1 m1Var, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(View view2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view2 != null) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static Rect calculateOffsetRectFromBounds(View view2, View view3) {
        int[] iArr = new int[2];
        view3.getLocationOnScreen(iArr);
        int i14 = iArr[0];
        int i15 = iArr[1];
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        int i16 = i14 - iArr2[0];
        int i17 = i15 - iArr2[1];
        return new Rect(i16, i17, view3.getWidth() + i16, view3.getHeight() + i17);
    }

    public static Rect calculateRectFromBounds(View view2, int i14) {
        return new Rect(view2.getLeft(), view2.getTop() + i14, view2.getRight(), view2.getBottom() + i14);
    }

    public static void doOnApplyWindowInsets(View view2, AttributeSet attributeSet, int i14, int i15, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = view2.getContext().obtainStyledAttributes(attributeSet, R.styleable.Insets, i14, i15);
        final boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z15 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z16 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view2, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public m1 onApplyWindowInsets(View view3, m1 m1Var, RelativePadding relativePadding) {
                if (z14) {
                    relativePadding.bottom = m1Var.a() + relativePadding.bottom;
                }
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view3);
                if (z15) {
                    if (zIsLayoutRtl) {
                        relativePadding.end = m1Var.b() + relativePadding.end;
                    } else {
                        relativePadding.start = m1Var.b() + relativePadding.start;
                    }
                }
                if (z16) {
                    if (zIsLayoutRtl) {
                        relativePadding.start = m1Var.c() + relativePadding.start;
                    } else {
                        relativePadding.end = m1Var.c() + relativePadding.end;
                    }
                }
                relativePadding.applyToView(view3);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view3, m1Var, relativePadding) : m1Var;
            }
        });
    }

    public static float dpToPx(Context context, int i14) {
        return TypedValue.applyDimension(1, i14, context.getResources().getDisplayMetrics());
    }

    public static Integer getBackgroundColor(View view2) {
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(view2.getBackground());
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    public static List<View> getChildren(View view2) {
        ArrayList arrayList = new ArrayList();
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                arrayList.add(viewGroup.getChildAt(i14));
            }
        }
        return arrayList;
    }

    public static ViewGroup getContentView(View view2) {
        if (view2 == null) {
            return null;
        }
        View rootView = view2.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view2 || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl getContentViewOverlay(View view2) {
        return getOverlay(getContentView(view2));
    }

    private static InputMethodManager getInputMethodManager(View view2) {
        return (InputMethodManager) b.getSystemService(view2.getContext(), InputMethodManager.class);
    }

    public static ViewOverlayImpl getOverlay(View view2) {
        if (view2 == null) {
            return null;
        }
        return new ViewOverlayApi18(view2);
    }

    public static float getParentAbsoluteElevation(View view2) {
        float elevation = 0.0f;
        for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static void hideKeyboard(View view2, boolean z14) {
        o1 o1VarI;
        if (z14 && (o1VarI = s0.i(view2)) != null) {
            o1VarI.f6545a.b(8);
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view2);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
        }
    }

    public static boolean isLayoutRtl(View view2) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return view2.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i14, PorterDuff.Mode mode) {
        if (i14 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i14 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i14 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i14) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(View view2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view2 != null) {
            removeOnGlobalLayoutListener(view2.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(View view2) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (view2.isAttachedToWindow()) {
            view2.requestApplyInsets();
        } else {
            view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                    view3.removeOnAttachStateChangeListener(this);
                    WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                    view3.requestApplyInsets();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(View view2, boolean z14) {
        view2.requestFocus();
        view2.post(new a0.a(view2, z14, 8));
    }

    public static void setBoundsFromRect(View view2, Rect rect) {
        view2.setLeft(rect.left);
        view2.setTop(rect.top);
        view2.setRight(rect.right);
        view2.setBottom(rect.bottom);
    }

    public static void showKeyboard(View view2, boolean z14) {
        o1 o1VarI;
        if (!z14 || (o1VarI = s0.i(view2)) == null) {
            getInputMethodManager(view2).showSoftInput(view2, 1);
        } else {
            o1VarI.f6545a.h(8);
        }
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestFocusAndShowKeyboard(View view2) {
        requestFocusAndShowKeyboard(view2, true);
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(View view2) {
            int i14 = this.start;
            int i15 = this.top;
            int i16 = this.end;
            int i17 = this.bottom;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.setPaddingRelative(i14, i15, i16, i17);
        }

        public RelativePadding(int i14, int i15, int i16, int i17) {
            this.start = i14;
            this.top = i15;
            this.end = i16;
            this.bottom = i17;
        }
    }

    public static Rect calculateRectFromBounds(View view2) {
        return calculateRectFromBounds(view2, 0);
    }

    public static void showKeyboard(View view2) {
        showKeyboard(view2, true);
    }

    public static void hideKeyboard(View view2) {
        hideKeyboard(view2, true);
    }

    public static void doOnApplyWindowInsets(View view2, AttributeSet attributeSet, int i14, int i15) {
        doOnApplyWindowInsets(view2, attributeSet, i14, i15, null);
    }

    public static void doOnApplyWindowInsets(View view2, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        final RelativePadding relativePadding = new RelativePadding(view2.getPaddingStart(), view2.getPaddingTop(), view2.getPaddingEnd(), view2.getPaddingBottom());
        s0.d.c(view2, new z() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // androidx.core.view.z
            public m1 onApplyWindowInsets(View view3, m1 m1Var) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view3, m1Var, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view2);
    }
}
