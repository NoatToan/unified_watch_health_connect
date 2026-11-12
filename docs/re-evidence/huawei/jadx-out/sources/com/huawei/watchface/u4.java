package com.huawei.watchface;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes20.dex */
public abstract class u4 {
    public static View a(View view, int i) {
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    public static void b(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setLayoutParams(layoutParams);
        }
    }

    public static void c(View view, int i) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        view.setVisibility(i);
    }

    public static View a(Activity activity, int i) {
        if (activity == null) {
            return null;
        }
        return activity.findViewById(i);
    }

    public static void a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public static void a(View view, View.OnClickListener onClickListener) {
        if (view == null || onClickListener == null) {
            return;
        }
        view.setOnClickListener(onClickListener);
    }
}
