package com.huami.widget.toast;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/* JADX INFO: loaded from: classes17.dex */
public class CustomToast extends Toast {
    public CustomToast(Context context) {
        super(context);
    }

    private static void a(Context context, TextView textView) {
        int i = context.getResources().getDisplayMetrics().widthPixels;
        textView.setMinimumWidth((int) (((double) i) * 0.4d));
        textView.setMaxWidth((int) (((double) i) * 0.75d));
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i, int i2, int i3, int i4) {
        if (context == null) {
            return null;
        }
        CustomToast customToast = new CustomToast(context);
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.widget_toast_layout_custom_toast, null);
        TextView textView = (TextView) viewGroup.getChildAt(0);
        textView.setText(charSequence);
        a(context, textView);
        customToast.setGravity(i2, i3, i4);
        customToast.setView(viewGroup);
        customToast.setDuration(i);
        return customToast;
    }

    public static void showLong(Context context, CharSequence charSequence) {
        makeText(context, charSequence, 1).show();
    }

    public static void showShort(Context context, int i) {
        makeText(context, i, 0).show();
    }

    public static void showToastAtY(Context context, CharSequence charSequence, int i, int i2) {
        makeText(context, charSequence, i, 49, 0, i2).show();
    }

    public static void showShort(Context context, CharSequence charSequence) {
        makeText(context, charSequence, 0).show();
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i, int i2) {
        if (context == null) {
            return null;
        }
        return makeText(context, charSequence, i, i2, 0, 0);
    }

    public static Toast makeText(Context context, int i, int i2) {
        if (context == null) {
            return null;
        }
        return makeText(context, i, i2, 17);
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        if (context == null) {
            return null;
        }
        return makeText(context, charSequence, i, 17);
    }

    public static Toast makeText(Context context, int i, int i2, int i3) {
        if (context == null) {
            return null;
        }
        return makeText(context, context.getResources().getString(i), i2, i3);
    }
}
