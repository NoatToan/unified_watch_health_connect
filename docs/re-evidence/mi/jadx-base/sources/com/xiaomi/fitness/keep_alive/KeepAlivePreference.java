package com.xiaomi.fitness.keep_alive;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR+\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR+\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0010\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR+\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0010\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR+\u0010,\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0010\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR+\u00100\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0010\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR+\u00105\u001a\u0002042\u0006\u0010\b\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0010\u001a\u0004\b6\u00107\"\u0004\b8\u00109R+\u0010;\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0010\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000e¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/keep_alive/KeepAlivePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "KEY_SHOW_CONNECTION_NOTIFICATION", "getKEY_SHOW_CONNECTION_NOTIFICATION", "()Z", "setKEY_SHOW_CONNECTION_NOTIFICATION", "(Z)V", "KEY_SHOW_CONNECTION_NOTIFICATION$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_DEVICE_CONNECT_OPTIMIZE", "getKEY_DEVICE_CONNECT_OPTIMIZE", "setKEY_DEVICE_CONNECT_OPTIMIZE", "KEY_DEVICE_CONNECT_OPTIMIZE$delegate", "", "KEY_PROCESS_ALIVE_MINUTE", "getKEY_PROCESS_ALIVE_MINUTE", "()I", "setKEY_PROCESS_ALIVE_MINUTE", "(I)V", "KEY_PROCESS_ALIVE_MINUTE$delegate", "KEY_WAS_FOREGROUND_STARTED", "getKEY_WAS_FOREGROUND_STARTED", "setKEY_WAS_FOREGROUND_STARTED", "KEY_WAS_FOREGROUND_STARTED$delegate", "KEY_WAS_START_ALARM", "getKEY_WAS_START_ALARM", "setKEY_WAS_START_ALARM", "KEY_WAS_START_ALARM$delegate", "KEY_WAS_START_JOB_SCHEDULER", "getKEY_WAS_START_JOB_SCHEDULER", "setKEY_WAS_START_JOB_SCHEDULER", "KEY_WAS_START_JOB_SCHEDULER$delegate", "KEY_LATEST_IS_FOREGROUND", "getKEY_LATEST_IS_FOREGROUND", "setKEY_LATEST_IS_FOREGROUND", "KEY_LATEST_IS_FOREGROUND$delegate", "KEY_CONNECT_ALL_TIME", "getKEY_CONNECT_ALL_TIME", "setKEY_CONNECT_ALL_TIME", "KEY_CONNECT_ALL_TIME$delegate", "KEY_CONNECT_PART_TIME", "getKEY_CONNECT_PART_TIME", "setKEY_CONNECT_PART_TIME", "KEY_CONNECT_PART_TIME$delegate", "", "KEY_PROCESS_START", "getKEY_PROCESS_START", "()J", "setKEY_PROCESS_START", "(J)V", "KEY_PROCESS_START$delegate", "KEY_START_CONNECT", "getKEY_START_CONNECT", "setKEY_START_CONNECT", "KEY_START_CONNECT$delegate", "keep-alive_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeepAlivePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeepAlivePreference.kt\ncom/xiaomi/fitness/keep_alive/KeepAlivePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,32:1\n140#2:33\n140#2:34\n135#2,6:35\n135#2,6:41\n135#2,6:47\n135#2,6:53\n135#2,6:59\n135#2,6:65\n135#2,6:71\n135#2,6:77\n135#2,6:83\n*S KotlinDebug\n*F\n+ 1 KeepAlivePreference.kt\ncom/xiaomi/fitness/keep_alive/KeepAlivePreference\n*L\n10#1:33\n12#1:34\n14#1:35,6\n16#1:41,6\n18#1:47,6\n20#1:53,6\n22#1:59,6\n24#1:65,6\n26#1:71,6\n28#1:77,6\n30#1:83,6\n*E\n"})
public final class KeepAlivePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_SHOW_CONNECTION_NOTIFICATION", "getKEY_SHOW_CONNECTION_NOTIFICATION()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_DEVICE_CONNECT_OPTIMIZE", "getKEY_DEVICE_CONNECT_OPTIMIZE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_PROCESS_ALIVE_MINUTE", "getKEY_PROCESS_ALIVE_MINUTE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_WAS_FOREGROUND_STARTED", "getKEY_WAS_FOREGROUND_STARTED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_WAS_START_ALARM", "getKEY_WAS_START_ALARM()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_WAS_START_JOB_SCHEDULER", "getKEY_WAS_START_JOB_SCHEDULER()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_LATEST_IS_FOREGROUND", "getKEY_LATEST_IS_FOREGROUND()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_CONNECT_ALL_TIME", "getKEY_CONNECT_ALL_TIME()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_CONNECT_PART_TIME", "getKEY_CONNECT_PART_TIME()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_PROCESS_START", "getKEY_PROCESS_START()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeepAlivePreference.class, "KEY_START_CONNECT", "getKEY_START_CONNECT()Z", 0))};

    @NotNull
    public static final KeepAlivePreference INSTANCE;

    /* JADX INFO: renamed from: KEY_CONNECT_ALL_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_CONNECT_ALL_TIME;

    /* JADX INFO: renamed from: KEY_CONNECT_PART_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_CONNECT_PART_TIME;

    /* JADX INFO: renamed from: KEY_DEVICE_CONNECT_OPTIMIZE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_DEVICE_CONNECT_OPTIMIZE;

    /* JADX INFO: renamed from: KEY_LATEST_IS_FOREGROUND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LATEST_IS_FOREGROUND;

    /* JADX INFO: renamed from: KEY_PROCESS_ALIVE_MINUTE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_PROCESS_ALIVE_MINUTE;

    /* JADX INFO: renamed from: KEY_PROCESS_START$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_PROCESS_START;

    /* JADX INFO: renamed from: KEY_SHOW_CONNECTION_NOTIFICATION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SHOW_CONNECTION_NOTIFICATION;

    /* JADX INFO: renamed from: KEY_START_CONNECT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_START_CONNECT;

    /* JADX INFO: renamed from: KEY_WAS_FOREGROUND_STARTED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_WAS_FOREGROUND_STARTED;

    /* JADX INFO: renamed from: KEY_WAS_START_ALARM$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_WAS_START_ALARM;

    /* JADX INFO: renamed from: KEY_WAS_START_JOB_SCHEDULER$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_WAS_START_JOB_SCHEDULER;

    static {
        KeepAlivePreference keepAlivePreference = new KeepAlivePreference();
        INSTANCE = keepAlivePreference;
        KEY_SHOW_CONNECTION_NOTIFICATION = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$1
        }.getType(), Boolean.TRUE, "key_show_connection_notification", false);
        Boolean bool = Boolean.FALSE;
        KEY_DEVICE_CONNECT_OPTIMIZE = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$2
        }.getType(), bool, "key_device_connect_optimize", false);
        KEY_PROCESS_ALIVE_MINUTE = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0, null, false);
        KEY_WAS_FOREGROUND_STARTED = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, false);
        KEY_WAS_START_ALARM = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), bool, null, false);
        KEY_WAS_START_JOB_SCHEDULER = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), bool, null, false);
        KEY_LATEST_IS_FOREGROUND = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), bool, null, false);
        KEY_CONNECT_ALL_TIME = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), 0, null, false);
        KEY_CONNECT_PART_TIME = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), 0, null, false);
        KEY_PROCESS_START = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), 0L, null, false);
        KEY_START_CONNECT = keepAlivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.keep_alive.KeepAlivePreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), bool, null, false);
    }

    private KeepAlivePreference() {
    }

    public final int getKEY_CONNECT_ALL_TIME() {
        return ((Number) KEY_CONNECT_ALL_TIME.getValue(this, $$delegatedProperties[7])).intValue();
    }

    public final int getKEY_CONNECT_PART_TIME() {
        return ((Number) KEY_CONNECT_PART_TIME.getValue(this, $$delegatedProperties[8])).intValue();
    }

    public final boolean getKEY_DEVICE_CONNECT_OPTIMIZE() {
        return ((Boolean) KEY_DEVICE_CONNECT_OPTIMIZE.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getKEY_LATEST_IS_FOREGROUND() {
        return ((Boolean) KEY_LATEST_IS_FOREGROUND.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public final int getKEY_PROCESS_ALIVE_MINUTE() {
        return ((Number) KEY_PROCESS_ALIVE_MINUTE.getValue(this, $$delegatedProperties[2])).intValue();
    }

    public final long getKEY_PROCESS_START() {
        return ((Number) KEY_PROCESS_START.getValue(this, $$delegatedProperties[9])).longValue();
    }

    public final boolean getKEY_SHOW_CONNECTION_NOTIFICATION() {
        return ((Boolean) KEY_SHOW_CONNECTION_NOTIFICATION.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getKEY_START_CONNECT() {
        return ((Boolean) KEY_START_CONNECT.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    public final boolean getKEY_WAS_FOREGROUND_STARTED() {
        return ((Boolean) KEY_WAS_FOREGROUND_STARTED.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getKEY_WAS_START_ALARM() {
        return ((Boolean) KEY_WAS_START_ALARM.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final boolean getKEY_WAS_START_JOB_SCHEDULER() {
        return ((Boolean) KEY_WAS_START_JOB_SCHEDULER.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "device_keep_alive";
    }

    public final void setKEY_CONNECT_ALL_TIME(int i) {
        KEY_CONNECT_ALL_TIME.setValue(this, $$delegatedProperties[7], Integer.valueOf(i));
    }

    public final void setKEY_CONNECT_PART_TIME(int i) {
        KEY_CONNECT_PART_TIME.setValue(this, $$delegatedProperties[8], Integer.valueOf(i));
    }

    public final void setKEY_DEVICE_CONNECT_OPTIMIZE(boolean z) {
        KEY_DEVICE_CONNECT_OPTIMIZE.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setKEY_LATEST_IS_FOREGROUND(boolean z) {
        KEY_LATEST_IS_FOREGROUND.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public final void setKEY_PROCESS_ALIVE_MINUTE(int i) {
        KEY_PROCESS_ALIVE_MINUTE.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    public final void setKEY_PROCESS_START(long j) {
        KEY_PROCESS_START.setValue(this, $$delegatedProperties[9], Long.valueOf(j));
    }

    public final void setKEY_SHOW_CONNECTION_NOTIFICATION(boolean z) {
        KEY_SHOW_CONNECTION_NOTIFICATION.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setKEY_START_CONNECT(boolean z) {
        KEY_START_CONNECT.setValue(this, $$delegatedProperties[10], Boolean.valueOf(z));
    }

    public final void setKEY_WAS_FOREGROUND_STARTED(boolean z) {
        KEY_WAS_FOREGROUND_STARTED.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setKEY_WAS_START_ALARM(boolean z) {
        KEY_WAS_START_ALARM.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setKEY_WAS_START_JOB_SCHEDULER(boolean z) {
        KEY_WAS_START_JOB_SCHEDULER.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }
}
