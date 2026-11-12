package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import coil.util.Utils;
import com.tencent.mmkv.MMKV;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.mime.MimeUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MediaStoreUtil {
    public static final int CODE_INSERT_TO_PHOTO_ALBUM_ERROR = -3;
    public static final int CODE_INTERNAL_ERROR = -1000;
    public static final int CODE_INVALID_ALBUM = -5;
    public static final int CODE_INVALID_PATH = -1;
    public static final int CODE_MEDIA_TYPE_NOT_SUPPORT = -8;
    public static final int CODE_QUERY_ALBUM_ERROR = -4;
    public static final int CODE_READ_IMG_METADATA_ERROR = -6;
    public static final int CODE_READ_VIDEO_METADATA_ERROR = -7;
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_WRITE_FILE_ERROR = -2;
    public static final String[] QUERYABLE_DOCUMENT_TYPE;
    private static Set<String> QUERYABLE_DOCUMENT_TYPE_SET = null;
    private static final String TAG = "MediaStoreUtil";

    @RequiresApi(api = 8)
    private static final String DIRECTORY_PICTURES = Environment.DIRECTORY_DCIM;
    private static long initTimeStamp = -1;

    public static class AccessMediaError extends RuntimeException {
        private int mErrorCode;

        public AccessMediaError(int i) {
            this(i, "");
        }

        public int getErrorCode() {
            return this.mErrorCode;
        }

        public AccessMediaError(int i, String str) {
            super(str);
            this.mErrorCode = i;
        }

        public AccessMediaError(int i, Throwable th) {
            super(th);
            this.mErrorCode = i;
        }
    }

    public static class AlbumInfo {
        public String albumID;
        public String name;
        public int size;
        public MediaInfo thumb;
    }

    public static class MediaInfo {
        public static final String DISPLAY_NAME = "displayName";
        public static final String KEY_MIME_TYPE = "mediaType";
        public static final String KEY_MODIFY_DATE = "modificationDate";
        public static final String KEY_URL = "url";
        protected static final int MIME_TYPE_AUDIO = 3;
        protected static final int MIME_TYPE_IMAGE = 1;
        protected static final int MIME_TYPE_UNKNOWN = 0;
        protected static final int MIME_TYPE_VIDEO = 2;
        public static final String NAME = "name";
        public static final String PHOTO_KEY_CREATE_DATE = "creationDate";
        public static final String PHOTO_KEY_DURATION = "duration";
        public static final String PHOTO_KEY_HEIGHT = "pixelHeight";
        public static final String PHOTO_KEY_WIDTH = "pixelWidth";
        public static final String RELATIVE_PATH = "relativePath";
        public static final String SIZE = "size";
        public int dateModified;
        public int dateTaken;
        public String displayName;
        public int duration;
        public int fileSize;
        public int height;
        public int id;
        public String mimeType;
        public String name;
        public String relativePath;
        public String url;
        public int width;
    }

    static {
        String[] strArr = {"application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "text/text", "text/html", "text/xml", Utils.MIME_TYPE_JPEG, "image/png", "image/bmp", "image/gif"};
        QUERYABLE_DOCUMENT_TYPE = strArr;
        QUERYABLE_DOCUMENT_TYPE_SET = new HashSet(Arrays.asList(strArr));
    }

    @RequiresApi(api = 10)
    public static int deleteMedia(Context context, String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            throw new AccessMediaError(-1);
        }
        if (MiuiCursorConstants.CONTENT.equals(Uri.parse(str).getScheme())) {
            return deleteMedia(context, Uri.parse(str));
        }
        ContentResolver contentResolver = context.getContentResolver();
        String[] strArr = {str};
        if (isImage(str)) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            if (!isVideo(str)) {
                throw new AccessMediaError(-8);
            }
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        int iDelete = contentResolver.delete(uri, "_data= ? ", strArr);
        contentResolver.notifyChange(uri, null);
        return iDelete;
    }

    public static int deleteMediaByPath(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        isImage(str);
        stringBuffer.append("_data");
        stringBuffer.append("=");
        stringBuffer.append("'" + str + "'");
        stringBuffer.append(")");
        Cursor cursorQuery = contentResolver.query(isImage(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, stringBuffer.toString(), null, null);
        cursorQuery.moveToFirst();
        int i = 0;
        while (!cursorQuery.isAfterLast()) {
            isImage(str);
            i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
            cursorQuery.moveToNext();
        }
        return deleteMedia(context, Uri.parse((isImage(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI).toString() + File.separator + i));
    }

    public static String[] filterInvalidFileType(List<String> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (isQueryableFileType(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @RequiresApi(api = 8)
    public static List<AlbumInfo> getAlbumInfo(Context context) throws AccessMediaError {
        int i = 1;
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_id", "_data", "_display_name", "date_modified", "mime_type", "width", "height", "_size", "duration", "datetaken", "bucket_id", "bucket_display_name"}, "(media_type=? OR media_type=?) AND _size>0", new String[]{String.valueOf(1), String.valueOf(3)}, "date_modified DESC");
        if (cursorQuery == null) {
            throw new AccessMediaError(-4);
        }
        int columnIndex = cursorQuery.getColumnIndex("_id");
        int columnIndex2 = cursorQuery.getColumnIndex("_data");
        int columnIndex3 = cursorQuery.getColumnIndex("mime_type");
        int columnIndex4 = cursorQuery.getColumnIndex("width");
        int columnIndex5 = cursorQuery.getColumnIndex("height");
        int columnIndex6 = cursorQuery.getColumnIndex("datetaken");
        int columnIndex7 = cursorQuery.getColumnIndex("date_modified");
        int columnIndex8 = cursorQuery.getColumnIndex("duration");
        int columnIndex9 = cursorQuery.getColumnIndex("bucket_id");
        int columnIndex10 = cursorQuery.getColumnIndex("bucket_display_name");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            String string = cursorQuery.getString(columnIndex2);
            String string2 = cursorQuery.getString(columnIndex3);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                File file = new File(string);
                if (file.exists() && file.isFile()) {
                    String string3 = cursorQuery.getString(columnIndex9);
                    if (!TextUtils.isEmpty(string3)) {
                        AlbumInfo albumInfo = (AlbumInfo) linkedHashMap.get(string3);
                        if (albumInfo == null) {
                            albumInfo = new AlbumInfo();
                            String string4 = cursorQuery.getString(columnIndex10);
                            albumInfo.albumID = string3;
                            albumInfo.name = string4;
                            linkedHashMap.put(string3, albumInfo);
                        }
                        albumInfo.size += i;
                        MediaInfo mediaInfo = albumInfo.thumb;
                        int i2 = cursorQuery.getInt(columnIndex7);
                        if (mediaInfo == null || i2 > mediaInfo.dateModified) {
                            MediaInfo mediaInfo2 = new MediaInfo();
                            mediaInfo2.id = cursorQuery.getInt(columnIndex);
                            String string5 = cursorQuery.getString(columnIndex3);
                            mediaInfo2.mimeType = string5;
                            mediaInfo2.url = ContentUris.withAppendedId(string5.contains("video") ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, mediaInfo2.id).toString();
                            mediaInfo2.width = cursorQuery.getInt(columnIndex4);
                            mediaInfo2.height = cursorQuery.getInt(columnIndex5);
                            mediaInfo2.dateTaken = getDateTaken(cursorQuery, columnIndex6);
                            mediaInfo2.dateModified = i2;
                            mediaInfo2.duration = cursorQuery.getInt(columnIndex8);
                            albumInfo.thumb = mediaInfo2;
                        }
                        i = 1;
                        columnIndex = columnIndex;
                        columnIndex2 = columnIndex2;
                    }
                }
            }
        }
        cursorQuery.close();
        return new ArrayList(linkedHashMap.values());
    }

    private static int getDateTaken(Cursor cursor, int i) {
        if (cursor == null) {
            return ((int) new Date().getTime()) / 1000;
        }
        long j = cursor.getLong(i);
        int i2 = (int) j;
        return j == ((long) i2) ? i2 : (int) (j / 1000);
    }

    public static String[] getExeNameByMimeType(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new String[0];
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = MimeUtils.guessExtensionFromMimeType(strArr[i]);
        }
        return strArr2;
    }

    @RequiresApi(api = 8)
    public static List<MediaInfo> getImageAndVideoByAlbumId(Context context, String str) throws AccessMediaError {
        if (TextUtils.isEmpty(str)) {
            throw new AccessMediaError(-5);
        }
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_id", "_data", "_display_name", "date_modified", "mime_type", "width", "height", "_size", "duration", "datetaken"}, "(media_type=? OR media_type=?) AND _size>0 AND bucket_id=?", new String[]{String.valueOf(1), String.valueOf(3), str}, "date_modified DESC");
        if (cursorQuery == null) {
            throw new AccessMediaError(-4);
        }
        int columnIndex = cursorQuery.getColumnIndex("_id");
        int columnIndex2 = cursorQuery.getColumnIndex("_data");
        int columnIndex3 = cursorQuery.getColumnIndex("mime_type");
        int columnIndex4 = cursorQuery.getColumnIndex("width");
        int columnIndex5 = cursorQuery.getColumnIndex("height");
        int columnIndex6 = cursorQuery.getColumnIndex("datetaken");
        int columnIndex7 = cursorQuery.getColumnIndex("date_modified");
        int columnIndex8 = cursorQuery.getColumnIndex("duration");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            String string = cursorQuery.getString(columnIndex2);
            String string2 = cursorQuery.getString(columnIndex3);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                File file = new File(string);
                if (file.exists() && file.isFile()) {
                    MediaInfo mediaInfo = new MediaInfo();
                    mediaInfo.id = cursorQuery.getInt(columnIndex);
                    String string3 = cursorQuery.getString(columnIndex3);
                    mediaInfo.mimeType = string3;
                    mediaInfo.url = ContentUris.withAppendedId(string3.contains("video") ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, mediaInfo.id).toString();
                    mediaInfo.width = cursorQuery.getInt(columnIndex4);
                    mediaInfo.height = cursorQuery.getInt(columnIndex5);
                    mediaInfo.dateTaken = getDateTaken(cursorQuery, columnIndex6);
                    mediaInfo.dateModified = cursorQuery.getInt(columnIndex7);
                    mediaInfo.duration = cursorQuery.getInt(columnIndex8);
                    arrayList.add(mediaInfo);
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static void getInitTimeStamp() {
        initTimeStamp = MMKV.G(SharePrefsManager.SP_KEY_MEDIA_STORE_INIT_TIME, 2).getLong(SharePrefsManager.SP_KEY_MEDIA_STORE_INIT_TIME, -1L);
    }

    public static void initTimeStamp() {
        MMKV mmkvG = MMKV.G(SharePrefsManager.SP_KEY_MEDIA_STORE_INIT_TIME, 2);
        if (mmkvG.getLong(SharePrefsManager.SP_KEY_MEDIA_STORE_INIT_TIME, -1L) == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            mmkvG.putLong(SharePrefsManager.SP_KEY_MEDIA_STORE_INIT_TIME, jCurrentTimeMillis);
            MiJiaLog.writeLogOnAll(LogType.CAMERA, TAG, "checkIsFirstInstall initTimeStamp == now ==" + jCurrentTimeMillis);
        }
    }

    @RequiresApi(api = 8)
    public static void insertImage(Context context, String str, String str2, String str3) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            throw new AccessMediaError(-1);
        }
        if (!new File(str).exists()) {
            throw new AccessMediaError(-1);
        }
        MediaInfo imageInfo = parseImageInfo(str);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ContentValues contentValues = new ContentValues();
        contentValues.put("width", Integer.valueOf(imageInfo.width));
        contentValues.put("height", Integer.valueOf(imageInfo.height));
        contentValues.put("mime_type", imageInfo.mimeType);
        contentValues.put("_display_name", str3);
        contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("datetaken", Long.valueOf(jCurrentTimeMillis));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (!TextUtils.isEmpty(str2)) {
                contentValues.put("relative_path", DIRECTORY_PICTURES + File.separator + str2);
            }
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("date_expires", Long.valueOf((System.currentTimeMillis() + 86400000) / 1000));
        } else if (!TextUtils.isEmpty(str2)) {
            File file = new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_PICTURES), str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            contentValues.put("_data", new File(file, str3).getAbsolutePath());
        }
        try {
            Uri uriInsert = contentResolver.insert(uri, contentValues);
            if (uriInsert == null) {
                MiJiaLog.onlyLogcat(6, TAG, "insertImage error,pendingUri=null");
                throw new AccessMediaError(-3);
            }
            try {
                FileUtils.copy(new FileInputStream(str), contentResolver.openOutputStream(uriInsert));
                if (i >= 29) {
                    contentValues.put("is_pending", (Integer) 0);
                    contentValues.putNull("date_expires");
                    contentResolver.update(uriInsert, contentValues, null, null);
                }
            } catch (IOException e) {
                contentResolver.delete(uriInsert, null, null);
                MiJiaLog.onlyLogcat(6, TAG, "insertImage error:" + Log.getStackTraceString(e));
                throw new AccessMediaError(-2);
            }
        } catch (Exception e2) {
            MiJiaLog.onlyLogcat(6, TAG, "insertImage error,resolver.insert exception:" + e2.getMessage());
            throw new AccessMediaError(-3);
        }
    }

    @RequiresApi(api = 10)
    public static Uri insertVideo(Context context, String str, String str2, String str3) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            throw new AccessMediaError(-1);
        }
        if (!new File(str).exists()) {
            throw new AccessMediaError(-1);
        }
        MediaInfo videoInfo = parseVideoInfo(str);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        ContentValues contentValues = new ContentValues();
        contentValues.put("width", Integer.valueOf(videoInfo.width));
        contentValues.put("height", Integer.valueOf(videoInfo.height));
        contentValues.put("mime_type", videoInfo.mimeType);
        contentValues.put("duration", Integer.valueOf(videoInfo.duration));
        contentValues.put("_display_name", str3);
        contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("datetaken", Long.valueOf(jCurrentTimeMillis));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (!TextUtils.isEmpty(str2)) {
                contentValues.put("relative_path", DIRECTORY_PICTURES + File.separator + str2);
            }
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("date_expires", Long.valueOf((System.currentTimeMillis() + 86400000) / 1000));
        } else if (!TextUtils.isEmpty(str2)) {
            File file = new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_PICTURES), str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            contentValues.put("_data", new File(file, str3).getAbsolutePath());
        }
        try {
            Uri uriInsert = contentResolver.insert(uri, contentValues);
            if (uriInsert == null) {
                MiJiaLog.onlyLogcat(6, TAG, "insertVideo error,pendingUri=null");
                throw new AccessMediaError(-3);
            }
            try {
                FileUtils.copy(new FileInputStream(str), contentResolver.openOutputStream(uriInsert));
                if (i >= 29) {
                    contentValues.put("is_pending", (Integer) 0);
                    contentValues.putNull("date_expires");
                    contentResolver.update(uriInsert, contentValues, null, null);
                }
                return uriInsert;
            } catch (IOException unused) {
                contentResolver.delete(uriInsert, null, null);
                throw new AccessMediaError(-2);
            }
        } catch (Exception e) {
            MiJiaLog.onlyLogcat(6, TAG, "insertVideo error,resolver.insert exception:" + e.getMessage());
            throw new AccessMediaError(-3);
        }
    }

    public static boolean isImage(String str) {
        try {
            MediaInfo imageInfo = parseImageInfo(str);
            return (imageInfo == null || TextUtils.isEmpty(imageInfo.mimeType) || !imageInfo.mimeType.startsWith("image/")) ? false : true;
        } catch (AccessMediaError e) {
            MiJiaLog.onlyLogcat(5, TAG, Log.getStackTraceString(e));
            return false;
        }
    }

    public static boolean isPublicMediaFiles(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {Environment.DIRECTORY_MUSIC, Environment.DIRECTORY_PICTURES, Environment.DIRECTORY_MOVIES, Environment.DIRECTORY_DOWNLOADS, Environment.DIRECTORY_DCIM};
        for (int i = 0; i < 5; i++) {
            if (str.startsWith(Environment.getExternalStoragePublicDirectory(strArr[i]).getAbsolutePath())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isQueryableFileType(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return QUERYABLE_DOCUMENT_TYPE_SET.contains(str);
    }

    public static boolean isReadableExternalPath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("content://")) {
            return true;
        }
        if (str.startsWith("file://")) {
            str = str.substring(7);
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || TextUtils.isEmpty(externalCacheDir.getParent()) || !str.startsWith(externalCacheDir.getParent())) {
            return isPublicMediaFiles(str);
        }
        return true;
    }

    @RequiresApi(api = 10)
    public static boolean isVideo(String str) {
        try {
            MediaInfo videoInfo = parseVideoInfo(str);
            return (videoInfo == null || TextUtils.isEmpty(videoInfo.mimeType) || !videoInfo.mimeType.startsWith("video/")) ? false : true;
        } catch (AccessMediaError e) {
            MiJiaLog.onlyLogcat(5, TAG, Log.getStackTraceString(e));
            return false;
        }
    }

    public static MediaInfo parseImageInfo(String str) throws AccessMediaError {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            MediaInfo mediaInfo = new MediaInfo();
            mediaInfo.width = options.outWidth;
            mediaInfo.height = options.outHeight;
            mediaInfo.mimeType = options.outMimeType;
            return mediaInfo;
        } catch (Throwable th) {
            throw new AccessMediaError(-6, th);
        }
    }

    @RequiresApi(api = 10)
    public static MediaInfo parseVideoInfo(String str) {
        try {
            MediaInfo mediaInfo = new MediaInfo();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            mediaInfo.width = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            mediaInfo.height = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            mediaInfo.mimeType = mediaMetadataRetriever.extractMetadata(12);
            mediaInfo.duration = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            mediaMetadataRetriever.release();
            return mediaInfo;
        } catch (Throwable th) {
            throw new AccessMediaError(-7, th);
        }
    }

    @RequiresApi(api = 11)
    public static List<MediaInfo> queryFile(Context context, String[] strArr, int i, int i2) {
        String[] strArr2;
        String string;
        String[] strArr3;
        String str;
        Cursor cursorQuery;
        if (strArr == null || strArr.length == 0) {
            return new ArrayList();
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            String[] strArr4 = {"_id", "relative_path", "mime_type", "date_modified", "_size", "title", "_display_name"};
            StringBuilder sb = new StringBuilder();
            sb.append("mime_type");
            sb.append(" IN ( ");
            while (i3 < strArr.length) {
                sb.append("?");
                if (i3 < strArr.length - 1) {
                    sb.append(",");
                }
                i3++;
            }
            sb.append(")");
            strArr2 = strArr;
            strArr3 = strArr4;
            string = sb.toString();
        } else {
            String[] strArr5 = {"_id", "_data", "mime_type", "date_modified", "_size", "title", "_display_name"};
            String[] exeNameByMimeType = getExeNameByMimeType(strArr);
            StringBuilder sb2 = new StringBuilder();
            strArr2 = new String[exeNameByMimeType.length];
            while (i3 < strArr.length) {
                if (!TextUtils.isEmpty(exeNameByMimeType[i3])) {
                    sb2.append("_data LIKE ? ");
                    if (i3 < strArr.length - 1) {
                        sb2.append(" or ");
                    }
                    strArr2[i3] = "%." + exeNameByMimeType[i3];
                }
                i3++;
            }
            string = sb2.toString();
            strArr3 = strArr5;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Bundle bundle = new Bundle();
            if (i > 0) {
                bundle.putInt("android:query-arg-offset", i2);
                bundle.putInt("android:query-arg-limit", i);
            }
            bundle.putString("android:query-arg-sql-sort-order", "date_added DESC");
            bundle.putString("android:query-arg-sql-selection", string);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr2);
            cursorQuery = context.getContentResolver().query(contentUri, strArr3, bundle, null);
        } else {
            if (i > 0) {
                str = "date_added DESC" + String.format(" LIMIT %d OFFSET %d", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                str = "date_added DESC";
            }
            cursorQuery = context.getContentResolver().query(contentUri, strArr3, string, strArr2, str);
        }
        int columnIndex = cursorQuery.getColumnIndex("_id");
        int columnIndex2 = cursorQuery.getColumnIndex("relative_path");
        if (columnIndex2 == -1) {
            columnIndex2 = cursorQuery.getColumnIndex("_data");
        }
        int columnIndex3 = cursorQuery.getColumnIndex("mime_type");
        int columnIndex4 = cursorQuery.getColumnIndex("date_modified");
        int columnIndex5 = cursorQuery.getColumnIndex("_size");
        int columnIndex6 = cursorQuery.getColumnIndex("title");
        int columnIndex7 = cursorQuery.getColumnIndex("_display_name");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            MediaInfo mediaInfo = new MediaInfo();
            int i4 = cursorQuery.getInt(columnIndex);
            mediaInfo.id = i4;
            mediaInfo.url = ContentUris.withAppendedId(contentUri, i4).toString();
            mediaInfo.relativePath = cursorQuery.getString(columnIndex2);
            mediaInfo.mimeType = cursorQuery.getString(columnIndex3);
            mediaInfo.dateModified = cursorQuery.getInt(columnIndex4);
            mediaInfo.fileSize = cursorQuery.getInt(columnIndex5);
            mediaInfo.name = cursorQuery.getString(columnIndex6);
            mediaInfo.displayName = cursorQuery.getString(columnIndex7);
            arrayList.add(mediaInfo);
        }
        cursorQuery.close();
        return arrayList;
    }

    @RequiresApi(api = 8)
    public static List<MediaInfo> queryImageByAlbum(Context context, String str) throws AccessMediaError {
        String[] strArr;
        String str2;
        if (TextUtils.isEmpty(str)) {
            throw new AccessMediaError(-5);
        }
        getInitTimeStamp();
        MiJiaLog.writeLogOnAll(LogType.CAMERA, TAG, "queryImageByAlbum initTimeStamp=" + initTimeStamp);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String[] strArr2 = {"_id", "_data", "mime_type", "width", "height", "datetaken", "date_modified"};
        if (Build.VERSION.SDK_INT >= 29) {
            strArr = new String[]{DIRECTORY_PICTURES + File.separator + str + "/%"};
            str2 = "relative_path like ?";
        } else {
            strArr = new String[]{new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_PICTURES), str).getAbsolutePath() + "/%"};
            str2 = "_data LIKE ? ";
        }
        Cursor cursorQuery = contentResolver.query(uri, strArr2, str2, strArr, "date_added DESC");
        if (cursorQuery == null) {
            throw new AccessMediaError(-4);
        }
        int columnIndex = cursorQuery.getColumnIndex("_id");
        cursorQuery.getColumnIndex("_data");
        int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
        int columnIndex3 = cursorQuery.getColumnIndex("width");
        int columnIndex4 = cursorQuery.getColumnIndex("height");
        int columnIndex5 = cursorQuery.getColumnIndex("datetaken");
        int columnIndex6 = cursorQuery.getColumnIndex("date_modified");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            MediaInfo mediaInfo = new MediaInfo();
            int i = cursorQuery.getInt(columnIndex);
            mediaInfo.id = i;
            if (Build.VERSION.SDK_INT >= 29) {
                mediaInfo.url = ContentUris.withAppendedId(uri, i).toString();
            } else {
                mediaInfo.url = ContentUris.withAppendedId(uri, i).toString();
            }
            mediaInfo.mimeType = cursorQuery.getString(columnIndex2);
            mediaInfo.width = cursorQuery.getInt(columnIndex3);
            mediaInfo.height = cursorQuery.getInt(columnIndex4);
            mediaInfo.dateTaken = getDateTaken(cursorQuery, columnIndex5);
            int i2 = cursorQuery.getInt(columnIndex6);
            mediaInfo.dateModified = i2;
            if (i2 > initTimeStamp) {
                arrayList.add(mediaInfo);
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    @RequiresApi(api = 8)
    public static List<MediaInfo> queryVideoByAlbum(Context context, String str) throws AccessMediaError {
        String[] strArr;
        String str2;
        if (TextUtils.isEmpty(str)) {
            throw new AccessMediaError(-5);
        }
        getInitTimeStamp();
        MiJiaLog.writeLogOnAll(LogType.CAMERA, TAG, "queryVideoByAlbum initTimeStamp=" + initTimeStamp);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        String[] strArr2 = {"_id", "_data", "mime_type", "width", "height", "datetaken", "date_modified", "duration"};
        if (Build.VERSION.SDK_INT >= 29) {
            strArr = new String[]{DIRECTORY_PICTURES + File.separator + str + "/%"};
            str2 = "relative_path LIKE ? ";
        } else {
            strArr = new String[]{new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_PICTURES), str).getAbsolutePath() + "/%"};
            str2 = "_data LIKE ? ";
        }
        Cursor cursorQuery = contentResolver.query(uri, strArr2, str2, strArr, "date_added DESC");
        if (cursorQuery == null) {
            throw new AccessMediaError(-4);
        }
        int columnIndex = cursorQuery.getColumnIndex("_id");
        cursorQuery.getColumnIndex("_data");
        int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
        int columnIndex3 = cursorQuery.getColumnIndex("width");
        int columnIndex4 = cursorQuery.getColumnIndex("height");
        int columnIndex5 = cursorQuery.getColumnIndex("datetaken");
        int columnIndex6 = cursorQuery.getColumnIndex("date_modified");
        int columnIndex7 = cursorQuery.getColumnIndex("duration");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            MediaInfo mediaInfo = new MediaInfo();
            int i = cursorQuery.getInt(columnIndex);
            mediaInfo.id = i;
            if (Build.VERSION.SDK_INT >= 29) {
                mediaInfo.url = ContentUris.withAppendedId(uri, i).toString();
            } else {
                mediaInfo.url = ContentUris.withAppendedId(uri, i).toString();
            }
            mediaInfo.mimeType = cursorQuery.getString(columnIndex2);
            mediaInfo.width = cursorQuery.getInt(columnIndex3);
            mediaInfo.height = cursorQuery.getInt(columnIndex4);
            mediaInfo.dateTaken = getDateTaken(cursorQuery, columnIndex5);
            mediaInfo.dateModified = cursorQuery.getInt(columnIndex6);
            mediaInfo.duration = cursorQuery.getInt(columnIndex7);
            if (mediaInfo.dateModified > initTimeStamp) {
                arrayList.add(mediaInfo);
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static void takePersistableUriPermission(Context context, Uri uri, int i) {
        context.getContentResolver().takePersistableUriPermission(uri, i);
    }

    public static int deleteMedia(Context context, Uri uri) {
        if (uri != null) {
            ContentResolver contentResolver = context.getContentResolver();
            int iDelete = contentResolver.delete(uri, null, null);
            contentResolver.notifyChange(uri, null);
            return iDelete;
        }
        throw new AccessMediaError(-1);
    }
}
