package com.xmlywind.sdk.common.a;

import android.database.Cursor;
import com.xmlywind.logger.SigmobLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public class a {
    private static final a a = new a();
    private final Object c = new Object();
    private final ThreadPoolExecutor b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1, TimeUnit.MINUTES, new ArrayBlockingQueue(10));

    /* JADX INFO: renamed from: com.xmlywind.sdk.common.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1069a {
        void a(Error error);

        void a(List<Map> list);
    }

    public class b implements Runnable {
        private final String b;
        private final String c;
        private final com.xmlywind.sdk.common.a.c.a d;

        public b(String str, String str2, com.xmlywind.sdk.common.a.c.a aVar) {
            this.b = str;
            this.c = str2;
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.xmlywind.sdk.common.a.c.a().getWritableDatabase().delete(this.b, this.c, null);
                com.xmlywind.sdk.common.a.c.a aVar = this.d;
                if (aVar != null) {
                    aVar.onSuccess();
                }
            } catch (Throwable th) {
                com.xmlywind.sdk.common.a.c.a aVar2 = this.d;
                if (aVar2 != null) {
                    aVar2.onFailed(th);
                }
            }
        }
    }

    public class c implements Runnable {
        private final String b;
        private final String[] c;
        private final String d;
        private final String[] e;
        private final String f;
        private final String g;
        private final String h;
        private final String i;
        private final InterfaceC1069a j;

        public c(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC1069a interfaceC1069a) {
            this.b = str;
            this.c = strArr;
            this.d = str2;
            this.e = strArr2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = interfaceC1069a;
        }

        private List<Map> a(Cursor cursor) {
            Object objValueOf;
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                String[] columnNames = cursor.getColumnNames();
                HashMap map = new HashMap();
                for (String str : columnNames) {
                    int type = cursor.getType(cursor.getColumnIndex(str));
                    if (type == 1) {
                        objValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex(str)));
                    } else if (type != 2) {
                        if (type == 3) {
                            objValueOf = cursor.getString(cursor.getColumnIndex(str));
                        } else if (type == 4) {
                            map.put(str, cursor.getBlob(cursor.getColumnIndex(str)));
                        }
                    } else {
                        objValueOf = Double.valueOf(cursor.getDouble(cursor.getColumnIndex(str)));
                    }
                    map.put(str, objValueOf);
                }
                arrayList.add(map);
            }
            return arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            Cursor cursorQuery;
            try {
                cursorQuery = com.xmlywind.sdk.common.a.c.a().getReadableDatabase().query(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
                try {
                    List<Map> listA = a(cursorQuery);
                    InterfaceC1069a interfaceC1069a = this.j;
                    if (interfaceC1069a != null) {
                        interfaceC1069a.a(listA);
                    }
                    if (cursorQuery == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        InterfaceC1069a interfaceC1069a2 = this.j;
                        if (interfaceC1069a2 != null) {
                            interfaceC1069a2.a(new Error(th.getMessage()));
                        }
                    } finally {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursorQuery = null;
            }
        }
    }

    private a() {
    }

    public static a a() {
        a aVar;
        synchronized (a.class) {
            aVar = a;
        }
        return aVar;
    }

    public int a(String str) {
        return a(str, null);
    }

    public int a(String str, String str2) {
        Throwable th;
        Cursor cursorQuery;
        int count = 0;
        try {
            cursorQuery = com.xmlywind.sdk.common.a.c.a().getReadableDatabase().query(str, null, str2, null, null, null, null, null);
            try {
                count = cursorQuery.getCount();
            } catch (Throwable th2) {
                th = th2;
                try {
                    SigmobLog.e(th.getMessage());
                    return count;
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        return count;
    }

    public void a(String str, String str2, com.xmlywind.sdk.common.a.c.a aVar) {
        try {
            this.b.submit(new b(str, str2, aVar));
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            aVar.onFailed(th);
        }
    }

    public void a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC1069a interfaceC1069a) {
        this.b.submit(new c(str, strArr, str2, strArr2, str3, str4, str5, str6, interfaceC1069a));
    }
}
