package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.watch.companion.ui.view.PasswordEditText;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHookWifiBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LinearLayout actionBar;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvConnect;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final PasswordEditText wifiPwdEditBox;

    private ActivityHookWifiBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull PasswordEditText passwordEditText) {
        this.a = constraintLayout;
        this.actionBar = linearLayout;
        this.tvCancel = textView;
        this.tvConnect = textView2;
        this.tvTitle = textView3;
        this.wifiPwdEditBox = passwordEditText;
    }

    @NonNull
    public static ActivityHookWifiBinding bind(@NonNull View view) {
        int i = R.id.action_bar;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.tv_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_connect;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tv_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.wifi_pwd_edit_box;
                        PasswordEditText passwordEditText = (PasswordEditText) ViewBindings.findChildViewById(view, i);
                        if (passwordEditText != null) {
                            return new ActivityHookWifiBinding((ConstraintLayout) view, linearLayout, textView, textView2, textView3, passwordEditText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHookWifiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHookWifiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_hook_wifi, viewGroup, false);
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
