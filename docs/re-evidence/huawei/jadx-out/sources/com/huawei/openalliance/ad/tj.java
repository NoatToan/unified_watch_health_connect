package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class tj extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private rc e;
    private String f;

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        String strB;
        ApkInfo apkInfoS;
        hw.b("AppEnterAction", "handle app enter action");
        MetaData metaData = (MetaData) com.huawei.openalliance.ad.utils.bk.b(this.f20324b.h(), MetaData.class, new Class[0]);
        if (metaData == null || (apkInfoS = metaData.s()) == null) {
            strB = "metaData is null";
        } else {
            this.f = apkInfoS.a();
            com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
            aVar.a(apkInfoS).a(this.f20324b, this.f20323a);
            strB = com.huawei.openalliance.ad.utils.k.b(this.f20323a, this.f, aVar.a());
        }
        if (!"success".equals(strB)) {
            a(strB);
            return b();
        }
        c("app");
        com.huawei.openalliance.ad.download.app.l.a(this.f20323a, this.f20324b.ag());
        this.e.a((Integer) 1);
        return true;
    }

    public void a(String str) {
        try {
            new com.huawei.openalliance.ad.analysis.c(this.f20323a).a("2100092", this.f20324b, str, this.f, (String) null);
        } catch (Exception e) {
            hw.c("AppEnterAction", "reportActionFail, ex: %s", e.getClass().getSimpleName());
        }
    }

    public tj(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
        pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
        this.e = pcVar;
        pcVar.a(contentRecord);
    }
}
