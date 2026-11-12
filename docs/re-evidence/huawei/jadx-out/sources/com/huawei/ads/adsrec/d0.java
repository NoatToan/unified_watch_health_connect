package com.huawei.ads.adsrec;

import com.huawei.ads.adsrec.db.table.AdContentRspRecord;
import com.huawei.ads.adsrec.db.table.AdIECImpRecord;
import com.huawei.ads.adsrec.db.table.MaterialSummaryRecord;
import defpackage.axh;
import defpackage.axm;
import defpackage.ayt;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public interface d0 {
    axm a(String str, String str2);

    List<axh> a(ayt aytVar);

    List<AdIECImpRecord> a(String str);

    void a(AdContentRspRecord adContentRspRecord);

    void a(List<String[]> list);

    void a(List<axm> list, int i);

    void a(JSONArray jSONArray);

    AdContentRspRecord b(String str);

    List<MaterialSummaryRecord> b(String str, String str2);

    void b(List<String[]> list);

    void c(List<axm> list);
}
