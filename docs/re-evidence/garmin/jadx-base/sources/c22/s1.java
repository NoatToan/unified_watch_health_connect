package c22;

import android.content.Context;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import java.util.Locale;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/s1;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f23251a = new s1();

    private s1() {
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        if (language == null) {
            return "en-US";
        }
        switch (language.hashCode()) {
            case 3121:
                return !language.equals("ar") ? "en-US" : "ar-AE";
            case 3184:
                return !language.equals("cs") ? "en-US" : "cs-CZ";
            case 3197:
                return !language.equals("da") ? "en-US" : "da-DK";
            case 3201:
                return !language.equals("de") ? "en-US" : "de-DE";
            case 3239:
                return !language.equals("el") ? "en-US" : "el-GR";
            case 3241:
                language.equals("en");
                return "en-US";
            case 3246:
                return !language.equals("es") ? "en-US" : "es-ES";
            case 3267:
                return !language.equals("fi") ? "en-US" : "fi-FI";
            case 3276:
                return !language.equals("fr") ? "en-US" : "fr-FR";
            case 3325:
                return !language.equals("he") ? "en-US" : "he-IL";
            case 3338:
                return !language.equals("hr") ? "en-US" : "hr-HR";
            case 3341:
                return !language.equals("hu") ? "en-US" : "hu-HU";
            case 3355:
                return !language.equals(TtmlNode.ATTR_ID) ? "en-US" : "id-ID";
            case 3365:
                return !language.equals("in") ? "en-US" : "id-ID";
            case 3371:
                return !language.equals("it") ? "en-US" : "it-IT";
            case 3374:
                return !language.equals("iw") ? "en-US" : "he-IL";
            case 3383:
                return !language.equals("ja") ? "en-US" : "ja-JP";
            case 3428:
                return !language.equals("ko") ? "en-US" : "ko-KR";
            case 3494:
                return !language.equals("ms") ? "en-US" : "ms-MY";
            case 3508:
                return !language.equals("nb") ? "en-US" : "nb-NO";
            case 3518:
                return !language.equals("nl") ? "en-US" : "nl-NL";
            case 3521:
                return !language.equals(BooleanUtils.NO) ? "en-US" : "nb-NO";
            case 3580:
                return !language.equals("pl") ? "en-US" : "pl-PL";
            case 3588:
                if (language.equals("pt")) {
                    return p005kotlin.jvm.internal.s.g(locale.getCountry(), "BR") ? "pt-BR" : "pt-PT";
                }
                return "en-US";
            case 3645:
                return !language.equals("ro") ? "en-US" : "ro-RO";
            case 3651:
                return !language.equals("ru") ? "en-US" : "ru-RU";
            case 3672:
                return !language.equals("sk") ? "en-US" : "sk-SK";
            case 3673:
                return !language.equals("sl") ? "en-US" : "sl-SI";
            case 3683:
                return !language.equals("sv") ? "en-US" : "sv-SE";
            case 3700:
                return !language.equals("th") ? "en-US" : "th-TH";
            case 3710:
                return !language.equals("tr") ? "en-US" : "tr-TR";
            case 3763:
                return !language.equals("vi") ? "en-US" : "vi-VN";
            case 3886:
                if (!language.equals("zh")) {
                    return "en-US";
                }
                String country = locale.getCountry();
                if (country != null) {
                    int iHashCode = country.hashCode();
                    if (iHashCode != 2155) {
                        if (iHashCode != 2307) {
                            if (iHashCode != 2466) {
                                if (iHashCode != 2644) {
                                    if (iHashCode == 2691 && country.equals("TW")) {
                                        return "zh-TW";
                                    }
                                } else if (country.equals("SG")) {
                                    return "zh-CN";
                                }
                            } else if (country.equals("MO")) {
                                return "zh-TW";
                            }
                        } else if (country.equals("HK")) {
                            return "zh-TW";
                        }
                    } else if (country.equals("CN")) {
                        return "zh-CN";
                    }
                }
                return p005kotlin.jvm.internal.s.g(locale.getScript(), "Hans") ? "zh-CN" : "zh-TW";
            default:
                return "en-US";
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001b A[PHI: r1
      0x001b: PHI (r1v6 java.lang.String) = (r1v4 java.lang.String), (r1v7 java.lang.String) binds: [B:11:0x002e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static final String b(Locale locale) {
        String str;
        locale.getClass();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (p005kotlin.jvm.internal.s.g(language, "pt")) {
            str = "BR";
            if (p005kotlin.jvm.internal.s.g(country, "BR")) {
                country = str;
            } else {
                country = "PT";
            }
        } else if (p005kotlin.jvm.internal.s.g(language, "zh")) {
            str = "CN";
            if (p005kotlin.jvm.internal.s.g(country, "CN")) {
                country = str;
            } else {
                country = "TW";
            }
        }
        return e5.g(language, "-", country);
    }

    public static String c(Context context) {
        context.getClass();
        Locale localeA = hb2.h.a(context);
        String language = localeA.getLanguage();
        if (lg.d.A(localeA)) {
            language = "nb";
        } else if (p005kotlin.jvm.internal.s.g(localeA.getLanguage(), TtmlNode.ATTR_ID) || p005kotlin.jvm.internal.s.g(localeA.getLanguage(), "in")) {
            language = "in";
        } else if (p005kotlin.jvm.internal.s.g(language, "zh")) {
            language = hb2.h.d(localeA);
        } else if (p005kotlin.jvm.internal.s.g(language, "pt") && p005kotlin.jvm.internal.s.g(localeA.getCountry(), "BR")) {
            language = "pt_BR";
        }
        language.getClass();
        String upperCase = language.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static String d(Locale locale) {
        String language = locale.getLanguage();
        if (language == null) {
            return "en-US";
        }
        switch (language.hashCode()) {
            case 3121:
                return !language.equals("ar") ? "en-US" : "ar-AE";
            case 3184:
                return !language.equals("cs") ? "en-US" : "cs-CZ";
            case 3197:
                return !language.equals("da") ? "en-US" : "da-DK";
            case 3239:
                return !language.equals("el") ? "en-US" : "el-GR";
            case 3241:
                if (!language.equals("en")) {
                    return "en-US";
                }
                String country = locale.getCountry();
                if (p005kotlin.jvm.internal.s.g(country, "GB")) {
                    return "en-GB";
                }
                return p005kotlin.jvm.internal.s.g(country, "AU") ? "en-AU" : "en-US";
            case 3246:
                return !language.equals("es") ? "en-US" : "es-ES";
            case 3267:
                return !language.equals("fi") ? "en-US" : "fi-FI";
            case 3276:
                return !language.equals("fr") ? "en-US" : "fr-FR";
            case 3325:
                return !language.equals("he") ? "en-US" : "he-IL";
            case 3338:
                return !language.equals("hr") ? "en-US" : "hr-HR";
            case 3341:
                return !language.equals("hu") ? "en-US" : "hu-HU";
            case 3355:
                return !language.equals(TtmlNode.ATTR_ID) ? "en-US" : "id-ID";
            case 3365:
                return !language.equals("in") ? "en-US" : "id-ID";
            case 3371:
                return !language.equals("it") ? "en-US" : "it-IT";
            case 3374:
                return !language.equals("iw") ? "en-US" : "he-IL";
            case 3383:
                return !language.equals("ja") ? "en-US" : "ja-JP";
            case 3428:
                return !language.equals("ko") ? "en-US" : "ko-KR";
            case 3494:
                return !language.equals("ms") ? "en-US" : "ms-MY";
            case 3508:
                return !language.equals("nb") ? "en-US" : "nb-NO";
            case 3518:
                return !language.equals("nl") ? "en-US" : "nl-NL";
            case 3521:
                return !language.equals(BooleanUtils.NO) ? "en-US" : "nb-NO";
            case 3580:
                return !language.equals("pl") ? "en-US" : "pl-PL";
            case 3588:
                if (language.equals("pt")) {
                    return p005kotlin.jvm.internal.s.g(locale.getCountry(), "BR") ? "pt-BR" : "pt-PT";
                }
                return "en-US";
            case 3645:
                return !language.equals("ro") ? "en-US" : "ro-RO";
            case 3651:
                return !language.equals("ru") ? "en-US" : "ru-RU";
            case 3672:
                return !language.equals("sk") ? "en-US" : "sk-SK";
            case 3673:
                return !language.equals("sl") ? "en-US" : "sl-SI";
            case 3683:
                return !language.equals("sv") ? "en-US" : "sv-SE";
            case 3700:
                return !language.equals("th") ? "en-US" : "th-TH";
            case 3710:
                return !language.equals("tr") ? "en-US" : "tr-TR";
            case 3763:
                return !language.equals("vi") ? "en-US" : "vi-VN";
            case 3886:
                return !language.equals("zh") ? "en-US" : hb2.h.d(locale);
            default:
                return "en-US";
        }
    }

    public static String e(Context context) {
        context.getClass();
        Locale localeA = hb2.h.a(context);
        String language = localeA.getLanguage();
        String country = localeA.getCountry();
        if (p005kotlin.jvm.internal.s.g(language, "nb")) {
            language = BooleanUtils.NO;
        } else if (p005kotlin.jvm.internal.s.g(language, "zh")) {
            language = hb2.h.d(localeA);
        } else if (p005kotlin.jvm.internal.s.g(language, "pt") && p005kotlin.jvm.internal.s.g(country, "BR")) {
            language = "pt_BR";
        }
        language.getClass();
        return language;
    }
}
