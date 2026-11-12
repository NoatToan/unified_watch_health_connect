package com.huawei.ads.adsrec;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.ads.adsrec.db.table.AdContentRspRecord;
import com.huawei.ads.adsrec.db.table.AdCreativeContentRecord;
import com.huawei.ads.adsrec.db.table.AdEventRecord;
import com.huawei.ads.adsrec.db.table.AdIECFeedbackRecord;
import com.huawei.ads.adsrec.db.table.AdIECImpRecord;
import com.huawei.ads.adsrec.db.table.AdSlotMapRecord;
import com.huawei.ads.adsrec.db.table.AdTraceRecord;
import com.huawei.ads.adsrec.db.table.DsContentRelRecord;
import com.huawei.ads.adsrec.db.table.MaterialSummaryRecord;
import com.huawei.ads.adsrec.db.table.SlotRecord;
import com.huawei.ads.fund.db.BaseDao;
import com.huawei.ads.fund.db.BaseDbHelper;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.awz;
import defpackage.axh;
import defpackage.axj;
import defpackage.axm;
import defpackage.axn;
import defpackage.axy;
import defpackage.aym;
import defpackage.ayt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class e extends BaseDao implements d0 {
    @Override // com.huawei.ads.fund.db.IDao
    public String getTag() {
        return "AdRecDao";
    }

    @Override // com.huawei.ads.fund.db.IDao
    public BaseDbHelper getDbHelper() {
        return axn.e(this.context);
    }

    @Override // com.huawei.ads.fund.db.BaseDao, com.huawei.ads.fund.db.IDao
    public void emptyTables(String str) {
        super.emptyTables(str);
        delete(AdCreativeContentRecord.class, null, null);
        delete(AdEventRecord.class, null, null);
        delete(AdIECFeedbackRecord.class, null, null);
        delete(AdIECImpRecord.class, null, null);
        delete(AdSlotMapRecord.class, null, null);
        delete(SlotRecord.class, null, null);
        delete(AdContentRspRecord.class, null, null);
        delete(AdTraceRecord.class, null, null);
        delete(MaterialSummaryRecord.class, null, null);
    }

    @Override // com.huawei.ads.adsrec.d0
    public void c(List<axm> list) {
        if (ListUtil.isEmpty(list)) {
            return;
        }
        ArrayList<SlotRecord> arrayList = new ArrayList(list.size());
        Iterator<axm> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().i());
        }
        if (ListUtil.isEmpty(arrayList)) {
            HiAdLog.w("AdRecDao", "all slotRecords: empty");
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (SlotRecord slotRecord : arrayList) {
            if (slotRecord != null) {
                arrayList2.add(a(slotRecord));
            }
        }
        insertOrUpdate(arrayList2);
    }

    @Override // com.huawei.ads.adsrec.d0
    public void b(List<String[]> list) {
        batchExecute(d1.i, list);
    }

    @Override // com.huawei.ads.adsrec.d0
    public List<MaterialSummaryRecord> b(String str, String str2) {
        return query(MaterialSummaryRecord.class, null, "pkgName=? and adType=?", new String[]{str, str2}, null, null);
    }

    public List<DsContentRelRecord> c(String str, long j) {
        String[] strArr = {String.valueOf(j - 604800000), String.valueOf(j), str, "1"};
        String str2 = d1.l;
        Arrays.toString(strArr);
        return rawQuery(DsContentRelRecord.class, str2, strArr);
    }

    @Override // com.huawei.ads.adsrec.d0
    public AdContentRspRecord b(String str) {
        List listQuery = query(AdContentRspRecord.class, null, "pkgName=?", new String[]{str}, null, null);
        if (ListUtil.isEmpty(listQuery)) {
            return null;
        }
        return (AdContentRspRecord) listQuery.get(0);
    }

    @Override // com.huawei.ads.adsrec.d0
    public void a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        deleteSet(AdCreativeContentRecord.class, "contentId=?", arrayList);
        deleteSet(AdSlotMapRecord.class, "contentId=?", arrayList);
    }

    @Override // com.huawei.ads.adsrec.d0
    public void a(List<axm> list, int i) {
        if (ListUtil.isEmpty(list)) {
            HiAdLog.w("AdRecDao", "iu all slots: empty");
            return;
        }
        for (axm axmVar : list) {
            if (axmVar != null) {
                c(axmVar, i);
            }
        }
    }

    @Override // com.huawei.ads.adsrec.d0
    public void a(List<String[]> list) {
        batchExecute(d1.j, list);
    }

    @Override // com.huawei.ads.adsrec.d0
    public void a(AdContentRspRecord adContentRspRecord) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(d(adContentRspRecord));
        insertOrUpdate(arrayList);
    }

    public void e(axj axjVar) {
        if (axjVar != null) {
            AdEventRecord adEventRecordA = axjVar.a();
            insert(AdEventRecord.class, adEventRecordA.toRecord());
            b(adEventRecordA);
        }
    }

    public void d() {
        delete(AdTraceRecord.class, "uptime<?", new String[]{String.valueOf(System.currentTimeMillis())});
    }

    public List<DsContentRelRecord> a(String str, long j) {
        String[] strArr = {String.valueOf(j - 604800000), String.valueOf(j), str};
        String str2 = d1.m;
        Arrays.toString(strArr);
        return rawQuery(DsContentRelRecord.class, str2, strArr);
    }

    @Override // com.huawei.ads.adsrec.d0
    public List<AdIECImpRecord> a(String str) {
        return query(AdIECImpRecord.class, null, "pkgName=?", new String[]{str}, null, null);
    }

    @Override // com.huawei.ads.adsrec.d0
    public List<axh> a(ayt aytVar) {
        BaseDbHelper dbHelper;
        ArrayList arrayList = new ArrayList(5);
        Cursor cursorRawQuery = null;
        try {
            dbHelper = getDbHelper();
            try {
                cursorRawQuery = dbHelper.rawQuery(aytVar.e(), aytVar.d());
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            AdCreativeContentRecord adCreativeContentRecord = new AdCreativeContentRecord();
                            AdSlotMapRecord adSlotMapRecord = new AdSlotMapRecord();
                            adCreativeContentRecord.toBean(cursorRawQuery);
                            adSlotMapRecord.toBean(cursorRawQuery);
                            arrayList.add(new axh(adSlotMapRecord, adCreativeContentRecord));
                        } catch (Throwable th) {
                            HiAdLog.e(getTag(), "queryContents:" + th.getClass().getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    HiAdLog.e(getTag(), "queryContents exception: %s", th.getClass().getSimpleName());
                } finally {
                    closeCursor(cursorRawQuery);
                    releaseDbHelper(dbHelper);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dbHelper = null;
        }
        return arrayList;
    }

    public String e(String str, AdEventRecord adEventRecord, int i) {
        try {
            JSONArray jSONArray = StringUtils.isBlank(str) ? new JSONArray() : new JSONArray(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", StringUtils.toLong(adEventRecord.j()));
            if (i == 0) {
                jSONObject.put("range", adEventRecord.f());
            }
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Throwable th) {
            HiAdLog.printSafeStackTrace(3, th);
            HiAdLog.e("AdRecDao", "build json array error");
            return null;
        }
    }

    @Override // com.huawei.ads.adsrec.d0
    public axm a(String str, String str2) {
        List listQuery = query(SlotRecord.class, null, "pkgName=? and slotId=?", new String[]{str, str2}, null, null);
        return !ListUtil.isEmpty(listQuery) ? new axm((SlotRecord) listQuery.get(0)) : new axm(str, str2);
    }

    private void a(AdEventRecord adEventRecord) {
        executeSql(d1.f4750a, new Object[]{adEventRecord.d(), adEventRecord.g(), adEventRecord.c()});
        String[] strArr = {adEventRecord.d(), adEventRecord.c()};
        List listQuery = query(AdIECImpRecord.class, null, "pkgName=? and contentId=?", strArr, null, null);
        if (!ListUtil.isEmpty(listQuery)) {
            AdIECImpRecord adIECImpRecord = (AdIECImpRecord) listQuery.get(0);
            adIECImpRecord.d(adEventRecord.a());
            adIECImpRecord.a(adIECImpRecord.a() + 1);
            adIECImpRecord.b(System.currentTimeMillis());
            update(AdIECImpRecord.class, adIECImpRecord.toRecord(), "pkgName=? and contentId=?", strArr);
            return;
        }
        AdIECImpRecord adIECImpRecord2 = new AdIECImpRecord();
        adIECImpRecord2.e(adEventRecord.d());
        adIECImpRecord2.b(adEventRecord.c());
        adIECImpRecord2.d(adEventRecord.a());
        adIECImpRecord2.a(1);
        insert(AdIECImpRecord.class, adIECImpRecord2.toRecord());
    }

    private void d(AdEventRecord adEventRecord) {
        if (aym.b(this.context).d(adEventRecord.g()) == 0) {
            return;
        }
        String[] strArr = {adEventRecord.c()};
        List listQuery = query(AdIECFeedbackRecord.class, null, "contentId=?", strArr, null, null);
        if (ListUtil.isEmpty(listQuery)) {
            AdIECFeedbackRecord adIECFeedbackRecord = new AdIECFeedbackRecord();
            adIECFeedbackRecord.c(adEventRecord.c());
            adIECFeedbackRecord.b(1);
            insert(AdIECFeedbackRecord.class, adIECFeedbackRecord.toRecord());
        } else {
            AdIECFeedbackRecord adIECFeedbackRecord2 = (AdIECFeedbackRecord) listQuery.get(0);
            adIECFeedbackRecord2.b(1);
            adIECFeedbackRecord2.b(System.currentTimeMillis());
            update(AdIECFeedbackRecord.class, adIECFeedbackRecord2.toRecord(), "contentId=?", strArr);
        }
        delete(AdSlotMapRecord.class, null, null);
        delete(AdCreativeContentRecord.class, null, null);
        delete(MaterialSummaryRecord.class, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    private void b(AdEventRecord adEventRecord) {
        byte b2;
        String strE = adEventRecord.e();
        strE.hashCode();
        strE.hashCode();
        switch (strE) {
            case "repeatedClick":
                b2 = 0;
                break;
            case "imp":
                b2 = 1;
                break;
            case "click":
                b2 = 2;
                break;
            case "userclose":
                b2 = 3;
                break;
            case "repeatedImp":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 == 3) {
                        d(adEventRecord);
                        return;
                    } else if (b2 != 4) {
                        return;
                    }
                }
            }
            a(adEventRecord);
            d(adEventRecord, 0);
            return;
        }
        c(adEventRecord);
        d(adEventRecord, 1);
    }

    private ayt d(AdContentRspRecord adContentRspRecord) {
        return new ayt(adContentRspRecord.getTableName(), null, null, "pkgName=?", new String[]{adContentRspRecord.d()}, adContentRspRecord.toRecord(this.context));
    }

    private String[] a(String str, int i) {
        List<String> listA = u.a(str, i);
        if (!ListUtil.isEmpty(listA)) {
            return (String[]) listA.toArray(new String[listA.size()]);
        }
        IUtilCallback iUtilCallbackC = awz.c();
        return iUtilCallbackC != null ? iUtilCallbackC.getAllowCachedTradeModeList(str, String.valueOf(i)) : f1.f4753a;
    }

    private boolean a(String str, String[] strArr) {
        Arrays.toString(strArr);
        if (!ListUtil.isEmpty(strArr)) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void c(axm axmVar, int i) {
        AdCreativeContentRecord adCreativeContentRecordD;
        List<axh> listB = axmVar.b();
        if (ListUtil.isEmpty(listB)) {
            return;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ArrayList arrayList2 = new ArrayList(listB.size());
        String[] strArrA = a(axmVar.d(), i);
        ArrayList arrayList3 = new ArrayList(listB.size());
        for (axh axhVar : listB) {
            if (axhVar != null && axhVar.r() == 0 && (adCreativeContentRecordD = axhVar.d()) != null && a(adCreativeContentRecordD.f(), strArrA)) {
                arrayList.add(d(adCreativeContentRecordD));
                AdSlotMapRecord adSlotMapRecordF = axhVar.f();
                if (adSlotMapRecordF != null) {
                    adSlotMapRecordF.b(0);
                    adSlotMapRecordF.a(0);
                    arrayList2.add(c(adSlotMapRecordF));
                }
                arrayList3.add(e(axhVar.t()));
                d(axhVar);
            }
        }
        insertOrUpdate(arrayList);
        insertOrUpdate(arrayList2);
        insertOrUpdate(arrayList3);
    }

    private void d(AdEventRecord adEventRecord, int i) {
        ayt aytVar;
        if (axy.a()) {
            String strC = adEventRecord.c();
            String strB = adEventRecord.b();
            if (ListUtil.isEmpty(query(DsContentRelRecord.class, null, "clientRequestId=? and contentId=?", new String[]{strB, strC}, null, null))) {
                return;
            }
            String strA = w0.a(strB);
            List listQuery = query(AdTraceRecord.class, null, "uniqueId=? and contentId=?", new String[]{strA, strC}, null, "1");
            listQuery.size();
            ArrayList arrayList = new ArrayList();
            if (ListUtil.isEmpty(listQuery)) {
                AdTraceRecord adTraceRecord = new AdTraceRecord();
                adTraceRecord.a(true);
                adTraceRecord.f(strA);
                adTraceRecord.a(strC);
                List listQuery2 = query(AdCreativeContentRecord.class, null, "contentId=?", new String[]{strC}, null, null);
                if (!ListUtil.isEmpty(listQuery2) && listQuery2.get(0) != null) {
                    adTraceRecord.d(((AdCreativeContentRecord) listQuery2.get(0)).f());
                }
                List listQuery3 = query(MaterialSummaryRecord.class, null, "contentId=? and pkgName=? and slotId=?", new String[]{strC, adEventRecord.d(), adEventRecord.g()}, null, "1");
                if (!ListUtil.isEmpty(listQuery3) && listQuery3.get(0) != null) {
                    adTraceRecord.e(((MaterialSummaryRecord) listQuery3.get(0)).j());
                }
                adTraceRecord.c(System.currentTimeMillis());
                if (i == 0) {
                    adTraceRecord.b(e(null, adEventRecord, i));
                }
                if (i == 1) {
                    adTraceRecord.c(e(null, adEventRecord, i));
                }
                aytVar = new ayt("AdTraceRecord", null, null, "uniqueId=? and contentId=?", new String[]{strA, strC}, adTraceRecord.toRecord());
            } else {
                AdTraceRecord adTraceRecord2 = (AdTraceRecord) listQuery.get(0);
                if (i == 0) {
                    String strE = e(adTraceRecord2.d(), adEventRecord, i);
                    if (!StringUtils.isBlank(strE)) {
                        adTraceRecord2.b(strE);
                    }
                } else if (i == 1) {
                    String strE2 = e(adTraceRecord2.c(), adEventRecord, i);
                    if (!StringUtils.isBlank(strE2)) {
                        adTraceRecord2.c(strE2);
                    }
                }
                List listQuery4 = query(MaterialSummaryRecord.class, null, "contentId=? and pkgName=? and slotId=?", new String[]{strC, adEventRecord.d(), adEventRecord.g()}, null, "1");
                if (!ListUtil.isEmpty(listQuery4) && listQuery4.get(0) != null) {
                    adTraceRecord2.e(((MaterialSummaryRecord) listQuery4.get(0)).j());
                }
                adTraceRecord2.c(System.currentTimeMillis());
                aytVar = new ayt("AdTraceRecord", null, null, "uniqueId=? and contentId=?", new String[]{strA, strC}, adTraceRecord2.toRecord());
            }
            arrayList.add(aytVar);
            insertOrUpdate(arrayList);
        }
    }

    private void c(AdEventRecord adEventRecord) {
        executeSql(d1.f4751b, new Object[]{adEventRecord.d(), adEventRecord.g(), adEventRecord.c()});
    }

    private void d(axh axhVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        executeSql(d1.f4752c, new Object[]{Long.valueOf(jCurrentTimeMillis), axhVar.p(), axhVar.i()});
    }

    private ayt a(SlotRecord slotRecord) {
        return new ayt(slotRecord.getTableName(), null, null, "pkgName=? and slotId=?", new String[]{slotRecord.c(), slotRecord.d()}, slotRecord.toRecord(this.context));
    }

    private ayt e(MaterialSummaryRecord materialSummaryRecord) {
        return new ayt(materialSummaryRecord.getTableName(), null, null, "pkgName=? and adType=? and slotId=? and contentId=?", new String[]{materialSummaryRecord.b(), materialSummaryRecord.a(), materialSummaryRecord.c(), materialSummaryRecord.d()}, materialSummaryRecord.toRecord(this.context));
    }

    private ayt c(AdSlotMapRecord adSlotMapRecord) {
        return new ayt(adSlotMapRecord.getTableName(), null, null, "pkgName=? and slotId=? and contentId=?", new String[]{adSlotMapRecord.e(), adSlotMapRecord.c(), adSlotMapRecord.d()}, adSlotMapRecord.toRecord(this.context));
    }

    private ayt d(AdCreativeContentRecord adCreativeContentRecord) {
        return new ayt(adCreativeContentRecord.getTableName(), null, null, "contentId=?", new String[]{adCreativeContentRecord.c()}, adCreativeContentRecord.toRecord(this.context));
    }

    public e(Context context) {
        super(context);
    }
}
