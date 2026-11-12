package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemGpsSettingBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final AppCompatImageView checkedImg;

    @NonNull
    public final TextView dataIntervalTv;

    @NonNull
    public final TextView gpsCombineTv;

    @NonNull
    public final TextView gpsFrequenciesTv;

    @NonNull
    public final TextView modeTv;

    @NonNull
    public final FrameLayout moreLayout;

    @NonNull
    public final TextView starSearchPreferencesTv;

    @NonNull
    public final View verticalDivider;

    private ItemGpsSettingBinding(@NonNull CardView cardView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull FrameLayout frameLayout, @NonNull TextView textView5, @NonNull View view) {
        this.a = cardView;
        this.checkedImg = appCompatImageView;
        this.dataIntervalTv = textView;
        this.gpsCombineTv = textView2;
        this.gpsFrequenciesTv = textView3;
        this.modeTv = textView4;
        this.moreLayout = frameLayout;
        this.starSearchPreferencesTv = textView5;
        this.verticalDivider = view;
    }

    @NonNull
    public static ItemGpsSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.checked_img;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.data_interval_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.gps_combine_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.gps_frequencies_tv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.mode_tv;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.more_layout;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = R.id.star_search_preferences_tv;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vertical_divider))) != null) {
                                    return new ItemGpsSettingBinding((CardView) view, appCompatImageView, textView, textView2, textView3, textView4, frameLayout, textView5, viewFindChildViewById);
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
    public static ItemGpsSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemGpsSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_gps_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.a;
    }
}
