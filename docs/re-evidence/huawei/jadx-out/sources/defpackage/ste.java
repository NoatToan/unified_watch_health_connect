package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.device.activity.adddevice.PairingGuideActivity;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class ste extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sta f48669b;

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
    }

    public ste(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        if (!(obj instanceof String)) {
            sub.a(this.mActivity.get());
            return null;
        }
        String strDecode = (String) obj;
        LogUtil.d("ScaleQrCodeHandler", "parser newQrResultFull = ", strDecode);
        if (strDecode.startsWith("&")) {
            try {
                strDecode = URLDecoder.decode(strDecode.substring(1), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("ScaleQrCodeHandler", "parser UnsupportedEncodingException");
            }
        }
        if (str != null) {
            sta staVar = new sta(str);
            int rVar = staVar.parser(strDecode);
            if (rVar == -3) {
                LogUtil.e("R_QrCode_ScaleQrCodeHandler", "QR_CODE_DATA_NULL");
            } else if (rVar == -2) {
                LogUtil.e("R_QrCode_ScaleQrCodeHandler", "PARSER_ERROR_CODE");
            } else {
                if (rVar == 0) {
                    return staVar;
                }
                LogUtil.e("R_QrCode_ScaleQrCodeHandler", "error: ", Integer.valueOf(rVar));
            }
            sub.a(this.mActivity.get());
        }
        return null;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (!(qrCodeDataBase instanceof sta)) {
            LogUtil.e("R_QrCode_ScaleQrCodeHandler", "QrCodeDataBase type error");
            return false;
        }
        sta staVar = (sta) qrCodeDataBase;
        this.f48669b = staVar;
        return !TextUtils.isEmpty(staVar.b());
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.e("R_QrCode_ScaleQrCodeHandler", "execute: activity is null");
            return;
        }
        String strB = this.f48669b.b();
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("ScaleQrCodeHandler", "productId is null");
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) PairingGuideActivity.class);
        intent.putExtra("kind_id", "HDK_WEIGHT");
        intent.putExtra("pair_guide", "2");
        intent.putExtra("is_scan_to_pair_guide", true);
        ArrayList<String> arrayList = new ArrayList<>(16);
        arrayList.add(strB);
        intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("ScaleQrCodeHandler", "execute startActivity ActivityNotFoundException.");
        }
        activity.finish();
    }
}
