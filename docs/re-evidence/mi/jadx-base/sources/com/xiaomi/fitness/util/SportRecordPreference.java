package com.xiaomi.fitness.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.detail.data.SportFeedbackModel;
import defpackage.xpd;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/util/SportRecordPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "SPORT_FEEDBACK", "getSPORT_FEEDBACK", "setSPORT_FEEDBACK", "(Ljava/lang/String;)V", "SPORT_FEEDBACK$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "showRateExampleTime", "getShowRateExampleTime", "()J", "setShowRateExampleTime", "(J)V", "showRateExampleTime$delegate", "getFeedBackList", "", "Lcom/xiaomi/fitness/detail/data/SportFeedbackModel;", "putFeedBackList", "", "feedbackList", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRecordPrefence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordPrefence.kt\ncom/xiaomi/fitness/util/SportRecordPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,24:1\n211#2,7:25\n135#2,6:32\n*S KotlinDebug\n*F\n+ 1 SportRecordPrefence.kt\ncom/xiaomi/fitness/util/SportRecordPreference\n*L\n10#1:25,7\n12#1:32,6\n*E\n"})
public final class SportRecordPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportRecordPreference.class, "SPORT_FEEDBACK", "getSPORT_FEEDBACK()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportRecordPreference.class, "showRateExampleTime", "getShowRateExampleTime()J", 0))};

    @NotNull
    public static final SportRecordPreference INSTANCE;

    /* JADX INFO: renamed from: SPORT_FEEDBACK$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_FEEDBACK;

    /* JADX INFO: renamed from: showRateExampleTime$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty showRateExampleTime;

    static {
        SportRecordPreference sportRecordPreference = new SportRecordPreference();
        INSTANCE = sportRecordPreference;
        SPORT_FEEDBACK = sportRecordPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.util.SportRecordPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref", "key_sport_feedback");
        showRateExampleTime = sportRecordPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.util.SportRecordPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, true);
    }

    private SportRecordPreference() {
    }

    private final String getSPORT_FEEDBACK() {
        return (String) SPORT_FEEDBACK.getValue(this, $$delegatedProperties[0]);
    }

    private final void setSPORT_FEEDBACK(String str) {
        SPORT_FEEDBACK.setValue(this, $$delegatedProperties[0], str);
    }

    @Nullable
    public final List<SportFeedbackModel> getFeedBackList() {
        return xpd.d(getSPORT_FEEDBACK(), SportFeedbackModel.class);
    }

    public final long getShowRateExampleTime() {
        return ((Number) showRateExampleTime.getValue(this, $$delegatedProperties[1])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sport_record_ui";
    }

    public final void putFeedBackList(@NotNull List<SportFeedbackModel> feedbackList) {
        Intrinsics.checkNotNullParameter(feedbackList, "feedbackList");
        INSTANCE.setSPORT_FEEDBACK(xpd.c(feedbackList));
    }

    public final void setShowRateExampleTime(long j) {
        showRateExampleTime.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }
}
