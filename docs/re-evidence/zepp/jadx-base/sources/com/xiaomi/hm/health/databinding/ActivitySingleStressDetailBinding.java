package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.colorsbar.ColorsBar;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivitySingleStressDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ColorsBar colorsBar;

    @NonNull
    public final TypefaceTextView dataRangeTitle;

    @NonNull
    public final TypefaceTextView dataSource;

    @NonNull
    public final LinearLayout head;

    @NonNull
    public final TypefaceTextView levelDesc;

    @NonNull
    public final TypefaceTextView levelStr;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    @NonNull
    public final TypefaceTextView tvLevelMedium;

    @NonNull
    public final TypefaceTextView tvLevelNormal;

    @NonNull
    public final TypefaceTextView tvLevelRelax;

    @NonNull
    public final TypefaceTextView tvStressLevelHigh;

    @NonNull
    public final TypefaceTextView valueTv;

    private ActivitySingleStressDetailBinding(@NonNull LinearLayout rootView, @NonNull ColorsBar colorsBar, @NonNull TypefaceTextView dataRangeTitle, @NonNull TypefaceTextView dataSource, @NonNull LinearLayout head, @NonNull TypefaceTextView levelDesc, @NonNull TypefaceTextView levelStr, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull TypefaceTextView tvLevelMedium, @NonNull TypefaceTextView tvLevelNormal, @NonNull TypefaceTextView tvLevelRelax, @NonNull TypefaceTextView tvStressLevelHigh, @NonNull TypefaceTextView valueTv) {
        this.a = rootView;
        this.colorsBar = colorsBar;
        this.dataRangeTitle = dataRangeTitle;
        this.dataSource = dataSource;
        this.head = head;
        this.levelDesc = levelDesc;
        this.levelStr = levelStr;
        this.rainbowTitleBar = rainbowTitleBar;
        this.tvLevelMedium = tvLevelMedium;
        this.tvLevelNormal = tvLevelNormal;
        this.tvLevelRelax = tvLevelRelax;
        this.tvStressLevelHigh = tvStressLevelHigh;
        this.valueTv = valueTv;
    }

    @NonNull
    public static ActivitySingleStressDetailBinding bind(@NonNull View rootView) {
        int i = R.id.colors_bar;
        ColorsBar colorsBar = (ColorsBar) ViewBindings.findChildViewById(rootView, R.id.colors_bar);
        if (colorsBar != null) {
            i = R.id.data_range_title;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.data_range_title);
            if (typefaceTextView != null) {
                i = R.id.data_source;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.data_source);
                if (typefaceTextView2 != null) {
                    i = R.id.head;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.head);
                    if (linearLayout != null) {
                        i = R.id.level_desc;
                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.level_desc);
                        if (typefaceTextView3 != null) {
                            i = R.id.level_str;
                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.level_str);
                            if (typefaceTextView4 != null) {
                                i = R.id.rainbow_title_bar;
                                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, R.id.rainbow_title_bar);
                                if (rainbowTitleBar != null) {
                                    i = R.id.tv_level_medium;
                                    TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_level_medium);
                                    if (typefaceTextView5 != null) {
                                        i = R.id.tv_level_normal;
                                        TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_level_normal);
                                        if (typefaceTextView6 != null) {
                                            i = R.id.tv_level_relax;
                                            TypefaceTextView typefaceTextView7 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_level_relax);
                                            if (typefaceTextView7 != null) {
                                                i = R.id.tv_stress_level_high;
                                                TypefaceTextView typefaceTextView8 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stress_level_high);
                                                if (typefaceTextView8 != null) {
                                                    i = R.id.value_tv;
                                                    TypefaceTextView typefaceTextView9 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.value_tv);
                                                    if (typefaceTextView9 != null) {
                                                        return new ActivitySingleStressDetailBinding((LinearLayout) rootView, colorsBar, typefaceTextView, typefaceTextView2, linearLayout, typefaceTextView3, typefaceTextView4, rainbowTitleBar, typefaceTextView5, typefaceTextView6, typefaceTextView7, typefaceTextView8, typefaceTextView9);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySingleStressDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySingleStressDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_single_stress_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
