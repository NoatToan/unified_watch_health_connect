package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mve f42486a;
    private static final Object e = new Object();

    private mve() {
    }

    public static mve a() {
        mve mveVar;
        synchronized (e) {
            if (f42486a == null) {
                f42486a = new mve();
            }
            mveVar = f42486a;
        }
        return mveVar;
    }

    public void d(String str, final IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("Dfx_HwGetFileManager", "enter captureLog");
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.e("Dfx_HwGetFileManager", "captureLog, ", "callback is null");
            return;
        }
        final DeviceInfo deviceInfoB = muy.b(str);
        if (deviceInfoB == null) {
            ReleaseLogUtil.e("Dfx_HwGetFileManager", "captureLog, errCode = ", 150, ", response = ", "no device connected");
            muy.c(iBaseCommonCallback, 150, "no device connected");
        } else if (muy.c(deviceInfoB.getDeviceIdentify())) {
            b(deviceInfoB, 0, iBaseCommonCallback, true);
        } else {
            mnn.a().e(b(deviceInfoB), new ITransferSleepAndDFXFileCallback.Stub() { // from class: mve.4
                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onSuccess(int i, String str2, String str3) {
                    ReleaseLogUtil.d("Dfx_HwGetFileManager", "captureLog successCode:", Integer.valueOf(i));
                    mve.this.d(deviceInfoB, 0, iBaseCommonCallback);
                }

                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Dfx_HwGetFileManager", "captureLog errorCode:", Integer.valueOf(i), ", errorMessage = ", str2);
                    mve.this.d(deviceInfoB, 0, iBaseCommonCallback);
                }

                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onProgress(int i, String str2) {
                    LogUtil.a("HwGetFileManager", "captureLog progress:", Integer.valueOf(i), ", progressDesc", str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, int i, IBaseCommonCallback iBaseCommonCallback) {
        b(deviceInfo, i, iBaseCommonCallback, false);
    }

    private void b(DeviceInfo deviceInfo, int i, IBaseCommonCallback iBaseCommonCallback, boolean z) {
        String strC;
        ReleaseLogUtil.d("Dfx_HwGetFileManager", "callBackResult isSmartDevice:", Boolean.valueOf(z));
        try {
            if (z) {
                strC = muy.a(deviceInfo);
            } else {
                strC = muy.c(deviceInfo);
            }
            LogUtil.a("HwGetFileManager", "callBackResult filePath:", strC);
            if (TextUtils.isEmpty(strC)) {
                ReleaseLogUtil.e("Dfx_HwGetFileManager", "callBackResult there is no log file");
                muy.c(iBaseCommonCallback, 1, "there is no log file");
                return;
            }
            File file = new File(strC);
            if (!file.exists()) {
                ReleaseLogUtil.e("Dfx_HwGetFileManager", "callBackResult !file.exists");
                muy.c(iBaseCommonCallback, 1, "there is no log file");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ContentResource.FILE_NAME, file.getName());
            jSONObject.put("fileSize", file.length());
            ReleaseLogUtil.d("Dfx_HwGetFileManager", "callBackResult success");
            muy.c(iBaseCommonCallback, i, jSONObject.toString());
        } catch (JSONException unused) {
            ReleaseLogUtil.a("Dfx_HwGetFileManager", "callBackResult JSONException");
        }
    }

    public void d(String str, final String str2, final IBaseCommonCallback iBaseCommonCallback) {
        final DeviceInfo deviceInfoB;
        LogUtil.a("HwGetFileManager", "enter uploadLog, fileName:", str2, ", uuid:", str);
        c(muy.e);
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.e("Dfx_HwGetFileManager", "enter uploadLog, ", "callback is null");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.e("Dfx_HwGetFileManager", "fileName is empty");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            deviceInfoB = muy.d(str2);
        } else {
            deviceInfoB = muy.b(str);
        }
        LogUtil.a("HwGetFileManager", "uploadLog deviceInfo:", deviceInfoB == null ? "is null" : deviceInfoB.toString());
        ThreadPoolManager.c().execute(new Runnable() { // from class: mve.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                ReleaseLogUtil.d("Dfx_HwGetFileManager", "isReleaseVersion = ", Boolean.valueOf(CommonUtil.bu()));
                mux.b().b(deviceInfoB, str2, iBaseCommonCallback);
            }
        });
    }

    public void a(String str, IBaseCommonCallback iBaseCommonCallback) {
        File[] fileArrListFiles;
        LogUtil.a("HwGetFileManager", "removeLog");
        if (TextUtils.isEmpty(str) || iBaseCommonCallback == null) {
            LogUtil.a("HwGetFileManager", "can not remove log");
            return;
        }
        File file = new File(muy.e);
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null || file.length() == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().equals(str)) {
                if (!file2.delete()) {
                    break;
                }
                muy.c(iBaseCommonCallback, 0, "delete success");
                return;
            }
        }
        muy.c(iBaseCommonCallback, 1, "delete failed");
    }

    private TransferFileInfo b(DeviceInfo deviceInfo) {
        TransferFileInfo transferFileInfo = new TransferFileInfo();
        transferFileInfo.setIsFromAbout(1);
        transferFileInfo.setIsUploadAppLog(1);
        transferFileInfo.setType(0);
        transferFileInfo.setRecordId(new ArrayList(16));
        transferFileInfo.setLevel(0);
        transferFileInfo.setPriority(1);
        transferFileInfo.setSuspend(0);
        transferFileInfo.setTaskType(2);
        int productType = deviceInfo.getProductType();
        transferFileInfo.setDeviceMac(deviceInfo.getSecurityDeviceId());
        transferFileInfo.setDeviceSn(deviceInfo.getDeviceIdentify());
        transferFileInfo.setDeviceModel(deviceInfo.getDeviceModel());
        transferFileInfo.setDeviceType(productType);
        transferFileInfo.setDeviceVersion(deviceInfo.getSoftVersion());
        transferFileInfo.setUdidFromDevice(deviceInfo.getUdidFromDevice());
        if (CommonUtil.bu()) {
            transferFileInfo.setSelectedFlag(1);
            return transferFileInfo;
        }
        transferFileInfo.setSelectedFlag(0);
        return transferFileInfo;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Dfx_HwGetFileManager", "deleteTenDayFile(), filePath is null");
            return;
        }
        ArrayList<File> arrayListA = mjq.a(str);
        if (arrayListA == null) {
            ReleaseLogUtil.e("Dfx_HwGetFileManager", "deleteTenDayFile(), not have ten days log");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH);
        String str2 = simpleDateFormat.format(new Date());
        LogUtil.d("HwGetFileManager", "deleteTenDayFile, newDate = ", str2);
        String str3 = "";
        for (int i = 0; i < arrayListA.size(); i++) {
            File file = arrayListA.get(i);
            String[] strArrSplit = file.getName().split("_");
            if (strArrSplit.length > 4) {
                str3 = strArrSplit[3];
            } else {
                LogUtil.d("HwGetFileManager", "deleteTenDayFile(), file name contains no date.");
            }
            try {
                long time = (simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str3).getTime()) / 86400000;
                if (time > 10) {
                    ReleaseLogUtil.d("Dfx_HwGetFileManager", "deleteTenDayFile, delete days = ", Long.valueOf(time), " file = ", file.getName());
                    LogUtil.d("HwGetFileManager", "deleteTenDayFile isDelete: ", Boolean.valueOf(file.delete()));
                }
            } catch (ParseException e2) {
                LogUtil.e("HwGetFileManager", "PackageManager.ParseException is:" + e2.getMessage());
            }
        }
    }
}
