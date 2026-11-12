package com.huawei.common.util;

import android.util.Base64;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.WhiteBoxManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes23.dex */
public class EncryptUtil {
    private static final String DEFAULT_ENCODE = "UTF-8";
    private static final int SEGMENT_KEY_INDEX_1004 = 1004;
    private static final int SEGMENT_KEY_INDEX_2004 = 2004;
    private static final int SEGMENT_KEY_INDEX_4 = 4;
    private static final String TAG = "EncryptUtil";
    private static final int TYPE_HEALTH = 1;

    private EncryptUtil() {
    }

    public static String getUpServiceToken() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        String str = whiteBoxManagerB.a(1, 4) + whiteBoxManagerB.a(1, 1004) + whiteBoxManagerB.a(1, 2004);
        LogUtil.e(TAG, "upServiceToken before decrypt = " + str);
        try {
            String str2 = new String(whiteBoxManagerB.a(Base64.decode(str, 0)), "UTF-8");
            try {
                LogUtil.e(TAG, "upServiceToken after decrypt = ".concat(str2));
                return str2;
            } catch (UnsupportedEncodingException e) {
                e = e;
                str = str2;
                LogUtil.e(TAG, "getUpServiceToken e = " + e.getMessage());
                return str;
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
        }
    }
}
