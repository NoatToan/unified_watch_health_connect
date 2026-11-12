package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.ResultCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mok {
    private static String b() {
        try {
            File filesDir = BaseApplication.getContext().getFilesDir();
            if (filesDir != null) {
                return filesDir.getCanonicalPath();
            }
            return "";
        } catch (IOException unused) {
            LogUtil.e("HttpProxyFileTransferHelper", "getSourcePath catch IOException");
            return "";
        }
    }

    private static SecureRandom a() {
        try {
            return SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            health.compact.a.LogUtil.d("HttpProxyFileTransferHelper", "getRandom exception : ", cpc.c(e));
            return null;
        }
    }

    private static String c() {
        SecureRandom secureRandomA = a();
        if (secureRandomA != null) {
            int[] iArr = new int[6];
            StringBuilder sb = new StringBuilder(6);
            for (int i = 0; i < 6; i++) {
                int iNextInt = secureRandomA.nextInt(10);
                iArr[i] = iNextInt;
                sb.append(iNextInt);
            }
            return sb.toString();
        }
        return "";
    }

    private static FileOutputStream b(String str) throws IOException, IllegalArgumentException {
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            LogUtil.a("HttpProxyFileTransferHelper", "writeToFile: file delete failed.");
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            LogUtil.a("HttpProxyFileTransferHelper", "writeToFile: failed to create file's parent.");
        }
        return FileUtils.openOutputStream(file);
    }

    private static boolean a(String str, byte[] bArr) {
        if (bArr != null) {
            try {
                FileOutputStream fileOutputStreamB = b(str);
                fileOutputStreamB.write(bArr);
                fileOutputStreamB.flush();
                return true;
            } catch (IOException unused) {
                LogUtil.a("HttpProxyFileTransferHelper", "writeHttpProxyFiles IOException");
            } catch (IllegalArgumentException unused2) {
                LogUtil.e("HttpProxyFileTransferHelper", "IllegalArgumentException: failed to write the file.");
                return false;
            }
        }
        return false;
    }

    public static void e(long j, byte[] bArr, ResultCallback resultCallback) {
        String strC = c();
        if (StringUtils.g(strC)) {
            LogUtil.j("HttpProxyFileTransferHelper", "JSONException occurs when generating random number");
            resultCallback.onResult("create cloud response file failed");
            return;
        }
        String str = "httpProxy_" + j + "_" + strC + WatchFaceConstant.BIN_SUFFIX;
        if (!a(b() + File.separator + 7 + File.separator + str, bArr)) {
            LogUtil.j("HttpProxyFileTransferHelper", "Failed to write cloud response to file");
            resultCallback.onResult("create cloud response file failed");
        } else {
            resultCallback.onResult(str);
        }
    }

    public static void e(String str, DeviceInfo deviceInfo, final ResultCallback resultCallback, String str2) {
        mhp mhpVar = new mhp();
        mhpVar.a(str);
        mhpVar.c(10);
        mhpVar.j(str2);
        mhpVar.e(true);
        mhpVar.f("hw.unitedevice.httpProxy");
        mhpVar.i("UniteDeviceManagement");
        mhpVar.c(str2);
        mhpVar.e(OfflineMapWearEngineManager.WEAR_FINGERPRINT);
        mhpVar.b(str);
        mhpVar.d(deviceInfo.getDeviceIdentify());
        mrj.e().a(mhpVar, new ITransferSleepAndDFXFileCallback.Stub() { // from class: mok.5
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str3, String str4) {
                ReleaseLogUtil.c("R_HttpProxyFileTransferHelper", "Get body file from device succeed");
                try {
                    String str5 = new String(Files.readAllBytes(Paths.get(str3, new String[0])));
                    LogUtil.a("HttpProxyFileTransferHelper", "Receive body content from device: ", str5);
                    resultCallback.onResult(str5);
                } catch (IOException unused) {
                    LogUtil.e("HttpProxyFileTransferHelper", "failed to read body content from body file");
                    resultCallback.onResult("file transfer failed");
                }
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str3) {
                ReleaseLogUtil.b("R_HttpProxyFileTransferHelper", "Obtain body file through 5.44 failed, errorCode: ", Integer.valueOf(i), ", errorMessage: ", str3);
                resultCallback.onResult("file transfer failed");
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str3) {
                LogUtil.a("HttpProxyFileTransferHelper", "mStateCallback, onProgress progress is ", Integer.valueOf(i));
            }
        });
    }
}
