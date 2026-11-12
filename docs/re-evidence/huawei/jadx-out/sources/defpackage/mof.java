package defpackage;

import android.os.Environment;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LogAnonymous;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mof {
    public boolean c() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", "GpsFileUtil");
        DeviceCapability value = null;
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        return value != null && value.isSupportGpsPostProcessing();
    }

    public void e(byte[] bArr, String str) {
        if (bArr == null || TextUtils.isEmpty(str)) {
            LogUtil.j("GpsFileUtil", "saveFile dataInfos is null or name isEmpty");
            return;
        }
        String str2 = LogConfig.o() + "/tracktest";
        File file = new File(str2);
        if (!file.exists()) {
            LogUtil.a(a.t, 0, "GpsFileUtil", "mkdir result :", Boolean.valueOf(file.mkdirs()));
        }
        byte[] bArrE = e(bArr, 32);
        File file2 = new File(str2 + "/" + str);
        int i = str.contains("_gps.bin") ? 17 : 18;
        try {
            if (file2.exists()) {
                LogUtil.a(a.t, 0, "GpsFileUtil", "saveFile delete result :", Boolean.valueOf(file2.delete()));
            }
            if (!file2.exists()) {
                LogUtil.a(a.t, 0, "GpsFileUtil", "saveFile createNewFile :", Boolean.valueOf(file2.createNewFile()));
            }
            mrq.b(file2, i);
            if (bArrE != null) {
                a(file2, bArrE);
            }
        } catch (Exception e) {
            LogUtil.e("GpsFileUtil", "saveFile error :", ExceptionUtils.c(e));
        }
    }

    public void a() {
        LogUtil.a("GpsFileUtil", "getOldFilePath()");
        if (!CommonUtil.at() && ((CompileParameterUtil.d("IS_DEBUG_VERSION") || (CommonUtil.ap() && e())) && (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && !PermissionUtil.a() && PermissionUtil.e(BaseApplication.getContext(), PermissionUtil.PermissionType.STORAGE) == PermissionUtil.PermissionResult.GRANTED))) {
            File file = new File(Environment.getExternalStorageDirectory().getPath() + "/tracktest");
            if (file.exists()) {
                a(file);
            }
        }
        File file2 = new File(LogConfig.o() + "/tracktest");
        if (file2.exists()) {
            a(file2);
        }
    }

    private void a(File file) {
        boolean zDelete;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 20) {
            LogUtil.j("GpsFileUtil", "deleteOldFile files is null or less than 20 files.");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
                zDelete = file2.delete();
            } else {
                zDelete = file2.delete();
            }
            LogUtil.d("GpsFileUtil", "deleteOldFile:", Boolean.valueOf(zDelete));
        }
    }

    private void a(File file, byte[] bArr) {
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
            fileOutputStreamOpenOutputStream.write(bArr);
            fileOutputStreamOpenOutputStream.flush();
        } catch (IOException e) {
            LogUtil.e("GpsFileUtil", "createFile error :", LogAnonymous.b(e));
        } finally {
            if (fileOutputStreamOpenOutputStream != null) {
                try {
                    fileOutputStreamOpenOutputStream.close();
                } catch (IOException unused) {
                    LogUtil.e("GpsFileUtil", "createFile close error");
                }
            }
        }
    }

    private byte[] e(byte[] bArr, int i) {
        if (bArr == null || bArr.length < i) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - i];
        for (int i2 = i; i2 < bArr.length; i2++) {
            bArr2[i2 - i] = bArr[i2];
        }
        return bArr2;
    }

    public ArrayList<Long> d(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length < 33) {
            return null;
        }
        byte b2 = bArr[32];
        LogUtil.a(a.t, 0, "GpsFileUtil", "getTrackData dataFlag is :", Integer.valueOf(b2));
        if (b2 == 0) {
            i = 15;
        } else if (b2 == 1 || b2 == 2) {
            i = 17;
        } else {
            if (b2 == 3) {
                LogUtil.a(a.t, 0, "GpsFileUtil", "getTrackData dataFlag is 3 :", Integer.valueOf(b2));
            } else {
                LogUtil.j("GpsFileUtil", "getTrackData dataFlag is not support :", Integer.valueOf(b2));
            }
            i = 19;
        }
        int i2 = i * 2;
        int i3 = i2 + 32;
        if (bArr.length >= 55 && bArr[54] == 3 && b2 == 0) {
            i3 = i2 + 69;
        }
        byte[] bArrE = e(bArr, i3);
        if (bArrE == null) {
            return null;
        }
        byte b3 = bArr[33];
        String strE = eeq.e(new byte[]{bArr[36], bArr[35], bArr[34], b3});
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        long jX = CommonUtil.x(strE);
        LogUtil.a(a.t, 0, "GpsFileUtil", "startTime :", Long.valueOf(jX));
        String strE2 = eeq.e(bArrE);
        if (TextUtils.isEmpty(strE2)) {
            return null;
        }
        return a(i, jX, strE2);
    }

    private ArrayList<Long> a(int i, long j, String str) {
        int i2 = i * 2;
        int length = str.length() / i2;
        ArrayList<Long> arrayList = new ArrayList<>(length);
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * i2;
            StringBuilder sb = new StringBuilder();
            int i5 = i4 + 2;
            sb.append(str.substring(i5, i4 + 4));
            sb.append(str.substring(i4, i5));
            j += (long) CommonUtil.v(sb.toString());
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    private boolean e() {
        try {
            HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("gps_files_switch_screen");
            if (userPreference == null) {
                LogUtil.a("GpsFileUtil", "isSupportGpsFile preference is null");
                return d(HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.wear_common_setting"));
            }
            return "1".equals(userPreference.getValue());
        } catch (Exception unused) {
            LogUtil.e("GpsFileUtil", "isSupportGpsFile Exception");
            return false;
        }
    }

    private boolean d(HiUserPreference hiUserPreference) {
        String value;
        if (hiUserPreference == null || (value = hiUserPreference.getValue()) == null) {
            return false;
        }
        String strSubstring = value.substring(1, value.length() - 1);
        for (String str : strSubstring.split(",")) {
            if ("gps_files_switch_screen".equals(str.split("=")[0].trim())) {
                strSubstring = str.split("=")[1];
            }
        }
        LogUtil.a(a.t, 0, "GpsFileUtil", "GPS file enabled :", strSubstring);
        return "1".equals(strSubstring);
    }
}
