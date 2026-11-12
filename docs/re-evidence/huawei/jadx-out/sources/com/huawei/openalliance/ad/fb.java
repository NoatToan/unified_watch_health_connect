package com.huawei.openalliance.ad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.huawei.openalliance.ad.db.bean.AnalysisEventRecord;
import com.huawei.openalliance.ad.db.bean.ClickEventRecord;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import com.huawei.openalliance.ad.db.bean.ImpEventRecord;
import com.huawei.openalliance.ad.db.bean.ThirdPartyEventRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class fb extends es implements gc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static fb f18744c;
    private static final byte[] d = new byte[0];

    @Override // com.huawei.openalliance.ad.es
    public void e() {
        super.e();
        a(EventRecord.class, (fq) null, (String[]) null);
        a(ImpEventRecord.class, (fq) null, (String[]) null);
        a(ClickEventRecord.class, (fq) null, (String[]) null);
        a(AnalysisEventRecord.class, (fq) null, (String[]) null);
        a(ThirdPartyEventRecord.class, (fq) null, (String[]) null);
    }

    @Override // com.huawei.openalliance.ad.gc
    public void b(Class<? extends EventRecord> cls, List<String> list) {
        a(cls, fq.EVENT_DELETE_BY_ID_WHERE, list);
    }

    @Override // com.huawei.openalliance.ad.gc
    public void b(long j, List<String> list) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("lastReportTime", Long.valueOf(j));
        a(ThirdPartyEventRecord.class, contentValues, fq.THIRD_PARTY_EVENT_UPDATE_BY_ID_WHERE, list);
    }

    @Override // com.huawei.openalliance.ad.gc
    public List<ThirdPartyEventRecord> b(long j, int i) {
        return a(ThirdPartyEventRecord.class, null, fq.THIER_PARTY_EVENT_UPLOAD_ITEMS_WHERE, new String[]{String.valueOf(com.huawei.openalliance.ad.utils.as.c() - j)}, "lastReportTime asc", String.valueOf(i));
    }

    @Override // com.huawei.openalliance.ad.gc
    public void a(List<String> list) {
        a(ThirdPartyEventRecord.class, fq.THIRD_PARTY_EVENT_DELETE_BY_ID_WHERE, list);
    }

    @Override // com.huawei.openalliance.ad.gc
    public void a(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("requestId", str2);
        a(ThirdPartyEventRecord.class, contentValues, fq.THIRD_PARTY_EVENT_UPDATE_BY_ID_WHERE, new String[]{str});
    }

    public void a(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(j));
        a(EventMonitorRecord.class, contentValues, fq.EVENT_MONITOR_RECORD_UPDATE_BY_EVENT_ID_WHERE, new String[]{str});
    }

    @Override // com.huawei.openalliance.ad.gc
    public void a(Class<? extends EventRecord> cls, String str, String str2, long j, List<String> list) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("lastReportTime", str);
        contentValues.put(EventRecord.LAST_FAIL_REASON, str2);
        contentValues.put(EventRecord.REPEATED_COUNT, Long.valueOf(j));
        a(cls, contentValues, fq.EVENT_REPORT_FAILED_UPDATE_BY_ID_WHERE, list);
    }

    @Override // com.huawei.openalliance.ad.gc
    public void a(ThirdPartyEventRecord thirdPartyEventRecord) {
        a(ThirdPartyEventRecord.class, thirdPartyEventRecord.d(this.f18718a));
    }

    public void a(EventMonitorRecord eventMonitorRecord, int i) {
        a(EventMonitorRecord.class, eventMonitorRecord.d(this.f18718a));
        a(i);
    }

    @Override // com.huawei.openalliance.ad.gc
    public void a(long j, List<String> list) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ThirdPartyEventRecord.LOCK_TIME, Long.valueOf(j));
        a(ThirdPartyEventRecord.class, contentValues, fq.THIRD_PARTY_EVENT_UPDATE_BY_ID_WHERE, list);
    }

    @Override // com.huawei.openalliance.ad.gc
    public void a(long j, int i) {
        a(EventRecord.class, fq.EVENT_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(j), String.valueOf(i)});
        a(ImpEventRecord.class, fq.EVENT_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(j), String.valueOf(i)});
        a(ClickEventRecord.class, fq.EVENT_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(j), String.valueOf(i)});
        a(AnalysisEventRecord.class, fq.EVENT_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(j), String.valueOf(i)});
        a(ThirdPartyEventRecord.class, fq.THIRD_PARTY_EVENT_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(j), String.valueOf(i)});
        a(EventMonitorRecord.class, fq.EVENT_MONITOR_RECORD_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(j), String.valueOf(i)});
    }

    protected Map<String, EventRecord> a(Class<? extends EventRecord> cls, String[] strArr, String str, String str2) throws Throwable {
        dg dgVarA;
        StringBuilder sb;
        HashMap map = new HashMap();
        Cursor cursor = null;
        try {
            dgVarA = dg.a(this.f18718a);
            try {
                Cursor cursorA = dgVarA.a(cls.getSimpleName(), strArr, null, null, str, str2);
                if (cursorA != null) {
                    while (cursorA.moveToNext()) {
                        try {
                            try {
                                EventRecord eventRecordNewInstance = cls.newInstance();
                                eventRecordNewInstance.a(cursorA);
                                map.put(eventRecordNewInstance.i(), eventRecordNewInstance);
                            } catch (RuntimeException e) {
                                sb = new StringBuilder();
                                sb.append("query RuntimeException:");
                                sb.append(e.getClass().getSimpleName());
                                hw.d("EventDao", sb.toString());
                            } catch (Exception e2) {
                                sb = new StringBuilder();
                                sb.append("query exception:");
                                sb.append(e2.getClass().getSimpleName());
                                hw.d("EventDao", sb.toString());
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorA;
                            a(cursor);
                            a(dgVarA);
                            throw th;
                        }
                    }
                }
                a(cursorA);
                a(dgVarA);
                return map;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            dgVarA = null;
        }
    }

    @Override // com.huawei.openalliance.ad.gc
    public Map<String, EventRecord> a(Class<? extends EventRecord> cls, int i) {
        return a(cls, (String[]) null, "_id desc", String.valueOf(i));
    }

    public EventMonitorRecord a(String str) {
        List listA = a(EventMonitorRecord.class, null, fq.EVENT_MONITOR_RECORD_BY_EVENT_ID_WHERE, new String[]{str}, null, null);
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return null;
        }
        return (EventMonitorRecord) listA.get(0);
    }

    @Override // com.huawei.openalliance.ad.gc
    public long a(Class<? extends EventRecord> cls, EventRecord eventRecord) {
        return a(cls, eventRecord.d(this.f18718a));
    }

    private void a(int i) {
        List<String> listA = a();
        hw.a("EventDao", "delete over: size:%s, limit:%s", Integer.valueOf(listA.size()), Integer.valueOf(i));
        int size = listA.size() - i;
        if (size <= 0) {
            return;
        }
        a(EventMonitorRecord.class, fq.EVENT_MONITOR_RECORD_UPDATE_BY_EVENT_ID_WHERE, listA.subList(0, size));
    }

    private List<String> a() {
        ArrayList arrayList = new ArrayList();
        List listA = a(EventMonitorRecord.class, new String[]{EventMonitorRecord.EVENT_ID}, null, null, "addTime asc", null);
        if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((EventMonitorRecord) it.next()).a());
            }
        }
        return arrayList;
    }

    public static fb a(Context context) {
        fb fbVar;
        synchronized (d) {
            if (f18744c == null) {
                f18744c = new fb(context);
            }
            fbVar = f18744c;
        }
        return fbVar;
    }

    protected fb(Context context) {
        super(context);
    }
}
