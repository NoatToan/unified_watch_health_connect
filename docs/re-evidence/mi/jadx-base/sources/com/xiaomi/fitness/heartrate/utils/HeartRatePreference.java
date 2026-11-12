package com.xiaomi.fitness.heartrate.utils;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/heartrate/utils/HeartRatePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "REJECT_COUNT", "getREJECT_COUNT", "()I", "setREJECT_COUNT", "(I)V", "REJECT_COUNT$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "PERMISSION_ALLOWED", "getPERMISSION_ALLOWED", "()Z", "setPERMISSION_ALLOWED", "(Z)V", "PERMISSION_ALLOWED$delegate", "SHOW_MANUAL", "getSHOW_MANUAL", "setSHOW_MANUAL", "SHOW_MANUAL$delegate", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeartRatePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRatePreference.kt\ncom/xiaomi/fitness/heartrate/utils/HeartRatePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,27:1\n135#2,6:28\n135#2,6:34\n135#2,6:40\n*S KotlinDebug\n*F\n+ 1 HeartRatePreference.kt\ncom/xiaomi/fitness/heartrate/utils/HeartRatePreference\n*L\n16#1:28,6\n21#1:34,6\n26#1:40,6\n*E\n"})
public final class HeartRatePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HeartRatePreference.class, "REJECT_COUNT", "getREJECT_COUNT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HeartRatePreference.class, "PERMISSION_ALLOWED", "getPERMISSION_ALLOWED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HeartRatePreference.class, "SHOW_MANUAL", "getSHOW_MANUAL()Z", 0))};

    @NotNull
    public static final HeartRatePreference INSTANCE;

    /* JADX INFO: renamed from: PERMISSION_ALLOWED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PERMISSION_ALLOWED;

    /* JADX INFO: renamed from: REJECT_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty REJECT_COUNT;

    /* JADX INFO: renamed from: SHOW_MANUAL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_MANUAL;

    @NotNull
    private static final String spName;

    static {
        HeartRatePreference heartRatePreference = new HeartRatePreference();
        INSTANCE = heartRatePreference;
        spName = "spf_detect_heart_rate";
        REJECT_COUNT = heartRatePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.heartrate.utils.HeartRatePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0, null, true);
        PERMISSION_ALLOWED = heartRatePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.heartrate.utils.HeartRatePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.FALSE, null, true);
        SHOW_MANUAL = heartRatePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.heartrate.utils.HeartRatePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), Boolean.TRUE, null, true);
    }

    private HeartRatePreference() {
    }

    public final boolean getPERMISSION_ALLOWED() {
        return ((Boolean) PERMISSION_ALLOWED.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final int getREJECT_COUNT() {
        return ((Number) REJECT_COUNT.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final boolean getSHOW_MANUAL() {
        return ((Boolean) SHOW_MANUAL.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return spName;
    }

    public final void setPERMISSION_ALLOWED(boolean z) {
        PERMISSION_ALLOWED.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setREJECT_COUNT(int i) {
        REJECT_COUNT.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setSHOW_MANUAL(boolean z) {
        SHOW_MANUAL.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }
}
