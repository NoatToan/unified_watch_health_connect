package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthlinkage.api.HWhealthLinkageApi;
import com.huawei.hmf.annotation.ApiDefine;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
@ApiDefine(uri = HWhealthLinkageApi.class)
public class fhe implements HWhealthLinkageApi {
    @Override // com.huawei.health.healthlinkage.api.HWhealthLinkageApi
    public boolean isMediatorExist() {
        return fhz.d() == null;
    }

    @Override // com.huawei.health.healthlinkage.api.HWhealthLinkageApi
    public boolean isMediatorInit() {
        fhz fhzVarD = fhz.d();
        if (fhzVarD == null) {
            return false;
        }
        return fhzVarD.c();
    }

    @Override // com.huawei.health.healthlinkage.api.HWhealthLinkageApi
    public List<DeviceInfo> getLinkedDevice(int i) {
        return fhx.b(i);
    }
}
