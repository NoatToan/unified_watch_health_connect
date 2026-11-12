package com.xiaomi.smarthome.miio;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import com.miui.tsmclient.database.DatabaseConstants;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.core.server.internal.util.LocaleUtil;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.R;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import com.xiaomi.smarthome.utils.UpdateWatcher;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0011H\u0002J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/smarthome/miio/LanguageManager;", "Lcom/xiaomi/smarthome/utils/UpdateWatcher;", "Ljava/util/Locale;", "()V", "europeUnLocales", "", "getEuropeUnLocales", "()Ljava/util/Set;", "supportLanguages", "", "Lcom/xiaomi/smarthome/miio/LanguageModel;", "getSupportLanguages", "()Ljava/util/List;", "supportLanguages$delegate", "Lkotlin/Lazy;", "uiLocale", "adjustConfigLayoutDirection", "", q.f13857a, "Landroid/content/res/Configuration;", "locale", "checkIsRTLLanguage", "", "checkIsRTLLanguageInMihome", "checkLocaleSupport", "getSaveLocale", "context", "Landroid/content/Context;", "setLocale", "setSaveLocale", "transformLocale", DatabaseConstants.TABLE_CACHE, "updateLanguage", "resources", "Landroid/content/res/Resources;", "updateLocaleLiveData", "Companion", "base-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LanguageManager extends UpdateWatcher<Locale> {
    public static final int LANGUAGE_AR = 19;
    public static final int LANGUAGE_CS = 22;
    public static final int LANGUAGE_DE = 10;
    public static final int LANGUAGE_DEFAULT = 0;
    public static final int LANGUAGE_EL = 21;
    public static final int LANGUAGE_ES = 6;
    public static final int LANGUAGE_ES_US = 27;
    public static final int LANGUAGE_FI = 31;
    public static final int LANGUAGE_FR = 8;
    public static final int LANGUAGE_HU = 24;
    public static final int LANGUAGE_ID = 11;
    public static final int LANGUAGE_IT = 9;
    public static final int LANGUAGE_IW = 20;
    public static final int LANGUAGE_JA = 14;
    public static final int LANGUAGE_KO = 5;
    public static final int LANGUAGE_NB = 30;
    public static final int LANGUAGE_NL = 16;
    public static final int LANGUAGE_PL = 12;
    public static final int LANGUAGE_PT = 17;
    public static final int LANGUAGE_PT_PT = 28;
    public static final int LANGUAGE_RO = 25;
    public static final int LANGUAGE_RU = 7;
    public static final int LANGUAGE_SK = 29;
    public static final int LANGUAGE_SV = 26;
    public static final int LANGUAGE_TH = 15;
    public static final int LANGUAGE_TR = 18;
    public static final int LANGUAGE_UK = 23;
    public static final int LANGUAGE_US = 3;
    public static final int LANGUAGE_VI = 13;
    public static final int LANGUAGE_ZH = 1;
    public static final int LANGUAGE_ZH_HK = 4;
    public static final int LANGUAGE_ZH_RTW = 2;

    @NotNull
    private static final String LOCALE_COUNTRY = "locale_country";

    @NotNull
    private static final String LOCALE_LANGUAGE = "locale_language";

    @NotNull
    private static final String TAG = "LanguageUtil";

    /* JADX INFO: renamed from: supportLanguages$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportLanguages = LazyKt__LazyJVMKt.lazy(new Function0<List<? extends LanguageModel>>() { // from class: com.xiaomi.smarthome.miio.LanguageManager$supportLanguages$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends LanguageModel> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new LanguageModel(null, 0, R.string.settings_language_default, ""));
            arrayList.add(new LanguageModel(Locale.CHINA, 1, R.string.settings_language_zh, "zh"));
            arrayList.add(new LanguageModel(Locale.TRADITIONAL_CHINESE, 2, R.string.settings_language_zh_rtw, ServerConstants.OLD_TW_COUNTRY_CODE));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_HK, 4, R.string.settings_language_zh_hk, ServerConstants.OLD_HK_COUNTRY_CODE));
            arrayList.add(new LanguageModel(Locale.US, 3, R.string.settings_language_us, "us"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_ES, 6, R.string.settings_language_es, "es"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_RU, 7, R.string.settings_language_ru, "ru"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_KO, 5, R.string.settings_language_ko, "ko"));
            arrayList.add(new LanguageModel(Locale.ITALY, 9, R.string.settings_language_it, "it"));
            arrayList.add(new LanguageModel(Locale.FRANCE, 8, R.string.settings_language_fr, "fr"));
            arrayList.add(new LanguageModel(Locale.GERMANY, 10, R.string.settings_language_de, "de"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_INDONESIA, 11, R.string.settings_language_id, "id"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_POLAND, 12, R.string.settings_language_pl, "pl"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_VIETNAM, 13, R.string.settings_language_vi, "vi"));
            arrayList.add(new LanguageModel(Locale.JAPAN, 14, R.string.settings_language_ja, "ja"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_THAILAND, 15, R.string.settings_language_th, "th"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_NETHERLANDS, 16, R.string.settings_language_nl, "nl"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_BRAZIL, 17, R.string.settings_language_pt, "pt_BR"));
            arrayList.add(new LanguageModel(LocaleUtil.LOCALE_TURKEY, 18, R.string.settings_language_tr, "tr"));
            if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isGooglePlayChannel()) {
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_AR, 19, R.string.settings_language_ar, "ar"));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_IW, 20, R.string.settings_language_iw, "iw"));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_EL, 21, R.string.settings_language_el, Language.EL));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_CS, 22, R.string.settings_language_cs, Language.CS));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_UK, 23, R.string.settings_language_uk, "uk"));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_HU, 24, R.string.settings_language_hu, "hu"));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_RO, 25, R.string.settings_language_ro, Language.RO));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_SV, 26, R.string.settings_language_sv, m.e));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_ES_US, 27, R.string.settings_language_es_us, "es_US"));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_PT_PT, 28, R.string.settings_language_pt_pt, "pt_PT"));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_SK, 29, R.string.settings_language_sk, "sk"));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_NB, 30, R.string.settings_language_nb, "nb"));
                arrayList.add(new LanguageModel(LocaleUtil.LOCALE_FI, 31, R.string.settings_language_fi, "fi"));
            }
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
    });

    @NotNull
    private Locale uiLocale;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final LanguageManager instance = new LanguageManager();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/xiaomi/smarthome/miio/LanguageManager$Companion;", "", "()V", "LANGUAGE_AR", "", "LANGUAGE_CS", "LANGUAGE_DE", "LANGUAGE_DEFAULT", "LANGUAGE_EL", "LANGUAGE_ES", "LANGUAGE_ES_US", "LANGUAGE_FI", "LANGUAGE_FR", "LANGUAGE_HU", "LANGUAGE_ID", "LANGUAGE_IT", "LANGUAGE_IW", "LANGUAGE_JA", "LANGUAGE_KO", "LANGUAGE_NB", "LANGUAGE_NL", "LANGUAGE_PL", "LANGUAGE_PT", "LANGUAGE_PT_PT", "LANGUAGE_RO", "LANGUAGE_RU", "LANGUAGE_SK", "LANGUAGE_SV", "LANGUAGE_TH", "LANGUAGE_TR", "LANGUAGE_UK", "LANGUAGE_US", "LANGUAGE_VI", "LANGUAGE_ZH", "LANGUAGE_ZH_HK", "LANGUAGE_ZH_RTW", "LOCALE_COUNTRY", "", "LOCALE_LANGUAGE", "TAG", "instance", "Lcom/xiaomi/smarthome/miio/LanguageManager;", "getInstance$annotations", "getInstance", "()Lcom/xiaomi/smarthome/miio/LanguageManager;", "base-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final LanguageManager getInstance() {
            return LanguageManager.instance;
        }
    }

    private LanguageManager() {
        Context appContext = MiJiaEnvironment.getAppContext();
        Intrinsics.checkNotNullExpressionValue(appContext, "getAppContext()");
        this.uiLocale = transformLocale(getSaveLocale(appContext));
        setLocale();
    }

    private final void adjustConfigLayoutDirection(Configuration config, Locale locale) {
        if (config.getLayoutDirection() != 1 || checkLocaleSupport(locale)) {
            return;
        }
        if (!checkIsRTLLanguageInMihome(locale)) {
            config.setLayoutDirection(Locale.ENGLISH);
        } else if (checkIsRTLLanguage(locale)) {
            config.setLayoutDirection(locale);
        }
    }

    private final boolean checkIsRTLLanguage(Locale locale) {
        Intrinsics.checkNotNull(locale);
        String language = locale.getLanguage();
        return TextUtils.equals("ar", language) || TextUtils.equals("az", language) || TextUtils.equals("dv", language) || TextUtils.equals("iw", language) || TextUtils.equals("ku", language) || TextUtils.equals("fa", language) || TextUtils.equals("ur", language);
    }

    private final boolean checkIsRTLLanguageInMihome(Locale locale) {
        Intrinsics.checkNotNull(locale);
        return TextUtils.equals("ar", locale.getLanguage());
    }

    private final boolean checkLocaleSupport(Locale locale) {
        Iterator<LanguageModel> it = getSupportLanguages().iterator();
        while (it.hasNext()) {
            if (LocaleUtil.localeEqual(locale, it.next().getLocale())) {
                return true;
            }
        }
        return false;
    }

    private final Set<Locale> getEuropeUnLocales() {
        HashSet hashSet = new HashSet();
        hashSet.add(new Locale("ca", "AD"));
        hashSet.add(new Locale("ca", ServerConstants.FR_COUNTRY_CODE));
        hashSet.add(new Locale("ca", ServerConstants.ES_COUNTRY_CODE));
        hashSet.add(new Locale("ca", ServerConstants.IT_COUNTRY_CODE));
        hashSet.add(new Locale("sq", "AL"));
        hashSet.add(new Locale("sq", "MK"));
        hashSet.add(new Locale("de", "AT"));
        hashSet.add(new Locale("hr", "BA"));
        hashSet.add(new Locale("sr", "BA"));
        hashSet.add(new Locale("nl", "BE"));
        hashSet.add(new Locale("fr", "BE"));
        hashSet.add(new Locale("de", "BE"));
        hashSet.add(new Locale("en", "BE"));
        hashSet.add(new Locale("bg", "BG"));
        hashSet.add(new Locale("be", "BY"));
        hashSet.add(new Locale("de", "CH"));
        hashSet.add(new Locale("fr", "CH"));
        hashSet.add(new Locale("it", "CH"));
        hashSet.add(new Locale("da", "DK"));
        hashSet.add(new Locale("et", "EE"));
        hashSet.add(new Locale("fo", "FO"));
        hashSet.add(new Locale("fr", "GF"));
        hashSet.add(new Locale("da", "GL"));
        hashSet.add(new Locale("kl", "GL"));
        hashSet.add(new Locale("hr", "HR"));
        hashSet.add(new Locale("ga", "IE"));
        hashSet.add(new Locale("en", "IE"));
        hashSet.add(new Locale("en", "IM"));
        hashSet.add(new Locale("is", "IS"));
        hashSet.add(new Locale("en", "JE"));
        hashSet.add(new Locale("de", "LI"));
        hashSet.add(new Locale("lt", "LT"));
        hashSet.add(new Locale("fr", "LU"));
        hashSet.add(new Locale("de", "LU"));
        hashSet.add(new Locale("lv", "LV"));
        hashSet.add(new Locale("fr", "MC"));
        hashSet.add(new Locale("ru", "MD"));
        hashSet.add(new Locale("sr", "ME"));
        hashSet.add(new Locale("mk", "MK"));
        hashSet.add(new Locale("mt", "MT"));
        hashSet.add(new Locale("no", "NO"));
        hashSet.add(new Locale("nn", "NO"));
        hashSet.add(new Locale("sr", "RS"));
        hashSet.add(new Locale("sl", "SI"));
        hashSet.add(new Locale("it", "SM"));
        hashSet.add(new Locale("it", "VA"));
        hashSet.add(new Locale("en", "GG"));
        hashSet.add(new Locale("en", ServerConstants.GB_COUNTRY_CODE));
        hashSet.add(new Locale("gl", ServerConstants.ES_COUNTRY_CODE));
        hashSet.add(new Locale("eu", ServerConstants.ES_COUNTRY_CODE));
        return hashSet;
    }

    @NotNull
    public static final LanguageManager getInstance() {
        return INSTANCE.getInstance();
    }

    private final void setLocale() {
        Locale locale = this.uiLocale;
        if (Intrinsics.areEqual(locale, Locale.getDefault())) {
            return;
        }
        Locale.setDefault(locale);
        LocaleList.setDefault(new LocaleList(locale));
    }

    private final Locale transformLocale(Locale cache) {
        if (cache != null) {
            if (!getEuropeUnLocales().contains(cache) || !LocaleUtil.localeEqual(Locale.US, cache)) {
                return cache;
            }
            Locale LOCALE_EN_GB = LocaleUtil.LOCALE_EN_GB;
            Intrinsics.checkNotNullExpressionValue(LOCALE_EN_GB, "LOCALE_EN_GB");
            return LOCALE_EN_GB;
        }
        Locale SIMPLIFIED_CHINESE = Resources.getSystem().getConfiguration().getLocales().get(0);
        if (SIMPLIFIED_CHINESE == null) {
            SIMPLIFIED_CHINESE = Resources.getSystem().getConfiguration().locale;
        }
        if (SIMPLIFIED_CHINESE == null) {
            SIMPLIFIED_CHINESE = Locale.SIMPLIFIED_CHINESE;
            Intrinsics.checkNotNullExpressionValue(SIMPLIFIED_CHINESE, "SIMPLIFIED_CHINESE");
        }
        if (!getEuropeUnLocales().contains(SIMPLIFIED_CHINESE)) {
            return SIMPLIFIED_CHINESE;
        }
        Locale LOCALE_EN_GB2 = LocaleUtil.LOCALE_EN_GB;
        Intrinsics.checkNotNullExpressionValue(LOCALE_EN_GB2, "LOCALE_EN_GB");
        return LOCALE_EN_GB2;
    }

    @Nullable
    public final Locale getSaveLocale(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0);
        String settingString = SharePrefsManager.getSettingString(sharedPreferences, LOCALE_LANGUAGE, "");
        String settingString2 = SharePrefsManager.getSettingString(sharedPreferences, LOCALE_COUNTRY, "");
        Locale locale = (TextUtils.isEmpty(settingString) || TextUtils.isEmpty(settingString2)) ? null : new Locale(settingString, settingString2);
        Intrinsics.stringPlus("getSaveLocale ", locale);
        return locale;
    }

    @NotNull
    public final List<LanguageModel> getSupportLanguages() {
        return (List) this.supportLanguages.getValue();
    }

    public final void setSaveLocale(@NotNull Context context, @Nullable Locale locale) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0);
        SharePrefsManager.setSettingString(sharedPreferences, LOCALE_LANGUAGE, locale == null ? "" : locale.getLanguage());
        SharePrefsManager.setSettingString(sharedPreferences, LOCALE_COUNTRY, locale != null ? locale.getCountry() : "");
        updateLocaleLiveData(context);
    }

    public final void updateLanguage(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Locale locale = this.uiLocale;
        Configuration config = resources.getConfiguration();
        if (Intrinsics.areEqual(config.locale, locale)) {
            return;
        }
        config.setLocale(locale);
        Intrinsics.checkNotNullExpressionValue(config, "config");
        adjustConfigLayoutDirection(config, locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
    }

    public final void updateLocaleLiveData(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Locale saveLocale = getSaveLocale(context);
        Locale localeTransformLocale = transformLocale(saveLocale);
        Locale locale = this.uiLocale;
        StringBuilder sb = new StringBuilder();
        sb.append("setSaveLocale ");
        sb.append(locale);
        sb.append(' ');
        sb.append(saveLocale);
        sb.append(' ');
        sb.append(localeTransformLocale);
        if (!LocaleUtil.localeEqual(localeTransformLocale, locale)) {
            this.uiLocale = localeTransformLocale;
            dispatchUpdate(localeTransformLocale);
        }
        setLocale();
    }
}
