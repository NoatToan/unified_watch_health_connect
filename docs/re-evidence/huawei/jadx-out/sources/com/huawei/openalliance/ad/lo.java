package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class lo extends lp {
    @Override // com.huawei.openalliance.ad.lp
    protected void a(Context context, AppInfo appInfo, ContentRecord contentRecord, int i) {
        new com.huawei.openalliance.ad.download.app.f().a(context, appInfo, new pc(context, sw.a(context, contentRecord.f()), contentRecord), Integer.valueOf(i), false);
        new com.huawei.openalliance.ad.analysis.i(context).c(contentRecord, "1");
    }
}
