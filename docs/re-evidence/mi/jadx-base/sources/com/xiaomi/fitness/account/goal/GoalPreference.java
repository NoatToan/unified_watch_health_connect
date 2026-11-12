package com.xiaomi.fitness.account.goal;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011J\u0006\u0010'\u001a\u00020\u0011J\u000e\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011J\u0006\u0010)\u001a\u00020\u0011J\u000e\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011J\u0006\u0010+\u001a\u00020\u0011J\u000e\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020\u0011J\u000e\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020\tJ\u0006\u00100\u001a\u00020\tJ\u0010\u00101\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u000203R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R+\u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R+\u0010 \u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/account/goal/GoalPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "NOT_LOGIN_SET_GOAL_FLAG", "getNOT_LOGIN_SET_GOAL_FLAG", "()Z", "setNOT_LOGIN_SET_GOAL_FLAG", "(Z)V", "NOT_LOGIN_SET_GOAL_FLAG$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "NOT_LOGIN_SET_STEEP_GOAL", "getNOT_LOGIN_SET_STEEP_GOAL", "()I", "setNOT_LOGIN_SET_STEEP_GOAL", "(I)V", "NOT_LOGIN_SET_STEEP_GOAL$delegate", "NOT_LOGIN_SET_CALORIE_GOAL", "getNOT_LOGIN_SET_CALORIE_GOAL", "setNOT_LOGIN_SET_CALORIE_GOAL", "NOT_LOGIN_SET_CALORIE_GOAL$delegate", "NOT_LOGIN_SET_MHS_GOAL", "getNOT_LOGIN_SET_MHS_GOAL", "setNOT_LOGIN_SET_MHS_GOAL", "NOT_LOGIN_SET_MHS_GOAL$delegate", "NOT_LOGIN_SET_STAND_TIME_GOAL", "getNOT_LOGIN_SET_STAND_TIME_GOAL", "setNOT_LOGIN_SET_STAND_TIME_GOAL", "NOT_LOGIN_SET_STAND_TIME_GOAL$delegate", "setNotLoginStepGoal", "", "value", "getNotLoginStepGoal", "setNotLoginCalorieGoal", "getNotLoginCalorieGoal", "setNotLoginMhsGoal", "getNotLoginMhsGoal", "setNotLoginStandTimeGoal", "getNotLoginStandTimeGoal", "setNotLoginSetGoalFlag", "flag", "getNotLoginSetGoalFlag", "getDefaultCalore", "weight", "", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGoalPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoalPreference.kt\ncom/xiaomi/fitness/account/goal/GoalPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,67:1\n135#2,6:68\n135#2,6:74\n135#2,6:80\n135#2,6:86\n135#2,6:92\n*S KotlinDebug\n*F\n+ 1 GoalPreference.kt\ncom/xiaomi/fitness/account/goal/GoalPreference\n*L\n12#1:68,6\n14#1:74,6\n16#1:80,6\n18#1:86,6\n20#1:92,6\n*E\n"})
public final class GoalPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(GoalPreference.class, "NOT_LOGIN_SET_GOAL_FLAG", "getNOT_LOGIN_SET_GOAL_FLAG()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(GoalPreference.class, "NOT_LOGIN_SET_STEEP_GOAL", "getNOT_LOGIN_SET_STEEP_GOAL()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(GoalPreference.class, "NOT_LOGIN_SET_CALORIE_GOAL", "getNOT_LOGIN_SET_CALORIE_GOAL()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(GoalPreference.class, "NOT_LOGIN_SET_MHS_GOAL", "getNOT_LOGIN_SET_MHS_GOAL()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(GoalPreference.class, "NOT_LOGIN_SET_STAND_TIME_GOAL", "getNOT_LOGIN_SET_STAND_TIME_GOAL()I", 0))};

    @NotNull
    public static final GoalPreference INSTANCE;

    /* JADX INFO: renamed from: NOT_LOGIN_SET_CALORIE_GOAL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOT_LOGIN_SET_CALORIE_GOAL;

    /* JADX INFO: renamed from: NOT_LOGIN_SET_GOAL_FLAG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOT_LOGIN_SET_GOAL_FLAG;

    /* JADX INFO: renamed from: NOT_LOGIN_SET_MHS_GOAL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOT_LOGIN_SET_MHS_GOAL;

    /* JADX INFO: renamed from: NOT_LOGIN_SET_STAND_TIME_GOAL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOT_LOGIN_SET_STAND_TIME_GOAL;

    /* JADX INFO: renamed from: NOT_LOGIN_SET_STEEP_GOAL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOT_LOGIN_SET_STEEP_GOAL;

    static {
        GoalPreference goalPreference = new GoalPreference();
        INSTANCE = goalPreference;
        NOT_LOGIN_SET_GOAL_FLAG = goalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.account.goal.GoalPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
        NOT_LOGIN_SET_STEEP_GOAL = goalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.account.goal.GoalPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 6000, null, true);
        NOT_LOGIN_SET_CALORIE_GOAL = goalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.account.goal.GoalPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), Integer.valueOf(getDefaultCalore$default(goalPreference, 0.0f, 1, null)), null, true);
        NOT_LOGIN_SET_MHS_GOAL = goalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.account.goal.GoalPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), 30, null, true);
        NOT_LOGIN_SET_STAND_TIME_GOAL = goalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.account.goal.GoalPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), 12, null, true);
    }

    private GoalPreference() {
    }

    public static /* synthetic */ int getDefaultCalore$default(GoalPreference goalPreference, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 60.0f;
        }
        return goalPreference.getDefaultCalore(f);
    }

    private final int getNOT_LOGIN_SET_CALORIE_GOAL() {
        return ((Number) NOT_LOGIN_SET_CALORIE_GOAL.getValue(this, $$delegatedProperties[2])).intValue();
    }

    private final boolean getNOT_LOGIN_SET_GOAL_FLAG() {
        return ((Boolean) NOT_LOGIN_SET_GOAL_FLAG.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final int getNOT_LOGIN_SET_MHS_GOAL() {
        return ((Number) NOT_LOGIN_SET_MHS_GOAL.getValue(this, $$delegatedProperties[3])).intValue();
    }

    private final int getNOT_LOGIN_SET_STAND_TIME_GOAL() {
        return ((Number) NOT_LOGIN_SET_STAND_TIME_GOAL.getValue(this, $$delegatedProperties[4])).intValue();
    }

    private final int getNOT_LOGIN_SET_STEEP_GOAL() {
        return ((Number) NOT_LOGIN_SET_STEEP_GOAL.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final void setNOT_LOGIN_SET_CALORIE_GOAL(int i) {
        NOT_LOGIN_SET_CALORIE_GOAL.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    private final void setNOT_LOGIN_SET_GOAL_FLAG(boolean z) {
        NOT_LOGIN_SET_GOAL_FLAG.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final void setNOT_LOGIN_SET_MHS_GOAL(int i) {
        NOT_LOGIN_SET_MHS_GOAL.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }

    private final void setNOT_LOGIN_SET_STAND_TIME_GOAL(int i) {
        NOT_LOGIN_SET_STAND_TIME_GOAL.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    private final void setNOT_LOGIN_SET_STEEP_GOAL(int i) {
        NOT_LOGIN_SET_STEEP_GOAL.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final int getDefaultCalore(float weight) {
        int iRoundToInt = MathKt__MathJVMKt.roundToInt((((8 * weight) * 45) / 60) / 100.0f) * 100;
        Logger.i("GoalPreference", "weight is " + weight + ",getDefaultCalore calore is " + iRoundToInt);
        return iRoundToInt;
    }

    public final int getNotLoginCalorieGoal() {
        return getNOT_LOGIN_SET_CALORIE_GOAL();
    }

    public final int getNotLoginMhsGoal() {
        return getNOT_LOGIN_SET_MHS_GOAL();
    }

    public final boolean getNotLoginSetGoalFlag() {
        return getNOT_LOGIN_SET_GOAL_FLAG();
    }

    public final int getNotLoginStandTimeGoal() {
        return getNOT_LOGIN_SET_STAND_TIME_GOAL();
    }

    public final int getNotLoginStepGoal() {
        return getNOT_LOGIN_SET_STEEP_GOAL();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_goal";
    }

    public final void setNotLoginCalorieGoal(int value) {
        setNOT_LOGIN_SET_CALORIE_GOAL(value);
    }

    public final void setNotLoginMhsGoal(int value) {
        setNOT_LOGIN_SET_MHS_GOAL(value);
    }

    public final void setNotLoginSetGoalFlag(boolean flag) {
        setNOT_LOGIN_SET_GOAL_FLAG(flag);
    }

    public final void setNotLoginStandTimeGoal(int value) {
        setNOT_LOGIN_SET_STAND_TIME_GOAL(value);
    }

    public final void setNotLoginStepGoal(int value) {
        setNOT_LOGIN_SET_STEEP_GOAL(value);
    }
}
