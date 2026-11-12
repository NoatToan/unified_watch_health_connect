package com.huami.tools.analytics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
interface DbHelpers {

    public static class AnonymousDbHelper extends BaseDbHelper {
        private static volatile AnonymousDbHelper a;

        @VisibleForTesting
        public AnonymousDbHelper(Context context) {
            super(context, DbUtils.Const.Database.ANONYMOUS);
        }

        public static AnonymousDbHelper a(Context context) {
            if (a == null) {
                synchronized (AnonymousDbHelper.class) {
                    if (a == null) {
                        a = new AnonymousDbHelper(context.getApplicationContext());
                    }
                }
            }
            return a;
        }
    }

    public static class BaseDbHelper extends SQLiteOpenHelper {
        @VisibleForTesting
        public BaseDbHelper(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS event(id INTEGER PRIMARY KEY AUTOINCREMENT,eventId TEXT NOT NULL,type TEXT NOT NULL,timestamp INTEGER NOT NULL,timezone TEXT NOT NULL,numberValue DECIMAL,stringValue TEXT,multipleValue TEXT,contextId TEXT NOT NULL)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS context(hashId TEXT NOT NULL PRIMARY KEY ON CONFLICT REPLACE,uid TEXT NOT NULL,appVersionCode INTEGER,appVersionName TEXT NOT NULL,sdkVersionName TEXT NOT NULL,osLevel INTEGER,osVersion TEXT,channel TEXT,locale TEXT,network TEXT,resolution TEXT,eventVersion INTEGER,packageName TEXT,brand TEXT,model TEXT)");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i == 1 && i2 == 2) {
                List<Event> listL = DbUtils.l(sQLiteDatabase);
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS event(id INTEGER PRIMARY KEY AUTOINCREMENT,eventId TEXT NOT NULL,type TEXT NOT NULL,timestamp INTEGER NOT NULL,timezone TEXT NOT NULL,numberValue DECIMAL,stringValue TEXT,multipleValue TEXT,contextId TEXT NOT NULL)");
                for (Event event : listL) {
                    try {
                        if (DbUtils.i(sQLiteDatabase, event) > 0) {
                            p.b().v("", String.format(Locale.CHINA, "迁移事件保存成功（%s）", event));
                        } else {
                            p.b().w("", String.format(Locale.CHINA, "迁移事件保存失败（%s）", event));
                        }
                    } catch (Exception e) {
                        p.b().w("", e, String.format(Locale.CHINA, "迁移事件保存失败（%s）", event));
                    }
                }
            }
        }
    }

    public static class IdentifiedDbHelper extends BaseDbHelper {
        private static volatile IdentifiedDbHelper a;

        @VisibleForTesting
        public IdentifiedDbHelper(Context context) {
            super(context, DbUtils.Const.Database.IDENTIFIED);
        }

        public static IdentifiedDbHelper a(Context context) {
            if (a == null) {
                synchronized (IdentifiedDbHelper.class) {
                    if (a == null) {
                        a = new IdentifiedDbHelper(context.getApplicationContext());
                    }
                }
            }
            return a;
        }
    }
}
