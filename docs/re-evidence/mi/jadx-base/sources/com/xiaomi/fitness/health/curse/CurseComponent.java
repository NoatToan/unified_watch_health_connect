package com.xiaomi.fitness.health.curse;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.health.curse.CurseComponent;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.c0j;
import defpackage.s7r;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseComponent;", "", "<init>", "()V", "initInMainProcess", "", "initInDeviceProcess", "initCurse", "receiver", "com/xiaomi/fitness/health/curse/CurseComponent$receiver$1", "Lcom/xiaomi/fitness/health/curse/CurseComponent$receiver$1;", "migrationMenstruationSettings", "setupCurseAlarmPermission", "app", "Landroid/app/Application;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "Curse")
public final class CurseComponent {

    @NotNull
    private final CurseComponent$receiver$1 receiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.health.curse.CurseComponent$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Logger.i("CurseComponent", "onReceive: changed");
            ScopeExtKt.scope(Dispatchers.getIO(), new CurseComponent$receiver$1$onReceive$1(null));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void initCurse() {
        DeviceContact.Companion companion = DeviceContact.INSTANCE;
        DeviceSyncExtKt.getInstance(companion).addSyncStateListener(new SyncStateListener() { // from class: com.xiaomi.fitness.health.curse.CurseComponent.initCurse.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i("CurseComponent", "sync from CurseComponent " + did + ";(mainProcess)");
                CurseManager.INSTANCE.getInstance().syncCurse(did);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
            }
        });
        DeviceSyncExtKt.getInstance(companion).addDataHandler(8, new DataHandlerWrapper() { // from class: com.xiaomi.fitness.health.curse.CurseComponent.initCurse.2
            @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
            public boolean handlePacket(String did, int type, s7r packet) {
                Intrinsics.checkNotNullParameter(did, "did");
                if (packet == null || packet.f != 37) {
                    return false;
                }
                Logger.i("CurseComponent", "syncCurse from handle packet");
                CurseManager.INSTANCE.getInstance().syncCurse(did);
                return true;
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(this.receiver, intentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(this.receiver, intentFilter);
        }
        FitnessDataExtKt.getCurseApi().aggregateData(true);
        CurseManager.INSTANCE.getInstance().initData("mainProcessInit");
        setupCurseAlarmPermission(ApplicationExtKt.getApplication());
    }

    private final void migrationMenstruationSettings() {
        Application application = ApplicationExtKt.getApplication();
        if (new File(FileUtils.INSTANCE.getSharedPrefDir(application), "pref:menstruation.cloud_pref.xml").exists()) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("pref:menstruation.cloud_pref", 0);
            if (sharedPreferences.getAll().isEmpty()) {
                return;
            }
            CurseSetting curseSetting = new CurseSetting();
            String string = sharedPreferences.getString("cycle_days", "28");
            if (string != null) {
                curseSetting.setMenstrualCycle(Integer.parseInt(string));
            }
            String string2 = sharedPreferences.getString("menstruation_days", UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
            if (string2 != null) {
                curseSetting.setEstimatedMenstrualDays(Integer.parseInt(string2));
            }
            String string3 = sharedPreferences.getString("enable_remind_record", "false");
            if (string3 != null) {
                curseSetting.setAppPush(Boolean.parseBoolean(string3));
            }
            sharedPreferences.edit().clear().apply();
            Logger.i("CurseComponent", "migrationMenstruationSettings: cycle = " + curseSetting.getMenstrualCycle() + ", mensDay = " + curseSetting.getEstimatedMenstrualDays());
            DeviceSettingManager.INSTANCE.getInstance().saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting);
            application.deleteSharedPreferences("pref:menstruation.cloud_pref");
        }
    }

    private final void setupCurseAlarmPermission(Application app) {
        final CurseSetting setting = CurseManager.INSTANCE.getInstance().getSetting();
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        notificationPermission.addFuncName(new Function0() { // from class: q55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseComponent.setupCurseAlarmPermission$lambda$3(setting);
            }
        });
        notificationPermission.registerListener(new Function2() { // from class: r55
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CurseComponent.setupCurseAlarmPermission$lambda$4(setting, (Boolean) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair setupCurseAlarmPermission$lambda$3(CurseSetting curseSetting) {
        Logger.i("addFuncName", "curse-reminder: " + (curseSetting != null ? Boolean.valueOf(curseSetting.isAppPush()) : null));
        if (curseSetting == null || !curseSetting.isAppPush()) {
            return null;
        }
        return new Pair(ResourceExtKt.getString(c0j.s6), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupCurseAlarmPermission$lambda$4(CurseSetting curseSetting, Boolean bool, Boolean bool2) {
        Boolean bool3 = Boolean.FALSE;
        if ((Intrinsics.areEqual(bool, bool3) || Intrinsics.areEqual(bool2, bool3)) && curseSetting != null) {
            curseSetting.setAppPush(false);
            AnyExtKt.io$default(null, new CurseComponent$setupCurseAlarmPermission$2$1(curseSetting, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    @ComponentTask(notLaterThan = 11, onMainThread = false, processName = ":device")
    public final void initInDeviceProcess() {
        Logger.i("CurseComponent", "initInDeviceProcess");
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addSyncStateListener(new SyncStateListener() { // from class: com.xiaomi.fitness.health.curse.CurseComponent.initInDeviceProcess.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i("CurseComponent", "sync from CurseComponent " + did + ";(deviceProcess)");
                CurseManager.Companion companion = CurseManager.INSTANCE;
                companion.getInstance().initData("deviceProcessSync");
                companion.getInstance().syncCurse(did);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
            }
        });
    }

    @ComponentTask(notLaterThan = 11, onMainThread = false)
    public final void initInMainProcess() {
        migrationMenstruationSettings();
        boolean zCurseReady = CurseExtKt.curseReady();
        Logger.i("CurseComponent", "initInMainProcess: curse ready22 = " + zCurseReady);
        if (zCurseReady) {
            initCurse();
        } else {
            DeviceSettingManager.INSTANCE.getInstance().addUpdateListener(new DeviceSettingManager.UpdateSettingInfoListener() { // from class: com.xiaomi.fitness.health.curse.CurseComponent$initInMainProcess$listener$1
                @Override // com.xiaomi.fitness.settingitem.DeviceSettingManager.UpdateSettingInfoListener
                public void onSettingValueUpdate(String did, HashMap<String, String> settingMap) {
                    Intrinsics.checkNotNullParameter(settingMap, "settingMap");
                    Logger.d("CurseComponent", "onSettingValueUpdate: " + did + ", " + settingMap);
                    if (Intrinsics.areEqual(did, "xiaomiwear_app")) {
                        DeviceSettingManager.INSTANCE.getInstance().removeUpdateListener(this);
                        if (AppUtil.INSTANCE.isMainThread()) {
                            ScopeExtKt.scope(Dispatchers.getIO(), new CurseComponent$initInMainProcess$listener$1$onSettingValueUpdate$1(this.this$0, null));
                        }
                    }
                }
            });
        }
    }
}
