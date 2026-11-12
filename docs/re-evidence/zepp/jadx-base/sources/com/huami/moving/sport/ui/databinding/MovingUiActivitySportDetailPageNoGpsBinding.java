package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;
import com.huami.moving.ui.view.LockableNestedScrollView;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiActivitySportDetailPageNoGpsBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LockableNestedScrollView bottomScrollview;

    @NonNull
    public final ConstraintLayout noGps;

    @NonNull
    public final Button sportDetailFinishBtn;

    @NonNull
    public final LinearLayout sportDetailFinishLayout;

    @NonNull
    public final LinearLayout topLayout;

    private MovingUiActivitySportDetailPageNoGpsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LockableNestedScrollView lockableNestedScrollView, @NonNull ConstraintLayout constraintLayout2, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.a = constraintLayout;
        this.bottomScrollview = lockableNestedScrollView;
        this.noGps = constraintLayout2;
        this.sportDetailFinishBtn = button;
        this.sportDetailFinishLayout = linearLayout;
        this.topLayout = linearLayout2;
    }

    @NonNull
    public static MovingUiActivitySportDetailPageNoGpsBinding bind(@NonNull View view) {
        int i = R.id.bottom_scrollview;
        LockableNestedScrollView lockableNestedScrollView = (LockableNestedScrollView) ViewBindings.findChildViewById(view, i);
        if (lockableNestedScrollView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.sport_detail_finish_btn;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R.id.sport_detail_finish_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.top_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        return new MovingUiActivitySportDetailPageNoGpsBinding(constraintLayout, lockableNestedScrollView, constraintLayout, button, linearLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MovingUiActivitySportDetailPageNoGpsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiActivitySportDetailPageNoGpsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_activity_sport_detail_page_no_gps, viewGroup, false);
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
