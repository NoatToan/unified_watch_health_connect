package com.huawei.maps.offlinedata.handler;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.maps.offlinedata.handler.dto.DecompressParams;
import com.huawei.maps.offlinedata.jsbridge.a;
import com.huawei.maps.offlinedata.utils.c;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.secure.android.common.util.SecurityCommonException;
import com.huawei.secure.android.common.util.ZipUtil;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DecompressHandler extends JsBaseModule {
    private static final int OFFLINE_MAX_FILE_IN_ZIP = 1000;
    private static final long OFFLINE_MAX_ZIP_SIZE = 5368709120L;
    private static final String TAG = "DecompressHandler";

    @JavascriptInterface
    public static void decompress(long j, String str) {
        g.c(TAG, "decompress offline map data " + j);
        DecompressParams decompressParams = (DecompressParams) d.a(str, DecompressParams.class);
        if (decompressParams == null) {
            g.c(TAG, "decompress offline map data : params is null");
            a.a().a(-1, "param is error", j);
            return;
        }
        File file = new File(decompressParams.getZipFile());
        File file2 = new File(decompressParams.getTargetPath());
        if (!file.exists() && file2.exists()) {
            a.a().a(Boolean.TRUE, j);
            return;
        }
        try {
            List<File> listUnZipNew = ZipUtil.unZipNew(decompressParams.getZipFile(), decompressParams.getTargetPath(), OFFLINE_MAX_ZIP_SIZE, 1000, decompressParams.isDeleteOld());
            if (decompressParams.isDeleteZip()) {
                c.a(file);
            }
            if (listUnZipNew == null || listUnZipNew.isEmpty()) {
                a.a().a(-1, "no data", j);
            } else {
                a.a().a(Boolean.TRUE, j);
            }
        } catch (SecurityCommonException unused) {
            c.c(file2);
            g.b(TAG, "unZip: SecurityCommonException: ");
            a.a().a(-1, "Exception", j);
        } catch (IllegalArgumentException unused2) {
            c.c(file2);
            g.b(TAG, "unZip: IllegalArgumentException: ");
            a.a().a(-1, "Exception", j);
        } catch (Exception unused3) {
            c.c(file2);
            g.b(TAG, "unZip: Exception: ");
            a.a().a(-1, "Exception", j);
        }
    }
}
