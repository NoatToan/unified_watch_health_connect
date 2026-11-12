package com.xiaomi.smarthome.shop.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import defpackage.pgp;

/* JADX INFO: loaded from: classes2.dex */
public class ToastUtil {
    private static Toast lastToast;

    public static void clear() {
        Toast toast = lastToast;
        if (toast != null) {
            toast.cancel();
        }
    }

    public static void show(Context context, int i) {
        show(context, context.getString(i), 0);
    }

    public static void show(Context context, CharSequence charSequence) {
        show(context, charSequence, 0);
    }

    public static void show(Context context, int i, int i2) {
        show(context, context.getString(i), i2);
    }

    public static void show(final Context context, final CharSequence charSequence, final int i) {
        if (TextUtils.isEmpty(charSequence)) {
            Log.getStackTraceString(new Exception());
            return;
        }
        Toast toast = lastToast;
        if (toast != null) {
            toast.cancel();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            pgp pgpVarA = pgp.a(context, charSequence, i);
            lastToast = pgpVarA;
            pgpVarA.show();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xiaomi.smarthome.shop.utils.ToastUtil.1
            @Override // java.lang.Runnable
            public void run() {
                pgp pgpVarA2 = pgp.a(context, charSequence, i);
                Toast unused = ToastUtil.lastToast = pgpVarA2;
                pgpVarA2.show();
            }
        });
    }

    public static void show(final Context context, final CharSequence charSequence, final int i, Handler handler) {
        if (handler != null && Looper.myLooper() != Looper.getMainLooper()) {
            handler.post(new Runnable() { // from class: com.xiaomi.smarthome.shop.utils.ToastUtil.2
                @Override // java.lang.Runnable
                public void run() {
                    ToastUtil.show(context, charSequence, i);
                }
            });
        } else {
            show(context, charSequence, i);
        }
    }

    public static void show(Context context, View view, int i, float[] fArr, int i2) {
        if (context == null) {
            return;
        }
        Toast toast = lastToast;
        if (toast != null) {
            toast.cancel();
        }
        Toast toast2 = new Toast(context);
        toast2.setView(view);
        toast2.setGravity(i, 0, 0);
        toast2.setDuration(i2);
        toast2.setMargin(fArr[0], fArr[1]);
        lastToast = toast2;
        toast2.show();
    }
}
