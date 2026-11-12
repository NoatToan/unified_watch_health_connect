package com.xiaomi.passport.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.mi_connect_sdk.BuildConfig;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http.StatusLine;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes11.dex */
public class CountryCodePhoneNumber {
    private static final String CHINA_COUNTRY_CODE = "+86";
    private static final String PREFIX_COUNTRY_CODE = "+";
    public static final Map<String, Integer> sCountryISO$CodeMap;
    private static SoftReference<Pair<String, List<PhoneNumUtil.CountryPhoneNumData>>> mCountryCodeListHolder = new SoftReference<>(null);
    private static final Pattern sCountryCodePattern = Pattern.compile("^\\+?([0-9]{1,3})");
    private static final Pattern sPhoneNumberPattern = Pattern.compile("([0-9]{4,14})$");

    static {
        HashMap map = new HashMap();
        sCountryISO$CodeMap = map;
        map.put("AF", 93);
        map.put("AL", 355);
        map.put("DZ", 213);
        map.put("AS", 1);
        map.put("AD", 376);
        map.put("AO", 244);
        map.put("AI", 1);
        map.put("AQ", 672);
        map.put("AG", 1);
        map.put("AR", 54);
        map.put("AM", 374);
        map.put("AW", 297);
        map.put("AU", 61);
        map.put("AT", 43);
        map.put("AZ", 994);
        map.put("BS", 1);
        map.put("BH", 973);
        map.put("BD", 880);
        map.put("BB", 1);
        map.put("BY", 375);
        map.put("BE", 32);
        map.put("BZ", 501);
        map.put("BJ", 229);
        map.put("BM", 1);
        map.put("BT", 975);
        map.put("BO", 591);
        map.put("BA", 387);
        map.put("BW", 267);
        map.put(Country.BR, 55);
        map.put("IO", 246);
        map.put("VG", 1);
        map.put("BN", 673);
        map.put("BG", 359);
        map.put("BF", 226);
        map.put("BI", 257);
        map.put("KH", 855);
        map.put("CM", 237);
        map.put("CA", 1);
        map.put("CV", 238);
        map.put("KY", 1);
        map.put("CF", 236);
        map.put("TD", 235);
        map.put("CL", 56);
        map.put(ServerConstants.NEW_CN_COUNTRY_CODE, 86);
        map.put("CX", 61);
        map.put("CC", 61);
        map.put("CO", 57);
        map.put("KM", 269);
        map.put("CK", 682);
        map.put("CR", 506);
        map.put("HR", 385);
        map.put("CU", 53);
        map.put("CW", 599);
        map.put("CY", 357);
        map.put("CZ", 420);
        map.put("CD", 243);
        map.put("DK", 45);
        map.put("DJ", 253);
        map.put("DM", 1);
        map.put("DO", 1);
        map.put("TL", 670);
        map.put("EC", 593);
        map.put("EG", 20);
        map.put("SV", 503);
        map.put("GQ", 240);
        map.put("ER", 291);
        map.put("EE", 372);
        map.put("ET", Integer.valueOf(VibrateModeSetViewModel.DEFAULT_BBJI));
        map.put("FK", 500);
        map.put("FO", 298);
        map.put("FJ", 679);
        map.put("FI", 358);
        map.put(ServerConstants.FR_COUNTRY_CODE, 33);
        map.put("PF", 689);
        map.put("GA", 241);
        map.put("GM", 220);
        map.put("GE", 995);
        map.put(ServerConstants.NEW_DE_COUNTRY_CODE, 49);
        map.put("GH", 233);
        map.put("GI", 350);
        map.put("GR", 30);
        map.put("GL", 299);
        map.put("GD", 1);
        map.put("GU", 1);
        map.put("GT", 502);
        map.put("GG", 44);
        map.put("GN", Integer.valueOf(SportReportBaseParser.ReportType.avgFreq));
        map.put("GW", 245);
        map.put("GY", 592);
        map.put("HT", 509);
        map.put("HN", 504);
        map.put(ServerConstants.NEW_HK_COUNTRY_CODE, 852);
        map.put("HU", 36);
        map.put("IS", 354);
        map.put("IN", 91);
        map.put(ServerConstants.ID_COUNTRY_CODE, 62);
        map.put("IR", 98);
        map.put("IQ", 964);
        map.put("IE", 353);
        map.put("IM", 44);
        map.put("IL", 972);
        map.put(ServerConstants.IT_COUNTRY_CODE, 39);
        map.put("CI", Integer.valueOf(SportReportBaseParser.ReportType.maxFreq));
        map.put("JM", 1);
        map.put("JP", 81);
        map.put("JE", 44);
        map.put("JO", 962);
        map.put("KZ", 7);
        map.put("KE", 254);
        map.put("KI", 686);
        map.put("XK", 383);
        map.put("KW", 965);
        map.put("KG", 996);
        map.put("LA", 856);
        map.put("LV", 371);
        map.put("LB", 961);
        map.put("LS", 266);
        map.put("LR", Integer.valueOf(ErrorCode.ERROR_SP_NOTICE_NOT_READY));
        map.put("LY", 218);
        map.put("LI", 423);
        map.put("LT", Integer.valueOf(BuildConfig.MiConnectVersionBuild));
        map.put("LU", 352);
        map.put("MO", 853);
        map.put("MK", 389);
        map.put("MG", Integer.valueOf(SportSummary.VERSION_105));
        map.put("MW", 265);
        map.put("MY", 60);
        map.put("MV", 960);
        map.put("ML", Integer.valueOf(SportReportBaseParser.ReportType.targetValueNumber));
        map.put("MT", 356);
        map.put("MH", 692);
        map.put("MR", 222);
        map.put("MU", 230);
        map.put("YT", 262);
        map.put("MX", 52);
        map.put("FM", 691);
        map.put("MD", 373);
        map.put("MC", 377);
        map.put("MN", 976);
        map.put("ME", 382);
        map.put("MS", 1);
        map.put("MA", 212);
        map.put("MZ", Integer.valueOf(SportSummary.VERSION_102));
        map.put("MM", 95);
        map.put(NetworkStateUtil.NO_NETWORK, 264);
        map.put("NR", 674);
        map.put("NP", 977);
        map.put("NL", 31);
        map.put("AN", 599);
        map.put("NC", 687);
        map.put("NZ", 64);
        map.put("NI", 505);
        map.put("NE", 227);
        map.put("NG", 234);
        map.put("NU", 683);
        map.put("KP", 850);
        map.put("MP", 1);
        map.put("NO", 47);
        map.put("OM", 968);
        map.put("PK", 92);
        map.put("PW", 680);
        map.put("PS", 970);
        map.put("PA", 507);
        map.put("PG", 675);
        map.put("PY", 595);
        map.put("PE", 51);
        map.put("PH", 63);
        map.put("PN", 64);
        map.put("PL", 48);
        map.put("PT", 351);
        map.put("PR", 1);
        map.put("QA", 974);
        map.put("CG", 242);
        map.put("RE", 262);
        map.put("RO", 40);
        map.put(ServerConstants.NEW_RU_COUNTRY_CODE, 7);
        map.put("RW", 250);
        map.put("BL", 590);
        map.put("SH", 290);
        map.put("KN", 1);
        map.put("LC", 1);
        map.put("MF", 590);
        map.put("PM", 508);
        map.put("VC", 1);
        map.put("WS", 685);
        map.put("SM", 378);
        map.put("ST", 239);
        map.put("SA", 966);
        map.put("SN", 221);
        map.put("RS", 381);
        map.put(BouncyCastleProvider.PROVIDER_NAME, 248);
        map.put("SL", Integer.valueOf(ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE));
        map.put(ServerConstants.NEW_SG_COUNTRY_CODE, 65);
        map.put("SX", 1);
        map.put("SK", Integer.valueOf(StatusLine.HTTP_MISDIRECTED_REQUEST));
        map.put("SI", 386);
        map.put("SB", 677);
        map.put("SO", 252);
        map.put("ZA", 27);
        map.put(ServerConstants.NEW_KR_COUNTRY_CODE, 82);
        map.put("SS", 211);
        map.put(ServerConstants.ES_COUNTRY_CODE, 34);
        map.put("LK", 94);
        map.put("SD", 249);
        map.put("SR", 597);
        map.put("SJ", 47);
        map.put("SZ", 268);
        map.put("SE", 46);
        map.put("CH", 41);
        map.put("SY", 963);
        map.put(ServerConstants.NEW_TW_COUNTRY_CODE, 886);
        map.put("TJ", 992);
        map.put("TZ", 255);
        map.put("TH", 66);
        map.put("TG", 228);
        map.put(ServerConstants.NEW_TK_COUNTRY_CODE, 690);
        map.put("TO", 676);
        map.put("TT", 1);
        map.put("TN", 216);
        map.put("TR", 90);
        map.put("TM", 993);
        map.put("TC", 1);
        map.put("TV", 688);
        map.put("VI", 1);
        map.put("UG", 256);
        map.put("UA", 380);
        map.put("AE", 971);
        map.put(ServerConstants.GB_COUNTRY_CODE, 44);
        map.put(ServerConstants.NEW_US_TRUE_COUNTRY_CODE, 1);
        map.put("UY", 598);
        map.put("UZ", 998);
        map.put("VU", 678);
        map.put("VA", 379);
        map.put("VE", 58);
        map.put("VN", 84);
        map.put("WF", 681);
        map.put("EH", 212);
        map.put("YE", 967);
        map.put("ZM", 260);
        map.put("ZW", 263);
    }

