package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.arkuidevice.DeviceBridgeApi;
import com.huawei.callback.BindPhoneServiceCallback;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.R;
import com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = DeviceBridgeApi.class)
@Singleton
public class raj implements DeviceBridgeApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Boolean> f47049a = new ConcurrentHashMap<>();
    private final String d = "Resource_";

    @Override // com.huawei.arkuidevice.DeviceBridgeApi
    public void startDiscoveringByNative(ScanMode scanMode, List<cmy> list, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceBridgeImpl", "startDiscoveringByNative");
        d(scanMode, list, iBaseResponseCallback);
    }

    private void d(final ScanMode scanMode, final List<cmy> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceBridgeImpl", "scanDevice");
        SimpleChain.b("scanDevice").e(new SimpleChain.INext() { // from class: ral
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                raj.e(emitter, objArr);
            }
        }).d(new SimpleChain.Emitter() { // from class: rai
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                this.d.c(scanMode, list, iBaseResponseCallback, objArr);
            }
        }, new Object[0]);
    }

    static /* synthetic */ void e(SimpleChain.Emitter emitter, Object[] objArr) {
        Activity activity = BaseApplication.getActivity();
        final Boolean bool = Boolean.TRUE;
        Objects.requireNonNull(bool);
        BluetoothEnableUtils.d(emitter, activity, new BluetoothEnableUtils.IsSupportLocation() { // from class: rap
            @Override // com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils.IsSupportLocation
            public final boolean get() {
                return bool.booleanValue();
            }
        });
    }

    /* synthetic */ void c(ScanMode scanMode, List list, final IBaseResponseCallback iBaseResponseCallback, Object[] objArr) {
        ray.b(scanMode, list, new IBaseResponseCallback() { // from class: raj.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                iBaseResponseCallback.a(0, obj);
            }
        });
    }

    @Override // com.huawei.arkuidevice.DeviceBridgeApi
    /* JADX INFO: renamed from: getDeviceInfo, reason: merged with bridge method [inline-methods] */
    public void b(final BaseResponseCallback<DeviceInfo> baseResponseCallback) {
        lsy.a(new Runnable() { // from class: rao
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(baseResponseCallback);
            }
        });
    }

    /* synthetic */ void c(final BaseResponseCallback baseResponseCallback) {
        if (lug.c() == null) {
            c(new BindPhoneServiceCallback() { // from class: raq
                @Override // com.huawei.callback.BindPhoneServiceCallback
                public final void onBind() {
                    this.f47059b.b(baseResponseCallback);
                }
            });
        } else {
            baseResponseCallback.onResponse(0, dxx.d().e());
        }
    }

    public void c(final BindPhoneServiceCallback bindPhoneServiceCallback) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        lug.e(BaseApplication.getContext());
        lug.e(new BindPhoneServiceCallback() { // from class: raj.4
            @Override // com.huawei.callback.BindPhoneServiceCallback
            public void onBind() {
                ReleaseLogUtil.e("R_DeviceBridgeImpl", "getWearInfoList bindPhoneService delay: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                lug.d(this);
                bindPhoneServiceCallback.onBind();
            }
        });
    }

    @Override // com.huawei.arkuidevice.DeviceBridgeApi
    public Bitmap getWearDeviceBitmap(DeviceInfo deviceInfo) {
        String strD = d(deviceInfo);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("DeviceBridgeImpl", "getWearDeviceImgPath imagePath isEmpty");
            return null;
        }
        if (strD.startsWith("Resource_")) {
            return BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), CommonUtils.j(strD.substring(9)));
        }
        return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(strD);
    }

    private String d(DeviceInfo deviceInfo) {
        String strE;
        int productType = deviceInfo.getProductType();
        LogUtil.a("DeviceBridgeImpl", "getWearDeviceImgPath device name:", deviceInfo.getDeviceName(), " deviceType:", Integer.valueOf(productType));
        if (!lvi.n(productType)) {
            return e(deviceInfo);
        }
        String strJ = lvi.j(productType);
        if (!((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ)) {
            ReleaseLogUtil.d("R_DeviceBridgeImpl", "getWearDeviceImgPath download isPluginAvailable name:", deviceInfo.getDeviceName());
            return e(deviceInfo);
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
            if (deviceInfo instanceof CloudDeviceInfo) {
                strE = eep.c(pluginInfoByUuid, 1, deviceInfo);
            } else {
                strE = eep.e(pluginInfoByUuid, 2, deviceInfo);
            }
            String str = pig.c().e(pluginInfoByUuid.c()) + File.separator + pluginInfoByUuid.c() + File.separator + "img" + File.separator + strE + ".png";
            LogUtil.a("DeviceBridgeImpl", "getWearDeviceImgPath name:", deviceInfo.getDeviceName(), " imagePath:", str);
            if (new File(str).exists()) {
                return str;
            }
        }
        LogUtil.a("DeviceBridgeImpl", "getWearDeviceImgPath descriptionInfo is null device name:", deviceInfo.getDeviceName());
        return e(deviceInfo);
    }

    private String e(DeviceInfo deviceInfo) {
        return "Resource_" + a(deviceInfo);
    }

    private static int a(DeviceInfo deviceInfo) {
        if (!TextUtils.isEmpty(deviceInfo.getDeviceName()) && deviceInfo.getDeviceName().contains("HUAWEI CM-R1P")) {
            return R.mipmap.id_devicemanager_r1_pro;
        }
        if ("PORSCHE DESIGN".equals(deviceInfo.getDeviceName())) {
            return R.mipmap.img_porsche_design_pic1;
        }
        int iB = dxx.b(deviceInfo.getProductType());
        if (iB != 0) {
            LogUtil.a("DeviceBridgeImpl", "getDefaultWearDeviceImg device name:", deviceInfo.getDeviceName(), " deviceImg:", Integer.valueOf(iB));
            return iB;
        }
        if (lvi.f(deviceInfo.getProductType())) {
            return R.mipmap.device_icon_band_default;
        }
        return R.mipmap.device_icon_watch_default;
    }
}
