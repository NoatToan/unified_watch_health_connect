package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.media3.common.C;
import com.huawei.health.device.ui.measure.BaseInteractor;
import com.huawei.hihealth.device.open.HealthDevice;
import com.huawei.hihealth.device.open.IHealthDeviceCallback;
import com.huawei.hihealth.device.open.MeasureController;
import com.huawei.hihealth.device.open.MeasureKit;
import com.huawei.hihealth.device.open.data.MeasureRecord;
import com.huawei.hihealth.device.open.data.MeasureResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class dtf extends BaseInteractor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f32346c = -4;
    private static int d = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f32347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32348b;
    private Context f;
    private HealthTextView h;
    private RelativeLayout i;
    private HealthTextView j;
    private ImageView l;
    private final String m;
    private HealthTextView n;
    private RelativeLayout o;
    private HealthTextView p;
    private final String q;
    private final View s;
    private int e = 0;
    private int r = 0;
    private Runnable k = new Runnable() { // from class: dtf.1
        @Override // java.lang.Runnable
        public void run() {
            dtf.this.l();
        }
    };
    private Handler g = new Handler() { // from class: dtf.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1000:
                    dtf.this.j(message.arg1);
                    break;
                case 1001:
                    dtf.this.g();
                    break;
                case 1002:
                    dtf.this.j();
                    break;
                case 1003:
                    dtf.this.a();
                    break;
                case 1004:
                    dtf.this.e();
                    break;
                case 1005:
                default:
                    LogUtil.a("PluginDevice_HonourRateStatus", "Enter default");
                    break;
                case 1006:
                    dtf.this.h();
                    break;
                case 1007:
                    if (((Integer) message.obj).intValue() == 2) {
                        dtf.this.p.setText(dtf.this.f.getString(R.string.IDS_myfitnesspal_login));
                        dtf.this.n.setVisibility(0);
                        dtf.this.l.setVisibility(8);
                        dtf.this.k();
                    } else {
                        dtf.this.p.setText(dtf.this.f.getString(R.string.IDS_myfitnesspal_logout));
                        dtf.this.n.setVisibility(8);
                        dtf.this.l.setVisibility(0);
                        dtf.this.s();
                    }
                    dtf.this.onResume();
                    break;
            }
            super.handleMessage(message);
        }
    };

    public dtf(Context context, View view, String str, String str2) {
        this.f32348b = true;
        this.f32348b = true;
        this.f = context;
        this.s = view;
        this.m = str;
        this.q = str2;
        i();
        f();
        o();
    }

    private void o() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HEART_RATE_SEE_2060020.value(), map, 0);
    }

    private void f() {
        this.f32347a.setOnClickListener(new View.OnClickListener() { // from class: dtf.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (dtf.f32346c == -5) {
                    int unused = dtf.d = 20;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1002;
                    dtf.this.g.sendMessage(messageObtain);
                    return;
                }
                if (dtf.f32346c == -6) {
                    int unused2 = dtf.d = 20;
                    dtf.this.m();
                } else {
                    LogUtil.a("PluginDevice_HonourRateStatus", "Function initListener enters 'else' option.");
                }
            }
        });
    }

    private void i() {
        this.f32347a = (RelativeLayout) qsp.a(this.s, R.id.card_heart_rate_layout);
        this.l = (ImageView) qsp.a(this.s, R.id.heart_rate_measuring_status_img);
        this.h = (HealthTextView) qsp.a(this.s, R.id.heart_rate_measuring_count_value);
        this.j = (HealthTextView) qsp.a(this.s, R.id.heart_rate_measure_date_tv);
        this.p = (HealthTextView) qsp.a(this.s, R.id.head_phone_connect_tv);
        this.n = (HealthTextView) qsp.a(this.s, R.id.head_phone_measuring_tv);
        this.i = (RelativeLayout) qsp.a(this.s, R.id.heart_fine_index_number_layout);
        this.o = (RelativeLayout) qsp.a(this.s, R.id.sleep_pressure_layout);
        this.p.setText(this.f.getString(R.string.IDS_myfitnesspal_logout));
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f32348b = false;
        this.r = 0;
        this.g.removeCallbacks(this.k);
        a(false, 1.0f);
        this.l.setVisibility(8);
        this.n.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f32348b = false;
        f32346c = -2;
        this.r = 0;
        this.g.postDelayed(this.k, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        this.g.removeCallbacks(this.k);
        this.p.setText(this.f.getString(R.string.IDS_myfitnesspal_login));
        k();
        a(false, 1.0f);
        this.n.setVisibility(0);
        this.l.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.f32348b = true;
        a(true, 1.0f);
        d = 20;
        f32346c = -6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        this.f32348b = false;
        a(false, 1.0f);
        if (i == 0) {
            this.h.setText("--");
            this.j.setVisibility(8);
        } else {
            this.h.setText(String.valueOf(i));
            this.j.setVisibility(0);
            this.j.setText(qrk.d(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f32348b = true;
        this.r = 0;
        d = 20;
        this.g.removeCallbacks(this.k);
        a(false, 0.38f);
        this.p.setText(this.f.getString(R.string.IDS_myfitnesspal_logout));
        this.n.setVisibility(8);
        this.l.setVisibility(0);
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("PluginDevice_HonourRateStatus", "closeHeartRateStatus");
        this.r = 0;
        d = 20;
        this.f32348b = true;
        this.g.removeCallbacks(this.k);
        a(false, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f32348b = false;
        a(true, 1.0f);
        if (f32346c != -5) {
            f32346c = -5;
        }
    }

    private void a(boolean z, float f) {
        this.f32347a.setEnabled(z);
        this.f32347a.setAlpha(f);
    }

    @Override // com.huawei.health.device.ui.measure.BaseInteractor
    public void onDestroy() {
        LogUtil.a("PluginDevice_HonourRateStatus", "Enter onDestroy");
        d();
        drw.e().b(this.m, this.q);
    }

    @Override // com.huawei.health.device.ui.measure.BaseInteractor
    public void setClean() {
        LogUtil.a("PluginDevice_HonourRateStatus", "setClean to enter");
    }

    @Override // com.huawei.health.device.ui.measure.BaseInteractor
    public void controller(int i, Object obj) {
        LogUtil.a("PluginDevice_HonourRateStatus", "controller to enter");
    }

    @Override // com.huawei.health.device.ui.measure.BaseInteractor
    public void onResume() {
        LogUtil.a("PluginDevice_HonourRateStatus", "Enter onResume");
        if (this.f32348b) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        MeasureController measureController;
        LogUtil.a("PluginDevice_HonourRateStatus", "Enter openHeartRateRunningForeground");
        d = 20;
        HealthDevice healthDeviceE = dmp.d().e(this.m, this.q);
        MeasureKit measureKitB = dnf.e().b("54C9739F-CA5C-4347-9F00-75B9DDF2C649");
        if (measureKitB == null || (measureController = measureKitB.getMeasureController()) == null) {
            return;
        }
        measureController.prepare(healthDeviceE, new IHealthDeviceCallback() { // from class: dtf.3
            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onDataChanged(HealthDevice healthDevice, MeasureResult measureResult) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onProgressChanged(HealthDevice healthDevice, MeasureRecord measureRecord) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onStatusChanged(HealthDevice healthDevice, int i) {
                LogUtil.a("PluginDevice_HonourRateStatus", "-----prepare heartRateData_onStatusChanged---:", Integer.valueOf(i));
                dtf.this.e = i;
                if (BaseApplication.isRunningForeground() && dtf.this.e == 2) {
                    dtf.this.n();
                    return;
                }
                if (i == 3 || i == 1 || i == 8) {
                    dtf.this.e = i;
                    int unused = dtf.f32346c = -4;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1004;
                    dtf.this.g.sendMessage(messageObtain);
                    return;
                }
                LogUtil.a("PluginDevice_HonourRateStatus", "openHeartRateRunningForeground 'else' option.");
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onFailed(HealthDevice healthDevice, int i) {
                LogUtil.a("PluginDevice_HonourRateStatus", "openHeartRateRunningForeground onFailed code = ", Integer.valueOf(i));
            }
        }, dxm.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LogUtil.a("PluginDevice_HonourRateStatus", "Enter openHeartRate");
        this.g.removeCallbacks(this.k);
        this.f32348b = false;
        f32346c = -1;
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        this.g.sendMessage(messageObtain);
        this.g.postDelayed(this.k, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        drw.e().a(this.m, this.q, new IHealthDeviceCallback() { // from class: dtf.4
            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onProgressChanged(HealthDevice healthDevice, MeasureRecord measureRecord) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onDataChanged(HealthDevice healthDevice, MeasureResult measureResult) {
                dtf.this.d(measureResult);
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onStatusChanged(HealthDevice healthDevice, int i) {
                dtf.this.d(i);
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onFailed(HealthDevice healthDevice, int i) {
                LogUtil.a("PluginDevice_HonourRateStatus", "openHeartRateRunningForeground onFailed code = ", Integer.valueOf(i));
            }
        }, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("PluginDevice_HonourRateStatus", "-----heartRateData_onStatusChanged---:", Integer.valueOf(i));
        if (i == 3 || i == 8) {
            this.e = i;
            f32346c = -4;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1004;
            this.g.sendMessage(messageObtain);
            return;
        }
        if (i == 14) {
            c(10000);
            return;
        }
        if (i == 2) {
            this.e = i;
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 1007;
            messageObtain2.obj = Integer.valueOf(i);
            this.g.sendMessage(messageObtain2);
            return;
        }
        if (i == 12) {
            this.e = i;
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 1004;
            this.g.sendMessage(messageObtain3);
            return;
        }
        LogUtil.a("PluginDevice_HonourRateStatus", "openHeartRate 'else' option.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MeasureResult measureResult) {
        enb enbVar;
        if (eqv.d().e(measureResult) instanceof enb) {
            enbVar = (enb) eqv.d().e(measureResult);
        } else {
            LogUtil.j("PluginDevice_HonourRateStatus", "ConvertDataUtil.getInstance().convertData(dat) not instanceof HeartRate");
            enbVar = null;
        }
        if (enbVar == null || enbVar.getHeartRate() == -1) {
            return;
        }
        LogUtil.d("PluginDevice_HonourRateStatus", "-----heartRateData---:", Integer.valueOf(enbVar.getHeartRate()));
        a(enbVar.getHeartRate());
        if (BaseApplication.isRunningForeground()) {
            return;
        }
        b();
        drw.e().b(this.m, this.q);
    }

    private void c(int i) {
        if (i == 100000) {
            f32346c = -2;
            this.g.removeCallbacks(this.k);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1002;
            this.g.sendMessage(messageObtain);
        }
    }

    public void d() {
        LogUtil.a("PluginDevice_HonourRateStatus", "Enter closeHeartRateRunningForeground");
        b();
    }

    private void b() {
        LogUtil.a("PluginDevice_HonourRateStatus", "Enter closeHeartRate");
        drw.e().d(this.m, this.q);
        i(100000);
    }

    private void i(int i) {
        if (i == 100000) {
            f32346c = -4;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1003;
            this.g.sendMessage(messageObtain);
        }
    }

    private void a(int i) {
        this.f32348b = false;
        this.g.removeCallbacks(this.k);
        this.g.removeCallbacks(this.k);
        this.g.postDelayed(this.k, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        if (i == 0) {
            int i2 = this.r + 1;
            this.r = i2;
            if (i2 > d) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1006;
                this.g.sendMessage(messageObtain);
                return;
            }
        } else {
            this.r = 0;
            d = 15;
        }
        LogUtil.a("PluginDevice_HonourRateStatus", "heartRateStatus = ", Integer.valueOf(f32346c));
        if (i == 0 && f32346c == -2) {
            LogUtil.a("PluginDevice_HonourRateStatus", "heart rate status can not refresh");
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 1000;
        messageObtain2.arg1 = i;
        this.g.sendMessage(messageObtain2);
        f32346c = -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.o.setEnabled(false);
        this.i.setEnabled(false);
        this.o.setAlpha(0.38f);
        this.i.setAlpha(0.38f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.o.setEnabled(true);
        this.i.setEnabled(true);
        this.o.setAlpha(1.0f);
        this.i.setAlpha(1.0f);
    }
}
