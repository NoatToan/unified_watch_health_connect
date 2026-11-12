package com.xiaomi.fitness.config.preference;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/config/preference/ChooseAppPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "CHOOSE_COMMON_APP", "getCHOOSE_COMMON_APP", "()I", "setCHOOSE_COMMON_APP", "(I)V", "CHOOSE_COMMON_APP$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "CHOOSE_APP_LAST_TIME", "getCHOOSE_APP_LAST_TIME", "()J", "setCHOOSE_APP_LAST_TIME", "(J)V", "CHOOSE_APP_LAST_TIME$delegate", "getChooseApp", "setChooseApp", "", "value", "getChooseAppLastTime", "setChooseAppLastTime", "config_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChooseAppPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseAppPreference.kt\ncom/xiaomi/fitness/config/preference/ChooseAppPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,29:1\n135#2,6:30\n135#2,6:36\n*S KotlinDebug\n*F\n+ 1 ChooseAppPreference.kt\ncom/xiaomi/fitness/config/preference/ChooseAppPreference\n*L\n9#1:30,6\n11#1:36,6\n*E\n"})
public final class ChooseAppPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ChooseAppPreference.class, "CHOOSE_COMMON_APP", "getCHOOSE_COMMON_APP()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ChooseAppPreference.class, "CHOOSE_APP_LAST_TIME", "getCHOOSE_APP_LAST_TIME()J", 0))};

    /* JADX INFO: renamed from: CHOOSE_APP_LAST_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CHOOSE_APP_LAST_TIME;

    /* JADX INFO: renamed from: CHOOSE_COMMON_APP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CHOOSE_COMMON_APP;

    @NotNull
    public static final ChooseAppPreference INSTANCE;

    static {
        ChooseAppPreference chooseAppPreference = new ChooseAppPreference();
        INSTANCE = chooseAppPreference;
        CHOOSE_COMMON_APP = chooseAppPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.config.preference.ChooseAppPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), -1, null, true);
        CHOOSE_APP_LAST_TIME = chooseAppPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.config.preference.ChooseAppPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
    }

    private ChooseAppPreference() {
    }

    private final long getCHOOSE_APP_LAST_TIME() {
        return ((Number) CHOOSE_APP_LAST_TIME.getValue(this, $$delegatedProperties[1])).longValue();
    }

    private final int getCHOOSE_COMMON_APP() {
        return ((Number) CHOOSE_COMMON_APP.getValue(this, $$delegatedProperties[0])).intValue();
    }

    private final void setCHOOSE_APP_LAST_TIME(long j) {
        CHOOSE_APP_LAST_TIME.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    private final void setCHOOSE_COMMON_APP(int i) {
        CHOOSE_COMMON_APP.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final int getChooseApp() {
        return getCHOOSE_COMMON_APP();
    }

    public final long getChooseAppLastTime() {
        return getCHOOSE_APP_LAST_TIME();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_choose_app";
    }

    public final void setChooseApp(int value) {
        setCHOOSE_COMMON_APP(value);
    }

    public final void setChooseAppLastTime(long value) {
        setCHOOSE_APP_LAST_TIME(value);
    }
}
