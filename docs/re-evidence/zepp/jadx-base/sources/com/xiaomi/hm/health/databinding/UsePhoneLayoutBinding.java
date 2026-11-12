package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class UsePhoneLayoutBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView gotIt;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView textTips;

    private UsePhoneLayoutBinding(@NonNull RelativeLayout rootView, @NonNull TextView gotIt, @NonNull TextView subtitle, @NonNull TextView textTips) {
        this.a = rootView;
        this.gotIt = gotIt;
        this.subtitle = subtitle;
        this.textTips = textTips;
    }

    @NonNull
    public static UsePhoneLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.gotIt;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.gotIt);
        if (textView != null) {
            i = R.id.subtitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
            if (textView2 != null) {
                i = R.id.text_tips;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_tips);
                if (textView3 != null) {
                    return new UsePhoneLayoutBinding((RelativeLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static UsePhoneLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static UsePhoneLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.use_phone_layout, parent, false);
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
