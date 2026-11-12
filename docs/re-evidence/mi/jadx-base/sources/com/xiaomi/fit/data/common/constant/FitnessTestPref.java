package com.xiaomi.fit.data.common.constant;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR+\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR+\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR+\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR+\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0010\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR+\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0010\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00100\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0010\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000e¨\u00064"}, d2 = {"Lcom/xiaomi/fit/data/common/constant/FitnessTestPref;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "ENABLE_PRINT_DAILY_RECORD", "getENABLE_PRINT_DAILY_RECORD", "()Z", "setENABLE_PRINT_DAILY_RECORD", "(Z)V", "ENABLE_PRINT_DAILY_RECORD$delegate", "Lkotlin/properties/ReadWriteProperty;", "ENABLE_PRINT_SPORT_GPS", "getENABLE_PRINT_SPORT_GPS", "setENABLE_PRINT_SPORT_GPS", "ENABLE_PRINT_SPORT_GPS$delegate", "ENABLE_PRINT_SPORT_RECORD", "getENABLE_PRINT_SPORT_RECORD", "setENABLE_PRINT_SPORT_RECORD", "ENABLE_PRINT_SPORT_RECORD$delegate", "ENABLE_SAVE_FITNESS_FILE", "getENABLE_SAVE_FITNESS_FILE", "setENABLE_SAVE_FITNESS_FILE", "ENABLE_SAVE_FITNESS_FILE$delegate", "ENABLE_PRINT_SPORT_GPS_ALGO", "getENABLE_PRINT_SPORT_GPS_ALGO", "setENABLE_PRINT_SPORT_GPS_ALGO", "ENABLE_PRINT_SPORT_GPS_ALGO$delegate", "DISABLE_WRITE_BACK_VALIDITY", "getDISABLE_WRITE_BACK_VALIDITY", "setDISABLE_WRITE_BACK_VALIDITY", "DISABLE_WRITE_BACK_VALIDITY$delegate", "ENABLE_ECG_FILTER_ALGO", "getENABLE_ECG_FILTER_ALGO", "setENABLE_ECG_FILTER_ALGO", "ENABLE_ECG_FILTER_ALGO$delegate", "", "ECG_FILTER_ALGO", "getECG_FILTER_ALGO", "()I", "setECG_FILTER_ALGO", "(I)V", "ECG_FILTER_ALGO$delegate", "ENABLE_GET_BLOOD_SUGAR", "getENABLE_GET_BLOOD_SUGAR", "setENABLE_GET_BLOOD_SUGAR", "ENABLE_GET_BLOOD_SUGAR$delegate", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessTestPref.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessTestPref.kt\ncom/xiaomi/fit/data/common/constant/FitnessTestPref\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,22:1\n135#2,6:23\n135#2,6:29\n135#2,6:35\n135#2,6:41\n135#2,6:47\n135#2,6:53\n135#2,6:59\n135#2,6:65\n135#2,6:71\n*S KotlinDebug\n*F\n+ 1 FitnessTestPref.kt\ncom/xiaomi/fit/data/common/constant/FitnessTestPref\n*L\n10#1:23,6\n11#1:29,6\n12#1:35,6\n13#1:41,6\n14#1:47,6\n15#1:53,6\n16#1:59,6\n19#1:65,6\n21#1:71,6\n*E\n"})
public final class FitnessTestPref extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "ENABLE_PRINT_DAILY_RECORD", "getENABLE_PRINT_DAILY_RECORD()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "ENABLE_PRINT_SPORT_GPS", "getENABLE_PRINT_SPORT_GPS()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "ENABLE_PRINT_SPORT_RECORD", "getENABLE_PRINT_SPORT_RECORD()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "ENABLE_SAVE_FITNESS_FILE", "getENABLE_SAVE_FITNESS_FILE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "ENABLE_PRINT_SPORT_GPS_ALGO", "getENABLE_PRINT_SPORT_GPS_ALGO()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "DISABLE_WRITE_BACK_VALIDITY", "getDISABLE_WRITE_BACK_VALIDITY()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "ENABLE_ECG_FILTER_ALGO", "getENABLE_ECG_FILTER_ALGO()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "ECG_FILTER_ALGO", "getECG_FILTER_ALGO()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessTestPref.class, "ENABLE_GET_BLOOD_SUGAR", "getENABLE_GET_BLOOD_SUGAR()Z", 0))};

    /* JADX INFO: renamed from: DISABLE_WRITE_BACK_VALIDITY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DISABLE_WRITE_BACK_VALIDITY;

    /* JADX INFO: renamed from: ECG_FILTER_ALGO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ECG_FILTER_ALGO;

    /* JADX INFO: renamed from: ENABLE_ECG_FILTER_ALGO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ENABLE_ECG_FILTER_ALGO;

    /* JADX INFO: renamed from: ENABLE_GET_BLOOD_SUGAR$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ENABLE_GET_BLOOD_SUGAR;

    /* JADX INFO: renamed from: ENABLE_PRINT_DAILY_RECORD$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ENABLE_PRINT_DAILY_RECORD;

    /* JADX INFO: renamed from: ENABLE_PRINT_SPORT_GPS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ENABLE_PRINT_SPORT_GPS;

    /* JADX INFO: renamed from: ENABLE_PRINT_SPORT_GPS_ALGO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ENABLE_PRINT_SPORT_GPS_ALGO;

    /* JADX INFO: renamed from: ENABLE_PRINT_SPORT_RECORD$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ENABLE_PRINT_SPORT_RECORD;

    /* JADX INFO: renamed from: ENABLE_SAVE_FITNESS_FILE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ENABLE_SAVE_FITNESS_FILE;

    @NotNull
    public static final FitnessTestPref INSTANCE;

    static {
        FitnessTestPref fitnessTestPref = new FitnessTestPref();
        INSTANCE = fitnessTestPref;
        Boolean bool = Boolean.FALSE;
        ENABLE_PRINT_DAILY_RECORD = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        ENABLE_PRINT_SPORT_GPS = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, true);
        ENABLE_PRINT_SPORT_RECORD = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$3
        }.getType(), bool, null, true);
        ENABLE_SAVE_FITNESS_FILE = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$4
        }.getType(), bool, null, true);
        ENABLE_PRINT_SPORT_GPS_ALGO = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$5
        }.getType(), bool, null, true);
        DISABLE_WRITE_BACK_VALIDITY = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$6
        }.getType(), bool, null, true);
        ENABLE_ECG_FILTER_ALGO = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$7
        }.getType(), Boolean.TRUE, null, true);
        ECG_FILTER_ALGO = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$8
        }.getType(), 1, null, true);
        ENABLE_GET_BLOOD_SUGAR = fitnessTestPref.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.constant.FitnessTestPref$special$$inlined$bindToPreferenceField$default$9
        }.getType(), bool, null, true);
    }

    private FitnessTestPref() {
    }

    public final boolean getDISABLE_WRITE_BACK_VALIDITY() {
        return ((Boolean) DISABLE_WRITE_BACK_VALIDITY.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public final int getECG_FILTER_ALGO() {
        return ((Number) ECG_FILTER_ALGO.getValue(this, $$delegatedProperties[7])).intValue();
    }

    public final boolean getENABLE_ECG_FILTER_ALGO() {
        return ((Boolean) ENABLE_ECG_FILTER_ALGO.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public final boolean getENABLE_GET_BLOOD_SUGAR() {
        return ((Boolean) ENABLE_GET_BLOOD_SUGAR.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public final boolean getENABLE_PRINT_DAILY_RECORD() {
        return ((Boolean) ENABLE_PRINT_DAILY_RECORD.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getENABLE_PRINT_SPORT_GPS() {
        return ((Boolean) ENABLE_PRINT_SPORT_GPS.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getENABLE_PRINT_SPORT_GPS_ALGO() {
        return ((Boolean) ENABLE_PRINT_SPORT_GPS_ALGO.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final boolean getENABLE_PRINT_SPORT_RECORD() {
        return ((Boolean) ENABLE_PRINT_SPORT_RECORD.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getENABLE_SAVE_FITNESS_FILE() {
        return ((Boolean) ENABLE_SAVE_FITNESS_FILE.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sp_test_fitness_data";
    }

    public final void setDISABLE_WRITE_BACK_VALIDITY(boolean z) {
        DISABLE_WRITE_BACK_VALIDITY.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setECG_FILTER_ALGO(int i) {
        ECG_FILTER_ALGO.setValue(this, $$delegatedProperties[7], Integer.valueOf(i));
    }

    public final void setENABLE_ECG_FILTER_ALGO(boolean z) {
        ENABLE_ECG_FILTER_ALGO.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public final void setENABLE_GET_BLOOD_SUGAR(boolean z) {
        ENABLE_GET_BLOOD_SUGAR.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public final void setENABLE_PRINT_DAILY_RECORD(boolean z) {
        ENABLE_PRINT_DAILY_RECORD.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setENABLE_PRINT_SPORT_GPS(boolean z) {
        ENABLE_PRINT_SPORT_GPS.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setENABLE_PRINT_SPORT_GPS_ALGO(boolean z) {
        ENABLE_PRINT_SPORT_GPS_ALGO.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setENABLE_PRINT_SPORT_RECORD(boolean z) {
        ENABLE_PRINT_SPORT_RECORD.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setENABLE_SAVE_FITNESS_FILE(boolean z) {
        ENABLE_SAVE_FITNESS_FILE.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }
}
