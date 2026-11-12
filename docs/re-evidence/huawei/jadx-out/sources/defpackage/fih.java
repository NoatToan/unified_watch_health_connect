package defpackage;

import android.content.ContentValues;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.linkage.sportlinkage.AppLinkageApi;
import com.huawei.linkage.sportlinkage.DataListener;
import com.huawei.linkage.sportlinkage.LinkagePlatformApi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
@ApiDefine(uri = LinkagePlatformApi.class)
@Singleton
public class fih implements LinkagePlatformApi {
    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi
    public void initReverseLinkage(AppLinkageApi appLinkageApi) {
        fie.c().a(appLinkageApi);
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi
    public void handleRemoteException(ContentValues contentValues) {
        LogUtil.j("LINKAGE_ReverseLinkageManager", "registerRealDataListener handleRemoteException, content ", contentValues.toString());
        fie.c().d(contentValues);
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi
    public void registerRealDataListener(DataListener dataListener) {
        LogUtil.a("LINKAGE_ReverseLinkageManager", "registerRealDataListener linkageDataListener: ", dataListener);
        fie.c().d(dataListener);
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi
    public void unRegisterRealDataListener(DataListener dataListener) {
        LogUtil.a("LINKAGE_ReverseLinkageManager", "unRegisterRealDataListener linkageDataListener: ", dataListener);
        fie.c().e(dataListener);
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi
    public void unRegisterAllRealDataListener() {
        fie.c().j();
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi, com.huawei.linkage.sportlinkage.LinkageApi
    public void stopLinkage() {
        LogUtil.j("LINKAGE_ReverseLinkageManager", "ReverseLinkageApiImpl stopLinkage");
        fie.c().b();
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi, com.huawei.linkage.sportlinkage.LinkageApi
    public void resume() {
        LogUtil.j("LINKAGE_ReverseLinkageManager", "ReverseLinkageApiImpl resume");
        fie.c().d();
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi, com.huawei.linkage.sportlinkage.LinkageApi
    public void pause() {
        LogUtil.j("LINKAGE_ReverseLinkageManager", "ReverseLinkageApiImpl pause");
        fie.c().a();
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi, com.huawei.linkage.sportlinkage.LinkageApi
    public void stop() {
        LogUtil.j("LINKAGE_ReverseLinkageManager", "ReverseLinkageApiImpl stop");
        fie.c().e();
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi
    public void replyDevice(int i, String str) {
        LogUtil.j("LINKAGE_ReverseLinkageManager", "ReverseLinkageApiImpl replyDevice");
        fie.c().c(i, str);
    }

    @Override // com.huawei.linkage.sportlinkage.LinkagePlatformApi
    public void sendDataToDevice(JSONObject jSONObject, DeviceInfo deviceInfo) {
        fie.c().d(jSONObject, deviceInfo);
    }
}
