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
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentMorningGreetingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView contentText;

    @NonNull
    public final ListTile greetingContent;

    @NonNull
    public final ListTile morningGreetingSwitch;

    @NonNull
    public final RainbowTitleBar toolbar;

    private FragmentMorningGreetingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.contentText = appCompatTextView;
        this.greetingContent = listTile;
        this.morningGreetingSwitch = listTile2;
        this.toolbar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentMorningGreetingBinding bind(@NonNull View view) {
        int i = R.id.content_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.greeting_content;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                i = R.id.morning_greeting_switch;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    i = R.id.toolbar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        return new FragmentMorningGreetingBinding((ConstraintLayout) view, appCompatTextView, listTile, listTile2, rainbowTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMorningGreetingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMorningGreetingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_morning_greeting, viewGroup, false);
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
