package com.garmin.android.apps.connectmobile.userprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@CoordinatorLayout.d(AppBarFlingBehavior.class)
public class GCMAppBarLayout extends AppBarLayout implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f47223b;

    public enum a {
        COLLAPSED,
        EXPANDED,
        IDLE
    }

    public interface b {
    }

    public GCMAppBarLayout(Context context) {
        super(context);
    }

    public final void c(boolean z14) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof CollapsingToolbarLayout) {
                AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) childAt.getLayoutParams();
                if (((layoutParams.getScrollFlags() & 16) > 0) != z14) {
                    if (z14) {
                        layoutParams.setScrollFlags(layoutParams.getScrollFlags() | 16);
                    } else {
                        layoutParams.setScrollFlags(layoutParams.getScrollFlags() & (-17));
                    }
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public a getAppBarState() {
        return this.f47223b;
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if ((getLayoutParams() instanceof CoordinatorLayout.f) && (getParent() instanceof CoordinatorLayout)) {
            addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this);
        } else {
            h.z("GCMAppBarLayout must be a direct child of CoordinatorLayout.");
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i14) {
        if (i14 == 0) {
            this.f47223b = a.EXPANDED;
            return;
        }
        if (Math.abs(i14) >= appBarLayout.getTotalScrollRange()) {
            this.f47223b = a.COLLAPSED;
            return;
        }
        this.f47223b = a.IDLE;
        if (this.f47222a) {
            if (Math.abs(i14) >= ((double) appBarLayout.getTotalScrollRange()) * 0.8d || Math.abs(i14) <= ((double) appBarLayout.getTotalScrollRange()) * 0.2d) {
                c(true);
            } else {
                c(false);
            }
        }
    }

    public void setAppBarStateChangeListener(b bVar) {
    }

    public void setPartialSnapEnabled(boolean z14) {
        this.f47222a = z14;
    }

    public GCMAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
