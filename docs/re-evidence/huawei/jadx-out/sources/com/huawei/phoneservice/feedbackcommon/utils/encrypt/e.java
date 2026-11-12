package com.huawei.phoneservice.feedbackcommon.utils.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.phoneservice.feedbackcommon.R;
import com.huawei.phoneservice.feedbackcommon.utils.i;
import com.huawei.secure.android.common.encrypt.utils.RootKeyUtil;

/* JADX INFO: loaded from: classes13.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f21931b = "";

    public static void a(Context context) {
        f21931b = RootKeyUtil.newInstance("4b5e505724af766fd53ee28510651144397bf939b10f83e1437354b761f6a2b2b7afc5acfe347f63b19fd6ce9b03f98ed26392ebce804fe6f915c7bb3b69768f666e8f20acdced78adaa66b6625684cfb9dffbbc05e8ba82c49ac8edb416f68a15e1c0d2936b4216974cab0bf0fa6d24ee7055a05cfa00e61479e3e4e8f7fe66", i.e(context, "k2_config", "faq_normal_config"), context.getString(R.string.k3_config), i.e(context, "yekr4_config", "faq_normal_config")).getRootKeyHex();
    }

    public static String c(Context context) {
        if (TextUtils.isEmpty(f21931b)) {
            a(context);
        }
        return f21931b;
    }
}
