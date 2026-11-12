package com.huawei.health.ui.notification.uihandler;

import android.content.Context;
import android.os.Bundle;
import com.huawei.android.os.SystemPropertiesEx;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.health.connectivity.standstepcounter.StandStepCounterManager;
import com.huawei.health.ui.notification.common.IReporter;
import com.huawei.health.ui.notification.constants.UiComponent;
import com.huawei.health.ui.notification.uihandlers.HealthFaHelper;
import com.huawei.health.ui.notification.uihandlers.HealthNotificationHelper;
import com.huawei.health.ui.notification.uihandlers.HealthSmartCoverHelper;
import com.huawei.health.ui.notification.uihandlers.HealthWidgetHelper;
import defpackage.iuz;
import health.compact.a.EmuiBuild;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UiHandler;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes2.dex */
public class UiConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10316b;

    public UiConfig(Context context) {
        this.f10316b = null;
        if (context == null) {
            LogUtil.d("Step_UIConfig", "context is null in UiConfig");
        } else {
            this.f10316b = context;
        }
    }

    public boolean a() {
        return new StandStepCounterManager(this.f10316b).d(0) != null;
    }

    public void e(UiHandler uiHandler) {
        HealthNotificationHelper healthNotificationHelper = new HealthNotificationHelper(this.f10316b);
        if (uiHandler == null) {
            LogUtil.d("Step_UIConfig", "uiHandler is null");
            return;
        }
        if (a()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "init");
            bundle.putString("target", "all");
            a(uiHandler, UiComponent.NOTIFICATION, healthNotificationHelper, bundle);
        }
        a(uiHandler, UiComponent.SMART_COVER, new HealthSmartCoverHelper(this.f10316b), null);
        a(uiHandler, UiComponent.WIDGET, new HealthWidgetHelper(this.f10316b), null);
        if (!Utils.o()) {
            a(uiHandler, UiComponent.WEXIN_STEPS, new iuz(), null);
        }
        if (d()) {
            a(uiHandler, UiComponent.FA_CARD, new HealthFaHelper(this.f10316b), null);
        }
    }

    private void a(UiHandler uiHandler, UiComponent uiComponent, IReporter iReporter, Bundle bundle) {
        iReporter.onStart(bundle);
        uiHandler.d(uiComponent, iReporter);
    }

    private boolean d() {
        if (SystemInfo.e()) {
            return true;
        }
        if (EmuiBuild.e < 29) {
            return false;
        }
        boolean z = SystemPropertiesEx.getBoolean("hw_mc.launcher.ability_form_enable", true);
        ReleaseLogUtil.c("Step_UIConfig", "isSupportFaCard() ", Boolean.valueOf(z));
        return z;
    }
}
