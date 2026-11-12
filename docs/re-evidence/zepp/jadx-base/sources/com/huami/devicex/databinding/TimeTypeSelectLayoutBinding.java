package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class TimeTypeSelectLayoutBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CheckBox checkboxTimeDate;

    @NonNull
    public final CheckBox checkboxTimeOnly;

    @NonNull
    public final ImageView ivTimeDate;

    @NonNull
    public final LinearLayout llTimeDate;

    @NonNull
    public final LinearLayout llTimeOnly;

    private TimeTypeSelectLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.checkboxTimeDate = checkBox;
        this.checkboxTimeOnly = checkBox2;
        this.ivTimeDate = imageView;
        this.llTimeDate = linearLayout2;
        this.llTimeOnly = linearLayout3;
    }

    @NonNull
    public static TimeTypeSelectLayoutBinding bind(@NonNull View view) {
        int i = R.id.checkbox_time_date;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = R.id.checkbox_time_only;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i);
            if (checkBox2 != null) {
                i = R.id.iv_time_date;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ll_time_date;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.ll_time_only;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            return new TimeTypeSelectLayoutBinding((LinearLayout) view, checkBox, checkBox2, imageView, linearLayout, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static TimeTypeSelectLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TimeTypeSelectLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.time_type_select_layout, viewGroup, false);
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
