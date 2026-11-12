package com.xiaomi.fitness.health.ecg;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0015\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007RC\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgAnalyzePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "", "ANALYZING_REPORT", "getANALYZING_REPORT", "()Ljava/util/Map;", "setANALYZING_REPORT", "(Ljava/util/Map;)V", "ANALYZING_REPORT$delegate", "Lkotlin/properties/ReadWriteProperty;", "addAnalyzingReport", "", "key", "value", "removeAnalyzingReport", "getAnalyzingTimeSec", "(J)Ljava/lang/Long;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcgAnalyzePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgAnalyzePreference.kt\ncom/xiaomi/fitness/health/ecg/EcgAnalyzePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,29:1\n135#2,6:30\n*S KotlinDebug\n*F\n+ 1 EcgAnalyzePreference.kt\ncom/xiaomi/fitness/health/ecg/EcgAnalyzePreference\n*L\n9#1:30,6\n*E\n"})
public final class EcgAnalyzePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcgAnalyzePreference.class, "ANALYZING_REPORT", "getANALYZING_REPORT()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: ANALYZING_REPORT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ANALYZING_REPORT;

    @NotNull
    public static final EcgAnalyzePreference INSTANCE;

    static {
        EcgAnalyzePreference ecgAnalyzePreference = new EcgAnalyzePreference();
        INSTANCE = ecgAnalyzePreference;
        ANALYZING_REPORT = ecgAnalyzePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Map.class), new TypeToken<Map<Long, ? extends Long>>() { // from class: com.xiaomi.fitness.health.ecg.EcgAnalyzePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), new LinkedHashMap(), null, true);
    }

    private EcgAnalyzePreference() {
    }

    public final void addAnalyzingReport(long key, long value) {
        Map mutableMap = MapsKt__MapsKt.toMutableMap(getANALYZING_REPORT());
        mutableMap.put(Long.valueOf(key), Long.valueOf(value));
        setANALYZING_REPORT(MapsKt__MapsKt.toMap(mutableMap));
    }

    @NotNull
    public final Map<Long, Long> getANALYZING_REPORT() {
        return (Map) ANALYZING_REPORT.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final Long getAnalyzingTimeSec(long key) {
        return getANALYZING_REPORT().get(Long.valueOf(key));
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "ecg_analyze";
    }

    public final void removeAnalyzingReport(long key) {
        Map mutableMap = MapsKt__MapsKt.toMutableMap(getANALYZING_REPORT());
        mutableMap.remove(Long.valueOf(key));
        setANALYZING_REPORT(MapsKt__MapsKt.toMap(mutableMap));
    }

    public final void setANALYZING_REPORT(@NotNull Map<Long, Long> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        ANALYZING_REPORT.setValue(this, $$delegatedProperties[0], map);
    }
}
