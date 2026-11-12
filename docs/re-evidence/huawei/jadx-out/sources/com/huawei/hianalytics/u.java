package com.huawei.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.hicloud.sync.util.FileUtil;
import com.huawei.hianalytics.core.log.HiLog;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static String a(Context context) {
        InputStream inputStreamOpen;
        if (context == null || TextUtils.isEmpty("grs_sdk_global_route_config_hianalytics.json")) {
            return "";
        }
        try {
            inputStreamOpen = context.getAssets().open("grs_sdk_global_route_config_hianalytics.json");
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                if (inputStreamOpen.read(bArr) <= 0) {
                    a(inputStreamOpen);
                    return "";
                }
                String str = new String(bArr, StandardCharsets.UTF_8);
                a(inputStreamOpen);
                return str;
            } catch (Throwable unused) {
                try {
                    HiLog.w(FileUtil.TAG, "readAsset Exception");
                    return "";
                } finally {
                    a(inputStreamOpen);
                }
            }
        } catch (Throwable unused2) {
            inputStreamOpen = null;
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            HiLog.w(FileUtil.TAG, "close IOException:".concat(e.getClass().getSimpleName()));
        }
    }
}
