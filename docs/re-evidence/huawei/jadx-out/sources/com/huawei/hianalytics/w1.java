package com.huawei.hianalytics;

import com.huawei.secure.android.common.util.SafeBase64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w1 {
    public static String a(String str) {
        return new String(SafeBase64.decode(new StringBuilder(str).reverse().toString(), 0), StandardCharsets.UTF_8);
    }
}
