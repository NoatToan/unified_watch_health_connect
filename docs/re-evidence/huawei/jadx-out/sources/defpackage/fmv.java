package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.controlcenter.featureability.sdk.IConnectCallback;
import com.huawei.controlcenter.featureability.sdk.model.ExtraParams;
import com.huawei.harmonyos.interwork.base.ability.IInitCallBack;
import com.huawei.harmonyos.interwork.base.content.Intent;
import com.huawei.health.airsharing.WirelessProjectionManager;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.onehop.fasdk.model.DeviceConnectState;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = DistributedApi.class)
@Singleton
public class fmv implements DistributedApi {
    private WirelessProjectionManager d;

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void init(Context context) {
        this.d = new WirelessProjectionManager(context);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public int startWirelessProjection() {
        WirelessProjectionManager wirelessProjectionManager = this.d;
        if (wirelessProjectionManager != null) {
            return wirelessProjectionManager.i();
        }
        LogUtil.j("DistributedImpl", "mProjectionManager.is not init().");
        return 4;
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void destroyWirelessProjection() {
        WirelessProjectionManager wirelessProjectionManager = this.d;
        if (wirelessProjectionManager != null) {
            wirelessProjectionManager.c();
            this.d = null;
        } else {
            LogUtil.j("DistributedImpl", "mProjectionManager.is not init().");
        }
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void detectLastWirelessDevice() {
        WirelessProjectionManager wirelessProjectionManager = this.d;
        if (wirelessProjectionManager != null) {
            wirelessProjectionManager.d();
        } else {
            LogUtil.j("DistributedImpl", "mProjectionManager.is not init().");
        }
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void setIsInit(boolean z) {
        WirelessProjectionManager wirelessProjectionManager = this.d;
        if (wirelessProjectionManager != null) {
            wirelessProjectionManager.a(z);
        } else {
            LogUtil.j("DistributedImpl", "mProjectionManager.is not init().");
        }
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void setIsCanPreSearch(boolean z) {
        WirelessProjectionManager wirelessProjectionManager = this.d;
        if (wirelessProjectionManager != null) {
            wirelessProjectionManager.b(z);
        } else {
            LogUtil.j("DistributedImpl", "mProjectionManager.is not init().");
        }
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void setHideNavigationBar(boolean z) {
        WirelessProjectionManager wirelessProjectionManager = this.d;
        if (wirelessProjectionManager != null) {
            wirelessProjectionManager.c(z);
        } else {
            LogUtil.j("DistributedImpl", "mProjectionManager.is not init().");
        }
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public boolean isHopEnabled(Context context) {
        return etz.d().a(context);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public int register(String str, IBinder iBinder, ExtraParams extraParams, IConnectCallback iConnectCallback) {
        return etz.d().d(str, iBinder, extraParams, iConnectCallback);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public boolean unregister(int i) {
        return etz.d().c(i);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public String createExFilterParamsWithSameAccount(efc efcVar) {
        return etz.d().d(efcVar);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public ExtraParams createExtraParams(String[] strArr, String str, String str2, String str3) {
        return etz.d().a(strArr, str, str2, str3);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public ExtraParams getDefaultExtraParams(String str, String str2) {
        return etz.d().a(str, str2);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public boolean showDeviceList(int i, ExtraParams extraParams) {
        return etz.d().b(i, extraParams);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void initDistributedEnvironment(String str, IInitCallBack iInitCallBack) {
        etz.d().b(str, iInitCallBack);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public int startRemoteAbility(Context context, String str, Intent intent) {
        return etz.d().a(context, str, intent);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void unInitDistributedEnvironment(String str, IInitCallBack iInitCallBack) {
        etz.d().d(str, iInitCallBack);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public boolean updateConnectStatus(int i, String str, DeviceConnectState deviceConnectState) {
        return etz.d().d(i, str, deviceConnectState);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public boolean isTargetDeviceInstalledHealth(String str) {
        return etz.d().c(str);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public boolean isSupportCenterController(Context context) {
        return etz.d().d(context);
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void releaseDeviceManager() {
        etz.d().a();
    }

    @Override // com.huawei.health.distributedservice.api.DistributedApi
    public void getAvailableFaDevice(UiCallback<List<?>> uiCallback) {
        etz.d().b(uiCallback);
    }
}
