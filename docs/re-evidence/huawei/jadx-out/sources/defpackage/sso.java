package defpackage;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;

/* JADX INFO: loaded from: classes17.dex */
public class sso extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ssr f48640a;

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
    }

    public sso(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        if (this.mActivity.get() == null) {
            LogUtil.e("ThirdVentilatorQrCodeHandler", "parser: activity is null");
            return null;
        }
        if (str != null && obj != null) {
            ssr ssrVar = new ssr(str);
            int rVar = ssrVar.parser(obj);
            if (rVar == -3) {
                LogUtil.e("ThirdVentilatorQrCodeHandler", "QR_CODE_DATA_NULL");
            } else if (rVar == -2) {
                LogUtil.e("ThirdVentilatorQrCodeHandler", "PARSER_ERROR_CODE");
            } else if (rVar != 0) {
                LogUtil.e("ThirdVentilatorQrCodeHandler", "error:", Integer.valueOf(rVar));
            } else {
                LogUtil.a("ThirdVentilatorQrCodeHandler", MonitorResult.SUCCESS);
                return ssrVar;
            }
            sub.a(this.mActivity.get());
        }
        return null;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (!(qrCodeDataBase instanceof ssr)) {
            LogUtil.e("ThirdVentilatorQrCodeHandler", "QrCodeDataBase type error");
            return false;
        }
        ssr ssrVar = (ssr) qrCodeDataBase;
        this.f48640a = ssrVar;
        return (TextUtils.isEmpty(ssrVar.c()) || TextUtils.isEmpty(this.f48640a.b())) ? false : true;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.j("ThirdVentilatorQrCodeHandler", "execute activity is null");
        } else {
            c(activity);
        }
    }

    private void c(Activity activity) {
        LogUtil.a("ThirdVentilatorQrCodeHandler", "downloadResource");
        new eqm(activity, "", this.f48640a.c(), this.f48640a.b(), this.f48640a.a()).a("HDK_VENTILATOR");
    }
}
