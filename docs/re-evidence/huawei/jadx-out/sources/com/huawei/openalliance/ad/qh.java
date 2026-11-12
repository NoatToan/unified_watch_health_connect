package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.Content;

/* JADX INFO: loaded from: classes12.dex */
public abstract class qh implements qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f20125a;

    protected abstract String a();

    protected abstract boolean a(Content content, int i, String str);

    @Override // com.huawei.openalliance.ad.qj
    public boolean a(String str, int i, int i2, Content content) {
        if (content == null) {
            return true;
        }
        if (hw.a()) {
            hw.a(a(), "filterContents adType: %d contentid: %s requestType: %d", Integer.valueOf(i), content.g(), Integer.valueOf(i2));
        }
        boolean zA = a(content, i, str);
        if (zA) {
            hw.c(a(), "contentid %s is discarded", content.g());
        }
        return zA;
    }

    qh(Context context) {
        this.f20125a = context.getApplicationContext();
    }
}
