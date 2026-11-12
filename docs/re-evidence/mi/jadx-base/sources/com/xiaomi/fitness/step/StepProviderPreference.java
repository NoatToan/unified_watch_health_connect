package com.xiaomi.fitness.step;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/step/StepProviderPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "TAG", "", "SP_FILE_NAME", "OLD_KEY_FIRST_INIT_TIME", "OLD_KEY_LAST_END_TIME", "spName", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "FIRST_INIT_TIME", "getFIRST_INIT_TIME", "()J", "setFIRST_INIT_TIME", "(J)V", "FIRST_INIT_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "LAST_END_TIME", "getLAST_END_TIME", "setLAST_END_TIME", "LAST_END_TIME$delegate", "getStepFirstInitTimeMillis", "getStepLastEndTimeMillis", "updateStepFirstInitTimeMillis", "", "timeMillis", "updateStepLastEndTimeMillis", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepProviderPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepProviderPreference.kt\ncom/xiaomi/fitness/step/StepProviderPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,40:1\n211#2,7:41\n211#2,7:48\n*S KotlinDebug\n*F\n+ 1 StepProviderPreference.kt\ncom/xiaomi/fitness/step/StepProviderPreference\n*L\n19#1:41,7\n21#1:48,7\n*E\n"})
public final class StepProviderPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(StepProviderPreference.class, "FIRST_INIT_TIME", "getFIRST_INIT_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(StepProviderPreference.class, "LAST_END_TIME", "getLAST_END_TIME()J", 0))};

    /* JADX INFO: renamed from: FIRST_INIT_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_INIT_TIME;

    @NotNull
    public static final StepProviderPreference INSTANCE;

    /* JADX INFO: renamed from: LAST_END_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_END_TIME;

    @NotNull
    private static final String OLD_KEY_FIRST_INIT_TIME = "first_init_time";

    @NotNull
    private static final String OLD_KEY_LAST_END_TIME = "last_end_time";

    @NotNull
    private static final String SP_FILE_NAME = "spf_step_provider";

    @NotNull
    public static final String TAG = "StepProviderPreference";

    static {
        StepProviderPreference stepProviderPreference = new StepProviderPreference();
        INSTANCE = stepProviderPreference;
        FIRST_INIT_TIME = stepProviderPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.step.StepProviderPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), 0L, null, null, OLD_KEY_FIRST_INIT_TIME);
        LAST_END_TIME = stepProviderPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.step.StepProviderPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), 0L, null, null, OLD_KEY_LAST_END_TIME);
    }

    private StepProviderPreference() {
    }

    private final long getFIRST_INIT_TIME() {
        return ((Number) FIRST_INIT_TIME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    private final long getLAST_END_TIME() {
        return ((Number) LAST_END_TIME.getValue(this, $$delegatedProperties[1])).longValue();
    }

    private final void setFIRST_INIT_TIME(long j) {
        FIRST_INIT_TIME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    private final void setLAST_END_TIME(long j) {
        LAST_END_TIME.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return SP_FILE_NAME;
    }

    public final long getStepFirstInitTimeMillis() {
        return getFIRST_INIT_TIME();
    }

    public final long getStepLastEndTimeMillis() {
        return getLAST_END_TIME();
    }

    public final void updateStepFirstInitTimeMillis(long timeMillis) {
        Logger.i(TAG, "updateStepFirstInitTime " + timeMillis);
        setFIRST_INIT_TIME(timeMillis);
    }

    public final void updateStepLastEndTimeMillis(long timeMillis) {
        Logger.i(TAG, "updateStepLastEndTime " + timeMillis);
        setLAST_END_TIME(timeMillis);
    }
}
