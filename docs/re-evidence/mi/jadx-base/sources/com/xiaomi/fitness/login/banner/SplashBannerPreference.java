package com.xiaomi.fitness.login.banner;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.watch.face.edit.utils.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/login/banner/SplashBannerPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "TAG", "<set-?>", "", "LAST_SHOW_TIME", "getLAST_SHOW_TIME", "()J", "setLAST_SHOW_TIME", "(J)V", "LAST_SHOW_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "updateBannerLastShowTime", "", Source.TIME_SECOND, "checkShowSplashScreenEnable", "", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSplashBannerPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashBannerPreference.kt\ncom/xiaomi/fitness/login/banner/SplashBannerPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,26:1\n135#2,6:27\n*S KotlinDebug\n*F\n+ 1 SplashBannerPreference.kt\ncom/xiaomi/fitness/login/banner/SplashBannerPreference\n*L\n13#1:27,6\n*E\n"})
public final class SplashBannerPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SplashBannerPreference.class, "LAST_SHOW_TIME", "getLAST_SHOW_TIME()J", 0))};

    @NotNull
    public static final SplashBannerPreference INSTANCE;

    /* JADX INFO: renamed from: LAST_SHOW_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_SHOW_TIME;

    @NotNull
    public static final String TAG = "SplashBannerPreference";

    static {
        SplashBannerPreference splashBannerPreference = new SplashBannerPreference();
        INSTANCE = splashBannerPreference;
        LAST_SHOW_TIME = splashBannerPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.login.banner.SplashBannerPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, true);
    }

    private SplashBannerPreference() {
    }

    private final long getLAST_SHOW_TIME() {
        return ((Number) LAST_SHOW_TIME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    private final void setLAST_SHOW_TIME(long j) {
        LAST_SHOW_TIME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final boolean checkShowSplashScreenEnable() {
        long last_show_time = getLAST_SHOW_TIME();
        Logger.i(TAG, "getLastBannerLastShowTime " + last_show_time);
        if (last_show_time <= 0) {
            return true;
        }
        return !TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), last_show_time * ((long) 1000));
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app:splash_banner";
    }

    public final void updateBannerLastShowTime(long timeSecond) {
        setLAST_SHOW_TIME(timeSecond);
        Logger.i(TAG, "updateBannerLastShowTime " + timeSecond);
    }
}
