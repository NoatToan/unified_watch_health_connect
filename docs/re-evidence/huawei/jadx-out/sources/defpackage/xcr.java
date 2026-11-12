package defpackage;

import android.content.Context;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi;
import com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = WechatDeviceProviderApi.class)
public class xcr implements WechatDeviceProviderApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<xcp> f52708b;

    @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi
    public void checkSupportWechatDevice(final DeviceInfo deviceInfo, final WechatDeviceProviderApi.CheckResultListener<Boolean> checkResultListener) {
        if (CommonUtil.j(LoginInit.getInstance(null).getAccountInfo(1019)) != 0) {
            LogUtil.a("WechatDeviceProviderApi", "only adult account should show wechat device.");
            checkResultListener.onResult(false);
        } else {
            LogUtil.a("WechatDeviceProviderApi", "isBindWechat  deviceInfo hiLinkDeviceId= ", deviceInfo.getHiLinkDeviceId());
            wzz.b((ICloudOperationResult<List<String>>) new ICloudOperationResult() { // from class: xct
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    xcr.a(checkResultListener, deviceInfo, (List) obj, str, z);
                }
            });
        }
    }

    static /* synthetic */ void a(WechatDeviceProviderApi.CheckResultListener checkResultListener, DeviceInfo deviceInfo, List list, String str, boolean z) {
        if (z) {
            if (CollectionUtils.a(list)) {
                checkResultListener.onError(1, "Support list is empty");
                return;
            } else {
                checkResultListener.onResult(Boolean.valueOf(list.contains(deviceInfo.getHiLinkDeviceId())));
                return;
            }
        }
        checkResultListener.onError(2, str);
    }

    @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi
    public void isBindMaxCount(final WechatDeviceProviderApi.CheckResultListener<Boolean> checkResultListener) {
        List<xcp> list = this.f52708b;
        if (list != null) {
            LogUtil.a("WechatDeviceProviderApi", "AuthorizedDevices count:", Integer.valueOf(b(list).size()));
            checkResultListener.onResult(Boolean.valueOf(b(this.f52708b).size() >= 5));
        } else {
            wzz.b(new SupportDeviceResultCallback() { // from class: xcr.1
                @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
                public void obtainBindDeviceList(List<xcp> list2) {
                    xcr.this.f52708b = list2;
                    xcr xcrVar = xcr.this;
                    LogUtil.a("WechatDeviceProviderApi", "AuthorizedDevices count:", Integer.valueOf(xcrVar.b((List<xcp>) xcrVar.f52708b).size()));
                    WechatDeviceProviderApi.CheckResultListener checkResultListener2 = checkResultListener;
                    xcr xcrVar2 = xcr.this;
                    checkResultListener2.onResult(Boolean.valueOf(xcrVar2.b((List<xcp>) xcrVar2.f52708b).size() >= 5));
                }

                @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
                public void onError(int i, String str) {
                    checkResultListener.onError(i, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<xcp> b(List<xcp> list) {
        for (xcp xcpVar : list) {
            boolean zC = xaf.c(xcpVar);
            xcpVar.setLocalBound(zC);
            LogUtil.a("WechatDeviceProviderApi", "Update authorized device = ", xcpVar.getDeviceName(), " , is local bound = ", Boolean.valueOf(zC));
        }
        return list;
    }

    @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi
    public void isBindWechat(final DeviceInfo deviceInfo, final WechatDeviceProviderApi.CheckResultListener<Boolean> checkResultListener) {
        LogUtil.a("WechatDeviceProviderApi", "isBindWechat  deviceInfo uuid= ", deviceInfo.getUuid());
        List<xcp> list = this.f52708b;
        if (list != null) {
            c(list, deviceInfo, checkResultListener);
        } else {
            wzz.b(new SupportDeviceResultCallback() { // from class: xcr.5
                @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
                public void obtainBindDeviceList(List<xcp> list2) {
                    xcr.this.f52708b = list2;
                    xcr.this.c(list2, deviceInfo, checkResultListener);
                }

                @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
                public void onError(int i, String str) {
                    checkResultListener.onError(i, str);
                }
            });
        }
    }

    @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi
    public void destroy() {
        this.f52708b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<xcp> list, DeviceInfo deviceInfo, WechatDeviceProviderApi.CheckResultListener<Boolean> checkResultListener) {
        if (!CollectionUtils.a(list) && xaf.e(deviceInfo, list) != null) {
            checkResultListener.onResult(true);
        }
        checkResultListener.onResult(false);
    }

    @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi
    public void bindWechat(Context context, DeviceInfo deviceInfo) {
        LogUtil.a("WechatDeviceProviderApi", "isBindWechat  deviceInfo deviceName= ", deviceInfo.getDeviceName(), ",mDeviceIdentify:", deviceInfo.getDeviceIdentify());
        destroy();
        AppRouter.c("/FeatureDataOpen/WeChatDeviceAuthorizeActivity").c("name", deviceInfo.getDeviceName()).c("identify", deviceInfo.getDeviceIdentify()).e("isAuthorized", false).b(context);
    }

    @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi
    public void jumpToWechatDeviceActivity(Context context) {
        destroy();
        LogUtil.a("WechatDeviceProviderApi", "jumpToWechatDeviceActivity");
        AppRouter.c("/FeatureDataOpen/WeChatDeviceActivity").b(context);
    }
}
