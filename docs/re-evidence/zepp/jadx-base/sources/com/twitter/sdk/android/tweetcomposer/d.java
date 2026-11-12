package com.twitter.sdk.android.tweetcomposer;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;

/* JADX INFO: loaded from: classes18.dex */
class d {
    private static final String a = "com.android.providers.media.documents";

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf < 0 ? "" : str.substring(iLastIndexOf + 1);
    }

    public static String b(File file) {
        String strA = a(file.getName());
        return !TextUtils.isEmpty(strA) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strA) : "application/octet-stream";
    }

    @TargetApi(19)
    public static String c(Context context, Uri uri) {
        if ((Build.VERSION.SDK_INT >= 19) && f(uri)) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
            if ("image".equals(strArrSplit[0])) {
                return g(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{strArrSplit[1]});
            }
            return null;
        }
        if (d(uri)) {
            return g(context, uri, null, null);
        }
        if (e(uri)) {
            return uri.getPath();
        }
        return null;
    }

    public static boolean d(Uri uri) {
        return "content".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean e(Uri uri) {
        return "file".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean f(Uri uri) {
        return a.equalsIgnoreCase(uri.getAuthority());
    }

    public static String g(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
