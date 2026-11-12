package com.xiaomi.hm.health.bt.profile.gdsp.common;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.DataTransferRate;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApiProxy;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApi;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/DataTransferRate;", "rate", "", "onRate", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DataTransferSniffApiProxy implements DataTransferSniffApi {
    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.DataTransferSniffApi
    public void onRate(@NotNull DataTransferRate rate) {
        Debug.fi("DataTransferSniffApiProxy", Intrinsics.stringPlus("Data of transfer finished, ", rate));
        Iterator<T> it2 = DataTransferSniffApiManager.INSTANCE.getAll$bluetooth_release().iterator();
        while (it2.hasNext()) {
            ((DataTransferSniffApi) it2.next()).onRate(rate);
        }
    }
}
