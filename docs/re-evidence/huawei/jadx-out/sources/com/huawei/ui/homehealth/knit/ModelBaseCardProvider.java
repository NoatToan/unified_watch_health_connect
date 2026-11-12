package com.huawei.ui.homehealth.knit;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.homehealth.R;
import defpackage.fsb;
import defpackage.fsd;
import defpackage.ipb;
import defpackage.myk;
import defpackage.njy;
import defpackage.qrs;
import defpackage.tdr;
import defpackage.tdy;
import defpackage.uin;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class ModelBaseCardProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f25607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f25608c;
    private Observer i;
    private SectionBean l;
    private CommonSingleCallback<Boolean> n;
    protected HealthOpenSDK g = null;
    private int o = 0;
    protected HashMap<String, Object> f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected tdr f25606a = new tdr();
    private boolean m = true;
    protected boolean e = true;
    private boolean j = true;
    protected int[] h = {270, 25, 12, 10000};
    protected int[] d = {0, 0, 0, 0, 0, 0, 0};

    protected void b() {
    }

    protected void c(String str, int i) {
    }

    protected void d() {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.f25608c = context;
        this.l = sectionBean;
        if (this.m) {
            Observer observer = new Observer() { // from class: sph
                @Override // com.huawei.haf.design.pattern.Observer
                public final void notify(String str, Object[] objArr) {
                    this.f48492a.b(str, objArr);
                }
            };
            this.i = observer;
            ObserverManagerUtil.d(observer, "EXIT_APP");
            this.m = false;
        }
    }

    public /* synthetic */ void b(String str, Object[] objArr) {
        if ("EXIT_APP".equals(str)) {
            LogUtil.a("TwoModelBaseCardProvider", "StepsCardData EXIT_APP");
            b();
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("TwoModelBaseCardProvider", "parseParams");
        map.putAll(this.f);
        this.e = true;
        this.j = true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        if (this.n != null) {
            uin.e().d(this.n);
            this.n = null;
        }
        ObserverManagerUtil.c(this.i);
    }

    public void c(int i, int[] iArr, int[] iArr2) {
        this.f25607b = i;
        this.d = iArr;
        this.h = iArr2;
    }

    protected void e() {
        if (this.e) {
            this.f.clear();
            this.e = false;
        }
    }

    protected void c() {
        this.f.put("HEALTH_SHOW_TIME_UNIT", this.f25608c.getString(R.string.IDS_hw_health_show_time_unit));
        this.f.put("GOAL_THREE_CIRCLE_DATA", this.h);
        this.f.put("CURRENT_THREE_CIRCLE_DATA", this.d);
        this.f.put("SHOW_FITNESS_LISTENER", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ModelBaseCardProvider.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModelBaseCardProvider.this.i();
            }
        });
        this.f.put("BOTTOM_STEP_LISTENER", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ModelBaseCardProvider.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (WheelChairStateManager.a().d()) {
                    ModelBaseCardProvider.this.l();
                } else if (tdy.a()) {
                    tdy.c();
                } else {
                    ModelBaseCardProvider.this.i();
                }
            }
        });
    }

    protected void h() {
        if (WheelChairStateManager.a().d()) {
            LogUtil.a("TwoModelBaseCardProvider", "processMsgUpdateDataOriginal isSwitchOn");
            this.f.put("SET_BACKGROUND_RESOURCE", Integer.valueOf(R.drawable.ic_health_information));
            this.f.put("SET_FITNESS_DATA_ORIGIN_ICON2VISIBLE", 0);
            return;
        }
        if (tdy.a()) {
            LogUtil.a("TwoModelBaseCardProvider", "processMsgUpdateDataOriginal ShowPermissionTip");
            this.f.put("SET_BACKGROUND_RESOURCE", Integer.valueOf(R.drawable.ic_activity_information));
            this.f.put("SET_FITNESS_DATA_ORIGIN_ICON2VISIBLE", 0);
            if (tdy.e()) {
                ipb.b("4");
                tdy.h();
                return;
            }
            return;
        }
        this.f.put("SET_BACKGROUND_RESOURCE", Integer.valueOf(R.drawable.ic_health_information));
        if (njy.b(uin.e().c())) {
            if (this.o == this.d[3]) {
                LogUtil.a("TwoModelBaseCardProvider", "processOriginListData mLastShowTipsStep == mSteps");
                return;
            }
            LogUtil.a("TwoModelBaseCardProvider", "processMsgUpdateDataOriginal show Original icon ");
            int i = this.d[3];
            this.o = i;
            tdy.a(this.f25608c, i);
            if ("".equals(SharedPreferenceManager.e(this.f25608c, String.valueOf(10000), "data_origin_icon_red_dot"))) {
                this.f.put("IS_SHOW_STEP_ICON", true);
            } else {
                this.f.put("SET_BACKGROUND_RESOURCE", Integer.valueOf(R.drawable.ic_health_information));
            }
            this.f.put("SET_FITNESS_DATA_ORIGIN_ICON2VISIBLE", 0);
            return;
        }
        LogUtil.a("TwoModelBaseCardProvider", "processMsgUpdateDataOriginal hide Original icon ");
        this.f.put("SET_FITNESS_DATA_ORIGIN_ICON2VISIBLE", 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        int i;
        final DeviceInfo deviceInfoB = myk.b("TwoModelBaseCardProvider");
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        final boolean z = deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(deviceInfoB);
        if (z) {
            i = R.string.IDS_wheel_dialog_setting;
        } else {
            i = R.string.IDS_settings_about_huawei_cloud_service_action_turn_off;
        }
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f25608c);
        builder.d(R.string.IDS_settings_wheelchair_mode).d(R.string.IDS_function_set_know, new DialogInterface.OnClickListener() { // from class: spj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LogUtil.a("TwoModelBaseCardProvider", "onClickWheelDialog cancel");
            }
        }).a(i, new DialogInterface.OnClickListener() { // from class: spi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f48494c.a(z, deviceInfoB, dialogInterface, i2);
            }
        }).c(R.string.IDS_settings_wheelchair_mode_message).e(false);
        CustomAlertDialog customAlertDialogB = builder.b();
        if (customAlertDialogB.isShowing()) {
            return;
        }
        customAlertDialogB.show();
    }

    public /* synthetic */ void a(boolean z, DeviceInfo deviceInfo, DialogInterface dialogInterface, int i) {
        ReleaseLogUtil.d("TwoModelBaseCardProvider", "onClickWheelDialog positive isSupportDevice:", Boolean.valueOf(z));
        if (z) {
            tdy.c(deviceInfo, this.f25608c);
        } else {
            WheelChairStateManager.a(false);
        }
    }

    protected void i() {
        LogUtil.a("TwoModelBaseCardProvider", "showFitnessDataOriginDialog()");
        if (tdy.a()) {
            tdy.c();
            return;
        }
        e();
        this.f.put("SET_BACKGROUND_RESOURCE", Integer.valueOf(R.drawable.ic_health_information));
        if ("".equals(SharedPreferenceManager.e(this.f25608c, String.valueOf(10000), "data_origin_icon_red_dot"))) {
            SharedPreferenceManager.e(this.f25608c, String.valueOf(10000), "data_origin_icon_red_dot", "false", new StorageParams());
        }
        uin.e().a(this.f25608c, tdy.d());
        f();
    }

    public void e(HealthOpenSDK healthOpenSDK) {
        this.g = healthOpenSDK;
    }

    protected void j() {
        LogUtil.a("TwoModelBaseCardProvider", "setCardChangedListener");
        this.f.put("TWO_MODEL_SWITCH", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ModelBaseCardProvider.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("TwoModelBaseCardProvider", "switch is onClick");
                if (!fsd.e || Math.abs(System.currentTimeMillis() - fsd.d) < 2000) {
                    LogUtil.e("TwoModelBaseCardProvider", "click too fast");
                    return;
                }
                fsd.d = System.currentTimeMillis();
                fsb.b(true);
                if (!qrs.aa(ModelBaseCardProvider.this.f25608c)) {
                    ModelBaseCardProvider.this.d();
                }
                ModelBaseCardProvider.this.e();
                if (qrs.aa(ModelBaseCardProvider.this.f25608c)) {
                    ModelBaseCardProvider.this.f.put("NOTIFY_MODEL_CHANGED", false);
                } else {
                    ModelBaseCardProvider.this.f.put("NOTIFY_MODEL_CHANGED", false);
                }
                ModelBaseCardProvider.this.f();
            }
        });
    }

    public void a(int i) {
        e();
        this.f.put("UPDATE_MSG_RED_DOT_VISIBILITY", Integer.valueOf(i));
        f();
    }

    public void d(String str) {
        e();
        this.f.put("SET_MSG_RED_DOT_TEXT", str);
        f();
    }

    protected void g() {
        tdy.b(this.g, this.f25608c, this.d[1]);
    }

    public void a() {
        if (this.e) {
            e();
        }
        this.f.put("SET_BACKGROUND_RESOURCE", Integer.valueOf(R.drawable.ic_health_information));
        f();
    }

    protected void f() {
        LogUtil.a("TwoModelBaseCardProvider", "operation card refreshSection");
        c();
        if (this.j) {
            this.l.c(new Object());
            this.j = false;
        }
    }
}
