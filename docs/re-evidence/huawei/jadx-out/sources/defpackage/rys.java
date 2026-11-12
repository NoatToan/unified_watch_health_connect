package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate;
import com.huawei.ui.homehealth.devicearkui.viewmodel.MonitorViewModel;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class rys extends DeviceViewDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MonitorViewModel f47868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tod f47869c;
    private Consumer<Object> d;
    private DeviceInfo e;

    public rys(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LogUtil.a("DeviceWatchFaceDelegate", "onCreateView");
        this.f47869c = new tod(getActivity());
        this.f47868b = (MonitorViewModel) new ViewModelProvider(this.activity).get(MonitorViewModel.class);
        Consumer<Object> consumer = new Consumer<Object>() { // from class: rys.3
            @Override // java.util.function.Consumer
            public void accept(Object obj) {
                rys.this.f47869c.a(rys.this.e);
            }
        };
        this.d = consumer;
        this.f47868b.c(consumer);
        return this.f47869c.b(viewGroup, layoutInflater);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void setUserVisibleHint(boolean z) {
        if (z) {
            updateDevice(this.e);
        }
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate
    public void updateDevice(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityE;
        LogUtil.a("DeviceWatchFaceDelegate", "updateDevice");
        this.e = deviceInfo;
        if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2 && (deviceCapabilityE = lut.a().e(deviceInfo.getDeviceIdentify())) != null) {
            if (deviceCapabilityE.isSupportWatchFace()) {
                tqp.c(deviceInfo.getProductType(), deviceInfo.getDeviceIdentify(), true);
            } else {
                tqp.a(deviceInfo.getProductType(), deviceInfo.getDeviceIdentify());
            }
        }
        this.f47869c.b(deviceInfo);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void onDestroy() {
        super.onDestroy();
        tod todVar = this.f47869c;
        if (todVar != null) {
            todVar.onDestroy();
        }
        this.f47868b.e(this.d);
    }
}
