package com.xmlywind.sdk.base.common;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.xmlywind.logger.SigmobLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class e implements Serializable {
    private static final long serialVersionUID = 1;
    private final a a;
    private final String b;
    private final com.xmlywind.sdk.base.common.a c;
    private final String d;
    private String e;
    private Long f;
    private Long g;
    private Integer h;
    private Integer i;
    private String j;
    private boolean k;

    public enum a {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public e(a aVar, String str, String str2, com.xmlywind.sdk.base.common.a aVar2, String str3) {
        this.d = str3;
        this.a = aVar;
        this.j = str;
        this.b = str2;
        this.c = aVar2;
        this.e = AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE;
    }

    public e(a aVar, String str, String str2, String str3) {
        this(aVar, str, str2, null, str3);
    }

    public e(String str, String str2, String str3) {
        this(a.TRACKING_URL, str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f5 A[DONT_GENERATE, PHI: r3
      0x00f5: PHI (r3v2 android.database.Cursor) = (r3v1 android.database.Cursor), (r3v3 android.database.Cursor) binds: [B:39:0x00f3, B:35:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    public static List<e> a(int i, long j) {
        int i2;
        int i3 = i;
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = com.xmlywind.sdk.common.a.c.a().getReadableDatabase().rawQuery("select * from tracks where timestamp > " + (System.currentTimeMillis() - j) + " order by id desc limit " + i3, null);
            if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                int columnIndex = cursorRawQuery.getColumnIndex("url");
                int columnIndex2 = cursorRawQuery.getColumnIndex("id");
                int columnIndex3 = cursorRawQuery.getColumnIndex("event");
                int columnIndex4 = cursorRawQuery.getColumnIndex("request_id");
                int columnIndex5 = cursorRawQuery.getColumnIndex("timestamp");
                int columnIndex6 = cursorRawQuery.getColumnIndex("source");
                int columnIndex7 = cursorRawQuery.getColumnIndex("retryNum");
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        String string = cursorRawQuery.getString(columnIndex);
                        Long lValueOf = Long.valueOf(cursorRawQuery.getLong(columnIndex2));
                        String string2 = cursorRawQuery.getString(columnIndex3);
                        String string3 = cursorRawQuery.getString(columnIndex4);
                        long j2 = cursorRawQuery.getLong(columnIndex5);
                        String string4 = cursorRawQuery.getString(columnIndex6);
                        int i5 = cursorRawQuery.getInt(columnIndex7);
                        if (TextUtils.isEmpty(string) || lValueOf.longValue() < 0 || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                            i2 = columnIndex;
                        } else {
                            i2 = columnIndex;
                            try {
                                e eVar = new e(string, string2, string3);
                                eVar.b(lValueOf);
                                eVar.a(Integer.valueOf(i5).intValue());
                                eVar.a(Long.valueOf(j2));
                                if (!TextUtils.isEmpty(string4)) {
                                    eVar.a(string4);
                                }
                                arrayList.add(eVar);
                            } catch (Throwable th) {
                                th = th;
                                SigmobLog.e("getAdTrackList error", th);
                            }
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            i4++;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = columnIndex;
                    }
                    i3 = i;
                    columnIndex = i2;
                }
            }
            if (cursorRawQuery != null) {
            }
        } catch (Throwable th3) {
            try {
                SigmobLog.e("getlogs fail", th3);
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        }
        return arrayList;
    }

    private void a(int i) {
        this.i = Integer.valueOf(i);
    }

    public static void a(long j) {
        try {
            com.xmlywind.sdk.common.a.a.a().a("tracks", "timestamp < " + (System.currentTimeMillis() - j), new com.xmlywind.sdk.common.a.c.a() { // from class: com.xmlywind.sdk.base.common.e.1
                @Override // com.xmlywind.sdk.common.a.c.a
                public void onFailed(Throwable th) {
                    SigmobLog.e(th.getMessage());
                }

                @Override // com.xmlywind.sdk.common.a.c.a
                public void onSuccess() {
                }
            });
        } catch (Throwable th) {
            SigmobLog.e("cleanExpiredAdTracker error", th);
        }
    }

    public static void b(long j) {
        long count;
        Cursor cursor = null;
        l = null;
        Long l = null;
        try {
            SQLiteDatabase readableDatabase = com.xmlywind.sdk.common.a.c.a().getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("select * from tracks", null);
            if (cursorRawQuery != null) {
                try {
                    count = cursorRawQuery.getCount();
                    cursorRawQuery.close();
                    cursorRawQuery = null;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    try {
                        SigmobLog.e("cleanLimitAdTracker ", th);
                        if (cursor != null) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            } else {
                count = 0;
            }
            if (count > j) {
                cursorRawQuery = readableDatabase.rawQuery("select * from tracks order by id desc limit " + j, null);
                int columnIndex = cursorRawQuery.getColumnIndex("id");
                if (cursorRawQuery.moveToLast()) {
                    Long lValueOf = Long.valueOf(cursorRawQuery.getLong(columnIndex));
                    cursorRawQuery.close();
                    cursorRawQuery = null;
                    l = lValueOf;
                }
            }
            if (l != null) {
                com.xmlywind.sdk.common.a.a.a().a("tracks", "id <'" + l + "'", new com.xmlywind.sdk.common.a.c.a() { // from class: com.xmlywind.sdk.base.common.e.2
                    @Override // com.xmlywind.sdk.common.a.c.a
                    public void onFailed(Throwable th2) {
                        SigmobLog.e(th2.getMessage());
                    }

                    @Override // com.xmlywind.sdk.common.a.c.a
                    public void onSuccess() {
                    }
                });
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void b(Long l) {
        this.f = l;
    }

    public String a() {
        return this.e;
    }

    public void a(final com.xmlywind.sdk.common.a.c.a aVar) {
        try {
            com.xmlywind.sdk.common.a.b.C1071b.a aVar2 = new com.xmlywind.sdk.common.a.b.C1071b.a();
            aVar2.a("tracks");
            HashMap map = new HashMap();
            map.put("url", this.j);
            map.put("request_id", this.d);
            map.put("event", this.b);
            map.put("source", this.e);
            map.put("retryNum", this.i);
            map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            aVar2.a(map);
            com.xmlywind.sdk.common.a.c.a().a(com.xmlywind.sdk.common.a.c.a().getWritableDatabase(), aVar2.a(), new com.xmlywind.sdk.common.a.c.a() { // from class: com.xmlywind.sdk.base.common.e.3
                @Override // com.xmlywind.sdk.common.a.c.a
                public void onFailed(Throwable th) {
                    com.xmlywind.sdk.common.a.c.a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.onFailed(th);
                    }
                    SigmobLog.e(th.getMessage());
                }

                @Override // com.xmlywind.sdk.common.a.c.a
                public void onSuccess() {
                    SigmobLog.d("event: " + e.this.b + " url " + e.this.j + " mRequest_id: " + e.this.d + " insert success! ");
                    com.xmlywind.sdk.common.a.c.a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.onSuccess();
                    }
                }
            });
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    public void a(Integer num) {
        this.h = num;
    }

    public void a(Long l) {
        this.g = l;
    }

    public void a(String str) {
        this.e = str;
    }

    public int b() {
        return this.i.intValue();
    }

    public void b(String str) {
        this.j = str;
    }

    public void c() {
        this.i = Integer.valueOf(this.i.intValue() + 1);
    }

    public void d() {
        com.xmlywind.sdk.common.a.b.c.a aVar = new com.xmlywind.sdk.common.a.b.c.a();
        aVar.a("tracks");
        aVar.b(" where id=" + this.f.toString());
        HashMap map = new HashMap();
        map.put("retryNum", this.i);
        aVar.a(map);
        com.xmlywind.sdk.common.a.c.a().a(com.xmlywind.sdk.common.a.c.a().getWritableDatabase(), aVar.a().a(), (com.xmlywind.sdk.common.a.c.a) null);
    }

    public Long e() {
        return this.f;
    }

    public void f() {
        if (this.f == null) {
            return;
        }
        com.xmlywind.sdk.common.a.a.a().a("tracks", "id ='" + this.f + "'", new com.xmlywind.sdk.common.a.c.a() { // from class: com.xmlywind.sdk.base.common.e.4
            @Override // com.xmlywind.sdk.common.a.c.a
            public void onFailed(Throwable th) {
                SigmobLog.e(th.getMessage());
            }

            @Override // com.xmlywind.sdk.common.a.c.a
            public void onSuccess() {
                SigmobLog.d("delete id " + e.this.f);
            }
        });
    }

    public long g() {
        Long l = this.g;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public a h() {
        return this.a;
    }

    public Integer i() {
        Integer num = this.h;
        if (num == null) {
            return 0;
        }
        return num;
    }

    public String j() {
        return this.j;
    }

    public void k() {
        this.k = true;
    }

    public boolean l() {
        return this.k;
    }

    public String m() {
        return this.b;
    }

    public String n() {
        return this.d;
    }

    public com.xmlywind.sdk.base.common.a o() {
        return this.c;
    }
}
