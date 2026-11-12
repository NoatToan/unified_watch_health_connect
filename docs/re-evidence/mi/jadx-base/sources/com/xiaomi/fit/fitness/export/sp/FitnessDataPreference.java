package com.xiaomi.fit.fitness.export.sp;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R+\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R+\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R+\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R+\u0010&\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0015\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010)R+\u0010+\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0015\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013R+\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020/8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0015\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u00106\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0015\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u00109R+\u0010;\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0015\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u00109R\u0011\u0010B\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bC\u0010\f¨\u0006D"}, d2 = {"Lcom/xiaomi/fit/fitness/export/sp/FitnessDataPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "KEY_CGM_DEVICE_RUNTIME_SEC", "KEY_ACTIVITY_RECOGNITION_PERMISSION", "isMultipleProcessListener", "", "()Z", "<set-?>", "", "SYNC_TIME", "getSYNC_TIME", "()J", "setSYNC_TIME", "(J)V", "SYNC_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "DEVICE_SYNC_TIME", "getDEVICE_SYNC_TIME", "setDEVICE_SYNC_TIME", "DEVICE_SYNC_TIME$delegate", "LAST_RAINBOW_TRACK_TIME", "getLAST_RAINBOW_TRACK_TIME", "setLAST_RAINBOW_TRACK_TIME", "LAST_RAINBOW_TRACK_TIME$delegate", "FIRST_TIME_CLOSED_SYNC_DIALOG", "getFIRST_TIME_CLOSED_SYNC_DIALOG", "setFIRST_TIME_CLOSED_SYNC_DIALOG", "FIRST_TIME_CLOSED_SYNC_DIALOG$delegate", "NOTIFY_ABNORMAL_GLUCOSE_TIME", "getNOTIFY_ABNORMAL_GLUCOSE_TIME", "setNOTIFY_ABNORMAL_GLUCOSE_TIME", "NOTIFY_ABNORMAL_GLUCOSE_TIME$delegate", "ACTIVITY_RECOGNITION_PERMISSION", "getACTIVITY_RECOGNITION_PERMISSION", "setACTIVITY_RECOGNITION_PERMISSION", "(Z)V", "ACTIVITY_RECOGNITION_PERMISSION$delegate", "LAST_ACTIVITY_RECOGNITION_PERMISSION_TIME", "getLAST_ACTIVITY_RECOGNITION_PERMISSION_TIME", "setLAST_ACTIVITY_RECOGNITION_PERMISSION_TIME", "LAST_ACTIVITY_RECOGNITION_PERMISSION_TIME$delegate", "", "ACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY", "getACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY", "()I", "setACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY", "(I)V", "ACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY$delegate", "DEVICE_SYNC_INVALID_VERSION", "getDEVICE_SYNC_INVALID_VERSION", "setDEVICE_SYNC_INVALID_VERSION", "(Ljava/lang/String;)V", "DEVICE_SYNC_INVALID_VERSION$delegate", "DEVICE_SYNC_INVALID_MODEL_INFO", "getDEVICE_SYNC_INVALID_MODEL_INFO", "setDEVICE_SYNC_INVALID_MODEL_INFO", "DEVICE_SYNC_INVALID_MODEL_INFO$delegate", "setRecognitionPermission", "", "boolean", "getRecognitionPermission", "getGetRecognitionPermission", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDataPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataPreference.kt\ncom/xiaomi/fit/fitness/export/sp/FitnessDataPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,48:1\n135#2,6:49\n135#2,6:55\n135#2,6:61\n135#2,6:67\n135#2,6:73\n211#2,7:79\n135#2,6:86\n135#2,6:92\n135#2,6:98\n135#2,6:104\n*S KotlinDebug\n*F\n+ 1 FitnessDataPreference.kt\ncom/xiaomi/fit/fitness/export/sp/FitnessDataPreference\n*L\n17#1:49,6\n20#1:55,6\n23#1:61,6\n26#1:67,6\n28#1:73,6\n31#1:79,7\n33#1:86,6\n35#1:92,6\n37#1:98,6\n39#1:104,6\n*E\n"})
public final class FitnessDataPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "SYNC_TIME", "getSYNC_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "DEVICE_SYNC_TIME", "getDEVICE_SYNC_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "LAST_RAINBOW_TRACK_TIME", "getLAST_RAINBOW_TRACK_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "FIRST_TIME_CLOSED_SYNC_DIALOG", "getFIRST_TIME_CLOSED_SYNC_DIALOG()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "NOTIFY_ABNORMAL_GLUCOSE_TIME", "getNOTIFY_ABNORMAL_GLUCOSE_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "ACTIVITY_RECOGNITION_PERMISSION", "getACTIVITY_RECOGNITION_PERMISSION()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "LAST_ACTIVITY_RECOGNITION_PERMISSION_TIME", "getLAST_ACTIVITY_RECOGNITION_PERMISSION_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "ACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY", "getACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "DEVICE_SYNC_INVALID_VERSION", "getDEVICE_SYNC_INVALID_VERSION()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataPreference.class, "DEVICE_SYNC_INVALID_MODEL_INFO", "getDEVICE_SYNC_INVALID_MODEL_INFO()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: ACTIVITY_RECOGNITION_PERMISSION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ACTIVITY_RECOGNITION_PERMISSION;

    /* JADX INFO: renamed from: ACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY;

    /* JADX INFO: renamed from: DEVICE_SYNC_INVALID_MODEL_INFO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_SYNC_INVALID_MODEL_INFO;

    /* JADX INFO: renamed from: DEVICE_SYNC_INVALID_VERSION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_SYNC_INVALID_VERSION;

    /* JADX INFO: renamed from: DEVICE_SYNC_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_SYNC_TIME;

    /* JADX INFO: renamed from: FIRST_TIME_CLOSED_SYNC_DIALOG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_TIME_CLOSED_SYNC_DIALOG;

    @NotNull
    public static final FitnessDataPreference INSTANCE;

    @NotNull
    private static final String KEY_ACTIVITY_RECOGNITION_PERMISSION = "pref_activity_recognition_permission";

    @NotNull
    private static final String KEY_CGM_DEVICE_RUNTIME_SEC = "key_cgm_device_runtime_%s";

    /* JADX INFO: renamed from: LAST_ACTIVITY_RECOGNITION_PERMISSION_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_ACTIVITY_RECOGNITION_PERMISSION_TIME;

    /* JADX INFO: renamed from: LAST_RAINBOW_TRACK_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_RAINBOW_TRACK_TIME;

    /* JADX INFO: renamed from: NOTIFY_ABNORMAL_GLUCOSE_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOTIFY_ABNORMAL_GLUCOSE_TIME;

    /* JADX INFO: renamed from: SYNC_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SYNC_TIME;

    static {
        FitnessDataPreference fitnessDataPreference = new FitnessDataPreference();
        INSTANCE = fitnessDataPreference;
        SYNC_TIME = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), -1L, null, true);
        DEVICE_SYNC_TIME = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), -1L, null, true);
        LAST_RAINBOW_TRACK_TIME = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), -1L, null, true);
        FIRST_TIME_CLOSED_SYNC_DIALOG = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), -1L, null, true);
        NOTIFY_ABNORMAL_GLUCOSE_TIME = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), -1L, null, true);
        ACTIVITY_RECOGNITION_PERMISSION = fitnessDataPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), Boolean.FALSE, null, null, KEY_ACTIVITY_RECOGNITION_PERMISSION);
        LAST_ACTIVITY_RECOGNITION_PERMISSION_TIME = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), -1L, null, true);
        ACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), 0, null, true);
        DEVICE_SYNC_INVALID_VERSION = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), "", null, true);
        DEVICE_SYNC_INVALID_MODEL_INFO = fitnessDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fit.fitness.export.sp.FitnessDataPreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), "", null, true);
    }

    private FitnessDataPreference() {
    }

    public final boolean getACTIVITY_RECOGNITION_PERMISSION() {
        return ((Boolean) ACTIVITY_RECOGNITION_PERMISSION.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public final int getACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY() {
        return ((Number) ACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY.getValue(this, $$delegatedProperties[7])).intValue();
    }

    @NotNull
    public final String getDEVICE_SYNC_INVALID_MODEL_INFO() {
        return (String) DEVICE_SYNC_INVALID_MODEL_INFO.getValue(this, $$delegatedProperties[9]);
    }

    @NotNull
    public final String getDEVICE_SYNC_INVALID_VERSION() {
        return (String) DEVICE_SYNC_INVALID_VERSION.getValue(this, $$delegatedProperties[8]);
    }

    public final long getDEVICE_SYNC_TIME() {
        return ((Number) DEVICE_SYNC_TIME.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final long getFIRST_TIME_CLOSED_SYNC_DIALOG() {
        return ((Number) FIRST_TIME_CLOSED_SYNC_DIALOG.getValue(this, $$delegatedProperties[3])).longValue();
    }

    public final boolean getGetRecognitionPermission() {
        return getACTIVITY_RECOGNITION_PERMISSION();
    }

    public final long getLAST_ACTIVITY_RECOGNITION_PERMISSION_TIME() {
        return ((Number) LAST_ACTIVITY_RECOGNITION_PERMISSION_TIME.getValue(this, $$delegatedProperties[6])).longValue();
    }

    public final long getLAST_RAINBOW_TRACK_TIME() {
        return ((Number) LAST_RAINBOW_TRACK_TIME.getValue(this, $$delegatedProperties[2])).longValue();
    }

    public final long getNOTIFY_ABNORMAL_GLUCOSE_TIME() {
        return ((Number) NOTIFY_ABNORMAL_GLUCOSE_TIME.getValue(this, $$delegatedProperties[4])).longValue();
    }

    public final long getSYNC_TIME() {
        return ((Number) SYNC_TIME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    /* JADX INFO: renamed from: isMultipleProcessListener */
    public boolean getIsMultipleProcessListener() {
        return true;
    }

    public final void setACTIVITY_RECOGNITION_PERMISSION(boolean z) {
        ACTIVITY_RECOGNITION_PERMISSION.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY(int i) {
        ACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY.setValue(this, $$delegatedProperties[7], Integer.valueOf(i));
    }

    public final void setDEVICE_SYNC_INVALID_MODEL_INFO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        DEVICE_SYNC_INVALID_MODEL_INFO.setValue(this, $$delegatedProperties[9], str);
    }

    public final void setDEVICE_SYNC_INVALID_VERSION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        DEVICE_SYNC_INVALID_VERSION.setValue(this, $$delegatedProperties[8], str);
    }

    public final void setDEVICE_SYNC_TIME(long j) {
        DEVICE_SYNC_TIME.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setFIRST_TIME_CLOSED_SYNC_DIALOG(long j) {
        FIRST_TIME_CLOSED_SYNC_DIALOG.setValue(this, $$delegatedProperties[3], Long.valueOf(j));
    }

    public final void setLAST_ACTIVITY_RECOGNITION_PERMISSION_TIME(long j) {
        LAST_ACTIVITY_RECOGNITION_PERMISSION_TIME.setValue(this, $$delegatedProperties[6], Long.valueOf(j));
    }

    public final void setLAST_RAINBOW_TRACK_TIME(long j) {
        LAST_RAINBOW_TRACK_TIME.setValue(this, $$delegatedProperties[2], Long.valueOf(j));
    }

    public final void setNOTIFY_ABNORMAL_GLUCOSE_TIME(long j) {
        NOTIFY_ABNORMAL_GLUCOSE_TIME.setValue(this, $$delegatedProperties[4], Long.valueOf(j));
    }

    public final void setRecognitionPermission(boolean z) {
        setACTIVITY_RECOGNITION_PERMISSION(z);
    }

    public final void setSYNC_TIME(long j) {
        SYNC_TIME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }
}
