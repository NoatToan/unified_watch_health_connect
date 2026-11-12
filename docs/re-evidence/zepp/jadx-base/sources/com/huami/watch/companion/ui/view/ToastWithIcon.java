package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.huami.watch.companionlib.R;

/* JADX INFO: loaded from: classes16.dex */
public class ToastWithIcon {
    public static void show(Context context, String str, int i, int i2) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_with_icon, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        if (i > 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setVisibility(8);
        }
        ((TextView) viewInflate.findViewById(R.id.text)).setText(str);
        Toast toast = new Toast(context);
        toast.setGravity(17, 0, 0);
        toast.setDuration(i2);
        toast.setView(viewInflate);
        toast.show();
    }

    public static void showLong(Context context, String str, int i) {
        show(context, str, i, 1);
    }

    public static void showShort(Context context, String str, int i) {
        show(context, str, i, 0);
    }
}
