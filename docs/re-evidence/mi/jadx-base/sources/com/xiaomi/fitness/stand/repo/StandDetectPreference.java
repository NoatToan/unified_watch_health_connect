package com.xiaomi.fitness.stand.repo;

import android.app.Application;
import android.content.SharedPreferences;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.stand.StandDetectConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00104\u001a\u000205H\u0002J\u000e\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0016J\u0006\u00108\u001a\u00020\u0016J\u000e\u00109\u001a\u0002052\u0006\u00107\u001a\u00020\u0016J\u0006\u0010:\u001a\u00020\u0016J\u0016\u0010;\u001a\u0002052\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020\u0016J\u000e\u0010A\u001a\u0002052\u0006\u00107\u001a\u00020\u0016J\u0006\u0010B\u001a\u00020\u0016J\u000e\u0010C\u001a\u0002052\u0006\u0010D\u001a\u00020\u0016J\u0016\u0010E\u001a\u0002052\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u0006\u0010F\u001a\u00020?R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001d\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR+\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010(\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR+\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR+\u00100\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0011\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u000f¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/stand/repo/StandDetectPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "TAG", "", "spName", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "DETECT_START_TIME", "getDETECT_START_TIME", "()I", "setDETECT_START_TIME", "(I)V", "DETECT_START_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "DETECT_END_TIME", "getDETECT_END_TIME", "setDETECT_END_TIME", "DETECT_END_TIME$delegate", "", "DETECT_ENABLE", "getDETECT_ENABLE", "()Z", "setDETECT_ENABLE", "(Z)V", "DETECT_ENABLE$delegate", "DETECT_REMINDER_ENABLE", "getDETECT_REMINDER_ENABLE", "setDETECT_REMINDER_ENABLE", "DETECT_REMINDER_ENABLE$delegate", "", "REMINDER_NOT_SHOW_TODAY", "getREMINDER_NOT_SHOW_TODAY", "()J", "setREMINDER_NOT_SHOW_TODAY", "(J)V", "REMINDER_NOT_SHOW_TODAY$delegate", "DETECT_NAP_ENABLE", "getDETECT_NAP_ENABLE", "setDETECT_NAP_ENABLE", "DETECT_NAP_ENABLE$delegate", "DETECT_NAP_START_TIME", "getDETECT_NAP_START_TIME", "setDETECT_NAP_START_TIME", "DETECT_NAP_START_TIME$delegate", "DETECT_NAP_END_TIME", "getDETECT_NAP_END_TIME", "setDETECT_NAP_END_TIME", "DETECT_NAP_END_TIME$delegate", "migrationStandSettings", "", "setStandDetectEnable", "enable", "getStandDetectEnabled", "setStandReminderEnable", "getStandReminderEnable", "setRemindTime", StatConstants.PARAM_START, StatConstants.PARAM_END, "getRemindTime", "", "getNapEnable", "setNapEnable", "checkReminderIsShowToday", "setReminderIsShowToday", "isShow", "setDetectNapTime", "getDetectNapTime", "stand-detect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStandDetectPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandDetectPreference.kt\ncom/xiaomi/fitness/stand/repo/StandDetectPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,138:1\n135#2,6:139\n135#2,6:145\n135#2,6:151\n135#2,6:157\n135#2,6:163\n135#2,6:169\n135#2,6:175\n135#2,6:181\n*S KotlinDebug\n*F\n+ 1 StandDetectPreference.kt\ncom/xiaomi/fitness/stand/repo/StandDetectPreference\n*L\n21#1:139,6\n24#1:145,6\n26#1:151,6\n28#1:157,6\n30#1:163,6\n32#1:169,6\n35#1:175,6\n38#1:181,6\n*E\n"})
public final class StandDetectPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(StandDetectPreference.class, "DETECT_START_TIME", "getDETECT_START_TIME()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(StandDetectPreference.class, "DETECT_END_TIME", "getDETECT_END_TIME()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(StandDetectPreference.class, "DETECT_ENABLE", "getDETECT_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(StandDetectPreference.class, "DETECT_REMINDER_ENABLE", "getDETECT_REMINDER_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(StandDetectPreference.class, "REMINDER_NOT_SHOW_TODAY", "getREMINDER_NOT_SHOW_TODAY()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(StandDetectPreference.class, "DETECT_NAP_ENABLE", "getDETECT_NAP_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(StandDetectPreference.class, "DETECT_NAP_START_TIME", "getDETECT_NAP_START_TIME()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(StandDetectPreference.class, "DETECT_NAP_END_TIME", "getDETECT_NAP_END_TIME()I", 0))};

    /* JADX INFO: renamed from: DETECT_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DETECT_ENABLE;

    /* JADX INFO: renamed from: DETECT_END_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DETECT_END_TIME;

    /* JADX INFO: renamed from: DETECT_NAP_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DETECT_NAP_ENABLE;

    /* JADX INFO: renamed from: DETECT_NAP_END_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DETECT_NAP_END_TIME;

    /* JADX INFO: renamed from: DETECT_NAP_START_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DETECT_NAP_START_TIME;

    /* JADX INFO: renamed from: DETECT_REMINDER_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DETECT_REMINDER_ENABLE;

    /* JADX INFO: renamed from: DETECT_START_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DETECT_START_TIME;

    @NotNull
    public static final StandDetectPreference INSTANCE;

    /* JADX INFO: renamed from: REMINDER_NOT_SHOW_TODAY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty REMINDER_NOT_SHOW_TODAY;

    @NotNull
    private static final String TAG = "StandDetector";

    static {
        StandDetectPreference standDetectPreference = new StandDetectPreference();
        INSTANCE = standDetectPreference;
        DETECT_START_TIME = standDetectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.stand.repo.StandDetectPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 800, null, true);
        DETECT_END_TIME = standDetectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.stand.repo.StandDetectPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 2000, null, true);
        DETECT_ENABLE = standDetectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.stand.repo.StandDetectPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), Boolean.TRUE, null, true);
        Boolean bool = Boolean.FALSE;
        DETECT_REMINDER_ENABLE = standDetectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.stand.repo.StandDetectPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), bool, null, true);
        REMINDER_NOT_SHOW_TODAY = standDetectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.stand.repo.StandDetectPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), 0L, null, true);
        DETECT_NAP_ENABLE = standDetectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.stand.repo.StandDetectPreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), bool, null, true);
        DETECT_NAP_START_TIME = standDetectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.stand.repo.StandDetectPreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), 1200, null, true);
        DETECT_NAP_END_TIME = standDetectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.stand.repo.StandDetectPreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), Integer.valueOf(StandDetectConstants.DETECT_IGNORE_NOTICE_END), null, true);
        standDetectPreference.migrationStandSettings();
    }

    private StandDetectPreference() {
    }

    private final boolean getDETECT_ENABLE() {
        return ((Boolean) DETECT_ENABLE.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final int getDETECT_END_TIME() {
        return ((Number) DETECT_END_TIME.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final boolean getDETECT_NAP_ENABLE() {
        return ((Boolean) DETECT_NAP_ENABLE.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    private final int getDETECT_NAP_END_TIME() {
        return ((Number) DETECT_NAP_END_TIME.getValue(this, $$delegatedProperties[7])).intValue();
    }

    private final int getDETECT_NAP_START_TIME() {
        return ((Number) DETECT_NAP_START_TIME.getValue(this, $$delegatedProperties[6])).intValue();
    }

    private final boolean getDETECT_REMINDER_ENABLE() {
        return ((Boolean) DETECT_REMINDER_ENABLE.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    private final int getDETECT_START_TIME() {
        return ((Number) DETECT_START_TIME.getValue(this, $$delegatedProperties[0])).intValue();
    }

    private final long getREMINDER_NOT_SHOW_TODAY() {
        return ((Number) REMINDER_NOT_SHOW_TODAY.getValue(this, $$delegatedProperties[4])).longValue();
    }

    private final void migrationStandSettings() {
        Application application = ApplicationExtKt.getApplication();
        if (new File(FileUtils.INSTANCE.getSharedPrefDir(application), "pref:stand.xml").exists()) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("pref:stand", 0);
            if (sharedPreferences.getAll().isEmpty()) {
                return;
            }
            boolean z = sharedPreferences.getBoolean("stand_remind_v1", false);
            Logger.i("StandDetector", "migrationStandSettings: enable = " + z);
            setStandReminderEnable(z);
            sharedPreferences.edit().clear().apply();
            SharedPreferences sharedPreferences2 = application.getSharedPreferences("pref:stand.cloud_pref", 0);
            if (sharedPreferences2.getAll().isEmpty()) {
                return;
            }
            String string = sharedPreferences2.getString("remind_start", UserConfig.KEY_MI_BRAIN_SETTING);
            Intrinsics.checkNotNull(string);
            String string2 = sharedPreferences2.getString("remind_end", UserConfig.KEY_CAMERA_LIST_SORT_ORDER);
            Intrinsics.checkNotNull(string2);
            setRemindTime(Integer.parseInt(string) * 100, Integer.parseInt(string2) * 100);
            sharedPreferences2.edit().clear().apply();
            Logger.i("StandDetector", "migrationStandSettings: reminder enable = " + getDETECT_REMINDER_ENABLE() + ", startTime = " + string + ", endTime = " + string2);
            application.deleteSharedPreferences("pref:stand");
        }
    }

    private final void setDETECT_ENABLE(boolean z) {
        DETECT_ENABLE.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    private final void setDETECT_END_TIME(int i) {
        DETECT_END_TIME.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    private final void setDETECT_NAP_ENABLE(boolean z) {
        DETECT_NAP_ENABLE.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    private final void setDETECT_NAP_END_TIME(int i) {
        DETECT_NAP_END_TIME.setValue(this, $$delegatedProperties[7], Integer.valueOf(i));
    }

    private final void setDETECT_NAP_START_TIME(int i) {
        DETECT_NAP_START_TIME.setValue(this, $$delegatedProperties[6], Integer.valueOf(i));
    }

    private final void setDETECT_REMINDER_ENABLE(boolean z) {
        DETECT_REMINDER_ENABLE.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    private final void setDETECT_START_TIME(int i) {
        DETECT_START_TIME.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    private final void setREMINDER_NOT_SHOW_TODAY(long j) {
        REMINDER_NOT_SHOW_TODAY.setValue(this, $$delegatedProperties[4], Long.valueOf(j));
    }

    public final boolean checkReminderIsShowToday() {
        return System.currentTimeMillis() > getREMINDER_NOT_SHOW_TODAY();
    }

    @NotNull
    public final int[] getDetectNapTime() {
        return new int[]{getDETECT_NAP_START_TIME(), getDETECT_NAP_END_TIME()};
    }

    public final boolean getNapEnable() {
        return getDETECT_NAP_ENABLE();
    }

    @NotNull
    public final int[] getRemindTime() {
        return new int[]{getDETECT_START_TIME(), getDETECT_END_TIME()};
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return StandDetectConstants.DETECT_SPF_NAME;
    }

    public final boolean getStandDetectEnabled() {
        return getDETECT_ENABLE();
    }

    public final boolean getStandReminderEnable() {
        return getDETECT_REMINDER_ENABLE();
    }

    public final void setDetectNapTime(int start, int end) {
        if (start < 0 || end > 2400 || start >= end) {
            Logger.e("StandDetector", "Remind nap time illegal.");
            return;
        }
        Logger.i("StandDetector", "setDetectNapTime: " + start + ", " + end);
        setDETECT_NAP_START_TIME(start);
        setDETECT_NAP_END_TIME(end);
    }

    public final void setNapEnable(boolean enable) {
        setDETECT_NAP_ENABLE(enable);
    }

    public final void setRemindTime(int start, int end) {
        if (start < 0 || end > 2400 || start >= end) {
            Logger.e("StandDetector", "Remind time illegal.");
            return;
        }
        Logger.i("StandDetector", "setRemindTime: " + start + ", " + end);
        setDETECT_START_TIME(start);
        setDETECT_END_TIME(end);
    }

    public final void setReminderIsShowToday(boolean isShow) {
        setREMINDER_NOT_SHOW_TODAY(isShow ? 0L : TimeUtils.INSTANCE.getEndOfToday());
    }

    public final void setStandDetectEnable(boolean enable) {
        setDETECT_ENABLE(enable);
    }

    public final void setStandReminderEnable(boolean enable) {
        setDETECT_REMINDER_ENABLE(enable);
    }
}
