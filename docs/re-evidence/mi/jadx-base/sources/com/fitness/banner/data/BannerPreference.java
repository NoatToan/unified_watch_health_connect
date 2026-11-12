package com.fitness.banner.data;

import com.fitness.banner.data.BannerPreference;
import com.fitness.banner.export.v2.BannerTimeConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u0019R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/fitness/banner/data/BannerPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "BANNER_TIME_CONFIG", "getBANNER_TIME_CONFIG", "setBANNER_TIME_CONFIG", "(Ljava/lang/String;)V", "BANNER_TIME_CONFIG$delegate", "Lkotlin/properties/ReadWriteProperty;", "mGson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "updateBannerTimeConfig", "", "bannerId", "", "clickTime", "", "closeTime", "(ILjava/lang/Long;Ljava/lang/Long;)V", "getBannerTimeConfig", "Lcom/fitness/banner/export/v2/BannerTimeConfig;", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBannerPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerPreference.kt\ncom/fitness/banner/data/BannerPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,45:1\n135#2,6:46\n*S KotlinDebug\n*F\n+ 1 BannerPreference.kt\ncom/fitness/banner/data/BannerPreference\n*L\n12#1:46,6\n*E\n"})
public final class BannerPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BannerPreference.class, "BANNER_TIME_CONFIG", "getBANNER_TIME_CONFIG()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: BANNER_TIME_CONFIG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty BANNER_TIME_CONFIG;

    @NotNull
    public static final BannerPreference INSTANCE;

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mGson;

    static {
        BannerPreference bannerPreference = new BannerPreference();
        INSTANCE = bannerPreference;
        BANNER_TIME_CONFIG = bannerPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.fitness.banner.data.BannerPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, false);
        mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n02
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerPreference.mGson_delegate$lambda$0();
            }
        });
    }

    private BannerPreference() {
    }

    private final Gson getMGson() {
        return (Gson) mGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new GsonBuilder().enableComplexMapKeySerialization().create();
    }

    @NotNull
    public final String getBANNER_TIME_CONFIG() {
        return (String) BANNER_TIME_CONFIG.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final BannerTimeConfig getBannerTimeConfig(int bannerId) {
        Map linkedHashMap = (Map) getMGson().fromJson(getBANNER_TIME_CONFIG(), new com.google.gson.reflect.TypeToken<Map<Integer, ? extends BannerTimeConfig>>() { // from class: com.fitness.banner.data.BannerPreference$getBannerTimeConfig$map$1
        }.getType());
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        return (BannerTimeConfig) linkedHashMap.get(Integer.valueOf(bannerId));
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "banner_pref";
    }

    public final void setBANNER_TIME_CONFIG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        BANNER_TIME_CONFIG.setValue(this, $$delegatedProperties[0], str);
    }

    public final void updateBannerTimeConfig(int bannerId, @Nullable Long clickTime, @Nullable Long closeTime) {
        if (clickTime == null && closeTime == null) {
            return;
        }
        Map linkedHashMap = (Map) getMGson().fromJson(getBANNER_TIME_CONFIG(), new com.google.gson.reflect.TypeToken<Map<Integer, ? extends BannerTimeConfig>>() { // from class: com.fitness.banner.data.BannerPreference$updateBannerTimeConfig$map$1
        }.getType());
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        }
        Object bannerTimeConfig = linkedHashMap.get(Integer.valueOf(bannerId));
        if (bannerTimeConfig != null) {
            if (clickTime != null) {
                ((BannerTimeConfig) bannerTimeConfig).setClickTimeInSecond(Long.valueOf(clickTime.longValue()));
            }
            if (closeTime != null) {
                ((BannerTimeConfig) bannerTimeConfig).setCloseTimeInSecond(Long.valueOf(closeTime.longValue()));
            }
        } else {
            bannerTimeConfig = new BannerTimeConfig(clickTime, closeTime);
        }
        linkedHashMap.put(Integer.valueOf(bannerId), bannerTimeConfig);
        setBANNER_TIME_CONFIG(getMGson().toJson(linkedHashMap));
    }
}
