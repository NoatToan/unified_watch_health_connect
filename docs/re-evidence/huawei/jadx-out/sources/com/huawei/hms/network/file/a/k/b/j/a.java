package com.huawei.hms.network.file.a.k.b.j;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.SecurityBase64Utils;
import com.huawei.hms.network.embedded.w1;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.secure.android.common.encrypt.aes.AesGcm;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* JADX INFO: loaded from: classes10.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f15707a;

    static byte[] a(boolean z) {
        byte[] bArr;
        synchronized (a.class) {
            byte[] bArr2 = f15707a;
            if (bArr2 == null || bArr2.length == 0) {
                f15707a = a(new PLSharedPreferences(ContextHolder.getAppContext(), "fmfruit"), z);
            }
            bArr = f15707a;
        }
        return bArr;
    }

    private static byte[] a(PLSharedPreferences pLSharedPreferences, boolean z) throws b.C0166b {
        byte[] bArrDecode;
        String string = pLSharedPreferences.getString("animal", "");
        String rootKeyHex = c.a().getRootKeyHex();
        if (!TextUtils.isEmpty(string)) {
            bArrDecode = SecurityBase64Utils.decode(AesGcm.decrypt(string, rootKeyHex), 0);
        } else {
            if (!z) {
                FLogger.e(w1.f15554a, "getKeyImpl KeyNotFoundException");
                throw new b.C0166b("The workKey does not exist");
            }
            bArrDecode = EncryptUtil.generateSecureRandom(16);
            String strEncrypt = AesGcm.encrypt(SecurityBase64Utils.encodeToString(bArrDecode, 0), rootKeyHex);
            SharedPreferences.Editor editorEdit = pLSharedPreferences.edit();
            editorEdit.putString("animal", strEncrypt);
            editorEdit.apply();
            FLogger.i(w1.f15554a, "generate work key success", new Object[0]);
        }
        if (bArrDecode != null && bArrDecode.length != 0) {
            return bArrDecode;
        }
        if (!z) {
            throw new b.C0166b("WorkKey is invalid");
        }
        FLogger.w(w1.f15554a, "WorkKey is Empty!", new Object[0]);
        SharedPreferences.Editor editorEdit2 = pLSharedPreferences.edit();
        editorEdit2.putString("animal", "");
        editorEdit2.apply();
        return a(pLSharedPreferences, true);
    }

    a() {
    }
}
