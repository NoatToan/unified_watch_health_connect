package com.huami.widget.toast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.huami.widget.toast.service.IconToastService;

/* JADX INFO: loaded from: classes17.dex */
public class IconToast extends Toast {
    public IconToast(Context context) {
        super(context);
    }

    public static void showDefaultToast(Context context, @DrawableRes int i, CharSequence charSequence, int i2) {
        View viewInflate = View.inflate(context, R.layout.widget_toast_layout_icon_toast, null);
        ((ImageView) viewInflate.findViewById(R.id.icon)).setImageResource(i);
        ((TextView) viewInflate.findViewById(R.id.message)).setText(charSequence);
        Toast toast = new Toast(context);
        toast.setGravity(17, 0, 0);
        toast.setDuration(i2);
        toast.setView(viewInflate);
        toast.show();
    }

    public static void showError(Context context, CharSequence charSequence) {
        IconToastService toastService = IconToastService.INSTANCE.getToastService();
        if (toastService != null) {
            toastService.showError(context, charSequence, 0);
        } else {
            showToast(context, R.drawable.widget_toast_icon_toast_error, charSequence, 0);
        }
    }

    public static void showErrorLong(Context context, CharSequence charSequence) {
        IconToastService toastService = IconToastService.INSTANCE.getToastService();
        if (toastService != null) {
            toastService.showError(context, charSequence, 1);
        } else {
            showToast(context, R.drawable.widget_toast_icon_toast_error, charSequence, 1);
        }
    }

    public static void showHorizontalIconToast(Context context, @DrawableRes int i, CharSequence charSequence, int i2) {
        View viewInflate = View.inflate(context, R.layout.widget_toast_layout_custom_toast, null);
        Drawable drawable = context.getResources().getDrawable(i);
        int dimension = (int) context.getResources().getDimension(R.dimen.widget_toast_horizontal_icon_size);
        drawable.setBounds(0, 0, dimension, dimension);
        TextView textView = (TextView) viewInflate.findViewById(R.id.content_txt);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setText(charSequence);
        Toast toast = new Toast(context.getApplicationContext());
        toast.setGravity(17, 0, 0);
        toast.setDuration(i2);
        toast.setView(viewInflate);
        toast.show();
    }

    public static void showShort(Context context, @DrawableRes int i, CharSequence charSequence) {
        showToast(context, i, charSequence, 0);
    }

    public static void showSuccess(Context context, CharSequence charSequence) {
        IconToastService toastService = IconToastService.INSTANCE.getToastService();
        if (toastService != null) {
            toastService.showSuccess(context, charSequence, 0);
        } else {
            showToast(context, R.drawable.widget_toast_icon_toast_success, charSequence, 0);
        }
    }

    public static void showSuccessLong(Context context, CharSequence charSequence) {
        IconToastService toastService = IconToastService.INSTANCE.getToastService();
        if (toastService != null) {
            toastService.showSuccess(context, charSequence, 1);
        } else {
            showToast(context, R.drawable.widget_toast_icon_toast_success, charSequence, 1);
        }
    }

    public static void showToast(Context context, @DrawableRes int i, CharSequence charSequence, int i2) {
        IconToastService toastService = IconToastService.INSTANCE.getToastService();
        if (toastService != null) {
            toastService.showToast(context, i, charSequence, i2);
        } else {
            showDefaultToast(context, i, charSequence, i2);
        }
    }

    public static void showError(Context context, @StringRes int i) {
        showError(context, context.getResources().getString(i));
    }

    public static void showErrorLong(Context context, @StringRes int i) {
        showErrorLong(context, context.getResources().getString(i));
    }

    public static void showSuccess(Context context, @StringRes int i) {
        showSuccess(context, context.getString(i));
    }

    public static void showSuccessLong(Context context, @StringRes int i) {
        showSuccessLong(context, context.getString(i));
    }

    public static void showToast(Context context, @DrawableRes int i, @StringRes int i2, int i3) {
        showToast(context, i, context.getString(i2), i3);
    }

    public static void showHorizontalIconToast(Context context, @DrawableRes int i, @StringRes int i2, int i3) {
        showHorizontalIconToast(context, i, context.getResources().getString(i2), i3);
    }
}
