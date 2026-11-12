package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityBloodPressureInfoBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TitlebarBloodPressureBinding containerTitlebar;

    @NonNull
    public final ImageView ivHbp;

    @NonNull
    public final TextView tvHbpItem1;

    @NonNull
    public final TextView tvHbpItem2;

    @NonNull
    public final TextView tvHbpItem3;

    @NonNull
    public final TextView tvHbpTitle;

    @NonNull
    public final TextView tvLbpItem1;

    @NonNull
    public final TextView tvLbpItem2;

    @NonNull
    public final TextView tvLbpItem3;

    @NonNull
    public final TextView tvLbpItem4;

    @NonNull
    public final TextView tvLbpTitle;

    private ActivityBloodPressureInfoBinding(@NonNull LinearLayout linearLayout, @NonNull TitlebarBloodPressureBinding titlebarBloodPressureBinding, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.a = linearLayout;
        this.containerTitlebar = titlebarBloodPressureBinding;
        this.ivHbp = imageView;
        this.tvHbpItem1 = textView;
        this.tvHbpItem2 = textView2;
        this.tvHbpItem3 = textView3;
        this.tvHbpTitle = textView4;
        this.tvLbpItem1 = textView5;
        this.tvLbpItem2 = textView6;
        this.tvLbpItem3 = textView7;
        this.tvLbpItem4 = textView8;
        this.tvLbpTitle = textView9;
    }

    @NonNull
    public static ActivityBloodPressureInfoBinding bind(@NonNull View view) {
        int i = R.id.container_titlebar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            TitlebarBloodPressureBinding titlebarBloodPressureBindingBind = TitlebarBloodPressureBinding.bind(viewFindChildViewById);
            i = R.id.iv_hbp;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_hbp_item1;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_hbp_item2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_hbp_item3;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tv_hbp_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.tv_lbp_item1;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.tv_lbp_item2;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = R.id.tv_lbp_item3;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView7 != null) {
                                            i = R.id.tv_lbp_item4;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView8 != null) {
                                                i = R.id.tv_lbp_title;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView9 != null) {
                                                    return new ActivityBloodPressureInfoBinding((LinearLayout) view, titlebarBloodPressureBindingBind, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBloodPressureInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBloodPressureInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_blood_pressure_info, viewGroup, false);
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
