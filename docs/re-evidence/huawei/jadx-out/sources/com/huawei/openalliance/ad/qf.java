package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.ContentFilterParam;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MetaData;

/* JADX INFO: loaded from: classes12.dex */
public class qf extends qh {
    @Override // com.huawei.openalliance.ad.qj
    public int b() {
        return 2;
    }

    @Override // com.huawei.openalliance.ad.qh
    protected boolean a(Content content, int i, String str) {
        MetaData metaDataC = content.c();
        if (metaDataC == null) {
            hw.c(a(), "metaData is null");
            return false;
        }
        String strO = metaDataC.o();
        ApkInfo apkInfoS = metaDataC.s();
        String strA = apkInfoS == null ? null : apkInfoS.a();
        com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
        aVar.b(content.h());
        aVar.a(content.g());
        aVar.a(i);
        boolean z = com.huawei.openalliance.ad.utils.k.a(this.f20125a, strO, strA, aVar.a(), false) == null;
        if (z) {
            ContentFilterParam contentFilterParam = new ContentFilterParam();
            contentFilterParam.a(content);
            contentFilterParam.a(str);
            contentFilterParam.a(2);
            contentFilterParam.b(i);
            com.huawei.openalliance.ad.utils.cs.a(this.f20125a, contentFilterParam);
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.qh
    protected String a() {
        return "AppPromoteAdFilter";
    }

    qf(Context context) {
        super(context);
    }
}
