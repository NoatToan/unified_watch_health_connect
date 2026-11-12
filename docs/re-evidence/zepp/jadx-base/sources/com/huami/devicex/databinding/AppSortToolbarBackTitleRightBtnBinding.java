package com.huami.devicex.databinding;

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
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class AppSortToolbarBackTitleRightBtnBinding implements ViewBinding {

    @NonNull
    private final Toolbar a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final AppCompatTextView tvBtn;

    @NonNull
    public final AppCompatTextView tvTitle;

    private AppSortToolbarBackTitleRightBtnBinding(@NonNull Toolbar toolbar, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = toolbar;
        this.btnBack = appCompatImageView;
        this.tvBtn = appCompatTextView;
        this.tvTitle = appCompatTextView2;
    }

    @NonNull
    public static AppSortToolbarBackTitleRightBtnBinding bind(@NonNull View view) {
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.tv_btn;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tv_title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    return new AppSortToolbarBackTitleRightBtnBinding((Toolbar) view, appCompatImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static AppSortToolbarBackTitleRightBtnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static AppSortToolbarBackTitleRightBtnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.app_sort_toolbar_back_title_right_btn, viewGroup, false);
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
