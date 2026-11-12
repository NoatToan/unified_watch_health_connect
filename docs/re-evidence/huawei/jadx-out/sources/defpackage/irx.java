package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.DeviceBenefitProductInfo;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.InboxBenefitInfo;

/* JADX INFO: loaded from: classes9.dex */
public class irx {
    public static String e(DeviceInboxInfo deviceInboxInfo) {
        DeviceBenefitProductInfo productInfo;
        if (deviceInboxInfo == null || njy.e(deviceInboxInfo.getInboxBenefitInfos())) {
            LogUtil.j("BenefitUtils", "seviceInboxInfo is null.");
            return "";
        }
        for (InboxBenefitInfo inboxBenefitInfo : deviceInboxInfo.getInboxBenefitInfos()) {
            if (inboxBenefitInfo.isMainBenefit() && (productInfo = inboxBenefitInfo.getProductInfo()) != null) {
                return productInfo.getDuration();
            }
        }
        return "";
    }

    public static String d(DevicePerfPurchaseInfo devicePerfPurchaseInfo) {
        if (devicePerfPurchaseInfo == null) {
            LogUtil.j("BenefitUtils", "seviceInboxInfo is null.");
            return "";
        }
        if (devicePerfPurchaseInfo.getAutoRenew() != 1) {
            return devicePerfPurchaseInfo.getSubscribeProductInfo() == null ? "" : devicePerfPurchaseInfo.getSubscribeProductInfo().getDuration();
        }
        LogUtil.a("BenefitUtils", "user autoRenew = ", Integer.valueOf(devicePerfPurchaseInfo.getAutoRenew()));
        return devicePerfPurchaseInfo.getProductInfo() == null ? "" : devicePerfPurchaseInfo.getProductInfo().getDuration();
    }

    public static DeviceBenefitProductInfo d(DeviceInboxInfo deviceInboxInfo) {
        if (deviceInboxInfo == null || njy.e(deviceInboxInfo.getInboxBenefitInfos())) {
            LogUtil.j("BenefitUtils", "DeviceInboxInfo is null. ");
            return null;
        }
        for (InboxBenefitInfo inboxBenefitInfo : deviceInboxInfo.getInboxBenefitInfos()) {
            if (inboxBenefitInfo.isMainBenefit()) {
                return inboxBenefitInfo.getProductInfo();
            }
        }
        return null;
    }

    public static DeviceBenefitProductInfo c(DevicePerfPurchaseInfo devicePerfPurchaseInfo) {
        if (devicePerfPurchaseInfo == null) {
            LogUtil.j("BenefitUtils", "perfPurchaseInfo is null. ");
            return null;
        }
        LogUtil.a("BenefitUtils", "user autoRenew = ", Integer.valueOf(devicePerfPurchaseInfo.getAutoRenew()));
        if (devicePerfPurchaseInfo.getAutoRenew() == 1) {
            return devicePerfPurchaseInfo.getProductInfo();
        }
        return devicePerfPurchaseInfo.getSubscribeProductInfo();
    }
}
