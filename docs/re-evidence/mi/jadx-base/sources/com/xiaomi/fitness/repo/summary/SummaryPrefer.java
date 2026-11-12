package com.xiaomi.fitness.repo.summary;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0018R+\u0010\u001a\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u0018R+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010%\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0010\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R+\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0010\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000e¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/repo/summary/SummaryPrefer;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "SPORT_START_SEC_0TZ", "getSPORT_START_SEC_0TZ", "()J", "setSPORT_START_SEC_0TZ", "(J)V", "SPORT_START_SEC_0TZ$delegate", "Lkotlin/properties/ReadWriteProperty;", "SPORT_START_SEC_0TZ_OFFLINE", "getSPORT_START_SEC_0TZ_OFFLINE", "setSPORT_START_SEC_0TZ_OFFLINE", "SPORT_START_SEC_0TZ_OFFLINE$delegate", "SPORT_CATEGORY", "getSPORT_CATEGORY", "setSPORT_CATEGORY", "(Ljava/lang/String;)V", "SPORT_CATEGORY$delegate", "SPORT_CATEGORY_OFFLINE", "getSPORT_CATEGORY_OFFLINE", "setSPORT_CATEGORY_OFFLINE", "SPORT_CATEGORY_OFFLINE$delegate", "", "SPORT_SUMMARY_SYNCED", "getSPORT_SUMMARY_SYNCED", "()Z", "setSPORT_SUMMARY_SYNCED", "(Z)V", "SPORT_SUMMARY_SYNCED$delegate", "CURSE_V3_SYNCED", "getCURSE_V3_SYNCED", "setCURSE_V3_SYNCED", "CURSE_V3_SYNCED$delegate", "CURSE_LAST_MODIFY", "getCURSE_LAST_MODIFY", "setCURSE_LAST_MODIFY", "CURSE_LAST_MODIFY$delegate", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSummaryPrefer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SummaryPrefer.kt\ncom/xiaomi/fitness/repo/summary/SummaryPrefer\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,27:1\n135#2,6:28\n135#2,6:34\n135#2,6:40\n135#2,6:46\n135#2,6:52\n135#2,6:58\n135#2,6:64\n*S KotlinDebug\n*F\n+ 1 SummaryPrefer.kt\ncom/xiaomi/fitness/repo/summary/SummaryPrefer\n*L\n15#1:28,6\n16#1:34,6\n17#1:40,6\n18#1:46,6\n19#1:52,6\n24#1:58,6\n26#1:64,6\n*E\n"})
public final class SummaryPrefer extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SummaryPrefer.class, "SPORT_START_SEC_0TZ", "getSPORT_START_SEC_0TZ()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SummaryPrefer.class, "SPORT_START_SEC_0TZ_OFFLINE", "getSPORT_START_SEC_0TZ_OFFLINE()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SummaryPrefer.class, "SPORT_CATEGORY", "getSPORT_CATEGORY()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SummaryPrefer.class, "SPORT_CATEGORY_OFFLINE", "getSPORT_CATEGORY_OFFLINE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SummaryPrefer.class, "SPORT_SUMMARY_SYNCED", "getSPORT_SUMMARY_SYNCED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SummaryPrefer.class, "CURSE_V3_SYNCED", "getCURSE_V3_SYNCED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SummaryPrefer.class, "CURSE_LAST_MODIFY", "getCURSE_LAST_MODIFY()J", 0))};

    /* JADX INFO: renamed from: CURSE_LAST_MODIFY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURSE_LAST_MODIFY;

    /* JADX INFO: renamed from: CURSE_V3_SYNCED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURSE_V3_SYNCED;

    @NotNull
    public static final SummaryPrefer INSTANCE;

    /* JADX INFO: renamed from: SPORT_CATEGORY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_CATEGORY;

    /* JADX INFO: renamed from: SPORT_CATEGORY_OFFLINE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_CATEGORY_OFFLINE;

    /* JADX INFO: renamed from: SPORT_START_SEC_0TZ$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_START_SEC_0TZ;

    /* JADX INFO: renamed from: SPORT_START_SEC_0TZ_OFFLINE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_START_SEC_0TZ_OFFLINE;

    /* JADX INFO: renamed from: SPORT_SUMMARY_SYNCED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_SUMMARY_SYNCED;

    static {
        SummaryPrefer summaryPrefer = new SummaryPrefer();
        INSTANCE = summaryPrefer;
        SPORT_START_SEC_0TZ = summaryPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.repo.summary.SummaryPrefer$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, true);
        SPORT_START_SEC_0TZ_OFFLINE = summaryPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.repo.summary.SummaryPrefer$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
        SPORT_CATEGORY = summaryPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.repo.summary.SummaryPrefer$special$$inlined$bindToPreferenceField$default$3
        }.getType(), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, null, true);
        SPORT_CATEGORY_OFFLINE = summaryPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.repo.summary.SummaryPrefer$special$$inlined$bindToPreferenceField$default$4
        }.getType(), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, null, true);
        Boolean bool = Boolean.FALSE;
        SPORT_SUMMARY_SYNCED = summaryPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.repo.summary.SummaryPrefer$special$$inlined$bindToPreferenceField$default$5
        }.getType(), bool, null, true);
        CURSE_V3_SYNCED = summaryPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.repo.summary.SummaryPrefer$special$$inlined$bindToPreferenceField$default$6
        }.getType(), bool, null, true);
        CURSE_LAST_MODIFY = summaryPrefer.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.repo.summary.SummaryPrefer$special$$inlined$bindToPreferenceField$default$7
        }.getType(), 0L, null, false);
    }

    private SummaryPrefer() {
    }

    public final long getCURSE_LAST_MODIFY() {
        return ((Number) CURSE_LAST_MODIFY.getValue(this, $$delegatedProperties[6])).longValue();
    }

    public final boolean getCURSE_V3_SYNCED() {
        return ((Boolean) CURSE_V3_SYNCED.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    @NotNull
    public final String getSPORT_CATEGORY() {
        return (String) SPORT_CATEGORY.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final String getSPORT_CATEGORY_OFFLINE() {
        return (String) SPORT_CATEGORY_OFFLINE.getValue(this, $$delegatedProperties[3]);
    }

    public final long getSPORT_START_SEC_0TZ() {
        return ((Number) SPORT_START_SEC_0TZ.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final long getSPORT_START_SEC_0TZ_OFFLINE() {
        return ((Number) SPORT_START_SEC_0TZ_OFFLINE.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final boolean getSPORT_SUMMARY_SYNCED() {
        return ((Boolean) SPORT_SUMMARY_SYNCED.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "summary_prefer";
    }

    public final void setCURSE_LAST_MODIFY(long j) {
        CURSE_LAST_MODIFY.setValue(this, $$delegatedProperties[6], Long.valueOf(j));
    }

    public final void setCURSE_V3_SYNCED(boolean z) {
        CURSE_V3_SYNCED.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setSPORT_CATEGORY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SPORT_CATEGORY.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setSPORT_CATEGORY_OFFLINE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SPORT_CATEGORY_OFFLINE.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setSPORT_START_SEC_0TZ(long j) {
        SPORT_START_SEC_0TZ.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setSPORT_START_SEC_0TZ_OFFLINE(long j) {
        SPORT_START_SEC_0TZ_OFFLINE.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setSPORT_SUMMARY_SYNCED(boolean z) {
        SPORT_SUMMARY_SYNCED.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }
}
