package com.ximalaya.ting.android.sdkdownloader.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
class a extends SQLiteOpenHelper {
    public static final String a = "xm_download_db";
    public static final int b = 1;
    private static final String c = "create table Track (id integer primary key autoincrement,trackTitle text, trackTags text, trackIntro text, coverUrlLarge text, coverUrlMiddle text, coverUrlSmall text, playUrl64M4a text, downloadUrl text, downloadedSaveFilePath text, playUrl64 text, playUrl32 text, playUrl24M4a text, playSize64m4a text, playSize24M4a text, playPathHq text, updatedAt integer, uid integer default 0, createdAt integer, discountedPrice real default 0, downloadSize integer,  price real default 0, downloadTime integer, downloadedSize integer, duration integer, favoriteCount integer, free integer default 1, priceTypeId integer default 1, playSize64 integer, playSize32 integer, downloadStatus integer, downloadCount integer, isAutoPaused integer, playCount integer, orderPositon integer, commentCount integer, source integer, orderNum integer, authorized integer default 0,isPaid integer default 0, isLike integer, kind text, lastPlayedMills integer, dataId integer ,vsignature text, announcerPosition text, avatarUrl text, vdesc text, nickname text, annoucer_kind text, followingCount integer, releasedAlbumCount integer, releasedTrackCount integer, vCategoryId integer, followerCount integer, announcerId integer, verified integer ,albumTitle text, album_coverUrlLarge text, album_coverUrlMiddle text, album_coverUrlSmall text, albumId integer, uptoDateTime integer ,finishdownloadtime)";

    public a(Context context) {
        super(context, a, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static String a(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.US);
        }
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(a(c));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
