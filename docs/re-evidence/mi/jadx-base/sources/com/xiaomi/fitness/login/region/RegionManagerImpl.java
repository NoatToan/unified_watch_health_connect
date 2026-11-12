package com.xiaomi.fitness.login.region;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.account.api.bean.RegionBean;
import com.xiaomi.fitness.account.api.bean.RegionInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.export.SetUserDataResult;
import com.xiaomi.fitness.login.export.Setting;
import com.xiaomi.fitness.login.preference.RegionSelectPreference;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.login.request.RegionRequest;
import com.xiaomi.fitness.login.request.SetUserDataRequest;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.nzi;
import defpackage.zwh;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150$H\u0016J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0006H\u0002J@\u0010*\u001a\u00020\u000f26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nH\u0016J@\u0010,\u001a\u00020\u000f26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nH\u0016J\u0016\u0010-\u001a\u00020\u000f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u0016\u0010.\u001a\u00020\u000f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\b\u00100\u001a\u00020\u0006H\u0016J\u0010\u00101\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0006H\u0016J\b\u00106\u001a\u00020\u0006H\u0016J\u001e\u00107\u001a\u0004\u0018\u00010\u00152\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020&09H\u0016J$\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u000f09H\u0016J\u0018\u0010?\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006H\u0002J\u0006\u0010B\u001a\u00020\u000fJ\b\u0010C\u001a\u00020\u000fH\u0016J\b\u0010D\u001a\u00020\u0006H\u0002J\b\u0010E\u001a\u00020&H\u0002J\b\u0010F\u001a\u00020\u000fH\u0002R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007RD\u0010\b\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/login/region/RegionManagerImpl;", "Lcom/xiaomi/fitness/login/export/RegionManager;", "<init>", "()V", "countries", "", "", "[Ljava/lang/String;", "mChangeListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "mCountryChangeListeners", "Lkotlin/Function0;", "mLastLocal", "mCountryList", "", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "mLastRegion", "mRegionRequest", "Lcom/xiaomi/fitness/login/request/RegionRequest;", "getMRegionRequest", "()Lcom/xiaomi/fitness/login/request/RegionRequest;", "setMRegionRequest", "(Lcom/xiaomi/fitness/login/request/RegionRequest;)V", "mSetUserDataRequest", "Lcom/xiaomi/fitness/login/request/SetUserDataRequest;", "getMSetUserDataRequest", "()Lcom/xiaomi/fitness/login/request/SetUserDataRequest;", "setMSetUserDataRequest", "(Lcom/xiaomi/fitness/login/request/SetUserDataRequest;)V", "getCountryList", "", "hasReplaceTaiWan", "", "switchRegion", "region", "saveCurrentRegion", "addRegionChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeRegionChangeListener", "addCountryChangeListener", "removeCountryChangeListener", "getCurrentRegion", "getCurrentCountry", "setCurrentRegion", "setCurrentCountry", "country", "setLocaleCountry", "contry", "getLocalCountry", "findCountry", "predicate", "Lkotlin/Function1;", "setUserRegion", "info", "Lcom/xiaomi/fitness/account/api/bean/RegionBean$CountryInfo;", "success", "Lcom/xiaomi/fitness/account/api/bean/RegionInfo;", "notifyChangeListener", "oldRegion", "newRegion", "notifyCountryChangeListener", "reportCountryAndLanguageToServerIfNeed", "getCurtLocaleProfileVal", "localeForActivePkHasChanged", "saveCurrentLocaleToSP", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegionManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionManagerImpl.kt\ncom/xiaomi/fitness/login/region/RegionManagerImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,236:1\n13402#2,2:237\n1010#3,2:239\n1863#3,2:241\n1863#3,2:243\n*S KotlinDebug\n*F\n+ 1 RegionManagerImpl.kt\ncom/xiaomi/fitness/login/region/RegionManagerImpl\n*L\n91#1:237,2\n105#1:239,2\n174#1:241,2\n181#1:243,2\n*E\n"})
public final class RegionManagerImpl implements RegionManager {

    @NotNull
    public static final String CATEGORY_KEY_FOR_LOCALE = "user_region";

    @NotNull
    public static final String LOCALE_REPORTED_SERVER_SEPARATOR = "_";

    @NotNull
    public static final String PROFILE_KEY_FOR_LOCALE = "locale";

    @NotNull
    public static final String TAG = "RegionManagerImpl";

    @Nullable
    private List<CountryInfo> mCountryList;
    public RegionRequest mRegionRequest;
    public SetUserDataRequest mSetUserDataRequest;

    @NotNull
    private final String[] countries = {"EE", "AT", "IE", "AU", "EG", "OM", "AE", "PL", "BG", "PK", Country.BR, "BY", "BE", "PE", ServerConstants.NEW_DE_COUNTRY_CODE, "DK", ServerConstants.NEW_RU_COUNTRY_CODE, ServerConstants.FR_COUNTRY_CODE, "FI", "PH", ServerConstants.NEW_KR_COUNTRY_CODE, "NL", "CA", "CZ", "HR", "KE", "QA", "LT", "LV", "LU", ServerConstants.NEW_US_TRUE_COUNTRY_CODE, "MT", "MX", "MY", "MM", "MA", "NO", "NG", "PT", "SE", "CH", "JP", "SK", "SI", "CY", "SA", "TH", "TR", "UA", "HU", "GR", ServerConstants.NEW_SG_COUNTRY_CODE, ServerConstants.ES_COUNTRY_CODE, "NZ", ServerConstants.GB_COUNTRY_CODE, "IN", ServerConstants.IT_COUNTRY_CODE, ServerConstants.ID_COUNTRY_CODE, "IL", "VN", "IQ", ServerConstants.NEW_HK_COUNTRY_CODE, ServerConstants.NEW_CN_COUNTRY_CODE, ServerConstants.NEW_TW_COUNTRY_CODE, "CL", "RO", "PA", "CO", "CR", "SV", "ZA", "JO", "AR", "LA", "KH", "UY", "EC", "IS", "LI", "KZ", "KW", "BH", "MD", "TN", "RS", "BD", "NP", "MO", "BN", "AL", "BA", "UZ", "DZ", "AO", "GH", "CI", "LY", "MR", "PY", "BO", "HN", "GT", "VE", "LB", "DO", "NI", "AZ", "PG", "MK", "BW", "DM", "MZ", "KG", "LK"};

    @NotNull
    private final CopyOnWriteArraySet<Function2<String, String, Unit>> mChangeListeners = new CopyOnWriteArraySet<>();

    @NotNull
    private final CopyOnWriteArraySet<Function0<Unit>> mCountryChangeListeners = new CopyOnWriteArraySet<>();

    @NotNull
    private String mLastLocal = LocaleUtil.getCurrentLocale();

    @NotNull
    private String mLastRegion = getCurrentRegion();

    public RegionManagerImpl() {
        RegionSelectPreference.INSTANCE.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: wbk
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                RegionManagerImpl._init_$lambda$0(this.f37811a, sharedPreferences, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RegionManagerImpl this$0, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("The value of " + str + " has been change", new Object[0]);
        if (str != null && str.hashCode() == -1710303174 && str.equals("key_key_current_region")) {
            String currentRegion = this$0.getCurrentRegion();
            if (Intrinsics.areEqual(this$0.mLastRegion, currentRegion)) {
                return;
            }
            this$0.notifyChangeListener(this$0.mLastRegion, currentRegion);
            this$0.mLastRegion = currentRegion;
        }
    }

    private final String getCurtLocaleProfileVal() {
        return LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
    }

    private final boolean hasReplaceTaiWan() {
        String localeCountryByIP = RegionSelectPreference.INSTANCE.getLocaleCountryByIP();
        return localeCountryByIP.length() > 0 && Intrinsics.areEqual(localeCountryByIP, ServerConstants.NEW_TW_COUNTRY_CODE);
    }

    private final boolean localeForActivePkHasChanged() {
        return !Intrinsics.areEqual(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), RegionPreference.INSTANCE.getCURRENT_LOCALE());
    }

    private final void notifyChangeListener(String oldRegion, String newRegion) {
        Logger.i("Region is changed from " + oldRegion + " to " + newRegion, new Object[0]);
        Iterator<T> it = this.mChangeListeners.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(oldRegion, newRegion);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportCountryAndLanguageToServerIfNeed$lambda$6(RegionManagerImpl this$0, SetUserDataResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "reportCountryAndLanguageToServerIfNeed success=" + it.getSuccess() + ".");
        this$0.saveCurrentLocaleToSP();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportCountryAndLanguageToServerIfNeed$lambda$7(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "reportCountryAndLanguageToServerIfNeed failed. error code=" + it.getErrorCode() + " message=" + it.getErrorCode() + ".");
        return Unit.INSTANCE;
    }

    private final void saveCurrentLocaleToSP() {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.setCURRENT_LOCALE(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null));
        Logger.i(TAG, "saveCurrentLocaleToSP RegionPreference.CURRENT_LOCALE=" + regionPreference.getCURRENT_LOCALE());
    }

    private final void saveCurrentRegion(String region) {
        RegionSelectPreference.INSTANCE.setCurrentRegion(region);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUserRegion$lambda$3(RegionBean.CountryInfo info, ApiException it) {
        Intrinsics.checkNotNullParameter(info, "$info");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "setUserRegion " + info + " error:" + it);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void addCountryChangeListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mCountryChangeListeners.add(listener);
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void addRegionChangeListener(@NotNull Function2<? super String, ? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.add(listener);
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    @Nullable
    public CountryInfo findCountry(@NotNull Function1<? super CountryInfo, Boolean> predicate) {
        Object next;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<T> it = getCountryList().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (predicate.invoke2(next).booleanValue()) {
                return (CountryInfo) next;
            }
        }
        next = null;
        return (CountryInfo) next;
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    @NotNull
    public List<CountryInfo> getCountryList() {
        CountryInfo countryInfo;
        if (this.mCountryList != null) {
            if (Intrinsics.areEqual(this.mLastLocal, LocaleUtil.getCurrentLocale())) {
                List<CountryInfo> list = this.mCountryList;
                Intrinsics.checkNotNull(list);
                return list;
            }
            List<CountryInfo> list2 = this.mCountryList;
            Intrinsics.checkNotNull(list2);
            list2.clear();
            this.mCountryList = null;
            this.mLastLocal = LocaleUtil.getCurrentLocale();
        }
        this.mCountryList = new ArrayList();
        Resources resources = ApplicationExtKt.getApplication().getResources();
        for (String str : this.countries) {
            int identifier = resources.getIdentifier("country_or_region_" + str, "string", ApplicationExtKt.getApplication().getPackageName());
            if (identifier == 0) {
                String strC = zwh.c(str);
                Intrinsics.checkNotNullExpressionValue(strC, "getPingYin(...)");
                String upperCase = strC.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                countryInfo = new CountryInfo(str, str, upperCase);
            } else {
                String string = resources.getString(identifier);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String strC2 = zwh.c(string);
                Intrinsics.checkNotNullExpressionValue(strC2, "getPingYin(...)");
                String upperCase2 = strC2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                countryInfo = new CountryInfo(string, str, upperCase2);
            }
            if (Intrinsics.areEqual(countryInfo.getName(), ServerConstants.NEW_TW_COUNTRY_CODE) && hasReplaceTaiWan()) {
                countryInfo.setCountry(resources.getString(nzi.f28589a));
            }
            List<CountryInfo> list3 = this.mCountryList;
            Intrinsics.checkNotNull(list3);
            list3.add(countryInfo);
        }
        List<CountryInfo> list4 = this.mCountryList;
        Intrinsics.checkNotNull(list4);
        if (list4.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list4, new Comparator() { // from class: com.xiaomi.fitness.login.region.RegionManagerImpl$getCountryList$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(((CountryInfo) t).getPinyin(), ((CountryInfo) t2).getPinyin());
                }
            });
        }
        List<CountryInfo> list5 = this.mCountryList;
        Intrinsics.checkNotNull(list5);
        return list5;
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    @NotNull
    public String getCurrentCountry() {
        return RegionSelectPreference.INSTANCE.getCurrentCountry();
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    @NotNull
    public String getCurrentRegion() {
        return RegionSelectPreference.INSTANCE.getCurrentRegion();
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    @NotNull
    public String getLocalCountry() {
        return RegionSelectPreference.INSTANCE.getLocalCountry();
    }

    @NotNull
    public final RegionRequest getMRegionRequest() {
        RegionRequest regionRequest = this.mRegionRequest;
        if (regionRequest != null) {
            return regionRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRegionRequest");
        return null;
    }

    @NotNull
    public final SetUserDataRequest getMSetUserDataRequest() {
        SetUserDataRequest setUserDataRequest = this.mSetUserDataRequest;
        if (setUserDataRequest != null) {
            return setUserDataRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSetUserDataRequest");
        return null;
    }

    public final void notifyCountryChangeListener() {
        Logger.i("country is changed", new Object[0]);
        Iterator<T> it = this.mCountryChangeListeners.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void removeCountryChangeListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mCountryChangeListeners.remove(listener);
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void removeRegionChangeListener(@NotNull Function2<? super String, ? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.remove(listener);
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void reportCountryAndLanguageToServerIfNeed() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            List<Setting> listListOf = CollectionsKt__CollectionsJVMKt.listOf(new Setting("locale", getCurtLocaleProfileVal()));
            if (localeForActivePkHasChanged()) {
                getMSetUserDataRequest().setUserGeneralData(CATEGORY_KEY_FOR_LOCALE, listListOf, new Function1() { // from class: tbk
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return RegionManagerImpl.reportCountryAndLanguageToServerIfNeed$lambda$6(this.f34543a, (SetUserDataResult) obj);
                    }
                }, new Function1() { // from class: ubk
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return RegionManagerImpl.reportCountryAndLanguageToServerIfNeed$lambda$7((ApiException) obj);
                    }
                });
                return;
            }
            Logger.i(TAG, "reportCountryAndLanguageToServerIfNeed locale is already reported.CURRENT_LANGUAGE in SP=" + RegionPreference.INSTANCE.getCURRENT_LOCALE());
        }
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void setCurrentCountry(@NotNull String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        RegionSelectPreference.INSTANCE.setCurrentCountry(country);
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void setCurrentRegion(@NotNull String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        RegionSelectPreference.INSTANCE.setCurrentRegion(region);
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void setLocaleCountry(@NotNull String contry) {
        Intrinsics.checkNotNullParameter(contry, "contry");
        RegionSelectPreference.INSTANCE.setLocaleCountry(contry);
    }

    public final void setMRegionRequest(@NotNull RegionRequest regionRequest) {
        Intrinsics.checkNotNullParameter(regionRequest, "<set-?>");
        this.mRegionRequest = regionRequest;
    }

    public final void setMSetUserDataRequest(@NotNull SetUserDataRequest setUserDataRequest) {
        Intrinsics.checkNotNullParameter(setUserDataRequest, "<set-?>");
        this.mSetUserDataRequest = setUserDataRequest;
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void setUserRegion(@NotNull final RegionBean.CountryInfo info, @NotNull Function1<? super RegionInfo, Unit> success) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(success, "success");
        getMRegionRequest().setUserRegion(info, success, new Function1() { // from class: vbk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RegionManagerImpl.setUserRegion$lambda$3(info, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.login.export.RegionManager
    public void switchRegion(@NotNull String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        saveCurrentRegion(region);
    }
}
