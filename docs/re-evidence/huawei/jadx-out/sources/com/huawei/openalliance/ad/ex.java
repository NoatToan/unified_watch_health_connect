package com.huawei.openalliance.ad;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentRecordV3;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ex extends ew {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ex f18737c;
    private static final byte[] d = new byte[0];

    @Override // com.huawei.openalliance.ad.ew, com.huawei.openalliance.ad.fz
    public void d(ContentRecord contentRecord, List<String> list) {
        if (contentRecord == null) {
            return;
        }
        if (com.huawei.openalliance.ad.utils.dg.b(contentRecord.ac())) {
            hw.b("ContentRecordV3Dao", "updateContentExcludeByIdsPlus. need uniqueId");
            c(contentRecord, list);
            return;
        }
        ContentValues contentValuesD = contentRecord.d(this.f18718a);
        contentValuesD.remove("timestamp");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            contentValuesD.remove(it.next());
        }
        a(a(), contentValuesD, fq.CONTENT_RECORD_BY_IDS_UNIQUEID, new String[]{contentRecord.o(), contentRecord.aP(), contentRecord.n(), contentRecord.ac()});
    }

    @Override // com.huawei.openalliance.ad.ew
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
        a(a(), contentValuesD, fq.CONTENT_RECORD_BY_IDS, new String[]{contentRecord.o(), contentRecord.aP(), contentRecord.n()});
    }

    @Override // com.huawei.openalliance.ad.ew, com.huawei.openalliance.ad.fz
    public List<ContentRecord> c() {
        return a(a(), new String[]{"contentId", "slotId", "templateId", "uniqueId"}, fq.CONTENT_EXPIRE_WHERE, new String[]{String.valueOf(com.huawei.openalliance.ad.utils.as.c()), String.valueOf(0)}, null, null);
    }

    @Override // com.huawei.openalliance.ad.ew
    @Deprecated
    public void b(String str, String str2, String str3, String str4) {
        c(str, str2, str3, str4);
    }

    @Override // com.huawei.openalliance.ad.ew, com.huawei.openalliance.ad.fz
    public List<ContentRecord> b(String str, int i, long j, int i2) {
        ArrayList arrayList = new ArrayList();
        fq fqVar = 1 == i ? fq.CONTENT_V3_PORTRAIT_CACHE_SHOW_WHERE : fq.CONTENT_V3_LANDSCAPE_CACHE_SHOW_WHERE;
        long jC = com.huawei.openalliance.ad.utils.as.c();
        for (ContentRecord contentRecord : a(a(), null, fqVar, new String[]{String.valueOf(jC), String.valueOf(jC), str, String.valueOf(jC - j), com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd")}, "priority asc, displayCount asc, updateTime desc", String.valueOf(4))) {
            if (contentRecord != null) {
                ContentTemplateRecord contentTemplateRecordA = ez.a(this.f18718a).a(contentRecord.o(), contentRecord.aP());
                if (contentTemplateRecordA != null && !com.huawei.openalliance.ad.utils.bm.a(contentTemplateRecordA.c())) {
                    boolean zA = true;
                    for (Asset asset : contentTemplateRecordA.c()) {
                        if (asset != null && !com.huawei.openalliance.ad.utils.dg.b(asset.g())) {
                            if (!com.huawei.openalliance.ad.utils.ai.c(this.f18718a, asset.g(), Constants.TPLATE_CACHE)) {
                                zA = false;
                            }
                            if (!zA) {
                                zA = com.huawei.openalliance.ad.utils.c.a(this.f18718a, contentRecord, a(asset), asset);
                            }
                        }
                    }
                    if (zA) {
                        contentRecord.ac(contentTemplateRecordA.g());
                        contentRecord.l(contentTemplateRecordA.c());
                        contentRecord.a(new TemplateData(contentTemplateRecordA.d(), contentTemplateRecordA.e(), contentTemplateRecordA.f()));
                        arrayList.add(contentRecord);
                    }
                }
                a(contentRecord, "delete not exists");
            }
        }
        return arrayList;
    }

    @Override // com.huawei.openalliance.ad.ew, com.huawei.openalliance.ad.fz
    public void a(ContentRecord contentRecord, String str) {
        if (contentRecord == null) {
            return;
        }
        String strO = contentRecord.o();
        String strAP = contentRecord.aP();
        String strN = contentRecord.n();
        String strAc = contentRecord.ac();
        if (com.huawei.openalliance.ad.utils.dg.b(strAc)) {
            hw.b("ContentRecordV3Dao", "deleteContentByIdAndUniqueIdV3, need uniqueId");
            b(strO, strAP, strN, str);
            return;
        }
        hw.b("ContentRecordV3Dao", "deleteContentByIdAndUniqueIdV3, contentId= %s, templateId= %s, slotId= %s, uniqueId= %s, reason: %s", strO, strAP, strN, strAc, str);
        a(a(), fq.CONTENT_RECORD_BY_IDS_UNIQUEID, new String[]{strO, strAP, strN, strAc});
        if (c(strO, strAP, strN) == null) {
            ez.a(this.f18718a).a(strO, strAP, str);
        }
    }

    @Override // com.huawei.openalliance.ad.ew, com.huawei.openalliance.ad.fz
    public List<ContentRecord> a(int i) {
        return a(ContentRecord.class, "SELECT ContentRecordV3.*,ContentTemplateRecord.assets From ContentRecordV3 INNER JOIN ContentTemplateRecord ON ContentRecordV3.adType = " + i + " AND ContentTemplateRecord.contentId = ContentRecordV3.contentId AND ContentTemplateRecord.templateId = ContentRecordV3.templateId;", (String[]) null);
    }

    @Override // com.huawei.openalliance.ad.ew
    protected Class<? extends com.huawei.openalliance.ad.db.bean.a> a() {
        return ContentRecordV3.class;
    }

    @Override // com.huawei.openalliance.ad.ew
    @Deprecated
    public ContentRecord a(String str, String str2, String str3, int i, long j) {
        return a(fq.CONTENT_V3_REAL_SHOW_WHERE, new String[]{str, str2, str3, String.valueOf(j), String.valueOf(j)});
    }

    @Override // com.huawei.openalliance.ad.ew, com.huawei.openalliance.ad.fz
    public ContentRecord a(ContentRecord contentRecord, int i, long j) {
        if (contentRecord == null) {
            return null;
        }
        if (!com.huawei.openalliance.ad.utils.dg.b(contentRecord.ac())) {
            return a(fq.CONTENT_V3_REAL_SHOW_WHERE_UNIQUEID, new String[]{contentRecord.o(), contentRecord.aP(), contentRecord.n(), contentRecord.ac(), String.valueOf(j), String.valueOf(j)});
        }
        hw.b("ContentRecordV3Dao", "queryRealtimeShowContentByUniqueId, need uniqueId");
        return a(contentRecord.o(), contentRecord.aP(), contentRecord.n(), i, j);
    }

    private void c(String str, String str2, String str3, String str4) {
        hw.a("ContentRecordV3Dao", "deleteContentByIds, contentId= %s, templateId= %s, slotId= %s, reason: %s", str, str2, str3, str4);
        a(a(), fq.CONTENT_RECORD_BY_IDS, new String[]{str, str2, str3});
        ez.a(this.f18718a).a(str, str2, str4);
    }

    public static ex b(Context context) {
        ex exVar;
        synchronized (d) {
            if (f18737c == null) {
                f18737c = new ex(context);
            }
            exVar = f18737c;
        }
        return exVar;
    }

    private String a(Asset asset) {
        if (asset.d() != null) {
            return asset.d().a();
        }
        if (asset.e() != null) {
            return asset.e().a();
        }
        return null;
    }

    private ContentRecord a(fq fqVar, String[] strArr) {
        List listA = a(a(), null, fqVar, strArr, "priority asc, displayCount asc, updateTime desc", String.valueOf(4));
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return null;
        }
        return (ContentRecord) listA.get(0);
    }

    protected ex(Context context) {
        super(context);
    }
}
