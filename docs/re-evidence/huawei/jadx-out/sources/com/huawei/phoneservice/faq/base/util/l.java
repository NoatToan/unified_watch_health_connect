package com.huawei.phoneservice.faq.base.util;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: loaded from: classes13.dex */
public class l {
    public static void e(Context context, String str) {
        try {
            Toast toastMakeText = Toast.makeText(context, (CharSequence) null, 0);
            toastMakeText.setText(str);
            toastMakeText.show();
        } catch (Throwable unused) {
            g.c("FaqToastUtils", "toast makeText exception");
        }
    }
}
