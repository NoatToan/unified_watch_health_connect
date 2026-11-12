package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;

/* JADX INFO: loaded from: classes12.dex */
public class ct {
    public static boolean a(Context context, String str) {
        if (dg.b(str)) {
            return false;
        }
        return !dg.b(fp.b(context).d(str));
    }

    public static String a(Context context, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return "0";
        }
        String strN = contentRecord.n();
        return dg.b(strN) ? "0" : fp.b(context).c(strN);
    }
}
