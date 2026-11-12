package com.xiaomi.fitness.health.curse.data;

import android.app.AlarmManager;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.accountsdk.account.ServerErrorCode;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.health.curse.CurseEnterActivity;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.cxg;
import defpackage.fxi;
import defpackage.qxi;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/CurseNotify;", "", "<init>", "()V", "context", "Landroid/app/Application;", "commonNotify", "", "type", "Lcom/xiaomi/fitness/health/curse/data/CurseNotifyType;", "days", "", "notifyMills", "", "getNotifyContentStr", "", "getNotifyId", "updateNotifyMillis", "setNotify", "force", "", "genPendingIntent", "Landroid/app/PendingIntent;", "action", "cancelAlarm", "Receiver", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseNotify {

    @NotNull
    private final Application context = ApplicationExtKt.getApplication();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/CurseNotify$Receiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "checkNotifyResult", "", "type", "Lcom/xiaomi/fitness/health/curse/data/CurseNotifyType;", "left", "", "getCurseNotifyTypeByAction", "action", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Receiver extends BroadcastReceiver {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CurseNotifyType.values().length];
                try {
                    iArr[CurseNotifyType.IN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CurseNotifyType.OVUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CurseNotifyType.EASY_PREGNANCY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private final boolean checkNotifyResult(CurseNotifyType type, int left) {
            long zeroMills;
            Logger.i("CurseNotify", "checkNotifyResult days left " + left + ";type " + type);
            if (left <= 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[type.ordinal()];
            if (i == 1) {
                zeroMills = CurseExtKt.getZeroMills(HealthPrefer.INSTANCE.getCURSE_IN_NOTIFY_TIME());
            } else if (i == 2) {
                zeroMills = CurseExtKt.getZeroMills(HealthPrefer.INSTANCE.getCURSE_OVUM_NOTIFY_TIME());
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                zeroMills = CurseExtKt.getZeroMills(HealthPrefer.INSTANCE.getCURSE_PREGNANCY_NOTIFY_TIME());
            }
            if (zeroMills == CurseExtKt.getZeroMills(jCurrentTimeMillis)) {
                return false;
            }
            LocalDate localDate = new LocalDate(CurseExtKt.getZeroMills(jCurrentTimeMillis + (((long) left) * 86400000)));
            int i2 = iArr[type.ordinal()];
            if (i2 == 1) {
                return CurseManager.INSTANCE.getInstance().isInStart(localDate);
            }
            if (i2 == 2) {
                return CurseManager.INSTANCE.getInstance().isOvum(localDate);
            }
            if (i2 == 3) {
                return CurseManager.INSTANCE.getInstance().isRiskStart(localDate);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final CurseNotifyType getCurseNotifyTypeByAction(String action) {
            int iHashCode = action.hashCode();
            if (iHashCode != 198295502) {
                if (iHashCode != 284400740) {
                    if (iHashCode == 1583606568 && action.equals("action_ovum")) {
                        return CurseNotifyType.OVUM;
                    }
                } else if (action.equals("action_pregnancy")) {
                    return CurseNotifyType.EASY_PREGNANCY;
                }
            } else if (action.equals("action_in")) {
                return CurseNotifyType.IN;
            }
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            Logger.i("CurseNotify", "onReceive: " + action + ",intent " + intent);
            if (action == null) {
                return;
            }
            if (Intrinsics.areEqual(action, "action_open")) {
                context.startActivity(new Intent(context, (Class<?>) CurseEnterActivity.class).addFlags(268435456));
                return;
            }
            int intExtra = intent.getIntExtra("day_left", 0);
            CurseNotify curseNotify = new CurseNotify();
            CurseNotifyType curseNotifyTypeByAction = getCurseNotifyTypeByAction(action);
            if (curseNotifyTypeByAction == null) {
                return;
            }
            if (checkNotifyResult(curseNotifyTypeByAction, intExtra)) {
                curseNotify.commonNotify(curseNotifyTypeByAction, intExtra, System.currentTimeMillis());
            } else {
                Logger.i("CurseNotify", "checkNotifyResult false, jump pop notify");
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurseNotifyType.values().length];
            try {
                iArr[CurseNotifyType.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurseNotifyType.OVUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurseNotifyType.EASY_PREGNANCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void cancelAlarm() {
        Object systemService = this.context.getSystemService(DialWidgetType.ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        alarmManager.cancel(genPendingIntent("action_in", 0));
        alarmManager.cancel(genPendingIntent("action_ovum", 0));
        alarmManager.cancel(genPendingIntent("action_pregnancy", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commonNotify(CurseNotifyType type, int days, long notifyMills) {
        Application application = ApplicationExtKt.getApplication();
        Intent intent = new Intent(application, (Class<?>) Receiver.class);
        intent.setAction("action_open");
        PendingIntent broadcastPendingIntent$default = PendingIntentExtKt.getBroadcastPendingIntent$default(application, 0, intent, 0, 4, null);
        Object systemService = application.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel(CurseNotifyKt.getCURSE_CHANNEL_ID(), CurseNotifyKt.getCURSE_CHANNEL_ID(), 3));
        wwg.e eVarI = new wwg.e(application, CurseNotifyKt.getCURSE_CHANNEL_ID()).u(fxi.f18351b).k(CurseNotifyKt.getCURSE_CHANNEL_ID()).j(getNotifyContentStr(type, days)).g(true).t(1).i(broadcastPendingIntent$default);
        Intrinsics.checkNotNullExpressionValue(eVarI, "setContentIntent(...)");
        cxg.b(application).e(getNotifyId(type), eVarI.d());
        updateNotifyMillis(type, notifyMills);
        Logger.i("CurseNotify", "curse pop notification type " + type + ";days " + days);
    }

    private final PendingIntent genPendingIntent(String action, int days) {
        Intent intent = new Intent(this.context, (Class<?>) Receiver.class);
        intent.setAction(action);
        intent.putExtra("day_left", days);
        return PendingIntentExtKt.getBroadcastPendingIntent$default(this.context, 0, intent, 0, 4, null);
    }

    private final String getNotifyContentStr(CurseNotifyType type, int days) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? qxi.F : qxi.L;
        } else {
            i = qxi.J;
        }
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(i, days, Integer.valueOf(days));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    private final int getNotifyId(CurseNotifyType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 1) {
            return i != 2 ? 20025 : 20024;
        }
        return ServerErrorCode.ERROR_USER_BEHAVIOR_BLOCKED;
    }

    public static /* synthetic */ void setNotify$default(CurseNotify curseNotify, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        curseNotify.setNotify(z);
    }

    private final void updateNotifyMillis(CurseNotifyType type, long notifyMills) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            HealthPrefer.INSTANCE.setCURSE_IN_NOTIFY_TIME(notifyMills);
        } else if (i == 2) {
            HealthPrefer.INSTANCE.setCURSE_OVUM_NOTIFY_TIME(notifyMills);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            HealthPrefer.INSTANCE.setCURSE_PREGNANCY_NOTIFY_TIME(notifyMills);
        }
    }

    public final void setNotify(boolean force) {
        int i;
        String str;
        CurseManager.Companion companion = CurseManager.INSTANCE;
        CurseSetting setting = companion.getInstance().getSetting();
        if (setting == null) {
            return;
        }
        Logger.i("CurseNotify", "setAlarm: config = " + setting + ";force " + force);
        cancelAlarm();
        if (setting.isAppPush() && setting.isPredictEnable()) {
            Application application = ApplicationExtKt.getApplication();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int appBeforeMenstruationPush = setting.getAppBeforeMenstruationPush();
            long nextInNotifyMillis$default = CurseManager.getNextInNotifyMillis$default(companion.getInstance(), 0L, appBeforeMenstruationPush, 1, null) + 72000000;
            long j = nextInNotifyMillis$default - jCurrentTimeMillis;
            PendingIntent pendingIntentGenPendingIntent = genPendingIntent("action_in", appBeforeMenstruationPush);
            if (j > 0) {
                i = -14400000;
                str = " days ";
                AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(application, jCurrentTimeMillis + j, pendingIntentGenPendingIntent, 0, 4, null);
            } else {
                i = -14400000;
                str = " days ";
                if (j > -14400000) {
                    if (appBeforeMenstruationPush <= 0 || CurseExtKt.getZeroMills(HealthPrefer.INSTANCE.getCURSE_IN_NOTIFY_TIME()) == CurseExtKt.getZeroMills(nextInNotifyMillis$default)) {
                        Logger.i("CurseNotify", "inNotify jump notify ,last notify time " + HealthPrefer.INSTANCE.getCURSE_IN_NOTIFY_TIME() + str + appBeforeMenstruationPush);
                    } else {
                        commonNotify(CurseNotifyType.IN, appBeforeMenstruationPush, jCurrentTimeMillis);
                    }
                }
            }
            int appBeforeOvulationPush = setting.getAppBeforeOvulationPush();
            long nextNotifyOvumMillis$default = CurseManager.getNextNotifyOvumMillis$default(companion.getInstance(), 0L, appBeforeOvulationPush, 1, null) + 72000000;
            if (nextNotifyOvumMillis$default != -1) {
                long j2 = nextNotifyOvumMillis$default - jCurrentTimeMillis;
                PendingIntent pendingIntentGenPendingIntent2 = genPendingIntent("action_ovum", appBeforeOvulationPush);
                if (j2 > 0) {
                    AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(application, j2 + jCurrentTimeMillis, pendingIntentGenPendingIntent2, 0, 4, null);
                } else if (j2 > i) {
                    if (appBeforeOvulationPush <= 0 || CurseExtKt.getZeroMills(HealthPrefer.INSTANCE.getCURSE_OVUM_NOTIFY_TIME()) == CurseExtKt.getZeroMills(nextNotifyOvumMillis$default)) {
                        Logger.i("CurseNotify", "ovumNotify jump notify ,last notify time " + HealthPrefer.INSTANCE.getCURSE_OVUM_NOTIFY_TIME() + str + appBeforeOvulationPush);
                    } else {
                        commonNotify(CurseNotifyType.OVUM, appBeforeOvulationPush, jCurrentTimeMillis);
                    }
                }
            }
            int appBeforePregnancyPush = setting.getAppBeforePregnancyPush();
            long nextRiskNotifyMillis$default = CurseManager.getNextRiskNotifyMillis$default(companion.getInstance(), 0L, appBeforePregnancyPush, 1, null) + 72000000;
            if (nextRiskNotifyMillis$default != -1) {
                long j3 = nextRiskNotifyMillis$default - jCurrentTimeMillis;
                PendingIntent pendingIntentGenPendingIntent3 = genPendingIntent("action_pregnancy", appBeforePregnancyPush);
                if (j3 > 0) {
                    AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(application, jCurrentTimeMillis + j3, pendingIntentGenPendingIntent3, 0, 4, null);
                } else if (j3 > i) {
                    if (appBeforePregnancyPush <= 0 || CurseExtKt.getZeroMills(HealthPrefer.INSTANCE.getCURSE_PREGNANCY_NOTIFY_TIME()) == CurseExtKt.getZeroMills(nextRiskNotifyMillis$default)) {
                        Logger.i("CurseNotify", "pregnancyNotify jump notify ,last notify time " + HealthPrefer.INSTANCE.getCURSE_PREGNANCY_NOTIFY_TIME() + str + appBeforePregnancyPush);
                    } else {
                        commonNotify(CurseNotifyType.EASY_PREGNANCY, appBeforePregnancyPush, jCurrentTimeMillis);
                    }
                }
            }
            long j4 = 1000;
            Logger.i("CurseNotify", "notify time :exactInTime " + TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(nextInNotifyMillis$default / j4, false, 2, null) + "; exactOvumTime " + TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(nextNotifyOvumMillis$default / j4, false, 2, null) + ";exactPregnancyTime " + TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(nextRiskNotifyMillis$default / j4, false, 2, null));
        }
    }
}
