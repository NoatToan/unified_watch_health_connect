package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeBase64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d2 {
    public static String a(String str) {
        return TextUtils.isEmpty(str) ? str : SafeBase64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0);
    }
}
