package com.xiaomi.fitness.sport_eco.model;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_eco.interfaces.ISportDataListener;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 6*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\b\u0010.\u001a\u00020,H\u0016J\b\u00103\u001a\u00020,H\u0016J\b\u00104\u001a\u000205H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR\u001a\u0010!\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR(\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010/\u001a\u000200¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/model/SportModel;", "D", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "deviceType", "", "getDeviceType", "()I", "setDeviceType", "(I)V", "value", "", "deviceDid", "getDeviceDid", "()Ljava/lang/String;", "setDeviceDid", "(Ljava/lang/String;)V", DailyRecordKey.sportType, "getSportType", "setSportType", "", "sportGoalValue", "getSportGoalValue", "()F", "setSportGoalValue", "(F)V", "sportGoalType", "getSportGoalType", "setSportGoalType", "ecoDeviceFaultCode", "getEcoDeviceFaultCode", "setEcoDeviceFaultCode", "trainingMode", "getTrainingMode", "setTrainingMode", "weak", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/sport_eco/interfaces/ISportDataListener;", "getWeak", "()Ljava/lang/ref/WeakReference;", "setWeak", "(Ljava/lang/ref/WeakReference;)V", LoginPreferenceConfig.TYPE_REGISTER, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "refresh", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", LifecycleConstantKt.ON_DESTROY, "isValidSport", "", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SportModel<D> extends BaseModel {
    private static float GOAL_VALUE;
    private static int SPORT_TYPE;
    private int deviceType;
    private float sportGoalValue;
    private int sportType;

    @Nullable
    private WeakReference<ISportDataListener<D>> weak;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int DEVICE_FAULT_CODE = -1;
    private static int GOAL_TYPE = -1;
    private static int SPORT_TRAINING = -1;

    @NotNull
    private String deviceDid = "xiaomiwear_app";
    private int sportGoalType = -1;
    private int ecoDeviceFaultCode = -1;
    private int trainingMode = -1;

    @NotNull
    private final CoroutineScope scope = CoroutineScopeKt.MainScope();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/model/SportModel$Companion;", "", "<init>", "()V", "GOAL_VALUE", "", "getGOAL_VALUE", "()F", "setGOAL_VALUE", "(F)V", "DEVICE_FAULT_CODE", "", "getDEVICE_FAULT_CODE", "()I", "setDEVICE_FAULT_CODE", "(I)V", "GOAL_TYPE", "getGOAL_TYPE", "setGOAL_TYPE", "SPORT_TYPE", "getSPORT_TYPE", "setSPORT_TYPE", "SPORT_TRAINING", "getSPORT_TRAINING", "setSPORT_TRAINING", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEVICE_FAULT_CODE() {
            return SportModel.DEVICE_FAULT_CODE;
        }

        public final int getGOAL_TYPE() {
            return SportModel.GOAL_TYPE;
        }

        public final float getGOAL_VALUE() {
            return SportModel.GOAL_VALUE;
        }

        public final int getSPORT_TRAINING() {
            return SportModel.SPORT_TRAINING;
        }

        public final int getSPORT_TYPE() {
            return SportModel.SPORT_TYPE;
        }

        public final void setDEVICE_FAULT_CODE(int i) {
            SportModel.DEVICE_FAULT_CODE = i;
        }

        public final void setGOAL_TYPE(int i) {
            SportModel.GOAL_TYPE = i;
        }

        public final void setGOAL_VALUE(float f) {
            SportModel.GOAL_VALUE = f;
        }

        public final void setSPORT_TRAINING(int i) {
            SportModel.SPORT_TRAINING = i;
        }

        public final void setSPORT_TYPE(int i) {
            SportModel.SPORT_TYPE = i;
        }
    }

    @NotNull
    public final String getDeviceDid() {
        return this.deviceDid;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final int getEcoDeviceFaultCode() {
        return this.ecoDeviceFaultCode;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }

    public final int getSportGoalType() {
        return this.sportGoalType;
    }

    public final float getSportGoalValue() {
        return this.sportGoalValue;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getTrainingMode() {
        return this.trainingMode;
    }

    @Nullable
    public final WeakReference<ISportDataListener<D>> getWeak() {
        return this.weak;
    }

    public boolean isValidSport() {
        return false;
    }

    public void onDestroy() {
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }

    public void refresh() {
    }

    public void register(@NotNull ISportDataListener<D> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.weak = new WeakReference<>(listener);
    }

    public final void setDeviceDid(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.deviceDid = value;
        FitnessLogUtils.d("SportModel", "value : " + value);
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setEcoDeviceFaultCode(int i) {
        DEVICE_FAULT_CODE = i;
        this.ecoDeviceFaultCode = i;
    }

    public final void setSportGoalType(int i) {
        GOAL_TYPE = i;
        this.sportGoalType = i;
    }

    public final void setSportGoalValue(float f) {
        GOAL_VALUE = f;
        this.sportGoalValue = f;
    }

    public final void setSportType(int i) {
        SPORT_TYPE = i;
        this.sportType = i;
    }

    public final void setTrainingMode(int i) {
        this.trainingMode = i;
    }

    public final void setWeak(@Nullable WeakReference<ISportDataListener<D>> weakReference) {
        this.weak = weakReference;
    }
}
