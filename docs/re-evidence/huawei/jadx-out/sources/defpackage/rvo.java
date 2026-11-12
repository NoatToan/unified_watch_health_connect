package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.OtherServiceInfo;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class rvo<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<T> f47770b = new ArrayList(16);
    private boolean e;

    public List<T> c(int i, Object obj, DeviceInfo deviceInfo) {
        this.f47770b.clear();
        this.e = false;
        if (i != 0) {
            LogUtil.j("VipViewPagerSetting", "handleVipInfoResult errorCode is ", Integer.valueOf(i));
            return this.f47770b;
        }
        LogUtil.a("VipViewPagerSetting", "handleVipInfoResult GetVipInfoCallback success, objData is ", obj);
        DeviceBenefits deviceBenefits = obj instanceof DeviceBenefits ? (DeviceBenefits) obj : null;
        if (deviceBenefits == null) {
            LogUtil.j("VipViewPagerSetting", "handleVipInfoResult deviceBenefits is null");
            return this.f47770b;
        }
        String deviceSn = deviceBenefits.getDeviceSn();
        List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
        if (inboxInfos == null || inboxInfos.isEmpty()) {
            LogUtil.j("VipViewPagerSetting", "handleVipInfoResult inboxInfoList is null");
            e(deviceBenefits, deviceInfo, deviceSn);
            return this.f47770b;
        }
        c(deviceInfo, deviceBenefits, inboxInfos, deviceSn);
        e(deviceBenefits, deviceInfo, deviceSn);
        return this.f47770b;
    }

    private void c(DeviceInfo deviceInfo, DeviceBenefits deviceBenefits, List<DeviceInboxInfo> list, String str) {
        List<DeviceBenefitInfo> benefitInfos = deviceBenefits.getBenefitInfos();
        LogUtil.a("VipViewPagerSetting", "handleVipInfoResult inboxInfoList size is ", Integer.valueOf(list.size()));
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        for (DeviceInboxInfo deviceInboxInfo : list) {
            LogUtil.a("VipViewPagerSetting", "handleVipInfoResult deviceInboxInfo is :", Integer.valueOf(deviceInboxInfo.getActiveStatus()), ", time:", Boolean.valueOf(rtk.b(deviceInboxInfo.getEffectiveStartTime(), deviceInboxInfo.getEffectiveEndTime())));
            if (SharedPreferenceManager.b(Integer.toString(10008), accountInfo + "key_ignore_inbox_info" + deviceInboxInfo.getDeviceInboxId(), false)) {
                LogUtil.a("VipViewPagerSetting", "allDevicePurchaseList DeviceInboxId is: ", deviceInboxInfo.getDeviceInboxId());
            } else if (rtk.b(deviceInboxInfo.getEffectiveStartTime(), deviceInboxInfo.getEffectiveEndTime())) {
                deviceInboxInfo.setDeviceBenefitInfos(benefitInfos);
                deviceInboxInfo.setDeviceSn(str);
                if (deviceInboxInfo.getActiveStatus() == 1) {
                    if (irx.d(deviceInboxInfo) != null) {
                        this.f47770b.add(deviceInboxInfo);
                        a(deviceInboxInfo.getDeviceInboxId());
                    }
                } else if (deviceInboxInfo.getActiveStatus() == 2) {
                    OtherServiceInfo otherServiceInfoD = d(deviceInboxInfo);
                    if (!this.e && otherServiceInfoD != null && b(otherServiceInfoD, deviceInfo)) {
                        this.f47770b.add(deviceInboxInfo);
                        a(deviceInboxInfo.getDeviceInboxId());
                        this.e = true;
                    }
                }
            }
        }
    }

    public void e(Handler handler, List<T> list) {
        if (handler == null) {
            LogUtil.j("VipViewPagerSetting", "sendMessageUpdateUi handler is null");
        } else if (list == null || list.isEmpty()) {
            LogUtil.j("VipViewPagerSetting", "sendMessageUpdateUi allDataInfoList is null");
            handler.sendMessage(rtk.b(-1));
        } else {
            handler.sendMessage(rtk.b(0));
        }
    }

    private void e(DeviceBenefits deviceBenefits, DeviceInfo deviceInfo, String str) {
        List<DevicePerfPurchaseInfo> perfPurchaseInfos = deviceBenefits.getPerfPurchaseInfos();
        if (perfPurchaseInfos == null || perfPurchaseInfos.isEmpty()) {
            LogUtil.j("VipViewPagerSetting", "addAllDataInfo devicePurchaseInfoList is null");
        } else {
            LogUtil.a("VipViewPagerSetting", "addAllDataInfo devicePurchaseInfoList size is ", Integer.valueOf(perfPurchaseInfos.size()));
            c(perfPurchaseInfos, deviceInfo, str);
        }
    }

    private void c(List<DevicePerfPurchaseInfo> list, DeviceInfo deviceInfo, String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : list) {
            LogUtil.a("VipViewPagerSetting", "allDevicePurchaseList devicePerfPurchaseInfo ", Integer.valueOf(devicePerfPurchaseInfo.getActiveStatus()), ", time:", Boolean.valueOf(rtk.b(devicePerfPurchaseInfo.getEffectiveStartTime(), devicePerfPurchaseInfo.getEffectiveEndTime())));
            if (SharedPreferenceManager.b(Integer.toString(10008), accountInfo + devicePerfPurchaseInfo.getDevicePerfPurchaseId(), false)) {
                LogUtil.a("VipViewPagerSetting", "allDevicePurchaseList DevicePerfPurchaseId is: ", devicePerfPurchaseInfo.getDevicePerfPurchaseId());
            } else if (rtk.b(devicePerfPurchaseInfo.getEffectiveStartTime(), devicePerfPurchaseInfo.getEffectiveEndTime())) {
                devicePerfPurchaseInfo.setDeviceSn(str);
                if (devicePerfPurchaseInfo.getActiveStatus() == 1) {
                    if (irx.c(devicePerfPurchaseInfo) != null) {
                        this.f47770b.add(devicePerfPurchaseInfo);
                        a(devicePerfPurchaseInfo.getDevicePerfPurchaseId());
                    }
                } else if (devicePerfPurchaseInfo.getActiveStatus() == 2) {
                    OtherServiceInfo otherServiceInfoD = d(devicePerfPurchaseInfo);
                    if (!this.e && otherServiceInfoD != null && b(otherServiceInfoD, deviceInfo)) {
                        this.f47770b.add(devicePerfPurchaseInfo);
                        a(devicePerfPurchaseInfo.getDevicePerfPurchaseId());
                        this.e = true;
                    }
                }
            }
        }
    }

    private boolean b(OtherServiceInfo otherServiceInfo, DeviceInfo deviceInfo) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("VipViewPagerSetting", "isWatchPerfPurchaseReceived payApi == null");
            return false;
        }
        final String themeProductCode = otherServiceInfo.getThemeProductCode();
        if (TextUtils.isEmpty(themeProductCode)) {
            LogUtil.j("VipViewPagerSetting", "isWatchPerfPurchaseReceived themeProductCode isEmpty");
            return false;
        }
        qhv qhvVarC = c(deviceInfo, "2", themeProductCode);
        if (qhvVarC == null) {
            LogUtil.j("VipViewPagerSetting", "isWatchPerfPurchaseReceived themeProductQueryParam == null");
            return false;
        }
        final boolean[] zArr = {false};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        payApi.productQueryByType(qhvVarC, new IBaseResponseCallback() { // from class: rvo.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                try {
                    LogUtil.a("VipViewPagerSetting", "productQueryByType onResponse errorCode:", Integer.valueOf(i));
                    if (i == 0) {
                        boolean zB = b(obj);
                        LogUtil.a("VipViewPagerSetting", "productQueryByType isReceived:", Boolean.valueOf(zB));
                        zArr[0] = zB;
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }

            private boolean b(Object obj) {
                if (!njy.b(obj, qhm.class)) {
                    LogUtil.j("VipViewPagerSetting", "isReceived not isListTypeMatch");
                    return false;
                }
                List<qhm> list = (List) obj;
                LogUtil.a("VipViewPagerSetting", "isReceived list.size:", Integer.valueOf(list.size()));
                for (qhm qhmVar : list) {
                    if (themeProductCode.equalsIgnoreCase(qhmVar.a())) {
                        String strD = qhmVar.d();
                        LogUtil.a("VipViewPagerSetting", "productQueryByType isReceivedByCondition:", strD);
                        return "2".equals(strD);
                    }
                }
                return false;
            }
        });
        try {
            countDownLatch.await(15L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LogUtil.e("VipViewPagerSetting", "productQueryByType InterruptedException:", e);
        }
        return zArr[0];
    }

    private qhv c(DeviceInfo deviceInfo, String str, String str2) {
        String str3;
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(deviceInfo.getProductType()));
        if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
            String strJ = pluginInfoByUuid.i().j();
            LogUtil.a("VipViewPagerSetting", "deviceInfoToThemeProductQueryParam brand:", strJ);
            if (String.valueOf(1).equals(strJ)) {
                str3 = "1";
            } else if (String.valueOf(2).equals(strJ)) {
                str3 = "3";
            } else {
                str3 = "4";
            }
        } else {
            str3 = "";
        }
        return new qhv.d().b(deviceInfo.getDeviceModel()).c(deviceInfo.getUuid()).d("6").e(str3).i(str).a(str2).b();
    }

    private void a(String str) {
        String strB = SharedPreferenceManager.b(Integer.toString(10008), "equity_click_red_dot_status", "");
        if (strB.contains(str)) {
            return;
        }
        SharedPreferenceManager.c(Integer.toString(10008), "equity_click_red_dot_status", strB + str + ",");
    }

    public static OtherServiceInfo d(Object obj) {
        List<OtherServiceInfo> otherServiceList;
        if (obj instanceof DeviceInboxInfo) {
            otherServiceList = ((DeviceInboxInfo) obj).getOtherServiceList();
        } else {
            otherServiceList = obj instanceof DevicePerfPurchaseInfo ? ((DevicePerfPurchaseInfo) obj).getOtherServiceList() : null;
        }
        if (njy.b(otherServiceList)) {
            for (OtherServiceInfo otherServiceInfo : otherServiceList) {
                if (otherServiceInfo.getServiceType() == 3) {
                    return otherServiceInfo;
                }
            }
        }
        return null;
    }
}
