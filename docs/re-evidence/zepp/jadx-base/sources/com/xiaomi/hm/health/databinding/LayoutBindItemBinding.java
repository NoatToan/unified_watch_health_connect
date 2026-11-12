package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.CircleImageView;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutBindItemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CircleImageView bindAppIcon;

    @NonNull
    public final TextView bindAppText;

    @NonNull
    public final TextView divider;

    @NonNull
    public final AppCompatImageView thirdbindIndicator;

    @NonNull
    public final TextView thirdbindStatus;

    private LayoutBindItemBinding(@NonNull LinearLayout rootView, @NonNull CircleImageView bindAppIcon, @NonNull TextView bindAppText, @NonNull TextView divider, @NonNull AppCompatImageView thirdbindIndicator, @NonNull TextView thirdbindStatus) {
        this.a = rootView;
        this.bindAppIcon = bindAppIcon;
        this.bindAppText = bindAppText;
        this.divider = divider;
        this.thirdbindIndicator = thirdbindIndicator;
        this.thirdbindStatus = thirdbindStatus;
    }

    @NonNull
    public static LayoutBindItemBinding bind(@NonNull View rootView) {
        int i = R.id.bind_app_icon;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.bind_app_icon);
        if (circleImageView != null) {
            i = R.id.bind_app_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bind_app_text);
            if (textView != null) {
                i = R.id.divider;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.divider);
                if (textView2 != null) {
                    i = R.id.thirdbind_indicator;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.thirdbind_indicator);
                    if (appCompatImageView != null) {
                        i = R.id.thirdbind_status;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.thirdbind_status);
                        if (textView3 != null) {
                            return new LayoutBindItemBinding((LinearLayout) rootView, circleImageView, textView, textView2, appCompatImageView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutBindItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutBindItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_bind_item, parent, false);
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
