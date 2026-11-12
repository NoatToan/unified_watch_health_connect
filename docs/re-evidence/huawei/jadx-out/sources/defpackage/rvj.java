package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitProductInfo;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.OtherServiceInfo;
import com.huawei.trade.datatype.Product;
import com.huawei.ui.homehealth.R;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public class rvj {
    public static List<BaseDeviceBenefitInfo> a(int i, Object obj, DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList();
        if (i != 0) {
            LogUtil.j("VipInfoUtils", "handleVipInfoResult errorCode is ", Integer.valueOf(i));
            return arrayList;
        }
        LogUtil.a("VipInfoUtils", "handleVipInfoResult GetVipInfoCallback success, objData is ", obj);
        DeviceBenefits deviceBenefits = obj instanceof DeviceBenefits ? (DeviceBenefits) obj : null;
        if (deviceBenefits == null) {
            LogUtil.j("VipInfoUtils", "handleVipInfoResult deviceBenefits is null");
            return arrayList;
        }
        String deviceSn = deviceBenefits.getDeviceSn();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        arrayList.addAll(e(deviceBenefits.getInboxInfos(), deviceInfo, atomicBoolean, deviceSn));
        arrayList.addAll(c(deviceBenefits.getPerfPurchaseInfos(), deviceInfo, atomicBoolean, deviceSn));
        return arrayList;
    }

    public static List<DeviceBenefitInfo> c(int i, Object obj) {
        ArrayList arrayList = new ArrayList();
        if (i != 0) {
            LogUtil.j("VipInfoUtils", "handleDeviceInfoResult errorCode is ", Integer.valueOf(i));
            return arrayList;
        }
        LogUtil.a("VipInfoUtils", "handleDeviceInfoResult GetDeviceBenefitInfoCallback success, objData is ", obj);
        DeviceBenefits deviceBenefits = obj instanceof DeviceBenefits ? (DeviceBenefits) obj : null;
        if (deviceBenefits == null) {
            LogUtil.j("VipInfoUtils", "handleDeviceInfoResult deviceBenefits is null");
            return arrayList;
        }
        if (!deviceBenefits.getBenefitInfos().isEmpty()) {
            arrayList.addAll(deviceBenefits.getBenefitInfos());
        }
        return arrayList;
    }

    private static List<DeviceInboxInfo> e(List<DeviceInboxInfo> list, DeviceInfo deviceInfo, AtomicBoolean atomicBoolean, String str) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        LogUtil.a("VipInfoUtils", "handleVipInfoResult inboxInfoList size is ", Integer.valueOf(list.size()));
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        for (DeviceInboxInfo deviceInboxInfo : list) {
            LogUtil.a("VipInfoUtils", "handleVipInfoResult deviceInboxInfo is :", Integer.valueOf(deviceInboxInfo.getActiveStatus()), ", time:", Boolean.valueOf(rtk.b(deviceInboxInfo.getEffectiveStartTime(), deviceInboxInfo.getEffectiveEndTime())));
            if (SharedPreferenceManager.b(Integer.toString(10008), accountInfo + "key_ignore_inbox_info" + deviceInboxInfo.getDeviceInboxId(), false)) {
                LogUtil.a("VipInfoUtils", "allDevicePurchaseList DeviceInboxId is: ", deviceInboxInfo.getDeviceInboxId());
            } else if (rtk.b(deviceInboxInfo.getEffectiveStartTime(), deviceInboxInfo.getEffectiveEndTime())) {
                deviceInboxInfo.setDeviceSn(str);
                if (deviceInboxInfo.getActiveStatus() == 1) {
                    if (irx.d(deviceInboxInfo) == null) {
                        LogUtil.j("VipInfoUtils", "BenefitUtils.getInboxMainProductInfo(deviceInboxInfo) is null");
                    } else if (deviceInboxInfo.getBenefitType() == 2) {
                        arrayList2.add(deviceInboxInfo);
                    } else {
                        arrayList3.add(deviceInboxInfo);
                    }
                } else if (deviceInboxInfo.getActiveStatus() == 2) {
                    OtherServiceInfo otherServiceInfoD = rvo.d(deviceInboxInfo);
                    if (!atomicBoolean.get() && otherServiceInfoD != null && e(otherServiceInfoD, deviceInfo)) {
                        arrayList4.add(deviceInboxInfo);
                        atomicBoolean.set(true);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList4);
        return arrayList;
    }

    private static List<DevicePerfPurchaseInfo> c(List<DevicePerfPurchaseInfo> list, DeviceInfo deviceInfo, AtomicBoolean atomicBoolean, String str) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : list) {
                LogUtil.a("VipInfoUtils", "allDevicePurchaseList devicePerfPurchaseInfo ", Integer.valueOf(devicePerfPurchaseInfo.getActiveStatus()), ", time:", Boolean.valueOf(rtk.b(devicePerfPurchaseInfo.getEffectiveStartTime(), devicePerfPurchaseInfo.getEffectiveEndTime())));
                if (SharedPreferenceManager.b(Integer.toString(10008), accountInfo + devicePerfPurchaseInfo.getDevicePerfPurchaseId(), false)) {
                    LogUtil.a("VipInfoUtils", "allDevicePurchaseList DevicePerfPurchaseId is: ", devicePerfPurchaseInfo.getDevicePerfPurchaseId());
                } else if (rtk.b(devicePerfPurchaseInfo.getEffectiveStartTime(), devicePerfPurchaseInfo.getEffectiveEndTime())) {
                    devicePerfPurchaseInfo.setDeviceSn(str);
                    if (devicePerfPurchaseInfo.getActiveStatus() == 1) {
                        if (irx.c(devicePerfPurchaseInfo) != null) {
                            arrayList.add(devicePerfPurchaseInfo);
                        }
                    } else if (devicePerfPurchaseInfo.getActiveStatus() == 2) {
                        OtherServiceInfo otherServiceInfoD = rvo.d(devicePerfPurchaseInfo);
                        if (!atomicBoolean.get() && otherServiceInfoD != null && e(otherServiceInfoD, deviceInfo)) {
                            arrayList.add(devicePerfPurchaseInfo);
                            atomicBoolean.set(true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static boolean e(OtherServiceInfo otherServiceInfo, DeviceInfo deviceInfo) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("VipInfoUtils", "isWatchPerfPurchaseReceived payApi == null");
            return false;
        }
        final String themeProductCode = otherServiceInfo.getThemeProductCode();
        if (TextUtils.isEmpty(themeProductCode)) {
            LogUtil.j("VipInfoUtils", "isWatchPerfPurchaseReceived themeProductCode isEmpty");
            return false;
        }
        qhv qhvVarA = a(deviceInfo, "2", themeProductCode);
        if (qhvVarA == null) {
            LogUtil.j("VipInfoUtils", "isWatchPerfPurchaseReceived themeProductQueryParam == null");
            return false;
        }
        final boolean[] zArr = {false};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        payApi.productQueryByType(qhvVarA, new IBaseResponseCallback() { // from class: rvj.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                try {
                    LogUtil.a("VipInfoUtils", "productQueryByType onResponse errorCode:", Integer.valueOf(i));
                    if (i == 0) {
                        boolean zC = c(obj);
                        LogUtil.a("VipInfoUtils", "productQueryByType isReceived:", Boolean.valueOf(zC));
                        zArr[0] = zC;
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }

            private boolean c(Object obj) {
                if (!njy.b(obj, qhm.class)) {
                    LogUtil.j("VipInfoUtils", "isReceived not isListTypeMatch");
                    return false;
                }
                List<qhm> list = (List) obj;
                LogUtil.a("VipInfoUtils", "isReceived list.size:", Integer.valueOf(list.size()));
                for (qhm qhmVar : list) {
                    if (themeProductCode.equalsIgnoreCase(qhmVar.a())) {
                        String strD = qhmVar.d();
                        LogUtil.a("VipInfoUtils", "productQueryByType isReceivedByCondition:", strD);
                        return "2".equals(strD);
                    }
                }
                return false;
            }
        });
        try {
            countDownLatch.await(15L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LogUtil.e("VipInfoUtils", "productQueryByType InterruptedException:", e);
        }
        return zArr[0];
    }

    private static qhv a(DeviceInfo deviceInfo, String str, String str2) {
        String str3;
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(deviceInfo.getProductType()));
        if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
            String strJ = pluginInfoByUuid.i().j();
            LogUtil.a("VipInfoUtils", "deviceInfoToThemeProductQueryParam brand:", strJ);
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

    public static rvl a(BaseDeviceBenefitInfo baseDeviceBenefitInfo, DeviceInfo deviceInfo) {
        OtherServiceInfo otherServiceInfoD;
        rvl rvlVar = new rvl();
        if (baseDeviceBenefitInfo.getActiveStatus() == 2 && (otherServiceInfoD = rvo.d(baseDeviceBenefitInfo)) != null) {
            rvlVar.d(true);
            rvlVar.b(otherServiceInfoD.getLinkType());
            rvlVar.b(otherServiceInfoD.getLinkValue());
            rvlVar.a(com.huawei.haf.application.BaseApplication.b().getString(R.string.IDS_watchface_benefit_pending));
        } else if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) baseDeviceBenefitInfo;
            rvlVar.b(deviceInboxInfo.getLinkType());
            rvlVar.b(deviceInboxInfo.getLinkValue());
            if (deviceInboxInfo.getBenefitType() == 2) {
                LogUtil.a("VipInfoUtils", "TYPE_EXCLUSIVE");
                rvlVar.a(vcu.e(R.string.IDS_free_exclusive, a(irx.d(deviceInboxInfo))));
            } else {
                LogUtil.a("VipInfoUtils", "DeviceInboxInfo not TYPE_EXCLUSIVE");
                rvlVar.a(d(irx.e(deviceInboxInfo), 0));
            }
        } else if (baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo) {
            LogUtil.a("VipInfoUtils", "DevicePerfPurchaseInfo");
            DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) baseDeviceBenefitInfo;
            rvlVar.b(devicePerfPurchaseInfo.getLinkType());
            rvlVar.b(devicePerfPurchaseInfo.getLinkValue());
            rvlVar.a(b(deviceInfo));
        }
        LogUtil.a("VipInfoUtils", "handleDeviceBenefitInfo vipDeviceBenefit:", rvlVar);
        return rvlVar;
    }

    public static String b(DeviceInfo deviceInfo) {
        String deviceName = deviceInfo.getDeviceName();
        if (TextUtils.isEmpty(deviceName)) {
            deviceName = "";
        } else if (deviceName.contains(Constants.LINK)) {
            deviceName = deviceName.substring(0, deviceName.lastIndexOf(Constants.LINK));
        }
        try {
            return BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_freed_device_discount, deviceName);
        } catch (IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("VipInfoUtils", "getInboxMessageStr string format exception", e.getMessage());
            return "";
        }
    }

    public static String d(String str, int i) {
        String strC = irz.c(str, i);
        LogUtil.a("VipInfoUtils", "getInboxMessageStr timeStr: ", strC);
        if (TextUtils.isEmpty(strC)) {
            return "";
        }
        try {
            return BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_free_membership, strC);
        } catch (IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("VipInfoUtils", "getInboxMessageStr string format exception", e.getMessage());
            return "";
        }
    }

    private static String a(DeviceBenefitProductInfo deviceBenefitProductInfo) {
        String duration;
        if (deviceBenefitProductInfo == null) {
            duration = "";
        } else {
            duration = deviceBenefitProductInfo.getDuration();
        }
        if (TextUtils.isEmpty(duration)) {
            duration = Product.YEAR_DURATION_FLAG;
        }
        return irz.b(duration);
    }
}
