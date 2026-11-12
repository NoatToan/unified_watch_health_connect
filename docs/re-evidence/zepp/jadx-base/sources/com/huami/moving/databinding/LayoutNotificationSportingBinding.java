package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class LayoutNotificationSportingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView appIcon;

    @NonNull
    public final TextView labelUnit1;

    @NonNull
    public final TextView labelUnit2;

    @NonNull
    public final TextView labelUnit3;

    @NonNull
    public final TextView labelValue1;

    @NonNull
    public final TextView labelValue2;

    @NonNull
    public final TextView labelValue3;

    @NonNull
    public final LinearLayout sportingNotification;

    private LayoutNotificationSportingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.appIcon = imageView;
        this.labelUnit1 = textView;
        this.labelUnit2 = textView2;
        this.labelUnit3 = textView3;
        this.labelValue1 = textView4;
        this.labelValue2 = textView5;
        this.labelValue3 = textView6;
        this.sportingNotification = linearLayout2;
    }

    @NonNull
    public static LayoutNotificationSportingBinding bind(@NonNull View view) {
        int i = R.id.app_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.label_unit_1;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.label_unit_2;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.label_unit_3;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.label_value_1;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.label_value_2;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.label_value_3;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    LinearLayout linearLayout = (LinearLayout) view;
                                    return new LayoutNotificationSportingBinding(linearLayout, imageView, textView, textView2, textView3, textView4, textView5, textView6, linearLayout);
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
    public static LayoutNotificationSportingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutNotificationSportingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_notification_sporting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
