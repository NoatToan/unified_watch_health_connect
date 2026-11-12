package com.xiaomi.smarthome.core.stat;

import android.content.Context;
import com.xiaomi.smarthome.device.Device;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
class StatDepApiDefaultImpl extends StatDepApi {
    @Override // com.xiaomi.smarthome.core.stat.StatDepApi
    public boolean isAppForeground() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.stat.StatDepApi
    public boolean isCoreReady() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.stat.StatDepApi
    public boolean isUsrExpPlanEnabled(Context context) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.stat.StatDepApi
    public void operateCardStat(Device device) {
    }

    @Override // com.xiaomi.smarthome.core.stat.StatDepApi
    public boolean reportStatRecord(String str, boolean z) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.stat.StatDepApi
    public void report_spec_result(long j, String str, boolean z, int i, Collection<String> collection, String str2, String str3) {
    }

    @Override // com.xiaomi.smarthome.core.stat.StatDepApi
    public String takeStatSession(long j, long j2) {
        return "";
    }

    @Override // com.xiaomi.smarthome.core.stat.StatDepApi
    public void upload_pushid_empty(String str) {
    }
}
