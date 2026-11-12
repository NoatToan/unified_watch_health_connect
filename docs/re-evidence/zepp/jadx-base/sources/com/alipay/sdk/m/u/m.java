package com.alipay.sdk.m.u;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;

/* JADX INFO: loaded from: classes2.dex */
public class m {
    public static final String a = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    public static String a(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(a), null, null, null, null);
        String string = null;
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("url")) : null;
            cursorQuery.close();
        }
        return string;
    }

    public static String b(Context context) {
        if (EnvUtils.isSandBox()) {
            return com.alipay.sdk.m.l.a.b;
        }
        if (context == null) {
            return com.alipay.sdk.m.l.a.a;
        }
        String str = com.alipay.sdk.m.l.a.a;
        return TextUtils.isEmpty(str) ? com.alipay.sdk.m.l.a.a : str;
    }
}
