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
public class stg extends QrCodeBaseHandler {
    private sth d;

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
    }

    public stg(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        if (this.mActivity.get() == null) {
            LogUtil.e("ThirdEcgQrCodeHandler", "parser: activity is null");
            return null;
        }
        if (str != null && obj != null) {
            sth sthVar = new sth(str);
            int rVar = sthVar.parser(obj);
            if (rVar == -3) {
                LogUtil.e("ThirdEcgQrCodeHandler", "QR_CODE_DATA_NULL");
            } else if (rVar == -2) {
                LogUtil.e("ThirdEcgQrCodeHandler", "PARSER_ERROR_CODE");
            } else if (rVar != 0) {
                LogUtil.e("ThirdEcgQrCodeHandler", "error:", Integer.valueOf(rVar));
            } else {
                LogUtil.a("ThirdEcgQrCodeHandler", MonitorResult.SUCCESS);
                return sthVar;
            }
            sub.a(this.mActivity.get());
        }
        return null;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (!(qrCodeDataBase instanceof sth)) {
            LogUtil.e("ThirdEcgQrCodeHandler", "QrCodeDataBase type error");
            return false;
        }
        sth sthVar = (sth) qrCodeDataBase;
        this.d = sthVar;
        return (TextUtils.isEmpty(sthVar.b()) || TextUtils.isEmpty(this.d.a())) ? false : true;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.j("ThirdEcgQrCodeHandler", "execute activity is null");
        } else {
            a(activity);
        }
    }

    private void a(Activity activity) {
        LogUtil.a("ThirdEcgQrCodeHandler", "downloadResource");
        new eqm(activity, "", this.d.b(), this.d.a()).a("HDK_ECG");
    }
}
