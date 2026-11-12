package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ps extends ox {
    @Override // com.huawei.openalliance.ad.ox
    public void b(AdContentRsp adContentRsp) {
        if (adContentRsp == null) {
            this.f19930c.a(ErrorCode.ERROR_CODE_OTHER);
            hw.c("PlacementPreloadProcessor", "response is null");
            return;
        }
        Map<String, List<IPlacementAd>> mapB = b(adContentRsp.f());
        if (mapB.isEmpty()) {
            this.f19930c.a(800);
        } else {
            this.f19930c.a(null, mapB);
        }
    }

    public ps(Context context, rj rjVar) {
        super(context, rjVar);
    }
}
