package com.huawei.hms.network.embedded;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14661a = "FileCacheManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14662b = "restclient_dns.db";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14663c = "restclient_dynamic_dns.db";
    public static String d = "restclient_dns.db";
    public static final String e = "createTime";
    public static final String f = "dns_domain";
    public static final String g = "domain";
    public static final String i = "ttl";
    public static final String j = "source";
    public static volatile SQLiteDatabase l;
    public static final String h = "ip";
    public static final String[] k = {"domain", h, "ttl", "source", "createTime"};

    public static boolean e() {
        Logger.v(f14661a, "file cache removeAll operation");
        try {
            d().execSQL("delete from dns_domain");
            SQLiteDatabase networkkitUnusedDbDB = NetworkKitSQLiteOpenHelper.getInstance().getNetworkkitUnusedDbDB();
            if (networkkitUnusedDbDB == null) {
                return true;
            }
            networkkitUnusedDbDB.execSQL("delete from dns_domain");
            return true;
        } catch (Exception e2) {
            Logger.i(f14661a, "remove exception:" + e2.getClass().getSimpleName());
            return false;
        }
    }

    public static SQLiteDatabase d() throws SQLiteException {
        if (t.m().b() == null) {
            throw new SQLiteException("Can't acce ss database");
        }
        synchronized (c0.class) {
            if (l == null) {
                l = NetworkKitSQLiteOpenHelper.getInstance().getNetworkKitWritableDatabase();
                if (l != null) {
                    l.execSQL("Create table if not exists dns_domain( _id INTEGER PRIMARY KEY AUTOINCREMENT, domain TEXT UNIQUE, ip TEXT, ttl TEXT, source INTEGER, createTime INTEGER);");
                    a();
                }
            }
        }
        if (l != null) {
            return l;
        }
        throw new SQLiteException("Can't access database");
    }

    public static HashMap<String, m0> c() {
        return a(NetworkKitSQLiteOpenHelper.getInstance().getDbByName(d));
    }

    public static boolean b(String str, m0 m0Var) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(f14661a, "invalid parameter: domain is null");
            return false;
        }
        Logger.v(f14661a, "insertOrUpdateAddress: %s", str);
        b0 b0VarA = a(str, m0Var);
        if (b0VarA == null) {
            Logger.w(f14661a, "convert address failed, domain:", str);
            return false;
        }
        try {
            SQLiteDatabase sQLiteDatabaseD = d();
            sQLiteDatabaseD.delete(f, "domain=?", new String[]{str});
            return a(sQLiteDatabaseD, b0VarA);
        } catch (Exception e2) {
            Logger.w(f14661a, "insert exception:" + e2.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(f14661a, "invalid parameter: domain is null");
            return false;
        }
        Logger.v(f14661a, "file cache remove operation:" + str);
        try {
            return d().delete(f, "domain=?", new String[]{str}) >= 0;
        } catch (Exception e2) {
            Logger.i(f14661a, "remove exception:" + e2.getClass().getSimpleName());
            return false;
        }
    }

    public static HashMap<String, m0> b() {
        return a(d());
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, b0 b0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("domain", b0Var.f14588a);
        contentValues.put(h, b0Var.f14589b);
        contentValues.put("ttl", Long.valueOf(b0Var.f14590c));
        contentValues.put("source", Integer.valueOf(b0Var.e));
        contentValues.put("createTime", Long.valueOf(b0Var.d));
        return sQLiteDatabase.replace(f, "", contentValues) > 0;
    }

    public static void a() {
        if (l != null) {
            String strReplace = l.getPath().replace(NetworkKitSQLiteOpenHelper.getInstance().getDbName(), d);
            if (new File(strReplace).exists()) {
                HashMap<String, m0> mapC = c();
                if (!mapC.isEmpty()) {
                    for (Map.Entry<String, m0> entry : mapC.entrySet()) {
                        b(entry.getKey(), entry.getValue());
                    }
                }
                NetworkKitSQLiteOpenHelper.getInstance().deleteDbByName(d);
                NetworkKitSQLiteOpenHelper.getInstance().deleteDbFileByPath(strReplace);
                NetworkKitSQLiteOpenHelper.getInstance().deleteDbFileByPath(strReplace + NetworkKitSQLiteOpenHelper.getInstance().getDbNameSuffix());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap<String, m0> a(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Exception e2;
        Cursor cursorQuery;
        b0 b0Var;
        m0 m0VarA;
        HashMap map = new HashMap();
        HashMap<String, m0> map2 = new HashMap<>();
        Cursor cursor = null;
        if (sQLiteDatabase != null) {
            try {
                cursorQuery = sQLiteDatabase.query(f, k, null, null, null, null, null);
                try {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            while (cursorQuery.moveToNext()) {
                                b0 b0Var2 = new b0();
                                b0Var2.f14588a = cursorQuery.getString(0);
                                b0Var2.f14589b = cursorQuery.getString(1);
                                b0Var2.f14590c = cursorQuery.getLong(2);
                                b0Var2.e = cursorQuery.getInt(3);
                                b0Var2.d = cursorQuery.getLong(4);
                                if (!TextUtils.isEmpty(b0Var2.f14588a)) {
                                    map.put(b0Var2.f14588a, b0Var2);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        Logger.w(f14661a, "getAll exception:" + e2.getClass().getSimpleName());
                        if (cursorQuery != null) {
                        }
                        for (Map.Entry entry : map.entrySet()) {
                            b0Var = (b0) entry.getValue();
                            Logger.v(f14661a, "Address: %s", b0Var);
                            if (b0Var.a()) {
                                b((String) entry.getKey());
                                m0VarA = null;
                            } else {
                                m0VarA = a(b0Var);
                            }
                            if (!y.b(m0VarA)) {
                                map2.put(entry.getKey(), m0VarA);
                            }
                        }
                        return map2;
                    }
                } catch (Throwable th) {
                    cursor = cursorQuery;
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e2 = e4;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        while (r12.hasNext()) {
            b0Var = (b0) entry.getValue();
            Logger.v(f14661a, "Address: %s", b0Var);
            if (b0Var.a()) {
                b((String) entry.getKey());
                m0VarA = null;
            } else {
                m0VarA = a(b0Var);
            }
            if (!y.b(m0VarA)) {
                map2.put(entry.getKey(), m0VarA);
            }
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008a A[PHI: r3
      0x008a: PHI (r3v3 android.database.Cursor) = (r3v2 android.database.Cursor), (r3v5 android.database.Cursor) binds: [B:19:0x0088, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public static m0 a(String str) {
        m0 m0Var = new m0();
        if (TextUtils.isEmpty(str)) {
            Logger.w(f14661a, "invalid parameter: domain is null");
            return m0Var;
        }
        ArrayList<b0> arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = d().query(f, k, "domain=?", new String[]{str}, null, null, null);
                if (cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        b0 b0Var = new b0();
                        b0Var.f14588a = cursorQuery.getString(0);
                        b0Var.f14589b = cursorQuery.getString(1);
                        b0Var.f14590c = cursorQuery.getLong(2);
                        b0Var.e = cursorQuery.getInt(3);
                        b0Var.d = cursorQuery.getLong(4);
                        arrayList.add(b0Var);
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                Logger.w(f14661a, "query exception:" + e2.getClass().getSimpleName());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            for (b0 b0Var2 : arrayList) {
                if (b0Var2.a()) {
                    b(str);
                } else {
                    m0Var = a(b0Var2);
                }
            }
            return m0Var;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static m0 a(b0 b0Var) {
        m0 m0Var = new m0();
        try {
            JSONArray jSONArray = new JSONObject(b0Var.f14589b).getJSONArray("address");
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                m0Var.a(jSONArray.getString(i2));
            }
        } catch (JSONException unused) {
            Logger.w(f14661a, "ConvertAddress Failed:" + b0Var.toString());
        }
        m0Var.b(b0Var.f14590c);
        m0Var.a(b0Var.d);
        m0Var.b(b0Var.e);
        m0Var.a(1);
        y.c(m0Var);
        return m0Var;
    }

    public static b0 a(String str, m0 m0Var) {
        b0 b0Var = null;
        if (y.b(m0Var)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = m0Var.d().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("address", jSONArray);
            b0 b0Var2 = new b0();
            try {
                b0Var2.f14590c = m0Var.h();
                b0Var2.e = m0Var.f();
                b0Var2.f14588a = str;
                b0Var2.f14589b = jSONObject.toString();
                b0Var2.d = m0Var.b();
                return b0Var2;
            } catch (JSONException unused) {
                b0Var = b0Var2;
                Logger.w(f14661a, "ConvertAddress Failed:" + m0Var.toString());
                return b0Var;
            }
        } catch (JSONException unused2) {
        }
    }

    static {
        if (ContextHolder.getKitContext() != null) {
            d = f14663c;
        }
    }
}
