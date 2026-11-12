package com.xiaomi.fitness.sport.model;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport.interfaces.ISportDataListener;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 ?*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0016J\b\u00107\u001a\u000205H\u0016J\b\u0010<\u001a\u000205H\u0016J\b\u0010=\u001a\u00020>H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/sport/model/SportModel;", "D", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "deviceType", "", "getDeviceType", "()I", "setDeviceType", "(I)V", "value", "", "deviceDid", "getDeviceDid", "()Ljava/lang/String;", "setDeviceDid", "(Ljava/lang/String;)V", DailyRecordKey.sportType, "getSportType", "setSportType", "", "sportGoalValue", "getSportGoalValue", "()F", "setSportGoalValue", "(F)V", "sportGoalType", "getSportGoalType", "setSportGoalType", "sportWearMode", "getSportWearMode", "setSportWearMode", "abilityPlanCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "getAbilityPlanCourse", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "setAbilityPlanCourse", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;)V", "habitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "getHabitDayPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "setHabitDayPlan", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;)V", "weak", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/sport/interfaces/ISportDataListener;", "getWeak", "()Ljava/lang/ref/WeakReference;", "setWeak", "(Ljava/lang/ref/WeakReference;)V", LoginPreferenceConfig.TYPE_REGISTER, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "refresh", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", LifecycleConstantKt.ON_DESTROY, "isValidSport", "", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SportModel<D> extends BaseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int GOAL_TYPE = -1;
    private static float GOAL_VALUE;
    private static int SPORT_TYPE;

    @Nullable
    private AbilityPlanRunningCourse abilityPlanCourse;
    private int deviceType;

    @Nullable
    private HabitDayPlan habitDayPlan;
    private float sportGoalValue;
    private int sportType;
    private int sportWearMode;

    @Nullable
    private WeakReference<ISportDataListener<D>> weak;

    @NotNull
    private String deviceDid = "xiaomiwear_app";
    private int sportGoalType = -1;

    @NotNull
    private final CoroutineScope scope = CoroutineScopeKt.MainScope();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/model/SportModel$Companion;", "", "<init>", "()V", "GOAL_VALUE", "", "getGOAL_VALUE", "()F", "setGOAL_VALUE", "(F)V", "GOAL_TYPE", "", "getGOAL_TYPE", "()I", "setGOAL_TYPE", "(I)V", "SPORT_TYPE", "getSPORT_TYPE", "setSPORT_TYPE", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getGOAL_TYPE() {
            return SportModel.GOAL_TYPE;
        }

        public final float getGOAL_VALUE() {
            return SportModel.GOAL_VALUE;
        }

        public final int getSPORT_TYPE() {
            return SportModel.SPORT_TYPE;
        }

        public final void setGOAL_TYPE(int i) {
            SportModel.GOAL_TYPE = i;
        }

        public final void setGOAL_VALUE(float f) {
            SportModel.GOAL_VALUE = f;
        }

        public final void setSPORT_TYPE(int i) {
            SportModel.SPORT_TYPE = i;
        }
    }

    @Nullable
    public final AbilityPlanRunningCourse getAbilityPlanCourse() {
        return this.abilityPlanCourse;
    }

    @NotNull
    public final String getDeviceDid() {
        return this.deviceDid;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final HabitDayPlan getHabitDayPlan() {
        return this.habitDayPlan;
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

    public final int getSportWearMode() {
        return this.sportWearMode;
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

    public final void setAbilityPlanCourse(@Nullable AbilityPlanRunningCourse abilityPlanRunningCourse) {
        this.abilityPlanCourse = abilityPlanRunningCourse;
    }

    public final void setDeviceDid(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.deviceDid = value;
        FitnessLogUtils.i("CommonSportModel", "value : " + value);
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setHabitDayPlan(@Nullable HabitDayPlan habitDayPlan) {
        this.habitDayPlan = habitDayPlan;
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

    public final void setSportWearMode(int i) {
        this.sportWearMode = i;
    }

    public final void setWeak(@Nullable WeakReference<ISportDataListener<D>> weakReference) {
        this.weak = weakReference;
    }
}
