package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentTextMessageDirectionBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ToolbarDeviceSettingBinding include;

    @NonNull
    public final AppCompatTextView tvContact;

    @NonNull
    public final AppCompatTextView tvQuickReplySms;

    private FragmentTextMessageDirectionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ToolbarDeviceSettingBinding toolbarDeviceSettingBinding, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = constraintLayout;
        this.include = toolbarDeviceSettingBinding;
        this.tvContact = appCompatTextView;
        this.tvQuickReplySms = appCompatTextView2;
    }

    @NonNull
    public static FragmentTextMessageDirectionBinding bind(@NonNull View view) {
        int i = R.id.include;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            ToolbarDeviceSettingBinding toolbarDeviceSettingBindingBind = ToolbarDeviceSettingBinding.bind(viewFindChildViewById);
            int i2 = R.id.tv_contact;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i2);
            if (appCompatTextView != null) {
                i2 = R.id.tv_quick_reply_sms;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i2);
                if (appCompatTextView2 != null) {
                    return new FragmentTextMessageDirectionBinding((ConstraintLayout) view, toolbarDeviceSettingBindingBind, appCompatTextView, appCompatTextView2);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentTextMessageDirectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentTextMessageDirectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_text_message_direction, viewGroup, false);
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
