package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.log.ILogHealth;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class rdf implements ILogHealth {
    @Override // com.huawei.maps.offlinedata.health.log.ILogHealth
    public void d(String str, String str2) {
        LogUtil.d("OfflineDataMap", str, ": ", str2);
    }

    @Override // com.huawei.maps.offlinedata.health.log.ILogHealth
    public void i(String str, String str2) {
        LogUtil.a("OfflineDataMap", str, ": ", str2);
    }

    @Override // com.huawei.maps.offlinedata.health.log.ILogHealth
    public void w(String str, String str2) {
        LogUtil.j("OfflineDataMap", str, ": ", str2);
    }

    @Override // com.huawei.maps.offlinedata.health.log.ILogHealth
    public void e(String str, String str2) {
        ReleaseLogUtil.a("R_OfflineDataMap", str, ": ", str2);
    }
}
