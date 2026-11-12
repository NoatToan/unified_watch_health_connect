package com.huami.watch.companion.facestore.utils;

import android.content.ContentValues;
import android.database.Cursor;

/* JADX INFO: loaded from: classes16.dex */
public class DownloadTaskModel {
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public DownloadTaskModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public String getDeviceType() {
        return this.f;
    }

    public int getDownloadID() {
        return this.a;
    }

    public String getFileId() {
        return this.b;
    }

    public String getFilePath() {
        return this.e;
    }

    public String getName() {
        return this.c;
    }

    public String getSkinSize() {
        return this.g;
    }

    public String getThumbnails() {
        return this.h;
    }

    public String getUrl() {
        return this.d;
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("download_id", Integer.valueOf(this.a));
        contentValues.put("downloads", this.b);
        contentValues.put("name", this.c);
        contentValues.put("skin_bin", this.d);
        contentValues.put("file_path", this.e);
        contentValues.put("device_type", this.f);
        contentValues.put("skin_size", this.g);
        contentValues.put("thumbnails", this.h);
        return contentValues;
    }

    public String toString() {
        return " name : " + this.c + " dowanload id :" + this.a + "  url : " + this.d;
    }

    public DownloadTaskModel(Cursor cursor) {
        if (cursor != null) {
            this.a = cursor.getInt(cursor.getColumnIndex("download_id"));
            this.b = cursor.getString(cursor.getColumnIndex("downloads"));
            this.c = cursor.getString(cursor.getColumnIndex("name"));
            this.d = cursor.getString(cursor.getColumnIndex("skin_bin"));
            this.e = cursor.getString(cursor.getColumnIndex("file_path"));
            this.f = cursor.getString(cursor.getColumnIndex("device_type"));
            this.g = cursor.getString(cursor.getColumnIndex("skin_size"));
            this.h = cursor.getString(cursor.getColumnIndex("thumbnails"));
        }
    }
}
