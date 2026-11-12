package com.huawei.phoneservice.feedbackcommon.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.operation.ble.BleConstants;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.feedbackcommon.entity.MediaEntity;
import defpackage.yzc;
import defpackage.zcm;
import defpackage.zcp;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedbackMediaData extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SQLiteDatabase f21800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f21801c = new d(null);
    private static FeedbackMediaData d;

    public final void d(String str, Long l) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("duration", l);
        b(contentValues, "attach", str);
    }

    public final void b(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("cache", str2);
        b(contentValues, "attach", str);
    }

    public final void d(MediaEntity mediaEntity) {
        zcp.c(mediaEntity, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("attach", mediaEntity.attach);
        contentValues.put("cache", mediaEntity.cache);
        contentValues.put("createTime", mediaEntity.createTime);
        contentValues.put("duration", mediaEntity.duration);
        contentValues.put(BleConstants.KEY_PATH, mediaEntity.path);
        contentValues.put("uri", mediaEntity.strUri);
        contentValues.put("type", mediaEntity.type);
        contentValues.put("updateTime", mediaEntity.updateTime);
        contentValues.put("url", mediaEntity.url);
        SQLiteDatabase sQLiteDatabase = f21800b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.insert("table_media_entity", null, contentValues);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i != 1 && i != 2) {
                if (i == 3 && sQLiteDatabase != null) {
                    sQLiteDatabase.execSQL("create table if not exists table_media_entity(_id INTEGER primary key autoincrement,attach String ,cache String ,createTime long ,duration long ,path String ,uri String ,type String ,updateTime long ,url String);");
                    return;
                }
                return;
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("ALTER TABLE \"table_media_entity\" ADD COLUMN \"uri\" String");
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("create table if not exists table_media_entity(_id INTEGER primary key autoincrement,attach String ,cache String ,createTime long ,duration long ,path String ,uri String ,type String ,updateTime long ,url String);");
            }
        } catch (SQLException e) {
            g.a("FeedbackMediaData", e.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        zcp.c(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("create table if not exists table_media_entity(_id INTEGER primary key autoincrement,attach String ,cache String ,createTime long ,duration long ,path String ,uri String ,type String ,updateTime long ,url String);");
    }

    public final MediaEntity c(String str) {
        SQLiteDatabase sQLiteDatabase = f21800b;
        Cursor cursorQuery = sQLiteDatabase != null ? sQLiteDatabase.query("table_media_entity", null, "path= ?", new String[]{str}, null, null, "updateTime desc") : null;
        Boolean boolValueOf = cursorQuery != null ? Boolean.valueOf(cursorQuery.moveToFirst()) : null;
        zcp.e(boolValueOf);
        if (boolValueOf.booleanValue()) {
            return d(cursorQuery);
        }
        cursorQuery.close();
        return null;
    }

    public final MediaEntity b(String str) {
        zcp.c(str, "");
        return d("attach", str);
    }

    private final void b(ContentValues contentValues, String str, String str2) {
        String[] strArr = {str2};
        SQLiteDatabase sQLiteDatabase = f21800b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.update("table_media_entity", contentValues, str + "=?", strArr);
        }
    }

    private final MediaEntity d(Cursor cursor) {
        MediaEntity mediaEntity = new MediaEntity();
        mediaEntity.attach = cursor.getString(cursor.getColumnIndex("attach"));
        mediaEntity.cache = cursor.getString(cursor.getColumnIndex("cache"));
        mediaEntity.createTime = Long.valueOf(cursor.getLong(cursor.getColumnIndex("createTime")));
        mediaEntity.duration = Long.valueOf(cursor.getLong(cursor.getColumnIndex("duration")));
        mediaEntity.path = cursor.getString(cursor.getColumnIndex(BleConstants.KEY_PATH));
        mediaEntity.strUri = cursor.getString(cursor.getColumnIndex("uri"));
        mediaEntity.type = cursor.getString(cursor.getColumnIndex("type"));
        mediaEntity.updateTime = Long.valueOf(cursor.getLong(cursor.getColumnIndex("updateTime")));
        mediaEntity.url = cursor.getString(cursor.getColumnIndex("url"));
        return mediaEntity;
    }

    @JvmStatic
    public static final FeedbackMediaData a(Context context) {
        return f21801c.b(context);
    }

    private final MediaEntity d(String str, String str2) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase = f21800b;
        if (sQLiteDatabase != null) {
            cursorQuery = sQLiteDatabase.query("table_media_entity", null, str + "= ?", new String[]{str2}, null, null, null);
        } else {
            cursorQuery = null;
        }
        Boolean boolValueOf = cursorQuery != null ? Boolean.valueOf(cursorQuery.moveToFirst()) : null;
        zcp.e(boolValueOf);
        if (boolValueOf.booleanValue()) {
            return d(cursorQuery);
        }
        cursorQuery.close();
        return null;
    }

    public static final class d {
        @JvmStatic
        public final FeedbackMediaData b(Context context) {
            zcp.c(context, "");
            if (FeedbackMediaData.d == null) {
                synchronized (FeedbackMediaData.class) {
                    if (FeedbackMediaData.d == null) {
                        d dVar = FeedbackMediaData.f21801c;
                        Context applicationContext = context.getApplicationContext();
                        zcp.b((Object) applicationContext, "");
                        FeedbackMediaData.d = new FeedbackMediaData(applicationContext);
                    }
                    yzc yzcVar = yzc.e;
                }
            }
            return FeedbackMediaData.d;
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackMediaData(Context context) {
        super(context, "db_media_data", (SQLiteDatabase.CursorFactory) null, 4);
        zcp.c(context, "");
        synchronized (FeedbackMediaData.class) {
            if (f21800b == null) {
                f21800b = getWritableDatabase();
            }
            yzc yzcVar = yzc.e;
        }
    }
}
