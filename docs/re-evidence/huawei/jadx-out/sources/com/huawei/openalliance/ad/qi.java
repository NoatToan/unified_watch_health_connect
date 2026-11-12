package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.ContentFilterParam;
import com.huawei.openalliance.ad.beans.metadata.Content;

/* JADX INFO: loaded from: classes12.dex */
public class qi extends qh {
    @Override // com.huawei.openalliance.ad.qj
    public int b() {
        return 99;
    }

    @Override // com.huawei.openalliance.ad.qh
    protected boolean a(Content content, int i, String str) {
        ContentFilterParam contentFilterParam = new ContentFilterParam();
        contentFilterParam.a(content);
        contentFilterParam.a(99);
        contentFilterParam.b(i);
        contentFilterParam.a(str);
        com.huawei.openalliance.ad.utils.cs.a(this.f20125a, contentFilterParam);
        return true;
    }

    @Override // com.huawei.openalliance.ad.qh
    protected String a() {
        return "ForceFilter";
    }

    qi(Context context) {
        super(context);
    }
}
