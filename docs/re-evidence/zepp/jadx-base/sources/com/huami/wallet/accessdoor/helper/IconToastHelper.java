package com.huami.wallet.accessdoor.helper;

import android.content.Context;
import android.text.TextUtils;
import com.huami.wallet.accessdoor.R;
import com.huami.widget.toast.IconToast;

/* JADX INFO: loaded from: classes10.dex */
public class IconToastHelper {
    public static void showOrError(Context context, CharSequence charSequence, Resource resource) {
        String str = resource.code;
        if (str == null || TextUtils.equals(str, "http401")) {
            return;
        }
        IconToast.showToast(context, R.drawable.widget_toast_icon_toast_error, charSequence, 0);
    }

    public static void showOrError(Context context, CharSequence charSequence) {
        IconToast.showToast(context, R.drawable.widget_toast_icon_toast_error, charSequence, 0);
    }
}
