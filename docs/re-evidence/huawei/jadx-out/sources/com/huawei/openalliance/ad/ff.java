package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.IntentDataRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ff extends es {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ff f18754c;
    private static final byte[] d = new byte[0];

    public void a(List<IntentDataRecord> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IntentDataRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().a()));
        }
        hw.a("IntentDataRecordDao", "batchDeleteRecordById idList is %s", arrayList);
        hw.a("IntentDataRecordDao", "batchDeleteRecordById ret is %s", Integer.valueOf(a(IntentDataRecord.class, fq.DELETE_INTENT_EVENT_BY_ID, arrayList)));
    }

    public void a(long j) {
        hw.a("IntentDataRecordDao", "delete record by time: %s", Long.valueOf(j));
        a(IntentDataRecord.class, fq.DELETE_INTENT_EVENT_BY_EXPIRE_TIME, new String[]{String.valueOf(j)});
    }

    public List<IntentDataRecord> a(int i) {
        hw.a("IntentDataRecordDao", "queryLatestNRecords limit is %s", Integer.valueOf(i));
        try {
            return a(IntentDataRecord.class, null, null, null, "time desc", String.valueOf(i));
        } catch (Throwable unused) {
            hw.c("IntentDataRecordDao", "query intent error");
            return new ArrayList();
        }
    }

    public long a(IntentDataRecord intentDataRecord) {
        if (intentDataRecord == null) {
            hw.c("IntentDataRecordDao", "insert intent data is empty");
            return 0L;
        }
        hw.a("IntentDataRecordDao", "insert intent data: %s", intentDataRecord.toString());
        return a(IntentDataRecord.class, intentDataRecord.d(this.f18718a));
    }

    public static ff a(Context context) {
        ff ffVar;
        synchronized (d) {
            if (f18754c == null) {
                f18754c = new ff(context);
            }
            ffVar = f18754c;
        }
        return ffVar;
    }

    protected ff(Context context) {
        super(context);
    }
}
