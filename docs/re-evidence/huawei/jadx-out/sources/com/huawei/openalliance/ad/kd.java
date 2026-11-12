package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.server.AppDataCollectionReq;
import com.huawei.openalliance.ad.beans.server.AppDataCollectionRsp;
import com.huawei.openalliance.ad.net.http.Response;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface kd {
    @kt(a = "appDataServer")
    @ko
    Response<AppDataCollectionRsp> a(@kk boolean z, @kh AppDataCollectionReq appDataCollectionReq, @km Map<String, String> map);
}
