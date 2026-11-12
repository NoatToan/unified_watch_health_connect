package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.SdkExposureHistoryRecord;
import com.huawei.openalliance.ad.db.bean.AnalysisEventRecord;
import com.huawei.openalliance.ad.db.bean.AppDataCollectionRecord;
import com.huawei.openalliance.ad.db.bean.ClickEventRecord;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentRecordV3;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.db.bean.DeletedContentRecord;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import com.huawei.openalliance.ad.db.bean.ImpEventRecord;
import com.huawei.openalliance.ad.db.bean.IntentDataRecord;
import com.huawei.openalliance.ad.db.bean.PlacementRecord;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;
import com.huawei.openalliance.ad.db.bean.TemplateRecord;
import com.huawei.openalliance.ad.db.bean.TestContentRecord;
import com.huawei.openalliance.ad.db.bean.ThirdPartyEventRecord;
import com.huawei.openalliance.ad.db.bean.UserCloseRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class dj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<com.huawei.openalliance.ad.db.bean.a> f18393b = new ArrayList(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<com.huawei.openalliance.ad.db.bean.a> f18394c = new ArrayList(4);
    private static List<String> d;
    private static String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dg f18395a;

    public void c() {
        b();
        Iterator<com.huawei.openalliance.ad.db.bean.a> it = f18393b.iterator();
        while (it.hasNext()) {
            c(it.next().bz());
        }
        for (com.huawei.openalliance.ad.db.bean.a aVar : f18394c) {
            try {
                this.f18395a.c(aVar.by());
            } catch (com.huawei.openalliance.ad.exception.a unused) {
                hw.c("DbUpdateHelper", "create table %s failed", aVar.bz());
            }
        }
    }

    public void b() {
        try {
            Iterator<String> it = d.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        } catch (Exception unused) {
            hw.c("DbUpdateHelper", "deleteTablebyList fail");
        }
    }

    public void a() throws com.huawei.openalliance.ad.exception.a {
        b();
        for (com.huawei.openalliance.ad.db.bean.a aVar : f18394c) {
            String strBz = aVar.bz();
            if (this.f18395a.e(strBz)) {
                this.f18395a.f(strBz);
                hw.b("DbUpdateHelper", "tableName exist moidfy table successfully.");
                try {
                    this.f18395a.c(aVar.by());
                    b(strBz);
                    hw.b("DbUpdateHelper", "insert data to table successfully.");
                    this.f18395a.a(strBz);
                    hw.b("DbUpdateHelper", "drop table temp table successfully.");
                } catch (com.huawei.openalliance.ad.exception.a unused) {
                    throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "table exist, init table tableName: %s failed", strBz.trim()));
                }
            } else {
                try {
                    this.f18395a.c(aVar.by());
                } catch (com.huawei.openalliance.ad.exception.a unused2) {
                    throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "table is not exist, init table tableName: %s failed", strBz.trim()));
                }
            }
        }
    }

    private void c(String str) {
        try {
            if (this.f18395a.e(str)) {
                this.f18395a.b(str);
            }
        } catch (com.huawei.openalliance.ad.exception.a unused) {
            hw.c("DbUpdateHelper", "delete table fail");
        }
    }

    private void b(String str) throws com.huawei.openalliance.ad.exception.a {
        StringBuilder sb = new StringBuilder(" INSERT INTO ");
        sb.append(str);
        sb.append(" SELECT ");
        try {
            try {
                String strA = a(this.f18395a.d(str), this.f18395a.d("_temp_" + str));
                if (strA == null) {
                    throw new com.huawei.openalliance.ad.exception.a("insert data sql is null");
                }
                sb.append(strA);
                sb.append(" FROM _temp_");
                sb.append(str);
                try {
                    this.f18395a.c(sb.toString());
                } catch (com.huawei.openalliance.ad.exception.a unused) {
                    throw new com.huawei.openalliance.ad.exception.a("DbUpdateHelper insertData mDbHelper.executeSQL error");
                }
            } catch (com.huawei.openalliance.ad.exception.a unused2) {
                throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "get temp table %s column names failed", str.trim()));
            }
        } catch (com.huawei.openalliance.ad.exception.a unused3) {
            throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "get table %s column names failed", str.trim()));
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strReplaceAll = str.replaceAll("_temp_", "");
        Iterator<com.huawei.openalliance.ad.db.bean.a> it = f18394c.iterator();
        while (it.hasNext()) {
            if (strReplaceAll.equals(it.next().bz())) {
                return true;
            }
        }
        Iterator<com.huawei.openalliance.ad.db.bean.a> it2 = f18393b.iterator();
        while (it2.hasNext()) {
            if (strReplaceAll.equals(it2.next().bz())) {
                return true;
            }
        }
        Iterator<String> it3 = d.iterator();
        while (it3.hasNext()) {
            if (strReplaceAll.equals(it3.next())) {
                return true;
            }
        }
        return false;
    }

    private String a(String[] strArr, String[] strArr2) {
        StringBuilder sb = new StringBuilder();
        List arrayList = new ArrayList(4);
        if (strArr2 != null) {
            arrayList = Arrays.asList(strArr2);
        }
        if (strArr == null || strArr.length <= 0 || strArr2 == null) {
            return null;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (!arrayList.contains(str)) {
                str = "\"\"";
            }
            sb.append(str);
            if (i != strArr.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public dj(dg dgVar) {
        this.f18395a = dgVar;
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        d = arrayList;
        e = "TestContentRecord";
        arrayList.add("TemplateStyleRecord");
        f18393b.add(new ContentRecord());
        f18393b.add(new EventRecord());
        f18393b.add(new TestContentRecord());
        f18393b.add(new ThirdPartyEventRecord());
        f18393b.add(new UserCloseRecord());
        f18393b.add(new TemplateRecord());
        f18393b.add(new PlacementRecord());
        f18393b.add(new ImpEventRecord());
        f18393b.add(new ClickEventRecord());
        f18393b.add(new AnalysisEventRecord());
        f18393b.add(new ContentResource());
        f18393b.add(new EventMonitorRecord());
        f18393b.add(new ContentTemplateRecord());
        f18393b.add(new ContentRecordV3());
        f18393b.add(new AppDataCollectionRecord());
        f18393b.add(new DeletedContentRecord());
        f18393b.add(new SdkCfgSha256Record());
        f18393b.add(new SdkExposureHistoryRecord());
        f18393b.add(new IntentDataRecord());
        f18394c.add(new ContentRecord());
        f18394c.add(new EventRecord());
        f18394c.add(new ThirdPartyEventRecord());
        f18394c.add(new UserCloseRecord());
        f18394c.add(new TemplateRecord());
        f18394c.add(new PlacementRecord());
        f18394c.add(new ImpEventRecord());
        f18394c.add(new ClickEventRecord());
        f18394c.add(new AnalysisEventRecord());
        f18394c.add(new ContentResource());
        f18394c.add(new EventMonitorRecord());
        f18394c.add(new ContentTemplateRecord());
        f18394c.add(new ContentRecordV3());
        f18394c.add(new AppDataCollectionRecord());
        f18394c.add(new DeletedContentRecord());
        f18394c.add(new SdkCfgSha256Record());
        f18394c.add(new SdkExposureHistoryRecord());
        f18394c.add(new IntentDataRecord());
    }
}
