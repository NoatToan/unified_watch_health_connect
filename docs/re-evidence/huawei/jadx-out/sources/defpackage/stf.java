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
public class stf extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private std f48670b;

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
    }

    public stf(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        Activity activity = this.mActivity.get();
        std stdVar = new std(str);
        if (activity == null) {
            LogUtil.e("WatchFaceQrCodeHandler", "parser: activity is null");
            return stdVar;
        }
        if (str != null && obj != null) {
            int rVar = stdVar.parser(obj);
            if (rVar == -3) {
                LogUtil.e("WatchFaceQrCodeHandler", "QR_CODE_DATA_NULL");
            } else if (rVar == -2) {
                LogUtil.e("WatchFaceQrCodeHandler", "PARSER_ERROR_CODE");
            } else if (rVar != 0) {
                LogUtil.e("WatchFaceQrCodeHandler", "error:", Integer.valueOf(rVar));
            } else {
                LogUtil.a("WatchFaceQrCodeHandler", MonitorResult.SUCCESS);
                return stdVar;
            }
            sub.a(this.mActivity.get());
        }
        return stdVar;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (!(qrCodeDataBase instanceof std)) {
            LogUtil.e("WatchFaceQrCodeHandler", "QrCodeDataBase type error");
            return false;
        }
        std stdVar = (std) qrCodeDataBase;
        this.f48670b = stdVar;
        return !TextUtils.isEmpty(stdVar.c());
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        LogUtil.a("WatchFaceQrCodeHandler", "execute in");
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.j("WatchFaceQrCodeHandler", "execute activity is null");
            return;
        }
        mca.a(activity);
        mca.c(activity, this.f48670b.c());
        activity.finish();
    }
}
