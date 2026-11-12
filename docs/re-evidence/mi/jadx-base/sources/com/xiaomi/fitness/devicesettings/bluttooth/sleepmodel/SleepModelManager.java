package com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel;

import android.database.Cursor;
import android.net.Uri;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import defpackage.k14;
import defpackage.q14;
import defpackage.s7r;
import defpackage.t64;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u00122\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelManager;", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "sleepModelData", "", TSMAuthContants.PARAM_RESOURCE, "Lq14;", "transModelToProto", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;I)Lq14;", "getSleepModelDataByMIUI", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "getScheduleStatus", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;)I", "initWhileFirst", "workAndRest", "transferProtoToModel", "(Lq14;)Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "Lkotlin/Function2;", "", "callback", "loadSleepModelData", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "updateSleepModelData", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;ILkotlin/jvm/functions/Function1;)V", "IS_SET", "I", "NOT_SET", "NOT_SUPPORT", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepModelManager {

    @NotNull
    public static final SleepModelManager INSTANCE = new SleepModelManager();
    public static final int IS_SET = 1;
    public static final int NOT_SET = 2;
    public static final int NOT_SUPPORT = 3;

    @NotNull
    private static final String TAG = "SleepModelManager";

    private SleepModelManager() {
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

    public final int getScheduleStatus(@Nullable SleepModelData sleepModelData) {
        if (sleepModelData == null || AppUtil.INSTANCE.isPlayChannel()) {
            return 3;
        }
        if (sleepModelData.getBedtime_state() == 0) {
            return 2;
        }
        return sleepModelData.getBedtime_state() == 1 ? 1 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    @Nullable
    public final SleepModelData getSleepModelDataByMIUI() throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        try {
            cursorQuery = AppUtil.getApp().getContentResolver().query(new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority("com.android.deskclock.additionProvider").path("/bedtime").build(), null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        SleepModelData sleepModelData = new SleepModelData(cursorQuery.getInt(cursorQuery.getColumnIndex("bedtime_state")), cursorQuery.getInt(cursorQuery.getColumnIndex("sleep_hour")), cursorQuery.getInt(cursorQuery.getColumnIndex("sleep_minute")), cursorQuery.getInt(cursorQuery.getColumnIndex("wake_hour")), cursorQuery.getInt(cursorQuery.getColumnIndex("wake_minute")));
                        Logger.i(sleepModelData.toString(), new Object[0]);
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

    @NotNull
    public final SleepModelData initWhileFirst() {
        return new SleepModelData(0, 22, 0, 8, 0);
    }

    public final void loadSleepModelData(@NotNull final Function2<? super Integer, ? super q14, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 8;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelManager.loadSleepModelData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callback.invoke(Integer.valueOf(code), null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                k14 k14VarQ;
                if (result == null) {
                    callback.invoke(255, null);
                    return;
                }
                s7r packet = result.getPacket();
                q14 q14VarW = (packet == null || (k14VarQ = packet.q()) == null) ? null : k14VarQ.w();
                Logger.d(SleepModelManager.TAG, "loadSleepModelData: " + q14VarW);
                if (q14VarW != null) {
                    callback.invoke(Integer.valueOf(result.getCode()), q14VarW);
                } else {
                    callback.invoke(Integer.valueOf(result.getCode()), null);
                }
            }
        }, 0, 8, null);
    }

    @Nullable
    public final SleepModelData transferProtoToModel(@Nullable q14 workAndRest) {
        t64 t64Var;
        t64 t64Var2;
        t64 t64Var3;
        t64 t64Var4;
        if (workAndRest == null) {
            return null;
        }
        q14.a aVar = workAndRest.d;
        SleepModelData sleepModelData = new SleepModelData(0, (aVar == null || (t64Var4 = aVar.c) == null) ? 0 : t64Var4.c, (aVar == null || (t64Var3 = aVar.c) == null) ? 0 : t64Var3.d, (aVar == null || (t64Var2 = aVar.d) == null) ? 0 : t64Var2.c, (aVar == null || (t64Var = aVar.d) == null) ? 0 : t64Var.d);
        sleepModelData.setGetupClock(workAndRest.e);
        return sleepModelData;
    }

    public final void updateSleepModelData(@NotNull SleepModelData sleepModelData, int resource, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(sleepModelData, "sleepModelData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        q14 q14VarTransModelToProto = transModelToProto(sleepModelData, resource);
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 9;
        k14 k14Var = new k14();
        k14Var.M(q14VarTransModelToProto);
        s7rVar.P(k14Var);
        Logger.i(TAG, "set SleepModelData: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelManager.updateSleepModelData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callback.invoke2(Integer.valueOf(code));
                Logger.i(SleepModelManager.TAG, "set SleepModelData onError: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !SyncResultExitKt.isSuccess(result)) {
                    callback.invoke2(255);
                } else {
                    callback.invoke2(0);
                }
            }
        }, 0, 8, null);
    }
}
