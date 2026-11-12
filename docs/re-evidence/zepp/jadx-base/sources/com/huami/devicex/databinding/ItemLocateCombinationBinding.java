package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.LevelView;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemLocateCombinationBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LevelView accuracyLevelView;

    @NonNull
    public final TextView accuracyTv;

    @NonNull
    public final LevelView consumptionLevelView;

    @NonNull
    public final TextView consumptionTv;

    @NonNull
    public final AppCompatImageView selectImg;

    @NonNull
    public final TextView titleTv;

    private ItemLocateCombinationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LevelView levelView, @NonNull TextView textView, @NonNull LevelView levelView2, @NonNull TextView textView2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.accuracyLevelView = levelView;
        this.accuracyTv = textView;
        this.consumptionLevelView = levelView2;
        this.consumptionTv = textView2;
        this.selectImg = appCompatImageView;
        this.titleTv = textView3;
    }

    @NonNull
    public static ItemLocateCombinationBinding bind(@NonNull View view) {
        int i = R.id.accuracy_level_view;
        LevelView levelView = (LevelView) ViewBindings.findChildViewById(view, i);
        if (levelView != null) {
            i = R.id.accuracy_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.consumption_level_view;
                LevelView levelView2 = (LevelView) ViewBindings.findChildViewById(view, i);
                if (levelView2 != null) {
                    i = R.id.consumption_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.select_img;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = R.id.title_tv;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new ItemLocateCombinationBinding((ConstraintLayout) view, levelView, textView, levelView2, textView2, appCompatImageView, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemLocateCombinationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemLocateCombinationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_locate_combination, viewGroup, false);
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
