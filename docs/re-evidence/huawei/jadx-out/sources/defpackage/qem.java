package defpackage;

import android.content.Context;
import android.icu.util.ULocale;
import android.util.Log;
import com.huawei.android.provider.SettingsEx;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.taboo.TabooReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class qem {
    public static String b(Locale locale, Locale locale2, Context context) {
        if (a(context, locale) && a(locale, locale2)) {
            return b(locale, locale2);
        }
        String displayCountry = locale.getDisplayCountry(locale2);
        Locale locale3 = new Locale("my", "MM");
        if (locale.getCountry().equals("ZG")) {
            displayCountry = locale3.getDisplayCountry(locale2) + "(Zawgyi)";
        }
        String strB = new TabooReader().b(TabooReader.ParamType.REGION_NAME, locale2, locale.getCountry(), context);
        return strB != null ? strB : displayCountry;
    }

    public static ArrayList<String> b(Context context, Locale locale) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (a(context, locale)) {
            arrayList = d(context, locale);
        } else if (qeo.d(context)) {
            arrayList = c(context, locale);
        } else {
            arrayList.addAll(e(context, locale));
        }
        arrayList.add("EH");
        arrayList.add("XK");
        return arrayList;
    }

    private static String b(Locale locale, Locale locale2) {
        return (String) qeo.c("com.huawei.android.app.LocaleHelperEx", "getDisplayCountry", new Class[]{Locale.class, Locale.class}, new Object[]{locale, locale2});
    }

    private static ArrayList<String> d(Context context, Locale locale) {
        return (ArrayList) qeo.c("com.huawei.android.app.LocaleHelperEx", "getBlackRegions", new Class[]{Context.class, Locale.class}, new Object[]{context, locale});
    }

    private static boolean a(Locale locale, Locale locale2) {
        return qeo.a("com.huawei.android.app.LocaleHelperEx", "getDisplayCountry", new Class[]{Locale.class, Locale.class}, new Object[]{locale, locale2});
    }

    private static ArrayList<String> e(Context context, Locale locale) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, String> mapA = qel.a(context);
        String country = locale.getCountry();
        if (mapA != null && !country.isEmpty()) {
            for (Map.Entry<String, String> entry : mapA.entrySet()) {
                String value = entry.getValue();
                List arrayList2 = new ArrayList();
                if (value.contains(",")) {
                    arrayList2 = Arrays.asList(value.split(","));
                } else {
                    arrayList2.add(value);
                }
                if (arrayList2.contains(country)) {
                    String key = entry.getKey();
                    if (key.contains(",")) {
                        arrayList.addAll(Arrays.asList(key.split(",")));
                    } else {
                        arrayList.add(key);
                    }
                }
            }
        }
        return arrayList;
    }

    private static boolean a(Context context, Locale locale) {
        return qeo.a("com.huawei.android.app.LocaleHelperEx", "getBlackRegions", new Class[]{Context.class, Locale.class}, new Object[]{context, locale});
    }

    private static ArrayList<String> c(Context context, Locale locale) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(b(context));
        ULocale uLocaleAddLikelySubtags = ULocale.addLikelySubtags(ULocale.forLocale(locale));
        String language = uLocaleAddLikelySubtags.getLanguage();
        String script = uLocaleAddLikelySubtags.getScript();
        Iterator<String> it = c(context).iterator();
        while (it.hasNext()) {
            ULocale uLocaleAddLikelySubtags2 = ULocale.addLikelySubtags(ULocale.forLanguageTag(it.next()));
            String language2 = uLocaleAddLikelySubtags2.getLanguage();
            String script2 = uLocaleAddLikelySubtags2.getScript();
            String country = uLocaleAddLikelySubtags2.getCountry();
            if (language.equals(language2) && script.equals(script2)) {
                arrayList.add(country);
            }
        }
        return arrayList;
    }

    private static ArrayList<String> c(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        String strD = d(context);
        if (strD != null) {
            for (String str : strD.split(",")) {
                String strTrim = str.trim();
                if (!strTrim.startsWith("*") && !strTrim.endsWith("*") && strTrim.split(Constants.LINK).length >= 2) {
                    arrayList.add(strTrim);
                }
            }
        }
        return arrayList;
    }

    private static ArrayList<String> b(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        String strD = d(context);
        if (strD != null) {
            for (String str : strD.split(",")) {
                String strTrim = str.trim();
                if (strTrim.startsWith("*")) {
                    arrayList.add(strTrim.split(Constants.LINK)[1]);
                }
            }
        }
        return arrayList;
    }

    private static String d(Context context) {
        String string;
        if (qeo.d(context)) {
            try {
                string = SettingsEx.Systemex.getString(context.getContentResolver(), "black_languages");
            } catch (Throwable unused) {
                Log.e("TabooLocaleHelper", "Could not load default locales");
                string = null;
            }
        } else {
            string = null;
        }
        String strB = new TabooReader().b(TabooReader.ParamType.BLACK_LANG, null, null, context);
        if (strB != null) {
            string = strB;
        }
        return string != null ? string.replace("tl", "fil").replace("_", Constants.LINK) : string;
    }
}
