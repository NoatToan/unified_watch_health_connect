package com.huawei.health.h5pro.jsbridge.system.storage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class StorageUtil {
    private StorageUtil() {
    }

    private static String a(ContentResolver contentResolver, String str) {
        LogUtil.i("H5PRO_StorageUtil", a.a("queryImagePathByDisplayName: displayName -> ", str));
        try {
            Cursor cursorQuery = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_data"}, "_display_name = ?", new String[]{str}, "_id DESC");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            LogUtil.w("H5PRO_StorageUtil", "queryImagePathByDisplayName: cursor error");
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return "";
        } catch (SQLiteException | IllegalArgumentException | SecurityException e) {
            LogUtil.e("H5PRO_StorageUtil", "queryImagePathByDisplayName: exception -> " + e.getMessage());
            return "";
        }
    }

    private static boolean a(String str) {
        return str.startsWith("internal://cache/");
    }

    private static String d(Context context, String str, String str2) {
        String nativeCachePath = getNativeCachePath(context, str);
        if (TextUtils.isEmpty(nativeCachePath)) {
            return "";
        }
        return nativeCachePath + str2.replaceFirst("internal://cache/", "");
    }

    private static String e(Context context, String str, String str2) {
        String nativeFilePath = getNativeFilePath(context, str);
        if (TextUtils.isEmpty(nativeFilePath)) {
            return "";
        }
        return nativeFilePath + str2.replaceFirst("internal://files/", "");
    }

    private static boolean e(String str) {
        return str.startsWith("internal://files/");
    }

    public static boolean ensureDirExists(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    public static boolean ensureFileExists(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                LogUtil.e("H5PRO_StorageUtil", "get parent dir fail");
                return false;
            }
            if (parentFile.exists()) {
                return file.createNewFile();
            }
            return parentFile.mkdirs() && file.createNewFile();
        } catch (IOException unused) {
            LogUtil.e("H5PRO_StorageUtil", "ensureFileExists fail");
            return false;
        }
    }

    public static String getAppFilePath(Context context, H5ProInstance h5ProInstance) {
        try {
            return getNativeFilePath(context, CommonUtil.getAppId(h5ProInstance));
        } catch (IOException unused) {
            return "";
        }
    }

    public static String getImageCachePath(Context context, String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_StorageUtil", "getImageCachePath: invalid appId");
            return "";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getCanonicalPath() + File.separator;
        }
        String nativeCachePath = getNativeCachePath(context);
        if (TextUtils.isEmpty(nativeCachePath)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getCanonicalPath() + File.separator;
        }
        return nativeCachePath + str + File.separator;
    }

    public static String getNativeCachePath(Context context) {
        if (context == null) {
            LogUtil.w("H5PRO_StorageUtil", "getNativeCachePath: context is null");
            return "";
        }
        File externalCacheDir = context.getApplicationContext().getExternalCacheDir();
        if (externalCacheDir == null) {
            LogUtil.w("H5PRO_StorageUtil", "getNativeCachePath: externalCacheDir is null");
            return "";
        }
        return externalCacheDir.getCanonicalPath() + "/h5pro/files/";
    }

    public static String getNativeFilePath(Context context) {
        if (context == null) {
            LogUtil.w("H5PRO_StorageUtil", "getNativeFilePath: context is null");
            return "";
        }
        File externalFilesDir = context.getApplicationContext().getExternalFilesDir("");
        if (externalFilesDir == null) {
            LogUtil.w("H5PRO_StorageUtil", "getNativeFilePath: externalFilesDir is null");
            return "";
        }
        return externalFilesDir.getCanonicalPath() + "/h5pro/files/";
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.database.Cursor, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static FileMeta parseUriToFileMeta(Uri uri, Context context) throws Throwable {
        File file;
        ?? r11;
        ?? r2;
        Context context2;
        ?? r3;
        ?? r1;
        Throwable e;
        FileOutputStream fileOutputStream;
        ContentResolver contentResolver = context.getContentResolver();
        FileMeta.Builder builder = new FileMeta.Builder();
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            file = new File(uri.getPath());
        } else {
            ?? r9 = 0;
            Context context3 = null;
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                ?? OpenInputStream = 29;
                if (Build.VERSION.SDK_INT < 29) {
                    String filePathFromUri = getFilePathFromUri(context, uri);
                    if (TextUtils.isEmpty(filePathFromUri)) {
                        file = null;
                    } else {
                        file = new File(filePathFromUri);
                    }
                } else {
                    ?? Query = 1;
                    try {
                        try {
                            try {
                                try {
                                    Query = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (Query != 0) {
                                        try {
                                            if (Query.moveToFirst()) {
                                                String string = Query.getString(Query.getColumnIndexOrThrow("_display_name"));
                                                OpenInputStream = contentResolver.openInputStream(uri);
                                                try {
                                                    File file2 = new File(context.getCacheDir().getAbsoluteFile(), string);
                                                    fileOutputStream = new FileOutputStream(file2);
                                                    try {
                                                        FileUtils.copy((InputStream) OpenInputStream, fileOutputStream);
                                                        CommonUtil.closeStream(Query);
                                                        CommonUtil.closeStream(fileOutputStream);
                                                        CommonUtil.closeStream(OpenInputStream);
                                                        file = file2;
                                                    } catch (IOException e2) {
                                                        e = e2;
                                                        LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                                        CommonUtil.closeStream(Query);
                                                        CommonUtil.closeStream(fileOutputStream);
                                                        CommonUtil.closeStream(OpenInputStream);
                                                        file = null;
                                                    } catch (IllegalArgumentException e3) {
                                                        e = e3;
                                                        LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                                        CommonUtil.closeStream(Query);
                                                        CommonUtil.closeStream(fileOutputStream);
                                                        CommonUtil.closeStream(OpenInputStream);
                                                        file = null;
                                                    } catch (SecurityException e4) {
                                                        e = e4;
                                                        LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                                        CommonUtil.closeStream(Query);
                                                        CommonUtil.closeStream(fileOutputStream);
                                                        CommonUtil.closeStream(OpenInputStream);
                                                        file = null;
                                                    }
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    e = e;
                                                    Query = Query;
                                                    OpenInputStream = OpenInputStream;
                                                    fileOutputStream = null;
                                                    LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                                    CommonUtil.closeStream(Query);
                                                    CommonUtil.closeStream(fileOutputStream);
                                                    CommonUtil.closeStream(OpenInputStream);
                                                    file = null;
                                                    if (file == null) {
                                                    }
                                                } catch (IllegalArgumentException e6) {
                                                    e = e6;
                                                    e = e;
                                                    Query = Query;
                                                    OpenInputStream = OpenInputStream;
                                                    fileOutputStream = null;
                                                    LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                                    CommonUtil.closeStream(Query);
                                                    CommonUtil.closeStream(fileOutputStream);
                                                    CommonUtil.closeStream(OpenInputStream);
                                                    file = null;
                                                    if (file == null) {
                                                    }
                                                } catch (SecurityException e7) {
                                                    e = e7;
                                                    e = e;
                                                    Query = Query;
                                                    OpenInputStream = OpenInputStream;
                                                    fileOutputStream = null;
                                                    LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                                    CommonUtil.closeStream(Query);
                                                    CommonUtil.closeStream(fileOutputStream);
                                                    CommonUtil.closeStream(OpenInputStream);
                                                    file = null;
                                                    if (file == null) {
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    context2 = context3;
                                                    r1 = Query;
                                                    r3 = OpenInputStream;
                                                    r9 = r1;
                                                    r2 = r3;
                                                    r11 = context2;
                                                    CommonUtil.closeStream(r9);
                                                    CommonUtil.closeStream(r11);
                                                    CommonUtil.closeStream(r2);
                                                    throw th;
                                                }
                                            }
                                        } catch (IOException e8) {
                                            e = e8;
                                            e = e;
                                            OpenInputStream = 0;
                                            Query = Query;
                                            fileOutputStream = null;
                                            LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                            CommonUtil.closeStream(Query);
                                            CommonUtil.closeStream(fileOutputStream);
                                            CommonUtil.closeStream(OpenInputStream);
                                            file = null;
                                            if (file == null) {
                                            }
                                        } catch (IllegalArgumentException e9) {
                                            e = e9;
                                            e = e;
                                            OpenInputStream = 0;
                                            Query = Query;
                                            fileOutputStream = null;
                                            LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                            CommonUtil.closeStream(Query);
                                            CommonUtil.closeStream(fileOutputStream);
                                            CommonUtil.closeStream(OpenInputStream);
                                            file = null;
                                            if (file == null) {
                                            }
                                        } catch (SecurityException e10) {
                                            e = e10;
                                            e = e;
                                            OpenInputStream = 0;
                                            Query = Query;
                                            fileOutputStream = null;
                                            LogUtil.e("H5PRO_StorageUtil", "parseUriToFileMeta: " + e.getMessage());
                                            CommonUtil.closeStream(Query);
                                            CommonUtil.closeStream(fileOutputStream);
                                            CommonUtil.closeStream(OpenInputStream);
                                            file = null;
                                            if (file == null) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            context2 = null;
                                            r3 = 0;
                                            r1 = Query;
                                            r9 = r1;
                                            r2 = r3;
                                            r11 = context2;
                                            CommonUtil.closeStream(r9);
                                            CommonUtil.closeStream(r11);
                                            CommonUtil.closeStream(r2);
                                            throw th;
                                        }
                                    }
                                    FileMeta fileMetaBuild = builder.noExist().build();
                                    CommonUtil.closeStream(Query);
                                    CommonUtil.closeStream(null);
                                    CommonUtil.closeStream(null);
                                    return fileMetaBuild;
                                } catch (IOException | IllegalArgumentException | SecurityException e11) {
                                    e = e11;
                                    Query = 0;
                                    OpenInputStream = 0;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r11 = 0;
                                r2 = 0;
                                CommonUtil.closeStream(r9);
                                CommonUtil.closeStream(r11);
                                CommonUtil.closeStream(r2);
                                throw th;
                            }
                        } catch (IOException | IllegalArgumentException | SecurityException e12) {
                            e = e12;
                            fileOutputStream = null;
                            Query = 0;
                            OpenInputStream = 0;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        context3 = context;
                    }
                }
            } else {
                file = null;
            }
        }
        return (file == null && file.exists() && file.length() != 0) ? builder.path(uri.getPath()).name(file.getName()).absolutePath(file.getAbsolutePath()).size(file.length()).dateAdded(file.lastModified()).mimeType(contentResolver.getType(uri)).build() : builder.noExist().build();
    }

    public static String webAppUriToNativePath(Context context, String str, String str2) {
        if (!GeneralUtil.isSafePath(str) || !GeneralUtil.isSafePath(str2)) {
            LogUtil.w("H5PRO_StorageUtil", "webAppUriToNativePath: invalid appId or path");
            return "";
        }
        if (e(str2)) {
            return e(context, str, str2);
        }
        if (a(str2)) {
            return d(context, str, str2);
        }
        throw new IllegalArgumentException(a.a("url can't transfer to native path:", str2));
    }

    public static String getFilePathFromUri(Context context, Uri uri) {
        String strA;
        String string;
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            strA = uri.getPath();
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            String[] strArr = {"_data", "_display_name"};
            ContentResolver contentResolver = context.getContentResolver();
            String string2 = null;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("_data");
                            if (columnIndex >= 0) {
                                string = cursorQuery.getString(columnIndex);
                            } else {
                                string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                                string = "";
                            }
                            try {
                                cursorQuery.close();
                            } catch (SQLiteException e) {
                                e = e;
                                LogUtil.e("H5PRO_StorageUtil", "getFilePathFromUri: exception -> " + e.getMessage());
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                LogUtil.e("H5PRO_StorageUtil", "getFilePathFromUri: exception -> " + e.getMessage());
                            } catch (SecurityException e3) {
                                e = e3;
                                LogUtil.e("H5PRO_StorageUtil", "getFilePathFromUri: exception -> " + e.getMessage());
                            }
                            strA = string;
                            if (!TextUtils.isEmpty(string2)) {
                                strA = a(contentResolver, string2);
                            }
                        }
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                LogUtil.w("H5PRO_StorageUtil", "getFilePathFromUri: cursor error");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return "";
            } catch (SQLiteException | IllegalArgumentException | SecurityException e4) {
                e = e4;
                string = "";
            }
        } else {
            strA = "";
        }
        return strA == null ? "" : strA;
    }

    public static Uri getUriFromFile(Context context, File file) {
        return FileProvider.getUriForFile(context, CommonUtil.getProviderAuthority(context), file);
    }

    public static String getNativeCachePath(Context context, String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_StorageUtil", "getNativeCachePath: invalid appId");
            return "";
        }
        String nativeCachePath = getNativeCachePath(context);
        if (TextUtils.isEmpty(nativeCachePath)) {
            return "";
        }
        return nativeCachePath + str + File.separator;
    }

    public static String getNativeFilePath(Context context, String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_StorageUtil", "getNativeFilePath: invalid appId");
            return "";
        }
        String nativeFilePath = getNativeFilePath(context);
        if (TextUtils.isEmpty(nativeFilePath)) {
            return "";
        }
        return nativeFilePath + str + File.separator;
    }
}
