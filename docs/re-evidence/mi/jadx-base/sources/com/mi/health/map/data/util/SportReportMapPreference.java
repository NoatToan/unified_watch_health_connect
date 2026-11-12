package com.mi.health.map.data.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.detail.video.share.util.SportTraceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0018R+\u0010\u001a\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u0018R+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/mi/health/map/data/util/SportReportMapPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "SPORT_SHOW_PACE_COLOR", "getSPORT_SHOW_PACE_COLOR", "()Z", "setSPORT_SHOW_PACE_COLOR", "(Z)V", "SPORT_SHOW_PACE_COLOR$delegate", "Lkotlin/properties/ReadWriteProperty;", "SPORT_SHOW_MAIL_POINTS", "getSPORT_SHOW_MAIL_POINTS", "setSPORT_SHOW_MAIL_POINTS", "SPORT_SHOW_MAIL_POINTS$delegate", "SPORT_SHOW_MAP_STYLE_ID", "getSPORT_SHOW_MAP_STYLE_ID", "setSPORT_SHOW_MAP_STYLE_ID", "(Ljava/lang/String;)V", "SPORT_SHOW_MAP_STYLE_ID$delegate", "SPORT_SHOW_MAP_STYLE_NAME", "getSPORT_SHOW_MAP_STYLE_NAME", "setSPORT_SHOW_MAP_STYLE_NAME", "SPORT_SHOW_MAP_STYLE_NAME$delegate", "", "SPORT_SHOW_MARK_STYLE", "getSPORT_SHOW_MARK_STYLE", "()I", "setSPORT_SHOW_MARK_STYLE", "(I)V", "SPORT_SHOW_MARK_STYLE$delegate", "map-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportReportMapPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportReportMapPreference.kt\ncom/mi/health/map/data/util/SportReportMapPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,14:1\n135#2,6:15\n135#2,6:21\n135#2,6:27\n135#2,6:33\n135#2,6:39\n*S KotlinDebug\n*F\n+ 1 SportReportMapPreference.kt\ncom/mi/health/map/data/util/SportReportMapPreference\n*L\n9#1:15,6\n10#1:21,6\n11#1:27,6\n12#1:33,6\n13#1:39,6\n*E\n"})
public final class SportReportMapPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportReportMapPreference.class, "SPORT_SHOW_PACE_COLOR", "getSPORT_SHOW_PACE_COLOR()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportReportMapPreference.class, "SPORT_SHOW_MAIL_POINTS", "getSPORT_SHOW_MAIL_POINTS()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportReportMapPreference.class, "SPORT_SHOW_MAP_STYLE_ID", "getSPORT_SHOW_MAP_STYLE_ID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportReportMapPreference.class, "SPORT_SHOW_MAP_STYLE_NAME", "getSPORT_SHOW_MAP_STYLE_NAME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportReportMapPreference.class, "SPORT_SHOW_MARK_STYLE", "getSPORT_SHOW_MARK_STYLE()I", 0))};

    @NotNull
    public static final SportReportMapPreference INSTANCE;

    /* JADX INFO: renamed from: SPORT_SHOW_MAIL_POINTS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_SHOW_MAIL_POINTS;

    /* JADX INFO: renamed from: SPORT_SHOW_MAP_STYLE_ID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_SHOW_MAP_STYLE_ID;

    /* JADX INFO: renamed from: SPORT_SHOW_MAP_STYLE_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_SHOW_MAP_STYLE_NAME;

    /* JADX INFO: renamed from: SPORT_SHOW_MARK_STYLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_SHOW_MARK_STYLE;

    /* JADX INFO: renamed from: SPORT_SHOW_PACE_COLOR$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SPORT_SHOW_PACE_COLOR;

    static {
        SportReportMapPreference sportReportMapPreference = new SportReportMapPreference();
        INSTANCE = sportReportMapPreference;
        SPORT_SHOW_PACE_COLOR = sportReportMapPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.mi.health.map.data.util.SportReportMapPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.TRUE, null, true);
        SPORT_SHOW_MAIL_POINTS = sportReportMapPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.mi.health.map.data.util.SportReportMapPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.FALSE, null, true);
        SPORT_SHOW_MAP_STYLE_ID = sportReportMapPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.mi.health.map.data.util.SportReportMapPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), SportTraceConstants.MAP_STYLE_RES_ID_BIAOZHUN, null, true);
        SPORT_SHOW_MAP_STYLE_NAME = sportReportMapPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.mi.health.map.data.util.SportReportMapPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), SportTraceConstants.MAP_STYLE_NAME_BIAOZHUN, null, true);
        SPORT_SHOW_MARK_STYLE = sportReportMapPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.mi.health.map.data.util.SportReportMapPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), 0, null, true);
    }

    private SportReportMapPreference() {
    }

    public final boolean getSPORT_SHOW_MAIL_POINTS() {
        return ((Boolean) SPORT_SHOW_MAIL_POINTS.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @NotNull
    public final String getSPORT_SHOW_MAP_STYLE_ID() {
        return (String) SPORT_SHOW_MAP_STYLE_ID.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final String getSPORT_SHOW_MAP_STYLE_NAME() {
        return (String) SPORT_SHOW_MAP_STYLE_NAME.getValue(this, $$delegatedProperties[3]);
    }

    public final int getSPORT_SHOW_MARK_STYLE() {
        return ((Number) SPORT_SHOW_MARK_STYLE.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final boolean getSPORT_SHOW_PACE_COLOR() {
        return ((Boolean) SPORT_SHOW_PACE_COLOR.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sport_report_map";
    }

    public final void setSPORT_SHOW_MAIL_POINTS(boolean z) {
        SPORT_SHOW_MAIL_POINTS.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setSPORT_SHOW_MAP_STYLE_ID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SPORT_SHOW_MAP_STYLE_ID.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setSPORT_SHOW_MAP_STYLE_NAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SPORT_SHOW_MAP_STYLE_NAME.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setSPORT_SHOW_MARK_STYLE(int i) {
        SPORT_SHOW_MARK_STYLE.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    public final void setSPORT_SHOW_PACE_COLOR(boolean z) {
        SPORT_SHOW_PACE_COLOR.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
