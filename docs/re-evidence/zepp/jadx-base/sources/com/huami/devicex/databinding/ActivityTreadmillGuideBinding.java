package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityTreadmillGuideBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final AppCompatTextView bottomTv;

    @NonNull
    public final RelativeLayout deviceBindRl;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private ActivityTreadmillGuideBinding(@NonNull RelativeLayout relativeLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = relativeLayout;
        this.bottomTv = appCompatTextView;
        this.deviceBindRl = relativeLayout2;
        this.subTitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static ActivityTreadmillGuideBinding bind(@NonNull View view) {
        int i = R.id.bottom_tv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.sub_title_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.title_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ActivityTreadmillGuideBinding(relativeLayout, appCompatTextView, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityTreadmillGuideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityTreadmillGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_treadmill_guide, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
