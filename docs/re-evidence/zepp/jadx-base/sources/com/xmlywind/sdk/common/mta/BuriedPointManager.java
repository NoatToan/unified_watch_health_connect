package com.xmlywind.sdk.common.mta;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Base64;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.a.c;
import com.xmlywind.sdk.common.e.a;
import com.xmlywind.volley.s;
import io.netty.util.internal.StringUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: loaded from: classes22.dex */
public class BuriedPointManager {
    private static BuriedPointManager a = null;
    private static int b = 20;
    private final ReadWriteLock c = new ReentrantReadWriteLock();
    private HashMap<Integer, String> d = null;
    private volatile boolean e;

    public static class BuriedPointManagerFactory {
        public static BuriedPointManager a = new BuriedPointManager();

        private BuriedPointManagerFactory() {
        }
    }

    private static HashMap<Integer, String> a(int i) {
        HashMap<Integer, String> map;
        synchronized (BuriedPointManager.class) {
            map = new HashMap<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = c.a().getReadableDatabase().rawQuery("select * from point where item not null order by point_id", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("item");
                    int columnIndex2 = cursorRawQuery.getColumnIndex("point_id");
                    for (int i2 = 0; i2 < i; i2++) {
                        String string = cursorRawQuery.getString(columnIndex);
                        int i3 = cursorRawQuery.getInt(columnIndex2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(Integer.valueOf(i3), string);
                        }
                        if (!cursorRawQuery.moveToNext()) {
                            break;
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                try {
                    SigmobLog.e("getlogs fail", th);
                    if (cursorRawQuery != null) {
                    }
                } catch (Throwable th2) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th2;
                }
            }
        }
        return map;
    }

    private static void a() {
        try {
            long jQueryNumEntries = DatabaseUtils.queryNumEntries(c.a().getWritableDatabase(), "point");
            if (jQueryNumEntries <= 5000) {
                return;
            }
            a(jQueryNumEntries - 5000);
        } catch (Throwable th) {
            SigmobLog.e("clearLogDB fail", th);
        }
    }

    private static void a(long j) {
        try {
            SigmobLog.d("begin numRows " + DatabaseUtils.queryNumEntries(c.a().getReadableDatabase(), "point"));
            StringBuilder sb = new StringBuilder();
            sb.append("delete from ");
            sb.append("point");
            sb.append(" where point_id in ( ");
            sb.append(" select point_id from ");
            sb.append("point");
            sb.append(" order by point_id ");
            sb.append(" limit " + j);
            sb.append(" )");
            SQLiteDatabase writableDatabase = c.a().getWritableDatabase();
            writableDatabase.execSQL(sb.toString());
            SigmobLog.d("end numRows " + DatabaseUtils.queryNumEntries(writableDatabase, "point"));
        } catch (Throwable th) {
            SigmobLog.e("clearLogDB fail", th);
        }
    }

    private void a(String str) {
        this.e = true;
        a.a(str, new a.InterfaceC1072a() { // from class: com.xmlywind.sdk.common.mta.BuriedPointManager.1
            @Override // com.xmlywind.sdk.common.e.a.InterfaceC1072a
            public void onErrorResponse(s sVar) {
                BuriedPointManager.this.e = false;
                BuriedPointManager.this.d = null;
                SigmobLog.e(sVar.getMessage());
            }

            @Override // com.xmlywind.sdk.common.e.a.InterfaceC1072a
            public void onSuccess() {
                BuriedPointManager.this.clearLog();
            }
        });
    }

    private static void a(Set<Integer> set) {
        try {
            Iterator<Integer> it2 = set.iterator();
            if (!it2.hasNext()) {
                return;
            }
            SigmobLog.d("begin numRows " + DatabaseUtils.queryNumEntries(c.a().getReadableDatabase(), "point"));
            StringBuilder sb = new StringBuilder();
            sb.append("delete from ");
            sb.append("point");
            sb.append(" where point_id in ( ");
            while (true) {
                sb.append(it2.next());
                if (!it2.hasNext()) {
                    sb.append(" )");
                    SQLiteDatabase writableDatabase = c.a().getWritableDatabase();
                    writableDatabase.execSQL(sb.toString());
                    SigmobLog.d("end numRows " + DatabaseUtils.queryNumEntries(writableDatabase, "point"));
                    return;
                }
                sb.append(',');
                sb.append(StringUtil.SPACE);
            }
        } catch (Throwable th) {
            SigmobLog.e("clearLogDB fail", th);
        }
    }

    private static void b() {
        try {
            SigmobLog.d("begin numRows " + DatabaseUtils.queryNumEntries(c.a().getReadableDatabase(), "point"));
            SQLiteDatabase writableDatabase = c.a().getWritableDatabase();
            writableDatabase.execSQL("delete from point where item is null");
            SigmobLog.d("end numRows " + DatabaseUtils.queryNumEntries(writableDatabase, "point"));
        } catch (Throwable th) {
            SigmobLog.e("clearLogDB fail", th);
        }
    }

    public static void clearLogDB() {
        b();
        a();
    }

    public static String deflateAndBase64(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        deflaterOutputStream.write(str.getBytes(Charset.forName("UTF-8")));
        deflaterOutputStream.flush();
        deflaterOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static BuriedPointManager getInstance() {
        return BuriedPointManagerFactory.a;
    }

    public void clearLog() {
        this.c.writeLock().lock();
        HashMap<Integer, String> map = this.d;
        if (map != null && map.size() != 0) {
            a(this.d.keySet());
            this.e = false;
            this.d = null;
        }
        this.c.writeLock().unlock();
    }

    public String sendPoint() {
        HashMap<Integer, String> map;
        this.c.readLock().lock();
        String uRLEncoded = null;
        if (!this.e && ((map = this.d) == null || map.size() <= 0)) {
            HashMap<Integer, String> mapA = a(b);
            this.d = mapA;
            if (mapA.size() != 0) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    Iterator<String> it2 = this.d.values().iterator();
                    while (it2.hasNext()) {
                        sb.append(it2.next());
                        if (it2.hasNext()) {
                            sb.append(",");
                        }
                    }
                    sb.append("]");
                    String string = sb.toString();
                    String str = "_uniq_key=" + ("sigandroid_" + com.xmlywind.sdk.common.a.n().ab()) + "&_batch_value=" + string;
                    try {
                        SigmobLog.d("BPLog_Count: " + this.d.size());
                        uRLEncoded = PointEntitySuper.toURLEncoded(deflateAndBase64(str));
                        a(uRLEncoded);
                    } catch (IOException e) {
                        SigmobLog.e(e.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        SigmobLog.e(th.getMessage());
                    } finally {
                        this.c.readLock().unlock();
                    }
                }
            }
        }
        return uRLEncoded;
    }
}
