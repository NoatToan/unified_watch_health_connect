package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fz f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gb f18820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ga f18821c;
    private Context d;

    public List<ContentRecord> b() {
        return this.f18819a.a(1);
    }

    public void a(ContentRecord contentRecord, List<Asset> list, TemplateData templateData) {
        if (contentRecord == null) {
            return;
        }
        this.f18819a.c(contentRecord);
        if (TextUtils.isEmpty(contentRecord.aP()) || com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        ContentTemplateRecord contentTemplateRecord = new ContentTemplateRecord(contentRecord.o(), contentRecord.aP(), list, templateData, contentRecord.br());
        if (!TextUtils.isEmpty(contentRecord.ba())) {
            contentTemplateRecord.a(contentRecord.ba());
        }
        this.f18820b.a(contentTemplateRecord);
    }

    public void a(ContentRecord contentRecord, String str) {
        if (contentRecord == null) {
            hw.c("TContentRecordManager", "deleteContentByIds, record is null");
            return;
        }
        hw.b("TContentRecordManager", "deleteContentByIds, uniqueId: %s", contentRecord.ac());
        this.f18819a.a(contentRecord, str);
        if (this.f18819a.c(contentRecord.o(), contentRecord.aP(), contentRecord.n()) != null) {
            hw.b("TContentRecordManager", "contentRecords remains");
        } else {
            hw.b("TContentRecordManager", "deleteContentByIds %s %s because %s", contentRecord.o(), contentRecord.aP(), str);
            a(contentRecord.o(), contentRecord.aP(), str);
        }
    }

    public void a(ContentRecord contentRecord) {
        if (contentRecord == null) {
            hw.c("TContentRecordManager", "deleteContent, record is null");
            return;
        }
        hw.b("TContentRecordManager", "deleteContent, uniqueId: %s", contentRecord.ac());
        this.f18819a.b(contentRecord.o(), contentRecord.n(), contentRecord.ac());
        if (this.f18819a.a(contentRecord.o(), contentRecord.n()) != null) {
            hw.b("TContentRecordManager", "contentRecords remains");
        } else {
            hw.b("TContentRecordManager", "deleteContent: %s %s", contentRecord.o(), contentRecord.aP());
            a(contentRecord.o(), contentRecord.aP(), "delete invalids");
        }
    }

    public List<ContentRecord> a(String str) {
        return this.f18819a.b(str);
    }

    public List<ContentRecord> a() {
        return this.f18819a.c();
    }

    public ContentRecord a(ContentRecord contentRecord, int i, long j) {
        String str;
        if (contentRecord == null) {
            return null;
        }
        hw.b("TContentRecordManager", "queryRealtimeShowContent, uniqueId: %s", contentRecord.ac());
        ContentRecord contentRecordA = this.f18819a.a(contentRecord, i, j);
        if (contentRecordA == null) {
            str = "showContent is null";
        } else {
            ContentTemplateRecord contentTemplateRecordA = this.f18820b.a(contentRecord.o(), contentRecord.aP());
            if (contentTemplateRecordA != null && !com.huawei.openalliance.ad.utils.bm.a(contentTemplateRecordA.c())) {
                contentRecordA.l(contentTemplateRecordA.c());
                contentRecordA.ac(contentTemplateRecordA.g());
                TemplateData templateData = new TemplateData(contentTemplateRecordA.d(), contentTemplateRecordA.e(), contentTemplateRecordA.f());
                if (contentRecord.aV() != null) {
                    templateData.c(contentRecord.aV().d());
                }
                contentRecordA.a(templateData);
                return contentRecordA;
            }
            str = "template is null";
        }
        hw.b("TContentRecordManager", str);
        return null;
    }

    private String c(String str) {
        Context context = this.d;
        String str2 = Constants.TPLATE_CACHE;
        String strC = dk.a(context, Constants.TPLATE_CACHE).c(str);
        if (!com.huawei.openalliance.ad.utils.dg.b(strC) && !com.huawei.openalliance.ad.utils.ai.d(new File(strC))) {
            String strC2 = dk.a(this.d, "normal").c(str);
            if (!com.huawei.openalliance.ad.utils.dg.b(strC2) && com.huawei.openalliance.ad.utils.ai.d(new File(strC2))) {
                str2 = "normal";
            }
        }
        hw.b("TContentRecordManager", "realCacheType is %s", str2);
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    private Boolean b(String str) {
        boolean z;
        List<ContentResource> listA = this.f18821c.a(str);
        if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
            z = listA.size() == 1;
        }
        return Boolean.valueOf(z);
    }

    private void a(String str, String str2, String str3) {
        ContentTemplateRecord contentTemplateRecordA = this.f18820b.a(str, str2);
        if (contentTemplateRecordA == null) {
            hw.b("TContentRecordManager", "templateRecord is null");
            return;
        }
        List<Asset> listC = contentTemplateRecordA.c();
        if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
            for (Asset asset : listC) {
                if (asset != null) {
                    String strG = asset.g();
                    if (!com.huawei.openalliance.ad.utils.dg.b(strG)) {
                        String strSubstring = strG.substring(strG.lastIndexOf("/") + 1);
                        if (b(strSubstring).booleanValue()) {
                            String strL = dn.l(strG);
                            com.huawei.openalliance.ad.utils.ai.a(this.d, strL, c(strL));
                        } else {
                            this.f18821c.b(str, strSubstring);
                        }
                    }
                }
            }
        }
        List<MotionData> listF = contentTemplateRecordA.f();
        if (!com.huawei.openalliance.ad.utils.bm.a(listF)) {
            for (MotionData motionData : listF) {
                if (motionData != null && !com.huawei.openalliance.ad.utils.dg.b(motionData.g())) {
                    String strA = com.huawei.openalliance.ad.utils.db.a(motionData.g());
                    String str4 = Scheme.DISKCACHE + strA;
                    if (b(strA).booleanValue()) {
                        com.huawei.openalliance.ad.utils.ai.a(this.d, str4, c(str4));
                    } else {
                        this.f18821c.b(str, strA);
                    }
                }
            }
        }
        this.f18820b.a(str, str2, str3);
    }

    public fr(Context context) {
        this.d = context.getApplicationContext();
        this.f18819a = ex.b(context);
        this.f18820b = ez.a(context);
        this.f18821c = ey.a(context);
    }
}
