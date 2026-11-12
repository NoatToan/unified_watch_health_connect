package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentMessageHookBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView btnBack;

    @NonNull
    public final AppCompatTextView btnSend;

    @NonNull
    public final FrameLayout contentLayout;

    @NonNull
    public final AppCompatEditText etContent;

    @NonNull
    public final Toolbar toolBar;

    @NonNull
    public final AppCompatTextView tvLimit;

    @NonNull
    public final AppCompatTextView tvTitle;

    private FragmentMessageHookBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull FrameLayout frameLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull Toolbar toolbar, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4) {
        this.a = constraintLayout;
        this.btnBack = appCompatTextView;
        this.btnSend = appCompatTextView2;
        this.contentLayout = frameLayout;
        this.etContent = appCompatEditText;
        this.toolBar = toolbar;
        this.tvLimit = appCompatTextView3;
        this.tvTitle = appCompatTextView4;
    }

    @NonNull
    public static FragmentMessageHookBinding bind(@NonNull View view) {
        int i = R.id.btn_back;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.btn_send;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R.id.content_layout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.et_content;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                    if (appCompatEditText != null) {
                        i = R.id.tool_bar;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                        if (toolbar != null) {
                            i = R.id.tv_limit;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = R.id.tv_title;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    return new FragmentMessageHookBinding((ConstraintLayout) view, appCompatTextView, appCompatTextView2, frameLayout, appCompatEditText, toolbar, appCompatTextView3, appCompatTextView4);
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
    public static FragmentMessageHookBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMessageHookBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_message_hook, viewGroup, false);
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
