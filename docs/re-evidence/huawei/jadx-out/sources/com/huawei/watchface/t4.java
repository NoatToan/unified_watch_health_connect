package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.utils.HwLog;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes20.dex */
public abstract class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30579a = "t4";

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i(f30579a, "containXssChar url is empty");
            return false;
        }
        String strA = x3.a(str, "UTF-8");
        String strB = NewSystemParamManager.b(SystemParamNames.CLIENT_URL_XSS_FILTER);
        if (!TextUtils.isEmpty(strB)) {
            return Pattern.compile(strB).matcher(strA).find();
        }
        HwLog.i(f30579a, "containXssChar xssFilter is empty");
        return false;
    }
}
