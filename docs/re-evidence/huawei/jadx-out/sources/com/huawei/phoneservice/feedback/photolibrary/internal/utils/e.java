package com.huawei.phoneservice.feedback.photolibrary.internal.utils;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import com.huawei.phoneservice.faq.base.util.p;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import defpackage.zcp;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
public final class e {
    public static final e d = new e();

    @JvmStatic
    public static final boolean e(EditText editText) {
        int height;
        zcp.c(editText, "");
        int scrollY = editText.getScrollY();
        Layout layout = editText.getLayout();
        return (layout == null || (height = layout.getHeight() - ((editText.getHeight() - editText.getCompoundPaddingTop()) - editText.getCompoundPaddingBottom())) == 0 || (scrollY <= 0 && scrollY >= height - 1)) ? false : true;
    }

    @JvmStatic
    public static final void a(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        HwColumnSystem hwColumnSystem = new HwColumnSystem(context);
        hwColumnSystem.d(1);
        p.e(view, hwColumnSystem.i());
    }

    private e() {
    }
}
