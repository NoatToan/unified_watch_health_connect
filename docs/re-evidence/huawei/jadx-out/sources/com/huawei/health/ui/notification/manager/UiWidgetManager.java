package com.huawei.health.ui.notification.manager;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.huawei.health.manager.util.Consts;
import com.huawei.health.ui.notification.constants.UiComponent;
import com.huawei.health.ui.widget.HealthSportWidget;
import com.huawei.health.ui.widget.HonorWidgetProvider;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.AsyncInvocationHandler;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.UiHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class UiWidgetManager implements IUiWidgetManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f10313a;
    private UiHandler d = null;
    private Handler e;

    public UiWidgetManager(Context context) {
        this.f10313a = null;
        this.e = null;
        this.f10313a = new a();
        LogUtil.a("Step_UiWidgetManager", "registerDynamicBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.WIDGET_ENABLE");
        intentFilter.addAction("com.huawei.health.WIDGET_DISABLE");
        intentFilter.addAction("com.huawei.health.WIDGET_FORCE_UPDATE");
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        intentFilter.addAction("android.intent.action.WALLPAPER_CHANGED");
        if (context != null) {
            BroadcastManagerUtil.d(context, this.f10313a, intentFilter, Consts.d, null);
        }
        this.e = new Handler();
    }

    public IUiWidgetManager a() {
        Object objNewProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), getClass().getInterfaces(), new AsyncInvocationHandler(this));
        if (objNewProxyInstance instanceof IUiWidgetManager) {
            return (IUiWidgetManager) objNewProxyInstance;
        }
        return null;
    }

    public void b(UiHandler uiHandler) {
        if (uiHandler == null) {
            LogUtil.e("Step_UiWidgetManager", "uiHandler is null");
        } else {
            this.d = uiHandler;
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiWidgetManager
    public void enableWidget() {
        this.d.a(UiComponent.WIDGET);
        this.d.c();
    }

    @Override // com.huawei.health.ui.notification.manager.IUiWidgetManager
    public void disableWidget() {
        this.d.d(UiComponent.WIDGET);
    }

    @Override // com.huawei.health.ui.notification.manager.IUiWidgetManager
    public void forceUpdate() {
        this.d.c();
    }

    @Override // com.huawei.health.ui.notification.manager.IUiWidgetManager
    public void wallPaperChanged() {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            i += 1000;
            this.e.postDelayed(new Runnable() { // from class: com.huawei.health.ui.notification.manager.UiWidgetManager.2
                @Override // java.lang.Runnable
                public void run() {
                    UiWidgetManager.this.d.d(UiComponent.WIDGET);
                    UiWidgetManager.this.d.a(UiComponent.WIDGET);
                    UiWidgetManager.this.d.c();
                }
            }, i);
        }
    }

    class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            IUiWidgetManager iUiWidgetManagerA = UiWidgetManager.this.a();
            if (iUiWidgetManagerA == null) {
                LogUtil.j("Step_UiWidgetManager", "widgetManager is null");
                return;
            }
            if (action.equals("com.huawei.health.WIDGET_ENABLE")) {
                iUiWidgetManagerA.enableWidget();
                return;
            }
            if (action.equals("com.huawei.health.WIDGET_DISABLE")) {
                iUiWidgetManagerA.disableWidget();
                return;
            }
            if (action.equals("com.huawei.health.WIDGET_FORCE_UPDATE")) {
                iUiWidgetManagerA.forceUpdate();
                return;
            }
            if (action.equals("android.intent.action.CONFIGURATION_CHANGED")) {
                iUiWidgetManagerA.forceUpdate();
            } else if (!action.equals("android.intent.action.WALLPAPER_CHANGED")) {
                LogUtil.a("Step_UiWidgetManager", "BroadcastReceiver no action to do");
            } else {
                iUiWidgetManagerA.wallPaperChanged();
            }
        }
    }

    public static boolean a(Context context) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) HealthSportWidget.class));
        int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) HonorWidgetProvider.class));
        int[] appWidgetIds3 = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) XiaomiWidgetProvider.class));
        return (appWidgetIds == null && appWidgetIds2 == null && appWidgetIds3 == null) || ((appWidgetIds != null && appWidgetIds.length == 0) && (appWidgetIds2 != null && appWidgetIds2.length == 0) && (appWidgetIds3 != null && appWidgetIds3.length == 0));
    }

    public static boolean b(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) XiaomiWidgetProvider.class));
        return appWidgetIds == null || (appWidgetIds != null && appWidgetIds.length == 0);
    }
}
