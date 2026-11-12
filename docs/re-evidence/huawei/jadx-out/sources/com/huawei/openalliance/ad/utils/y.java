package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public final class y {
    public static int a(Context context) {
        if (context == null) {
            return -1;
        }
        Cursor cursorA = null;
        try {
            cursorA = as.a(context, Uri.parse("content://com.huawei.hms.contentprovider/com.huawei.hms.ads.dc.shared/dc_shared"));
            if (cursorA != null && cursorA.moveToFirst()) {
                hw.b("ProviderUtil", "cursor is valid");
                int i = cursorA.getInt(cursorA.getColumnIndexOrThrow("result"));
                df.a(cursorA);
                return i;
            }
        } catch (Throwable th) {
            try {
                hw.c("ProviderUtil", "getDcVersion exception: %s", th.getClass().getSimpleName());
            } finally {
                df.a(cursorA);
            }
        }
        return -1;
    }
}
