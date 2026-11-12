package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mau implements DataReceiveCallback {

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mau f41295a = new mau();
    }

    private mau() {
    }

    public static mau e() {
        return b.f41295a;
    }

    public void a() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.notify.picture", this);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("HwNotifyPictureService", "onDataReceived enter");
        if (i != 100000) {
            ReleaseLogUtil.a("R_HwNotifyPictureService", "onDataReceived error: ", Integer.valueOf(i));
            return;
        }
        if (deviceInfo == null || eecVar == null) {
            ReleaseLogUtil.a("R_HwNotifyPictureService", "onDataReceived error device or message is empty");
            return;
        }
        String srcPkgName = eecVar.getSrcPkgName();
        String wearPkgName = eecVar.getWearPkgName();
        if (!e(srcPkgName, wearPkgName)) {
            ReleaseLogUtil.e("R_HwNotifyPictureService", "channel onDataReceived pkg error. srcPkgNam: ", srcPkgName, ", wearPkgName:", wearPkgName);
            return;
        }
        LogUtil.a("HwNotifyPictureService", "onDataReceived dispatch sample");
        if (eecVar instanceof eee) {
            e(deviceInfo, (eee) eecVar);
        } else {
            ReleaseLogUtil.e("HwNotifyPictureService", "onDataReceived unsupported sample type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    private void e(DeviceInfo deviceInfo, eee eeeVar) {
        LogUtil.a("HwNotifyPictureService", "handleSampleEvent enter");
        if (!Objects.equals(Long.valueOf(eeeVar.d()), 800100023L)) {
            ReleaseLogUtil.e("R_HwNotifyPictureService", "handleSampleEvent event id not supported:", Long.valueOf(eeeVar.d()));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(eeeVar.c()));
            byte b2 = 0;
            if (!jSONObject.has("type")) {
                ReleaseLogUtil.e("R_HwNotifyPictureService", "handleSampleEvent TYPE is not exists");
                return;
            }
            String string = jSONObject.getString("type");
            int iHashCode = string.hashCode();
            if (iHashCode != -2146986425) {
                if (iHashCode != -2133923419) {
                    if (iHashCode == -579029672 && string.equals("picInfo")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (!string.equals("picRequest")) {
                    b2 = -1;
                }
            } else if (string.equals("picResult")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                e(jSONObject.getString(ContentResource.FILE_NAME));
            } else if (b2 == 1) {
                a(jSONObject.getInt("picWidth"), jSONObject.getInt("picNum"));
            } else {
                if (b2 != 2) {
                    return;
                }
                b(jSONObject.getString(ContentResource.FILE_NAME), jSONObject.getString("result"));
            }
        } catch (JSONException e) {
            ReleaseLogUtil.e("R_HwNotifyPictureService", "handleSampleEvent JSONException:", e.getMessage());
        }
    }

    private void a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            LogUtil.j("HwNotifyPictureService", "dealPicResult result is not success or fileName is null ");
        } else {
            SharedPreferenceManager.d("NOTIFY_PICTURE", "NOTIFY_PICTURE_WIDTH", i);
            SharedPreferenceManager.d("NOTIFY_PICTURE", "NOTIFY_PICTURE_NUMBER", i2);
        }
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || !"success".equals(str2)) {
            LogUtil.j("HwNotifyPictureService", "dealPicResult result is not success or fileName is null ");
            return;
        }
        try {
            String str3 = BaseApplication.b().getFilesDir().getCanonicalPath() + "/7/notifyPic/" + str;
            if (str3 == null) {
                LogUtil.a("HwNotifyPictureService", "dealPicResult fileBinPath is  null");
                return;
            }
            File file = new File(str3);
            if (file.exists()) {
                LogUtil.j("HwNotifyPictureService", "dealPicResult delete picture file: ", file.getName(), ",result is ", Boolean.valueOf(file.delete()));
            } else {
                LogUtil.j("HwNotifyPictureService", "dealPicResult file is not exists");
            }
        } catch (IOException e) {
            LogUtil.e("HwNotifyPictureService", "picRequest IOException: ", ExceptionUtils.c(e));
        }
    }

    private void e(final String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("HwNotifyPictureService", "picRequest fileName is  null");
            return;
        }
        try {
            String str2 = BaseApplication.b().getFilesDir().getCanonicalPath() + "/7/notifyPic/" + str;
            if (str2 == null) {
                LogUtil.a("HwNotifyPictureService", "picRequest fileBinPath is  null");
            } else {
                mar.e().c(str2, new SendCallback() { // from class: mau.1
                    @Override // com.huawei.health.deviceconnect.callback.SendCallback
                    public void onSendResult(int i) {
                        ReleaseLogUtil.d("R_HwNotifyPictureService", "send notifyPicture errorCode: ", Integer.valueOf(i));
                    }

                    @Override // com.huawei.health.deviceconnect.callback.SendCallback
                    public void onSendProgress(long j) {
                        LogUtil.a("HwNotifyPictureService", "transferFileListToDevice onFileTransferState, progress: ", Long.valueOf(j), " fileName: ", str);
                    }

                    @Override // com.huawei.health.deviceconnect.callback.SendCallback
                    public void onFileTransferReport(String str3) {
                        LogUtil.a("HwNotifyPictureService", "transferFileListToDevice response file transferWay: ", str3);
                    }
                });
            }
        } catch (IOException e) {
            LogUtil.e("HwNotifyPictureService", "picRequest IOException: ", ExceptionUtils.c(e));
        }
    }

    private boolean e(String str, String str2) {
        return "hw.watch.notify.picture".equals(str) && "hw.unitedevice.notify.picture".equals(str2);
    }
}
