package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutToolbarBinding implements ViewBinding {

    @NonNull
    private final Toolbar a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final TextView confirmBtn;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final TextView toolbarTitle;

    private LayoutToolbarBinding(@NonNull Toolbar toolbar, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull Toolbar toolbar2, @NonNull TextView textView2) {
        this.a = toolbar;
        this.btnBack = appCompatImageView;
        this.confirmBtn = textView;
        this.toolbar = toolbar2;
        this.toolbarTitle = textView2;
    }

    @NonNull
    public static LayoutToolbarBinding bind(@NonNull View view) {
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.confirm_btn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                Toolbar toolbar = (Toolbar) view;
                i = R.id.toolbar_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new LayoutToolbarBinding(toolbar, appCompatImageView, textView, toolbar, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_toolbar, viewGroup, false);
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
