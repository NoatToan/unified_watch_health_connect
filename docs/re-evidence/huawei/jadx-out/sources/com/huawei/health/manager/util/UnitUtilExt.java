package com.huawei.health.manager.util;

import android.content.Context;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes2.dex */
public class UnitUtilExt {
    private UnitUtilExt() {
    }

    public static String e(Context context, double d, int i, int i2) {
        String strE = UnitUtil.e(d, i, i2);
        return LanguageUtil.l(context) ? strE.replace(",", "") : strE;
    }
}
