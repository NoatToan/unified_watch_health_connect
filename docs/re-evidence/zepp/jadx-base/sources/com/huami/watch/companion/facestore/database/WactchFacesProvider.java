package com.huami.watch.companion.facestore.database;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WactchFacesProvider extends ContentProvider {
    public static Uri CONTENT_URI = null;
    public static final Uri CONTENT_URI_FACES;
    private static final Object b = new Object();
    private static final UriMatcher c;
    private static final String d = "hmwf.db";
    private static final int e = 8;
    private static final String f = "faces";
    private static final String g = "WactchFacesProvider";
    private static final int h = 1;
    private static final int i = 2;
    private DatabaseHelper a;

    public static class DatabaseHelper extends SQLiteOpenHelper {
        public static final String ARTIST = "artist";
        public static final String DEVICE_TYPE = "device_type";
        public static final String DOWNLOADS = "downloads";
        public static final String FILE = "file";
        public static final String FILE_PATH = "file_path";
        public static final String NAME = "name";
        public static final String SKIN_BIN = "skin_bin";
        public static final String SKIN_SIZE = "skin_size";
        public static final String THUMBNAIL = "thumbnails";
        public static final String _ID = "_id";

        public DatabaseHelper(Context context) {
            super(context, WactchFacesProvider.d, (SQLiteDatabase.CursorFactory) null, 8);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (WactchFacesProvider.b(sQLiteDatabase, WactchFacesProvider.f)) {
                return;
            }
            sQLiteDatabase.execSQL("CREATE TABLE faces(_id INTEGER PRIMARY KEY AUTOINCREMENT, downloads LONG,name TEXT,skin_bin TEXT,device_type TEXT,skin_size TEXT,file_path TEXT, thumbnails TEXT );");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i2 >= 8 && i < 8) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS faces");
            }
            onCreate(sQLiteDatabase);
        }
    }

    public static class a {
        public StringBuilder a;
        public List<String> b;

        private a() {
            this.a = new StringBuilder();
            this.b = new ArrayList();
        }

        public <T> void a(String str, T... tArr) {
            if (str == null || str.isEmpty()) {
                return;
            }
            if (this.a.length() != 0) {
                this.a.append(" AND ");
            }
            this.a.append("(");
            this.a.append(str);
            this.a.append(")");
            if (tArr != null) {
                for (T t : tArr) {
                    this.b.add(t.toString());
                }
            }
        }

        public String[] b() {
            return (String[]) this.b.toArray(new String[this.b.size()]);
        }

        public String c() {
            return this.a.toString();
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        c = uriMatcher;
        CONTENT_URI = Uri.parse("content://com.humi.watch.wearcompanion.FACE_SOURCE");
        CONTENT_URI_FACES = Uri.parse("content://com.humi.watch.wearcompanion.FACE_SOURCE/faces/#2");
        uriMatcher.addURI("com.humi.watch.wearcompanion.FACE_SOURCE", "face", 1);
        uriMatcher.addURI("com.humi.watch.wearcompanion.FACE_SOURCE", "face/#", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized boolean b(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = '" + str + "'", null);
        if (cursorRawQuery != null) {
            if (cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            cursorRawQuery.close();
        }
        return false;
    }

    public static void setUri(Uri uri) {
        CONTENT_URI = uri;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int iDelete;
        synchronized (b) {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            a aVar = new a();
            aVar.a(str, strArr);
            iDelete = writableDatabase.delete(f, aVar.c(), aVar.b());
            getContext().getContentResolver().notifyChange(CONTENT_URI, null);
        }
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0056: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:31:0x0056 */
    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase writableDatabase;
        String asString = contentValues.getAsString("name");
        synchronized (b) {
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                try {
                    try {
                        writableDatabase = this.a.getWritableDatabase();
                        try {
                            long jUpdate = writableDatabase.update(f, contentValues, "name=?", new String[]{asString});
                            if (jUpdate <= 0) {
                                jUpdate = writableDatabase.insertOrThrow(f, null, contentValues);
                            }
                            if (jUpdate > 0) {
                                getContext().getContentResolver().notifyChange(CONTENT_URI, null);
                                writableDatabase.close();
                                return uri;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            if (writableDatabase != null) {
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    writableDatabase = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                    throw th;
                }
                writableDatabase.close();
                return null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase2 = sQLiteDatabase;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.a = new DatabaseHelper(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) {
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        synchronized (b) {
            cursorQuery = null;
            try {
                SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
                SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
                sQLiteQueryBuilder.setTables(f);
                cursorQuery = sQLiteQueryBuilder.query(readableDatabase, strArr, str, strArr2, null, null, str2);
                cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return cursorQuery;
    }
}
