package com.mi.health.appupgrade.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/mi/health/appupgrade/util/AppUpgradePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "APP_UPGRADE_LAST_VERSION_CODE", "getAPP_UPGRADE_LAST_VERSION_CODE", "()I", "setAPP_UPGRADE_LAST_VERSION_CODE", "(I)V", "APP_UPGRADE_LAST_VERSION_CODE$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "APP_UPGRADE_LAST_SHOW_TIME", "getAPP_UPGRADE_LAST_SHOW_TIME", "()J", "setAPP_UPGRADE_LAST_SHOW_TIME", "(J)V", "APP_UPGRADE_LAST_SHOW_TIME$delegate", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppUpgradePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradePreference.kt\ncom/mi/health/appupgrade/util/AppUpgradePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,12:1\n135#2,6:13\n135#2,6:19\n*S KotlinDebug\n*F\n+ 1 AppUpgradePreference.kt\ncom/mi/health/appupgrade/util/AppUpgradePreference\n*L\n9#1:13,6\n11#1:19,6\n*E\n"})
public final class AppUpgradePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AppUpgradePreference.class, "APP_UPGRADE_LAST_VERSION_CODE", "getAPP_UPGRADE_LAST_VERSION_CODE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AppUpgradePreference.class, "APP_UPGRADE_LAST_SHOW_TIME", "getAPP_UPGRADE_LAST_SHOW_TIME()J", 0))};

    /* JADX INFO: renamed from: APP_UPGRADE_LAST_SHOW_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty APP_UPGRADE_LAST_SHOW_TIME;

    /* JADX INFO: renamed from: APP_UPGRADE_LAST_VERSION_CODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty APP_UPGRADE_LAST_VERSION_CODE;

    @NotNull
    public static final AppUpgradePreference INSTANCE;

    static {
        AppUpgradePreference appUpgradePreference = new AppUpgradePreference();
        INSTANCE = appUpgradePreference;
        APP_UPGRADE_LAST_VERSION_CODE = appUpgradePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.mi.health.appupgrade.util.AppUpgradePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), -1, null, true);
        APP_UPGRADE_LAST_SHOW_TIME = appUpgradePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.mi.health.appupgrade.util.AppUpgradePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), -1L, null, true);
    }

    private AppUpgradePreference() {
    }

    public final long getAPP_UPGRADE_LAST_SHOW_TIME() {
        return ((Number) APP_UPGRADE_LAST_SHOW_TIME.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final int getAPP_UPGRADE_LAST_VERSION_CODE() {
        return ((Number) APP_UPGRADE_LAST_VERSION_CODE.getValue(this, $$delegatedProperties[0])).intValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_upgrade";
    }

    public final void setAPP_UPGRADE_LAST_SHOW_TIME(long j) {
        APP_UPGRADE_LAST_SHOW_TIME.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setAPP_UPGRADE_LAST_VERSION_CODE(int i) {
        APP_UPGRADE_LAST_VERSION_CODE.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }
}
