package com.xiaomi.fitness.data;

import com.google.gson.Gson;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.data.bean.AirEcoRainbowModel;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010E\u001a\u00020FJ8\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020\u001d2\b\b\u0002\u0010J\u001a\u00020\u001d2\b\b\u0002\u0010K\u001a\u00020\u001d2\b\b\u0002\u0010L\u001a\u00020\u001d2\b\b\u0002\u0010M\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R+\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0014\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010$\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0014\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R+\u0010)\u001a\u00020(2\u0006\u0010\f\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0014\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u0010/\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0014\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u00105\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0014\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010\u0012R+\u00109\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u0014\u001a\u0004\b:\u0010\u0010\"\u0004\b;\u0010\u0012R+\u0010=\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u0014\u001a\u0004\b>\u00101\"\u0004\b?\u00103R+\u0010A\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0014\u001a\u0004\bB\u0010\u0010\"\u0004\bC\u0010\u0012R+\u0010N\u001a\u00020(2\u0006\u0010\f\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u0014\u001a\u0004\bO\u0010+\"\u0004\bP\u0010-R7\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001d0R2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u001d0R8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\u0014\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u00101¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/data/HealthPrefer;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "TAG", "", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "<set-?>", "", "CURSE_IN_NOTIFY_TIME", "getCURSE_IN_NOTIFY_TIME", "()J", "setCURSE_IN_NOTIFY_TIME", "(J)V", "CURSE_IN_NOTIFY_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "CURSE_OVUM_NOTIFY_TIME", "getCURSE_OVUM_NOTIFY_TIME", "setCURSE_OVUM_NOTIFY_TIME", "CURSE_OVUM_NOTIFY_TIME$delegate", "CURSE_PREGNANCY_NOTIFY_TIME", "getCURSE_PREGNANCY_NOTIFY_TIME", "setCURSE_PREGNANCY_NOTIFY_TIME", "CURSE_PREGNANCY_NOTIFY_TIME$delegate", "", "SLEEP_GOAL_TIME_LOCAL", "getSLEEP_GOAL_TIME_LOCAL", "()I", "setSLEEP_GOAL_TIME_LOCAL", "(I)V", "SLEEP_GOAL_TIME_LOCAL$delegate", "CALENDAR_FRAGMENT_POSITION", "getCALENDAR_FRAGMENT_POSITION", "setCALENDAR_FRAGMENT_POSITION", "CALENDAR_FRAGMENT_POSITION$delegate", "", "PINGAN_HEALTH_AUTHORIZED", "getPINGAN_HEALTH_AUTHORIZED", "()Z", "setPINGAN_HEALTH_AUTHORIZED", "(Z)V", "PINGAN_HEALTH_AUTHORIZED$delegate", "PINGAN_HEALTH_URL", "getPINGAN_HEALTH_URL", "()Ljava/lang/String;", "setPINGAN_HEALTH_URL", "(Ljava/lang/String;)V", "PINGAN_HEALTH_URL$delegate", "NOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS", "getNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS", "setNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS", "NOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS$delegate", "LAST_SENT_SLEEP_TIMESTAMP_MILLS", "getLAST_SENT_SLEEP_TIMESTAMP_MILLS", "setLAST_SENT_SLEEP_TIMESTAMP_MILLS", "LAST_SENT_SLEEP_TIMESTAMP_MILLS$delegate", "PREV_DYNAMIC_GOALS_JSON", "getPREV_DYNAMIC_GOALS_JSON", "setPREV_DYNAMIC_GOALS_JSON", "PREV_DYNAMIC_GOALS_JSON$delegate", "LAST_NOTICE_DEVICE_WEAR_TIME", "getLAST_NOTICE_DEVICE_WEAR_TIME", "setLAST_NOTICE_DEVICE_WEAR_TIME", "LAST_NOTICE_DEVICE_WEAR_TIME$delegate", "getPrevDynamicGoalModel", "Lcom/xiaomi/fitness/data/bean/AirEcoRainbowModel;", "setPrevDynamicGoal", "", "prevStep", "prevCal", "prevStand", "prevMHStrength", "prevSleepSegmentCount", "PULL_RECENT_ONE_YEAR_DATA_DONE", "getPULL_RECENT_ONE_YEAR_DATA_DONE", "setPULL_RECENT_ONE_YEAR_DATA_DONE", "PULL_RECENT_ONE_YEAR_DATA_DONE$delegate", "", "HEALTH_CARD_SORT", "getHEALTH_CARD_SORT", "()Ljava/util/List;", "setHEALTH_CARD_SORT", "(Ljava/util/List;)V", "HEALTH_CARD_SORT$delegate", "spName", "getSpName", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthPrefer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthPrefer.kt\ncom/xiaomi/fitness/data/HealthPrefer\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,83:1\n135#2,6:84\n135#2,6:90\n135#2,6:96\n135#2,6:102\n135#2,6:108\n135#2,6:114\n135#2,6:120\n135#2,6:126\n135#2,6:132\n135#2,6:138\n135#2,6:144\n135#2,6:150\n135#2,6:156\n*S KotlinDebug\n*F\n+ 1 HealthPrefer.kt\ncom/xiaomi/fitness/data/HealthPrefer\n*L\n16#1:84,6\n17#1:90,6\n18#1:96,6\n21#1:102,6\n22#1:108,6\n24#1:114,6\n25#1:120,6\n31#1:126,6\n37#1:132,6\n42#1:138,6\n49#1:144,6\n77#1:150,6\n79#1:156,6\n*E\n"})
public final class HealthPrefer extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "CURSE_IN_NOTIFY_TIME", "getCURSE_IN_NOTIFY_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "CURSE_OVUM_NOTIFY_TIME", "getCURSE_OVUM_NOTIFY_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "CURSE_PREGNANCY_NOTIFY_TIME", "getCURSE_PREGNANCY_NOTIFY_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "SLEEP_GOAL_TIME_LOCAL", "getSLEEP_GOAL_TIME_LOCAL()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "CALENDAR_FRAGMENT_POSITION", "getCALENDAR_FRAGMENT_POSITION()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "PINGAN_HEALTH_AUTHORIZED", "getPINGAN_HEALTH_AUTHORIZED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "PINGAN_HEALTH_URL", "getPINGAN_HEALTH_URL()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "NOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS", "getNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "LAST_SENT_SLEEP_TIMESTAMP_MILLS", "getLAST_SENT_SLEEP_TIMESTAMP_MILLS()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "PREV_DYNAMIC_GOALS_JSON", "getPREV_DYNAMIC_GOALS_JSON()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "LAST_NOTICE_DEVICE_WEAR_TIME", "getLAST_NOTICE_DEVICE_WEAR_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "PULL_RECENT_ONE_YEAR_DATA_DONE", "getPULL_RECENT_ONE_YEAR_DATA_DONE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthPrefer.class, "HEALTH_CARD_SORT", "getHEALTH_CARD_SORT()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: CALENDAR_FRAGMENT_POSITION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CALENDAR_FRAGMENT_POSITION;

    /* JADX INFO: renamed from: CURSE_IN_NOTIFY_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURSE_IN_NOTIFY_TIME;

    /* JADX INFO: renamed from: CURSE_OVUM_NOTIFY_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURSE_OVUM_NOTIFY_TIME;

    /* JADX INFO: renamed from: CURSE_PREGNANCY_NOTIFY_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURSE_PREGNANCY_NOTIFY_TIME;

    /* JADX INFO: renamed from: HEALTH_CARD_SORT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty HEALTH_CARD_SORT;

    @NotNull
    public static final HealthPrefer INSTANCE;

    /* JADX INFO: renamed from: LAST_NOTICE_DEVICE_WEAR_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_NOTICE_DEVICE_WEAR_TIME;

    /* JADX INFO: renamed from: LAST_SENT_SLEEP_TIMESTAMP_MILLS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_SENT_SLEEP_TIMESTAMP_MILLS;

    /* JADX INFO: renamed from: NOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS;

    /* JADX INFO: renamed from: PINGAN_HEALTH_AUTHORIZED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PINGAN_HEALTH_AUTHORIZED;

    /* JADX INFO: renamed from: PINGAN_HEALTH_URL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PINGAN_HEALTH_URL;

    /* JADX INFO: renamed from: PREV_DYNAMIC_GOALS_JSON$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREV_DYNAMIC_GOALS_JSON;

    /* JADX INFO: renamed from: PULL_RECENT_ONE_YEAR_DATA_DONE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PULL_RECENT_ONE_YEAR_DATA_DONE;

    /* JADX INFO: renamed from: SLEEP_GOAL_TIME_LOCAL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SLEEP_GOAL_TIME_LOCAL;

    @NotNull
    public static final String TAG = "HealthPrefer";

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy gson;

    static {
        HealthPrefer healthPrefer = new HealthPrefer();
        INSTANCE = healthPrefer;
        gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r0c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthPrefer.gson_delegate$lambda$0();
            }
        });
        CURSE_IN_NOTIFY_TIME = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, true);
        CURSE_OVUM_NOTIFY_TIME = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
        CURSE_PREGNANCY_NOTIFY_TIME = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$3
        }.getType(), 0L, null, true);
        SLEEP_GOAL_TIME_LOCAL = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$4
        }.getType(), 480, null, true);
        CALENDAR_FRAGMENT_POSITION = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$5
        }.getType(), -1, null, true);
        Boolean bool = Boolean.FALSE;
        PINGAN_HEALTH_AUTHORIZED = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$6
        }.getType(), bool, null, true);
        PINGAN_HEALTH_URL = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$7
        }.getType(), PingAnHealthExtKt.URL_SPECIFIC, null, true);
        NOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$8
        }.getType(), 0L, null, true);
        LAST_SENT_SLEEP_TIMESTAMP_MILLS = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$9
        }.getType(), 0L, null, true);
        String json = healthPrefer.getGson().toJson(new AirEcoRainbowModel(0, 0, 0, 0, 0, 31, null));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        PREV_DYNAMIC_GOALS_JSON = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$10
        }.getType(), json, null, true);
        LAST_NOTICE_DEVICE_WEAR_TIME = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$11
        }.getType(), 0L, null, true);
        PULL_RECENT_ONE_YEAR_DATA_DONE = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$12
        }.getType(), bool, null, true);
        HEALTH_CARD_SORT = healthPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(List.class), new TypeToken<List<Integer>>() { // from class: com.xiaomi.fitness.data.HealthPrefer$special$$inlined$bindToPreferenceField$default$13
        }.getType(), new ArrayList(), null, true);
    }

    private HealthPrefer() {
    }

    private final String getPREV_DYNAMIC_GOALS_JSON() {
        return (String) PREV_DYNAMIC_GOALS_JSON.getValue(this, $$delegatedProperties[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$0() {
        return new Gson();
    }

    private final void setPREV_DYNAMIC_GOALS_JSON(String str) {
        PREV_DYNAMIC_GOALS_JSON.setValue(this, $$delegatedProperties[9], str);
    }

    public static /* synthetic */ void setPrevDynamicGoal$default(HealthPrefer healthPrefer, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = healthPrefer.getPrevDynamicGoalModel().getPrevStep();
        }
        if ((i6 & 2) != 0) {
            i2 = healthPrefer.getPrevDynamicGoalModel().getPrevCal();
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = healthPrefer.getPrevDynamicGoalModel().getPrevStand();
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = healthPrefer.getPrevDynamicGoalModel().getPrevMHStrength();
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = healthPrefer.getPrevDynamicGoalModel().getPrevSleepSegmentCount();
        }
        healthPrefer.setPrevDynamicGoal(i, i7, i8, i9, i5);
    }

    public final int getCALENDAR_FRAGMENT_POSITION() {
        return ((Number) CALENDAR_FRAGMENT_POSITION.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final long getCURSE_IN_NOTIFY_TIME() {
        return ((Number) CURSE_IN_NOTIFY_TIME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final long getCURSE_OVUM_NOTIFY_TIME() {
        return ((Number) CURSE_OVUM_NOTIFY_TIME.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final long getCURSE_PREGNANCY_NOTIFY_TIME() {
        return ((Number) CURSE_PREGNANCY_NOTIFY_TIME.getValue(this, $$delegatedProperties[2])).longValue();
    }

    @NotNull
    public final Gson getGson() {
        return (Gson) gson.getValue();
    }

    @NotNull
    public final List<Integer> getHEALTH_CARD_SORT() {
        return (List) HEALTH_CARD_SORT.getValue(this, $$delegatedProperties[12]);
    }

    public final long getLAST_NOTICE_DEVICE_WEAR_TIME() {
        return ((Number) LAST_NOTICE_DEVICE_WEAR_TIME.getValue(this, $$delegatedProperties[10])).longValue();
    }

    public final long getLAST_SENT_SLEEP_TIMESTAMP_MILLS() {
        return ((Number) LAST_SENT_SLEEP_TIMESTAMP_MILLS.getValue(this, $$delegatedProperties[8])).longValue();
    }

    public final long getNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS() {
        return ((Number) NOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS.getValue(this, $$delegatedProperties[7])).longValue();
    }

    public final boolean getPINGAN_HEALTH_AUTHORIZED() {
        return ((Boolean) PINGAN_HEALTH_AUTHORIZED.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    @NotNull
    public final String getPINGAN_HEALTH_URL() {
        return (String) PINGAN_HEALTH_URL.getValue(this, $$delegatedProperties[6]);
    }

    public final boolean getPULL_RECENT_ONE_YEAR_DATA_DONE() {
        return ((Boolean) PULL_RECENT_ONE_YEAR_DATA_DONE.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    @NotNull
    public final AirEcoRainbowModel getPrevDynamicGoalModel() {
        try {
            return (AirEcoRainbowModel) getGson().fromJson(getPREV_DYNAMIC_GOALS_JSON(), AirEcoRainbowModel.class);
        } catch (Exception e) {
            Logger.i(TAG, "getDynamicGoalObject failed. e=" + e);
            return new AirEcoRainbowModel(0, 0, 0, 0, 0, 31, null);
        }
    }

    public final int getSLEEP_GOAL_TIME_LOCAL() {
        return ((Number) SLEEP_GOAL_TIME_LOCAL.getValue(this, $$delegatedProperties[3])).intValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "health_prefer";
    }

    public final void setCALENDAR_FRAGMENT_POSITION(int i) {
        CALENDAR_FRAGMENT_POSITION.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    public final void setCURSE_IN_NOTIFY_TIME(long j) {
        CURSE_IN_NOTIFY_TIME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setCURSE_OVUM_NOTIFY_TIME(long j) {
        CURSE_OVUM_NOTIFY_TIME.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setCURSE_PREGNANCY_NOTIFY_TIME(long j) {
        CURSE_PREGNANCY_NOTIFY_TIME.setValue(this, $$delegatedProperties[2], Long.valueOf(j));
    }

    public final void setHEALTH_CARD_SORT(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        HEALTH_CARD_SORT.setValue(this, $$delegatedProperties[12], list);
    }

    public final void setLAST_NOTICE_DEVICE_WEAR_TIME(long j) {
        LAST_NOTICE_DEVICE_WEAR_TIME.setValue(this, $$delegatedProperties[10], Long.valueOf(j));
    }

    public final void setLAST_SENT_SLEEP_TIMESTAMP_MILLS(long j) {
        LAST_SENT_SLEEP_TIMESTAMP_MILLS.setValue(this, $$delegatedProperties[8], Long.valueOf(j));
    }

    public final void setNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS(long j) {
        NOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS.setValue(this, $$delegatedProperties[7], Long.valueOf(j));
    }

    public final void setPINGAN_HEALTH_AUTHORIZED(boolean z) {
        PINGAN_HEALTH_AUTHORIZED.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setPINGAN_HEALTH_URL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PINGAN_HEALTH_URL.setValue(this, $$delegatedProperties[6], str);
    }

    public final void setPULL_RECENT_ONE_YEAR_DATA_DONE(boolean z) {
        PULL_RECENT_ONE_YEAR_DATA_DONE.setValue(this, $$delegatedProperties[11], Boolean.valueOf(z));
    }

    public final void setPrevDynamicGoal(int prevStep, int prevCal, int prevStand, int prevMHStrength, int prevSleepSegmentCount) {
        AirEcoRainbowModel prevDynamicGoalModel = getPrevDynamicGoalModel();
        prevDynamicGoalModel.setPrevStep(prevStep);
        prevDynamicGoalModel.setPrevCal(prevCal);
        prevDynamicGoalModel.setPrevStand(prevStand);
        prevDynamicGoalModel.setPrevMHStrength(prevMHStrength);
        prevDynamicGoalModel.setPrevSleepSegmentCount(prevSleepSegmentCount);
        setPREV_DYNAMIC_GOALS_JSON(getGson().toJson(prevDynamicGoalModel));
        Logger.d(TAG, "setPrevDynamicGoal PREV_DYNAMIC_GOALS_JSON=" + getPREV_DYNAMIC_GOALS_JSON());
    }

    public final void setSLEEP_GOAL_TIME_LOCAL(int i) {
        SLEEP_GOAL_TIME_LOCAL.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }
}
