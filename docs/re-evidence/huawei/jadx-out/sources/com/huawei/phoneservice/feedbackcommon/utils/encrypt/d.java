package com.huawei.phoneservice.feedbackcommon.utils.encrypt;

import android.content.Context;
import com.huawei.phoneservice.feedbackcommon.utils.i;
import com.huawei.secure.android.common.encrypt.aes.AesGcm;

/* JADX INFO: loaded from: classes13.dex */
public class d {
    public static String d(Context context) {
        return AesGcm.decrypt(i.e(context, "r_config", "faq_normal_config"), e.c(context));
    }
}
