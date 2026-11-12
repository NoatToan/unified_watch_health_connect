package com.xiaomi.fitness.sport_manager.state;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorManager;
import com.xiaomi.fitness.sport_manager.state.AutoState;
import com.xiaomi.fitness.sport_manager.utils.UserInfo;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.listener.AutoPauseCallback;
import defpackage.f2o;
import defpackage.jdn;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/AutoState;", "Lcom/xiaomi/wearable/gpsalgorithm/listener/AutoPauseCallback;", "<init>", "()V", "mSportAlgo", "Lcom/xiaomi/wearable/gpsalgorithm/FitnessSportAlgo;", "kotlin.jvm.PlatformType", "Lcom/xiaomi/wearable/gpsalgorithm/FitnessSportAlgo;", "handRestartTime", "", "getHandRestartTime", "()J", "setHandRestartTime", "(J)V", "genAutoPause", "", "autoPause", "", "onAutoPause", "startAutoPause", "finishAutoPause", "switchAutoPause", "checked", "", DailyRecordKey.sportType, "isSupportAutoPause", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoState implements AutoPauseCallback {
    public static final int ResponseIntervalTime = 5000;

    @NotNull
    private static final String TAG = "autoState";
    private long handRestartTime;
    private final FitnessSportAlgo mSportAlgo = FitnessSportAlgo.getInstance(UserInfo.INSTANCE.getUserProfile());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AutoState> mInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: es1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoState.mInstance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/AutoState$Companion;", "", "<init>", "()V", "TAG", "", "ResponseIntervalTime", "", "mInstance", "Lcom/xiaomi/fitness/sport_manager/state/AutoState;", "getMInstance", "()Lcom/xiaomi/fitness/sport_manager/state/AutoState;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AutoState getMInstance() {
            return (AutoState) AutoState.mInstance$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final AutoState get() {
            return getMInstance();
        }
    }

    private final void genAutoPause(int autoPause) {
        int iV = f2o.x().V();
        boolean z = f2o.x().q;
        if (z && autoPause == 1 && f2o.x().j && iV == 2) {
            f2o.x().j(SportDeviceModel.INSTANCE.curDeviceModel(), f2o.x().T(), new SportRequestCallback() { // from class: com.xiaomi.fitness.sport_manager.state.AutoState.genAutoPause.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
                public void call(int sportState, SportResponseData sportResponseData) {
                    Intrinsics.checkNotNullParameter(sportResponseData, "sportResponseData");
                }
            });
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.handRestartTime;
        if (z && autoPause == 0 && f2o.x().j && ((iV == 3 || iV == 1) && jCurrentTimeMillis > 5000)) {
            f2o.x().i(SportDeviceModel.INSTANCE.curDeviceModel(), f2o.x().T(), new SportRequestCallback() { // from class: com.xiaomi.fitness.sport_manager.state.AutoState.genAutoPause.2
                @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
                public void call(int sportState, SportResponseData sportResponseData) {
                    Intrinsics.checkNotNullParameter(sportResponseData, "sportResponseData");
                }
            });
        }
        FitnessLogUtils.i(TAG, "autoSportState : " + autoPause + " , isAutoPauseEnable : " + f2o.x().j + " + autoPauseSwitch:" + z);
    }

    @JvmStatic
    @NotNull
    public static final AutoState get() {
        return INSTANCE.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AutoState mInstance_delegate$lambda$0() {
        return new AutoState();
    }

    public final void finishAutoPause() {
        FitnessLogUtils.i(TAG, "finishAutoPause");
        this.mSportAlgo.finishAutoPause();
    }

    public final long getHandRestartTime() {
        return this.handRestartTime;
    }

    public final boolean isSupportAutoPause(int sportType) {
        return sportType == 1 || sportType == 2 || f2o.x().q;
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.listener.AutoPauseCallback
    public void onAutoPause(int autoPause) {
        FitnessLogUtils.i(TAG, "autopause callback : " + autoPause);
        genAutoPause(autoPause);
    }

    public final void setHandRestartTime(long j) {
        this.handRestartTime = j;
    }

    public final void startAutoPause() {
        this.mSportAlgo.startAutoPause(this);
        FitnessLogUtils.i(TAG, "startAutoPause");
    }

    public final void switchAutoPause(boolean checked, int sportType) {
        FitnessLogUtils.i(TAG, "switch auto pause , checked : " + checked + " , sportType : " + sportType);
        if (f2o.x().W() && isSupportAutoPause(sportType)) {
            if (checked) {
                startAutoPause();
            } else {
                finishAutoPause();
            }
            jdn.h().c.d(checked ? SportSensorManager.SAMPLING_PERIOD_US_25HZ : 3);
        }
    }
}
