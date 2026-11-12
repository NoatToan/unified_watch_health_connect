package com.huawei.hms.network.embedded;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.SecurityBase64Utils;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15554a = "EncryptKey";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static byte[] f15555b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15556c = "fruit";
    public static final String d = "APPLE";

    public static byte[] a(boolean z) throws IOException {
        byte[] bArr;
        synchronized (w1.class) {
            byte[] bArr2 = f15555b;
            if (bArr2 == null || bArr2.length == 0) {
                f15555b = a(new PLSharedPreferences(ContextHolder.getAppContext(), f15556c), z);
            }
            bArr = f15555b;
        }
        return bArr;
    }

    public static byte[] a(PLSharedPreferences pLSharedPreferences, boolean z) throws IOException {
        byte[] bArrDecode;
        String string = pLSharedPreferences.getString(d, "");
        if (!TextUtils.isEmpty(string)) {
            bArrDecode = SecurityBase64Utils.decode(x1.a(string), 0);
        } else {
            if (!z) {
                throw new y1.b("The workKey does not exist");
            }
            bArrDecode = x1.a();
            String strB = x1.b(SecurityBase64Utils.encodeToString(bArrDecode, 0));
            SharedPreferences.Editor editorEdit = pLSharedPreferences.edit();
            editorEdit.putString(d, strB);
            editorEdit.apply();
            Logger.i(f15554a, "generate work key success");
        }
        if (bArrDecode != null && bArrDecode.length != 0) {
            return bArrDecode;
        }
        if (!z) {
            throw new y1.b("WorkKey is invalid");
        }
        Logger.w(f15554a, "WorkKey is Empty!");
        SharedPreferences.Editor editorEdit2 = pLSharedPreferences.edit();
        editorEdit2.putString(d, "");
        editorEdit2.apply();
        return a(pLSharedPreferences, true);
    }
}
