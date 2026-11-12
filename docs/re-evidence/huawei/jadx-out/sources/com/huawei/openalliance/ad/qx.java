package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface qx {
    AdContentRsp a(Context context, AdSlotParam adSlotParam, int i);

    AdContentRsp a(AdSlotParam adSlotParam, List<String> list, List<String> list2);

    void a(DelayInfo delayInfo);

    void a(AdContentRsp adContentRsp, AdSlotParam adSlotParam, ri riVar, qw qwVar, long j, int i);
}
