package defpackage;

import android.app.Activity;
import android.os.Message;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.DeviceTypeConsts;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes17.dex */
public class ssm extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48636b;
    private final WeakReference<Activity> e;

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        return true;
    }

    public ssm(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
        this.e = new WeakReference<>(activity);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        this.f48636b = str;
        return new QrCodeDataBase(str) { // from class: ssm.2
            @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
            public int parser(Object obj2) {
                return 0;
            }
        };
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        final Activity activity = this.e.get();
        if (activity == null) {
            LogUtil.j("EcgQrCodeHandler", "execute activity is null");
            return;
        }
        if (!Utils.o()) {
            LogUtil.a("EcgQrCodeHandler", "execute active: ", this.f48636b);
            if ("activeEcgService".equals(this.f48636b)) {
                prf.d(activity, "card");
                return;
            } else if (!"activeEcgWatch".equals(this.f48636b)) {
                LogUtil.j("EcgQrCodeHandler", "execute mActive undefined");
                return;
            } else {
                prf.d(activity, DeviceTypeConsts.WATCH);
                return;
            }
        }
        this.mMainThreadHandler.post(new Runnable() { // from class: ssq
            @Override // java.lang.Runnable
            public final void run() {
                ssm.c(activity);
            }
        });
    }

    static /* synthetic */ void c(Activity activity) {
        qpx.b(activity, BaseApplication.getContext().getString(R.string.IDS_health_ecg_qr_tip));
        activity.finish();
    }
}
