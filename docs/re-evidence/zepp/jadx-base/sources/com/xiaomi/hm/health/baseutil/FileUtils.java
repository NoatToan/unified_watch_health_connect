package com.xiaomi.hm.health.baseutil;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FileUtils {
    private static final String A = "image";
    private static final String B = "video";
    private static final String C = "audio";
    private static final String D = "content";
    private static final String E = "file";
    private static Context F = null;
    private static final String a = "FileUtils";
    private static final String b = "share.jpg";
    private static final String c = "log";
    private static final String d = ".miband";
    private static final String e = "miband";
    private static final String f = "firmware";
    private static final String g = "miband";
    private static final String h = "cache";
    private static final String i = "file";
    private static final String j = "lab";
    private static final String k = "thumb";
    private static final String l = ".nomedia";
    private static final String m = "training";
    private static final String n = "atrial_fib";
    private static final String o = "gpx";
    private static File p = null;
    private static File q = null;
    private static File r = null;
    private static File s = null;
    private static File t = null;
    private static File u = null;
    private static File v = null;
    private static File w = null;
    private static File x = null;
    private static File y = null;
    private static final String z = "primary";

    private FileUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static String a(Context context, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        String str = getExternalStorageDirectoryCompatible(context).getAbsolutePath() + File.separator + "temp";
        InputStream inputStream = null;
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                try {
                    String strSaveFile = saveFile(inputStreamOpenInputStream, str, getFileName(uri));
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    return strSaveFile;
                } catch (Exception e2) {
                    e = e2;
                    HMLog.e(a, "createFileFromUri Exception:" + e.getMessage(), new Object[0]);
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
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    private static File b(Context context) {
        return new File(g(context), h);
    }

    private static File c(Context context) {
        return new File(g(context), "file");
    }

    public static File copyAssetFileToDest(AssetManager assetManager, String str, File file, String str2) throws IOException {
        InputStream inputStreamOpen = assetManager.open("discovery/" + str);
        File file2 = new File(file, str2);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[2097152];
        while (true) {
            int i2 = inputStreamOpen.read(bArr);
            if (i2 == -1) {
                fileOutputStream.close();
                inputStreamOpen.close();
                return file2;
            }
            fileOutputStream.write(bArr, 0, i2);
        }
    }

    public static void copyDir(String str, String str2) throws IOException {
        File file = new File(str);
        String[] list = file.list();
        File[] fileArrListFiles = file.listFiles();
        if (!new File(str2).exists()) {
            new File(str2).mkdir();
        }
        for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
            if (fileArrListFiles[i2].isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str3 = File.separator;
                sb.append(str3);
                sb.append(list[i2]);
                copyDir(sb.toString(), str2 + str3 + list[i2]);
            } else if (fileArrListFiles[i2].isFile()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append(list[i2]);
                copyFile(sb2.toString(), str2 + str4 + list[i2]);
            }
        }
    }

    public static void copyFile(String str, String str2) throws IOException {
        copyFile(new File(str), new File(str2));
    }

    private static File d(Context context) {
        return new File(g(context), j);
    }

    public static boolean deleteAllFiles(File file) {
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        String[] list = file.list();
        if (list == null || list.length == 0) {
            return true;
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (file2.isFile()) {
                file2.delete();
            } else if (file2.isDirectory()) {
                File file3 = new File(file, str);
                deleteAllFiles(file3);
                deleteFolder(file3);
                return true;
            }
        }
        return false;
    }

    public static void deleteFolder(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            deleteAllFiles(file);
            file.delete();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean deleteSpecial(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteSpecial(file2);
            }
        }
        return file.delete();
    }

    public static List<String> deleteWatermarkFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!q.exists()) {
            q.mkdir();
        }
        if (!r.exists()) {
            r.mkdir();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : r.listFiles()) {
            if (file.getName().startsWith(str)) {
                arrayList.add(file.getAbsolutePath());
                file.delete();
            }
        }
        return arrayList;
    }

    private static File e(Context context) {
        return new File(h(context), l);
    }

    private static File f(Context context) {
        return new File(getExternalStorageDirectoryCompatible(context), "miband");
    }

    private static File g(Context context) {
        return new File(getExternalStorageDirectoryCompatible(context), d);
    }

    public static File getAppCacheDir(Context context) {
        return context.getExternalCacheDir();
    }

    public static File getAppDownLoadsDir(Context context) {
        return context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
    }

    public static File getAppFileDir(Context context) {
        return context.getExternalFilesDir("");
    }

    public static File getAppMusicDir(Context context) {
        return context.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
    }

    public static String getAtrialRawDataDir(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + n;
    }

    public static String getBaseLogDir() {
        return F.getFilesDir().getAbsolutePath() + "/log";
    }

    public static File getCachePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b(context).mkdirs();
        return new File(b(context), str);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        ?? r7 = 0;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        HMLog.e(a, "GetDataColumnFail", e);
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                r7 = context;
                if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        return null;
    }

    public static ContentValues getDocumentsContentValues() {
        ContentValues contentValues = new ContentValues();
        if (SdkVersionUtil.isQ()) {
            contentValues.put("relative_path", Environment.DIRECTORY_DOCUMENTS + File.separator + "mifit");
        }
        return contentValues;
    }

    public static ContentValues getDownloadsContentValues() {
        ContentValues contentValues = new ContentValues();
        if (SdkVersionUtil.isQ()) {
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + File.separator + "mifit");
        }
        return contentValues;
    }

    public static String getExternalFwDir() {
        File externalFilesDir = F.getExternalFilesDir(f);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public static File getExternalStorageDirectoryCompatible(Context context) {
        return SdkVersionUtil.isQ() ? context.getExternalFilesDir("") : Environment.getExternalStorageDirectory();
    }

    public static String getFileName(Uri uri) {
        String path;
        int iLastIndexOf;
        if (uri == null || (iLastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(iLastIndexOf + 1);
    }

    public static File getFilePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!s.exists()) {
            s.mkdir();
        }
        if (!u.exists()) {
            u.mkdir();
        }
        return new File(u, str);
    }

    public static String getFwDir(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(F.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(f);
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public static String getFwPath(String str, String str2) {
        return getFwDir(str) + File.separator + str2;
    }

    public static String getGpxLogDir() {
        return getBaseLogDir() + "/gpx";
    }

    public static File getLabPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!s.exists()) {
            s.mkdir();
        }
        if (!v.exists()) {
            v.mkdir();
        }
        return new File(v, str);
    }

    public static String getLogRootDir(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + c;
    }

    @TargetApi(19)
    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT >= 19) && DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if (z.equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + strArrSplit[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:")) {
                        return documentId.replaceFirst("raw:", "");
                    }
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e2) {
                        HMLog.e(a, "downloads path is ERROR!!!:" + e2.getMessage(), new Object[0]);
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
                return getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return uri.getPath();
    }

    public static ContentValues getPicturesContentValues() {
        ContentValues contentValues = new ContentValues();
        if (SdkVersionUtil.isQ()) {
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + "mifit");
        }
        return contentValues;
    }

    @Deprecated
    public static File getPicturesFile(String str) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "mifit");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file.getAbsolutePath(), str);
    }

    public static File getShareCacheFile(Context context, String str) {
        File file = new File(context.getExternalCacheDir(), "share");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file.getAbsolutePath(), str);
    }

    public static File getShareImagePath(Context context) {
        return getShareCacheFile(context, Calendar.getInstance().getTimeInMillis() + "_share.jpg");
    }

    public static String getSharingPath(Context context, String str) {
        return getFilePath(context, str).getAbsolutePath();
    }

    public static File getThumbPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!s.exists()) {
            s.mkdir();
        }
        if (!w.exists()) {
            w.mkdir();
            if (!x.exists()) {
                try {
                    x.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
        return new File(w, str);
    }

    public static File getTrainingDir() {
        if (F != null) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                y = F.getExternalFilesDir("training");
            } else {
                y = new File(F.getFilesDir(), "training");
            }
        }
        File file = y;
        if (file == null) {
            if (!s.exists()) {
                s.mkdir();
            }
            y = new File(s, "training");
        } else if (!file.exists()) {
            y.mkdir();
        }
        return y;
    }

    public static String getTrainingGaussBlurPath(String str) {
        return new File(getTrainingDir(), str).getAbsolutePath();
    }

    public static File getWatermarkFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!q.exists()) {
            q.mkdir();
        }
        if (!r.exists()) {
            r.mkdir();
        }
        return new File(r, str);
    }

    public static String getWatermarkPath(String str) {
        return getWatermarkFile(str).getAbsolutePath();
    }

    private static File h(Context context) {
        return new File(g(context), k);
    }

    private static File i(Context context) {
        return new File(g(context), "training");
    }

    public static void initAppContext(Context context) {
        F = context;
        k(context);
        File file = new File(getBaseLogDir());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(getGpxLogDir());
        if (file2.exists()) {
            return;
        }
        file2.mkdirs();
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static File j(Context context) {
        return new File(f(context), "miband");
    }

    private static void k(Context context) {
        p = getExternalStorageDirectoryCompatible(context);
        q = new File(p, "miband");
        r = new File(q, "miband");
        s = new File(p, d);
        t = new File(s, h);
        u = new File(s, "file");
        v = new File(s, j);
        w = new File(s, k);
        x = new File(w, l);
    }

    public static Uri saveBitmapToPictures(Context context, Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        OutputStream outputStreamOpenOutputStream = null;
        if (bitmap == null || str == null || str.isEmpty() || compressFormat == null) {
            return null;
        }
        ContentValues picturesContentValues = getPicturesContentValues();
        picturesContentValues.put("title", str);
        String str2 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + System.currentTimeMillis() + "." + compressFormat.name();
        picturesContentValues.put("_display_name", str2);
        picturesContentValues.put("mime_type", "image/" + compressFormat.name());
        if (!SdkVersionUtil.isQ()) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
            String str3 = File.separator;
            sb.append(str3);
            sb.append("mifit");
            sb.append(str3);
            File file = new File(sb.toString());
            file.mkdirs();
            picturesContentValues.put("_data", file.getAbsolutePath() + str3 + str2);
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, picturesContentValues);
        try {
            if (uriInsert != null) {
                try {
                    try {
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                        return uriInsert;
                    }
                } catch (Throwable th) {
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            if (outputStreamOpenOutputStream != null) {
                bitmap.compress(compressFormat, 100, outputStreamOpenOutputStream);
            }
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.close();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return uriInsert;
    }

    public static String saveFile(InputStream inputStream, String str, String str2) throws Exception {
        String str3 = str + File.separator + str2;
        File file = new File(str3);
        HMLog.e(a, "saveFile start: " + file.getAbsolutePath(), new Object[0]);
        if (file.exists()) {
            file.delete();
        } else {
            File parentFile = file.getParentFile();
            HMLog.e(a, "create: " + (parentFile != null ? parentFile.mkdirs() : false), new Object[0]);
        }
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                fileOutputStream.close();
                HMLog.e(a, "saveFile:" + str3, new Object[0]);
                return str3;
            }
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0102 A[Catch: all -> 0x00fc, IOException -> 0x00fe, TryCatch #3 {IOException -> 0x00fe, blocks: (B:24:0x00f7, B:30:0x0102, B:31:0x0106, B:33:0x010d, B:34:0x0112), top: B:56:0x00f7, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x010d A[Catch: all -> 0x00fc, IOException -> 0x00fe, LOOP:0: B:31:0x0106->B:33:0x010d, LOOP_END, TryCatch #3 {IOException -> 0x00fe, blocks: (B:24:0x00f7, B:30:0x0102, B:31:0x0106, B:33:0x010d, B:34:0x0112), top: B:56:0x00f7, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x012c A[Catch: IOException -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0130, blocks: (B:47:0x012c, B:38:0x011b, B:24:0x00f7, B:30:0x0102, B:31:0x0106, B:33:0x010d, B:34:0x0112), top: B:55:0x00f5, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0112 A[EDGE_INSN: B:58:0x0112->B:34:0x0112 BREAK  A[LOOP:0: B:31:0x0106->B:33:0x010d], SYNTHETIC] */
    @RequiresApi(api = 29)
    public static Uri saveFileToPublicStorage(Context context, boolean z2, InputStream inputStream, String str, String str2) {
        ContentValues documentsContentValues;
        byte[] bArr;
        int i2;
        OutputStream outputStreamOpenOutputStream = null;
        if (inputStream == null || str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            return null;
        }
        String str3 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + System.currentTimeMillis() + "." + str2;
        if (z2) {
            documentsContentValues = getDownloadsContentValues();
            if (!SdkVersionUtil.isQ()) {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                String str4 = File.separator;
                sb.append(str4);
                sb.append("mifit");
                sb.append(str4);
                File file = new File(sb.toString());
                file.mkdirs();
                documentsContentValues.put("_data", file.getAbsolutePath() + str4 + str3);
            }
        } else {
            documentsContentValues = getDocumentsContentValues();
            if (!SdkVersionUtil.isQ()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath());
                String str5 = File.separator;
                sb2.append(str5);
                sb2.append("mifit");
                sb2.append(str5);
                File file2 = new File(sb2.toString());
                file2.mkdirs();
                documentsContentValues.put("_data", file2.getAbsolutePath() + str5 + str3);
            }
        }
        documentsContentValues.put("title", str);
        documentsContentValues.put("_display_name", str3);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = z2 ? contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, documentsContentValues) : contentResolver.insert(MediaStore.Files.getContentUri("external"), documentsContentValues);
        try {
            try {
                if (uriInsert != null) {
                    try {
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        if (outputStreamOpenOutputStream != null) {
                            bArr = new byte[4096];
                            while (true) {
                                i2 = inputStream.read(bArr);
                                if (i2 != -1) {
                                    break;
                                }
                                outputStreamOpenOutputStream.write(bArr, 0, i2);
                            }
                            outputStreamOpenOutputStream.flush();
                        }
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                    }
                } else {
                    if (outputStreamOpenOutputStream != null) {
                        bArr = new byte[4096];
                        while (true) {
                            i2 = inputStream.read(bArr);
                            if (i2 != -1) {
                                break;
                                break;
                            }
                            outputStreamOpenOutputStream.write(bArr, 0, i2);
                        }
                        outputStreamOpenOutputStream.flush();
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return uriInsert;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static void copyFile(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[2097152];
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 == -1) {
                fileOutputStream.close();
                fileInputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i2);
        }
    }

    public static File getAppCacheDir(Context context, String str, String str2) {
        File file = new File(context.getExternalCacheDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static File getAppFileDir(Context context, String str) {
        return context.getExternalFilesDir(str);
    }

    public static String getSharingPath(String str) {
        return getFilePath(str).getAbsolutePath();
    }

    public static File getCachePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!s.exists()) {
            s.mkdir();
        }
        if (!t.exists()) {
            t.mkdir();
        }
        return new File(t, str);
    }

    public static File getFilePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c(context).mkdirs();
        HMLog.e(a, "getFilePath  " + c(context).exists(), new Object[0]);
        return new File(c(context), str);
    }
}
