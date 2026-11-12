package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ToolbarDeviceSettingBinding implements ViewBinding {

    @NonNull
    private final Toolbar a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final AppCompatImageView btnEdit;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final AppCompatTextView tvDeviceCustomName;

    @NonNull
    public final TextView tvLeftOption;

    @NonNull
    public final TextView tvRightOption;

    @NonNull
    public final AppCompatTextView tvTitle;

    private ToolbarDeviceSettingBinding(@NonNull Toolbar toolbar, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull Toolbar toolbar2, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = toolbar;
        this.btnBack = appCompatImageView;
        this.btnEdit = appCompatImageView2;
        this.toolbar = toolbar2;
        this.tvDeviceCustomName = appCompatTextView;
        this.tvLeftOption = textView;
        this.tvRightOption = textView2;
        this.tvTitle = appCompatTextView2;
    }

    @NonNull
    public static ToolbarDeviceSettingBinding bind(@NonNull View view) {
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.btn_edit;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                Toolbar toolbar = (Toolbar) view;
                i = R.id.tv_device_custom_name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = R.id.tv_left_option;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_right_option;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_title;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView2 != null) {
                                return new ToolbarDeviceSettingBinding(toolbar, appCompatImageView, appCompatImageView2, toolbar, appCompatTextView, textView, textView2, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ToolbarDeviceSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarDeviceSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.toolbar_device_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public Toolbar getRoot() {
        return this.a;
    }
}
