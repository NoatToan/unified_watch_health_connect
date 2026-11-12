package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.aes.AesGcm;
import com.huawei.secure.android.common.encrypt.utils.BaseKeyUtil;
import com.huawei.secure.android.common.util.HexUtil;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30081a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f30082b;

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.w(f30081a, "decryptStrByGCM -- encodeResult is null");
        }
        if (f30082b == null) {
            synchronized (b.class) {
                if (f30082b == null) {
                    f30082b = a();
                }
            }
        }
        return AesGcm.decrypt(str, f30082b);
    }

    public static String a() {
        byte[] bArrExportRootKey;
        try {
            bArrExportRootKey = BaseKeyUtil.exportRootKey(DensityUtil.getStringById(R.string.AesGcmUpper), DensityUtil.c(R.array.RootKey)[0], DensityUtil.getStringById(R.string.next_secret), DensityUtil.getStringById(R.string.agSalt), 32, CommonUtils.H());
        } catch (IllegalArgumentException e) {
            HwLog.i(f30081a, "generateRootKey() e: " + HwLog.printException((Exception) e));
            bArrExportRootKey = null;
        }
        return bArrExportRootKey == null ? "" : HexUtil.byteArray2HexStr(bArrExportRootKey);
    }
}
