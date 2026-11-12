package com.huawei.ui.homehealth.threecirclecard;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.stepscard.StepsCardViewHolder;
import defpackage.ddv;
import defpackage.ffv;
import defpackage.ipb;
import defpackage.lmf;
import defpackage.myk;
import defpackage.njy;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.qsr;
import defpackage.tbf;
import defpackage.tbh;
import defpackage.tdy;
import defpackage.uin;
import defpackage.ujq;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class TwoModelBaseCard extends AbstractBaseCardData implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f26122c;
    protected int e;
    private CommonSingleCallback<Boolean> f;
    protected tbf i;
    private final Observer j;
    private CardViewBaseHolder g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthOpenSDK f26121b = null;
    private int h = 0;
    protected int[] d = {270, 25, 12, 10000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f26120a = {0, 0, 0, 0, 0, 0, 0};

    protected void b() {
    }

    protected void b(String str, int i) {
    }

    protected void e() {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
    }

    public TwoModelBaseCard(Context context) {
        this.f26122c = context;
        Observer observer = new Observer() { // from class: tct
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                this.d.b(str, objArr);
            }
        };
        this.j = observer;
        ObserverManagerUtil.d(observer, "EXIT_APP");
    }

    public /* synthetic */ void b(String str, Object[] objArr) {
        if ("EXIT_APP".equals(str)) {
            LogUtil.a("Step_TwoModelBaseCard", "StepsCardData EXIT_APP");
            b();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "TwoModelBaseCard";
    }

    public void b(int i, int[] iArr, int[] iArr2) {
        this.e = i;
        this.f26120a = iArr;
        this.d = iArr2;
    }

    protected void i(View view) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            marginLayoutParams.setMarginStart(this.f26122c.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) + ((Integer) safeRegionWidth.first).intValue());
            marginLayoutParams.setMarginEnd(this.f26122c.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd) + ((Integer) safeRegionWidth.second).intValue());
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        if (this.f != null) {
            uin.e().d(this.f);
            this.f = null;
        }
        ObserverManagerUtil.c(this.j);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (layoutInflater == null) {
            LogUtil.e("Step_TwoModelBaseCard", "getCardViewHolder layoutInflater == null");
            layoutInflater = LayoutInflater.from(BaseApplication.getContext());
        }
        StepsCardViewHolder stepsCardViewHolder = new StepsCardViewHolder(layoutInflater.inflate(R.layout.layout_step_card_container, viewGroup, false), this.f26122c, false);
        BaseActivity.setViewSafeRegion(true, stepsCardViewHolder.getHomeStepCardLayout());
        return stepsCardViewHolder;
    }

    public void f_() {
        if (d() != null) {
            if (WheelChairStateManager.a().d()) {
                LogUtil.a("Step_TwoModelBaseCard", "processMsgUpdateDataOriginal isSwitchOn");
                d().c().setBackgroundResource(R.drawable.ic_health_information);
                d().d(0);
                return;
            }
            if (tdy.a()) {
                LogUtil.a("Step_TwoModelBaseCard", "processMsgUpdateDataOriginal ShowPermissionTip");
                d().c().setBackgroundResource(R.drawable.ic_activity_information);
                d().d(0);
                if (tdy.e()) {
                    ipb.b("4");
                    tdy.h();
                    return;
                }
                return;
            }
            d().c().setBackgroundResource(R.drawable.ic_health_information);
            if (njy.b(uin.e().c())) {
                if (this.h == this.f26120a[3]) {
                    LogUtil.a("Step_TwoModelBaseCard", "processOriginListData mLastShowTipsStep == mSteps");
                    return;
                }
                LogUtil.a("Step_TwoModelBaseCard", "processMsgUpdateDataOriginal show Original icon ");
                int i = this.f26120a[3];
                this.h = i;
                tdy.a(this.f26122c, i);
                if ("".equals(SharedPreferenceManager.e(this.f26122c, String.valueOf(10000), "data_origin_icon_red_dot"))) {
                    c();
                } else {
                    d().c().setBackgroundResource(R.drawable.ic_health_information);
                }
                d().d(0);
                return;
            }
            LogUtil.a("Step_TwoModelBaseCard", "processMsgUpdateDataOriginal hide Original icon ");
            d().d(8);
        }
    }

    private void c() {
        if (this.f26122c == null || d() == null) {
            ReleaseLogUtil.e("Step_TwoModelBaseCard", "isRtlImage obj is null");
            return;
        }
        int i = R.drawable.ic_health_information_new;
        if (LanguageUtil.ba(this.f26122c)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.f26122c, i);
            if (bitmapDrawableE == null) {
                d().c().setBackgroundResource(i);
                return;
            } else {
                d().c().setBackground(bitmapDrawableE);
                return;
            }
        }
        d().c().setBackgroundResource(i);
    }

    public void onClick(View view) {
        if (qrs.r()) {
            LogUtil.a("Step_TwoModelBaseCard", "click too fast");
            return;
        }
        if (view == null) {
            LogUtil.e("Step_TwoModelBaseCard", "onClick view == null");
            return;
        }
        if (view.getId() == R.id.data_origin_icon_layout) {
            f();
        }
        if (view.getId() == R.id.bottom_step_tip_layout) {
            if (WheelChairStateManager.a().d()) {
                h();
            } else if (tdy.a()) {
                tdy.c();
            } else {
                f();
            }
        }
    }

    private void h() {
        int i;
        final DeviceInfo deviceInfoB = myk.b("Step_TwoModelBaseCard");
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        final boolean z = deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(deviceInfoB);
        if (z) {
            i = R.string.IDS_wheel_dialog_setting;
        } else {
            i = R.string.IDS_settings_about_huawei_cloud_service_action_turn_off;
        }
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f26122c);
        builder.d(R.string.IDS_settings_wheelchair_mode).d(R.string.IDS_function_set_know, new DialogInterface.OnClickListener() { // from class: tcx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LogUtil.a("Step_TwoModelBaseCard", "onClickWheelDialog cancel");
            }
        }).a(i, new DialogInterface.OnClickListener() { // from class: tcv
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.e.c(z, deviceInfoB, dialogInterface, i2);
            }
        }).c(R.string.IDS_settings_wheelchair_mode_message).e(false);
        CustomAlertDialog customAlertDialogB = builder.b();
        if (customAlertDialogB.isShowing()) {
            return;
        }
        customAlertDialogB.show();
    }

    public /* synthetic */ void c(boolean z, DeviceInfo deviceInfo, DialogInterface dialogInterface, int i) {
        ReleaseLogUtil.d("Step_TwoModelBaseCard", "onClickWheelDialog positive isSupportDevice:", Boolean.valueOf(z));
        if (z) {
            tdy.c(deviceInfo, this.f26122c);
        } else {
            WheelChairStateManager.a(false);
        }
    }

    private void f() {
        if (d() == null || d().c() == null || d().c().getVisibility() != 0) {
            return;
        }
        k();
    }

    protected void k() {
        LogUtil.a("Step_TwoModelBaseCard", "showFitnessDataOriginDialog()");
        if (d() == null) {
            LogUtil.e("Step_TwoModelBaseCard", "showFitnessDataOriginDialog mStepsCardViewHolder == null");
            return;
        }
        if (tdy.a()) {
            tdy.c();
            return;
        }
        d().c().setBackgroundResource(R.drawable.ic_health_information);
        if ("".equals(SharedPreferenceManager.e(this.f26122c, String.valueOf(10000), "data_origin_icon_red_dot"))) {
            SharedPreferenceManager.e(this.f26122c, String.valueOf(10000), "data_origin_icon_red_dot", "false", new StorageParams());
        }
        uin.e().a(this.f26122c, tdy.d());
    }

    public void e(tbf tbfVar) {
        this.i = tbfVar;
    }

    public void a(HealthOpenSDK healthOpenSDK) {
        this.f26121b = healthOpenSDK;
    }

    public CardViewBaseHolder d() {
        return this.g;
    }

    protected void c(final String str) {
        if (d() == null || d().h() == null) {
            LogUtil.j("Step_TwoModelBaseCard", "setCardChangedListener getViewHolder() is null.");
        } else {
            LogUtil.a("Step_TwoModelBaseCard", "setCardChangedListener");
            d().h().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Step_TwoModelBaseCard", "switch is onClick");
                    if (!tbh.f48930c || Math.abs(System.currentTimeMillis() - tbh.f48929a) < 2000) {
                        LogUtil.e("Step_TwoModelBaseCard", "click too fast");
                        return;
                    }
                    if (TwoModelBaseCard.this.i != null) {
                        TwoModelBaseCard.this.i();
                        tbh.f48929a = System.currentTimeMillis();
                        TwoModelBaseCard.this.a();
                        if (!qrs.aa(TwoModelBaseCard.this.f26122c)) {
                            TwoModelBaseCard.this.e();
                        }
                        TwoModelBaseCard.this.i.a(str);
                        return;
                    }
                    LogUtil.e("Step_TwoModelBaseCard", "mStepsCardManager is null");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (d() == null) {
            return;
        }
        d().i();
        this.i.e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("Step_TwoModelBaseCard", "showHealthLifeGuideDialog isBrowseMode");
            return;
        }
        if (ffv.l()) {
            LogUtil.a("Step_TwoModelBaseCard", "showHealthLifeGuideDialog isHealthLife true");
            return;
        }
        if (ffv.t() && ffv.s() && TextUtils.isEmpty(ffv.a()) && qsr.c().g()) {
            LogUtil.a("Step_TwoModelBaseCard", "oldUserShowHealthLifeGuideDialog");
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath("#/GuidePage?entrance=model_switch");
            ddv.b().loadH5ProApp(this.f26122c, "com.huawei.health.h5.health-clovers", builder);
            ffv.i(1);
        }
    }

    public void b(int i) {
        if (d() == null) {
            return;
        }
        d().c(i);
    }

    public void e(String str) {
        if (d() == null) {
            return;
        }
        d().b(str);
    }

    protected void m() {
        if (d().a() != null) {
            d().a().setOnClickListener(this);
        } else if (d().c() != null) {
            d().c().setOnClickListener(this);
            d().d(8);
        }
    }

    protected void q() {
        ReleaseLogUtil.d("Step_TwoModelBaseCard", "click into steps = ", Integer.valueOf(this.f26120a[3]));
        HealthOpenSDK healthOpenSDK = this.f26121b;
        Context context = this.f26122c;
        int[] iArr = this.f26120a;
        tdy.e(healthOpenSDK, context, iArr[3], iArr[4]);
    }

    protected void t() {
        tdy.b(this.f26121b, this.f26122c, this.f26120a[1]);
    }

    protected void p() {
        ujq.d();
        tdy.a(this.f26121b, this.f26122c, this.f26120a[0]);
    }

    protected void l() {
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(this.f26122c, AnalyticsValue.HEALTH_TIME_STRENGTH_CLICK_2010098.value(), map, 0);
        ujq.b(4);
        t();
    }

    public void n() {
        if (d() == null || d().c() == null) {
            LogUtil.j("Step_TwoModelBaseCard", "holder or view is null");
        } else {
            d().c().setBackgroundResource(R.drawable.ic_health_information);
        }
    }
}
