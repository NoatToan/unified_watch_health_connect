package com.xiaomi.fitness.sync.util;

import android.database.Cursor;
import android.net.Uri;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import com.xiaomi.fitness.devicesettings.export.SleepModelHelper;
import com.xiaomi.fitness.devicesettings.export.SleepModelHelperExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.model.SleepModelData;
import com.xiaomi.fitness.sync.util.SyncUtil;
import defpackage.k14;
import defpackage.ni4;
import defpackage.q14;
import defpackage.s7r;
import defpackage.t64;
import defpackage.xr5;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u0010,J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0015¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0012¢\u0006\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/sync/util/SyncUtil;", "", "Lcom/xiaomi/fitness/sync/model/SleepModelData;", "sleepModelData", "", "getSleepModelStatus", "(Lcom/xiaomi/fitness/sync/model/SleepModelData;)I", TSMAuthContants.PARAM_RESOURCE, "Lq14;", "transModelToProto", "(Lcom/xiaomi/fitness/sync/model/SleepModelData;I)Lq14;", "getSleepModelDataByMIUI", "()Lcom/xiaomi/fitness/sync/model/SleepModelData;", "workAndRest", "", "setSleepModelTime", "(Lq14;)V", "miuiSleepModel", "", "isSleepModelNotChange", "(Lcom/xiaomi/fitness/sync/model/SleepModelData;Lq14;)Z", "", "getRegion", "()Ljava/lang/String;", "type", "did", "", "getSyncTimeLong", "(ILjava/lang/String;)J", "value", "setSyncTimeLong", "(ILjava/lang/String;J)V", "s", "getNonNullString", "(Ljava/lang/String;)Ljava/lang/String;", "getSafeIntValue", "(Ljava/lang/String;)I", "str", "isBlank", "(Ljava/lang/String;)Z", "", "getDoubleLen3", "(D)D", "refreshScheduleTimeZone", "()V", "hasFineLocationPermission", "()Z", "hasCoarseLocationPermission", "TAG", "Ljava/lang/String;", "<init>", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSyncUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncUtil.kt\ncom/xiaomi/fitness/sync/util/SyncUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"})
public final class SyncUtil {

    @NotNull
    public static final SyncUtil INSTANCE = new SyncUtil();

    @NotNull
    private static final String TAG = "SyncEngine";

