package com.huami.phone_call.sms.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.phone_call.sms.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPhoneCallReplyMsgEditBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout contentLayout;

    @NonNull
    public final FrameLayout deviceStatusContent;

    @NonNull
    public final AppCompatEditText etContent;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final AppCompatTextView tvLimit;

    private FragmentPhoneCallReplyMsgEditBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull AppCompatEditText appCompatEditText, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.contentLayout = frameLayout;
        this.deviceStatusContent = frameLayout2;
        this.etContent = appCompatEditText;
        this.titleBar = rainbowTitleBar;
        this.tvLimit = appCompatTextView;
    }

    @NonNull
    public static FragmentPhoneCallReplyMsgEditBinding bind(@NonNull View view) {
        int i = R.id.content_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.device_status_content;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = R.id.et_content;
                AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                if (appCompatEditText != null) {
                    i = R.id.title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        i = R.id.tv_limit;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            return new FragmentPhoneCallReplyMsgEditBinding((ConstraintLayout) view, frameLayout, frameLayout2, appCompatEditText, rainbowTitleBar, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPhoneCallReplyMsgEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPhoneCallReplyMsgEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_phone_call_reply_msg_edit, viewGroup, false);
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
