package defpackage;

import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum wg {
    SIMPLIFIED_CHINESE(ServerConstants.NEW_CN_COUNTRY_CODE, "zh", 0, "Hans"),
    TRADITIONAL_CHINESE(ServerConstants.NEW_TW_COUNTRY_CODE, "zh", 1, "Hant"),
    ENGLISH(ServerConstants.NEW_US_TRUE_COUNTRY_CODE, "en", 2),
    SPANISH(ServerConstants.ES_COUNTRY_CODE, "es", 3),
    RUSSIAN(ServerConstants.NEW_RU_COUNTRY_CODE, "ru", 4),
    KOREAN(ServerConstants.NEW_KR_COUNTRY_CODE, "ko", 5),
    FRENCH(ServerConstants.FR_COUNTRY_CODE, "fr", 6),
    GERMAN(ServerConstants.NEW_DE_COUNTRY_CODE, "de", 7),
    INDONESIAN(ServerConstants.ID_COUNTRY_CODE, "id", 8),
    POLISH("PL", "pl", 9),
    ITALIAN(ServerConstants.IT_COUNTRY_CODE, "it", 10),
    JAPANESE("JP", "ja", 11),
    THAI("TH", "th", 12),
    ARABIC("", "ar", 13),
    VIETNAMESE("VN", "vi", 14),
    PORTUGUESE("PT", "pt", 15),
    DUTCH("NL", "nl", 16),
    TURKISH("TR", "tr", 17),
    UKRAINIAN("UA", "uk", 18),
    HEBREW("IL", "he", 19),
    BRAZILIAN_PORTUGUESE(Country.BR, "pt", 20),
    ROMANIAN("", Language.RO, 21),
    CZECH("CZ", Language.CS, 22),
    GREEK("GR", Language.EL, 23),
    Serbian("RS", "sr", 24, "Latn"),
    Catalan(ServerConstants.ES_COUNTRY_CODE, "ca", 25),
    Finnish("FI", "fi", 26),
    Norwegian("NO", "nb", 27),
    Danish("DK", "da", 28),
    Swedish("SE", m.e, 29),
    Hungarian("HU", "hu", 30),
    Malay("", "ms", 31),
    Slovak("SK", "sk", 32),
    Hindi("IN", "hi", 33);

    public String t;
    public String u;
    public int v;
    public String w;

    wg(String str, String str2, int i) {
        this.w = "";
        this.t = str2;
        this.u = str;
        this.v = i;
    }

    public static Locale a(int i) throws Throwable {
        for (wg wgVar : values()) {
            if (i == wgVar.v) {
                return !TextUtils.isEmpty(wgVar.w) ? new Locale.Builder().setLanguage(wgVar.t).setRegion(wgVar.u).setScript(wgVar.w).build() : new Locale(wgVar.t, wgVar.u);
            }
        }
        throw new Throwable("HmLocale: No support for HmLocale found");
    }

    wg(String str, String str2, int i, String str3) {
        this.t = str2;
        this.u = str;
        this.v = i;
        this.w = str3;
    }

    @RequiresApi(api = 26)
    public static Locale a(Locale locale) {
        if (!locale.equals(new Locale("zh", ServerConstants.NEW_TW_COUNTRY_CODE)) && !locale.equals(new Locale("zh", ServerConstants.NEW_CN_COUNTRY_CODE))) {
            try {
                List<Locale.LanguageRange> list = Locale.LanguageRange.parse(locale.toLanguageTag());
                ArrayList arrayList = new ArrayList();
                arrayList.add(Locale.forLanguageTag("zh-CN"));
                arrayList.add(Locale.forLanguageTag("zh-Hans"));
                arrayList.add(Locale.forLanguageTag("zh-SG"));
                arrayList.add(Locale.forLanguageTag("zh-MY"));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Locale.forLanguageTag("zh-Hant"));
                arrayList2.add(Locale.forLanguageTag("zh-TW"));
                arrayList2.add(Locale.forLanguageTag("zh-HK"));
                arrayList2.add(Locale.forLanguageTag("zh-MO"));
                if (Locale.lookup(list, arrayList2) != null) {
                    return new Locale("zh", ServerConstants.NEW_TW_COUNTRY_CODE);
                }
                if (Locale.lookup(list, arrayList) != null) {
                    return new Locale("zh", ServerConstants.NEW_CN_COUNTRY_CODE);
                }
            } catch (Exception e) {
                t5t.d("HmLocale", "LanguageTag: " + locale.toLanguageTag());
                t5t.d("HmLocale", e.toString());
            }
        }
        return locale;
    }
}
