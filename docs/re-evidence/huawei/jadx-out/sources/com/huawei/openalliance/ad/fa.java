package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.DeletedContentRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class fa extends es {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static fa f18743c;
    private static final byte[] d = new byte[0];

    public void b(DeletedContentRecord deletedContentRecord) {
        if (deletedContentRecord == null) {
            return;
        }
        synchronized (d) {
            String strA = deletedContentRecord.a();
            if (a(strA) != null) {
                a(DeletedContentRecord.class, deletedContentRecord.d(this.f18718a), fq.DELETED_CONTENT_BY_ID_WHERE, new String[]{strA});
            } else {
                a(deletedContentRecord);
            }
        }
    }

    public void b() {
        long jC = com.huawei.openalliance.ad.utils.as.c() - 604800000;
        hw.a("DeletedContentRecordDao", "deleteExpireIds where updateTime before %s", Long.valueOf(jC));
        a(DeletedContentRecord.class, fq.DELETED_CONTENT_EXPIRE_WHERE, new String[]{String.valueOf(jC)});
    }

    public void a(DeletedContentRecord deletedContentRecord) {
        a(DeletedContentRecord.class, deletedContentRecord.d(this.f18718a));
    }

    public List<String> a() {
        return a(a(DeletedContentRecord.class, new String[]{"contentId"}, fq.DELETED_CONTENT_IDS_WHERE, new String[]{String.valueOf(com.huawei.openalliance.ad.utils.as.c() - 604800000)}, null, null));
    }

    public DeletedContentRecord a(String str) {
        List listA = a(DeletedContentRecord.class, new String[]{"contentId"}, fq.DELETED_CONTENT_BY_ID_WHERE, new String[]{str}, null, null);
        if (listA.isEmpty()) {
            return null;
        }
        return (DeletedContentRecord) listA.get(0);
    }

    private List<String> a(List<DeletedContentRecord> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<DeletedContentRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    public static fa a(Context context) {
        fa faVar;
        synchronized (d) {
            if (f18743c == null) {
                f18743c = new fa(context);
            }
            faVar = f18743c;
        }
        return faVar;
    }

    protected fa(Context context) {
        super(context);
    }
}
