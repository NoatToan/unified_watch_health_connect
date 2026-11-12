package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import com.huawei.ui.main.stories.healthzone.model.GetHealthZoneVerifyCodeUserReq;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes17.dex */
public class sss extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CommonDialog21 f48644a;
    private ssp d;

    public sss(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
        initHandlerThread("FamilyQrCodeHandler");
    }

    private String a(String str) {
        try {
            LogUtil.d("FamilyQrCodeHandler", "getQrContent qrResult = ", str);
            return str.split("&")[1].substring(2);
        } catch (IndexOutOfBoundsException | PatternSyntaxException e) {
            LogUtil.e("R_QrCode_FamilyQrCodeHandler", "getQrContent exception = ", e.getMessage());
            if (this.mActivity == null) {
                return null;
            }
            sub.a(this.mActivity.get());
            return null;
        }
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        if (str == null || !(obj instanceof String)) {
            return null;
        }
        ssp sspVar = new ssp(str);
        int rVar = sspVar.parser(a((String) obj));
        if (rVar == -3) {
            LogUtil.e("R_QrCode_FamilyQrCodeHandler", "QR_CODE_DATA_NULL");
        } else if (rVar == -2) {
            LogUtil.e("R_QrCode_FamilyQrCodeHandler", "PARSER_ERROR_CODE");
        } else if (rVar != 0) {
            LogUtil.e("R_QrCode_FamilyQrCodeHandler", "error: ", Integer.valueOf(rVar));
        } else {
            LogUtil.a("FamilyQrCodeHandler", "parse success");
            return sspVar;
        }
        sub.a(this.mActivity.get());
        return null;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (!(qrCodeDataBase instanceof ssp)) {
            LogUtil.e("R_QrCode_FamilyQrCodeHandler", "QrCodeDataBase type error");
            return false;
        }
        ssp sspVar = (ssp) qrCodeDataBase;
        this.d = sspVar;
        return !TextUtils.isEmpty(sspVar.b());
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        this.mMainThreadHandler.sendEmptyMessage(20001);
        this.mHandler.sendEmptyMessage(2001);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
        if (message == null) {
            LogUtil.e("R_QrCode_FamilyQrCodeHandler", "handleMessage msg is null");
        } else {
            if (message.what != 2001) {
                return;
            }
            c();
            LogUtil.a("FamilyQrCodeHandler", "get user id");
        }
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
        if (message == null || activity == null) {
            LogUtil.e("R_QrCode_FamilyQrCodeHandler", "mainHandleMessage msg or activity is null");
            return;
        }
        switch (message.what) {
            case 20001:
                LogUtil.a("FamilyQrCodeHandler", "show scanning dialog");
                e(R.string.IDS_device_wifi_my_qrcode_add_member_loading, activity);
                break;
            case 20002:
                b();
                sub.a(this.mActivity.get());
                break;
            case 20003:
                qpx.e(activity.getApplicationContext(), R.string.IDS_submit_error_message_1);
                b();
                b(activity);
                break;
            case 20004:
                b();
                Bundle bundle = new Bundle();
                bundle.putString("verifyCode", this.d.b());
                AppRouter.c("/PluginHealthZone/FamilyHealthTempActivity").d(bundle).b(activity);
                activity.finish();
                break;
            case 20005:
                b();
                sub.e(this.mActivity.get());
                break;
        }
    }

    private void e(int i, Activity activity) {
        String string = activity.getString(i);
        if (this.f48644a == null) {
            this.f48644a = CommonDialog21.b(activity);
        }
        this.f48644a.setCancelable(false);
        this.f48644a.b(string);
        this.f48644a.c();
    }

    private void b() {
        CommonDialog21 commonDialog21 = this.f48644a;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.f48644a.dismiss();
        this.f48644a = null;
    }

    private void b(Activity activity) {
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    private void c() {
        LogUtil.a("FamilyQrCodeHandler", "get user id from cloud");
        GetHealthZoneVerifyCodeUserReq getHealthZoneVerifyCodeUserReq = new GetHealthZoneVerifyCodeUserReq();
        getHealthZoneVerifyCodeUserReq.setVerifyCode(this.d.b());
        voq.c(getHealthZoneVerifyCodeUserReq, new ICloudOperationResult<vog>() { // from class: sss.2
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void operationResult(vog vogVar, String str, boolean z) {
                if (z) {
                    if (vogVar == null || vogVar.getResultCode().intValue() != 0) {
                        sss.this.mMainThreadHandler.sendEmptyMessage(20002);
                        return;
                    }
                    Long lD = vogVar.d();
                    lD.longValue();
                    sss.this.mMainThreadHandler.sendMessage(Message.obtain(sss.this.mMainThreadHandler, 20004, lD));
                    return;
                }
                if (vogVar == null || vogVar.getResultCode().intValue() != 30000004) {
                    sss.this.mMainThreadHandler.sendEmptyMessage(20003);
                } else {
                    sss.this.mMainThreadHandler.sendEmptyMessage(20005);
                }
            }
        });
    }
}
