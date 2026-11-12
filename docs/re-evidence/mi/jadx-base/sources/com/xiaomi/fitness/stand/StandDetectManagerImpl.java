package com.xiaomi.fitness.stand;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.StandDetectSettingItem;
import com.xiaomi.fitness.stand.StandDetectManagerImpl;
import com.xiaomi.fitness.stand.reminder.StandAlarmScheduler;
import com.xiaomi.fitness.stand.repo.StandDetectPreference;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/stand/StandDetectManagerImpl;", "Lcom/xiaomi/fitness/stand/StandDetectInternalManager;", "<init>", "()V", "TAG", "", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "alarmScheduler", "Lcom/xiaomi/fitness/stand/reminder/StandAlarmScheduler;", "getAlarmScheduler", "()Lcom/xiaomi/fitness/stand/reminder/StandAlarmScheduler;", "alarmScheduler$delegate", "Lkotlin/Lazy;", "startStandDetect", "", "handleReminder", "context", "Landroid/content/Context;", "action", "time", "", "setStandDetectEnable", "enable", "", "getStandDetectEnabled", "setStandReminderEnable", "getStandReminderEnable", "setRemindTime", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "getRemindTime", "", "setStandDetectNapEnable", "getStandDetectNapEnable", "setStandDetectNapTime", "getStandDetectNapTime", "supportStandDetect", "checkStandAndRecordIfDone", "startTime", "stand-detect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandDetectManagerImpl implements StandDetectInternalManager {

    @NotNull
    private final String TAG = StandDetectConstants.TAG;

    @NotNull
    private final AtomicBoolean started = new AtomicBoolean(false);

    /* JADX INFO: renamed from: alarmScheduler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy alarmScheduler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h9o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandDetectManagerImpl.alarmScheduler_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final StandAlarmScheduler alarmScheduler_delegate$lambda$0() {
        return new StandAlarmScheduler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StandAlarmScheduler getAlarmScheduler() {
        return (StandAlarmScheduler) this.alarmScheduler.getValue();
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean checkStandAndRecordIfDone(long startTime) {
        return getAlarmScheduler().checkStandAndRecordIfDone(startTime);
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    @NotNull
    public int[] getRemindTime() {
        return StandDetectPreference.INSTANCE.getRemindTime();
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean getStandDetectEnabled() {
        return StandDetectPreference.INSTANCE.getStandDetectEnabled();
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean getStandDetectNapEnable() {
        return StandDetectPreference.INSTANCE.getNapEnable();
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    @NotNull
    public int[] getStandDetectNapTime() {
        return StandDetectPreference.INSTANCE.getDetectNapTime();
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean getStandReminderEnable() {
        return StandDetectPreference.INSTANCE.getStandReminderEnable();
    }

    @Override // com.xiaomi.fitness.stand.StandDetectInternalManager
    public void handleReminder(@NotNull Context context, @NotNull String action, long time) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        getAlarmScheduler().handleReminder(context, action, time);
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setRemindTime(int start, int end) {
        StandDetectPreference.INSTANCE.setRemindTime(start, end);
        getAlarmScheduler().registerAlarm(ApplicationExtKt.getApplication());
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setStandDetectEnable(boolean enable) {
        StandDetectPreference standDetectPreference = StandDetectPreference.INSTANCE;
        standDetectPreference.setStandDetectEnable(enable);
        if (enable) {
            standDetectPreference.setReminderIsShowToday(enable);
        }
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setStandDetectNapEnable(boolean enable) {
        StandDetectPreference.INSTANCE.setNapEnable(enable);
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setStandDetectNapTime(int start, int end) {
        StandDetectPreference.INSTANCE.setDetectNapTime(start, end);
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setStandReminderEnable(boolean enable) {
        StandDetectPreference standDetectPreference = StandDetectPreference.INSTANCE;
        standDetectPreference.setStandReminderEnable(enable);
        if (enable) {
            standDetectPreference.setReminderIsShowToday(enable);
            getAlarmScheduler().registerAlarm(ApplicationExtKt.getApplication());
        }
    }

    @Override // com.xiaomi.fitness.stand.StandDetectInternalManager
    public void startStandDetect() {
        if (this.started.compareAndSet(false, true) && supportStandDetect()) {
            getAlarmScheduler().registerAlarm(ApplicationExtKt.getApplication());
            DeviceSettingManager.INSTANCE.getInstance().addUpdateListener(new DeviceSettingManager.UpdateSettingInfoListener() { // from class: com.xiaomi.fitness.stand.StandDetectManagerImpl.startStandDetect.1
                @Override // com.xiaomi.fitness.settingitem.DeviceSettingManager.UpdateSettingInfoListener
                public void onSettingValueUpdate(String did, HashMap<String, String> settingMap) {
                    Intrinsics.checkNotNullParameter(settingMap, "settingMap");
                    if (Intrinsics.areEqual(did, "xiaomiwear_app")) {
                        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
                        SettingItemEntity settingItemValue = companion.getInstance().readSettingItemValue("xiaomiwear_app", DeviceSettingConfigKey.KEY_STAND_REMIND);
                        Logger.i(StandDetectManagerImpl.this.TAG, "fetch stand settings: " + settingItemValue);
                        if (settingItemValue != null) {
                            StandDetectManagerImpl standDetectManagerImpl = StandDetectManagerImpl.this;
                            Object objValueToObject = settingItemValue.valueToObject(StandDetectSettingItem.class);
                            if (objValueToObject != null) {
                                Intrinsics.checkNotNull(objValueToObject, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.StandDetectSettingItem");
                                StandDetectSettingItem standDetectSettingItem = (StandDetectSettingItem) objValueToObject;
                                standDetectManagerImpl.setStandReminderEnable(standDetectSettingItem.getReminderEnable());
                                standDetectManagerImpl.setRemindTime(standDetectSettingItem.getReminderStartTime(), standDetectSettingItem.getReminderEndTime());
                                standDetectManagerImpl.setStandDetectNapEnable(standDetectSettingItem.getDetectNapEnable());
                                standDetectManagerImpl.setStandDetectNapTime(standDetectSettingItem.getNapStartTime(), standDetectSettingItem.getNapEndTime());
                            }
                        }
                        StandDetectManagerImpl.this.getAlarmScheduler().registerAlarm(ApplicationExtKt.getApplication());
                        companion.getInstance().removeUpdateListener(this);
                    }
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean supportStandDetect() {
        return AppUtil.INSTANCE.supportMiuiFunction();
    }
}
