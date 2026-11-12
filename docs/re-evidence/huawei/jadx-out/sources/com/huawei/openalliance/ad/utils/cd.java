package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.IntervalMethods;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f20524a = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid/query").build();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f20525b = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid_scp/get").build();

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Context context) {
        Object th;
        Cursor cursorA;
        if (context == null) {
            return "";
        }
        try {
            fp.b(context).s(IntervalMethods.REQ_OAID_DECRYPT_KEY);
            cursorA = as.a(context, f20525b);
            if (cursorA != null) {
                try {
                    if (cursorA.moveToFirst()) {
                        String string = cursorA.getString(cursorA.getColumnIndexOrThrow("op_wk"));
                        df.a(cursorA);
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        hw.c("OaidProviderUtil", "get remote key ex: %s", th.getClass().getSimpleName());
                        return "";
                    } finally {
                        df.a(cursorA);
                    }
                }
            }
            df.a(cursorA);
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursorA = null;
        }
    }

    public static boolean b(Context context) {
        return a(context, f20524a);
    }

    public static boolean a(Context context, Uri uri) {
        Integer numB;
        if (context == null || uri == null || (numB = k.b(context)) == null || 30462100 > numB.intValue()) {
            return false;
        }
        return as.b(context, uri);
    }

    public static Pair<String, Boolean> a(final Context context, String str) {
        String str2;
        if (context == null || !a(context, f20525b) || TextUtils.isEmpty(str)) {
            return null;
        }
        final cw.a aVarA = cw.a.a(context);
        String strD = aVarA.d();
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cd.1
            @Override // java.lang.Runnable
            public void run() {
                if (fp.b(context).b(IntervalMethods.REQ_OAID_DECRYPT_KEY)) {
                    hw.a("OaidProviderUtil", "within oaid key time interval.");
                    return;
                }
                String strD2 = cd.d(context);
                if (hw.a()) {
                    hw.a("OaidProviderUtil", "async get remote key: %s", dg.i(strD2));
                }
                aVarA.d(strD2);
            }
        });
        if (TextUtils.isEmpty(strD)) {
            str2 = "scp is empty";
        } else {
            String strA = cw.a(str, strD);
            if (!TextUtils.isEmpty(strA)) {
                return new Pair<>(strA, Boolean.valueOf(Constants.NIL_UUID.equalsIgnoreCase(strA)));
            }
            str2 = "decrypt oaid failed.";
        }
        hw.a("OaidProviderUtil", str2);
        return null;
    }

    public static Pair<String, Boolean> a(Context context) {
        Cursor cursorA;
        boolean zBooleanValue = true;
        if (context != null) {
            Uri uri = f20524a;
            if (a(context, uri)) {
                try {
                    cursorA = as.a(context, uri);
                    if (cursorA != null) {
                        try {
                            if (cursorA.moveToFirst()) {
                                int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("oaid");
                                int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("limit_track");
                                String string = cursorA.getString(columnIndexOrThrow);
                                if (!dg.e(string, Constants.NIL_UUID)) {
                                    zBooleanValue = Boolean.valueOf(cursorA.getString(columnIndexOrThrow2)).booleanValue();
                                }
                                Pair<String, Boolean> pair = new Pair<>(string, Boolean.valueOf(zBooleanValue));
                                df.a(cursorA);
                                return pair;
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                hw.c("OaidProviderUtil", "query oaid via provider ex: %s", th.getClass().getSimpleName());
                                return new Pair<>(Constants.NIL_UUID, true);
                            } finally {
                                df.a(cursorA);
                            }
                        }
                    }
                    Pair<String, Boolean> pair2 = new Pair<>(Constants.NIL_UUID, true);
                    df.a(cursorA);
                    return pair2;
                } catch (Throwable th2) {
                    th = th2;
                    cursorA = null;
                }
            }
        }
        return new Pair<>(Constants.NIL_UUID, true);
    }
}
