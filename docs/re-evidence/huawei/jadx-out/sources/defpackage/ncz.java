package defpackage;

import android.content.Intent;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public class ncz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Semaphore f42906a = new Semaphore(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ThreadPoolManager f42907c = ThreadPoolManager.b(1, 1, "OtaHandleDeviceRequest");

    public void a(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("OtaHandleDeviceRequest", "handleOtaReceivedData dataInfos is invalid");
            return;
        }
        if (bArr[0] != 9) {
            LogUtil.d("OtaHandleDeviceRequest", "handleOtaReceivedData service id is not 9");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 15) {
            c(deviceInfo, bArr);
            return;
        }
        if (b2 == 16) {
            b(deviceInfo, bArr);
        } else if (b2 != 17) {
            LogUtil.d("OtaHandleDeviceRequest", "handleOtaReceivedData other command");
        } else {
            d(deviceInfo, bArr);
        }
    }

    private void c(final DeviceInfo deviceInfo, final byte[] bArr) {
        mik.b("OtaHandleDeviceRequest", 9, 15);
        this.f42907c.execute(new Runnable() { // from class: ncz.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    LogUtil.a("OtaHandleDeviceRequest", "semaphore, semaphore.availablePermits().", Integer.valueOf(ncz.this.f42906a.availablePermits()));
                    ncz.this.f42906a.acquire();
                    miv.c(30000L, "user-checkFile");
                    miz.d(BaseApplication.getContext());
                    ncu ncuVarC = nda.c(deviceInfo, bArr);
                    if (ncuVarC.e() != 0) {
                        LogUtil.j("OtaHandleDeviceRequest", "parserDeviceRequestCheck isRequestNewVersionCheck is false");
                        miz.d();
                        miv.c("user-checkFile");
                        ncz.this.f42906a.release();
                        return;
                    }
                    Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwUpdateService.class);
                    intent.putExtra("extra_band_imei", deviceInfo.getDeviceIdentify());
                    intent.putExtra("key_device_request_check_new_version", true);
                    intent.putExtra("key_search_type", ncuVarC.b());
                    intent.setAction("action_band_manual_update_new_version");
                    BaseApplication.getContext().startService(intent);
                    Thread.sleep(10000L);
                    miz.d();
                    miv.c("user-checkFile");
                    ncz.this.f42906a.release();
                } catch (eeu | IllegalStateException | InterruptedException | SecurityException e) {
                    LogUtil.e("OtaHandleDeviceRequest", "parserDeviceRequestCheck Exception", ExceptionUtils.c(e));
                }
            }
        });
    }

    private void b(DeviceInfo deviceInfo, byte[] bArr) {
        mik.b("OtaHandleDeviceRequest", 9, 16);
        try {
            int iD = nda.d(deviceInfo, bArr);
            Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwUpdateService.class);
            intent.putExtra("extra_band_imei", deviceInfo.getDeviceIdentify());
            intent.putExtra("key_auto_install_status", iD);
            intent.setAction("action_device_request_download_ota");
            BaseApplication.getContext().startService(intent);
        } catch (eeu | IllegalStateException | SecurityException e) {
            LogUtil.e("OtaHandleDeviceRequest", "deviceRequestDownloadOta Exception", ExceptionUtils.c(e));
        }
    }

    private void d(DeviceInfo deviceInfo, byte[] bArr) {
        mik.b("OtaHandleDeviceRequest", 9, 17);
        try {
            if (!nda.b(deviceInfo, bArr)) {
                LogUtil.j("OtaHandleDeviceRequest", "userConfirmIsDownload user not agree download");
                return;
            }
            Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwUpdateService.class);
            intent.putExtra("extra_band_imei", deviceInfo.getDeviceIdentify());
            intent.putExtra("key_is_user_agree_download", true);
            intent.setAction("action_device_request_download_ota");
            BaseApplication.getContext().startService(intent);
        } catch (eeu | IllegalStateException | SecurityException e) {
            LogUtil.e("OtaHandleDeviceRequest", "userConfirmIsDownload Exception", ExceptionUtils.c(e));
        }
    }
}
