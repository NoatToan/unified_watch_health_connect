package com.xiaomi.fitness.training_plan.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/TrainingPlanPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "SAVE_PLAN_TO_CALENDAR", "getSAVE_PLAN_TO_CALENDAR", "()Z", "setSAVE_PLAN_TO_CALENDAR", "(Z)V", "SAVE_PLAN_TO_CALENDAR$delegate", "Lkotlin/properties/ReadWriteProperty;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainingPlanPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingPlanPreference.kt\ncom/xiaomi/fitness/training_plan/util/TrainingPlanPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,11:1\n135#2,6:12\n*S KotlinDebug\n*F\n+ 1 TrainingPlanPreference.kt\ncom/xiaomi/fitness/training_plan/util/TrainingPlanPreference\n*L\n9#1:12,6\n*E\n"})
public final class TrainingPlanPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TrainingPlanPreference.class, "SAVE_PLAN_TO_CALENDAR", "getSAVE_PLAN_TO_CALENDAR()Z", 0))};

    @NotNull
    public static final TrainingPlanPreference INSTANCE;

    /* JADX INFO: renamed from: SAVE_PLAN_TO_CALENDAR$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SAVE_PLAN_TO_CALENDAR;

    static {
        TrainingPlanPreference trainingPlanPreference = new TrainingPlanPreference();
        INSTANCE = trainingPlanPreference;
        SAVE_PLAN_TO_CALENDAR = trainingPlanPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.training_plan.util.TrainingPlanPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
    }

    private TrainingPlanPreference() {
    }

    public final boolean getSAVE_PLAN_TO_CALENDAR() {
        return ((Boolean) SAVE_PLAN_TO_CALENDAR.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "training_plan_sp";
    }

    public final void setSAVE_PLAN_TO_CALENDAR(boolean z) {
        SAVE_PLAN_TO_CALENDAR.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
