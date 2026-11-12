package defpackage;

import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.BenefitMessage;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.tradeservice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class ilu {
    public static void c(DeviceBenefits deviceBenefits) {
        if (deviceBenefits == null) {
            LogUtil.j("DeviceMessageUtils", "deviceBenefits is null.");
            return;
        }
        if (njy.b(deviceBenefits.getInboxInfos())) {
            for (DeviceInboxInfo deviceInboxInfo : deviceBenefits.getInboxInfos()) {
                deviceInboxInfo.setDeviceBenefitInfos(deviceBenefits.getBenefitInfos());
                deviceInboxInfo.setDeviceSn(deviceBenefits.getDeviceSn());
                a(deviceInboxInfo, deviceInboxInfo.getInboxName(), deviceBenefits.getDeviceSn(), irx.e(deviceInboxInfo), 0);
            }
        }
        if (njy.b(deviceBenefits.getPerfPurchaseInfos())) {
            for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : deviceBenefits.getPerfPurchaseInfos()) {
                if (devicePerfPurchaseInfo.isBenefitInfoValid()) {
                    LogUtil.a("DeviceMessageUtils", "setDeviceMessage DevicePerfPurchaseInfo.");
                    a(devicePerfPurchaseInfo, devicePerfPurchaseInfo.getPerfPurchaseName(), deviceBenefits.getDeviceSn(), irx.d(devicePerfPurchaseInfo), irz.b(devicePerfPurchaseInfo));
                }
            }
        }
    }

    private static void a(BaseDeviceBenefitInfo baseDeviceBenefitInfo, String str, String str2, String str3, int i) {
        if (baseDeviceBenefitInfo.getActiveStatus() == 2) {
            LogUtil.a("DeviceMessageUtils", "deviceBenefit is activated.");
            return;
        }
        if (a(baseDeviceBenefitInfo.getEffectiveStartTime(), baseDeviceBenefitInfo.getEffectiveEndTime())) {
            int iC = fxl.c(System.currentTimeMillis(), baseDeviceBenefitInfo.getEffectiveEndTime());
            if (iC == 3 || iC == 7) {
                LogUtil.a("DeviceMessageUtils", "setDeviceMessage will expired. expiredDay: ", Integer.valueOf(iC));
                e(baseDeviceBenefitInfo, BaseApplication.getContext().getResources().getString(R.string.IDS_device_benefit_will_expired_title), BaseApplication.getContext().getResources().getString(R.string.IDS_device_benefit_will_expired, baseDeviceBenefitInfo.getDeviceType(), str, BaseApplication.getContext().getResources().getQuantityString(com.huawei.health.servicesapi.R.plurals.IDS_user_profile_achieve_num_day, iC, UnitUtil.e(iC, 1, 0))), str2);
                return;
            }
            LogUtil.a("DeviceMessageUtils", "setDeviceMessage activate.");
            e(baseDeviceBenefitInfo, BaseApplication.getContext().getResources().getString(R.string.IDS_device_benefit_activate_title), BaseApplication.getContext().getResources().getString(R.string.IDS_device_benefit_activate, irz.d(str3, i), str), str2);
            return;
        }
        LogUtil.a("DeviceMessageUtils", "setDeviceMessage expired.");
        e(baseDeviceBenefitInfo, BaseApplication.getContext().getResources().getString(R.string.IDS_device_benefit_expired_title), BaseApplication.getContext().getResources().getString(R.string.IDS_device_benefit_expired, baseDeviceBenefitInfo.getDeviceType(), str, ezo.e(baseDeviceBenefitInfo.getEffectiveEndTime())), str2);
    }

    private static void e(BaseDeviceBenefitInfo baseDeviceBenefitInfo, String str, String str2, String str3) {
        String str4;
        MessageObject messageObjectA = a();
        messageObjectA.setHuid(LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1011));
        messageObjectA.setMsgFrom(str3);
        messageObjectA.setDetailUri("messagecenter://benefit?type=" + baseDeviceBenefitInfo.getLinkType() + "&key=" + ifp.b(baseDeviceBenefitInfo.getLinkValue()));
        messageObjectA.setMsgTitle(str);
        messageObjectA.setMsgContent(str2);
        String strValueOf = String.valueOf(90);
        if (baseDeviceBenefitInfo.getBenefitType() != 1) {
            str4 = MessageConstant.BENEFIT_TYPE;
        } else {
            strValueOf = String.valueOf(70);
            str4 = MessageConstant.MEMBER_TYPE;
        }
        messageObjectA.setModule(strValueOf);
        messageObjectA.setType(str4);
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        List<MessageObject> messages = messageCenterApi.getMessages(strValueOf, str4);
        if (njy.b(messages)) {
            LogUtil.a("DeviceMessageUtils", "benefitMessageList is not empty.");
            Iterator<MessageObject> it = messages.iterator();
            while (it.hasNext()) {
                if (it.next().equals(messageObjectA)) {
                    LogUtil.a("DeviceMessageUtils", "Device message exist.");
                    return;
                }
            }
        }
        messageObjectA.setMsgId(messageCenterApi.getMessageId(strValueOf, str4));
        d(baseDeviceBenefitInfo, str3, messageObjectA);
        messageCenterApi.insertMessage(messageObjectA);
        messageCenterApi.showNotification(com.huawei.haf.application.BaseApplication.b(), messageObjectA);
    }

    private static void d(BaseDeviceBenefitInfo baseDeviceBenefitInfo, String str, MessageObject messageObject) {
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) baseDeviceBenefitInfo;
            deviceInboxInfo.setDeviceSn(str);
            BenefitMessage benefitMessage = new BenefitMessage();
            benefitMessage.setBenefitType(MessageConstant.BENEFIT_INBOX_TYPE);
            benefitMessage.setBenefitData(qqt.b(deviceInboxInfo));
            messageObject.setDetailUriExt(qqt.b(benefitMessage));
        }
        if (baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo) {
            DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) baseDeviceBenefitInfo;
            devicePerfPurchaseInfo.setDeviceSn(str);
            BenefitMessage benefitMessage2 = new BenefitMessage();
            benefitMessage2.setBenefitType(MessageConstant.BENEFIT_PURCHASE_TYPE);
            benefitMessage2.setBenefitData(qqt.b(devicePerfPurchaseInfo));
            messageObject.setDetailUriExt(qqt.b(benefitMessage2));
        }
    }

    private static MessageObject a() {
        MessageObject messageObject = new MessageObject();
        messageObject.setCreateTime(System.currentTimeMillis());
        messageObject.setPosition(3);
        messageObject.setNotified(0);
        messageObject.setExpireTime(0L);
        messageObject.setFlag(0);
        return messageObject;
    }

    public static DeviceInboxInfo d(List<DeviceInboxInfo> list) {
        if (njy.e(list)) {
            return null;
        }
        for (DeviceInboxInfo deviceInboxInfo : list) {
            if (deviceInboxInfo.getBenefitType() == 2 && deviceInboxInfo.isBenefitInfoValid()) {
                LogUtil.a("DeviceMessageUtils", "ExclusiveGuardBenefit exist.");
                return deviceInboxInfo;
            }
        }
        return null;
    }

    private static boolean a(long j, long j2) {
        long jH = ltb.h();
        return jH >= j && jH <= j2;
    }
}
