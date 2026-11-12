package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentPlayBaseBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final AppCompatTextView playEmptyView;

    @NonNull
    public final View statusBar;

    @NonNull
    public final TypefaceTextView title;

    private FragmentPlayBaseBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout container, @NonNull AppCompatTextView playEmptyView, @NonNull View statusBar, @NonNull TypefaceTextView title) {
        this.a = rootView;
        this.container = container;
        this.playEmptyView = playEmptyView;
        this.statusBar = statusBar;
        this.title = title;
    }

    @NonNull
    public static FragmentPlayBaseBinding bind(@NonNull View rootView) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (frameLayout != null) {
            i = R.id.play_empty_view;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.play_empty_view);
            if (appCompatTextView != null) {
                i = R.id.status_bar;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.status_bar);
                if (viewFindChildViewById != null) {
                    i = R.id.title;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (typefaceTextView != null) {
                        return new FragmentPlayBaseBinding((LinearLayout) rootView, frameLayout, appCompatTextView, viewFindChildViewById, typefaceTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPlayBaseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPlayBaseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_play_base, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