    private SyncUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    private final SleepModelData getSleepModelDataByMIUI() throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        try {
            cursorQuery = ApplicationExtKt.getApplication().getContentResolver().query(new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority("com.android.deskclock.additionProvider").path("/bedtime").build(), null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        SleepModelData sleepModelData = new SleepModelData(cursorQuery.getInt(cursorQuery.getColumnIndex("bedtime_state")), cursorQuery.getInt(cursorQuery.getColumnIndex("sleep_hour")), cursorQuery.getInt(cursorQuery.getColumnIndex("sleep_minute")), cursorQuery.getInt(cursorQuery.getColumnIndex("wake_hour")), cursorQuery.getInt(cursorQuery.getColumnIndex("wake_minute")));
                        Logger.d("getSleepModelDataByMiui", sleepModelData.toString());
                        cursorQuery.close();
                        return sleepModelData;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    if (cursorQuery != null) {
                    }
                    return null;
                }
                cursorQuery.close();
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private final int getSleepModelStatus(SleepModelData sleepModelData) {
        if (sleepModelData == null || AppUtil.INSTANCE.isPlayChannel()) {
            return 3;
        }
        if (sleepModelData.getBedtime_state() == 0) {
            return 2;
        }
        return sleepModelData.getBedtime_state() == 1 ? 1 : 3;
    }

    private final boolean isSleepModelNotChange(SleepModelData miuiSleepModel, q14 workAndRest) {
        q14.a aVar;
        return miuiSleepModel != null && workAndRest != null && (aVar = workAndRest.d) != null && miuiSleepModel.getSleep_minute() == aVar.c.d && miuiSleepModel.getSleep_hour() == aVar.c.c && miuiSleepModel.getWake_minute() == aVar.d.d && miuiSleepModel.getWake_hour() == aVar.d.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshScheduleTimeZone$lambda$1(int i, q14 q14Var) throws Throwable {
        Logger.i(TAG, "sync getSleepModelTime: " + i + " " + (q14Var != null ? Integer.valueOf(q14Var.c) : null) + " " + (q14Var != null ? Integer.valueOf(q14Var.e) : null));
        SyncUtil syncUtil = INSTANCE;
        SleepModelData sleepModelDataByMIUI = syncUtil.getSleepModelDataByMIUI();
        Integer numValueOf = q14Var != null ? Integer.valueOf(q14Var.c) : null;
        int sleepModelStatus = syncUtil.getSleepModelStatus(sleepModelDataByMIUI);
        Logger.i(TAG, "sync getSleepModelTime source: " + numValueOf + " status: " + sleepModelStatus);
        if (sleepModelStatus != 1) {
            if (sleepModelStatus == 2) {
                Logger.i(TAG, "sync sleep model, miui switch off, close sync");
                DeviceSettingsExportPreference.INSTANCE.setKEY_IS_SYNC_SLEEP_MODEL(false);
                if (q14Var == null || q14Var.c != 0) {
                    SleepModelData sleepModelData = new SleepModelData(0, 0, 0, 0, 0, 31, null);
                    sleepModelData.setGetupClock(q14Var != null ? q14Var.e : 0);
                    syncUtil.setSleepModelTime(syncUtil.transModelToProto(sleepModelData, 0));
                }
            } else if (sleepModelStatus == 3) {
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    Logger.i(TAG, "sync sleep model: is other but from xiaomi");
                    DeviceSettingsExportPreference.INSTANCE.setKEY_IS_SYNC_SLEEP_MODEL(false);
                    SleepModelData sleepModelData2 = new SleepModelData(0, 0, 0, 0, 0, 31, null);
                    sleepModelData2.setGetupClock(q14Var.e);
                    syncUtil.setSleepModelTime(syncUtil.transModelToProto(sleepModelData2, 0));
                } else if (numValueOf != null && numValueOf.intValue() == 2 && !DeviceSettingsExportPreference.INSTANCE.getKEY_IS_SYNC_SLEEP_MODEL()) {
                    SleepModelData sleepModelData3 = new SleepModelData(0, 0, 0, 0, 0, 31, null);
                    sleepModelData3.setGetupClock(q14Var.e);
                    syncUtil.setSleepModelTime(syncUtil.transModelToProto(sleepModelData3, 0));
                } else if (numValueOf != null && numValueOf.intValue() == 0) {
                    DeviceSettingsExportPreference deviceSettingsExportPreference = DeviceSettingsExportPreference.INSTANCE;
                    if (deviceSettingsExportPreference.getKEY_IS_SYNC_SLEEP_MODEL()) {
                        Logger.i(TAG, "sync sleep model: device null but switch on, turn off");
                        deviceSettingsExportPreference.setKEY_IS_SYNC_SLEEP_MODEL(false);
                        SleepModelData sleepModelData4 = new SleepModelData(0, 0, 0, 0, 0, 31, null);
                        sleepModelData4.setGetupClock(q14Var.e);
                        syncUtil.setSleepModelTime(syncUtil.transModelToProto(sleepModelData4, 0));
                    }
                }
            }
        } else if (DeviceSettingsExportPreference.INSTANCE.getKEY_IS_SYNC_SLEEP_MODEL()) {
            if (syncUtil.isSleepModelNotChange(sleepModelDataByMIUI, q14Var)) {
                Logger.i(TAG, "sync sleep model: is xiaomi, device not change, mute");
            } else {
                Logger.i(TAG, "sync sleep model: is xiaomi, allow sync: " + sleepModelDataByMIUI);
                Intrinsics.checkNotNull(sleepModelDataByMIUI);
                syncUtil.setSleepModelTime(syncUtil.transModelToProto(sleepModelDataByMIUI, 1));
            }
        }
        return Unit.INSTANCE;
    }

    private final void setSleepModelTime(q14 workAndRest) {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 9;
        k14 k14Var = new k14();
        k14Var.M(workAndRest);
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.util.SyncUtil.setSleepModelTime.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(SyncUtil.TAG, "sync all: sync sleep model error: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !result.isSuccess()) {
                    return;
                }
                Logger.i(SyncUtil.TAG, "sync all: sync sleep model success");
            }
        }, 0, 8, null);
    }

    private final q14 transModelToProto(SleepModelData sleepModelData, int resource) {
        q14 q14Var = new q14();
        q14.a aVar = new q14.a();
        t64 t64Var = new t64();
        t64 t64Var2 = new t64();
        t64Var.c = sleepModelData.getSleep_hour();
        t64Var.d = sleepModelData.getSleep_minute();
        t64Var2.c = sleepModelData.getWake_hour();
        t64Var2.d = sleepModelData.getWake_minute();
        aVar.d = t64Var2;
        aVar.c = t64Var;
        q14Var.d = aVar;
        q14Var.c = resource;
        q14Var.e = sleepModelData.getGetupClock();
        return q14Var;
    }

    public final double getDoubleLen3(double value) {
        Double d = xr5.d(3, value);
        Intrinsics.checkNotNullExpressionValue(d, "getDecimalDouble(...)");
        return d.doubleValue();
    }

    @NotNull
    public final String getNonNullString(@Nullable String s) {
        return s == null ? "" : s;
    }

    @NotNull
    public final String getRegion() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = currentRegion.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            return "";
        }
        return lowerCase + ".";
    }

    public final int getSafeIntValue(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final long getSyncTimeLong(int type, @NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (type == 0) {
            return SyncPreference.INSTANCE.getSyncWeatherLastTime(did);
        }
        if (type == 1) {
            return SyncPreference.INSTANCE.getSyncPressureLastTime(did);
        }
        if (type == 2) {
            return SyncPreference.INSTANCE.getSyncStockLastTime(did);
        }
        if (type == 3) {
            return SyncPreference.INSTANCE.getSyncCalendarLastTime(did);
        }
        if (type == 5) {
            return SyncPreference.INSTANCE.getSyncTimeLastTime(did);
        }
        if (type != 6) {
            return 0L;
        }
        return SyncPreference.INSTANCE.getSyncWeatherLocationLastTime(did);
    }

    public final boolean hasCoarseLocationPermission() {
        return ni4.a(ApplicationExtKt.getApplication(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public final boolean hasFineLocationPermission() {
        return ni4.a(ApplicationExtKt.getApplication(), "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public final boolean isBlank(@Nullable String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void refreshScheduleTimeZone() {
        SleepModelHelperExtKt.getInstance(SleepModelHelper.INSTANCE).getSleepModelTime(new Function2() { // from class: uuo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SyncUtil.refreshScheduleTimeZone$lambda$1(((Integer) obj).intValue(), (q14) obj2);
            }
        });
    }

    public final void setSyncTimeLong(int type, @NotNull String did, long value) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (type == 0) {
            SyncPreference.INSTANCE.setSyncWeatherLastTime(did, value);
            return;
        }
        if (type == 1) {
            SyncPreference.INSTANCE.setSyncPressureLastTime(did, value);
            return;
        }
        if (type == 2) {
            SyncPreference.INSTANCE.setSyncStockLastTime(did, value);
            return;
        }
        if (type == 3) {
            SyncPreference.INSTANCE.setSyncCalendarLastTime(did, value);
        } else if (type == 5) {
            SyncPreference.INSTANCE.setSyncTimeLastTime(did, value);
        } else {
            if (type != 6) {
                return;
            }
            SyncPreference.INSTANCE.setSyncWeatherLocationLastTime(did, value);
        }
    }
}
