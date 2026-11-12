package com.huami.devicerecorder;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public class UriGetter {
    private static final String a = "UriGetter";
    private static final String b = "com.recorder.fileprovider";

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShareContentType {
        public static final String AUDIO = "audio/*";
        public static final String File = "*/*";
        public static final String IMAGE = "image/*";
        public static final String TEXT = "text/plain";
        public static final String VIDEO = "video/*";
    }

    private static Uri a(File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                StrictMode.class.getDeclaredMethod("disableDeathOnFileUriExposure", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                Log.e(a, Log.getStackTraceString(e));
            }
        }
        return Uri.parse("file://" + file.getAbsolutePath());
    }

    private static Uri b(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{absolutePath}, null);
        Uri uriWithAppendedPath = null;
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                uriWithAppendedPath = Uri.withAppendedPath(Uri.parse("content://media/external/audio/media"), "" + i);
            }
            cursorQuery.close();
        }
        if (uriWithAppendedPath != null) {
            return uriWithAppendedPath;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", absolutePath);
        return context.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    private static Uri c(Context context, File file) {
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_id"}, "_data=? ", new String[]{file.getAbsolutePath()}, null);
        Uri contentUri = null;
        if (cursorQuery != null) {
            contentUri = cursorQuery.moveToFirst() ? MediaStore.Files.getContentUri("external", cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))) : null;
            cursorQuery.close();
        }
        return contentUri;
    }

    private static Uri d(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{absolutePath}, null);
        Uri uriWithAppendedPath = null;
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                uriWithAppendedPath = Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + i);
            }
            cursorQuery.close();
        }
        if (uriWithAppendedPath != null) {
            return uriWithAppendedPath;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", absolutePath);
        return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    private static Uri e(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{absolutePath}, null);
        Uri uriWithAppendedPath = null;
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                uriWithAppendedPath = Uri.withAppendedPath(Uri.parse("content://media/external/video/media"), "" + i);
            }
            cursorQuery.close();
        }
        if (uriWithAppendedPath != null) {
            return uriWithAppendedPath;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", absolutePath);
        return context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    @Nullable
    public static Uri getFileUri(Context context, String str, File file) {
        Uri uriForFile = null;
        if (context == null) {
            Log.e(a, "getFileUri current activity is null.");
            return null;
        }
        if (file == null || !file.exists()) {
            Log.e(a, "getFileUri file is null or not exists.");
            return null;
        }
        if (Build.VERSION.SDK_INT < 24) {
            uriForFile = Uri.fromFile(file);
        } else {
            try {
                uriForFile = FileProvider.getUriForFile(context, b, file);
            } catch (Exception e) {
                HMLog.i(a, "RecorderFileProvider get file failed: " + e.getLocalizedMessage(), new Object[0]);
            }
        }
        if (uriForFile == null) {
            if (TextUtils.isEmpty(str)) {
                str = ShareContentType.File;
            }
            str.hashCode();
            switch (str) {
                case "audio/*":
                    uriForFile = b(context, file);
                    break;
                case "*/*":
                    uriForFile = c(context, file);
                    break;
                case "video/*":
                    uriForFile = e(context, file);
                    break;
                case "image/*":
                    uriForFile = d(context, file);
                    break;
            }
        }
        if (uriForFile == null) {
            uriForFile = a(file);
        }
        HMLog.i(a, "recorder uri: " + uriForFile, new Object[0]);
        return uriForFile;
    }
}
