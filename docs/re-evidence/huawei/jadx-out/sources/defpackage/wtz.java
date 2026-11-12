package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;

/* JADX INFO: loaded from: classes19.dex */
public class wtz {
    public static List<String> a() {
        String[] iSOCountries = Locale.getISOCountries();
        ArrayList<String> arrayListB = qem.b(BaseApplication.getContext(), Locale.getDefault());
        HashSet hashSet = new HashSet(24);
        Iterator<String> it = arrayListB.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(new Locale("en", it.next()).getISO3Country());
            } catch (MissingResourceException e) {
                LogUtil.e("CountryUtils", "MissingResourceException:", e.getMessage());
            }
        }
        HashSet hashSet2 = new HashSet(iSOCountries.length);
        for (String str : iSOCountries) {
            Locale locale = new Locale("en", str);
            String country = locale.getCountry();
            if (!TextUtils.isEmpty(country.trim()) && country.matches("[a-zA-Z]+") && !"ZG".equals(country) && !"SP".equals(country) && CommonUtil.a(locale, locale) != null && !CommonUtil.a(locale, locale).trim().isEmpty()) {
                try {
                    if (hashSet.contains(locale.getISO3Country())) {
                        LogUtil.e("CountryUtils", "getSystemCountry in blackList");
                    } else {
                        hashSet2.add(qem.b(locale, Locale.getDefault(), BaseApplication.getContext()));
                    }
                } catch (MissingResourceException e2) {
                    LogUtil.e("CountryUtils", "MissingResourceException:", e2.getMessage());
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashSet2.size());
        arrayList.addAll(hashSet2);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        return arrayList;
    }

    public static String b(Locale locale) {
        if (locale == null) {
            return "";
        }
        return c(locale.getCountry());
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strB = "";
        for (String str2 : Locale.getISOCountries()) {
            Locale locale = new Locale("", str2);
            if (str.equalsIgnoreCase(locale.getCountry())) {
                strB = qem.b(locale, Locale.getDefault(), BaseApplication.getContext());
                if (!"".equals(strB)) {
                    return strB;
                }
            }
        }
        return strB;
    }

    public static String b(String str) {
        if (str != null && !str.trim().isEmpty()) {
            for (String str2 : Locale.getISOCountries()) {
                if (str.equalsIgnoreCase(qem.b(new Locale("", str2), Locale.getDefault(), BaseApplication.getContext()))) {
                    return str2;
                }
            }
        }
        return "";
    }
}
