package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.activity.IndoorEquipConnectedActivity;
import com.huawei.indoorequip.activity.IndoorEquipDisplayActivity;
import com.huawei.indoorequip.activity.IndoorEquipLandDisplayActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import health.compact.a.SharedPreferenceManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class ssw extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f48652a = new HashSet(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ssv f48653c;
    private boolean d;

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
    }

    public ssw(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface, Bundle bundle) {
        super(activity, commBaseCallbackInterface, bundle);
        this.d = false;
        Set<String> set = f48652a;
        set.add(BleConstants.SPORT_TYPE_BIKE);
        set.add("260");
        set.add("261");
        set.add("31");
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.e("IndoorEquipQrCodeHandler", "parser: activity is null");
            return null;
        }
        if (str != null && obj != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            activity.runOnUiThread(new Runnable() { // from class: ssu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48648a.a(countDownLatch);
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                LogUtil.e("IndoorEquipQrCodeHandler", e.getMessage());
            }
            if (this.d) {
                LogUtil.a("IndoorEquipQrCodeHandler", "parser: SportManager is running");
                return null;
            }
            ssv ssvVar = new ssv(str);
            int rVar = ssvVar.parser(obj);
            if (rVar == -2) {
                LogUtil.e("IndoorEquipQrCodeHandler", "PARSER_ERROR_CODE");
                sty.a(this.mActivity.get());
            } else if (rVar != 0) {
                LogUtil.e("IndoorEquipQrCodeHandler", "error:", Integer.valueOf(rVar));
            } else {
                LogUtil.a("IndoorEquipQrCodeHandler", MonitorResult.SUCCESS);
                return ssvVar;
            }
        }
        return null;
    }

    /* synthetic */ void a(CountDownLatch countDownLatch) {
        this.d = b((Context) this.mActivity.get());
        countDownLatch.countDown();
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (!(qrCodeDataBase instanceof ssv)) {
            return false;
        }
        LogUtil.a("IndoorEquipQrCodeHandler", "verify() get data from QrcodeDataBase");
        this.f48653c = (ssv) qrCodeDataBase;
        return true;
    }

    private void a(Activity activity, String str) {
        Intent intent = new Intent();
        intent.putExtra("PAYLOAD_FROM_NFC", str);
        intent.putExtra("PROTOCOL_FROM_QRCODE", this.f48653c.j());
        intent.putExtra("ENTER_TYPE", "QRCODE");
        intent.setClass(activity, DeviceMainActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        LogUtil.a("IndoorEquipQrCodeHandler", "enter execute()");
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.e("IndoorEquipQrCodeHandler", "execute: activity is null");
            return;
        }
        if (!rdp.b((Context) activity)) {
            rdp.b(activity);
            return;
        }
        String strD = d();
        LogUtil.a("IndoorEquipQrCodeHandler", "execute", ",productId:", strD);
        if (f48652a.contains(this.f48653c.c())) {
            e(activity, strD);
        } else {
            b(activity);
        }
    }

    private void b(Activity activity) {
        Intent intent = new Intent();
        intent.putExtra("PROTOCOL_FROM_QRCODE", this.f48653c.j());
        intent.putExtra("BLE_FROM_QRCODE", !TextUtils.isEmpty(this.f48653c.a()) ? this.f48653c.a() : this.f48653c.d());
        intent.putExtra("BLENAME_FROM_QRCODE", this.f48653c.b());
        intent.putExtra("DEVICE_TYPE_INDEX", this.f48653c.c());
        intent.putExtra("PID_FROM_QRCODE", this.f48653c.e());
        if (this.f48653c.c().equals("262")) {
            LogUtil.d("IndoorEquipQrCodeHandler", "execute: TYPE_ROPE_INDEX");
            intent.setClass(this.mActivity.get(), DeviceMainActivity.class);
            intent.putExtra("KEY_TO_GET_START_FROM_QRCODE", true);
        } else if (nwa.n().r()) {
            intent.setClass(this.mActivity.get(), IndoorEquipDisplayActivity.class);
            intent.putExtra("show tips key", true);
        } else if (nwa.n().y()) {
            intent.setClass(this.mActivity.get(), IndoorEquipLandDisplayActivity.class);
            intent.putExtra("show tips key", true);
        } else {
            intent.setClass(this.mActivity.get(), IndoorEquipConnectedActivity.class);
        }
        LogUtil.a("IndoorEquipQrCodeHandler", "execute() will start IndoorEquipConnectedActivity");
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
        activity.finish();
    }

    private void e(Activity activity, String str) {
        String strE;
        LogUtil.a("IndoorEquipQrCodeHandler", "toProductPage:");
        if (TextUtils.isEmpty(this.f48653c.e()) && !TextUtils.isEmpty(str)) {
            LogUtil.a("IndoorEquipQrCodeHandler", "toProductPage find pid from productMap");
            ProductMapParseUtil.a(BaseApplication.getContext());
            Iterator<ProductMapInfo> it = ProductMap.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strE = "";
                    break;
                }
                ProductMapInfo next = it.next();
                if (next.f().equals(str)) {
                    strE = next.g();
                    break;
                }
            }
        } else {
            strE = this.f48653c.e();
        }
        boolean zEquals = "1".equals(this.f48653c.j());
        StringBuilder sb = new StringBuilder("ftmp=");
        sb.append(zEquals ? "0" : "1");
        sb.append("&t=");
        sb.append(this.f48653c.c());
        sb.append("&n=");
        sb.append(this.f48653c.b());
        sb.append("&pid=");
        sb.append(strE);
        sb.append("&ble=");
        sb.append(this.f48653c.d());
        String string = sb.toString();
        LogUtil.a("IndoorEquipQrCodeHandler", "payload:", string);
        a(activity, string);
    }

    private String d() {
        return nyx.a(HealthDevice.HealthDeviceKind.getHealthDeviceKind(this.f48653c.c()).name(), this.f48653c.b());
    }

    private boolean b(Context context) {
        PluginSuggestion pluginSuggestion = PluginSuggestion.getInstance();
        if (!(context instanceof Activity) || pluginSuggestion == null) {
            return false;
        }
        pluginSuggestion.init(context);
        ive.c().setAdapter(PluginHealthTrackAdapterImpl.getInstance(context));
        ive.c().init(context);
        int iG = ive.c().g();
        boolean zO = ive.c().o();
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "iscrash");
        if (zO || iG == 1 || iG == 2) {
            LogUtil.a("IndoorEquipQrCodeHandler", "track module is running");
            if (iwy.a(jbg.a()).p() != 1) {
                Intent intent = new Intent(context, (Class<?>) TrackMainMapActivity.class);
                intent.setFlags(67108864);
                intent.putExtra("isSelected", false);
                LogUtil.a("IndoorEquipQrCodeHandler", "track module is not auto track, resume");
                context.startActivity(intent);
            }
            return true;
        }
        if ("true".equals(strE)) {
            LogUtil.a("IndoorEquipQrCodeHandler", "crash flag of track module is true");
            return true;
        }
        if (iwy.a(jbg.a()).p() == 1) {
            LogUtil.a("IndoorEquipQrCodeHandler", "track module has auto track, break it");
            iwy.a(jbg.a()).bu();
        }
        LogUtil.a("IndoorEquipQrCodeHandler", "track module is not running");
        if (fhz.d() != null) {
            LogUtil.a("IndoorEquipQrCodeHandler", "getInstance of Mediator success");
        }
        return false;
    }
}
