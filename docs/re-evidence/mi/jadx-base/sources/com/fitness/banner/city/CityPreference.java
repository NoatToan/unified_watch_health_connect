package com.fitness.banner.city;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/fitness/banner/city/CityPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "TAG", "<set-?>", "", "CITY_ID", "getCITY_ID", "()J", "setCITY_ID", "(J)V", "CITY_ID$delegate", "Lkotlin/properties/ReadWriteProperty;", "CITY_ID_UPDATE_SECOND", "getCITY_ID_UPDATE_SECOND", "setCITY_ID_UPDATE_SECOND", "CITY_ID_UPDATE_SECOND$delegate", "getCityId", "getCityIdUpdateTimeSecond", "updateCityId", "", "cityId", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCityPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CityPreference.kt\ncom/fitness/banner/city/CityPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,28:1\n135#2,6:29\n135#2,6:35\n*S KotlinDebug\n*F\n+ 1 CityPreference.kt\ncom/fitness/banner/city/CityPreference\n*L\n12#1:29,6\n13#1:35,6\n*E\n"})
public final class CityPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CityPreference.class, "CITY_ID", "getCITY_ID()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CityPreference.class, "CITY_ID_UPDATE_SECOND", "getCITY_ID_UPDATE_SECOND()J", 0))};

    /* JADX INFO: renamed from: CITY_ID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CITY_ID;

    /* JADX INFO: renamed from: CITY_ID_UPDATE_SECOND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CITY_ID_UPDATE_SECOND;

    @NotNull
    public static final CityPreference INSTANCE;

    @NotNull
    private static final String TAG;

    static {
        CityPreference cityPreference = new CityPreference();
        INSTANCE = cityPreference;
        TAG = "CityPreference";
        CITY_ID = cityPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.fitness.banner.city.CityPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, true);
        CITY_ID_UPDATE_SECOND = cityPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.fitness.banner.city.CityPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
    }

    private CityPreference() {
    }

    private final long getCITY_ID() {
        return ((Number) CITY_ID.getValue(this, $$delegatedProperties[0])).longValue();
    }

    private final long getCITY_ID_UPDATE_SECOND() {
        return ((Number) CITY_ID_UPDATE_SECOND.getValue(this, $$delegatedProperties[1])).longValue();
    }

    private final void setCITY_ID(long j) {
        CITY_ID.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    private final void setCITY_ID_UPDATE_SECOND(long j) {
        CITY_ID_UPDATE_SECOND.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final long getCityId() {
        return getCITY_ID();
    }

    public final long getCityIdUpdateTimeSecond() {
        return getCITY_ID_UPDATE_SECOND();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_city_cache";
    }

    public final void updateCityId(long cityId) {
        Logger.i(TAG, "updateCityId " + cityId);
        setCITY_ID(cityId);
        setCITY_ID_UPDATE_SECOND(System.currentTimeMillis() / ((long) 1000));
    }
}
