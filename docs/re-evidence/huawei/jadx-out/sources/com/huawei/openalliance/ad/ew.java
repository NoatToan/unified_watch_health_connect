package com.huawei.openalliance.ad;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.v3.CachedContent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class ew extends es implements fz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ew f18736c;
    private static final byte[] d = new byte[0];
    private static final byte[] e = new byte[0];

    @Deprecated
    public ContentRecord a(String str, String str2, String str3, int i, long j) {
        return null;
    }

    @Override // com.huawei.openalliance.ad.fz
    public void a(ContentRecord contentRecord, String str) {
    }

    @Deprecated
    public void b(String str, String str2, String str3, String str4) {
    }

    @Override // com.huawei.openalliance.ad.es
    public void e() {
        super.e();
        a(a(), (fq) null, (String[]) null);
    }

    public List<CachedContent> e(String str) {
        return d(f(str));
    }

    @Override // com.huawei.openalliance.ad.fz
    public void d(ContentRecord contentRecord, List<String> list) {
        if (contentRecord == null) {
            return;
        }
        if (com.huawei.openalliance.ad.utils.dg.b(contentRecord.ac())) {
            hw.b("ContentRecordDao", "updateContentExcludeByIdsPlus. need uniqueId");
            c(contentRecord, list);
            return;
        }
        ContentValues contentValuesD = contentRecord.d(this.f18718a);
        contentValuesD.remove("timestamp");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            contentValuesD.remove(it.next());
        }
        a(a(), contentValuesD, fq.CONTENT_BY_IDS_UNIQUEID_WHERE, new String[]{contentRecord.o(), contentRecord.n(), contentRecord.ac()});
    }

    @Override // com.huawei.openalliance.ad.fz
    public long d(String str) {
        if (str == null) {
            return 0L;
        }
        List listA = a(a(), new String[]{ContentRecord.LAST_SHOW_TIME}, fq.CONTENT_BY_TASKID_WHERE, new String[]{str}, "lastShowTime desc", null);
        if (listA.isEmpty()) {
            return 0L;
        }
        return ((ContentRecord) listA.get(0)).r();
    }

    @Override // com.huawei.openalliance.ad.fz
    public void c(String str) {
        hw.a("ContentRecordDao", "deleteContentById id: %s", str);
        a(a(), fq.CONTENT_BY_ID_WHERE, new String[]{str});
    }

    @Deprecated
    public void c(ContentRecord contentRecord, List<String> list) {
        if (contentRecord == null) {
            return;
        }
        ContentValues contentValuesD = contentRecord.d(this.f18718a);
        contentValuesD.remove("timestamp");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            contentValuesD.remove(it.next());
        }
        a(a(), contentValuesD, fq.CONTENT_BY_IDS_WHERE, new String[]{contentRecord.o(), contentRecord.n()});
    }

    @Override // com.huawei.openalliance.ad.fz
    public void c(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        synchronized (d) {
            String strO = contentRecord.o();
            String strAP = contentRecord.aP();
            String strN = contentRecord.n();
            String strAc = contentRecord.ac();
            hw.b("ContentRecordDao", "insertOrUpdateContentV3, org uniqueId : %s", strAc);
            ContentRecord contentRecordC = c(strO, strAP, strN);
            if (contentRecordC != null) {
                a(contentRecord, contentRecordC);
            }
            ContentRecord contentRecordA = a(strO, strAP, strN, strAc);
            if (contentRecordA != null) {
                contentRecord.v(contentRecordA.ac());
                hw.b("ContentRecordDao", "insertOrUpdateContentV3, update, real uniqueId : %s", contentRecord.ac());
                ArrayList arrayList = new ArrayList();
                arrayList.add("_id");
                arrayList.add(ContentRecord.DISPLAY_COUNT);
                arrayList.add(ContentRecord.DISPLAY_DATE);
                arrayList.add(ContentRecord.SPLASH_MEDIA_PATH);
                arrayList.add(ContentRecord.LAST_SHOW_TIME);
                arrayList.add(ContentRecord.FC_CTRL_DATE);
                d(contentRecord, arrayList);
            } else {
                a(contentRecord);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.fz
    public List<ContentRecord> c() {
        return a(a(), new String[]{"contentId", "slotId", ContentRecord.SPLASH_MEDIA_PATH, "uniqueId"}, fq.CONTENT_EXPIRE_WHERE, new String[]{String.valueOf(com.huawei.openalliance.ad.utils.as.c()), String.valueOf(0)}, null, null);
    }

    @Override // com.huawei.openalliance.ad.fz
    @Deprecated
    public ContentRecord c(String str, String str2, String str3) {
        List listA = a(a(), null, fq.CONTENT_RECORD_BY_IDS, new String[]{str, str2, str3}, "timestamp desc", String.valueOf(4));
        if (listA.isEmpty()) {
            return null;
        }
        return (ContentRecord) listA.get(0);
    }

    @Override // com.huawei.openalliance.ad.fz
    public void b(String str, String str2, String str3) {
        hw.b("ContentRecordDao", "deleteContentByIdsAndUniqueId id: %s %s %s", str, str2, str3);
        if (!com.huawei.openalliance.ad.utils.dg.b(str3)) {
            a(a(), fq.CONTENT_BY_IDS_UNIQUEID_WHERE, new String[]{str, str2, str3});
        } else {
            hw.b("ContentRecordDao", "deleteContentByIdsAndUniqueId, needUniqueId");
            b(str, str2);
        }
    }

    @Deprecated
    public void b(String str, String str2) {
        hw.a("ContentRecordDao", "deleteContentById id: %s %s", str, str2);
        a(a(), fq.CONTENT_BY_IDS_WHERE, new String[]{str, str2});
    }

    @Override // com.huawei.openalliance.ad.fz
    public void b(ContentRecord contentRecord, List<String> list, String str) {
        hw.a("ContentRecordDao", "updateContentExcludeById. ");
        if (contentRecord == null) {
            return;
        }
        ContentValues contentValuesD = contentRecord.d(this.f18718a);
        contentValuesD.remove("timestamp");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            contentValuesD.remove(it.next());
        }
        a(a(), contentValuesD, fq.CONTENT_BY_ID_WHERE, new String[]{str});
    }

    @Override // com.huawei.openalliance.ad.fz
    public void b(ContentRecord contentRecord, List<String> list) {
        hw.a("ContentRecordDao", "updateContentIncludeByIdAndUniqueId. ");
        if (contentRecord == null) {
            return;
        }
        if (com.huawei.openalliance.ad.utils.dg.b(contentRecord.ac())) {
            hw.b("ContentRecordDao", "updateContentIncludeByIdsAndUniqueId. need uniqueId");
            a(contentRecord, list);
            return;
        }
        List<String> listBx = contentRecord.bx();
        ContentValues contentValuesD = contentRecord.d(this.f18718a);
        contentValuesD.remove("timestamp");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            listBx.remove(it.next());
        }
        Iterator<String> it2 = listBx.iterator();
        while (it2.hasNext()) {
            contentValuesD.remove(it2.next());
        }
        a(a(), contentValuesD, fq.CONTENT_BY_IDS_UNIQUEID_WHERE, new String[]{contentRecord.o(), contentRecord.n(), contentRecord.ac()});
    }

    @Override // com.huawei.openalliance.ad.fz
    public void b(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        synchronized (d) {
            String strO = contentRecord.o();
            String strN = contentRecord.n();
            String strAc = contentRecord.ac();
            hw.b("ContentRecordDao", "insertOrUpdateContent, org uniqueId : %s", strAc);
            ContentRecord contentRecordA = a(strO, strN, strAc);
            if (contentRecordA != null) {
                contentRecord.v(contentRecordA.ac());
                String strAc2 = contentRecord.ac();
                hw.b("ContentRecordDao", "insertOrUpdateContent, update, real uniqueId : %s", strAc2);
                ContentValues contentValuesD = contentRecord.d(this.f18718a);
                contentValuesD.remove("timestamp");
                a(a(), contentValuesD, fq.CONTENT_BY_IDS_UNIQUEID_WHERE, new String[]{strO, strN, strAc2});
            } else {
                a(contentRecord);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.fz
    public void b() {
        ContentValues contentValues = new ContentValues();
        String strB = com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd");
        contentValues.put(ContentRecord.DISPLAY_DATE, strB);
        contentValues.put(ContentRecord.DISPLAY_COUNT, (Integer) 0);
        a(a(), contentValues, fq.CONTENT_BY_DATE_NOT_EQUAL_WHERE, new String[]{strB});
    }

    @Override // com.huawei.openalliance.ad.fz
    public List<ContentRecord> b(String str, int i, long j, int i2) {
        ArrayList arrayList = new ArrayList();
        fq fqVar = 1 == i ? fq.CONTENT_PORTRAIT_CACHE_SHOW_WHERE : fq.CONTENT_LANDSCAPE_CACHE_SHOW_WHERE;
        long jC = com.huawei.openalliance.ad.utils.as.c();
        for (ContentRecord contentRecord : a(a(), null, fqVar, new String[]{String.valueOf(jC), String.valueOf(jC), str, String.valueOf(jC - j), com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd"), String.valueOf(i2)}, "priority asc, displayCount asc, updateTime desc", String.valueOf(4))) {
            if (com.huawei.openalliance.ad.utils.ai.c(this.f18718a, contentRecord.A(), "normal") || com.huawei.openalliance.ad.utils.c.a(this.f18718a, contentRecord, com.huawei.openalliance.ad.utils.c.a(this.f18718a, contentRecord))) {
                arrayList.add(contentRecord);
            } else {
                b(contentRecord.o(), contentRecord.n(), contentRecord.ac());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.openalliance.ad.fz
    public List<ContentRecord> b(String str) {
        return a(a(), null, fq.CONTENT_BY_ID_WHERE, new String[]{str}, null, null);
    }

    @Override // com.huawei.openalliance.ad.fz
    public void a(List<ContentRecord> list) {
        hw.a("ContentRecordDao", "insertOrUpdateContents.");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.huawei.openalliance.ad.utils.bm.a(list) || this.f18718a == null) {
            return;
        }
        synchronized (d) {
            ArrayList arrayList = new ArrayList();
            String simpleName = a().getSimpleName();
            String strA = fq.CONTENT_BY_IDS_UNIQUEID_WHERE.a();
            String strA2 = fq.CONTENT_BY_IDS_UNIQUEID_WHERE.a();
            for (ContentRecord contentRecord : list) {
                String strO = contentRecord.o();
                String strN = contentRecord.n();
                contentRecord.a(System.currentTimeMillis());
                if (com.huawei.openalliance.ad.utils.dg.b(contentRecord.ac())) {
                    hw.b("ContentRecordDao", "insertOrUpdateContents. need uniqueId");
                    contentRecord.v(UUID.randomUUID().toString());
                }
                String strAc = contentRecord.ac();
                String[] strArr = {strO, strN, strAc};
                String[] strArr2 = {strO, strN, strAc};
                arrayList.add(new dh(simpleName, strA, strArr, strA2, strArr2, contentRecord.d(this.f18718a)));
                simpleName = simpleName;
            }
            c(arrayList);
        }
        hw.a("ContentRecordDao", "insertOrUpdateContents duration: %s ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.huawei.openalliance.ad.fz
    public void a(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ContentRecord.LAST_SHOW_TIME, Long.valueOf(j));
        a(a(), contentValues, fq.CONTENT_BY_TASKID_WHERE, new String[]{str});
    }

    @Override // com.huawei.openalliance.ad.fz
    public void a(ContentRecord contentRecord, List<String> list, String str) {
        hw.a("ContentRecordDao", "updateContentIncludeById. ");
        if (contentRecord == null) {
            return;
        }
        List<String> listBx = contentRecord.bx();
        ContentValues contentValuesD = contentRecord.d(this.f18718a);
        contentValuesD.remove("timestamp");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            listBx.remove(it.next());
        }
        Iterator<String> it2 = listBx.iterator();
        while (it2.hasNext()) {
            contentValuesD.remove(it2.next());
        }
        a(a(), contentValuesD, fq.CONTENT_BY_ID_WHERE, new String[]{str});
    }

    @Deprecated
    public void a(ContentRecord contentRecord, List<String> list) {
        hw.a("ContentRecordDao", "updateContentIncludeById. ");
        if (contentRecord == null) {
            return;
        }
        List<String> listBx = contentRecord.bx();
        ContentValues contentValuesD = contentRecord.d(this.f18718a);
        contentValuesD.remove("timestamp");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            listBx.remove(it.next());
        }
        Iterator<String> it2 = listBx.iterator();
        while (it2.hasNext()) {
            contentValuesD.remove(it2.next());
        }
        a(a(), contentValuesD, fq.CONTENT_BY_IDS_WHERE, new String[]{contentRecord.o(), contentRecord.n()});
    }

    @Override // com.huawei.openalliance.ad.fz
    public void a(ContentRecord contentRecord) {
        hw.a("ContentRecordDao", "insertContent. ");
        if (contentRecord == null) {
            return;
        }
        if (com.huawei.openalliance.ad.utils.dg.b(contentRecord.ac())) {
            hw.b("ContentRecordDao", "insertContent. need uniqueId");
            contentRecord.v(UUID.randomUUID().toString());
        }
        contentRecord.a(System.currentTimeMillis());
        a(a(), contentRecord.d(this.f18718a));
    }

    public List<String> a(int i, String str) {
        return b(a(a(), new String[]{"contentId"}, fq.CONTENT_BY_ADTYPE_AND_WHERE_SLOTID, new String[]{String.valueOf(i), str}, null, null));
    }

    @Override // com.huawei.openalliance.ad.fz
    public List<ContentRecord> a(int i) {
        return a(a(), null, fq.CONTENT_BY_ADTYPE_WHERE, new String[]{String.valueOf(i)}, null, null);
    }

    protected Class<? extends com.huawei.openalliance.ad.db.bean.a> a() {
        return ContentRecord.class;
    }

    @Override // com.huawei.openalliance.ad.fz
    public ContentRecord a(String str, String str2, String str3, String str4) {
        if (com.huawei.openalliance.ad.utils.dg.b(str4)) {
            hw.b("ContentRecordDao", "queryContentByIdAndUniqueIDV3. need uniqueId");
            return c(str, str2, str3);
        }
        List listA = a(a(), null, fq.CONTENT_RECORD_BY_IDS_UNIQUEID, new String[]{str, str2, str3, str4}, null, null);
        if (listA.isEmpty()) {
            return null;
        }
        return (ContentRecord) listA.get(0);
    }

    @Override // com.huawei.openalliance.ad.fz
    public ContentRecord a(String str, String str2, String str3) {
        if (com.huawei.openalliance.ad.utils.dg.b(str3)) {
            hw.b("ContentRecordDao", "queryContentByIdsAndUniqueId. need uniqueId");
            return a(str, str2);
        }
        List listA = a(a(), null, fq.CONTENT_BY_IDS_UNIQUEID_WHERE, new String[]{str, str2, str3}, null, null);
        if (listA.isEmpty()) {
            return null;
        }
        return (ContentRecord) listA.get(0);
    }

    @Deprecated
    public ContentRecord a(String str, String str2, int i, long j) {
        return a(1 == i ? fq.CONTENT_PORTRAIT_REAL_SHOW_WHERE : fq.CONTENT_LANDSCAPE_REAL_SHOW_WHERE, new String[]{str, str2, String.valueOf(j), String.valueOf(j)});
    }

    @Override // com.huawei.openalliance.ad.fz
    @Deprecated
    public ContentRecord a(String str, String str2) {
        List listA = a(a(), null, fq.CONTENT_BY_IDS_WHERE, new String[]{str, str2}, "timestamp desc", String.valueOf(4));
        if (listA.isEmpty()) {
            return null;
        }
        return (ContentRecord) listA.get(0);
    }

    @Override // com.huawei.openalliance.ad.fz
    public ContentRecord a(String str, int i, long j, int i2) {
        fq fqVar = 1 == i ? fq.CONTENT_PORTRAIT_CACHE_SHOW_WHERE : fq.CONTENT_LANDSCAPE_CACHE_SHOW_WHERE;
        long jC = com.huawei.openalliance.ad.utils.as.c();
        ContentRecord contentRecordA = a(fqVar, new String[]{String.valueOf(jC), String.valueOf(jC), str, String.valueOf(jC - j), com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd"), String.valueOf(i2)});
        hw.b("ContentRecordDao", "queryCacheShowContent " + com.huawei.openalliance.ad.utils.dg.b(contentRecordA));
        return contentRecordA;
    }

    @Override // com.huawei.openalliance.ad.fz
    public ContentRecord a(String str) {
        List listA = a(a(), null, fq.CONTENT_BY_ID_WHERE, new String[]{str}, "updateTime desc", String.valueOf(4));
        if (listA.isEmpty()) {
            return null;
        }
        return (ContentRecord) listA.get(0);
    }

    @Override // com.huawei.openalliance.ad.fz
    public ContentRecord a(ContentRecord contentRecord, int i, long j) {
        if (contentRecord == null) {
            return null;
        }
        if (!com.huawei.openalliance.ad.utils.dg.b(contentRecord.ac())) {
            return a(1 == i ? fq.CONTENT_PORTRAIT_REAL_SHOW_WHERE_UNIQUEID : fq.CONTENT_LANDSCAPE_REAL_SHOW_WHERE_UNIQUEID, new String[]{contentRecord.o(), contentRecord.n(), contentRecord.ac(), String.valueOf(j), String.valueOf(j)});
        }
        hw.b("ContentRecordDao", "queryRealtimeShowContentByUniqueId, need uniqueId");
        return a(contentRecord.o(), contentRecord.n(), i, j);
    }

    private List<ContentRecord> f(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            Iterator it = a(a(), new String[]{"contentId", "templateId"}, fq.CONTENT_BY_SLOTID, new String[]{str}, null, null).iterator();
            while (it.hasNext()) {
                arrayList.add((ContentRecord) it.next());
            }
        }
        return arrayList;
    }

    private List<CachedContent> d(List<ContentRecord> list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (ContentRecord contentRecord : list) {
                if (!com.huawei.openalliance.ad.utils.dg.b(contentRecord.o()) && !com.huawei.openalliance.ad.utils.dg.b(contentRecord.aP())) {
                    List arrayList2 = (List) concurrentHashMap.get(contentRecord.o());
                    if (com.huawei.openalliance.ad.utils.bm.a(arrayList2)) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(contentRecord.aP());
                    concurrentHashMap.put(contentRecord.o(), arrayList2);
                }
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (entry != null) {
                    arrayList.add(new CachedContent((String) entry.getKey(), 3, (List) entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    private List<String> b(List<ContentRecord> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ContentRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().o());
        }
        return arrayList;
    }

    private void a(ContentRecord contentRecord, ContentRecord contentRecord2) {
        if (contentRecord == null || contentRecord2 == null) {
            return;
        }
        if (contentRecord2.y() > 0) {
            contentRecord.h(contentRecord2.y());
        }
        if (com.huawei.openalliance.ad.utils.dg.d(contentRecord2.z())) {
            contentRecord.h(contentRecord2.z());
        }
        if (!dn.i(contentRecord.A()) && dn.i(contentRecord2.A())) {
            contentRecord.i(contentRecord2.A());
        }
        if (contentRecord2.r() > 0) {
            contentRecord.d(contentRecord2.r());
        }
        if (com.huawei.openalliance.ad.utils.dg.d(contentRecord2.x())) {
            contentRecord.g(contentRecord2.x());
        }
    }

    public static ew a(Context context) {
        ew ewVar;
        synchronized (e) {
            if (f18736c == null) {
                f18736c = new ew(context);
            }
            ewVar = f18736c;
        }
        return ewVar;
    }

    private ContentRecord a(fq fqVar, String[] strArr) {
        for (ContentRecord contentRecord : a(a(), null, fqVar, strArr, "priority asc, displayCount asc, updateTime desc", String.valueOf(4))) {
            String strA = contentRecord.A();
            if (!TextUtils.isEmpty(strA) && strA.startsWith(Scheme.CONTENT.toString())) {
                hw.a("ContentRecordDao", "queryShowContent valid, uri.");
                return contentRecord;
            }
            if (com.huawei.openalliance.ad.utils.ai.c(this.f18718a, strA, "normal") || com.huawei.openalliance.ad.utils.ai.c(this.f18718a, strA, Constants.TPLATE_CACHE)) {
                hw.a("ContentRecordDao", "queryShowContent valid: %s", com.huawei.openalliance.ad.utils.dg.b(contentRecord));
                return contentRecord;
            }
            hw.a("ContentRecordDao", "queryShowContent is not valid: %s", com.huawei.openalliance.ad.utils.dg.b(contentRecord));
            b(contentRecord.o(), contentRecord.n(), contentRecord.ac());
        }
        return null;
    }

    protected ew(Context context) {
        super(context);
    }
}
