package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.RelativeLayout;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.listener.ILayoutCreatedCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.R;
import defpackage.mhs;
import defpackage.qjy;
import defpackage.wud;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class CoreSleepToastProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f26656a;
    private Context d;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("CoreSleepToastProvider", "loadData");
        this.d = context;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("CoreSleepToastProvider", "parseParams");
        map.put("FULL_SCREEN_CALLBACK", new ILayoutCreatedCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.CoreSleepToastProvider.2
            @Override // com.huawei.health.knit.section.listener.ILayoutCreatedCallback
            public void onLayoutUpdate(RelativeLayout relativeLayout) {
                LogUtil.a("CoreSleepToastProvider", "onLayoutUpdate, view: ", relativeLayout);
                CoreSleepToastProvider.this.f26656a = relativeLayout;
                CoreSleepToastProvider.this.c();
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        LogUtil.a("CoreSleepToastProvider", "resume");
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("CoreSleepToastProvider", "configToast sleep");
        if (this.f26656a == null) {
            LogUtil.a("CoreSleepToastProvider", "mCoreSleepBtnTipsLayout is null");
            return;
        }
        boolean isLogined = LoginInit.getInstance(this.d).getIsLogined();
        LogUtil.a("CoreSleepToastProvider", "onResume ", "isLogin = ", Boolean.valueOf(isLogined));
        if (isLogined && wud.e()) {
            LogUtil.a("CoreSleepToastProvider", "DeviceConnectState.DEVICE_CONNECTED");
            mhs.a().getSwitchSetting("core_sleep_button", new IBaseResponseCallback() { // from class: txe
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f49752c.c(i, obj);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("CoreSleepToastProvider", "coreSleep btn errorCode = ", Integer.valueOf(i));
        if (i == -1) {
            e();
            return;
        }
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            LogUtil.a("CoreSleepToastProvider", "info = ", str);
            if ("0".equals(str)) {
                e();
                return;
            }
            return;
        }
        LogUtil.j("CoreSleepToastProvider", "currentDevice don't support CoreSleep.");
    }

    private void e() {
        LogUtil.a("CoreSleepToastProvider", "showSwitch");
        qjy.d(this.d, new IBaseResponseCallback() { // from class: txd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49751c.b(i, obj);
            }
        }, this.f26656a, this.d.getResources().getString(R.string.IDS_core_sleep_switch_dialog_note), new String[]{"core_sleep_btn_tips_do_not_remind_again", "core_sleep_btn_tips_intervals", "core_sleep_btn_tips_cnt", "core_sleep_btn_tips_if_show"});
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setPackage(BaseApplication.getAppPackage());
            intent.putExtra("core_sleep_active_open_control_btn", true);
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity");
            try {
                this.d.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                LogUtil.e("CoreSleepToastProvider", "ActivityNotFoundException", e.getMessage());
            }
        }
    }
}
