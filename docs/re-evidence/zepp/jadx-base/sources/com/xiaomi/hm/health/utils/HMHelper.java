package com.xiaomi.hm.health.utils;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.FileUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class HMHelper {
    public static final String HMBLETOOL_DIR = FileUtils.getExternalStorageDirectoryCompatible(BraceletApp.getContext()) + "/hmbletool";
    private static final String a = "HMHelper";

    /* JADX WARN: Code duplicated, block: B:27:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    private static String a(Context context, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        ?? r0 = 0;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    String strSaveFile = saveFile(inputStreamOpenInputStream, HMBLETOOL_DIR, getFileName(uri));
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    return strSaveFile;
                } catch (Exception e) {
                    e = e;
                    HMLog.i(a, "createFileFromUri Exception:" + e.getMessage(), new Object[0]);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r0 = context;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    public static String formatDate(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(date);
    }

    public static String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs) throws Throwable {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, selection, selectionArgs, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            DatabaseUtils.dumpCursor(cursorQuery);
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (Exception e) {
                        e = e;
                        cursor = cursorQuery;
                        HMLog.i(a, "getDataColumn Exception:" + e.getMessage(), new Object[0]);
                        String strA = a(context, uri);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return strA;
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
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static String getFileName(Uri uri) {
        String path;
        int iLastIndexOf;
        if (uri == null || (iLastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(iLastIndexOf + 1);
    }

    @TargetApi(19)
    public static String getPath(final Context context, final Uri uri) {
        HMLog.i(a, "getPath:" + uri, new Object[0]);
        HMLog.d(a, "Authority: " + uri.getAuthority() + ", Fragment: " + uri.getFragment() + ", Port: " + uri.getPort() + ", Query: " + uri.getQuery() + ", Scheme: " + uri.getScheme() + ", Host: " + uri.getHost() + ", Segments: " + uri.getPathSegments().toString(), new Object[0]);
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return FileUtils.getExternalStorageDirectoryCompatible(BraceletApp.getContext()) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + strArrSplit[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:/")) {
                        return Uri.parse(documentId).getPath();
                    }
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)), null, null);
                    } catch (NumberFormatException e) {
                        HMLog.d(a, e.getMessage(), new Object[0]);
                        return a(context, uri);
                    }
                }
                if (isMediaDocument(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = strArrSplit2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static String saveFile(InputStream inputStream, String outDir, String fileName) throws Exception {
        String str = outDir + File.separator + fileName;
        File file = new File(str);
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                fileOutputStream.close();
                return str;
            }
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.flush();
        }
    }
}
