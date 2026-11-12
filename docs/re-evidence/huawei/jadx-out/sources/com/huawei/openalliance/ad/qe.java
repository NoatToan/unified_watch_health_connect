package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.ContentFilterParam;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MetaData;

/* JADX INFO: loaded from: classes12.dex */
public class qe extends qh {
    @Override // com.huawei.openalliance.ad.qj
    public int b() {
        return 1;
    }

    @Override // com.huawei.openalliance.ad.qh
    protected boolean a(Content content, int i, String str) {
        String strA;
        String str2;
        MetaData metaDataC = content.c();
        if (metaDataC == null) {
            strA = a();
            str2 = "metaData is null";
        } else {
            ApkInfo apkInfoS = metaDataC.s();
            if (apkInfoS != null) {
                boolean zA = com.huawei.openalliance.ad.utils.k.a(this.f20125a, apkInfoS.a());
                if (zA) {
                    ContentFilterParam contentFilterParam = new ContentFilterParam();
                    contentFilterParam.a(1);
                    contentFilterParam.a(content);
                    contentFilterParam.b(i);
                    contentFilterParam.a(str);
                    com.huawei.openalliance.ad.utils.cs.a(this.f20125a, contentFilterParam);
                }
                return zA;
            }
            strA = a();
            str2 = "apkInfo is null";
        }
        hw.c(strA, str2);
        return false;
    }

    @Override // com.huawei.openalliance.ad.qh
    protected String a() {
        return "AppInstallAdFilter";
    }

    qe(Context context) {
        super(context);
    }
}
