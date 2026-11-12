package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate;
import com.huawei.ui.homehealth.devicearkui.viewmodel.MonitorViewModel;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class ryg extends DeviceViewDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Consumer<Object> f47846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f47847c;
    private MonitorViewModel d;
    private tmx e;

    public ryg(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = new tmx(getActivity());
        this.d = (MonitorViewModel) new ViewModelProvider(this.activity).get(MonitorViewModel.class);
        Consumer<Object> consumer = new Consumer<Object>() { // from class: ryg.1
            @Override // java.util.function.Consumer
            public void accept(Object obj) {
                ryg.this.e.e(ryg.this.f47847c);
            }
        };
        this.f47846b = consumer;
        this.d.c(consumer);
        return this.e.b(viewGroup, layoutInflater);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate
    public void updateDevice(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceMyWatchDelegate", "updateDevice");
        this.f47847c = deviceInfo;
        this.e.d(deviceInfo);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void setUserVisibleHint(boolean z) {
        if (z) {
            updateDevice(this.f47847c);
        }
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void onDestroy() {
        super.onDestroy();
        this.d.e(this.f47846b);
    }
}
