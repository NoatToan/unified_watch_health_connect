package com.huami.phone_call.sms.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.phone_call.sms.R;

/* JADX INFO: loaded from: classes12.dex */
public final class ToolbarBackTitleBinding implements ViewBinding {

    @NonNull
    private final Toolbar a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final AppCompatTextView tvTitle;

    private ToolbarBackTitleBinding(@NonNull Toolbar toolbar, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.a = toolbar;
        this.btnBack = appCompatImageView;
        this.tvTitle = appCompatTextView;
    }

    @NonNull
    public static ToolbarBackTitleBinding bind(@NonNull View view) {
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.tv_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new ToolbarBackTitleBinding((Toolbar) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ToolbarBackTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarBackTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.toolbar_back_title, viewGroup, false);
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
