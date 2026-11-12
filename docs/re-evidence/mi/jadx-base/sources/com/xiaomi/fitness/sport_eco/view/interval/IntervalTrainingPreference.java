package com.xiaomi.fitness.sport_eco.view.interval;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_INTERVAL_DURATION_VALUE", "getKEY_INTERVAL_DURATION_VALUE", "setKEY_INTERVAL_DURATION_VALUE", "(Ljava/lang/String;)V", "KEY_INTERVAL_DURATION_VALUE$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_INTERVAL_NUMBER_VALUE", "getKEY_INTERVAL_NUMBER_VALUE", "setKEY_INTERVAL_NUMBER_VALUE", "KEY_INTERVAL_NUMBER_VALUE$delegate", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntervalTrainingPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTrainingPreference.kt\ncom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,24:1\n211#2,7:25\n211#2,7:32\n*S KotlinDebug\n*F\n+ 1 IntervalTrainingPreference.kt\ncom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingPreference\n*L\n13#1:25,7\n19#1:32,7\n*E\n"})
public final class IntervalTrainingPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(IntervalTrainingPreference.class, "KEY_INTERVAL_DURATION_VALUE", "getKEY_INTERVAL_DURATION_VALUE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(IntervalTrainingPreference.class, "KEY_INTERVAL_NUMBER_VALUE", "getKEY_INTERVAL_NUMBER_VALUE()Ljava/lang/String;", 0))};

    @NotNull
    public static final IntervalTrainingPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_INTERVAL_DURATION_VALUE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_INTERVAL_DURATION_VALUE;

    /* JADX INFO: renamed from: KEY_INTERVAL_NUMBER_VALUE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_INTERVAL_NUMBER_VALUE;

    static {
        IntervalTrainingPreference intervalTrainingPreference = new IntervalTrainingPreference();
        INSTANCE = intervalTrainingPreference;
        UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
        KEY_INTERVAL_DURATION_VALUE = intervalTrainingPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref", "key_interval_duration_value_" + AccountManagerExtKt.getInstance(companion).getUserId());
        KEY_INTERVAL_NUMBER_VALUE = intervalTrainingPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), "", null, "app_pref", "key_interval_number_value_" + AccountManagerExtKt.getInstance(companion).getUserId());
    }

    private IntervalTrainingPreference() {
    }

    @NotNull
    public final String getKEY_INTERVAL_DURATION_VALUE() {
        return (String) KEY_INTERVAL_DURATION_VALUE.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final String getKEY_INTERVAL_NUMBER_VALUE() {
        return (String) KEY_INTERVAL_NUMBER_VALUE.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "jump_interval_training";
    }

    public final void setKEY_INTERVAL_DURATION_VALUE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_INTERVAL_DURATION_VALUE.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setKEY_INTERVAL_NUMBER_VALUE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_INTERVAL_NUMBER_VALUE.setValue(this, $$delegatedProperties[1], str);
    }
}
