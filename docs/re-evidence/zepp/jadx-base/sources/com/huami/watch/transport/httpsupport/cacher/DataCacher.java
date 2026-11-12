package com.huami.watch.transport.httpsupport.cacher;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.HolyBaby;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes6.dex */
public class DataCacher extends SQLiteOpenHelper {
    public static final int QUERY_MODE_ALL_ITEM = 0;
    public static final int QUERY_MODE_ONLY_CONCURRENT_ITEM = 1;
    public static final int QUERY_MODE_ONLY_SERIAL_ITEM = 2;
    public static final String a = "action";
    public static final String b = "code";
    public static final String c = "data";
    private static final String d = "springchannel.db";
    private static final int e = 3;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    public static final String i = "extra";
    public static final String j = "flags";
    public static final String k = "targetWho";
    public static final String l = "identifier";
    private static volatile DataCacher m = null;
    public static final String n = "method";
    public static final String o = "owner";
    public static final String p = "state";
    private static final String q = "dataitems";
    public static final String r = "url";

    private DataCacher(Context context) {
        super(context, d, (SQLiteDatabase.CursorFactory) null, e);
        b();
    }

    private boolean a(int i2, int i3, String str) {
        String str2;
        SolidLogger solidLogger;
        StringBuilder sb;
        if (i2 == 2) {
            if ((i3 & 16384) == 0) {
                str2 = "Ignore concurrent item ==>";
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "Ignore concurrent item ==>" + str);
                }
                solidLogger = SolidLogger.getInstance();
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                solidLogger.with(GlobalDefine.TAG_SERIAL_MODE, sb.toString());
                return false;
            }
            return true;
        }
        if (i2 == 1 && (i3 & 16384) != 0) {
            str2 = "Ignore serial item ==>";
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "Ignore serial item ==>" + str);
            }
            solidLogger = SolidLogger.getInstance();
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            solidLogger.with(GlobalDefine.TAG_SERIAL_MODE, sb.toString());
            return false;
        }
        return true;
    }

    private void b() {
        List<DataItem> listQueryAll = queryAll();
        if (listQueryAll == null || listQueryAll.isEmpty()) {
            return;
        }
        Iterator<DataItem> it2 = listQueryAll.iterator();
        while (it2.hasNext()) {
            it2.next().clearFlags(2048);
        }
        d(listQueryAll);
    }

    private boolean c(SQLiteDatabase sQLiteDatabase, String str) {
        synchronized (this) {
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
    }

    public static void cleanUp() {
        m = null;
    }

    private boolean d(List<DataItem> list) {
        boolean z;
        synchronized (this) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    Iterator<DataItem> it2 = list.iterator();
                    while (true) {
                        z = false;
                        while (true) {
                            if (it2.hasNext()) {
                                DataItem next = it2.next();
                                if (!next.hasFlag(8192)) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("identifier", next.getIdentifier());
                                    contentValues.put("action", next.getAction());
                                    contentValues.put(o, next.getOwner());
                                    contentValues.put("url", next.getUrl());
                                    contentValues.put("method", next.getMethod());
                                    contentValues.put(j, Integer.valueOf(next.getFlags()));
                                    contentValues.put("state", Integer.valueOf(next.getState()));
                                    contentValues.put("data", next.getData());
                                    contentValues.put("extra", next.getExtraData().toString());
                                    contentValues.put("code", Integer.valueOf(next.getCode()));
                                    boolean z2 = writableDatabase.update(q, contentValues, "identifier=?", new String[]{String.valueOf(next.getIdentifier())}) > 0;
                                    if (z2) {
                                        z = z2;
                                    } else if (writableDatabase.insertOrThrow(q, null, contentValues) >= 0) {
                                        z = true;
                                    }
                                }
                            } else {
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                            }
                        }
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }

    private void e(SQLiteDatabase sQLiteDatabase, DataItem dataItem, String str, int i2) {
        try {
            sQLiteDatabase.execSQL(String.format(Locale.US, "update %s set %s = %d where %s = '%s'", q, str, Integer.valueOf(i2), "identifier", dataItem.getIdentifier()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static DataCacher getInstance(Context context) {
        DataCacher dataCacher;
        synchronized (DataCacher.class) {
            try {
                if (m == null) {
                    synchronized (DataCacher.class) {
                        try {
                            if (m == null) {
                                m = new DataCacher(context);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                dataCacher = m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dataCacher;
    }

    public void addFlagsToItemSync(DataItem dataItem, int i2) {
        SQLiteDatabase writableDatabase;
        if (dataItem == null || (writableDatabase = getWritableDatabase()) == null) {
            return;
        }
        dataItem.addFlags(i2);
        e(writableDatabase, dataItem, j, dataItem.getFlags());
    }

    public boolean delete(String str) {
        boolean z;
        synchronized (this) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("identifier= '");
            sb.append(str);
            sb.append("'");
            z = writableDatabase.delete(q, sb.toString(), null) > 0;
        }
        return z;
    }

    public void deleteAll() {
        synchronized (this) {
            getWritableDatabase().delete(q, "1", null);
        }
    }

    public int deleteByOwnerWithState(String str, int... iArr) {
        synchronized (this) {
            if (iArr != null) {
                if (iArr.length != 0) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    try {
                        writableDatabase.beginTransaction();
                        StringBuilder sb = new StringBuilder();
                        sb.append(o);
                        sb.append("= '");
                        sb.append(str);
                        sb.append("'");
                        sb.append(" and ");
                        sb.append("state");
                        sb.append(SearchCriteria.EQ);
                        sb.append("(");
                        for (int i2 = 0; i2 < iArr.length; i2++) {
                            sb.append(" '");
                            sb.append(iArr[i2]);
                            sb.append("' ");
                            if (i2 != iArr.length - 1) {
                                sb.append(" or ");
                            }
                        }
                        sb.append(")");
                        Log.i("wifi_trans", sb.toString());
                        int iDelete = writableDatabase.delete(q, sb.toString(), null);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        return iDelete;
                    } catch (Throwable th) {
                        if (writableDatabase != null) {
                            writableDatabase.endTransaction();
                        }
                        throw th;
                    }
                }
            }
            return 0;
        }
    }

    public boolean deleteByState(int i2) {
        boolean z;
        synchronized (this) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("state= '");
            sb.append(i2);
            sb.append("'");
            z = writableDatabase.delete(q, sb.toString(), null) > 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public void f(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        int i4;
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    sQLiteDatabase.execSQL("ALTER TABLE dataitems ADD COLUMN code INTEGER DEFAULT 0;");
                }
                i4 = i2 + 1;
                sQLiteDatabase.setVersion(i4);
                if (i4 < i3) {
                    f(sQLiteDatabase, i4, i3);
                }
            }
            sQLiteDatabase.execSQL("ALTER TABLE dataitems ADD COLUMN extra TEXT;");
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
        i4 = i2 + 1;
        sQLiteDatabase.setVersion(i4);
        if (i4 < i3) {
            f(sQLiteDatabase, i4, i3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (c(sQLiteDatabase, q)) {
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE dataitems(targetWho INTEGER PRIMARY KEY,identifier text,action text,owner text,url text,method text,flags integer,code integer,state integer,data text,extra text)");
        sQLiteDatabase.setVersion(3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        f(sQLiteDatabase, i2, i3);
    }

    public DataItem query(String str) {
        DataItem dataItemQuery;
        synchronized (this) {
            dataItemQuery = query(str, 1);
        }
        return dataItemQuery;
    }

    public DataItem query(String str, int i2) {
        synchronized (this) {
            DataItem dataItem = null;
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(String.format(Locale.US, "select * from %s where %s='%s'", q, "identifier", str), null);
            try {
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            if (!a(i2, cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(j)), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("identifier")))) {
                                cursorRawQuery.close();
                                return null;
                            }
                            DataItem dataItem2 = new DataItem();
                            dataItem2.setIdentifier(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("identifier")));
                            dataItem2.setAction(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("action")));
                            dataItem2.setOwner(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(o)));
                            dataItem2.setUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("url")));
                            dataItem2.setMethod(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("method")));
                            dataItem2.setFlags(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(j)));
                            dataItem2.setState(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("state")));
                            dataItem2.setData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data")));
                            dataItem2.setExtraData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("extra")));
                            dataItem2.setCode(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("code")));
                            dataItem = dataItem2;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        cursorRawQuery.close();
                        return null;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return dataItem;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
    }

    public List<DataItem> query(int i2) {
        List<DataItem> listQuery;
        synchronized (this) {
            listQuery = query(i2, 1);
        }
        return listQuery;
    }

    public List<DataItem> query(int i2, int i3) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = null;
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(String.format(Locale.US, "select * from %s where %s=%d", q, "state", Integer.valueOf(i2)), null);
            try {
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            ArrayList arrayList2 = null;
                            do {
                                try {
                                    int i4 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(j));
                                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("identifier"));
                                    if (a(i3, i4, string)) {
                                        DataItem dataItem = new DataItem();
                                        dataItem.setIdentifier(string);
                                        dataItem.setAction(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("action")));
                                        dataItem.setOwner(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(o)));
                                        dataItem.setUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("url")));
                                        dataItem.setMethod(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("method")));
                                        dataItem.setFlags(i4);
                                        dataItem.setState(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("state")));
                                        dataItem.setData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data")));
                                        dataItem.setExtraData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("extra")));
                                        dataItem.setCode(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("code")));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(dataItem);
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "Illegal state CURSOR！");
                                }
                            } while (cursorRawQuery.moveToNext());
                            arrayList = arrayList2;
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        cursorRawQuery.close();
                        return null;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        return arrayList;
    }

    public List<DataItem> queryAll() {
        List<DataItem> listQueryAll;
        synchronized (this) {
            listQueryAll = queryAll(1);
        }
        return listQueryAll;
    }

    public List<DataItem> queryAll(int i2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = null;
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(String.format(Locale.US, "select * from %s", q), null);
            if (cursorRawQuery != null) {
                try {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            ArrayList arrayList2 = null;
                            do {
                                try {
                                    if (a(i2, cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(j)), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("identifier")))) {
                                        DataItem dataItem = new DataItem();
                                        dataItem.setIdentifier(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("identifier")));
                                        dataItem.setAction(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("action")));
                                        dataItem.setOwner(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(o)));
                                        dataItem.setUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("url")));
                                        dataItem.setMethod(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("method")));
                                        dataItem.setFlags(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(j)));
                                        dataItem.setState(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("state")));
                                        dataItem.setData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data")));
                                        dataItem.setExtraData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("extra")));
                                        dataItem.setCode(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("code")));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(dataItem);
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "Illegal state CURSOR 2！");
                                }
                            } while (cursorRawQuery.moveToNext());
                            arrayList = arrayList2;
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
        return arrayList;
    }

    public List<DataItem> queryAllHolyBaby(String str) {
        ArrayList arrayList;
        synchronized (this) {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(String.format(Locale.US, "select * from %s where %s='%s'", q, o, HolyBaby.OWNER_OF_HOLY_BOARD), null);
            try {
                try {
                    arrayList = new ArrayList();
                    if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                        do {
                            try {
                                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("identifier"));
                                DataItem dataItem = new DataItem();
                                dataItem.setExtraData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("extra")));
                                if (TextUtils.equals(dataItem.getExtraValByKey("target"), str)) {
                                    dataItem.setIdentifier(string);
                                    dataItem.setOwner(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(o)));
                                    dataItem.setData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data")));
                                    arrayList.add(dataItem);
                                } else {
                                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "忽略 : " + dataItem.getExtraValByKey("target") + " FOR: " + str);
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "Illegal state CURSOR！");
                            }
                        } while (cursorRawQuery.moveToNext());
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return null;
            }
        }
        return arrayList;
    }

    public boolean save(DataItem dataItem) {
        synchronized (this) {
            if (!dataItem.hasFlag(8192) && !dataItem.hasFlag(65536)) {
                return d(Arrays.asList(dataItem));
            }
            return true;
        }
    }

    public int updateByOwnerToState(String str, int i2, int i3) {
        int iUpdate;
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", Integer.valueOf(i3));
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                Log.i("wifi_trans", "update STATE for " + str + " , to : " + i3);
                iUpdate = writableDatabase.update(q, contentValues, "owner = ? and state = ?", new String[]{str, String.valueOf(i2)});
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }
        return iUpdate;
    }

    public int uploadToState(int i2, int i3) {
        int iUpdate;
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", Integer.valueOf(i3));
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                Log.i("wifi_trans", "uploadToState:update STATE for " + i2 + " , to : " + i3);
                iUpdate = writableDatabase.update(q, contentValues, "state = ?", new String[]{String.valueOf(i2)});
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }
        return iUpdate;
    }
}
