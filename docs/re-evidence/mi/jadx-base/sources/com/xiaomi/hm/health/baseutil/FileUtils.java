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
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.le;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FileUtils {
    private static final String ARTRIAL_FIB_FILE_NAME = "atrial_fib";
    private static File CACHE_DIR = null;
    private static final String CACHE_DIR_NAME = "cache";
    private static final String CACHE_ROOT_DIR = ".miband";
    private static File EXTERNAL_STORAGE_DIR = null;
    private static File FILE_DIR = null;
    private static final String FILE_DIR_NAME = "file";
    private static final String FILE_FIRMWARE = "firmware";
    private static final String FILE_ROOT_DIR = "miband";
    private static final String GPX_LOG_FILE_NAME = "gpx";
    private static final String KEY_AUDIO = "audio";
    private static final String KEY_CONTENT = "content";
    private static final String KEY_FILE = "file";
    private static final String KEY_IMAGE = "image";
    private static final String KEY_PRIMARY = "primary";
    private static final String KEY_VIDEO = "video";
    private static File LAB_DIR = null;
    private static final String LAB_DIR_NAME = "lab";
    private static File NO_MEDIA_FILE = null;
    private static final String NO_MEDIA_FILE_NAME = ".nomedia";
    private static File ROOT_DIR = null;
    private static File ROOT_HIDE_DIR = null;
    private static final String ROOT_LOG_FOLD_NAME = "log";
    private static final String SHARE_FILE_NAME = "share.jpg";
    private static final String TAG = "FileUtils";
    private static File THUMB_DIR = null;
    private static final String THUMB_DIR_NAME = "thumb";
    private static final String TRAINING_FILE_NAME = "training";
    private static File WATERMARK_DIR = null;
    private static final String WATERMARK_DIR_NAME = "miband";
    private static Context appContext;
    private static File trainingDir;

    private FileUtils() {
    }

    public static File copyAssetFileToDest(AssetManager assetManager, String str, File file, String str2) throws IOException {
        InputStream inputStreamOpen = assetManager.open("discovery/" + str);
        File file2 = new File(file, str2);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[2097152];
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i == -1) {
                fileOutputStream.close();
                inputStreamOpen.close();
                return file2;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    public static void copyDir(String str, String str2) throws IOException {
        File file = new File(str);
        String[] list = file.list();
        File[] fileArrListFiles = file.listFiles();
        if (!new File(str2).exists()) {
            new File(str2).mkdir();
        }
        for (int i = 0; i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str3 = File.separator;
                sb.append(str3);
                sb.append(list[i]);
                copyDir(sb.toString(), str2 + str3 + list[i]);
            } else if (fileArrListFiles[i].isFile()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append(list[i]);
                copyFile(sb2.toString(), str2 + str4 + list[i]);
            }
        }
    }

    public static void copyFile(String str, String str2) throws IOException {
        copyFile(new File(str), new File(str2));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    private static String createFileFromUri(Context context, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        String str = getExternalStorageDirectoryCompatible(context).getAbsolutePath() + File.separator + "temp";
        ?? r1 = 0;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    String strSaveFile = saveFile(inputStreamOpenInputStream, str, getFileName(uri));
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    return strSaveFile;
                } catch (Exception e) {
                    e = e;
                    le.b(TAG, "createFileFromUri Exception:" + e.getMessage(), new Object[0]);
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
                r1 = context;
                if (r1 != 0) {
                    try {
                        r1.close();
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
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
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
        } catch (Exception e) {
            e.printStackTrace();
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
        if (!ROOT_DIR.exists()) {
            ROOT_DIR.mkdir();
        }
        if (!WATERMARK_DIR.exists()) {
            WATERMARK_DIR.mkdir();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : WATERMARK_DIR.listFiles()) {
            if (file.getName().startsWith(str)) {
                arrayList.add(file.getAbsolutePath());
                file.delete();
            }
        }
        return arrayList;
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
        return context.getFilesDir().getAbsolutePath() + File.separator + ARTRIAL_FIB_FILE_NAME;
    }

    public static String getBaseLogDir() {
        return appContext.getFilesDir().getAbsolutePath() + "/log";
    }

    private static File getCacheDir(Context context) {
        return new File(getRootHideDir(context), "cache");
    }

    public static File getCachePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        getCacheDir(context).mkdirs();
        return new File(getCacheDir(context), str);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[PHI: r8
      0x0043: PHI (r8v4 android.database.Cursor) = (r8v3 android.database.Cursor), (r8v5 android.database.Cursor) binds: [B:21:0x0041, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        le.b(TAG, "GetDataColumnFail", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
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
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
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
        File externalFilesDir = appContext.getExternalFilesDir(FILE_FIRMWARE);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public static File getExternalStorageDirectoryCompatible(Context context) {
        return SdkVersionUtil.isQ() ? context.getExternalFilesDir("") : Environment.getExternalStorageDirectory();
    }

    private static File getFileDir(Context context) {
        return new File(getRootHideDir(context), "file");
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
        if (!ROOT_HIDE_DIR.exists()) {
            ROOT_HIDE_DIR.mkdir();
        }
        if (!FILE_DIR.exists()) {
            FILE_DIR.mkdir();
        }
        return new File(FILE_DIR, str);
    }

    public static String getFwDir(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(appContext.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(FILE_FIRMWARE);
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

    private static File getLabDir(Context context) {
        return new File(getRootHideDir(context), LAB_DIR_NAME);
    }

    public static File getLabPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_HIDE_DIR.exists()) {
            ROOT_HIDE_DIR.mkdir();
        }
        if (!LAB_DIR.exists()) {
            LAB_DIR.mkdir();
        }
        return new File(LAB_DIR, str);
    }

    public static String getLogRootDir(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + ROOT_LOG_FOLD_NAME;
    }

    private static File getNoMediaFile(Context context) {
        return new File(getThumbDir(context), NO_MEDIA_FILE_NAME);
    }

    @TargetApi(19)
    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if (KEY_PRIMARY.equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:")) {
                        return documentId.replaceFirst("raw:", "");
                    }
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e) {
                        le.b(TAG, "downloads path is ERROR!!!:" + e.getMessage(), new Object[0]);
                        return createFileFromUri(context, uri);
                    }
                }
                if (isMediaDocument(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = strArrSplit2[0];
                    if (KEY_IMAGE.equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (KEY_VIDEO.equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (KEY_AUDIO.equals(str)) {
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

    private static File getRootDir(Context context) {
        return new File(getExternalStorageDirectoryCompatible(context), "miband");
    }

    private static File getRootHideDir(Context context) {
        return new File(getExternalStorageDirectoryCompatible(context), CACHE_ROOT_DIR);
    }

    public static File getShareCacheFile(Context context, String str) {
        File file = new File(context.getExternalCacheDir(), "share");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file.getAbsolutePath(), str);
    }

    public static File getShareImagePath(Context context) {
        return getShareCacheFile(context, Calendar.getInstance().getTimeInMillis() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + SHARE_FILE_NAME);
    }

    public static String getSharingPath(Context context, String str) {
        return getFilePath(context, str).getAbsolutePath();
    }

    private static File getThumbDir(Context context) {
        return new File(getRootHideDir(context), THUMB_DIR_NAME);
    }

    public static File getThumbPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_HIDE_DIR.exists()) {
            ROOT_HIDE_DIR.mkdir();
        }
        if (!THUMB_DIR.exists()) {
            THUMB_DIR.mkdir();
            if (!NO_MEDIA_FILE.exists()) {
                try {
                    NO_MEDIA_FILE.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
        return new File(THUMB_DIR, str);
    }

    public static File getTrainingDir() {
        if (appContext != null) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                trainingDir = appContext.getExternalFilesDir(TRAINING_FILE_NAME);
            } else {
                trainingDir = new File(appContext.getFilesDir(), TRAINING_FILE_NAME);
            }
        }
        File file = trainingDir;
        if (file == null) {
            if (!ROOT_HIDE_DIR.exists()) {
                ROOT_HIDE_DIR.mkdir();
            }
            trainingDir = new File(ROOT_HIDE_DIR, TRAINING_FILE_NAME);
        } else if (!file.exists()) {
            trainingDir.mkdir();
        }
        return trainingDir;
    }

    public static String getTrainingGaussBlurPath(String str) {
        return new File(getTrainingDir(), str).getAbsolutePath();
    }

    private static File getTrainingRootDir(Context context) {
        return new File(getRootHideDir(context), TRAINING_FILE_NAME);
    }

    private static File getWatermarkDir(Context context) {
        return new File(getRootDir(context), "miband");
    }

    public static File getWatermarkFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_DIR.exists()) {
            ROOT_DIR.mkdir();
        }
        if (!WATERMARK_DIR.exists()) {
            WATERMARK_DIR.mkdir();
        }
        return new File(WATERMARK_DIR, str);
    }

    public static String getWatermarkPath(String str) {
        return getWatermarkFile(str).getAbsolutePath();
    }

    public static void initAppContext(Context context) {
        appContext = context;
        initFiles(context);
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

    private static void initFiles(Context context) {
        EXTERNAL_STORAGE_DIR = getExternalStorageDirectoryCompatible(context);
        ROOT_DIR = new File(EXTERNAL_STORAGE_DIR, "miband");
        WATERMARK_DIR = new File(ROOT_DIR, "miband");
        ROOT_HIDE_DIR = new File(EXTERNAL_STORAGE_DIR, CACHE_ROOT_DIR);
        CACHE_DIR = new File(ROOT_HIDE_DIR, "cache");
        FILE_DIR = new File(ROOT_HIDE_DIR, "file");
        LAB_DIR = new File(ROOT_HIDE_DIR, LAB_DIR_NAME);
        THUMB_DIR = new File(ROOT_HIDE_DIR, THUMB_DIR_NAME);
        NO_MEDIA_FILE = new File(THUMB_DIR, NO_MEDIA_FILE_NAME);
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

    public static Uri saveBitmapToPictures(Context context, Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        OutputStream outputStreamOpenOutputStream = null;
        if (bitmap == null || str == null || str.isEmpty() || compressFormat == null) {
            return null;
        }
        ContentValues picturesContentValues = getPicturesContentValues();
        picturesContentValues.put("title", str);
        String str2 = str + "-" + System.currentTimeMillis() + "." + compressFormat.name();
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
                    } catch (IOException e) {
                        e.printStackTrace();
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                        return uriInsert;
                    }
                } catch (Throwable th) {
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
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
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return uriInsert;
    }

    public static String saveFile(InputStream inputStream, String str, String str2) throws IOException {
        String str3 = str + File.separator + str2;
        File file = new File(str3);
        le.b(TAG, "saveFile start: " + file.getAbsolutePath(), new Object[0]);
        if (file.exists()) {
            file.delete();
        } else {
            File parentFile = file.getParentFile();
            le.b(TAG, "create: " + (parentFile != null ? parentFile.mkdirs() : false), new Object[0]);
        }
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                fileOutputStream.close();
                le.b(TAG, "saveFile:" + str3, new Object[0]);
                return str3;
            }
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0104 A[Catch: all -> 0x00fe, IOException -> 0x0100, TryCatch #2 {IOException -> 0x0100, blocks: (B:24:0x00f9, B:30:0x0104, B:31:0x0108, B:33:0x010f, B:34:0x0114), top: B:57:0x00f9, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x010f A[Catch: all -> 0x00fe, IOException -> 0x0100, LOOP:0: B:31:0x0108->B:33:0x010f, LOOP_END, TryCatch #2 {IOException -> 0x0100, blocks: (B:24:0x00f9, B:30:0x0104, B:31:0x0108, B:33:0x010f, B:34:0x0114), top: B:57:0x00f9, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0130 A[Catch: IOException -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0121, blocks: (B:49:0x0130, B:38:0x011d, B:24:0x00f9, B:30:0x0104, B:31:0x0108, B:33:0x010f, B:34:0x0114), top: B:56:0x00f7, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[EDGE_INSN: B:60:0x0114->B:34:0x0114 BREAK  A[LOOP:0: B:31:0x0108->B:33:0x010f], SYNTHETIC] */
    @RequiresApi(api = 29)
    public static Uri saveFileToPublicStorage(Context context, boolean z, InputStream inputStream, String str, String str2) {
        ContentValues documentsContentValues;
        byte[] bArr;
        int i;
        OutputStream outputStreamOpenOutputStream = null;
        if (inputStream == null || str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            return null;
        }
        String str3 = str + "-" + System.currentTimeMillis() + "." + str2;
        if (z) {
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
        Uri uriInsert = z ? contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, documentsContentValues) : contentResolver.insert(MediaStore.Files.getContentUri("external"), documentsContentValues);
        try {
            if (uriInsert != null) {
                try {
                    try {
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        if (outputStreamOpenOutputStream != null) {
                            bArr = new byte[4096];
                            while (true) {
                                i = inputStream.read(bArr);
                                if (i != -1) {
                                    break;
                                }
                                outputStreamOpenOutputStream.write(bArr, 0, i);
                            }
                            outputStreamOpenOutputStream.flush();
                        }
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                    }
                } catch (Throwable th) {
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
            } else {
                if (outputStreamOpenOutputStream != null) {
                    bArr = new byte[4096];
                    while (true) {
                        i = inputStream.read(bArr);
                        if (i != -1) {
                            break;
                            break;
                        }
                        outputStreamOpenOutputStream.write(bArr, 0, i);
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
    }

    public static void copyFile(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[2097152];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                fileOutputStream.close();
                fileInputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
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
        if (!ROOT_HIDE_DIR.exists()) {
            ROOT_HIDE_DIR.mkdir();
        }
        if (!CACHE_DIR.exists()) {
            CACHE_DIR.mkdir();
        }
        return new File(CACHE_DIR, str);
    }

    public static File getFilePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        getFileDir(context).mkdirs();
        le.b(TAG, "getFilePath  " + getFileDir(context).exists(), new Object[0]);
        return new File(getFileDir(context), str);
    }
}
