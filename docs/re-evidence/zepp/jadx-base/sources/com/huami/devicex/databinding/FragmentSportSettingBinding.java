package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentSportSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CardView agpsContainer;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final TextView currGpsModeTv;

    @NonNull
    public final View divider;

    @NonNull
    public final AppCompatImageView gpsModeImg;

    @NonNull
    public final ConstraintLayout gpsSettingContainer;

    @NonNull
    public final View maskView;

    @NonNull
    public final ListTile remindSwitchLt;

    @NonNull
    public final ListTile remindTimeLt;

    @NonNull
    public final ConstraintLayout sportRecognizeContainer;

    private FragmentSportSettingBinding(@NonNull LinearLayout linearLayout, @NonNull CardView cardView, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout, @NonNull View view2, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ConstraintLayout constraintLayout2) {
        this.a = linearLayout;
        this.agpsContainer = cardView;
        this.container = frameLayout;
        this.currGpsModeTv = textView;
        this.divider = view;
        this.gpsModeImg = appCompatImageView;
        this.gpsSettingContainer = constraintLayout;
        this.maskView = view2;
        this.remindSwitchLt = listTile;
        this.remindTimeLt = listTile2;
        this.sportRecognizeContainer = constraintLayout2;
    }

    @NonNull
    public static FragmentSportSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.agps_container;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.curr_gps_mode_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
                    i = R.id.gps_mode_img;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = R.id.gps_setting_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                            i = R.id.remind_switch_lt;
                            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile != null) {
                                i = R.id.remind_time_lt;
                                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile2 != null) {
                                    i = R.id.sport_recognize_container;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        return new FragmentSportSettingBinding((LinearLayout) view, cardView, frameLayout, textView, viewFindChildViewById, appCompatImageView, constraintLayout, viewFindChildViewById2, listTile, listTile2, constraintLayout2);
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
    public static FragmentSportSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSportSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sport_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
