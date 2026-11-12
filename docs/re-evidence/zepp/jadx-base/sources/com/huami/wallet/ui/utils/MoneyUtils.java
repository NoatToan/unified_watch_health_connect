package com.huami.wallet.ui.utils;

import com.huami.wallet.lib.entity.PayMode;
import com.huami.wallet.ui.entity.RichPayMode;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class MoneyUtils {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RichPayMode.values().length];
            a = iArr;
            try {
                iArr[RichPayMode.ALIPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RichPayMode.WECHAT_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RichPayMode.MI_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String formatCentRMB(int i) {
        return String.format(Locale.getDefault(), "%.2f", Float.valueOf((i * 1.0f) / 100.0f));
    }

    public static String formatYuanRMB(int i) {
        return String.format(Locale.getDefault(), "%.2f", Float.valueOf(i * 1.0f));
    }

    public static PayMode parsePayMode(RichPayMode richPayMode) {
        if (richPayMode == null) {
            return null;
        }
        int i = a.a[richPayMode.ordinal()];
        if (i == 1) {
            return PayMode.ALIPAY;
        }
        if (i == 2) {
            return PayMode.WECHAT_PAY;
        }
        if (i != 3) {
            return null;
        }
        return PayMode.MI_PAY;
    }
}
