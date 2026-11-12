package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a;
import androidx.core.view.g1;
import androidx.core.view.k1;
import androidx.core.view.m1;
import androidx.core.view.o1;
import androidx.core.view.s0;
import androidx.core.view.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.shape.MaterialShapeDrawable;
import i.l;
import java.util.WeakHashMap;
import l7.f;

/* JADX INFO: loaded from: classes14.dex */
public class BottomSheetDialog extends l {
    private MaterialBackOrchestrator backOrchestrator;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private EdgeToEdgeCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    public static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {
        private final m1 insetsCompat;
        private final Boolean lightBottomSheet;
        private boolean lightStatusBar;
        private Window window;

        private EdgeToEdgeCallback(View view2, m1 m1Var) {
            ColorStateList backgroundTintList;
            this.insetsCompat = m1Var;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.from(view2).getMaterialShapeDrawable();
            if (materialShapeDrawable != null) {
                backgroundTintList = materialShapeDrawable.getFillColor();
            } else {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                backgroundTintList = view2.getBackgroundTintList();
            }
            if (backgroundTintList != null) {
                this.lightBottomSheet = Boolean.valueOf(MaterialColors.isColorLight(backgroundTintList.getDefaultColor()));
                return;
            }
            Integer backgroundColor = ViewUtils.getBackgroundColor(view2);
            if (backgroundColor != null) {
                this.lightBottomSheet = Boolean.valueOf(MaterialColors.isColorLight(backgroundColor.intValue()));
            } else {
                this.lightBottomSheet = null;
            }
        }

        private void setPaddingForPosition(View view2) {
            if (view2.getTop() < this.insetsCompat.d()) {
                Window window = this.window;
                if (window != null) {
                    Boolean bool = this.lightBottomSheet;
                    EdgeToEdgeUtils.setLightStatusBar(window, bool == null ? this.lightStatusBar : bool.booleanValue());
                }
                view2.setPadding(view2.getPaddingLeft(), this.insetsCompat.d() - view2.getTop(), view2.getPaddingRight(), view2.getPaddingBottom());
                return;
            }
            if (view2.getTop() != 0) {
                Window window2 = this.window;
                if (window2 != null) {
                    EdgeToEdgeUtils.setLightStatusBar(window2, this.lightStatusBar);
                }
                view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), view2.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onLayout(View view2) {
            setPaddingForPosition(view2);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view2, float f14) {
            setPaddingForPosition(view2);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view2, int i14) {
            setPaddingForPosition(view2);
        }

        public void setWindow(Window window) {
            if (this.window == window) {
                return;
            }
            this.window = window;
            if (window != null) {
                this.lightStatusBar = new o1(window, window.getDecorView()).f6545a.d();
            }
        }
    }

    public BottomSheetDialog(Context context, int i14) {
        super(context, getThemeResId(context, i14));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view2, float f14) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view2, int i15) {
                if (i15 == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout2);
            this.behavior = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
            this.backOrchestrator = new MaterialBackOrchestrator(this.behavior, this.bottomSheet);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i14) {
        if (i14 != 0) {
            return i14;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
    }

    @Deprecated
    public static void setLightStatusBar(View view2, boolean z14) {
        int systemUiVisibility = view2.getSystemUiVisibility();
        view2.setSystemUiVisibility(z14 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
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

    private View wrapInBottomSheet(int i14, View view2, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
        if (i14 != 0 && view2 == null) {
            view2 = getLayoutInflater().inflate(i14, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            FrameLayout frameLayout = this.bottomSheet;
            z zVar = new z() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                @Override // androidx.core.view.z
                public m1 onApplyWindowInsets(View view3, m1 m1Var) {
                    if (BottomSheetDialog.this.edgeToEdgeCallback != null) {
                        BottomSheetDialog.this.behavior.removeBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
                    }
                    if (m1Var != null) {
                        BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                        bottomSheetDialog.edgeToEdgeCallback = new EdgeToEdgeCallback(bottomSheetDialog.bottomSheet, m1Var);
                        BottomSheetDialog.this.edgeToEdgeCallback.setWindow(BottomSheetDialog.this.getWindow());
                        BottomSheetDialog.this.behavior.addBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
                    }
                    return m1Var;
                }
            };
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(frameLayout, zVar);
        }
        this.bottomSheet.removeAllViews();
        FrameLayout frameLayout2 = this.bottomSheet;
        if (layoutParams == null) {
            frameLayout2.addView(view2);
        } else {
            frameLayout2.addView(view2, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.cancelable && bottomSheetDialog.isShowing() && BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                    BottomSheetDialog.this.cancel();
                }
            }
        });
        s0.r(this.bottomSheet, new a() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view3, f fVar) {
                super.onInitializeAccessibilityNodeInfo(view3, fVar);
                if (!BottomSheetDialog.this.cancelable) {
                    fVar.f110563a.setDismissable(false);
                } else {
                    fVar.a(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    fVar.f110563a.setDismissable(true);
                }
            }

            @Override // androidx.core.view.a
            public boolean performAccessibilityAction(View view3, int i15, Bundle bundle) {
                if (i15 == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.cancelable) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view3, i15, bundle);
            }
        });
        this.bottomSheet.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view3, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z14 = this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z14);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z14);
            }
            k1.a(window, !z14);
            EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.setWindow(window);
            }
        }
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
        EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.setWindow(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // b.i, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.behavior.setState(4);
    }

    public void removeDefaultCallback() {
        this.behavior.removeBottomSheetCallback(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z14) {
        super.setCancelable(z14);
        if (this.cancelable != z14) {
            this.cancelable = z14;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z14);
            }
            if (getWindow() != null) {
                updateListeningForBackCallbacks();
            }
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
        super.setContentView(wrapInBottomSheet(0, view2, null));
    }

    public void setDismissWithAnimation(boolean z14) {
        this.dismissWithAnimation = z14;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // i.l, b.i, android.app.Dialog
    public void setContentView(int i14) {
        super.setContentView(wrapInBottomSheet(i14, null, null));
    }

    @Override // i.l, b.i, android.app.Dialog
    public void setContentView(View view2, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view2, layoutParams));
    }

    public BottomSheetDialog(Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(Context context, boolean z14, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z14, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view2, float f14) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view2, int i15) {
                if (i15 == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
        this.cancelable = z14;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }
}
