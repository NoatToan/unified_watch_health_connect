package com.xiaomi.hm.health.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.event.EventAccountStatus;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.moving.sport.ui.activity.SportDetailPageActivity;
import com.huami.moving.ui.sport.in.GPSMainActivity;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.apprate.AppRateDialog;
import com.xiaomi.hm.health.bodyfat.activity.BabyWeightActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightConnectActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightingActivity;
import com.xiaomi.hm.health.bodyfat.family.MemberInfoSetWeightActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.eventbus.EventAppInBackground;
import com.xiaomi.hm.health.lab.activity.MonkeyBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.activity.ShoesBehaviorTaggingActivity;
import com.xiaomi.hm.health.mainpage.LBEResultAnalytics;
import com.xiaomi.hm.health.training.ui.activity.TrainingHistoryActivity;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public class BraceletForegroundCallBack implements Application.ActivityLifecycleCallbacks {
    private static final String i = "HMActivity";
    private static final Queue<Activity> j = new ConcurrentLinkedQueue();
    private final Application a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private final Class[] f;
    private final Class[] g;
    private final Class[] h;

    public static class a {

        @SuppressLint({"StaticFieldLeak"})
        private static final BraceletForegroundCallBack a = new BraceletForegroundCallBack((Application) BraceletApp.getContext());

        private a() {
        }
    }

    private BraceletForegroundCallBack(Application application) {
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = false;
        this.f = new Class[]{GPSMainActivity.class, ShoesBehaviorTaggingActivity.class, MonkeyBehaviorTaggingActivity.class};
        this.g = new Class[]{WeightConnectActivity.class, WeightingActivity.class, BabyWeightActivity.class, MemberInfoSetWeightActivity.class};
        this.h = new Class[]{FeedbackActivity.class};
        this.a = application;
        EventBus.getDefault().register(this);
    }

    private void c() {
        for (HMDeviceType hMDeviceType : HMDeviceConfig.needDestroyInBackground()) {
            if (hMDeviceType != HMDeviceType.HEADSET) {
                HMDeviceManager.getInstance().createDevice(hMDeviceType);
            } else {
                HMDeviceManager.getInstance().refreshMozartDeviceState();
            }
        }
    }

    private void d(Activity activity) {
        for (HMDeviceType hMDeviceType : HMDeviceConfig.needDestroyInBackground()) {
            if (HMFwUpgradeManager.getInstance().isUpgrading(hMDeviceType) || HMFwOnlineUpgradeManager.getInstance().isUpgrading(hMDeviceType)) {
                HMLog.i(i, hMDeviceType.name() + "设备正在升级!不可进行释放", new Object[0]);
            } else {
                HMDeviceType hMDeviceType2 = HMDeviceType.WEIGHT;
                if ((hMDeviceType == hMDeviceType2 || !h(activity)) && ((hMDeviceType != hMDeviceType2 || !i(activity, this.g)) && (hMDeviceType != HMDeviceType.HEADSET || !j(activity)))) {
                    HMDeviceManager.getInstance().destroyDevice(hMDeviceType);
                }
            }
        }
    }

    private void e(Activity activity) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d = false;
        HMLog.i(i, "==================BACKGROUND==================", new Object[0]);
        d(activity);
        if (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE) {
            HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
            HMFwUpgradeManager.getInstance().enableFwUpgrade(true);
        } else {
            HMFwUpgradeManager.getInstance().enableFwUpgrade(true);
        }
        LBEResultAnalytics.onFrontBackgroundSwitch(false);
        EventBus.getDefault().postSticky(new EventAppInBackground(true));
        Analytics.recordEvent(new CountEventBuilder(StatEvent.APP_ENTER_BACKGROUND));
    }

    private void f(Activity activity) {
        if (this.d) {
            return;
        }
        this.d = true;
        this.e = false;
        HMLog.i(i, "==================FOREGROUND==================", new Object[0]);
        c();
        EventBus.getDefault().postSticky(new EventAppInBackground(false));
        Analytics.recordEvent(new CountEventBuilder(StatEvent.APP_ENTER_FOREGROUND));
        FwUnZipStatusHolder.onEnterForeground();
        LBEResultAnalytics.onFrontBackgroundSwitch(true);
        n();
    }

    @Nullable
    private static <T> T g(Queue<T> queue) {
        Iterator<T> it2 = queue.iterator();
        T next = null;
        while (it2.hasNext()) {
            next = it2.next();
        }
        return next;
    }

    public static BraceletForegroundCallBack getInstance() {
        return a.a;
    }

    @Nullable
    public static Activity getTopActivity() {
        return (Activity) g(j);
    }

    private boolean h(Activity activity) {
        return i(activity, this.f);
    }

    private boolean i(Activity activity, Class[] classes) {
        for (Class cls : classes) {
            if (cls.getName().equals(activity.getClass().getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean j(Activity activity) {
        final boolean zI = i(activity, this.h);
        final boolean zIsSyncingData = HMDeviceManager.getInstance().isSyncingData(HMDeviceType.HEADSET);
        HMLog.info(i, new Function0() { // from class: a70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletForegroundCallBack.k(zI, zIsSyncingData);
            }
        });
        return zI || zIsSyncingData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(boolean z, boolean z2) {
        return "ignoreActivityClass :" + z + ",syncingData:" + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(String str, int i2, boolean z) {
        return "timeZone info, id: " + str + ", offset: " + i2 + ", dst: " + z;
    }

    private static void m(Activity activity) {
        Queue<Activity> queue = j;
        if (!queue.isEmpty()) {
            queue.poll();
        }
        HMLog.d(i, "<<<<<<after pop size:" + queue.size() + " top:" + getTopActivity(), new Object[0]);
    }

    private void n() {
        Calendar calendar = Calendar.getInstance();
        final String id = calendar.getTimeZone().getID();
        final int offset = calendar.getTimeZone().getOffset(calendar.getTimeInMillis());
        final boolean zInDaylightTime = calendar.getTimeZone().inDaylightTime(calendar.getTime());
        HMLog.info(i, new Function0() { // from class: z60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletForegroundCallBack.l(id, offset, zInDaylightTime);
            }
        });
    }

    private static void o(Activity activity) {
        Queue<Activity> queue = j;
        queue.offer(activity);
        HMLog.d(i, ">>>>>>after push size:" + queue.size() + " top:" + getTopActivity(), new Object[0]);
    }

    public String appStatus() {
        return this.d ? "front" : "back";
    }

    public boolean isForeground() {
        return this.d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        HMActivityManager.INSTANCE.addActivity(activity);
        HMLog.i(i, "onActivityCreated:" + activity.getClass().getSimpleName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        HMActivityManager.INSTANCE.removeActivity(activity);
        Activity topActivity = getTopActivity();
        if (activity instanceof SportDetailPageActivity) {
            if (topActivity instanceof FragmentActivity) {
                AppRateDialog.show((FragmentActivity) topActivity);
            }
        } else if ((activity instanceof TrainingPlayActivity) && (topActivity instanceof TrainingHistoryActivity)) {
            AppRateDialog.show((FragmentActivity) topActivity);
        }
        HMLog.i(i, "onActivityDestroyed:" + activity.getClass().getSimpleName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        HMLog.i(i, "onActivityPaused:" + activity.getClass().getSimpleName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        HMEnterAppUtils.postActiveHistory(this.a);
        HMLog.i(i, "onActivityResumed:" + activity.getClass().getSimpleName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        HMLog.i(i, "onActivitySaveInstanceState:" + activity.getClass().getSimpleName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        HMLog.i(i, "onActivityStarted:" + activity.getClass().getSimpleName(), new Object[0]);
        this.b = this.b + 1;
        o(activity);
        if (this.b > this.c) {
            f(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        HMLog.i(i, "onActivityStopped:" + activity.getClass().getSimpleName(), new Object[0]);
        this.c = this.c + 1;
        m(activity);
        if (this.c >= this.b) {
            e(activity);
        }
    }

    public void onEventMainThread(EventAccountStatus event) {
        HMLog.i(i, "onEventMainThread EventAccountStatus~", new Object[0]);
        int status = event.getStatus();
        if (status == 1 || status == 2) {
            if (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE) {
                HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
                HMFwUpgradeManager.getInstance().enableFwUpgrade(true);
            } else {
                HMFwUpgradeManager.getInstance().enableFwUpgrade(true);
            }
            if (this.d) {
                c();
            }
        }
    }

    public void onEventMainThread(HMDeviceBindEvent event) {
        if (event.getDeviceType() == HMDeviceType.EARBUD) {
            return;
        }
        if (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE) {
            HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
            HMFwUpgradeManager.getInstance().enableFwUpgrade(true);
            if (event.isBound()) {
                HMFwOnlineManager.getInstance().checkFw(event.getDeviceType(), true);
                return;
            }
            return;
        }
        HMFwUpgradeManager.getInstance().enableFwUpgrade(true);
    }
}
