package com.xiaomi.fitness.settingitem;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/settingitem/SettingItemPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "LAST_UPDATE_NAME", "getLAST_UPDATE_NAME", "()J", "setLAST_UPDATE_NAME", "(J)V", "LAST_UPDATE_NAME$delegate", "Lkotlin/properties/ReadWriteProperty;", "setSettingItemUpdating", "", "did", "bind", "", "getSettingItemUpdating", "getSettingItemUpdatingKey", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingItemPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingItemPreference.kt\ncom/xiaomi/fitness/settingitem/SettingItemPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,22:1\n135#2,6:23\n*S KotlinDebug\n*F\n+ 1 SettingItemPreference.kt\ncom/xiaomi/fitness/settingitem/SettingItemPreference\n*L\n9#1:23,6\n*E\n"})
public final class SettingItemPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SettingItemPreference.class, "LAST_UPDATE_NAME", "getLAST_UPDATE_NAME()J", 0))};

    @NotNull
    public static final SettingItemPreference INSTANCE;

    /* JADX INFO: renamed from: LAST_UPDATE_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_UPDATE_NAME;

    static {
        SettingItemPreference settingItemPreference = new SettingItemPreference();
        INSTANCE = settingItemPreference;
        LAST_UPDATE_NAME = settingItemPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.settingitem.SettingItemPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, true);
    }

    private SettingItemPreference() {
    }

    private final String getSettingItemUpdatingKey(String did) {
        return "deviceBond" + did;
    }

    public final long getLAST_UPDATE_NAME() {
        return ((Number) LAST_UPDATE_NAME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final boolean getSettingItemUpdating(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getValue(getSettingItemUpdatingKey(did), Boolean.FALSE)).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "settingitem";
    }

    public final void setLAST_UPDATE_NAME(long j) {
        LAST_UPDATE_NAME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setSettingItemUpdating(@NotNull String did, boolean bind) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getSettingItemUpdatingKey(did), Boolean.valueOf(bind));
    }
}
