package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBodyfatStatisticBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RelativeLayout bfatContainer;

    @NonNull
    public final RelativeLayout bfatInfoLayout;

    @NonNull
    public final TextView bfatNoInfo;

    @NonNull
    public final TypefaceTextView bfatTime;

    @NonNull
    public final RelativeLayout bfatTimeLayout;

    @NonNull
    public final TypefaceTextView bfatValue;

    @NonNull
    public final View dividerLine;

    @NonNull
    public final RelativeLayout weightBtmLeftLayout;

    @NonNull
    public final RelativeLayout weightContainer;

    @NonNull
    public final RelativeLayout weightInfoLayout;

    @NonNull
    public final TypefaceTextView weightTime;

    @NonNull
    public final TextView weightUnit;

    @NonNull
    public final TypefaceTextView weightValue;

    @NonNull
    public final ImageButton weightZoomIn;

    @NonNull
    public final ImageButton weightZoomOut;

    private ActivityBodyfatStatisticBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TypefaceTextView typefaceTextView, @NonNull RelativeLayout relativeLayout3, @NonNull TypefaceTextView typefaceTextView2, @NonNull View view, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull RelativeLayout relativeLayout6, @NonNull TypefaceTextView typefaceTextView3, @NonNull TextView textView2, @NonNull TypefaceTextView typefaceTextView4, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2) {
        this.a = linearLayout;
        this.bfatContainer = relativeLayout;
        this.bfatInfoLayout = relativeLayout2;
        this.bfatNoInfo = textView;
        this.bfatTime = typefaceTextView;
        this.bfatTimeLayout = relativeLayout3;
        this.bfatValue = typefaceTextView2;
        this.dividerLine = view;
        this.weightBtmLeftLayout = relativeLayout4;
        this.weightContainer = relativeLayout5;
        this.weightInfoLayout = relativeLayout6;
        this.weightTime = typefaceTextView3;
        this.weightUnit = textView2;
        this.weightValue = typefaceTextView4;
        this.weightZoomIn = imageButton;
        this.weightZoomOut = imageButton2;
    }

    @NonNull
    public static ActivityBodyfatStatisticBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.bfat_container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.bfat_info_layout;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout2 != null) {
                i = R.id.bfat_no_info;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.bfat_time;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                    if (typefaceTextView != null) {
                        i = R.id.bfat_time_layout;
                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout3 != null) {
                            i = R.id.bfat_value;
                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_line))) != null) {
                                i = R.id.weight_btm_left_layout;
                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout4 != null) {
                                    i = R.id.weight_container;
                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout5 != null) {
                                        i = R.id.weight_info_layout;
                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout6 != null) {
                                            i = R.id.weight_time;
                                            TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                            if (typefaceTextView3 != null) {
                                                i = R.id.weight_unit;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.weight_value;
                                                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                    if (typefaceTextView4 != null) {
                                                        i = R.id.weight_zoom_in;
                                                        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                                                        if (imageButton != null) {
                                                            i = R.id.weight_zoom_out;
                                                            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                                            if (imageButton2 != null) {
                                                                return new ActivityBodyfatStatisticBinding((LinearLayout) view, relativeLayout, relativeLayout2, textView, typefaceTextView, relativeLayout3, typefaceTextView2, viewFindChildViewById, relativeLayout4, relativeLayout5, relativeLayout6, typefaceTextView3, textView2, typefaceTextView4, imageButton, imageButton2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBodyfatStatisticBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBodyfatStatisticBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bodyfat_statistic, viewGroup, false);
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
