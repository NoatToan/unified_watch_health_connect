package com.fitness.banner.compare;

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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0013R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\fR+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/fitness/banner/compare/ComparePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "AB_TEST_LAYER_NAME", "getAB_TEST_LAYER_NAME", "setAB_TEST_LAYER_NAME", "(Ljava/lang/String;)V", "AB_TEST_LAYER_NAME$delegate", "Lkotlin/properties/ReadWriteProperty;", "AB_TEST_GROUP_IDS", "getAB_TEST_GROUP_IDS", "setAB_TEST_GROUP_IDS", "AB_TEST_GROUP_IDS$delegate", "", "SHOW_APP_V4_UI", "getSHOW_APP_V4_UI", "()Z", "setSHOW_APP_V4_UI", "(Z)V", "SHOW_APP_V4_UI$delegate", "updateShowAppV4Enable", "", "enable", "getShowAppV4Enable", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComparePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComparePreference.kt\ncom/fitness/banner/compare/ComparePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,29:1\n135#2,6:30\n135#2,6:36\n135#2,6:42\n*S KotlinDebug\n*F\n+ 1 ComparePreference.kt\ncom/fitness/banner/compare/ComparePreference\n*L\n12#1:30,6\n17#1:36,6\n19#1:42,6\n*E\n"})
public final class ComparePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ComparePreference.class, "AB_TEST_LAYER_NAME", "getAB_TEST_LAYER_NAME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ComparePreference.class, "AB_TEST_GROUP_IDS", "getAB_TEST_GROUP_IDS()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ComparePreference.class, "SHOW_APP_V4_UI", "getSHOW_APP_V4_UI()Z", 0))};

    /* JADX INFO: renamed from: AB_TEST_GROUP_IDS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AB_TEST_GROUP_IDS;

    /* JADX INFO: renamed from: AB_TEST_LAYER_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AB_TEST_LAYER_NAME;

    @NotNull
    public static final ComparePreference INSTANCE;

    /* JADX INFO: renamed from: SHOW_APP_V4_UI$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_APP_V4_UI;

    static {
        ComparePreference comparePreference = new ComparePreference();
        INSTANCE = comparePreference;
        AB_TEST_LAYER_NAME = comparePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.fitness.banner.compare.ComparePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
        AB_TEST_GROUP_IDS = comparePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.fitness.banner.compare.ComparePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), "", null, true);
        SHOW_APP_V4_UI = comparePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.fitness.banner.compare.ComparePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), Boolean.TRUE, null, false);
    }

    private ComparePreference() {
    }

    private final boolean getSHOW_APP_V4_UI() {
        return ((Boolean) SHOW_APP_V4_UI.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setSHOW_APP_V4_UI(boolean z) {
        SHOW_APP_V4_UI.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @NotNull
    public final String getAB_TEST_GROUP_IDS() {
        return (String) AB_TEST_GROUP_IDS.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final String getAB_TEST_LAYER_NAME() {
        return (String) AB_TEST_LAYER_NAME.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean getShowAppV4Enable() {
        return getSHOW_APP_V4_UI();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_compare";
    }

    public final void setAB_TEST_GROUP_IDS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        AB_TEST_GROUP_IDS.setValue(this, $$delegatedProperties[1], str);
    }

    public final void setAB_TEST_LAYER_NAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        AB_TEST_LAYER_NAME.setValue(this, $$delegatedProperties[0], str);
    }

    public final void updateShowAppV4Enable(boolean enable) {
        setSHOW_APP_V4_UI(enable);
    }
}
