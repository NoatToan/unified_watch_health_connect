package com.xiaomi.fit.fitness.export.sp;

import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.sp.RelativeDataPreference;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 J\u0016\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 J\u0016\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 J,\u0010$\u001a\u00020%2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0018\u00010'2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010(\u001a\u00020 J\u0016\u0010)\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010(\u001a\u00020 J\u0016\u0010*\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010(\u001a\u00020 J\u0016\u0010+\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010(\u001a\u00020 J\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0-J\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0-J\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0-J\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0-2\u0006\u00101\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0012R+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\u0012¨\u00063"}, d2 = {"Lcom/xiaomi/fit/fitness/export/sp/RelativeDataPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "<set-?>", "KEY_DATA_LATEST_TIME", "getKEY_DATA_LATEST_TIME", "setKEY_DATA_LATEST_TIME", "(Ljava/lang/String;)V", "KEY_DATA_LATEST_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_ABNORMAL_HR_LATEST_TIME", "getKEY_ABNORMAL_HR_LATEST_TIME", "setKEY_ABNORMAL_HR_LATEST_TIME", "KEY_ABNORMAL_HR_LATEST_TIME$delegate", "KEY_ABNORMAL_SPO2_LATEST_TIME", "getKEY_ABNORMAL_SPO2_LATEST_TIME", "setKEY_ABNORMAL_SPO2_LATEST_TIME", "KEY_ABNORMAL_SPO2_LATEST_TIME$delegate", "setLatestDataTime", "", "relativeUid", "", "latestTime", "setLatestAbnormalHrTime", "setLatestAbnormalSpo2Time", "hasNewData", "", "lastTimeMap", "", "thisLatestTime", "hasNewRelativeData", "hasNewAbnormalHr", "hasNewAbnormalSpo2", "getLastLatestDataTime", "", "getLastLatestAbnormalHrTime", "getLastLatestAbnormalSpo2Time", "getAllUserLatestTime", "value", "TimeValueModel", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRelativeDataPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeDataPreference.kt\ncom/xiaomi/fit/fitness/export/sp/RelativeDataPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,121:1\n140#2:122\n140#2:123\n140#2:124\n*S KotlinDebug\n*F\n+ 1 RelativeDataPreference.kt\ncom/xiaomi/fit/fitness/export/sp/RelativeDataPreference\n*L\n13#1:122\n19#1:123\n25#1:124\n*E\n"})
public final class RelativeDataPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RelativeDataPreference.class, "KEY_DATA_LATEST_TIME", "getKEY_DATA_LATEST_TIME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RelativeDataPreference.class, "KEY_ABNORMAL_HR_LATEST_TIME", "getKEY_ABNORMAL_HR_LATEST_TIME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RelativeDataPreference.class, "KEY_ABNORMAL_SPO2_LATEST_TIME", "getKEY_ABNORMAL_SPO2_LATEST_TIME()Ljava/lang/String;", 0))};

    @NotNull
    public static final RelativeDataPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_ABNORMAL_HR_LATEST_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_ABNORMAL_HR_LATEST_TIME;

    /* JADX INFO: renamed from: KEY_ABNORMAL_SPO2_LATEST_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_ABNORMAL_SPO2_LATEST_TIME;

    /* JADX INFO: renamed from: KEY_DATA_LATEST_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_DATA_LATEST_TIME;

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mGson;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/export/sp/RelativeDataPreference$TimeValueModel;", "", "map", "", "", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeValueModel {

        @NotNull
        private final Map<Long, Long> map;

        public TimeValueModel(@NotNull Map<Long, Long> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimeValueModel copy$default(TimeValueModel timeValueModel, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = timeValueModel.map;
            }
            return timeValueModel.copy(map);
        }

        @NotNull
        public final Map<Long, Long> component1() {
            return this.map;
        }

        @NotNull
        public final TimeValueModel copy(@NotNull Map<Long, Long> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new TimeValueModel(map);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TimeValueModel) && Intrinsics.areEqual(this.map, ((TimeValueModel) other).map);
        }

        @NotNull
        public final Map<Long, Long> getMap() {
            return this.map;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        @NotNull
        public String toString() {
            return "TimeValueModel(map=" + this.map + ")";
        }
    }

    static {
        RelativeDataPreference relativeDataPreference = new RelativeDataPreference();
        INSTANCE = relativeDataPreference;
        mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vgk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RelativeDataPreference.mGson_delegate$lambda$0();
            }
        });
        KEY_DATA_LATEST_TIME = relativeDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fit.fitness.export.sp.RelativeDataPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), "", "key_relative_data_latest_time_map", true);
        KEY_ABNORMAL_HR_LATEST_TIME = relativeDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fit.fitness.export.sp.RelativeDataPreference$special$$inlined$bindToPreferenceField$2
        }.getType(), "", "key_abnormal_hr_latest_time_map", true);
        KEY_ABNORMAL_SPO2_LATEST_TIME = relativeDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fit.fitness.export.sp.RelativeDataPreference$special$$inlined$bindToPreferenceField$3
        }.getType(), "", "key_abnormal_spo2_latest_time_map", true);
    }

    private RelativeDataPreference() {
    }

    private final Map<Long, Long> getAllUserLatestTime(String value) {
        Map<Long, Long> map;
        if (value == null || value.length() == 0) {
            return new LinkedHashMap();
        }
        try {
            TimeValueModel timeValueModel = (TimeValueModel) getMGson().fromJson(value, TimeValueModel.class);
            if (timeValueModel != null && (map = timeValueModel.getMap()) != null) {
                return map;
            }
            return new LinkedHashMap();
        } catch (Exception e) {
            FitnessLogUtils.i("RelativeDataPreference", "getAllUserLatestDataTime(" + value + ")", e);
            return new LinkedHashMap();
        }
    }

    private final String getKEY_ABNORMAL_HR_LATEST_TIME() {
        return (String) KEY_ABNORMAL_HR_LATEST_TIME.getValue(this, $$delegatedProperties[1]);
    }

    private final String getKEY_ABNORMAL_SPO2_LATEST_TIME() {
        return (String) KEY_ABNORMAL_SPO2_LATEST_TIME.getValue(this, $$delegatedProperties[2]);
    }

    private final String getKEY_DATA_LATEST_TIME() {
        return (String) KEY_DATA_LATEST_TIME.getValue(this, $$delegatedProperties[0]);
    }

    private final Gson getMGson() {
        return (Gson) mGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new Gson();
    }

    private final void setKEY_ABNORMAL_HR_LATEST_TIME(String str) {
        KEY_ABNORMAL_HR_LATEST_TIME.setValue(this, $$delegatedProperties[1], str);
    }

    private final void setKEY_ABNORMAL_SPO2_LATEST_TIME(String str) {
        KEY_ABNORMAL_SPO2_LATEST_TIME.setValue(this, $$delegatedProperties[2], str);
    }

    private final void setKEY_DATA_LATEST_TIME(String str) {
        KEY_DATA_LATEST_TIME.setValue(this, $$delegatedProperties[0], str);
    }

    @NotNull
    public final Map<Long, Long> getLastLatestAbnormalHrTime() {
        return getAllUserLatestTime(getKEY_ABNORMAL_HR_LATEST_TIME());
    }

    @NotNull
    public final Map<Long, Long> getLastLatestAbnormalSpo2Time() {
        return getAllUserLatestTime(getKEY_ABNORMAL_SPO2_LATEST_TIME());
    }

    @NotNull
    public final Map<Long, Long> getLastLatestDataTime() {
        return getAllUserLatestTime(getKEY_DATA_LATEST_TIME());
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "relative_care_sp";
    }

    public final boolean hasNewAbnormalHr(long relativeUid, long thisLatestTime) {
        return hasNewData(getLastLatestAbnormalHrTime(), relativeUid, thisLatestTime);
    }

    public final boolean hasNewAbnormalSpo2(long relativeUid, long thisLatestTime) {
        return hasNewData(getLastLatestAbnormalSpo2Time(), relativeUid, thisLatestTime);
    }

    public final boolean hasNewData(@Nullable Map<Long, Long> lastTimeMap, long relativeUid, long thisLatestTime) {
        if (lastTimeMap == null || lastTimeMap.isEmpty() || !lastTimeMap.containsKey(Long.valueOf(relativeUid))) {
            return thisLatestTime > 0;
        }
        Long l = lastTimeMap.get(Long.valueOf(relativeUid));
        Intrinsics.checkNotNull(l);
        return thisLatestTime > l.longValue();
    }

    public final boolean hasNewRelativeData(long relativeUid, long thisLatestTime) {
        return hasNewData(getLastLatestDataTime(), relativeUid, thisLatestTime);
    }

    public final void setLatestAbnormalHrTime(long relativeUid, long latestTime) {
        Map<Long, Long> lastLatestAbnormalHrTime = getLastLatestAbnormalHrTime();
        if (hasNewData(lastLatestAbnormalHrTime, relativeUid, latestTime)) {
            lastLatestAbnormalHrTime.put(Long.valueOf(relativeUid), Long.valueOf(latestTime));
            setKEY_ABNORMAL_HR_LATEST_TIME(getMGson().toJson(new TimeValueModel(lastLatestAbnormalHrTime)));
        }
    }

    public final void setLatestAbnormalSpo2Time(long relativeUid, long latestTime) {
        Map<Long, Long> lastLatestAbnormalSpo2Time = getLastLatestAbnormalSpo2Time();
        if (hasNewData(lastLatestAbnormalSpo2Time, relativeUid, latestTime)) {
            lastLatestAbnormalSpo2Time.put(Long.valueOf(relativeUid), Long.valueOf(latestTime));
            setKEY_ABNORMAL_SPO2_LATEST_TIME(getMGson().toJson(new TimeValueModel(lastLatestAbnormalSpo2Time)));
        }
    }

    public final void setLatestDataTime(long relativeUid, long latestTime) {
        Map<Long, Long> lastLatestDataTime = getLastLatestDataTime();
        if (hasNewData(lastLatestDataTime, relativeUid, latestTime)) {
            lastLatestDataTime.put(Long.valueOf(relativeUid), Long.valueOf(latestTime));
            setKEY_DATA_LATEST_TIME(getMGson().toJson(new TimeValueModel(lastLatestDataTime)));
        }
    }
}
