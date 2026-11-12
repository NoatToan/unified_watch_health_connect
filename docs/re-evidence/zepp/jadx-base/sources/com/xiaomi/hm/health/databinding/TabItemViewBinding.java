package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class TabItemViewBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView imageview;

    @NonNull
    public final View redDot;

    @NonNull
    public final View redDotForSport;

    @NonNull
    public final TextView textview;

    @NonNull
    public final TextView tvRedDot;

    private TabItemViewBinding(@NonNull RelativeLayout rootView, @NonNull ImageView imageview, @NonNull View redDot, @NonNull View redDotForSport, @NonNull TextView textview, @NonNull TextView tvRedDot) {
        this.a = rootView;
        this.imageview = imageview;
        this.redDot = redDot;
        this.redDotForSport = redDotForSport;
        this.textview = textview;
        this.tvRedDot = tvRedDot;
    }

    @NonNull
    public static TabItemViewBinding bind(@NonNull View rootView) {
        int i = R.id.imageview;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageview);
        if (imageView != null) {
            i = R.id.red_dot;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.red_dot);
            if (viewFindChildViewById != null) {
                i = R.id.red_dot_for_sport;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.red_dot_for_sport);
                if (viewFindChildViewById2 != null) {
                    i = R.id.textview;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.textview);
                    if (textView != null) {
                        i = R.id.tv_red_dot;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_red_dot);
                        if (textView2 != null) {
                            return new TabItemViewBinding((RelativeLayout) rootView, imageView, viewFindChildViewById, viewFindChildViewById2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static TabItemViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TabItemViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tab_item_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
