package com.google.android.material.snackbar;

import a61.d0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR;
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS;
    private final AccessibilityManager accessibilityManager;
    private BaseTransientBottomBar.BaseCallback<Snackbar> callback;
    private boolean hasAction;

    static {
        int i14 = R.attr.snackbarButtonStyle;
        SNACKBAR_BUTTON_STYLE_ATTR = new int[]{i14};
        SNACKBAR_CONTENT_STYLE_ATTRS = new int[]{i14, R.attr.snackbarTextViewStyle};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view2, ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view2, contentViewCallback);
        this.accessibilityManager = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup findSuitableParent(View view2) {
        ViewGroup viewGroup = null;
        while (!(view2 instanceof CoordinatorLayout)) {
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    return (ViewGroup) view2;
                }
                viewGroup = (ViewGroup) view2;
            }
            if (view2 != null) {
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            if (view2 == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view2;
    }

    private Button getActionView() {
        return getContentLayout().getActionView();
    }

    private SnackbarContentLayout getContentLayout() {
        return (SnackbarContentLayout) this.f53248view.getChildAt(0);
    }

    private TextView getMessageView() {
        return getContentLayout().getMessageView();
    }

    @Deprecated
    public static boolean hasSnackbarButtonStyleAttr(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_BUTTON_STYLE_ATTR);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    private static boolean hasSnackbarContentStyleAttrs(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_CONTENT_STYLE_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAction$0(View.OnClickListener onClickListener, View view2) {
        onClickListener.onClick(view2);
        dispatchDismiss(1);
    }

    public static Snackbar make(View view2, int i14, int i15) {
        return make(view2, view2.getResources().getText(i14), i15);
    }

    private static Snackbar makeInternal(Context context, View view2, CharSequence charSequence, int i14) {
        ViewGroup viewGroupFindSuitableParent = findSuitableParent(view2);
        if (viewGroupFindSuitableParent == null) {
            h.s("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        if (context == null) {
            context = viewGroupFindSuitableParent.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(hasSnackbarContentStyleAttrs(context) ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroupFindSuitableParent, false);
        Snackbar snackbar = new Snackbar(context, viewGroupFindSuitableParent, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i14);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int duration = super.getDuration();
        if (duration != -2) {
            int i14 = Build.VERSION.SDK_INT;
            boolean z14 = this.hasAction;
            if (i14 >= 29) {
                return this.accessibilityManager.getRecommendedTimeoutMillis(duration, (z14 ? 4 : 0) | 3);
            }
            if (!z14 || !this.accessibilityManager.isTouchExplorationEnabled()) {
                return duration;
            }
        }
        return -2;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    @CanIgnoreReturnValue
    public Snackbar setAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.hasAction = false;
            return this;
        }
        this.hasAction = true;
        actionView.setVisibility(0);
        actionView.setText(charSequence);
        actionView.setOnClickListener(new d0(25, this, onClickListener));
        return this;
    }

    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        getActionView().setTextColor(colorStateList);
        return this;
    }

    @CanIgnoreReturnValue
    public Snackbar setBackgroundTint(int i14) {
        return setBackgroundTintList(ColorStateList.valueOf(i14));
    }

    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintList(ColorStateList colorStateList) {
        this.f53248view.setBackgroundTintList(colorStateList);
        return this;
    }

    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f53248view.setBackgroundTintMode(mode);
        return this;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public Snackbar setCallback(Callback callback) {
        BaseTransientBottomBar.BaseCallback<Snackbar> baseCallback = this.callback;
        if (baseCallback != null) {
            removeCallback(baseCallback);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.callback = callback;
        return this;
    }

    @CanIgnoreReturnValue
    public Snackbar setMaxInlineActionWidth(int i14) {
        getContentLayout().setMaxInlineActionWidth(i14);
        return this;
    }

    @CanIgnoreReturnValue
    public Snackbar setText(int i14) {
        return setText(getContext().getText(i14));
    }

    @CanIgnoreReturnValue
    public Snackbar setTextColor(ColorStateList colorStateList) {
        getMessageView().setTextColor(colorStateList);
        return this;
    }

    @CanIgnoreReturnValue
    public Snackbar setTextMaxLines(int i14) {
        getMessageView().setMaxLines(i14);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i14, int i15) {
            super.onMeasure(i14, i15);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(Snackbar snackbar, int i14) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(Snackbar snackbar) {
        }
    }

    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(int i14) {
        getActionView().setTextColor(i14);
        return this;
    }

    @CanIgnoreReturnValue
    public Snackbar setTextColor(int i14) {
        getMessageView().setTextColor(i14);
        return this;
    }

    public static Snackbar make(Context context, View view2, CharSequence charSequence, int i14) {
        return makeInternal(context, view2, charSequence, i14);
    }

    @CanIgnoreReturnValue
    public Snackbar setText(CharSequence charSequence) {
        getMessageView().setText(charSequence);
        return this;
    }

    public static Snackbar make(View view2, CharSequence charSequence, int i14) {
        return makeInternal(null, view2, charSequence, i14);
    }

    @CanIgnoreReturnValue
    public Snackbar setAction(int i14, View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i14), onClickListener);
    }
}
