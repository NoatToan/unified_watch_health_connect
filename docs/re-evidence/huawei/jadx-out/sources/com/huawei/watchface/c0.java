package com.huawei.watchface;

import com.huawei.watchface.utils.HwLog;
import java.io.Closeable;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c0 {
    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            HwLog.e("CloseUtils", HwLog.printException(e));
        }
    }
}
