package com.xiaomi.fit.fitness;

import android.os.IBinder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.FitnessServerSyncMgr;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncCallback;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.TrainingPlanCallback;
import com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002=>B\t\b\u0007¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0012\"\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0004J\u0019\u0010\"\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\u001fJ\u0019\u0010(\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b(\u0010#J1\u0010-\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R/\u0010;\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/xiaomi/fit/fitness/FitnessServerSyncMgr;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "", "checkRemoteServerReady", "()V", "", "forceSync", "", "triggerSource", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncCallback;", "callback", "syncWithServer", "(ZLjava/lang/String;Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncCallback;)V", "", "startTime", "endTime", "pullServerSportReport", "(JJ)V", "", "keys", "pullServerFitnessData", "(JJ[Ljava/lang/String;)V", "pullAndPushRainbowData", "pullRedDotData", "syncMedicalDataWithServer", "(Ljava/lang/String;)V", "time", "", "playerId", "value", "insertSwitchSongRecord", "(JILjava/lang/String;)V", "syncSwitchSongRecordWithServer", "Lcom/xiaomi/fit/fitness/export/api/TrainingPlanCallback;", "getCurWeekPlan", "(Lcom/xiaomi/fit/fitness/export/api/TrainingPlanCallback;)V", "planId", "type", "weekPlanInfo", "updateWeekPlan", "getLocalCurDatePlanInfo", "trainingType", "id", DialWidgetType.DATE, "planInfo", "syncCurDatePlanInfo", "(IJJLjava/lang/String;)V", "deleteCurDataByPlanId", "(J)V", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fit/fitness/a;", "<set-?>", "mRemoteSyncMgr$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMRemoteSyncMgr", "()Lcom/xiaomi/fit/fitness/a;", "setMRemoteSyncMgr", "(Lcom/xiaomi/fit/fitness/a;)V", FitnessDataRemoteImpl.BINDER_NAME, "<init>", "ServerTrainingPlanRemoteCallback", "ServerSyncRemoteCallback", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FitnessServerSyncMgr implements FitnessServerSyncer {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessServerSyncMgr.class, FitnessDataRemoteImpl.BINDER_NAME, "getMRemoteSyncMgr()Lcom/xiaomi/fit/fitness/FitnessDataCenterRemote;", 0))};

    @NotNull
    private final String TAG = "FitnessServerSyncMgr";

    /* JADX INFO: renamed from: mRemoteSyncMgr$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mRemoteSyncMgr = new BinderDelegate(FitnessDataRemoteImpl.BINDER_NAME);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/FitnessServerSyncMgr$ServerSyncRemoteCallback;", "Lcom/xiaomi/fit/fitness/b$a;", "", "success", "", "onSyncResult", "(Z)V", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncCallback;", "<init>", "(Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncCallback;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ServerSyncRemoteCallback extends b.a {

        @NotNull
        private final FitnessServerSyncCallback listener;

        public ServerSyncRemoteCallback(@NotNull FitnessServerSyncCallback listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
        }

        @Override // com.xiaomi.fit.fitness.b
        public void onSyncResult(boolean success) {
            FitnessLogUtils.i("FitnessServerSyncMgr", "onSyncResult: success = " + success + "(" + this.listener + ")");
            this.listener.onSyncResult(success);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fit/fitness/FitnessServerSyncMgr$ServerTrainingPlanRemoteCallback;", "Lcom/xiaomi/fit/fitness/c$a;", "", "type", "", "weekPlanInfo", "", "onResult", "(ILjava/lang/String;)V", "Lcom/xiaomi/fit/fitness/export/api/TrainingPlanCallback;", "callback", "Lcom/xiaomi/fit/fitness/export/api/TrainingPlanCallback;", "<init>", "(Lcom/xiaomi/fit/fitness/export/api/TrainingPlanCallback;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ServerTrainingPlanRemoteCallback extends c.a {

        @Nullable
        private final TrainingPlanCallback callback;

        public ServerTrainingPlanRemoteCallback(@Nullable TrainingPlanCallback trainingPlanCallback) {
            this.callback = trainingPlanCallback;
        }

        @Override // com.xiaomi.fit.fitness.c
        public void onResult(int type, @Nullable String weekPlanInfo) {
            TrainingPlanCallback trainingPlanCallback = this.callback;
            if (trainingPlanCallback != null) {
                trainingPlanCallback.onResult(type, weekPlanInfo);
            }
        }
    }

    public FitnessServerSyncMgr() {
        ServiceConnector.INSTANCE.getBinder(12, new Function1() { // from class: sv9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FitnessServerSyncMgr._init_$lambda$0(this.f34020a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(FitnessServerSyncMgr this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "getBinder");
        if (iBinder != null) {
            FitnessLogUtils.i(this$0.TAG, "init server sync impl");
            this$0.setMRemoteSyncMgr(a.AbstractBinderC0362a.asInterface(iBinder));
        }
        return Unit.INSTANCE;
    }

    private final void checkRemoteServerReady() {
        if (getMRemoteSyncMgr() == null) {
            FitnessLogUtils.i(this.TAG, "remote service has not ready");
        }
    }

    private final a getMRemoteSyncMgr() {
        return (a) this.mRemoteSyncMgr.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMRemoteSyncMgr(a aVar) {
        this.mRemoteSyncMgr.setValue((Object) this, $$delegatedProperties[0], aVar);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void deleteCurDataByPlanId(long planId) {
        try {
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.deleteCurDataByPlanId(planId);
            }
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "deleteCurDataByPlanId exception", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void getCurWeekPlan(@Nullable TrainingPlanCallback callback) {
        try {
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.getCurWeekPlan(callback != null ? new ServerTrainingPlanRemoteCallback(callback) : null);
            }
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "getWeekPlan exception", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void getLocalCurDatePlanInfo(@Nullable TrainingPlanCallback callback) {
        try {
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.getLocalCurDatePlanInfo(callback != null ? new ServerTrainingPlanRemoteCallback(callback) : null);
            }
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "getLocalCurDatePlanInfo exception", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void insertSwitchSongRecord(long time, int playerId, @Nullable String value) {
        try {
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.insertSwitchSongRecord(time, playerId, value);
            }
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "insertSwitchSongRecord", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void pullAndPushRainbowData() {
        try {
            FitnessLogUtils.i(this.TAG, "pullAndPushRainbowData");
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.pullAndPushRainbowData();
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "pullAndPushRainbowData", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void pullRedDotData() {
        try {
            FitnessLogUtils.i(this.TAG, "pullRedDotData");
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.pullRedDotData();
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "pullRedDotData", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void pullServerFitnessData(long startTime, long endTime, @NotNull String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        try {
            FitnessLogUtils.i(this.TAG, "pullServerFitnessData");
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.pullFitnessServerData(startTime, endTime, keys);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "pullServerFitnessData", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void pullServerSportReport(long startTime, long endTime) {
        try {
            FitnessLogUtils.i(this.TAG, "pullServerSportReport");
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.pullSportServerData(startTime, endTime);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "pullServerSportReport", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void syncCurDatePlanInfo(int trainingType, long id, long date, @Nullable String planInfo) {
        try {
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.syncCurDatePlanInfo(trainingType, id, date, planInfo);
            }
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "syncCurDatePlanInfo exception", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void syncMedicalDataWithServer(@NotNull String triggerSource) {
        Intrinsics.checkNotNullParameter(triggerSource, "triggerSource");
        try {
            FitnessLogUtils.i(this.TAG, "syncMedicalDataWithServer");
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.syncMedicalDataWithServer(triggerSource);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncMedicalDataWithServer", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void syncSwitchSongRecordWithServer() {
        try {
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.syncSwitchSongRecordWithServer();
            }
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "syncSwitchSongRecordWithServer exception", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void syncWithServer(boolean forceSync, @NotNull String triggerSource, @Nullable FitnessServerSyncCallback callback) {
        Intrinsics.checkNotNullParameter(triggerSource, "triggerSource");
        try {
            FitnessLogUtils.i(this.TAG, "syncWithServer");
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.syncWithServer(forceSync, triggerSource, callback != null ? new ServerSyncRemoteCallback(callback) : null);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncWithServer", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncer
    public void updateWeekPlan(long planId, int type, @NotNull String weekPlanInfo) {
        Intrinsics.checkNotNullParameter(weekPlanInfo, "weekPlanInfo");
        try {
            checkRemoteServerReady();
            a mRemoteSyncMgr = getMRemoteSyncMgr();
            if (mRemoteSyncMgr != null) {
                mRemoteSyncMgr.updateWeekPlan(planId, type, weekPlanInfo);
            }
        } catch (Exception e) {
            FitnessLogUtils.e(this.TAG, "syncWeekPlan exception", e);
        }
    }
}
