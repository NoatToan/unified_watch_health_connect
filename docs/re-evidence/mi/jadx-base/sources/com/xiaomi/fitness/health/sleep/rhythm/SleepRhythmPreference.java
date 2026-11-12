package com.xiaomi.fitness.health.sleep.rhythm;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR+\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR+\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "TAG", "<set-?>", "", "isShowCycleSelectTip", "()Z", "setShowCycleSelectTip", "(Z)V", "isShowCycleSelectTip$delegate", "Lkotlin/properties/ReadWriteProperty;", "usedSleepRhythmMonitorCycle", "getUsedSleepRhythmMonitorCycle", "setUsedSleepRhythmMonitorCycle", "usedSleepRhythmMonitorCycle$delegate", "hasShowRecordDiaryGuidePopup", "getHasShowRecordDiaryGuidePopup", "setHasShowRecordDiaryGuidePopup", "hasShowRecordDiaryGuidePopup$delegate", "hasShowRhythmDownLoadRemind", "getHasShowRhythmDownLoadRemind", "setHasShowRhythmDownLoadRemind", "hasShowRhythmDownLoadRemind$delegate", "hasShowRhythmUpLoadRemind", "getHasShowRhythmUpLoadRemind", "setHasShowRhythmUpLoadRemind", "hasShowRhythmUpLoadRemind$delegate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmPreference.kt\ncom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,19:1\n140#2:20\n135#2,6:21\n140#2:27\n140#2:28\n140#2:29\n*S KotlinDebug\n*F\n+ 1 SleepRhythmPreference.kt\ncom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmPreference\n*L\n11#1:20\n13#1:21,6\n15#1:27\n17#1:28\n18#1:29\n*E\n"})
public final class SleepRhythmPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepRhythmPreference.class, "isShowCycleSelectTip", "isShowCycleSelectTip()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepRhythmPreference.class, "usedSleepRhythmMonitorCycle", "getUsedSleepRhythmMonitorCycle()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepRhythmPreference.class, "hasShowRecordDiaryGuidePopup", "getHasShowRecordDiaryGuidePopup()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepRhythmPreference.class, "hasShowRhythmDownLoadRemind", "getHasShowRhythmDownLoadRemind()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepRhythmPreference.class, "hasShowRhythmUpLoadRemind", "getHasShowRhythmUpLoadRemind()Z", 0))};

    @NotNull
    public static final SleepRhythmPreference INSTANCE;

    @NotNull
    public static final String TAG = "SleepRhythmPreference";

    /* JADX INFO: renamed from: hasShowRecordDiaryGuidePopup$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty hasShowRecordDiaryGuidePopup;

    /* JADX INFO: renamed from: hasShowRhythmDownLoadRemind$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty hasShowRhythmDownLoadRemind;

    /* JADX INFO: renamed from: hasShowRhythmUpLoadRemind$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty hasShowRhythmUpLoadRemind;

    /* JADX INFO: renamed from: isShowCycleSelectTip$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty isShowCycleSelectTip;

    /* JADX INFO: renamed from: usedSleepRhythmMonitorCycle$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty usedSleepRhythmMonitorCycle;

    static {
        SleepRhythmPreference sleepRhythmPreference = new SleepRhythmPreference();
        INSTANCE = sleepRhythmPreference;
        Boolean bool = Boolean.FALSE;
        isShowCycleSelectTip = sleepRhythmPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), bool, null, true);
        usedSleepRhythmMonitorCycle = sleepRhythmPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        hasShowRecordDiaryGuidePopup = sleepRhythmPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference$special$$inlined$bindToPreferenceField$2
        }.getType(), bool, null, true);
        hasShowRhythmDownLoadRemind = sleepRhythmPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference$special$$inlined$bindToPreferenceField$3
        }.getType(), bool, null, true);
        hasShowRhythmUpLoadRemind = sleepRhythmPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference$special$$inlined$bindToPreferenceField$4
        }.getType(), bool, null, true);
    }

    private SleepRhythmPreference() {
    }

    public final boolean getHasShowRecordDiaryGuidePopup() {
        return ((Boolean) hasShowRecordDiaryGuidePopup.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getHasShowRhythmDownLoadRemind() {
        return ((Boolean) hasShowRhythmDownLoadRemind.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getHasShowRhythmUpLoadRemind() {
        return ((Boolean) hasShowRhythmUpLoadRemind.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sleep_rhythm_pref";
    }

    public final boolean getUsedSleepRhythmMonitorCycle() {
        return ((Boolean) usedSleepRhythmMonitorCycle.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean isShowCycleSelectTip() {
        return ((Boolean) isShowCycleSelectTip.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setHasShowRecordDiaryGuidePopup(boolean z) {
        hasShowRecordDiaryGuidePopup.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setHasShowRhythmDownLoadRemind(boolean z) {
        hasShowRhythmDownLoadRemind.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setHasShowRhythmUpLoadRemind(boolean z) {
        hasShowRhythmUpLoadRemind.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setShowCycleSelectTip(boolean z) {
        isShowCycleSelectTip.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setUsedSleepRhythmMonitorCycle(boolean z) {
        usedSleepRhythmMonitorCycle.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }
}
