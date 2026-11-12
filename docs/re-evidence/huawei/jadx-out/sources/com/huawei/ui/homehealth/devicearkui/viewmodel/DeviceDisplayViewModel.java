package com.huawei.ui.homehealth.devicearkui.viewmodel;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.callback.DeviceBatterStateListener;
import com.huawei.callback.DeviceConnectStateListener;
import com.huawei.callback.DeviceExtraStateListener;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.ui.homehealth.device.DeviceOperateManager;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceDisplayViewModel;
import com.huawei.ui.homehealth.operation.ResourceCallback;
import com.huawei.ui.homehealth.operation.deviceempty.bean.EmptyDeviceResource;
import defpackage.edl;
import defpackage.eep;
import defpackage.lss;
import defpackage.lut;
import defpackage.lvi;
import defpackage.mgp;
import defpackage.mig;
import defpackage.pig;
import defpackage.srw;
import defpackage.tfn;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.io.File;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceDisplayViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeviceBatterStateListener f25383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceConnectStateListener f25384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceConnectState f25385c;
    private IDeviceBatterState d;
    private DeviceInfo e;
    private srw f;
    private DeviceImageObtain g;
    private DeviceOperateManager.ConnectCallback h;
    private final DeviceExtraStateListener i;
    private MutableLiveData<EmptyDeviceResource> j;

    public interface DeviceConnectState {
        void onDeviceConnectChange(DeviceInfo deviceInfo, int i);
    }

    public interface DeviceImageObtain {
        void setDeviceImage(Bitmap bitmap);
    }

    public interface IDeviceBatterState {
        void onDeviceBatteryChange(DeviceInfo deviceInfo, mgp mgpVar);
    }

    public /* synthetic */ void a(DeviceInfo deviceInfo, int i) {
        this.f25385c.onDeviceConnectChange(deviceInfo, 0);
    }

    public /* synthetic */ void b(DeviceInfo deviceInfo, int i) {
        this.f25385c.onDeviceConnectChange(deviceInfo, i);
    }

    public /* synthetic */ void d(DeviceInfo deviceInfo, mgp mgpVar) {
        this.d.onDeviceBatteryChange(deviceInfo, mgpVar);
    }

    public DeviceDisplayViewModel() {
        DeviceConnectStateListener deviceConnectStateListener = new DeviceConnectStateListener() { // from class: sfn
            @Override // com.huawei.callback.DeviceConnectStateListener
            public final void onDeviceConnectChange(DeviceInfo deviceInfo, int i) {
                this.d.a(deviceInfo, i);
            }
        };
        this.f25384b = deviceConnectStateListener;
        DeviceExtraStateListener deviceExtraStateListener = new DeviceExtraStateListener() { // from class: sfo
            @Override // com.huawei.callback.DeviceExtraStateListener
            public final void onDeviceExtraChange(DeviceInfo deviceInfo, int i) {
                this.f48006a.b(deviceInfo, i);
            }
        };
        this.i = deviceExtraStateListener;
        DeviceBatterStateListener deviceBatterStateListener = new DeviceBatterStateListener() { // from class: sfq
            @Override // com.huawei.callback.DeviceBatterStateListener
            public final void onDeviceBatteryChange(DeviceInfo deviceInfo, mgp mgpVar) {
                this.f48008c.d(deviceInfo, mgpVar);
            }
        };
        this.f25383a = deviceBatterStateListener;
        lut.a().d(deviceConnectStateListener);
        lut.a().b(deviceExtraStateListener);
        lut.a().e(deviceBatterStateListener);
    }

    public void d() {
        this.j = new MutableLiveData<>();
    }

    public void a(DeviceConnectState deviceConnectState) {
        this.f25385c = deviceConnectState;
    }

    public void a(IDeviceBatterState iDeviceBatterState) {
        this.d = iDeviceBatterState;
    }

    public void b(DeviceInfo deviceInfo) {
        this.e = deviceInfo;
        if (deviceInfo == null) {
            ReleaseLogUtil.d("R_DeviceDisplayViewModel", "updateDevice, deviceInfo is null");
        }
    }

    public void a() {
        DeviceInfo deviceInfo = this.e;
        Objects.isNull(deviceInfo);
        if (deviceInfo == null) {
            ReleaseLogUtil.d("R_DeviceDisplayViewModel", "getDeviceBattery currentDeviceInfo is null");
            return;
        }
        String deviceIdentify = this.e.getDeviceIdentify();
        ReleaseLogUtil.c("R_DeviceDisplayViewModel", "getDeviceBattery deviceId: ", CommonUtil.n(deviceIdentify), " deviceName: ", this.e.getDeviceName());
        if (TextUtils.isEmpty(deviceIdentify)) {
            tfn.a().h();
        } else {
            tfn.a().d(deviceIdentify);
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceDisplayViewModel$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ DeviceInfo d;

        AnonymousClass1(DeviceInfo deviceInfo) {
            this.d = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReleaseLogUtil.c("R_DeviceDisplayViewModel", "setSupportDownloadImage subThread");
            String strJ = lvi.j(this.d.getProductType());
            if (TextUtils.isEmpty(strJ)) {
                strJ = lvi.d(this.d.getProductType());
            }
            edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
            if (!TextUtils.isEmpty(strJ) && pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
                LogUtil.b("DeviceDisplayViewModel", "is plugin download uuid:", strJ);
                boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ);
                LogUtil.b("DeviceDisplayViewModel", "is plugin download isPluginAvailable:", Boolean.valueOf(zIsResourcesAvailable));
                if (zIsResourcesAvailable) {
                    b(this.d, pluginInfoByUuid);
                    return;
                }
            }
            a(this.d);
        }

        private void b(DeviceInfo deviceInfo, edl edlVar) {
            String strE;
            if (deviceInfo instanceof CloudDeviceInfo) {
                strE = eep.c(edlVar, 1, deviceInfo);
            } else {
                strE = eep.e(edlVar, 2, deviceInfo);
            }
            LogUtil.b("DeviceDisplayViewModel", "HomeImgNew name:", strE);
            String str = pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + strE + ".png";
            if (new File(str).exists()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inInputShareable = true;
                LogUtil.b("DeviceDisplayViewModel", "enter loadImageForWear have bitmap imagePath:", str, " fetchPluginUuid:", edlVar.c());
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                if (bitmapDecodeFile != null) {
                    b(deviceInfo, bitmapDecodeFile);
                    return;
                }
            }
            a(deviceInfo);
        }

        private void a(DeviceInfo deviceInfo) {
            b(deviceInfo, BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), tfn.a().a(deviceInfo.getProductType())));
        }

        private void b(final DeviceInfo deviceInfo, final Bitmap bitmap) {
            lss.a(DeviceDisplayViewModel.this.g, new Consumer() { // from class: sfm
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.e.d(deviceInfo, bitmap, (DeviceDisplayViewModel.DeviceImageObtain) obj);
                }
            });
        }

        public /* synthetic */ void d(DeviceInfo deviceInfo, Bitmap bitmap, DeviceImageObtain deviceImageObtain) {
            if (mig.d(DeviceDisplayViewModel.this.e, deviceInfo)) {
                deviceImageObtain.setDeviceImage(bitmap);
            }
        }
    }

    public /* synthetic */ void a(DeviceInfo deviceInfo) {
        ThreadPoolManager.c().execute(new AnonymousClass1(deviceInfo));
    }

    public void e() {
        lss.a(this.e, new Consumer() { // from class: sfp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f48007c.a((DeviceInfo) obj);
            }
        });
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        lut.a().b(this.f25384b);
        lut.a().b(this.f25383a);
        lut.a().c(this.i);
        DeviceOperateManager.d().e(this.h);
    }

    public void a(DeviceInfo deviceInfo, DeviceOperateManager.ConnectCallback connectCallback) {
        this.h = connectCallback;
        DeviceOperateManager.d().a(deviceInfo, connectCallback);
    }

    public void g() {
        if (this.f == null) {
            this.f = new srw();
        }
        this.f.requestResource(new ResourceCallback() { // from class: sfi
            @Override // com.huawei.ui.homehealth.operation.ResourceCallback
            public final void obtainResource(sru sruVar) {
                this.d.e((EmptyDeviceResource) sruVar);
            }
        });
    }

    public MutableLiveData<EmptyDeviceResource> b() {
        return this.j;
    }

    public void c() {
        this.f.cancel();
    }

    public void e(EmptyDeviceResource emptyDeviceResource) {
        this.j.postValue(emptyDeviceResource);
    }

    public void b(DeviceImageObtain deviceImageObtain) {
        this.g = deviceImageObtain;
    }
}
