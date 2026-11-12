package sz0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f161356b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f161357a = new a(this, GarminConnectMobileApp.f28688j);

    public class a extends SQLiteOpenHelper {
        public a(c cVar, Context context) {
            super(context, "AppNotifications", (SQLiteDatabase.CursorFactory) null, 4);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("create table if not exists notifications (_id integer primary key autoincrement, date long, type text not null, dismissed boolean, userid text not null);");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i14, int i15) {
            i2.n(c.class.getName(), am.j.g(i14, i15, "Upgrading database from version ", " to ", ", which will destroy all old data"));
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("drop table if exists notifications");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                onCreate(sQLiteDatabase);
            } catch (Throwable th3) {
                sQLiteDatabase.endTransaction();
                throw th3;
            }
        }
    }

    private c() {
    }

    public static synchronized c b() {
        try {
            if (f161356b == null) {
                f161356b = new c();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f161356b;
    }

    public final synchronized void a(sz0.a aVar) {
        Throwable th3;
        SQLiteException sQLiteException;
        try {
            if (aVar == null) {
                i2.i("AppNotificationsDAO", ".addNotifiation(): passed-in [notification] object is null. Aborting operation.");
                return;
            }
            b.a aVar2 = aVar.f161322b;
            if (aVar2 != b.a.CONNECT_IQ_OAUTH_REQUEST && aVar2 != b.a.CONNECT_IQ_OPEN_WEBPAGE_REQUEST) {
                SQLiteDatabase writableDatabase = this.f161357a.getWritableDatabase();
                writableDatabase.beginTransaction();
                Cursor cursor = null;
                try {
                    try {
                        String strName = aVar.f161322b.name();
                        f12.l.f68084a.getClass();
                        Cursor cursorQuery = writableDatabase.query("notifications", new String[]{"_id"}, "type = ? AND userid = ?", new String[]{strName, f12.l.a.a().U1()}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.getCount() > 0) {
                                    if (!cursorQuery.isClosed()) {
                                        cursorQuery.close();
                                    }
                                    writableDatabase.endTransaction();
                                    return;
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("date", Long.valueOf(aVar.f161321a));
                                contentValues.put(NotificationConstants.KEY_DATA_MIME_TYPE, aVar.f161322b.name());
                                contentValues.put("dismissed", Integer.valueOf(aVar.f161323c ? 1 : 0));
                                contentValues.put("userid", f12.l.a.a().U1());
                                writableDatabase.insert("notifications", null, contentValues);
                                writableDatabase.setTransactionSuccessful();
                                if (cursorQuery != null && !cursorQuery.isClosed()) {
                                    cursorQuery.close();
                                }
                            } catch (SQLiteException e4) {
                                sQLiteException = e4;
                                cursor = cursorQuery;
                                i2.i("AppNotificationsDAO", "Error inserting or updating notification record. %s: " + sQLiteException.getMessage());
                                if (cursor != null && !cursor.isClosed()) {
                                    cursor.close();
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                cursor = cursorQuery;
                                if (cursor != null && !cursor.isClosed()) {
                                    cursor.close();
                                }
                                writableDatabase.endTransaction();
                                throw th3;
                            }
                        } else {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("date", Long.valueOf(aVar.f161321a));
                            contentValues2.put(NotificationConstants.KEY_DATA_MIME_TYPE, aVar.f161322b.name());
                            contentValues2.put("dismissed", Integer.valueOf(aVar.f161323c ? 1 : 0));
                            contentValues2.put("userid", f12.l.a.a().U1());
                            writableDatabase.insert("notifications", null, contentValues2);
                            writableDatabase.setTransactionSuccessful();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    } catch (SQLiteException e14) {
                        sQLiteException = e14;
                    }
                    writableDatabase.endTransaction();
                } catch (Throwable th5) {
                    th3 = th5;
                }
            }
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final synchronized void c(b.a aVar, String str) {
        if (aVar != b.a.CONNECT_IQ_OAUTH_REQUEST && aVar != b.a.CONNECT_IQ_OPEN_WEBPAGE_REQUEST) {
            SQLiteDatabase writableDatabase = this.f161357a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dismissed", (Integer) 1);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar.name());
                    arrayList.add(str);
                    writableDatabase.update("notifications", contentValues, "type = ? AND userid = ? ", (String[]) arrayList.toArray(new String[arrayList.size()]));
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLiteException e4) {
                    i2.i("AppNotificationsDAO", "Exception updating notification record.: " + e4.getMessage());
                }
                writableDatabase.endTransaction();
            } catch (Throwable th3) {
                writableDatabase.endTransaction();
                throw th3;
            }
        }
    }
}
