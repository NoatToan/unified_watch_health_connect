package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;
import l7.f;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ExperimentalBadgeUtils
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    private BadgeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void attachBadgeContentDescription(final BadgeDrawable badgeDrawable, View view2) {
        if (Build.VERSION.SDK_INT < 29 || s0.e(view2) == null) {
            s0.r(view2, new a() { // from class: com.google.android.material.badge.BadgeUtils.3
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(View view3, f fVar) {
                    super.onInitializeAccessibilityNodeInfo(view3, fVar);
                    fVar.r(badgeDrawable.getContentDescription());
                }
            });
        } else {
            s0.r(view2, new a(view2.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.2
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(View view3, f fVar) {
                    super.onInitializeAccessibilityNodeInfo(view3, fVar);
                    fVar.r(badgeDrawable.getContentDescription());
                }
            });
        }
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view2, FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view2, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else if (USE_COMPAT_PARENT) {
            h.s("Trying to reference null customBadgeParent");
        } else {
            view2.getOverlay().add(badgeDrawable);
        }
    }

    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i14 = 0; i14 < parcelableSparseArray.size(); i14++) {
            int iKeyAt = parcelableSparseArray.keyAt(i14);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i14);
            sparseArray.put(iKeyAt, state != null ? BadgeDrawable.createFromSavedState(context, state) : null);
        }
        return sparseArray;
    }

    public static ParcelableSparseArray createParcelableBadgeStates(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            int iKeyAt = sparseArray.keyAt(i14);
            BadgeDrawable badgeDrawableValueAt = sparseArray.valueAt(i14);
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt != null ? badgeDrawableValueAt.getSavedState() : null);
        }
        return parcelableSparseArray;
    }

    private static void detachBadgeContentDescription(View view2) {
        if (Build.VERSION.SDK_INT < 29 || s0.e(view2) == null) {
            s0.r(view2, null);
        } else {
            s0.r(view2, new a(view2.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.4
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(View view3, f fVar) {
                    super.onInitializeAccessibilityNodeInfo(view3, fVar);
                    fVar.r(null);
                }
            });
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, View view2) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT || badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view2.getOverlay().remove(badgeDrawable);
        }
    }

    public static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(BadgeDrawable badgeDrawable, View view2, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view2.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view2, frameLayout);
    }

    public static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.setAdditionalHorizontalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        badgeDrawable.setAdditionalVerticalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void updateBadgeBounds(Rect rect, float f14, float f15, float f16, float f17) {
        rect.set((int) (f14 - f16), (int) (f15 - f17), (int) (f14 + f16), (int) (f15 + f17));
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i14) {
        ActionMenuItemView actionMenuItemView;
        if (badgeDrawable == null || (actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i14)) == null) {
            return;
        }
        removeToolbarOffset(badgeDrawable);
        detachBadgeDrawable(badgeDrawable, actionMenuItemView);
        detachBadgeContentDescription(actionMenuItemView);
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view2) {
        attachBadgeDrawable(badgeDrawable, view2, (FrameLayout) null);
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i14) {
        attachBadgeDrawable(badgeDrawable, toolbar, i14, null);
    }

    public static void attachBadgeDrawable(final BadgeDrawable badgeDrawable, final Toolbar toolbar, final int i14, final FrameLayout frameLayout) {
        toolbar.post(new Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i14);
                if (actionMenuItemView != null) {
                    BadgeUtils.setToolbarOffset(badgeDrawable, toolbar.getResources());
                    BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                    BadgeUtils.attachBadgeContentDescription(badgeDrawable, actionMenuItemView);
                }
            }
        });
    }
}
