package com.huawei.ui.main.stories.ihealthlabs.freeindoorrunning;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.main.R;
import defpackage.ive;
import defpackage.iyg;
import defpackage.lmf;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class FreeIndoorRunningActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f28362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSwitchButton f28363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f28364c;
    private HealthButton d;
    private Context e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("FreeIndoorRunningActivity", "onCreate");
        setContentView(R.layout.activity_ihealth_free_indoor_running);
        this.e = BaseApplication.getContext();
        a();
    }

    private void a() {
        this.f28362a = (ImageView) findViewById(R.id.free_indoor_running_background);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.free_indoor_running_background_layout);
        this.f28364c = linearLayout;
        qrs.b(linearLayout, 2);
        HealthButton healthButton = (HealthButton) findViewById(R.id.experience_now);
        this.d = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: vrn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51532a.e(view);
            }
        });
        this.f28363b = (HealthSwitchButton) qsp.a(this, R.id.switch_free_indoor_running);
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(20002), "ihealthlabs");
        LogUtil.a("FreeIndoorRunningActivity", "isOpenIndoorRunning is ", strE);
        if (strE != null && "true".equals(strE)) {
            this.f28363b.setChecked(true);
            this.d.setAlpha(1.0f);
            this.d.setClickable(true);
        } else {
            this.f28363b.setChecked(false);
            this.d.setAlpha(0.5f);
            this.d.setClickable(false);
        }
        this.f28363b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.ihealthlabs.freeindoorrunning.FreeIndoorRunningActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f28365a.e(compoundButton, z);
            }
        });
        boolean zBa = LanguageUtil.ba(this.e);
        BitmapDrawable bitmapDrawableE = qqz.e(this.e, R.drawable.pic_indoor_run);
        if (zBa) {
            this.f28362a.setImageDrawable(bitmapDrawableE);
        } else {
            this.f28362a.setImageDrawable(this.e.getResources().getDrawable(R.drawable.pic_indoor_run));
        }
    }

    public /* synthetic */ void e(View view) {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).checkUserInfo(this, new IBaseResponseCallback() { // from class: vrq
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.c(i, obj);
            }
        });
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (i != 0) {
            b();
        }
    }

    /* synthetic */ void e(CompoundButton compoundButton, boolean z) {
        LogUtil.a("FreeIndoorRunningActivity", " mFreeIndoorRunningSwitchButton isChedked is ", Boolean.valueOf(z));
        d(z);
    }

    private void d(boolean z) {
        HashMap map = new HashMap(1);
        if (z) {
            iyg.e(true);
            map.put("switch", "ON");
            this.d.setAlpha(1.0f);
            this.d.setClickable(true);
        } else {
            iyg.e(false);
            map.put("switch", "OFF");
            this.d.setAlpha(0.5f);
            this.d.setClickable(false);
        }
        lmf.d().c(getApplicationContext(), AnalyticsValue.BI_TRACK_CLICK_VIBRATE_STEPCOUNT_SWITCH_1040049.value(), map, 0);
    }

    private void b() {
        a(this.e);
        ive.c().e(0, 264, c(this.e, "sport_target_type_indoor_running"), a(this.e, "sport_target_value_indoor_running"), (ISportDataCallback) null, this.e);
    }

    private void a(Context context) {
        LogUtil.a("FreeIndoorRunningActivity", "tickBIStartFreeIndoorRunning");
        HashMap map = new HashMap(1);
        map.put("click", "1");
        lmf.d().c(context, AnalyticsValue.START_FREE_INDOOR_RUNNING.value(), map, 0);
    }

    private float a(Context context, String str) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), str);
        if (e(strE)) {
            return -1.0f;
        }
        return CommonUtil.f(strE);
    }

    private int c(Context context, String str) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), str);
        if (e(strE)) {
            return -1;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("FreeIndoorRunningActivity", "getDifferentSportTargetType NumberFormatException");
            return -1;
        }
    }

    private boolean e(String str) {
        return str == null || "".equals(str) || "-1".equals(str);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
