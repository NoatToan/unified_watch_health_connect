package com.huami.watch.companion.facestore.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.huami.watch.companion.facestore.utils.DownloadTaskManager;
import com.huami.watch.companion.facestore.utils.DownloadTaskModel;
import com.huami.watch.util.Log;
import com.ximalaya.ting.android.player.MD5;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class TrackModel {
    public static final String TAG = "TrackModel";
    public String device_type;
    public String downloads;
    public String name;
    public String skin_bin;
    public String skin_size;
    public String[] thumbnails;

    public TrackModel(Cursor cursor) {
        this.downloads = cursor.getString(cursor.getColumnIndex("downloads"));
        this.name = cursor.getString(cursor.getColumnIndex("name"));
        this.skin_bin = cursor.getString(cursor.getColumnIndex("skin_bin"));
        this.skin_size = cursor.getString(cursor.getColumnIndex("skin_size"));
        this.device_type = cursor.getString(cursor.getColumnIndex("device_type"));
    }

    private String a() {
        if (TextUtils.isEmpty(this.name)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(this.name);
        if (!TextUtils.isEmpty(this.device_type)) {
            sb.append(this.device_type);
        }
        return MD5.md5(sb.toString());
    }

    public DownloadTaskModel createDownloadTask(String str) {
        if (TextUtils.isEmpty(this.downloads) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.skin_bin) || TextUtils.isEmpty(str)) {
            Log.e(TAG, "createDownloadTask some arg is null", new Object[0]);
            return null;
        }
        String str2 = str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        Log.d("lihao_test", " download Path : " + str2, new Object[0]);
        File file = new File(str2);
        if (file.exists()) {
            if (!file.isDirectory()) {
                Log.e(TAG, "createDownloadTask : " + str2 + "  isn't a directory", new Object[0]);
                throw new RuntimeException("download path is not directory");
            }
        } else if (!file.mkdirs()) {
            Log.e(TAG, "createDownloadTask : can't mkdirs " + str2, new Object[0]);
            return null;
        }
        String str3 = a() + ".wfz";
        if (TextUtils.isEmpty(str3)) {
            Log.d(TAG, "download file name is null ", new Object[0]);
            return null;
        }
        String str4 = str2 + str3;
        Log.d(TAG, "download file path is " + str4, new Object[0]);
        if (this.thumbnails.length > 0) {
            Log.d("lihao_test", " thummnail : " + this.thumbnails[0], new Object[0]);
        }
        String str5 = this.downloads;
        String str6 = this.name;
        String str7 = this.skin_bin;
        String str8 = this.device_type;
        String str9 = this.skin_size;
        String[] strArr = this.thumbnails;
        return DownloadTaskManager.createTask(str5, str6, str7, str4, str8, str9, strArr.length > 0 ? strArr[0] : null);
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("downloads", this.downloads);
        contentValues.put("name", this.name);
        contentValues.put("skin_bin", this.skin_bin);
        contentValues.put("skin_size", this.skin_size);
        contentValues.put("device_type", this.device_type);
        return contentValues;
    }

    public String toString() {
        return "downloads: " + this.downloads + "   name:  " + this.name;
    }
}
