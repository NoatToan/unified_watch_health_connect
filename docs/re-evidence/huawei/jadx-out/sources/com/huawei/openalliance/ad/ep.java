package com.huawei.openalliance.ad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.huawei.openalliance.ad.db.bean.AppDataCollectionRecord;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ep extends es {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ep f18711c;
    private static final byte[] d = new byte[0];
    private static final byte[] e = new byte[0];

    public Map<String, Long> d() {
        Object th;
        dg dgVarA;
        HashMap map = new HashMap();
        Cursor cursorA = null;
        try {
            dgVarA = dg.a(this.f18718a);
            try {
                cursorA = dgVarA.a("SELECT eventType, COUNT(*) as cnt FROM " + a().getSimpleName() + " GROUP BY eventType", (String[]) null);
                if (cursorA != null) {
                    while (cursorA.moveToNext()) {
                        int columnIndex = cursorA.getColumnIndex("eventType");
                        String string = columnIndex != -1 ? cursorA.getString(columnIndex) : "";
                        int columnIndex2 = cursorA.getColumnIndex("cnt");
                        long j = columnIndex2 != -1 ? cursorA.getLong(columnIndex2) : 0L;
                        if (!com.huawei.openalliance.ad.utils.dg.b(string) && j > 0) {
                            map.put(string, Long.valueOf(j));
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    hw.c("AppDataCollectionRecordDao", "query cached app data exception: %s", th.getClass().getSimpleName());
                } finally {
                    a(cursorA);
                    a(dgVarA);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dgVarA = null;
        }
        return map;
    }

    public long c() {
        return a(a());
    }

    public void b() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(5, -15);
        hw.b("AppDataCollectionRecordDao", "delete expire records over 15 days, expire times: %s", calendar.getTime());
        a(a(), fq.APP_DATA_COLLECTION_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(calendar.getTime().getTime())});
    }

    public int b(List<String> list) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            hw.b("AppDataCollectionRecordDao", "deleteRecords with empty id list");
            return 0;
        }
        hw.a("AppDataCollectionRecordDao", "deleteRecords size is : %s", Integer.valueOf(list.size()));
        return a(a(), fq.APP_DATA_COLLECTION_DELETE_WHERE, list);
    }

    public List<AppDataCollectionRecord> a(int i) {
        if (i <= 0) {
            i = 50;
        }
        return a(a(), null, null, null, "reportTimestamp DESC", String.valueOf(i));
    }

    protected Class<? extends com.huawei.openalliance.ad.db.bean.a> a() {
        return AppDataCollectionRecord.class;
    }

    public long a(List<AppDataCollectionRecord> list) {
        long jA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.huawei.openalliance.ad.utils.bm.a(list) || this.f18718a == null) {
            return -1L;
        }
        synchronized (d) {
            ArrayList arrayList = new ArrayList();
            Iterator<AppDataCollectionRecord> it = list.iterator();
            while (it.hasNext()) {
                try {
                    ContentValues contentValuesD = it.next().d(this.f18718a);
                    if (contentValuesD != null) {
                        arrayList.add(contentValuesD);
                    }
                } catch (Exception unused) {
                    hw.c("AppDataCollectionRecordDao", "convert to record error");
                }
            }
            jA = a(a(), arrayList);
        }
        hw.a("AppDataCollectionRecordDao", "insertAppDataRecords duration: %s ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return jA;
    }

    public static ep a(Context context) {
        ep epVar;
        synchronized (e) {
            if (f18711c == null) {
                f18711c = new ep(context);
            }
            epVar = f18711c;
        }
        return epVar;
    }

    public ep(Context context) {
        super(context);
    }
}
