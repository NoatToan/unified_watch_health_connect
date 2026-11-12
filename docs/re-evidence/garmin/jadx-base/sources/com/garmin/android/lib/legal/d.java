package com.garmin.android.lib.legal;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Locale;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010Bm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/lib/legal/d;", "", "", "appEULA", "garminTOU", "garminPrivacy", "bicPrivacy", "garminSecurity", "livetrackEULA", "livetrackPrivacy", "activityTrackingAccuracyDisclaimer", "betaTerms", "countryName", "countryNativeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    US("en-US", "en-US", "en-US", "en-US", "en-US", "en", "en", "en-US", "en", "United States", "United States"),
    US_es("es-US", "en-US", "en-US", "en-US", "en-US", "en", "en", "en-US", "en", "United States", "United States"),
    AE_ar("ar", null, "ar-AE", null, "ar-AE", "ar", "ar", "en-US", "ar", "United Arab Emirates", "دولة الإمارات العربية المتحدة"),
    AE_en("en-GB", null, "en-AU", null, "en-AU", "en-GB", "en-GB", "en-GB", "en", "United Arab Emirates", "United Arab Emirates"),
    AL("en-GB", null, "en-AU", null, "en-AU", "en-GB", "en-GB", "en-GB", null, "Albania", "Albania"),
    AM("en-GB", null, "en-AU", null, "en-AU", "en-GB", "en-GB", "en-GB", null, "Armenia", "Armenia"),
    AO("pt-PT", null, "pt-PT", "pt-PT", "pt-PT", "pt", "pt", "pt-PT", "pt-PT", "Angola", "Angola"),
    AR("es", "es-AR", "es-AR", "es-ES", "es-AR", "es", "es", "es-US", "es", "Argentina", "Argentina"),
    AT("de", "de-AT", "de-AT", "de-DE", "de-AT", "de", "de", "de-AT", "de", "Austria", "Österreich"),
    AU("en-GB", "en-AU", "en-AU", null, "en-AU", "en-GB", "en-GB", "en-AU", "en", "Australia", "Australia"),
    AW("nl", null, "nl-NL", "nl-NL", "nl-NL", "nl", "nl", "nl-NL", "nl", "Aruba", "Aruba"),
    AZ("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Azerbaijan", "Azerbaijan"),
    BA("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Bosnia Herzegovina", "Bosnia Herzegovin"),
    BD("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Bangladesh", "গণপ্রজাতন্ত্রী বাংলাদেশ"),
    BE_de("de", null, "de-DE", "de-DE", "de-DE", "de", "de", "de-DE", "de", "Belgium", "Belgien (Deutsch)"),
    BE_fr("fr", "fr-BE", "fr-BE", "fr-FR", "fr-BE", "fr", "fr", "fr-BE", "fr", "Belgium", "Belgique (Français)"),
    BE_nl("nl", "nl-BE", "nl-BE", "nl-NL", "nl-BE", "nl", "nl", "nl-BE", "nl", "Belgium", "België (Nederlands)"),
    BG("bg", null, "bg-BG", "bg-BG", "bg-BG", "bg", "bg", "bg-BG", null, "Bulgaria", "България"),
    BH_ar("ar", null, "ar-BH", null, null, "ar", "ar", "en-US", "ar", "Bahrain", "البحرين"),
    BH_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Bahrain", "Bahrain"),
    BO("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Bolivia", "Bolivia"),
    BR("pt-BR", "pt-BR", "pt-BR", "pt-BR", "pt-BR", "pt", "pt", "pt-BR", "pt-BR", "Brazil", "Brasil"),
    BW("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Botswana", "Botswana"),
    BY("ru", null, "ru-RU", "ru-RU", "ru-RU", "ru", "ru", "ru-RU", "ru", "Belarus", "Белоруссия"),
    BZ("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Belize", "Belize"),
    CA_en("en-GB", "en-CA", "en-CA", null, "en-CA", "en-GB", "en-GB", "en-CA", "en", "Canada", "Canada (English)"),
    CA_fr("ca-FR", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Canada", "Canada (Français)"),
    CA("en-GB", "en-CA", "en-CA", null, "en-CA", "en-GB", "en-GB", "en-CA", "en", "Canada", "Canada (English)"),
    CH_de("de", null, "de-DE", "de-DE", "de-DE", "de", "de", "de-DE", "de", "Switzerland", "Schweiz (Deutsch)"),
    CH_fr("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Switzerland", "Suisse (Français)"),
    CH_it("it", null, "it-IT", "it-IT", "it-IT", "it", "it", "it-IT", "it", "Switzerland", "Svizzera (Italiano)"),
    CI("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Ivory Coast", "Côte d'Ivoire"),
    CL("es", "es-CL", "es-CL", "es-ES", "es-CL", "es", "es", "es-US", "es", "Chile", "Chile"),
    CM_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Cameroon", "Cameroon (English)"),
    CM_fr("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Cameroon", "Cameroun (Français)"),
    CN("zh-hans", null, "zh-CN", "zh-CN", "zh-CN", "zh_CN", "zh_CN", "zh-CN", "zh-hans", "China", "中国大陆 (中文)"),
    CO("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Colombia", "Colombia"),
    CR("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Costa Rica", "Costa Rica"),
    CW_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Curacao", "Curaçao (English)"),
    CW_nl("nl", null, "nl-NL", "nl-NL", "nl-NL", "nl", "nl", "nl-NL", "nl", "Curacao", "Curaçao (Nederlands)"),
    CY_el("el", null, "el-GR", "el-GR", "el-GR", "el", "el", "el-GR", "el", "Cyprus", "Κύπρος (ελληνικά)"),
    CY_tr("tr", null, "tr-TR", "tr-TR", "tr-TR", "tr", "tr", "tr-TR", "tr", "Cyprus", "Kıbrıs (Türkçe)"),
    CZ("cs", null, "cs-CZ", "cs-CZ", "cs-CZ", "cs", "cs", "cs-CZ", "cs", "Czech Republic", "Česká republika"),
    DE("de", "de-DE", "de-DE", "de-DE", "de-DE", "de", "de", "de-DE", "de", "Germany", "Deutschland"),
    DK("da", "da-DK", "da-DK", "da-DK", "da-DK", "da", "da", "da-DK", "da", "Denmark", "Danmark"),
    DO("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Dominican Republic", "República Dominicana"),
    DZ_ar("ar", null, "ar-AE", null, "ar-AE", "ar", "ar", "en-US", "ar", "Algeria", "الجزائر (العَرَبِيةُ)"),
    DZ_fr("fr", "fr-FR", "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Algeria", "Algérie (France)"),
    EC("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Ecuador", "Ecuador"),
    EE("et", null, "et-EE", "et-EE", "et-EE", "et", "et", "en-US", null, "Estonia", "Eesti"),
    EG("ar-EG", null, "ar-AE", null, "ar-AE", "ar", "ar", "en-US", "ar", "United Arab Emirates", "دولة الإمارات العربية المتحدة"),
    EG_ar("ar", null, "ar-AE", null, "ar-AE", "ar", "ar", "en-US", "ar", "Egypt", "مصر"),
    EG_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Egypt", "Egypt"),
    ES("es", "es-ES", "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Spain", "España"),
    FI_fi("fi-FI", "fi-FI", "fi-FI", "fi-FI", "fi-FI", "fi", "fi", "fi-FI", "fi", "Finland", "Suomi (Suomen Kieli)"),
    FI_sv("sv-FI", null, "sv-SE", "sv-SE", "sv-SE", "sv", "sv", "sv-SE", "sv", "Finland", "Finland (Svenska)"),
    FI("sv", null, "sv-SE", "sv-SE", "sv-SE", "sv", "sv", "sv-SE", "sv", "Finland", "Finland (Svenska)"),
    FR("fr", "fr-FR", "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "France", "France"),
    GB("en-GB", "en-GB", "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "United Kingdom", "United Kingdom"),
    GR("el", null, "el-GR", "el-GR", "el-GR", "el", "el", "el-GR", "el", "Greece", "Ελλάδα"),
    GT("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Guatemala", "Guatemala"),
    HK("zh-hans", null, "zh-CN", "zh-CN", "zh-CN", "zh_CN", "zh_CN", "zh-CN", "zh-hans", "Hong Kong", "香港 (中文)"),
    HN("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Honduras", "Honduras"),
    HR("hr", null, "hr-HR", "hr-HR", "hr-HR", "hr", "hr", "hr-HR", "hr", "Croatia", "Hrvatska"),
    HT("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Haiti", "Haiti"),
    HU("hu", null, "hu-HU", "hu-HU", "hu-HU", "hu", "hu", "hu-HU", "hu", "Hungary", "Magyarország"),
    ID_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Indonesia", "Indonesia (English)"),
    ID_id("id-ID", null, "id-ID", "in-ID", "id-ID", "in", "in", "en-US", "in", "Indonesia", "Indonesia (Bahasa Indonesia)"),
    ID_in("in-ID", null, "id-ID", "in-ID", "id-ID", "in", "in", "en-US", "in", "Indonesia", "Indonesia (Bahasa Indonesia)"),
    ID(TtmlNode.ATTR_ID, null, "id-ID", "in-ID", "id-ID", "in", "in", "en-US", "in", "Indonesia", "Indonesia (Bahasa Indonesia)"),
    IE("en-GB", "en-IE", "en-IE", null, "en-IE", "en-GB", "en-GB", "en-IE", "en", "Ireland", "Ireland"),
    IL_he("he-IL", null, "he-IL", "iw-IL", "he-IL", "he", "he", "en-US", "he", "Israel", "ישראל (עברית)"),
    IL_ar("ar", null, "ar-IL", null, null, "ar", "ar", "en-US", "ar", "Israel", "إسرائيل (العربية)"),
    IN_hi("hi", null, "hi-IN", null, null, "hi", "hi", "en-IN", "hi", "India", "भारत (हिंदी)"),
    IN_en("en-GB", null, "en-IN", null, "en-IN", "en-IN", "en-IN", "en-IN", "en", "India", "India (English)"),
    IS("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Iceland", "Iceland"),
    IT("it", "it-IT", "it-IT", "it-IT", "it-IT", "it", "it", "it-IT", "it", "Italy", "Italia"),
    JM("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Jamaica", "Jamaica"),
    JP("ja", null, "ja-JP", "ja-JP", "ja-JP", "ja", "ja", "ja-JP", "ja", "Japan", "日本"),
    KE("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Kenya", "Kenya"),
    KG_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Kyrgyzstan", "Kyrgyzstan (English)"),
    KG_ru("ru", null, "ru-RU", "ru-RU", "ru-RU", "ru", "ru", "ru-RU", "ru", "Kyrgyzstan", "Кыргызстан (русский)"),
    KH("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Cambodia", "Cambodia"),
    KR("ko", null, "ko-KR", "ko-KR", "ko-KR", "ko", "ko", "ko-KR", "ko", "Korea", "한국"),
    KW_ar("ar", null, "ar-KW", null, null, "ar", "ar", "en-US", "ar", "Kuwait", "الكويت\u200e"),
    KW_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Kuwait", "Kuwait"),
    KZ("ru", null, "ru-RU", "ru-RU", "ru-RU", "ru", "ru", "ru-RU", "ru", "Kazakhstan", "Казахстан"),
    LA("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Laos", "ສາທາລະນະລັດ ປະຊາທິປະໄຕ ປະຊາຊົນລາວ"),
    LB("ar", null, "ar-LB", null, null, "ar", "ar", "en-US", "ar", "Lebanon", "لبنان\u200e"),
    LC("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Saint Lucia", "Saint Lucia"),
    LI("de", null, "de-DE", "de-DE", "de-DE", "de", "de", "de-DE", "de", "Liechtenstein", "Liechtenstein"),
    LK("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Sri Lanka", "Sri Lanka"),
    LT("lt", null, "lt-LT", "lt-LT", "lt-LT", "lt", "lt", "en-US", null, "Lithuania", "Lietuva"),
    LU_de("de", null, "de-DE", "de-DE", "de-DE", "de", "de", "de-DE", "de", "Luxembourg", "Luxemburg (Deutsch)"),
    LU_fr("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Luxembourg", "Luxembourg (Français)"),
    LU_lb("lb", null, "lb-LU", null, null, "lu", "lu", "en-US", null, "Luxembourg", "Lëtzebuerg (Lëtzebuergesch)"),
    LV("lv", null, "lv-LV", "lv-LV", "lv-LV", "lv", "lv", "en-US", null, "Latvia", "Latvija"),
    MA_ar("ar", null, "ar-AE", null, "ar-AE", "ar", "ar", "en-US", "ar", "Morocco", "المغرب"),
    MA_fr("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Morocco", "Morocco (Français)"),
    MD("ro", null, "ro-MD", null, null, "ro", "ro", "en-US", null, "Moldova", "Moldova"),
    MG("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Madagascar", "Madagascar (Français)"),
    MK("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Macedonia", "Macedonia"),
    MM("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Myanmar", "ပြည်ထောင်စု သမ္မတ မြန်မာနိုင်ငံတော်"),
    MO_pt("pt-PT", null, "pt-PT", "pt-PT", "pt-PT", "pt", "pt", "pt-PT", "pt-PT", "Macau", "Macau (Português)"),
    MO_zh("zh-hant", null, "zh-CN", "zh-CN", "zh-CN", "zh_CN", "zh_CN", "zh-CN", "zh-hant", "Macau", "澳门 (中文)"),
    MT("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Malta", "Malta"),
    MU("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Maurice", "Maurice"),
    MX("es", "es-MX", "es-MX", "es-ES", "es-MX", "es", "es", "es-US", "es", "Mexico", "México"),
    MY_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Malaysia", "Malaysia (English)"),
    MY_ms("ms-MY", null, "ms-MY", "ms-MY", "ms-MY", "ms", "ms", "en-GB", "ms", "Malaysia", "Malaysia (Melayu)"),
    MY("ms", null, "ms-MY", "ms-MY", "ms-MY", "ms", "ms", "en-GB", "ms", "Malaysia", "Malaysia (Melayu)"),
    MZ("pt-PT", null, "pt-PT", "pt-PT", "pt-PT", "pt", "pt", "pt-PT", "pt-PT", "Mozambique", "Moçambique"),
    NA("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Namibia", "Namibia"),
    NG("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Nigeria", "Nigeria"),
    NI("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Nicaragua", "Nicaragua"),
    NL("nl", "nl-NL", "nl-NL", "nl-NL", "nl-NL", "nl", "nl", "nl-NL", "nl", "Netherlands", "Nederland"),
    NO("nb", "nb-NO", "nb-NO", "nb-NO", "nb-NO", BooleanUtils.NO, BooleanUtils.NO, "nb-NO", "nb", "Norway", "Norge (Bokmål)"),
    NP("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Nepal", "Nepal"),
    NZ("en-GB", "en-NZ", "en-NZ", null, "en-NZ", "en-GB", "en-GB", "en-NZ", "en", "New Zealand", "New Zealand"),
    OM_ar("ar", null, "ar-AE", null, "ar-AE", "ar", "ar", "en-US", "ar", "Oman", "عمان"),
    OM_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Oman", "Oman"),
    PA("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Panama", "Panamá"),
    PE("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Peru", "Perú"),
    PH("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Philippines", "Philippines"),
    PK("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Pakistan", "اسلامی جمہوریہ پاكستان"),
    PL("pl", "pl-PL", "pl-PL", "pl-PL", "pl-PL", "pl", "pl", "pl-PL", "pl", "Poland", "Polska"),
    PT("pt-PT", "pt-PT", "pt-PT", "pt-PT", "pt-PT", "pt", "pt", "pt-PT", "pt-PT", "Portugal", "Portugal"),
    PY("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Paraguay", "Paraguay"),
    QA_ar("ar", null, "ar-QA", null, null, "ar", "ar", "en-US", "ar", "Qatar", "قطر\u200e"),
    QA_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Qatar", "Qatar (English)"),
    RO("ro", null, "ro-RO", "ro-RO", "ro-RO", "ro", "ro", "en-US", null, "Romania", "România"),
    RS_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Serbia", "Serbia (English)"),
    RS_sr("sr", null, "sr-RS", null, null, "sr", "sr", "en-US", null, "Serbia", "Србија (Српски)"),
    RU("ru", null, "ru-RU", "ru-RU", "ru-RU", "ru", "ru", "ru-RU", "ru", "Russia", "Россия"),
    RW_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Rwanda", "Rwanda (English)"),
    RW_fr("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Rwanda", "Rwanda (Français)"),
    SA("ar", null, "ar-SA", null, "ar-SA", "ar", "ar", "en-US", "ar", "Saudi Arabia", "السعودية\u200e"),
    SE("sv", "sv-SE", "sv-SE", "sv-SE", "sv-SE", "sv", "sv", "sv-SE", "sv", "Sweden", "Sverige"),
    SG_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Singapore", "Singapore (English)"),
    SG_ms("ms", null, "ms-MY", "ms-MY", "ms-MY", "ms", "ms", "en-GB", "ms", "Singapore", "Singapura (Melayu)"),
    SG_zh("zh-hans", null, "zh-SG", "zh-CN", "zh-CN", "zh_CN", "zh_CN", "zh-SG", "zh-hans", "Singapore", "新加坡 (中文)"),
    SI("sl", null, "sl-SI", "sl-SI", "sl-SI", "sl", "sl", "sl-SI", "sl", "Slovenia", "Slovenija"),
    SK("sk", null, "sk-SK", "sk-SK", "sk-SK", "sk", "sk", "sk-SK", "sk", "Slovakia", "Slovensko"),
    SN("fr", null, "fr-FR", "fr-FR", "fr-FR", "fr", "fr", "fr-FR", "fr", "Senegal", "le Sénégal"),
    SR("nl", null, "nl-NL", "nl-NL", "nl-NL", "nl", "nl", "nl-NL", "nl", "Suriname", "Suriname"),
    SV("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "El Salvador", "El Salvador"),
    SX_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Saint Martin", "Saint Martin (English)"),
    SX_nl("nl", null, "nl-NL", "nl-NL", "nl-NL", "nl", "nl", "nl-NL", "nl", "Saint Martin", "Sint Maarten (Nederlands)"),
    TH_en("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "en", "Thailand", "Thailand (English)"),
    TH_th("th-TH", null, "th-TH", "th-TH", "th-TH", "th", "th", "th-TH", "th", "Thailand", "ประเทศไทย (ภาษาไทย)"),
    TH("th-TH", null, "th-TH", "th-TH", "th-TH", "th", "th", "th-TH", "th", "Thailand", "ประเทศไทย (ภาษาไทย)"),
    TR("tr", null, "tr-TR", "tr-TR", "tr-TR", "tr", "tr", "tr-TR", "tr", "Turkey", "Türkiye"),
    TT("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Trinidad and Tobago", "Trinidad and Tobago"),
    TW("zh-hant", null, "zh-TW", "zh-TW", "zh-TW", "zh_TW", "zh_TW", "zh-TW", "zh-hant", "Taiwan", "台灣 (中文)"),
    TZ("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Tanzania", "Tanzania"),
    UA_uk("uk", null, "uk-UA", null, "uk-UA", "uk", "uk", "uk-UA", null, "Ukraine", "Україна"),
    UA_ru("ru", null, "ru-RU", "ru-RU", "ru-RU", "ru", "ru", "ru-RU", "ru", "Ukraine", "Украина"),
    UG("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Uganda", "Uganda (English)"),
    UY("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Uruguay", "Uruguay"),
    VE("es", null, "es-ES", "es-ES", "es-ES", "es", "es", "es-US", "es", "Venezuela", "Venezuela"),
    VN_vi("vi-VN", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "vi", "Vietnam", "Vietnam"),
    VN("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", "vi", "Vietnam", "Vietnam"),
    ZA_af("af-ZA", "en-ZA", "en-ZA", null, "en-ZA", "en-GB", "en-GB", "en-ZA", null, "South Africa", "South Africa"),
    ZA("en-GB", "en-ZA", "en-ZA", null, "en-ZA", "en-GB", "en-GB", "en-ZA", null, "South Africa", "South Africa"),
    ZM("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Zambia", "Zambia"),
    ZW("en-GB", null, "en-GB", null, "en-GB", "en-GB", "en-GB", "en-GB", null, "Zimbabwe", "Zimbabwe");


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f49991k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f50051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f50052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f50053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f50054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f50055j;

    static {
        w13.b.g(a());
        f49991k = new a(null);
    }

    d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f50046a = str;
        this.f50047b = str3;
        this.f50048c = str4;
        this.f50049d = str5;
        this.f50050e = str6;
        this.f50051f = str7;
        this.f50052g = str8;
        this.f50053h = str9;
        this.f50054i = str10;
        this.f50055j = str11;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/lib/legal/d$a;", "", "<init>", "()V", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(Locale locale) {
            d dVar;
            d dVar2;
            locale.getClass();
            d[] dVarArrValues = d.values();
            int length = dVarArrValues.length;
            int i14 = 0;
            while (true) {
                dVar = null;
                if (i14 >= length) {
                    dVar2 = null;
                    break;
                }
                dVar2 = dVarArrValues[i14];
                if (s.g(dVar2.name(), locale.getCountry() + "_" + locale.getLanguage())) {
                    break;
                }
                i14++;
            }
            if (dVar2 != null) {
                return dVar2;
            }
            for (d dVar3 : d.values()) {
                if (s.g(dVar3.name(), locale.getCountry())) {
                    dVar = dVar3;
                    break;
                }
            }
            return dVar == null ? d.US : dVar;
        }

        private a() {
        }
    }
}
