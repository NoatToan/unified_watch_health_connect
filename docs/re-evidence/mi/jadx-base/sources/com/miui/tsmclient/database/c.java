package com.miui.tsmclient.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.miui.tsmclient.common.util.Coder;
import com.miui.tsmclient.entity.TravelInfo;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import defpackage.d4s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static final int c = 20;
    public static final int d = 0;
    public static final int e = 8;
    public static volatile c f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, List<TravelInfo>> f10341b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f10340a = Executors.newSingleThreadExecutor();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f10342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TravelInfo f10343b;

        public a(Context context, TravelInfo travelInfo) {
            this.f10342a = context;
            this.f10343b = travelInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            List listC = c.this.c(this.f10342a, this.f10343b.getTrafficCardName());
            if (!ObjectUtils.isCollectionEmpty((List<?>) listC) && listC.size() >= 20) {
                c.this.a(this.f10342a, this.f10343b.getTrafficCardName(), ((TravelInfo) listC.get(0)).getTradeTime());
                listC.remove(0);
            }
            try {
                String strB = d4s.b(this.f10343b.toString(), Coder.stringToHexString(this.f10343b.getTrafficCardName()).substring(0, 8));
                ContentValues contentValues = new ContentValues(3);
                contentValues.put("card_name", this.f10343b.getTrafficCardName());
                contentValues.put("key", this.f10343b.getTradeTime());
                contentValues.put("value", strB);
                this.f10342a.getContentResolver().insert(DatabaseConstants.CONTENT_URI_TRAVEL_INFO, contentValues);
                listC.add(this.f10343b);
            } catch (Exception e) {
                LogUtils.d(" encrypt data fail " + e);
            }
        }
    }

    public synchronized int b(Context context, String str) {
        if (context == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("card_name = " + str);
        int iDelete = context.getContentResolver().delete(DatabaseConstants.CONTENT_URI_TRAVEL_INFO, sb.toString(), null);
        LogUtils.i("delete all, travel info cache count: " + iDelete);
        this.f10341b.remove(str);
        return iDelete;
    }

    public final synchronized List<TravelInfo> c(Context context, String str) {
        if (context == null) {
            return new ArrayList();
        }
        if (!ObjectUtils.isCollectionEmpty(this.f10341b) && this.f10341b.containsKey(str) && !ObjectUtils.isCollectionEmpty(this.f10341b.get(str))) {
            return this.f10341b.get(str);
        }
        ArrayList arrayList = new ArrayList(20);
        Cursor cursorQuery = context.getContentResolver().query(DatabaseConstants.CONTENT_URI_TRAVEL_INFO, DatabaseConstants.PROJECTION_TRAVEL_INFO, "card_name='" + str + "'", null, "key");
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    TravelInfo travelInfo = new TravelInfo();
                    int columnIndex = cursorQuery.getColumnIndex("key");
                    int columnIndex2 = cursorQuery.getColumnIndex("value");
                    travelInfo.setTradeTime(Long.valueOf(cursorQuery.getLong(columnIndex)));
                    try {
                        arrayList.add(travelInfo.fromString(d4s.a(cursorQuery.getString(columnIndex2), Coder.stringToHexString(str).substring(0, 8))));
                    } catch (Exception e2) {
                        LogUtils.e(" decrypt data fails " + e2);
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
        }
        this.f10341b.put(str, arrayList);
        return arrayList;
    }

    public List<TravelInfo> d(Context context, String str) {
        return a(context, str);
    }

    public final List<TravelInfo> a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        List<TravelInfo> listC = c(context, str);
        if (!ObjectUtils.isCollectionEmpty(listC)) {
            for (int size = listC.size() - 1; size >= 0; size--) {
                TravelInfo travelInfo = listC.get(size);
                if (travelInfo != null) {
                    arrayList.add(new TravelInfo(travelInfo));
                }
            }
        }
        return arrayList;
    }

    public final int a(Context context, String str, Long l) {
        if (context == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("key = " + l);
        sb.append(" AND ");
        sb.append("card_name = " + str);
        int iDelete = context.getContentResolver().delete(DatabaseConstants.CONTENT_URI_TRAVEL_INFO, sb.toString(), null);
        LogUtils.i("delete " + l + ", travel info cache count: " + iDelete);
        return iDelete;
    }

    public static c a() {
        if (f == null) {
            synchronized (c.class) {
                try {
                    if (f == null) {
                        f = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public void a(Context context, TravelInfo travelInfo) {
        LogUtils.d("save traveling info ");
        if (context == null || travelInfo == null) {
            return;
        }
        this.f10340a.execute(new a(context, travelInfo));
    }
}
