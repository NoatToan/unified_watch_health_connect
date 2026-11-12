package defpackage;

import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.SimInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nqf {
    public static void a(String str, int i) {
        String str2;
        LogUtil.a("MultiSimSendCommandUtil", "the acCode ", str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(29);
        deviceCommand.setCommandID(1);
        if (str != null) {
            String strA = eeq.a(str);
            int length = strA.length() / 2;
            if (length <= 127) {
                str2 = eeq.d(1) + eeq.d(length) + strA;
            } else {
                str2 = eeq.d(1) + eeq.d((length / 127) + 128) + eeq.d(length % 127) + strA;
            }
            String str3 = str2 + eeq.d(2) + eeq.d(2) + eeq.e(i);
            deviceCommand.setDataLen(eeq.c(str3).length);
            deviceCommand.setDataContent(eeq.c(str3));
            LogUtil.a("MultiSimSendCommandUtil", "sendOpenEsimCommand ", str3);
            lvb.e().c(deviceCommand);
            return;
        }
        LogUtil.j("MultiSimSendCommandUtil", "acCode == null");
    }

    public static void c(String str, int i) {
        String str2;
        LogUtil.a("MultiSimSendCommandUtil", "the conformcode ", str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(29);
        deviceCommand.setCommandID(3);
        if (str != null) {
            String strA = eeq.a(str);
            int length = strA.length() / 2;
            if (length <= 127) {
                str2 = eeq.d(1) + eeq.d(length) + strA;
            } else {
                str2 = eeq.d(1) + eeq.d((length / 127) + 128) + eeq.d(length % 127) + strA;
            }
        } else {
            str2 = null;
        }
        String strC = eeq.c(i);
        String str3 = eeq.d(2) + eeq.d(strC.length() / 2) + strC;
        if (str2 != null) {
            str3 = str2 + str3;
        }
        deviceCommand.setDataLen(eeq.c(str3).length);
        deviceCommand.setDataContent(eeq.c(str3));
        LogUtil.a("MultiSimSendCommandUtil", "sendConformCode ", str3);
        lvb.e().c(deviceCommand);
    }

    public static void e(int i, boolean z) {
        String str;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(29);
        deviceCommand.setCommandID(i);
        if (z) {
            String strC = eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
            str = eeq.d(127) + eeq.d(strC.length() / 2) + strC;
        } else {
            String strC2 = eeq.c(100001L);
            str = eeq.d(127) + eeq.d(strC2.length() / 2) + strC2;
        }
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setDataContent(eeq.c(str));
        LogUtil.a("MultiSimSendCommandUtil", "sendReslut ", str);
        lvb.e().c(deviceCommand);
    }

    public static void e() {
        LogUtil.a("MultiSimSendCommandUtil", "sendSimInfoQuery enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(29);
        deviceCommand.setCommandID(6);
        byte[] bArrC = eeq.c(eeq.d(1) + "00");
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setNeedAck(true);
        lvb.e().c(deviceCommand);
    }

    public static void d() {
        LogUtil.a("MultiSimSendCommandUtil", "sendBatteryThresholdQuery enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(29);
        deviceCommand.setCommandID(10);
        lvb.e().c(deviceCommand);
    }

    private static byte[] b(int i, String str) {
        String str2 = "" + eeq.d(1) + eeq.d(1) + eeq.d(i);
        if (i != 0 && !TextUtils.isEmpty(str)) {
            str2 = str2 + eeq.d(2) + eeq.d(str.length()) + eeq.a(str);
        }
        return eeq.c(str2);
    }

    public static void d(int i, String str) {
        LogUtil.a("MultiSimSendCommandUtil", "sendMultiSimStatus enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(29);
        deviceCommand.setCommandID(7);
        byte[] bArrB = b(i, str);
        deviceCommand.setDataLen(bArrB.length);
        deviceCommand.setDataContent(bArrB);
        lvb.e().c(deviceCommand);
    }

    private static byte[] c(List<SimInfo> list) {
        StringBuffer stringBuffer = new StringBuffer(16);
        for (SimInfo simInfo : list) {
            String str = ((eeq.d(3) + eeq.d(simInfo.getIMSI().length()) + eeq.a(simInfo.getIMSI())) + eeq.d(4) + eeq.d(simInfo.getICCID().length()) + eeq.a(simInfo.getICCID())) + eeq.d(5) + eeq.d(1) + eeq.d(simInfo.isActive() ? 1 : 0);
            stringBuffer.append(eeq.d(130) + eeq.b(str.length() / 2) + str);
        }
        String string = stringBuffer.toString();
        return eeq.c(eeq.d(129) + eeq.b(string.length() / 2) + string);
    }

    public static void d(List<SimInfo> list) {
        LogUtil.a("MultiSimSendCommandUtil", "sendEsimProfileRemoveReq enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(29);
        deviceCommand.setCommandID(8);
        byte[] bArrC = c(list);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        lvb.e().c(deviceCommand);
    }

    public static void d(int i, int i2) {
        LogUtil.a("MultiSimSendCommandUtil", "sendEsimProfileRemoveReq enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(29);
        deviceCommand.setCommandID(i);
        byte[] bArrC = eeq.c(eeq.d(127) + eeq.d(4) + eeq.c(i2));
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        lvb.e().c(deviceCommand);
    }
}
