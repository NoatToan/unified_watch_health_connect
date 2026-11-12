package health.compact.a;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class LanguageUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36594c = "com.huawei.hwbasemgr.LanguageUtil";

    private LanguageUtil() {
    }

    public static boolean l(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isChineseSimplifiedLocal() context is null");
            return false;
        }
        Locale locale = context.getResources().getConfiguration().locale;
        if (!MLAsrConstants.LAN_ZH.equalsIgnoreCase(locale.getLanguage())) {
            return false;
        }
        String script = locale.getScript();
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d(f36594c, "isChineseSimplifiedLocal script=", script);
        return TextUtils.isEmpty(script) ? "CN".equalsIgnoreCase(locale.getCountry()) : "Hans".equalsIgnoreCase(script);
    }

    public static boolean f(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isChinese() context is null");
            return false;
        }
        return MLAsrConstants.LAN_ZH.equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean q(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isEnglish() context is null");
            return false;
        }
        return "en".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean d(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isAmerican() context is null");
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "en".equalsIgnoreCase(language) || "en-us".equalsIgnoreCase(language);
    }

    public static boolean n(Context context) {
        if (context != null) {
            return MLAsrConstants.LAN_ZH.equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage()) && "TW".equalsIgnoreCase(context.getResources().getConfiguration().locale.getCountry());
        }
        com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isChineseTaiwan() context is null");
        return false;
    }

    public static boolean al(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isLanguageChinesePeopleUsed() context is null");
            return false;
        }
        if (l(context) || q(context) || n(context)) {
            return true;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        if ((MLAsrConstants.LAN_ZH.equalsIgnoreCase(language) && "HK".equalsIgnoreCase(context.getResources().getConfiguration().locale.getCountry())) || "bo".equalsIgnoreCase(language)) {
            return true;
        }
        return bs(context);
    }

    public static boolean ba(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isRTLLanguage() context is null");
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        if ("ar".equalsIgnoreCase(language) || "iw".equalsIgnoreCase(language) || "he".equalsIgnoreCase(language) || "fa".equalsIgnoreCase(language) || Constants.URDU_LANG.equalsIgnoreCase(language)) {
            return true;
        }
        return "ug".equalsIgnoreCase(language);
    }

    public static boolean u(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isGeTiOrKaLanguage() context is null");
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "ka".equalsIgnoreCase(language) || "bo".equalsIgnoreCase(language) || "kk".equalsIgnoreCase(language);
    }

    public static boolean ag(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isJapaneseLanguage() context is null");
            return false;
        }
        return "ja".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean p(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isDeutschLanguage() context is null");
            return false;
        }
        return "de".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ax(Context context) {
        if (context == null) {
            return false;
        }
        return "fr".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean s(Context context) {
        if (context == null) {
            return false;
        }
        return "et".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean v(Context context) {
        if (context == null) {
            return false;
        }
        return "eu".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean h(Context context) {
        if (context == null) {
            return false;
        }
        return "bg".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bc(Context context) {
        if (context == null) {
            return false;
        }
        return "pl".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean r(Context context) {
        if (context == null) {
            return false;
        }
        return "da".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bb(Context context) {
        if (context == null) {
            return false;
        }
        return "ru".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean af(Context context) {
        if (context == null) {
            return false;
        }
        return "km".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ab(Context context) {
        if (context == null) {
            return false;
        }
        return "ka".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean as(Context context) {
        if (context == null) {
            return false;
        }
        return "ms".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean az(Context context) {
        if (context == null) {
            return false;
        }
        return "pt".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bm(Context context) {
        if (context == null) {
            return false;
        }
        return "th".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bn(Context context) {
        if (context == null) {
            return false;
        }
        return "uk".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean t(Context context) {
        if (context == null) {
            return false;
        }
        return "es".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bp(Context context) {
        if (context == null) {
            return false;
        }
        return "vi".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bl(Context context) {
        if (context == null) {
            return false;
        }
        return "fi".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ac(Context context) {
        if (context == null) {
            return false;
        }
        return "hi".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bd(Context context) {
        if (context == null) {
            return false;
        }
        return "sk".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean br(Context context) {
        if (context == null) {
            return false;
        }
        return Constants.URDU_LANG.equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bg(Context context) {
        if (context == null) {
            return false;
        }
        return "si".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bo(Context context) {
        if (context == null) {
            return false;
        }
        return "bo".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean g(Context context) {
        if (context == null) {
            return false;
        }
        return "my".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ar(Context context) {
        if (context == null) {
            return false;
        }
        return "mk".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean c(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isArabicLanguage() context is null");
            return false;
        }
        return "ar".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean x(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isFarsiLanguage() context is null");
            return false;
        }
        return "fa".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean z(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isHebrewLanguage() context is null");
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "iw".equalsIgnoreCase(language) || "he".equalsIgnoreCase(language);
    }

    public static boolean au(Context context) {
        if (context == null) {
            return false;
        }
        return "nl".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ay(Context context) {
        if (context == null) {
            return false;
        }
        return "ro".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ae(Context context) {
        if (context == null) {
            return false;
        }
        return "kn".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        return "az".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean av(Context context) {
        if (context == null) {
            return false;
        }
        return "nb".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean e(Context context) {
        if (context == null) {
            return false;
        }
        return "be".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean i(Context context) {
        if (context == null) {
            return false;
        }
        return "ca".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean m(Context context) {
        if (context == null) {
            return false;
        }
        return "cs".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean w(Context context) {
        if (context == null) {
            return false;
        }
        return "et".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bh(Context context) {
        if (context == null) {
            return false;
        }
        return "es".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bk(Context context) {
        if (context == null) {
            return false;
        }
        return "tl".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage()) || "fil".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean y(Context context) {
        if (context == null) {
            return false;
        }
        return "gl".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean aa(Context context) {
        if (context == null) {
            return false;
        }
        return "el".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ah(Context context) {
        if (context == null) {
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "in".equalsIgnoreCase(language) || "id".equalsIgnoreCase(language);
    }

    public static boolean ai(Context context) {
        if (context == null) {
            return false;
        }
        return "it".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean be(Context context) {
        return context != null && "es".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage()) && "US".equalsIgnoreCase(context.getResources().getConfiguration().locale.getCountry());
    }

    public static boolean ao(Context context) {
        if (context == null) {
            return false;
        }
        return "ml".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean aq(Context context) {
        if (context == null) {
            return false;
        }
        return "mi".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ap(Context context) {
        if (context == null) {
            return false;
        }
        return "mn".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bf(Context context) {
        if (context == null) {
            return false;
        }
        return "sr".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bi(Context context) {
        if (context == null) {
            return false;
        }
        return "ta".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bt(Context context) {
        if (context == null) {
            return false;
        }
        return "uz".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bq(Context context) {
        if (context == null) {
            return false;
        }
        return "tr".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean o(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isChineseLocal() context is null");
            return false;
        }
        return MLAsrConstants.LAN_ZH.equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean aw(Context context) {
        if (context == null) {
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "ar".equalsIgnoreCase(language) || "as".equalsIgnoreCase(language) || "bn".equalsIgnoreCase(language) || "fa".equalsIgnoreCase(language) || "ne".equalsIgnoreCase(language) || Constants.URDU_LANG.equalsIgnoreCase(language);
    }

    public static boolean at(Context context) {
        if (context == null) {
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "uz".equalsIgnoreCase(language) || "sk".equalsIgnoreCase(language) || "uk".equalsIgnoreCase(language) || "sl".equalsIgnoreCase(language);
    }

    public static boolean am(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isLatvijas() context is null");
            return false;
        }
        return "lv".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean aj(Context context) {
        if (context == null) {
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "sw".equalsIgnoreCase(language) || "swc".equalsIgnoreCase(language);
    }

    public static boolean k(Context context) {
        if (context == null) {
            return false;
        }
        return "hr".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean bs(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isUygurLanguage() context is null");
            return false;
        }
        return "ug".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static String a() {
        String str;
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        String language = "";
        if (!configuration.getLocales().isEmpty()) {
            Locale locale = configuration.getLocales().get(0);
            if (locale == null) {
                com.huawei.hwlogsmodel.LogUtil.j(f36594c, "locale is null");
                return "";
            }
            language = locale.getLanguage();
            String country = locale.getCountry();
            String script = locale.getScript();
            if ("my".equals(language) && "Qaag".equals(script)) {
                country = "ZG";
            }
            if ("Hant".equalsIgnoreCase(script) && !"TW".equalsIgnoreCase(country)) {
                str = "HK";
            } else {
                str = l(BaseApplication.getContext()) ? "CN" : country;
            }
        } else {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "configuration locales is empty");
            str = "";
        }
        if ("fil".equalsIgnoreCase(language)) {
            language = "tl";
        }
        if ("id".equalsIgnoreCase(language)) {
            language = "in";
        }
        if ("he".equalsIgnoreCase(language)) {
            language = "iw";
        }
        return language + "_" + str;
    }

    public static String b(Context context) {
        return CommonUtil.l(context);
    }

    public static String a(Locale locale) {
        return CommonUtil.e(locale);
    }

    public static boolean ad(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isHungarianLanguage() context is null");
            return false;
        }
        return "hu".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean j(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isHungarianLanguage() context is null");
            return false;
        }
        Locale locale = context.getResources().getConfiguration().locale;
        return "my".equals(locale.getLanguage()) && "Qaag".equals(locale.getScript());
    }

    public static boolean bj(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isSwedishLanguage() context is null");
            return false;
        }
        return "sv".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean ak(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isKoreanLanguage() context is null");
            return false;
        }
        return "ko".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
    }

    public static boolean an(Context context) {
        if (context != null) {
            return f(context) || "bo".equalsIgnoreCase(context.getResources().getConfiguration().locale.getLanguage());
        }
        com.huawei.hwlogsmodel.LogUtil.j(f36594c, "isLanguageDomesticUsed() context is null");
        return false;
    }
}
