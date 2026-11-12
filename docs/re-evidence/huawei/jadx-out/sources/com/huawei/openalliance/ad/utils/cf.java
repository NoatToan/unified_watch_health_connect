package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import com.huawei.openalliance.ad.hw;
import java.io.Closeable;

/* JADX INFO: loaded from: classes12.dex */
public class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final UriMatcher f20535a;

    public static Pair<Integer, String> a(Context context, String str, String str2) {
        Object th;
        Cursor cursorQuery;
        if (context == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            Uri uri = Uri.parse("content://com.huawei.hms.ads.brain.open" + str);
            if (!as.b(context, uri)) {
                hw.c("OpenDcUtil", "provider uri invalid.");
                df.a((Closeable) null);
                return null;
            }
            hw.b("OpenDcUtil", "call open dc provider");
            cursorQuery = context.getContentResolver().query(uri, null, null, new String[]{String.valueOf(f20535a.match(uri)), str2}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        Pair<Integer, String> pair = new Pair<>(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("code"))), cursorQuery.getString(cursorQuery.getColumnIndex("result")));
                        df.a(cursorQuery);
                        return pair;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        hw.c("OpenDcUtil", "sendCommandToDc " + th.getClass().getSimpleName());
                    } finally {
                        df.a(cursorQuery);
                    }
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f20535a = uriMatcher;
        uriMatcher.addURI("com.huawei.hms.ads.brain.open", "/insapp/query", 1);
        uriMatcher.addURI("com.huawei.hms.ads.brain.open", "/dd/sync", 14);
        uriMatcher.addURI("com.huawei.hms.ads.brain.open", "/adid/sync", 19);
    }
}
