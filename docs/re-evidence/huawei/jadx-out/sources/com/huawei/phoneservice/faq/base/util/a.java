package com.huawei.phoneservice.faq.base.util;

import android.app.Dialog;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    public static void d(Dialog dialog) {
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        dialog.show();
    }
}
