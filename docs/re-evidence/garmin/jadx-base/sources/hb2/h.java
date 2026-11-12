package hb2;

import android.content.Context;
import android.text.TextUtils;
import i3.e5;
import java.util.Locale;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes8.dex */
public class h {
    public static Locale a(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static String b() {
        return d(Locale.getDefault());
    }

    public static String c(Context context) {
        String[] strArr = {"ar", "ar_AE", "ar_BH", "ar_DZ", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SD", "ar_SY", "ar_TN", "ar_YE", "be", "be_BY", "bg", "bg_BG", "ca", "ca_ES", "cs", "cs_CZ", "da", "da_DK", "de", "de_AT", "de_CH", "de_DE", "de_GR", "de_LU", "el", "el_CY", "el_GR", "en", "en_AU", "en_CA", "en_GB", "en_IE", "en_IN", "en_MT", "en_NZ", "en_PH", "en_SG", "en_US", "en_ZA", "es", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_CU", "es_DO", "es_EC", "es_ES", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PE", "es_PR", "es_PY", "es_SV", "es_US", "es_UY", "es_VE", "et", "et_EE", "fi", "fi_FI", "fr", "fr_BE", "fr_CA", "fr_CH", "fr_FR", "fr_LU", "ga", "ga_IE", "hi", "hi_IN", "hr", "hr_HR", "hu", "hu_HU", "in", "in_ID", "is", "is_IS", "it", "it_CH", "it_IT", "iw", "iw_IL", "ja", "ja_JP", "ko", "ko_KR", "lt", "lt_LT", "lv", "lv_LV", "mk", "mk_MK", "ms", "ms_MY", "mt", "mt_MT", "nl", "nl_BE", "nl_NL", BooleanUtils.NO, "no_NO", "no_NO_NY", "pl", "pl_PL", "pt", "pt_BR", "pt_PT", "ro", "ro_RO", "ru", "ru_RU", "sk", "sk_SK", "sl", "sl_SI", "sq", "sq_AL", "sr", "sr_BA", "sr_CS", "sr_ME", "sr_RS", "sv", "sv_SE", "th", "th_TH", "tr", "tr_TR", "uk", "uk_UA", "vi", "vi_VN", "zh", "zh_CN", "zh_HK", "zh_SG", "zh_TW"};
        String language = context.getResources().getConfiguration().locale.getLanguage();
        String country = context.getResources().getConfiguration().locale.getCountry();
        language.getClass();
        switch (language) {
            case "he":
                language = "iw";
                break;
            case "id":
                language = "in";
                break;
            case "nb":
                language = BooleanUtils.NO;
                break;
        }
        String strG = e5.g(language, "_", country);
        for (int i14 = 0; i14 < 153; i14++) {
            if (strArr[i14].equals(strG)) {
                return strG;
            }
        }
        for (int i15 = 0; i15 < 153; i15++) {
            if (strArr[i15].equals(language)) {
                return language;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    public static String d(Locale locale) {
        String str = locale.getLanguage() + "_" + locale.getCountry().toUpperCase();
        if (str.equals("zh_HK") || str.equals("zh_MO")) {
            if (locale.getScript().equals("Hans")) {
                str = "zh_CN";
            } else {
                str = "zh_TW";
            }
        } else if (str.equals("zh_SG")) {
            str = "zh_CN";
        }
        return TextUtils.isEmpty(str) ? "en_US" : str;
    }
}
