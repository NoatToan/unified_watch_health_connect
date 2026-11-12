package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;
import com.huami.moving.ui.view.LockableNestedScrollView;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivitySportDetailPageBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LockableNestedScrollView bottomScrollview;

    @NonNull
    public final LinearLayout cardShareEnd;

    @NonNull
    public final ConstraintLayout idGps;

    @NonNull
    public final FrameLayout mapContainer;

    @NonNull
    public final RelativeLayout slidingContainer;

    @NonNull
    public final SlidingUpPanelLayout slidingLayout;

    @NonNull
    public final Button sportDetailFinishBtn;

    @NonNull
    public final LinearLayout sportDetailFinishLayout;

    @NonNull
    public final LinearLayout topLayout;

    private ActivitySportDetailPageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LockableNestedScrollView lockableNestedScrollView, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull SlidingUpPanelLayout slidingUpPanelLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.a = constraintLayout;
        this.bottomScrollview = lockableNestedScrollView;
        this.cardShareEnd = linearLayout;
        this.idGps = constraintLayout2;
        this.mapContainer = frameLayout;
        this.slidingContainer = relativeLayout;
        this.slidingLayout = slidingUpPanelLayout;
        this.sportDetailFinishBtn = button;
        this.sportDetailFinishLayout = linearLayout2;
        this.topLayout = linearLayout3;
    }

    @NonNull
    public static ActivitySportDetailPageBinding bind(@NonNull View view) {
        int i = R.id.bottom_scrollview;
        LockableNestedScrollView lockableNestedScrollView = (LockableNestedScrollView) ViewBindings.findChildViewById(view, i);
        if (lockableNestedScrollView != null) {
            i = R.id.card_share_end;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.map_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.slidingContainer;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.slidingLayout;
                        SlidingUpPanelLayout slidingUpPanelLayout = (SlidingUpPanelLayout) ViewBindings.findChildViewById(view, i);
                        if (slidingUpPanelLayout != null) {
                            i = R.id.sport_detail_finish_btn;
                            Button button = (Button) ViewBindings.findChildViewById(view, i);
                            if (button != null) {
                                i = R.id.sport_detail_finish_layout;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.top_layout;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        return new ActivitySportDetailPageBinding(constraintLayout, lockableNestedScrollView, linearLayout, constraintLayout, frameLayout, relativeLayout, slidingUpPanelLayout, button, linearLayout2, linearLayout3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySportDetailPageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySportDetailPageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sport_detail_page, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
