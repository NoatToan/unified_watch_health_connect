package com.xiaomi.fitness.mine.preference;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/mine/preference/WeeklyReportSharePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "selectModeListener", "", "Lkotlin/Function1;", "", "", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_WEEKLY_REPORT_AUTH", "getKEY_WEEKLY_REPORT_AUTH", "()I", "setKEY_WEEKLY_REPORT_AUTH", "(I)V", "KEY_WEEKLY_REPORT_AUTH$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "KEY_WEEKLY_REPORT_REVIEW_TIME_TEMP", "getKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP", "()J", "setKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP", "(J)V", "KEY_WEEKLY_REPORT_REVIEW_TIME_TEMP$delegate", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeeklyReportSharePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeeklyReportSharePreference.kt\ncom/xiaomi/fitness/mine/preference/WeeklyReportSharePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,14:1\n135#2,6:15\n135#2,6:21\n*S KotlinDebug\n*F\n+ 1 WeeklyReportSharePreference.kt\ncom/xiaomi/fitness/mine/preference/WeeklyReportSharePreference\n*L\n11#1:15,6\n13#1:21,6\n*E\n"})
public final class WeeklyReportSharePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WeeklyReportSharePreference.class, "KEY_WEEKLY_REPORT_AUTH", "getKEY_WEEKLY_REPORT_AUTH()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WeeklyReportSharePreference.class, "KEY_WEEKLY_REPORT_REVIEW_TIME_TEMP", "getKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP()J", 0))};

    @NotNull
    public static final WeeklyReportSharePreference INSTANCE;

    /* JADX INFO: renamed from: KEY_WEEKLY_REPORT_AUTH$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_WEEKLY_REPORT_AUTH;

    /* JADX INFO: renamed from: KEY_WEEKLY_REPORT_REVIEW_TIME_TEMP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_WEEKLY_REPORT_REVIEW_TIME_TEMP;

    @NotNull
    private static final List<Function1<Integer, Unit>> selectModeListener;

    static {
        WeeklyReportSharePreference weeklyReportSharePreference = new WeeklyReportSharePreference();
        INSTANCE = weeklyReportSharePreference;
        selectModeListener = new ArrayList();
        KEY_WEEKLY_REPORT_AUTH = weeklyReportSharePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.mine.preference.WeeklyReportSharePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0, null, true);
        KEY_WEEKLY_REPORT_REVIEW_TIME_TEMP = weeklyReportSharePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.mine.preference.WeeklyReportSharePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
    }

    private WeeklyReportSharePreference() {
    }

    public final int getKEY_WEEKLY_REPORT_AUTH() {
        return ((Number) KEY_WEEKLY_REPORT_AUTH.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final long getKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP() {
        return ((Number) KEY_WEEKLY_REPORT_REVIEW_TIME_TEMP.getValue(this, $$delegatedProperties[1])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final void setKEY_WEEKLY_REPORT_AUTH(int i) {
        KEY_WEEKLY_REPORT_AUTH.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP(long j) {
        KEY_WEEKLY_REPORT_REVIEW_TIME_TEMP.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }
}