    public static String addPhoneWithCountyCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (!str.startsWith("+")) {
                return "+86 " + str;
            }
            String nationNumberByPhone = getNationNumberByPhone(str);
            return "+" + getCountryCodeByPhone(str) + " " + nationNumberByPhone;
        } catch (NumberParseException e) {
            AccountLogger.log("phonenumber Failed get phone national number, phone:[{}].", str, e);
            return str;
        }
    }

    public static int getCountryCodeAsInt(String str) {
        Integer num = sCountryISO$CodeMap.get(str);
        if (num == null) {
            return 86;
        }
        return num.intValue();
    }

    public static String getCountryCodeAsString(int i) {
        return "+" + i;
    }

    private static String getCountryCodeByPhone(String str) throws NumberParseException {
        return String.valueOf(PhoneNumberUtil.m().Q(str, "").getCountryCode());
    }

    public static List<PhoneNumUtil.CountryPhoneNumData> getCountryCodeOnLocale(String str) {
        Pair<String, List<PhoneNumUtil.CountryPhoneNumData>> pair = mCountryCodeListHolder.get();
        if (pair == null || !TextUtils.equals((CharSequence) pair.first, str)) {
            return null;
        }
        return (List) pair.second;
    }

    public static String getCountryCodePhoneNumber(int i, String str) {
        return String.format("%s%d %s", "+", Integer.valueOf(i), str);
    }

    public static int getDefaultCountryCodeAsInt() {
        return getCountryCodeAsInt(Locale.getDefault().getCountry());
    }

    private static String getNationNumberByPhone(String str) throws NumberParseException {
        return String.valueOf(PhoneNumberUtil.m().Q(str, "").getNationalNumber());
    }

    public static String invalidate(String str, String str2) {
        String strReplace = str.replace(" ", "");
        if (str2.equals(CHINA_COUNTRY_CODE)) {
            return strReplace;
        }
        return str2 + strReplace;
    }

    public static int parseCountryCodeAsInt(String str) {
        String strReplaceAll = str.replaceAll("\\p{C}", "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            return 0;
        }
        Matcher matcher = sCountryCodePattern.matcher(strReplaceAll);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }

    public static String parsePhoneNumber(String str) {
        String strReplaceAll = str.replaceAll("\\p{C}", "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            return "";
        }
        Matcher matcher = sPhoneNumberPattern.matcher(strReplaceAll);
        return !matcher.find() ? "" : matcher.group(1);
    }

    public static void saveCountryCodeOnLocale(List<PhoneNumUtil.CountryPhoneNumData> list, String str) {
        Pair<String, List<PhoneNumUtil.CountryPhoneNumData>> pair = mCountryCodeListHolder.get();
        if (pair == null || !TextUtils.equals((CharSequence) pair.first, str)) {
            mCountryCodeListHolder = new SoftReference<>(new Pair(str, list));
        }
    }
}
