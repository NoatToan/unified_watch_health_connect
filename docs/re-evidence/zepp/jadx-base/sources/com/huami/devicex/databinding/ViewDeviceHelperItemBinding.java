package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewDeviceHelperItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView deviceHelperTips;

    @NonNull
    public final TextView deviceHelperTitle;

    @NonNull
    public final View divider;

    @NonNull
    public final View fillView;

    private ViewDeviceHelperItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull View view2) {
        this.a = relativeLayout;
        this.deviceHelperTips = textView;
        this.deviceHelperTitle = textView2;
        this.divider = view;
        this.fillView = view2;
    }

    @NonNull
    public static ViewDeviceHelperItemBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.device_helper_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.device_helper_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.fill_view))) != null) {
                return new ViewDeviceHelperItemBinding((RelativeLayout) view, textView, textView2, viewFindChildViewById, viewFindChildViewById2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewDeviceHelperItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewDeviceHelperItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_device_helper_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
