package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ai extends j {
    protected com.huawei.openalliance.ad.download.app.interfaces.b e(Context context, String str) {
        com.huawei.openalliance.ad.download.app.interfaces.b bVarA = com.huawei.hms.ads.jsb.a.a(context).a();
        bVarA.a(d(str));
        return bVarA;
    }

    protected com.huawei.openalliance.ad.inter.data.j d(Context context, String str) {
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB != null) {
            return new com.huawei.openalliance.ad.inter.data.j(contentRecordB);
        }
        hw.a("JsbBaseDownload", "content is null");
        return null;
    }

    protected com.huawei.openalliance.ad.inter.data.j a(ContentRecord contentRecord) {
        if (contentRecord != null) {
            return new com.huawei.openalliance.ad.inter.data.j(contentRecord);
        }
        hw.a("JsbBaseDownload", "content is null");
        return null;
    }

    public ai(String str) {
        super(str);
    }
}
