package com.xiaomi.fitness.login.export;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.account.api.bean.RegionBean;
import com.xiaomi.fitness.account.api.bean.RegionInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 &2\u00020\u0001:\u0001&J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J@\u0010\t\u001a\u00020\u000626\u0010\n\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\u000bH&J@\u0010\u0010\u001a\u00020\u000626\u0010\n\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\u000bH&J\u0016\u0010\u0011\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H&J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H&J\b\u0010\u0014\u001a\u00020\bH&J\b\u0010\u0015\u001a\u00020\bH&J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bH&J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\bH&J\b\u0010\u001b\u001a\u00020\bH&J\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\u001eH&J$\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u001eH&J\b\u0010%\u001a\u00020\u0006H&¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/login/export/RegionManager;", "", "getCountryList", "", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "switchRegion", "", "region", "", "addRegionChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "removeRegionChangeListener", "addCountryChangeListener", "Lkotlin/Function0;", "removeCountryChangeListener", "getCurrentRegion", "getCurrentCountry", "setCurrentRegion", "setCurrentCountry", "country", "setLocaleCountry", "contry", "getLocalCountry", "findCountry", "predicate", "Lkotlin/Function1;", "", "setUserRegion", "info", "Lcom/xiaomi/fitness/account/api/bean/RegionBean$CountryInfo;", "success", "Lcom/xiaomi/fitness/account/api/bean/RegionInfo;", "reportCountryAndLanguageToServerIfNeed", "Companion", "login-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RegionManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String REGION_IGNORE = "RegionTag:ignore";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/login/export/RegionManager$Companion;", "", "<init>", "()V", "REGION_IGNORE", "", "login-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String REGION_IGNORE = "RegionTag:ignore";

        private Companion() {
        }
    }

    void addCountryChangeListener(@NotNull Function0<Unit> listener);

    void addRegionChangeListener(@NotNull Function2<? super String, ? super String, Unit> listener);

    @Nullable
    CountryInfo findCountry(@NotNull Function1<? super CountryInfo, Boolean> predicate);

    @NotNull
    List<CountryInfo> getCountryList();

    @NotNull
    String getCurrentCountry();

    @NotNull
    String getCurrentRegion();

    @NotNull
    String getLocalCountry();

    void removeCountryChangeListener(@NotNull Function0<Unit> listener);

    void removeRegionChangeListener(@NotNull Function2<? super String, ? super String, Unit> listener);

    void reportCountryAndLanguageToServerIfNeed();

    void setCurrentCountry(@NotNull String country);

    void setCurrentRegion(@NotNull String region);

    void setLocaleCountry(@NotNull String contry);

    void setUserRegion(@NotNull RegionBean.CountryInfo info, @NotNull Function1<? super RegionInfo, Unit> success);

    void switchRegion(@NotNull String region);
}
