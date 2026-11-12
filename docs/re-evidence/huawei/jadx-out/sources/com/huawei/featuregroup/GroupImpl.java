package com.huawei.featuregroup;

import com.huawei.health.group.api.GroupApi;
import com.huawei.health.group.constants.GroupActivityBo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cua;
import defpackage.exf;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@ApiDefine(uri = GroupApi.class)
public class GroupImpl implements GroupApi {
    @Override // com.huawei.health.group.api.GroupApi
    public void enableLocationSharing(boolean z, String str, String str2, long j, String str3) {
        LogUtil.a("GroupImpl", "enableLocationSharing isEnable:", Boolean.valueOf(z));
        cua.a().d(z, str, str2, j, str3);
    }

    @Override // com.huawei.health.group.api.GroupApi
    public boolean isSharing() {
        LogUtil.a("GroupImpl", "enter isSharing");
        return cua.a().h();
    }

    @Override // com.huawei.health.group.api.GroupApi
    public List<GroupActivityBo> getMyGrpActivityList(int i) {
        LogUtil.a("GroupImpl", "getMyGrpActivityList queryType:", Integer.valueOf(i));
        return cua.a().b(i);
    }

    @Override // com.huawei.health.group.api.GroupApi
    public void setMiniBarStatus(boolean z, String str, String str2) {
        LogUtil.a("GroupImpl", "setMiniBarStatus isShow:", Boolean.valueOf(z));
        cua.a().e(z, str, str2);
    }

    @Override // com.huawei.health.group.api.GroupApi
    public void showStopSharingDialog() {
        LogUtil.a("GroupImpl", "showStopSharingDialog");
        cua.a().i();
    }

    @Override // com.huawei.health.group.api.GroupApi
    public void registerLocationSharingListener(exf exfVar) {
        LogUtil.a("GroupImpl", "registerLocationSharingListener");
        cua.a().e(exfVar);
    }

    @Override // com.huawei.health.group.api.GroupApi
    public void unRegisterLocationSharingListener(exf exfVar) {
        LogUtil.a("GroupImpl", "unRegisterLocationSharingListener");
        cua.a().a(exfVar);
    }
}
