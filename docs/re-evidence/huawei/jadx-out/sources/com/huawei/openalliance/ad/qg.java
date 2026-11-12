package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.ContentFilterParam;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MetaData;

/* JADX INFO: loaded from: classes12.dex */
public class qg extends qh {
    @Override // com.huawei.openalliance.ad.qj
    public int b() {
        return 4;
    }

    @Override // com.huawei.openalliance.ad.qh
    protected boolean a(Content content, int i, String str) {
        String strA;
        String str2;
        MetaData metaDataC = content.c();
        if (metaDataC == null) {
            strA = a();
            str2 = "isNeedDiscard metaData is null";
        } else {
            ApkInfo apkInfoS = metaDataC.s();
            if (apkInfoS != null) {
                if (com.huawei.openalliance.ad.utils.k.a(this.f20125a, apkInfoS.a())) {
                    String strO = metaDataC.o();
                    com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
                    aVar.a(content.g()).b(content.h()).a(i);
                    if (com.huawei.openalliance.ad.utils.k.a(this.f20125a, strO, apkInfoS.a(), aVar.a(), false) == null) {
                        ContentFilterParam contentFilterParam = new ContentFilterParam();
                        contentFilterParam.a(4);
                        contentFilterParam.b(i);
                        contentFilterParam.a(content);
                        contentFilterParam.a(str);
                        com.huawei.openalliance.ad.utils.cs.a(this.f20125a, contentFilterParam);
                        hw.c(a(), "isNeedDiscard intent check fail");
                        return true;
                    }
                }
                return false;
            }
            strA = a();
            str2 = "isNeedDiscard apkInfo is null";
        }
        hw.c(strA, str2);
        return false;
    }

    @Override // com.huawei.openalliance.ad.qh
    protected String a() {
        return "AppPropagandaFilter";
    }

    qg(Context context) {
        super(context);
    }
}
