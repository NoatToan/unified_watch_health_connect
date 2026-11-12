package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;

/* JADX INFO: loaded from: classes17.dex */
public class stc extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private stb f48667b;
    private String d;
    private elh e;

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
    }

    public stc(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        if (this.mActivity.get() == null) {
            LogUtil.e("MeasureQrCodeHandler", "parser: activity is null");
            return null;
        }
        if (str != null && obj != null) {
            stb stbVar = new stb(str);
            int rVar = stbVar.parser(obj);
            if (rVar == -2) {
                LogUtil.e("MeasureQrCodeHandler", "PARSER_ERROR_CODE");
                sty.a(this.mActivity.get());
            } else if (rVar != 0) {
                LogUtil.e("MeasureQrCodeHandler", "error:", Integer.valueOf(rVar));
            } else {
                LogUtil.a("MeasureQrCodeHandler", MonitorResult.SUCCESS);
                return stbVar;
            }
        }
        return null;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (!(qrCodeDataBase instanceof stb)) {
            return false;
        }
        LogUtil.a("MeasureQrCodeHandler", "verify() get data from QrcodeDataBase");
        this.f48667b = (stb) qrCodeDataBase;
        return true;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        LogUtil.a("MeasureQrCodeHandler", "enter execute()");
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.e("MeasureQrCodeHandler", "execute: activity is null");
            return;
        }
        if (!rdp.b((Context) activity)) {
            rdp.b(activity);
            return;
        }
        Intent intent = new Intent();
        String strE = this.f48667b.e();
        String strA = this.f48667b.a();
        String strC = this.f48667b.c();
        ProductMapParseUtil.a(activity);
        ProductMapInfo productMapInfoD = ProductMap.d(strA);
        if ("69".equals(strE) && b(productMapInfoD, strC)) {
            b(activity);
            return;
        }
        intent.putExtra("BRAND_FROM_QRCODE", this.f48667b.b());
        intent.putExtra("BLE_FROM_QRCODE", this.f48667b.d());
        intent.putExtra("BLENAME_FROM_QRCODE", strC);
        intent.putExtra("PID_FROM_QRCODE", strA);
        intent.putExtra("PIN_FROM_QRCODE", this.f48667b.g());
        intent.putExtra("DEVICE_TYPE_INDEX", strE);
        intent.putExtra("KEY_TO_GET_START_FROM_QRCODE", true);
        intent.setClass(this.mActivity.get(), DeviceMainActivity.class);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
        activity.finish();
    }

    private boolean b(ProductMapInfo productMapInfo, String str) {
        if (productMapInfo == null) {
            LogUtil.a("MeasureQrCodeHandler", "sportProductInfo is null");
            return false;
        }
        this.d = productMapInfo.f();
        elh elhVarD = ResourceManager.c().d(this.d);
        this.e = elhVarD;
        if (elhVarD == null) {
            LogUtil.a("MeasureQrCodeHandler", "productInfo is null");
            return false;
        }
        MeasurableDevice measurableDeviceC = dmp.d().c(this.d, str);
        if (measurableDeviceC == null) {
            LogUtil.a("MeasureQrCodeHandler", "this device is unBind");
            return false;
        }
        this.f48666a = measurableDeviceC.getUniqueId();
        return BleConstants.BLE_THIRD_DEVICE_H5.equals(this.e.n().b());
    }

    private void b(Activity activity) {
        if (TextUtils.isEmpty(this.f48666a)) {
            LogUtil.a("MeasureQrCodeHandler", "macAddress is null");
            return;
        }
        if ("1".equals(this.e.g())) {
            etn.c(activity, this.e, this.d, this.f48666a);
            return;
        }
        Intent intentB = etn.b(this.e, this.d, this.f48666a);
        if (intentB != null) {
            intentB.putExtra("url", elg.e().e(this.d) + "?enterType=QRCODE");
            activity.startActivity(intentB);
            activity.finish();
        }
    }
}
