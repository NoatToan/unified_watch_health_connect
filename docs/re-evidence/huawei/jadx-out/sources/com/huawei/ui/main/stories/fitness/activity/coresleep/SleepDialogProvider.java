package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.view.View;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import defpackage.ddv;
import defpackage.fua;
import defpackage.gxq;
import defpackage.pjo;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class SleepDialogProvider extends MinorProvider<gxq> {
    private Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26791a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26793c = false;
    private int d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickSectionListener f26792b = new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepDialogProvider.5
        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
            if ("LEFT_BUTTON_TEXT".equals(str)) {
                if (SleepDialogProvider.this.f26793c) {
                    SharedPreferenceManager.e(SleepDialogProvider.this.e, Integer.toString(10000), "CANCEL_3", "1", null);
                    return;
                }
                if (SleepDialogProvider.this.d == 1) {
                    SharedPreferenceManager.e(SleepDialogProvider.this.e, Integer.toString(10000), "CANCEL_1", "1", null);
                    return;
                } else if (SleepDialogProvider.this.d == 2) {
                    SharedPreferenceManager.e(SleepDialogProvider.this.e, Integer.toString(10000), "CANCEL_2", "1", null);
                    return;
                } else if (SleepDialogProvider.this.d == 3) {
                    SharedPreferenceManager.e(SleepDialogProvider.this.e, Integer.toString(10000), "CANCEL_3", "1", null);
                    return;
                }
            }
            if ("RIGHT_BUTTON_TEXT".equals(str)) {
                SleepDialogProvider.this.a();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ddv.b().loadH5ProApp(this.e, "com.huawei.health.h5.sleepdetection", new H5ProLaunchOption.Builder().addPath("#/SleepSetting").addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SleepDetection", pjo.b().getJsModule()).setForceDarkMode(1).setImmerse().showStatusBar().setStatusBarTextBlack(true));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f26791a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        int iD = d(BaseApplication.getContext());
        this.d = iD;
        if (iD == 0) {
            this.f26791a = false;
            sectionBean.d(this, gxqVar);
        } else if (!fua.c(BaseApplication.getContext())) {
            this.f26791a = false;
            sectionBean.d(this, gxqVar);
        } else if (gxqVar.n() != SleepViewConstants.SleepTypeEnum.PHONE) {
            this.f26791a = false;
            sectionBean.d(this, gxqVar);
        } else {
            this.f26791a = true;
            sectionBean.d(this, gxqVar);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        this.e = context;
        LogUtil.a("SleepDialogProvider", "parseParams");
        if (gxqVar == null) {
            return;
        }
        map.put("LEFT_BUTTON_TEXT", context.getResources().getString(R.string.IDS_main_btn_state_ignore));
        map.put("RIGHT_BUTTON_TEXT", context.getResources().getString(R.string.IDS_sleep_input_text21));
        int i = this.d;
        if (i == 1) {
            map.put("REPORT_TEXT", context.getResources().getString(R.string.IDS_sleep_input_text18));
        } else if (i == 2) {
            map.put("REPORT_TEXT", context.getResources().getString(R.string.IDS_sleep_input_text20));
        } else if (i == 3) {
            map.put("REPORT_TEXT", context.getResources().getString(R.string.IDS_sleep_input_text19));
        } else {
            LogUtil.a("SleepDialogProvider", "no type");
        }
        map.put("CLICK_EVENT_LISTENER", this.f26792b);
    }

    private int d(Context context) {
        try {
            JSONObject jSONObject = new JSONObject(SharedPreferenceManager.e(context, Integer.toString(10000), "SLEEP_RECORD_ALARM_INFO"));
            boolean zOptBoolean = jSONObject.optBoolean("enabled");
            boolean zOptBoolean2 = jSONObject.optBoolean("enableRecord");
            boolean zOptBoolean3 = jSONObject.optBoolean("isSleepRemind");
            LogUtil.a("SleepDialogProvider", "plan: ", Boolean.valueOf(zOptBoolean), ", record: ", Boolean.valueOf(zOptBoolean2), ", notice: ", Boolean.valueOf(zOptBoolean3));
            if (!zOptBoolean && !"1".equals(SharedPreferenceManager.e(context, Integer.toString(10000), "CANCEL_1"))) {
                return 1;
            }
            if (!zOptBoolean2 && !"1".equals(SharedPreferenceManager.e(context, Integer.toString(10000), "CANCEL_2"))) {
                return 2;
            }
            if (zOptBoolean3 || "1".equals(SharedPreferenceManager.e(context, Integer.toString(10000), "CANCEL_3"))) {
                return 0;
            }
            if (zOptBoolean) {
                return 3;
            }
            this.f26793c = true;
            return 1;
        } catch (JSONException unused) {
            LogUtil.e("SleepDialogProvider", "JSONException");
            return 0;
        }
    }
}
