package com.fitness.banner.export.newbieguide.storage;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR+\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R+\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011¨\u0006 "}, d2 = {"Lcom/fitness/banner/export/newbieguide/storage/NewbieGuidePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "ID_HEALTH_TAB", "", "ID_SPORT_TAB", "ID_DEVICE_TAB", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "HEALTH_TAB_SHOW_COUNT", "getHEALTH_TAB_SHOW_COUNT", "()I", "setHEALTH_TAB_SHOW_COUNT", "(I)V", "HEALTH_TAB_SHOW_COUNT$delegate", "Lkotlin/properties/ReadWriteProperty;", "SPORT_TAB_SHOW_COUNT", "getSPORT_TAB_SHOW_COUNT", "setSPORT_TAB_SHOW_COUNT", "SPORT_TAB_SHOW_COUNT$delegate", "DEVICE_TAB_SHOW_COUNT", "getDEVICE_TAB_SHOW_COUNT", "setDEVICE_TAB_SHOW_COUNT", "DEVICE_TAB_SHOW_COUNT$delegate", "setShowCount", "", "type", "showCount", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNewbieGuidePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewbieGuidePreference.kt\ncom/fitness/banner/export/newbieguide/storage/NewbieGuidePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,33:1\n135#2,6:34\n135#2,6:40\n135#2,6:46\n*S KotlinDebug\n*F\n+ 1 NewbieGuidePreference.kt\ncom/fitness/banner/export/newbieguide/storage/NewbieGuidePreference\n*L\n12#1:34,6\n14#1:40,6\n16#1:46,6\n*E\n"})
public final class NewbieGuidePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(NewbieGuidePreference.class, "HEALTH_TAB_SHOW_COUNT", "getHEALTH_TAB_SHOW_COUNT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NewbieGuidePreference.class, "SPORT_TAB_SHOW_COUNT", "getSPORT_TAB_SHOW_COUNT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NewbieGuidePreference.class, "DEVICE_TAB_SHOW_COUNT", "getDEVICE_TAB_SHOW_COUNT()I", 0))};

    /* JADX INFO: renamed from: DEVICE_TAB_SHOW_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_TAB_SHOW_COUNT;

    /* JADX INFO: renamed from: HEALTH_TAB_SHOW_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty HEALTH_TAB_SHOW_COUNT;
    public static final int ID_DEVICE_TAB = 2;
    public static final int ID_HEALTH_TAB = 0;
    public static final int ID_SPORT_TAB = 1;

    @NotNull
    public static final NewbieGuidePreference INSTANCE;

    /* JADX INFO: renamed from: SPORT_TAB_SHOW_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_TAB_SHOW_COUNT;

    static {
        NewbieGuidePreference newbieGuidePreference = new NewbieGuidePreference();
        INSTANCE = newbieGuidePreference;
        HEALTH_TAB_SHOW_COUNT = newbieGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.fitness.banner.export.newbieguide.storage.NewbieGuidePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0, null, false);
        SPORT_TAB_SHOW_COUNT = newbieGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.fitness.banner.export.newbieguide.storage.NewbieGuidePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0, null, false);
        DEVICE_TAB_SHOW_COUNT = newbieGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.fitness.banner.export.newbieguide.storage.NewbieGuidePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), 0, null, false);
    }

    private NewbieGuidePreference() {
    }

    public final int getDEVICE_TAB_SHOW_COUNT() {
        return ((Number) DEVICE_TAB_SHOW_COUNT.getValue(this, $$delegatedProperties[2])).intValue();
    }

    public final int getHEALTH_TAB_SHOW_COUNT() {
        return ((Number) HEALTH_TAB_SHOW_COUNT.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getSPORT_TAB_SHOW_COUNT() {
        return ((Number) SPORT_TAB_SHOW_COUNT.getValue(this, $$delegatedProperties[1])).intValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "newbie_guide_sp";
    }

    public final void setDEVICE_TAB_SHOW_COUNT(int i) {
        DEVICE_TAB_SHOW_COUNT.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    public final void setHEALTH_TAB_SHOW_COUNT(int i) {
        HEALTH_TAB_SHOW_COUNT.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setSPORT_TAB_SHOW_COUNT(int i) {
        SPORT_TAB_SHOW_COUNT.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setShowCount(int type, int showCount) {
        if (type == 0) {
            setHEALTH_TAB_SHOW_COUNT(showCount);
        } else if (type == 1) {
            setSPORT_TAB_SHOW_COUNT(showCount);
        } else {
            if (type != 2) {
                return;
            }
            setDEVICE_TAB_SHOW_COUNT(showCount);
        }
    }
}
