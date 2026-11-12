package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.material.R;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.SheetCallback;
import i.l;
import java.util.WeakHashMap;
import l7.f;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
abstract class SheetDialog<C extends SheetCallback> extends l {
    private static final int COORDINATOR_LAYOUT_ID = R.id.coordinator;
    private static final int TOUCH_OUTSIDE_ID = R.id.touch_outside;
    private MaterialBackOrchestrator backOrchestrator;
    private Sheet<C> behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    boolean dismissWithAnimation;
    private FrameLayout sheet;

    public SheetDialog(Context context, int i14, int i15, int i16) {
        super(context, getThemeResId(context, i14, i15, i16));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        supportRequestWindowFeature(1);
    }

    private void ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), getLayoutResId(), null);
            this.container = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(getDialogId());
            this.sheet = frameLayout2;
            Sheet<C> behaviorFromSheet = getBehaviorFromSheet(frameLayout2);
            this.behavior = behaviorFromSheet;
            addSheetCancelOnHideCallback(behaviorFromSheet);
            this.backOrchestrator = new MaterialBackOrchestrator(this.behavior, this.sheet);
        }
    }

    private FrameLayout getContainer() {
        if (this.container == null) {
            ensureContainerAndBehavior();
        }
        return this.container;
    }

    private FrameLayout getSheet() {
        if (this.sheet == null) {
            ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    private static int getThemeResId(Context context, int i14, int i15, int i16) {
        if (i14 != 0) {
            return i14;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i15, typedValue, true) ? typedValue.resourceId : i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapInSheet$0(View view2) {
        if (this.cancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.sheet) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return;
        }
        int i14 = ((CoordinatorLayout.f) this.sheet.getLayoutParams()).f6352c;
        FrameLayout frameLayout2 = this.sheet;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        window.setWindowAnimations(Gravity.getAbsoluteGravity(i14, frameLayout2.getLayoutDirection()) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private void updateListeningForBackCallbacks() {
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.cancelable) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private View wrapInSheet(int i14, View view2, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getContainer().findViewById(COORDINATOR_LAYOUT_ID);
        if (i14 != 0 && view2 == null) {
            view2 = getLayoutInflater().inflate(i14, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout sheet = getSheet();
        sheet.removeAllViews();
        if (layoutParams == null) {
            sheet.addView(view2);
        } else {
            sheet.addView(view2, layoutParams);
        }
        coordinatorLayout.findViewById(TOUCH_OUTSIDE_ID).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f53241a.lambda$wrapInSheet$0(view3);
            }
        });
        s0.r(getSheet(), new androidx.core.view.a() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view3, f fVar) {
                super.onInitializeAccessibilityNodeInfo(view3, fVar);
                if (!SheetDialog.this.cancelable) {
                    fVar.f110563a.setDismissable(false);
                } else {
                    fVar.a(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    fVar.f110563a.setDismissable(true);
                }
            }

            @Override // androidx.core.view.a
            public boolean performAccessibilityAction(View view3, int i15, Bundle bundle) {
                if (i15 == 1048576) {
                    SheetDialog sheetDialog = SheetDialog.this;
                    if (sheetDialog.cancelable) {
                        sheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view3, i15, bundle);
            }
        });
        return this.container;
    }

    public abstract void addSheetCancelOnHideCallback(Sheet<C> sheet);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Sheet<C> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    public Sheet<C> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public abstract Sheet<C> getBehaviorFromSheet(FrameLayout frameLayout);

    public abstract int getDialogId();

    public abstract int getLayoutResId();

    public abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        updateListeningForBackCallbacks();
    }

    @Override // i.l, b.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // b.i, android.app.Dialog
    public void onStart() {
        super.onStart();
        Sheet<C> sheet = this.behavior;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.behavior.setState(getStateOnStart());
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z14) {
        super.setCancelable(z14);
        if (this.cancelable != z14) {
            this.cancelable = z14;
        }
        if (getWindow() != null) {
            updateListeningForBackCallbacks();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z14) {
        super.setCanceledOnTouchOutside(z14);
        if (z14 && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z14;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // i.l, b.i, android.app.Dialog
    public void setContentView(View view2) {
        super.setContentView(wrapInSheet(0, view2, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z14) {
        this.dismissWithAnimation = z14;
    }

    public void setSheetEdge(int i14) {
        FrameLayout frameLayout = this.sheet;
        if (frameLayout == null) {
            h.z("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
            return;
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (frameLayout.isLaidOut()) {
            h.z("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.sheet.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            ((CoordinatorLayout.f) layoutParams).f6352c = i14;
            maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        }
    }

    @Override // i.l, b.i, android.app.Dialog
    public void setContentView(int i14) {
        super.setContentView(wrapInSheet(i14, null, null));
    }

    @Override // i.l, b.i, android.app.Dialog
    public void setContentView(View view2, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInSheet(0, view2, layoutParams));
    }
}
