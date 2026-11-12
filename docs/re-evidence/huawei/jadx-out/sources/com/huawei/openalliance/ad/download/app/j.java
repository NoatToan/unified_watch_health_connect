package com.huawei.openalliance.ad.download.app;

import android.content.Context;
import android.os.Bundle;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.pq;
import com.huawei.openalliance.ad.tu;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dq;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f18574a;

    public boolean a(Context context, IAd iAd, boolean z) {
        if (context == null || iAd == null) {
            return false;
        }
        if (iAd instanceof com.huawei.openalliance.ad.inter.data.j) {
            return true;
        }
        int interfaceDownloadConfig = iAd.getInterfaceDownloadConfig();
        hw.a("DownloadChecker", "api control flag:%s", Integer.valueOf(interfaceDownloadConfig));
        if (interfaceDownloadConfig == 0) {
            return true;
        }
        if (interfaceDownloadConfig != 1) {
            if (interfaceDownloadConfig != 2) {
                hw.c("DownloadChecker", "invalid apiDownloadFlag value!");
            }
            return false;
        }
        if (z) {
            a(context, iAd);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IAd iAd, Context context) {
        if (iAd == null || context == null) {
            return;
        }
        if (iAd instanceof com.huawei.openalliance.ad.inter.data.e) {
            hw.b("DownloadChecker", "native trigger action list result:%s", Boolean.valueOf(((com.huawei.openalliance.ad.inter.data.e) iAd).a(context, (Bundle) null)));
        } else if (!(iAd instanceof com.huawei.openalliance.ad.inter.data.h)) {
            hw.b("DownloadChecker", "Unsupported ad form");
        } else {
            ContentRecord contentRecordA = pq.a((com.huawei.openalliance.ad.inter.data.h) iAd);
            hw.b("DownloadChecker", "trigger action list result:%s", Boolean.valueOf(tu.a(context, contentRecordA, a(contentRecordA)).a()));
        }
    }

    private void a(final Context context, final IAd iAd) {
        long jC = as.c();
        hw.b("DownloadChecker", "trigger action list lastTime:%s curTime:%s", Long.valueOf(f18574a), Long.valueOf(jC));
        if (jC - f18574a < 500) {
            hw.b("DownloadChecker", "trigger action list too frequently");
        } else {
            f18574a = jC;
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.j.1
                @Override // java.lang.Runnable
                public void run() {
                    j.this.a(iAd, context);
                }
            });
        }
    }

    private Map<String, String> a(ContentRecord contentRecord) {
        HashMap map = new HashMap();
        if (contentRecord != null && contentRecord.j() != null) {
            MetaData metaDataJ = contentRecord.j();
            String strN = metaDataJ.n();
            String strM = metaDataJ.m();
            if (strN != null && strM != null) {
                map.put("appId", strN);
                map.put("thirdId", strM);
            }
        }
        return map;
    }
}
