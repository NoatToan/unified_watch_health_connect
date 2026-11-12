package defpackage;

import android.content.res.Configuration;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nff {
    public static void e(final DeviceInfo deviceInfo) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nff.1
            @Override // java.lang.Runnable
            public void run() {
                nff.c(deviceInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(DeviceInfo deviceInfo) {
        HwDeviceMgrInterface hwDeviceMgrInterfaceE = mkf.e(BaseApplication.getContext());
        List<DeviceInfo> listA = a();
        if (listA.size() == 0) {
            LogUtil.j("LanguageUtil", "connected device list is null,can not change any language");
            return;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = hwDeviceMgrInterfaceE.queryDeviceCapability(3, "", "LanguageUtil");
        for (DeviceInfo deviceInfo2 : listA) {
            if (deviceInfo2 != null && !TextUtils.isEmpty(deviceInfo2.getDeviceIdentify()) && (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || deviceInfo2.getDeviceIdentify().contains(deviceInfo.getDeviceIdentify()))) {
                DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo2.getDeviceIdentify());
                if (deviceCapability != null && deviceCapability.isLanguage()) {
                    b(deviceInfo2, hwDeviceMgrInterfaceE);
                }
            }
        }
    }

    private static List<DeviceInfo> a() {
        ArrayList arrayList = new ArrayList(16);
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "LanguageUtil")) {
            if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
                arrayList.add(deviceInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    private static void b(DeviceInfo deviceInfo, HwDeviceMgrInterface hwDeviceMgrInterface) {
        ?? r4;
        boolean z;
        int length;
        int length2;
        String strD = d(deviceInfo);
        byte[] bArrC = eeq.c(eeq.a(strD));
        String strAi = CommonUtil.ai();
        byte[] bArrC2 = eeq.c(eeq.a(strAi));
        LogUtil.a("LanguageUtil", "current language script: ", strAi);
        boolean z2 = false;
        if (deviceInfo.getProductType() == 7 || deviceInfo.getProductType() == 14) {
            r4 = 0;
            z = false;
        } else {
            boolean zD = UnitUtil.d();
            LogUtil.a("LanguageUtil", "Need set unit info unit info:", Integer.valueOf(zD ? 1 : 0));
            z = true;
            r4 = zD;
        }
        if (eey.d(deviceInfo, 57) && strAi.length() > 0) {
            z2 = true;
        }
        LogUtil.a("LanguageUtil", "isSupportScript: ", Boolean.valueOf(z2));
        if (z) {
            length = bArrC.length + 5;
            if (z2) {
                length2 = bArrC2.length;
                length += length2 + 2;
            }
        } else {
            length = bArrC.length + 2;
            if (z2) {
                length2 = bArrC2.length;
                length += length2 + 2;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) bArrC.length);
        byteBufferAllocate.put(bArrC);
        if (z) {
            byteBufferAllocate.put((byte) 2);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put((byte) r4);
        }
        if (z2) {
            byteBufferAllocate.put((byte) 3);
            byteBufferAllocate.put((byte) bArrC2.length);
            byteBufferAllocate.put(bArrC2);
        }
        b(deviceInfo, hwDeviceMgrInterface, strD, byteBufferAllocate);
    }

    public static String d(DeviceInfo deviceInfo) {
        if (eey.d(deviceInfo, 57)) {
            Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
            return configuration.locale.getLanguage() + Constants.LINK + configuration.locale.getCountry();
        }
        return CommonUtil.z();
    }

    private static void b(DeviceInfo deviceInfo, HwDeviceMgrInterface hwDeviceMgrInterface, String str, ByteBuffer byteBuffer) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(12);
        deviceCommand.setCommandID(1);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        hwDeviceMgrInterface.sendDeviceData(deviceCommand);
        LogUtil.a("LanguageUtil", "sendCommand2Device language: ", str, " Command:", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
    }
}
