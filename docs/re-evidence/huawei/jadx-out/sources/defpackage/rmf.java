package defpackage;

import android.os.Handler;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.CardDeviceFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes17.dex */
public class rmf implements WearPlaceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<CardDeviceFragment> f47486a;

    public rmf(CardDeviceFragment cardDeviceFragment) {
        this.f47486a = new WeakReference<>(cardDeviceFragment);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback
    public void onResponse(DeviceInfo deviceInfo, int i) {
        CardDeviceFragment cardDeviceFragment = this.f47486a.get();
        if (deviceInfo == null) {
            LogUtil.j("CardDeviceFragmentPlaceCallback", "WearHomePlaceCallback enter deviceInfo is null");
            return;
        }
        Handler handler = cardDeviceFragment.y;
        if (handler == null) {
            LogUtil.j("CardDeviceFragmentPlaceCallback", "WearHomePlaceCallback enter handler is null");
        } else {
            handler.sendEmptyMessage(34);
        }
    }
}
