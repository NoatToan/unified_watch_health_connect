package com.xiaomi.fit.fitness.device.hm;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.LastSyncTimeItem;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00052\u0006\u0010_\u001a\u00020\tJ\u000e\u0010`\u001a\u00020\t2\u0006\u0010^\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR+\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR+\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR+\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0011\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR+\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0011\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR+\u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0011\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR+\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0011\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR+\u0010.\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0011\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR+\u00103\u001a\u0002022\u0006\u0010\n\u001a\u0002028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0011\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010:\u001a\u0002092\u0006\u0010\n\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\u0011\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010@\u001a\u0002092\u0006\u0010\n\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\u0011\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R+\u0010D\u001a\u0002092\u0006\u0010\n\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010\u0011\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R+\u0010H\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u0011\u001a\u0004\bI\u0010\r\"\u0004\bJ\u0010\u000fR+\u0010L\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010\u0011\u001a\u0004\bM\u0010\r\"\u0004\bN\u0010\u000fR+\u0010P\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010\u0011\u001a\u0004\bQ\u0010\r\"\u0004\bR\u0010\u000fR+\u0010T\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010\u0011\u001a\u0004\bU\u0010\r\"\u0004\bV\u0010\u000fR+\u0010X\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\u0011\u001a\u0004\bY\u0010\r\"\u0004\bZ\u0010\u000f¨\u0006a"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/FitnessPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "defaultItem", "Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", "<set-?>", "dailyLastSyncTime", "getDailyLastSyncTime", "()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", "setDailyLastSyncTime", "(Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;)V", "dailyLastSyncTime$delegate", "Lkotlin/properties/ReadWriteProperty;", "paiLastSyncTime", "getPaiLastSyncTime", "setPaiLastSyncTime", "paiLastSyncTime$delegate", "spo2LastSyncTime", "getSpo2LastSyncTime", "setSpo2LastSyncTime", "spo2LastSyncTime$delegate", "singleStressLastSyncTime", "getSingleStressLastSyncTime", "setSingleStressLastSyncTime", "singleStressLastSyncTime$delegate", "afibLastSyncTime", "getAfibLastSyncTime", "setAfibLastSyncTime", "afibLastSyncTime$delegate", "allDayStressLastSyncTime", "getAllDayStressLastSyncTime", "setAllDayStressLastSyncTime", "allDayStressLastSyncTime$delegate", "manualHrLastSyncTime", "getManualHrLastSyncTime", "setManualHrLastSyncTime", "manualHrLastSyncTime$delegate", "reportLastSyncTime", "getReportLastSyncTime", "setReportLastSyncTime", "reportLastSyncTime$delegate", "recordLastSyncTime", "getRecordLastSyncTime", "setRecordLastSyncTime", "recordLastSyncTime$delegate", "", "lastBindTime", "getLastBindTime", "()J", "setLastBindTime", "(J)V", "lastBindTime$delegate", "", "paiTargetDisparity", "getPaiTargetDisparity", "()I", "setPaiTargetDisparity", "(I)V", "paiTargetDisparity$delegate", "paiSuggestHr", "getPaiSuggestHr", "setPaiSuggestHr", "paiSuggestHr$delegate", "paiSuggestTime", "getPaiSuggestTime", "setPaiSuggestTime", "paiSuggestTime$delegate", "trainingLoadLastSyncTime", "getTrainingLoadLastSyncTime", "setTrainingLoadLastSyncTime", "trainingLoadLastSyncTime$delegate", "ActivityDataLastSyncTime", "getActivityDataLastSyncTime", "setActivityDataLastSyncTime", "ActivityDataLastSyncTime$delegate", "RestHrLastSyncTime", "getRestHrLastSyncTime", "setRestHrLastSyncTime", "RestHrLastSyncTime$delegate", "LowSpo2LastSyncTime", "getLowSpo2LastSyncTime", "setLowSpo2LastSyncTime", "LowSpo2LastSyncTime$delegate", "AbnormalHrLastSyncTime", "getAbnormalHrLastSyncTime", "setAbnormalHrLastSyncTime", "AbnormalHrLastSyncTime$delegate", "setLastSyncTime", "", "key", "value", "getLastSyncTime", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessPreference.kt\ncom/xiaomi/fit/fitness/device/hm/FitnessPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,74:1\n135#2,6:75\n135#2,6:81\n135#2,6:87\n135#2,6:93\n135#2,6:99\n135#2,6:105\n135#2,6:111\n135#2,6:117\n135#2,6:123\n135#2,6:129\n135#2,6:135\n135#2,6:141\n135#2,6:147\n135#2,6:153\n135#2,6:159\n135#2,6:165\n135#2,6:171\n135#2,6:177\n*S KotlinDebug\n*F\n+ 1 FitnessPreference.kt\ncom/xiaomi/fit/fitness/device/hm/FitnessPreference\n*L\n17#1:75,6\n18#1:81,6\n19#1:87,6\n20#1:93,6\n21#1:99,6\n22#1:105,6\n23#1:111,6\n24#1:117,6\n25#1:123,6\n26#1:129,6\n27#1:135,6\n28#1:141,6\n29#1:147,6\n30#1:153,6\n31#1:159,6\n32#1:165,6\n33#1:171,6\n34#1:177,6\n*E\n"})
public final class FitnessPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "dailyLastSyncTime", "getDailyLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "paiLastSyncTime", "getPaiLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "spo2LastSyncTime", "getSpo2LastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "singleStressLastSyncTime", "getSingleStressLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "afibLastSyncTime", "getAfibLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "allDayStressLastSyncTime", "getAllDayStressLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "manualHrLastSyncTime", "getManualHrLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "reportLastSyncTime", "getReportLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "recordLastSyncTime", "getRecordLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "lastBindTime", "getLastBindTime()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "paiTargetDisparity", "getPaiTargetDisparity()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "paiSuggestHr", "getPaiSuggestHr()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "paiSuggestTime", "getPaiSuggestTime()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "trainingLoadLastSyncTime", "getTrainingLoadLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "ActivityDataLastSyncTime", "getActivityDataLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "RestHrLastSyncTime", "getRestHrLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "LowSpo2LastSyncTime", "getLowSpo2LastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "AbnormalHrLastSyncTime", "getAbnormalHrLastSyncTime()Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", 0))};

    /* JADX INFO: renamed from: AbnormalHrLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AbnormalHrLastSyncTime;

    /* JADX INFO: renamed from: ActivityDataLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ActivityDataLastSyncTime;

    @NotNull
    public static final FitnessPreference INSTANCE;

    /* JADX INFO: renamed from: LowSpo2LastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LowSpo2LastSyncTime;

    /* JADX INFO: renamed from: RestHrLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty RestHrLastSyncTime;

    /* JADX INFO: renamed from: afibLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty afibLastSyncTime;

    /* JADX INFO: renamed from: allDayStressLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty allDayStressLastSyncTime;

    /* JADX INFO: renamed from: dailyLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty dailyLastSyncTime;

    @NotNull
    private static final LastSyncTimeItem defaultItem;

    /* JADX INFO: renamed from: lastBindTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty lastBindTime;

    /* JADX INFO: renamed from: manualHrLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty manualHrLastSyncTime;

    /* JADX INFO: renamed from: paiLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty paiLastSyncTime;

    /* JADX INFO: renamed from: paiSuggestHr$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty paiSuggestHr;

    /* JADX INFO: renamed from: paiSuggestTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty paiSuggestTime;

    /* JADX INFO: renamed from: paiTargetDisparity$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty paiTargetDisparity;

    /* JADX INFO: renamed from: recordLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty recordLastSyncTime;

    /* JADX INFO: renamed from: reportLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty reportLastSyncTime;

    /* JADX INFO: renamed from: singleStressLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty singleStressLastSyncTime;

    /* JADX INFO: renamed from: spo2LastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty spo2LastSyncTime;

    /* JADX INFO: renamed from: trainingLoadLastSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty trainingLoadLastSyncTime;

    static {
        FitnessPreference fitnessPreference = new FitnessPreference();
        INSTANCE = fitnessPreference;
        LastSyncTimeItem lastSyncTimeItem = new LastSyncTimeItem(FitnessDateUtils.getCurrentTZOffsetIn15min(), 0L);
        defaultItem = lastSyncTimeItem;
        dailyLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), lastSyncTimeItem, null, true);
        paiLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), lastSyncTimeItem, null, true);
        spo2LastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), lastSyncTimeItem, null, true);
        singleStressLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), lastSyncTimeItem, null, true);
        afibLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), lastSyncTimeItem, null, true);
        allDayStressLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), lastSyncTimeItem, null, true);
        manualHrLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), lastSyncTimeItem, null, true);
        reportLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), lastSyncTimeItem, null, true);
        recordLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), lastSyncTimeItem, null, true);
        lastBindTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$10
        }.getType(), 0L, null, true);
        paiTargetDisparity = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$11
        }.getType(), 0, null, true);
        paiSuggestHr = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$12
        }.getType(), 0, null, true);
        paiSuggestTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$13
        }.getType(), 0, null, true);
        trainingLoadLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$14
        }.getType(), lastSyncTimeItem, null, true);
        ActivityDataLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$15
        }.getType(), lastSyncTimeItem, null, true);
        RestHrLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$16
        }.getType(), lastSyncTimeItem, null, true);
        LowSpo2LastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$17
        }.getType(), lastSyncTimeItem, null, true);
        AbnormalHrLastSyncTime = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(LastSyncTimeItem.class), new TypeToken<LastSyncTimeItem>() { // from class: com.xiaomi.fit.fitness.device.hm.FitnessPreference$special$$inlined$bindToPreferenceField$default$18
        }.getType(), lastSyncTimeItem, null, true);
    }

    private FitnessPreference() {
    }

    @NotNull
    public final LastSyncTimeItem getAbnormalHrLastSyncTime() {
        return (LastSyncTimeItem) AbnormalHrLastSyncTime.getValue(this, $$delegatedProperties[17]);
    }

    @NotNull
    public final LastSyncTimeItem getActivityDataLastSyncTime() {
        return (LastSyncTimeItem) ActivityDataLastSyncTime.getValue(this, $$delegatedProperties[14]);
    }

    @NotNull
    public final LastSyncTimeItem getAfibLastSyncTime() {
        return (LastSyncTimeItem) afibLastSyncTime.getValue(this, $$delegatedProperties[4]);
    }

    @NotNull
    public final LastSyncTimeItem getAllDayStressLastSyncTime() {
        return (LastSyncTimeItem) allDayStressLastSyncTime.getValue(this, $$delegatedProperties[5]);
    }

    @NotNull
    public final LastSyncTimeItem getDailyLastSyncTime() {
        return (LastSyncTimeItem) dailyLastSyncTime.getValue(this, $$delegatedProperties[0]);
    }

    public final long getLastBindTime() {
        return ((Number) lastBindTime.getValue(this, $$delegatedProperties[9])).longValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final LastSyncTimeItem getLastSyncTime(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (key.hashCode()) {
            case -2084300059:
                if (key.equals("huami_hl_heart_rate")) {
                    return getAbnormalHrLastSyncTime();
                }
                break;
            case -2049759005:
                if (key.equals("huami_regular_record")) {
                    return getDailyLastSyncTime();
                }
                break;
            case -2027032012:
                if (key.equals("huami_manual_heartrate_record")) {
                    return getManualHrLastSyncTime();
                }
                break;
            case -1592101429:
                if (key.equals("huami_sport_record")) {
                    return getRecordLastSyncTime();
                }
                break;
            case -1591714130:
                if (key.equals("huami_sport_report")) {
                    return getReportLastSyncTime();
                }
                break;
            case -1033870028:
                if (key.equals("huami_training_load_record")) {
                    return getTrainingLoadLastSyncTime();
                }
                break;
            case -679118218:
                if (key.equals("huami_atrial_fibrillation_record")) {
                    return getAfibLastSyncTime();
                }
                break;
            case -662979372:
                if (key.equals("huami_single_stress_record")) {
                    return getSingleStressLastSyncTime();
                }
                break;
            case -619460139:
                if (key.equals("huami_rest_heart_rate")) {
                    return getRestHrLastSyncTime();
                }
                break;
            case -561758054:
                if (key.equals("huami_low_spo2")) {
                    return getLowSpo2LastSyncTime();
                }
                break;
            case 982961668:
                if (key.equals("huami_vitality_index")) {
                    return getActivityDataLastSyncTime();
                }
                break;
            case 1396270055:
                if (key.equals("huami_pai_record")) {
                    return getPaiLastSyncTime();
                }
                break;
            case 1440407884:
                if (key.equals("huami_all_day_stress_record")) {
                    return getAllDayStressLastSyncTime();
                }
                break;
            case 1805437564:
                if (key.equals("huami_manual_measure_record")) {
                    return getSpo2LastSyncTime();
                }
                break;
        }
        return defaultItem;
    }

    @NotNull
    public final LastSyncTimeItem getLowSpo2LastSyncTime() {
        return (LastSyncTimeItem) LowSpo2LastSyncTime.getValue(this, $$delegatedProperties[16]);
    }

    @NotNull
    public final LastSyncTimeItem getManualHrLastSyncTime() {
        return (LastSyncTimeItem) manualHrLastSyncTime.getValue(this, $$delegatedProperties[6]);
    }

    @NotNull
    public final LastSyncTimeItem getPaiLastSyncTime() {
        return (LastSyncTimeItem) paiLastSyncTime.getValue(this, $$delegatedProperties[1]);
    }

    public final int getPaiSuggestHr() {
        return ((Number) paiSuggestHr.getValue(this, $$delegatedProperties[11])).intValue();
    }

    public final int getPaiSuggestTime() {
        return ((Number) paiSuggestTime.getValue(this, $$delegatedProperties[12])).intValue();
    }

    public final int getPaiTargetDisparity() {
        return ((Number) paiTargetDisparity.getValue(this, $$delegatedProperties[10])).intValue();
    }

    @NotNull
    public final LastSyncTimeItem getRecordLastSyncTime() {
        return (LastSyncTimeItem) recordLastSyncTime.getValue(this, $$delegatedProperties[8]);
    }

    @NotNull
    public final LastSyncTimeItem getReportLastSyncTime() {
        return (LastSyncTimeItem) reportLastSyncTime.getValue(this, $$delegatedProperties[7]);
    }

    @NotNull
    public final LastSyncTimeItem getRestHrLastSyncTime() {
        return (LastSyncTimeItem) RestHrLastSyncTime.getValue(this, $$delegatedProperties[15]);
    }

    @NotNull
    public final LastSyncTimeItem getSingleStressLastSyncTime() {
        return (LastSyncTimeItem) singleStressLastSyncTime.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "fitness_sync";
    }

    @NotNull
    public final LastSyncTimeItem getSpo2LastSyncTime() {
        return (LastSyncTimeItem) spo2LastSyncTime.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final LastSyncTimeItem getTrainingLoadLastSyncTime() {
        return (LastSyncTimeItem) trainingLoadLastSyncTime.getValue(this, $$delegatedProperties[13]);
    }

    public final void setAbnormalHrLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        AbnormalHrLastSyncTime.setValue(this, $$delegatedProperties[17], lastSyncTimeItem);
    }

    public final void setActivityDataLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        ActivityDataLastSyncTime.setValue(this, $$delegatedProperties[14], lastSyncTimeItem);
    }

    public final void setAfibLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        afibLastSyncTime.setValue(this, $$delegatedProperties[4], lastSyncTimeItem);
    }

    public final void setAllDayStressLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        allDayStressLastSyncTime.setValue(this, $$delegatedProperties[5], lastSyncTimeItem);
    }

    public final void setDailyLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        dailyLastSyncTime.setValue(this, $$delegatedProperties[0], lastSyncTimeItem);
    }

    public final void setLastBindTime(long j) {
        lastBindTime.setValue(this, $$delegatedProperties[9], Long.valueOf(j));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setLastSyncTime(@NotNull String key, @NotNull LastSyncTimeItem value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (key.hashCode()) {
            case -2084300059:
                if (key.equals("huami_hl_heart_rate")) {
                    setAbnormalHrLastSyncTime(value);
                    break;
                }
                break;
            case -2049759005:
                if (key.equals("huami_regular_record")) {
                    setDailyLastSyncTime(value);
                    break;
                }
                break;
            case -2027032012:
                if (key.equals("huami_manual_heartrate_record")) {
                    setManualHrLastSyncTime(value);
                    break;
                }
                break;
            case -1592101429:
                if (key.equals("huami_sport_record")) {
                    setRecordLastSyncTime(value);
                    break;
                }
                break;
            case -1591714130:
                if (key.equals("huami_sport_report")) {
                    setReportLastSyncTime(value);
                    break;
                }
                break;
            case -1033870028:
                if (key.equals("huami_training_load_record")) {
                    setTrainingLoadLastSyncTime(value);
                    break;
                }
                break;
            case -679118218:
                if (key.equals("huami_atrial_fibrillation_record")) {
                    setAfibLastSyncTime(value);
                    break;
                }
                break;
            case -662979372:
                if (key.equals("huami_single_stress_record")) {
                    setSingleStressLastSyncTime(value);
                    break;
                }
                break;
            case -619460139:
                if (key.equals("huami_rest_heart_rate")) {
                    setRestHrLastSyncTime(value);
                    break;
                }
                break;
            case -561758054:
                if (key.equals("huami_low_spo2")) {
                    setLowSpo2LastSyncTime(value);
                    break;
                }
                break;
            case 982961668:
                if (key.equals("huami_vitality_index")) {
                    setActivityDataLastSyncTime(value);
                    break;
                }
                break;
            case 1396270055:
                if (key.equals("huami_pai_record")) {
                    setPaiLastSyncTime(value);
                    break;
                }
                break;
            case 1440407884:
                if (key.equals("huami_all_day_stress_record")) {
                    setAllDayStressLastSyncTime(value);
                    break;
                }
                break;
            case 1805437564:
                if (key.equals("huami_manual_measure_record")) {
                    setSpo2LastSyncTime(value);
                    break;
                }
                break;
        }
    }

    public final void setLowSpo2LastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        LowSpo2LastSyncTime.setValue(this, $$delegatedProperties[16], lastSyncTimeItem);
    }

    public final void setManualHrLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        manualHrLastSyncTime.setValue(this, $$delegatedProperties[6], lastSyncTimeItem);
    }

    public final void setPaiLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        paiLastSyncTime.setValue(this, $$delegatedProperties[1], lastSyncTimeItem);
    }

    public final void setPaiSuggestHr(int i) {
        paiSuggestHr.setValue(this, $$delegatedProperties[11], Integer.valueOf(i));
    }

    public final void setPaiSuggestTime(int i) {
        paiSuggestTime.setValue(this, $$delegatedProperties[12], Integer.valueOf(i));
    }

    public final void setPaiTargetDisparity(int i) {
        paiTargetDisparity.setValue(this, $$delegatedProperties[10], Integer.valueOf(i));
    }

    public final void setRecordLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        recordLastSyncTime.setValue(this, $$delegatedProperties[8], lastSyncTimeItem);
    }

    public final void setReportLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        reportLastSyncTime.setValue(this, $$delegatedProperties[7], lastSyncTimeItem);
    }

    public final void setRestHrLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        RestHrLastSyncTime.setValue(this, $$delegatedProperties[15], lastSyncTimeItem);
    }

    public final void setSingleStressLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        singleStressLastSyncTime.setValue(this, $$delegatedProperties[3], lastSyncTimeItem);
    }

    public final void setSpo2LastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        spo2LastSyncTime.setValue(this, $$delegatedProperties[2], lastSyncTimeItem);
    }

    public final void setTrainingLoadLastSyncTime(@NotNull LastSyncTimeItem lastSyncTimeItem) {
        Intrinsics.checkNotNullParameter(lastSyncTimeItem, "<set-?>");
        trainingLoadLastSyncTime.setValue(this, $$delegatedProperties[13], lastSyncTimeItem);
    }
}
