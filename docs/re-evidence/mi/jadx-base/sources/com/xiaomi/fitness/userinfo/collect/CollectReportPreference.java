package com.xiaomi.fitness.userinfo.collect;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/userinfo/collect/CollectReportPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "REPORT_TIME_SECOND", "getREPORT_TIME_SECOND", "()J", "setREPORT_TIME_SECOND", "(J)V", "REPORT_TIME_SECOND$delegate", "Lkotlin/properties/ReadWriteProperty;", "WRAPPER_REPORT_USER_INFO", "getWRAPPER_REPORT_USER_INFO", "setWRAPPER_REPORT_USER_INFO", "(Ljava/lang/String;)V", "WRAPPER_REPORT_USER_INFO$delegate", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCollectReportPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectReportPreference.kt\ncom/xiaomi/fitness/userinfo/collect/CollectReportPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,15:1\n135#2,6:16\n135#2,6:22\n*S KotlinDebug\n*F\n+ 1 CollectReportPreference.kt\ncom/xiaomi/fitness/userinfo/collect/CollectReportPreference\n*L\n9#1:16,6\n11#1:22,6\n*E\n"})
public final class CollectReportPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CollectReportPreference.class, "REPORT_TIME_SECOND", "getREPORT_TIME_SECOND()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CollectReportPreference.class, "WRAPPER_REPORT_USER_INFO", "getWRAPPER_REPORT_USER_INFO()Ljava/lang/String;", 0))};

    @NotNull
    public static final CollectReportPreference INSTANCE;

    /* JADX INFO: renamed from: REPORT_TIME_SECOND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty REPORT_TIME_SECOND;

    /* JADX INFO: renamed from: WRAPPER_REPORT_USER_INFO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty WRAPPER_REPORT_USER_INFO;

    static {
        CollectReportPreference collectReportPreference = new CollectReportPreference();
        INSTANCE = collectReportPreference;
        REPORT_TIME_SECOND = collectReportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.userinfo.collect.CollectReportPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, false);
        WRAPPER_REPORT_USER_INFO = collectReportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.userinfo.collect.CollectReportPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), "", null, true);
    }

    private CollectReportPreference() {
    }

    public final long getREPORT_TIME_SECOND() {
        return ((Number) REPORT_TIME_SECOND.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "collect_report_pref";
    }

    @NotNull
    public final String getWRAPPER_REPORT_USER_INFO() {
        return (String) WRAPPER_REPORT_USER_INFO.getValue(this, $$delegatedProperties[1]);
    }

    public final void setREPORT_TIME_SECOND(long j) {
        REPORT_TIME_SECOND.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setWRAPPER_REPORT_USER_INFO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        WRAPPER_REPORT_USER_INFO.setValue(this, $$delegatedProperties[1], str);
    }
}
