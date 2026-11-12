package com.xiaomi.fitness.rn.settings.util;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/util/RnSettingPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "DEVICE_NEED_ACCESS_PLUGIN", "getDEVICE_NEED_ACCESS_PLUGIN", "setDEVICE_NEED_ACCESS_PLUGIN", "(Ljava/lang/String;)V", "DEVICE_NEED_ACCESS_PLUGIN$delegate", "Lkotlin/properties/ReadWriteProperty;", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRnSettingPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnSettingPreference.kt\ncom/xiaomi/fitness/rn/settings/util/RnSettingPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,12:1\n135#2,6:13\n*S KotlinDebug\n*F\n+ 1 RnSettingPreference.kt\ncom/xiaomi/fitness/rn/settings/util/RnSettingPreference\n*L\n11#1:13,6\n*E\n"})
public final class RnSettingPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RnSettingPreference.class, "DEVICE_NEED_ACCESS_PLUGIN", "getDEVICE_NEED_ACCESS_PLUGIN()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: DEVICE_NEED_ACCESS_PLUGIN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_NEED_ACCESS_PLUGIN;

    @NotNull
    public static final RnSettingPreference INSTANCE;

    static {
        RnSettingPreference rnSettingPreference = new RnSettingPreference();
        INSTANCE = rnSettingPreference;
        DEVICE_NEED_ACCESS_PLUGIN = rnSettingPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.rn.settings.util.RnSettingPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
    }

    private RnSettingPreference() {
    }

    @NotNull
    public final String getDEVICE_NEED_ACCESS_PLUGIN() {
        return (String) DEVICE_NEED_ACCESS_PLUGIN.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "pref_rn_settings";
    }

    public final void setDEVICE_NEED_ACCESS_PLUGIN(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        DEVICE_NEED_ACCESS_PLUGIN.setValue(this, $$delegatedProperties[0], str);
    }
}
