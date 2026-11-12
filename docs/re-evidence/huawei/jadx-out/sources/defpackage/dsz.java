package defpackage;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.device.ui.util.DeviceManagerInfoHandler;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dsz extends BaseHandler<HagridDeviceManagerFragment> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f32341b;
    private HagridDeviceManagerFragment d;

    public dsz(HagridDeviceManagerFragment hagridDeviceManagerFragment, Activity activity) {
        super(Looper.getMainLooper(), hagridDeviceManagerFragment);
        this.f32341b = activity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.handler.BaseHandler
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void handleMessageWhenReferenceNotNull(HagridDeviceManagerFragment hagridDeviceManagerFragment, Message message) {
        if (message == null) {
            return;
        }
        LogUtil.a("R_Weight_ConditionBeforeRequestHandler", "handleMessageWhenReferenceNotNull message.what: ", Integer.valueOf(message.what));
        if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory()) {
            LogUtil.j("R_Weight_ConditionBeforeRequestHandler", "ConditionBeforeRequestHandler object is null or destroyed");
            return;
        }
        this.d = hagridDeviceManagerFragment;
        switch (message.what) {
            case 10:
                e();
                dys.a().a(this.f32341b);
                break;
            case 11:
                e();
                if (this.d.getIsClickDeviceVersionUpdateItem()) {
                    this.d.startVersionActivity(true);
                } else {
                    final DeviceManagerInfoHandler deviceManagerInfoHandler = new DeviceManagerInfoHandler();
                    deviceManagerInfoHandler.b(new DeviceManagerInfoHandler.GetManagerAccountInfoListener() { // from class: dtg
                        @Override // com.huawei.health.device.ui.util.DeviceManagerInfoHandler.GetManagerAccountInfoListener
                        public final void managerAccountInfo(String str) {
                            this.f32353c.d(deviceManagerInfoHandler, str);
                        }
                    });
                    deviceManagerInfoHandler.b();
                }
                break;
            case 12:
                e();
                if (this.d.getIsClickDeviceVersionUpdateItem()) {
                    this.d.startVersionActivity(false);
                } else {
                    this.d.clickWifiItem();
                }
                break;
        }
    }

    /* synthetic */ void d(DeviceManagerInfoHandler deviceManagerInfoHandler, String str) {
        HagridDeviceManagerFragment hagridDeviceManagerFragment = this.d;
        if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory()) {
            deviceManagerInfoHandler.b((DeviceManagerInfoHandler.GetManagerAccountInfoListener) null);
            LogUtil.j("ConditionBeforeRequestHandler", "fragment is destroyed, unregisterListener");
            return;
        }
        HagridDeviceManagerFragment hagridDeviceManagerFragment2 = this.d;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hagridDeviceManagerFragment2.setAccountInfo(str);
        if (this.d.getManagerHandler() != null) {
            this.d.getManagerHandler().sendEmptyMessage(15);
        }
    }

    private void e() {
        if (this.d.getLoadingConditionTimer() != null) {
            this.d.getLoadingConditionTimer().cancel();
        }
        this.d.destroyLoadingDialog();
    }

    public void d() {
        this.f32341b = null;
        this.d = null;
    }
}
