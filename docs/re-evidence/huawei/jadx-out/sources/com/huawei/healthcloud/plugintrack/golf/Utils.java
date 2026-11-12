package com.huawei.healthcloud.plugintrack.golf;

import android.content.Context;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GetGolfCourseMapDataReq;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import com.huawei.healthcloud.plugintrack.golf.device.GolfMsgHeader;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.chf;
import defpackage.ecu;
import defpackage.eey;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    public static boolean writeFileData(Context context, String str, String str2, byte[]... bArr) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = context.openFileOutput(str2, 0);
            for (byte[] bArr2 : bArr) {
                fileOutputStreamOpenFileOutput.write(bArr2);
            }
            if (fileOutputStreamOpenFileOutput == null) {
                return true;
            }
            try {
                return true;
            } catch (IOException unused) {
                return true;
            }
        } catch (FileNotFoundException unused2) {
            LogUtil.e(str, "writefile finally failed FileNotFound");
            return false;
        } finally {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused3) {
                    LogUtil.e(str, "writefile finally failed IOException");
                }
            }
        }
    }

    public static String getFilePath(Context context, String str) {
        return context.getFilesDir() + File.separator + str;
    }

    public static boolean checkDevSendMsgRcverParams(String str, GolfMsgHeader golfMsgHeader, byte[] bArr) {
        if (golfMsgHeader == null) {
            LogUtil.j(str, "onDataReceived msg head is null, pls check.");
            return false;
        }
        if (bArr != null && bArr.length >= 4) {
            return true;
        }
        LogUtil.j(str, "onDataReceived dataContents length error");
        return false;
    }

    public static byte[] int2Bytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static String getLanguage() {
        return chf.a();
    }

    public static int getGolfResultCode() {
        int i = GolfDeviceProxy.getInstance().isSupportGolf() ? 0 : 2;
        if (GolfDeviceProxy.getInstance().isSupportGolfV2()) {
            i = 3;
        }
        if (GolfDeviceProxy.getInstance().isSupportGolfV3()) {
            return 4;
        }
        return i;
    }

    public static String getGolfMapDeviceLevel(String str) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, str);
        if (deviceInfo == null) {
            LogUtil.j(str, "getGolfMapDeviceLevel deviceInfo == null");
            return GetGolfCourseMapDataReq.MapLevel.BASIC_LEVEL;
        }
        boolean zD = eey.d(deviceInfo, 253);
        ReleaseLogUtil.d(str, "getGolfMapDeviceLevel isSupportGolfVectorMap:", Boolean.valueOf(zD));
        if (zD) {
            return GetGolfCourseMapDataReq.MapLevel.VECTOR_LEVEL + "," + GetGolfCourseMapDataReq.MapLevel.BASIC_LEVEL;
        }
        boolean zD2 = eey.d(deviceInfo, FitnessSportType.HW_FITNESS_SPORT_ALL);
        ReleaseLogUtil.d(str, "getGolfMapDeviceLevel isSupportGolfAdvancedMap:", Boolean.valueOf(zD2));
        if (zD2) {
            return GetGolfCourseMapDataReq.MapLevel.ADVANCED_LEVEL;
        }
        return GetGolfCourseMapDataReq.MapLevel.BASIC_LEVEL;
    }
}
