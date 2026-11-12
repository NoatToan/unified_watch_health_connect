package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.hw;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dg {
    private static String u(String str) {
        int i;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf >= 0 && (i = iLastIndexOf + 1) < str.length()) {
            str = str.substring(i);
        }
        int length = str.length();
        if (length > 3) {
            return str.substring(0, 3) + Constants.CONFUSION_CHARS;
        }
        if (length <= 1) {
            return Constants.CONFUSION_CHARS;
        }
        return str.substring(0, length - 1) + Constants.CONFUSION_CHARS;
    }

    private static String t(String str) {
        StringBuilder sb = new StringBuilder();
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (scheme != null) {
            sb.append(scheme);
            sb.append("://");
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = URLUtil.isNetworkUrl(str) ? m(str) : uri.getHost();
        } else {
            sb.append("******/");
        }
        if (lastPathSegment != null) {
            int length = lastPathSegment.length();
            if (length > 3) {
                sb.append((CharSequence) lastPathSegment, 0, 3);
            } else if (length > 1) {
                sb.append((CharSequence) lastPathSegment, 0, length - 1);
            }
        }
        sb.append(Constants.CONFUSION_CHARS);
        return sb.toString();
    }

    public static String s(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            URI uriCreate = URI.create(str);
            if (uriCreate != null && uriCreate.getHost() != null) {
                return (uriCreate.getScheme() + "://" + uriCreate.getHost()).toLowerCase(Locale.ENGLISH);
            }
            return null;
        } catch (Throwable th) {
            hw.c("StringUtils", "get url host err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static boolean r(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^[0-9\\*\\+\\-\\.]*$", str) && str.length() < 100;
    }

    public static boolean q(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^[0-9]+,[0-9]+$", str) && str.length() < 100;
    }

    public static String p(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.length() > 100) {
                str = str.substring(0, 100);
            }
            return q.a(str.getBytes("UTF-8"));
        } catch (Throwable th) {
            hw.c("StringUtils", "formatInput Exception: %s", th.getClass().getSimpleName());
            return "";
        }
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return q.a(str.getBytes("UTF-8"));
        } catch (Throwable th) {
            hw.c("StringUtils", "base64Encode Exception: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static String n(String str) {
        return TextUtils.isEmpty(str) ? str : str.toUpperCase(Locale.ENGLISH);
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (!URLUtil.isNetworkUrl(str)) {
                hw.c("StringUtils", "url don't starts with http or https");
                return null;
            }
            if (str.contains("{")) {
                str = str.replaceAll("\\{", "");
            }
            if (str.contains("}")) {
                str = str.replaceAll("\\}", "");
            }
            return new URI(str).getHost();
        } catch (URISyntaxException e) {
            hw.d("StringUtils", "getHostByURI error : " + e.getClass().getSimpleName());
            return null;
        }
    }

    public static boolean l(String str) {
        if (str != null) {
            return str.startsWith(Scheme.HTTP.toString()) || str.startsWith(Scheme.HTTPS.toString());
        }
        return false;
    }

    public static Long k(String str) {
        if (b(str)) {
            return null;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e) {
            hw.d("StringUtils", "toLong NumberFormatException:" + e.getClass().getSimpleName());
            return null;
        }
    }

    public static Integer j(String str) {
        if (b(str)) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            hw.d("StringUtils", "toInteger NumberFormatException:" + e.getClass().getSimpleName());
            return null;
        }
    }

    public static String i(String str, String str2) {
        return (b(str) || b(str2) || !str.contains(str2)) ? str : str.replace(str2, Constants.PARAM_SERVER_SPLIT);
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        if (length <= 3) {
            if (length > 1) {
                str = str.substring(0, length - 1);
            }
            sb.append(str);
            sb.append(Constants.CONFUSION_CHARS);
        } else {
            int i = (length / 5) + 1;
            String strSubstring = str.substring(0, Math.min(3, i));
            String strSubstring2 = str.substring(length - Math.min(3, i));
            sb.append(strSubstring);
            sb.append(Constants.CONFUSION_CHARS);
            sb.append(strSubstring2);
        }
        return sb.toString();
    }

    public static String h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return str2.lastIndexOf(".") == -1 ? str2 : str2.substring(0, str2.lastIndexOf("."));
        }
        String strReplaceAll = str2.replaceAll("." + str.replace(".java", ""), "");
        int iIndexOf = strReplaceAll.indexOf(SampleEvent.SEPARATOR);
        return iIndexOf != -1 ? strReplaceAll.substring(0, iIndexOf) : strReplaceAll;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.contains("://") ? t(str) : u(str);
    }

    public static boolean g(String str, String str2) {
        return TextUtils.isEmpty(f(str, str2));
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        String strTrim = str.trim();
        return !zIsEmpty ? strTrim.replace(str2, "") : strTrim;
    }

    public static String f(String str) {
        if (b(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            hw.d("StringUtils", "unsupport encoding");
            return null;
        }
    }

    public static boolean e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return TextUtils.equals(str, str2);
    }

    public static String e(String str) {
        String str2;
        if (b(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            str2 = "unsupport encoding";
            hw.d("StringUtils", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "decode error";
            hw.d("StringUtils", str2);
            return null;
        }
    }

    public static boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith(Scheme.HTTP.toString()) && !str.startsWith(Scheme.HTTPS.toString())) {
            return false;
        }
        String[] strArrSplit = str2.split(",");
        String strM = m(str);
        hw.b("StringUtils", "host:" + strM);
        if (TextUtils.isEmpty(strM)) {
            return false;
        }
        return Arrays.asList(strArrSplit).contains(strM);
    }

    public static boolean d(String str) {
        return !b(str);
    }

    public static boolean c(String str) {
        if (str != null) {
            return Objects.equals(str.toLowerCase(Locale.getDefault()), "true") || Objects.equals(str.toLowerCase(Locale.getDefault()), "false");
        }
        return false;
    }

    public static String c(String str, String str2) {
        return (TextUtils.isEmpty(str) || str2 == null || str.lastIndexOf(str2) != str.length() + (-1)) ? str : str.substring(0, str.length() - 1);
    }

    private static Object c(Object obj) {
        if (obj instanceof Bundle) {
            return b((Bundle) obj);
        }
        try {
            return JSONObject.wrap(obj);
        } catch (Throwable th) {
            hw.c("StringUtils", "wrap Exception:" + th.getClass().getSimpleName());
            return JSONObject.NULL;
        }
    }

    public static Integer[] b(JSONArray jSONArray) {
        String[] strArrA = a(jSONArray);
        if (bm.a(strArrA)) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[strArrA.length];
        for (int i = 0; i < strArrA.length; i++) {
            try {
                numArr[i] = Integer.valueOf(Integer.parseInt(strArrA[i]));
            } catch (Throwable unused) {
                numArr[i] = null;
                hw.c("StringUtils", "toIntegerArray exception.");
            }
        }
        return numArr;
    }

    public static boolean b(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static JSONObject b(Bundle bundle) {
        if (bundle == null) {
            return new JSONObject();
        }
        Set<String> setKeySet = bundle.keySet();
        JSONObject jSONObject = new JSONObject();
        for (String str : setKeySet) {
            try {
                jSONObject.put(str, c(bundle.get(str)));
            } catch (Throwable th) {
                hw.c("StringUtils", "converBundleToJson Exception:" + th.getClass().getSimpleName());
            }
        }
        return jSONObject;
    }

    public static List<Integer> b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] strArrSplit = str.split(str2);
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
            } catch (Throwable unused) {
                hw.c("StringUtils", "parse integer list error.");
            }
        }
        return arrayList;
    }

    public static String b(Object obj) {
        return obj == null ? com.huawei.operation.utils.Constants.NULL : "not null";
    }

    public static String[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new String[0];
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    public static boolean a(Set<String> set, String str) {
        if (!bm.a(set) && !TextUtils.isEmpty(str)) {
            return set.contains(str);
        }
        hw.a("StringUtils", "ModelList or ModelName is empty");
        return true;
    }

    public static void a(StringBuilder sb, char c2) {
        int iLastIndexOf;
        if (sb == null || (iLastIndexOf = sb.lastIndexOf(String.valueOf(c2))) == -1 || iLastIndexOf != sb.length() - 1) {
            return;
        }
        sb.deleteCharAt(sb.length() - 1);
    }

    public static List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (!bm.a(list)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strE = e(it.next());
                if (strE != null) {
                    arrayList.add(strE);
                }
            }
        }
        return arrayList;
    }

    public static List<String> a(String str, String str2) {
        return TextUtils.isEmpty(str) ? Collections.EMPTY_LIST : new ArrayList(Arrays.asList(str.split(str2)));
    }

    public static String a(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        if (list != null && !list.isEmpty()) {
            boolean z = true;
            for (String str2 : list) {
                if (!z) {
                    sb.append(str);
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public static String a(Collection<String> collection, String str) {
        StringBuilder sb = new StringBuilder();
        if (collection != null && !collection.isEmpty()) {
            boolean z = true;
            for (String str2 : collection) {
                if (!z) {
                    sb.append(str);
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public static String a(String str, Context context) throws Throwable {
        BufferedReader bufferedReader;
        InputStream inputStreamOpen = context.getAssets().open(str);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line + "\n");
                    } catch (IOException e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        hw.d("StringUtils", "getStringFromAsset, " + e.getClass().getSimpleName());
                        bufferedReader = bufferedReader2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        df.a(bufferedReader2);
                        df.a((Closeable) inputStreamOpen);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
            df.a(bufferedReader);
            df.a((Closeable) inputStreamOpen);
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return b(bundle).toString();
    }

    public static String a(Context context, String str) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str) || context == null) {
            return "";
        }
        String str2 = str + a(context);
        Resources resources = context.getResources();
        try {
            return resources.getString(resources.getIdentifier(str2, "string", context.getPackageName()));
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("getChinaString ");
            sb.append(e.getClass().getSimpleName());
            hw.d("StringUtils", sb.toString());
            return "";
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("getChinaString ");
            sb.append(e.getClass().getSimpleName());
            hw.d("StringUtils", sb.toString());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context, int i, String str, Object... objArr) {
        StringBuilder sb;
        String string;
        Resources resources = context.getResources();
        try {
            if (com.huawei.openalliance.ad.cc.a(context).a()) {
                int identifier = resources.getIdentifier(str + "_zh", "string", context.getPackageName());
                string = objArr != null ? resources.getString(identifier, objArr) : resources.getString(identifier);
            } else {
                string = null;
            }
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("getChinaString ");
            sb.append(e.getClass().getSimpleName());
            hw.d("StringUtils", sb.toString());
            string = null;
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("getChinaString ");
            sb.append(e.getClass().getSimpleName());
            hw.d("StringUtils", sb.toString());
            string = null;
        }
        if (string == null) {
            return (objArr == null || objArr.length <= 0) ? resources.getString(i) : resources.getString(i, objArr);
        }
        return string;
    }

    public static String a(Context context) {
        return (context != null && aa.a(context).b()) ? Constants.TV_SUFFIX : "";
    }

    public static String a(double d) {
        return String.format(Locale.ENGLISH, "%.2f", Double.valueOf(d));
    }

    public static Integer a(String str) {
        try {
            return Integer.valueOf((int) Double.parseDouble(str));
        } catch (Exception e) {
            hw.d("StringUtils", "parseStringToInt ex:" + e.getClass().getSimpleName());
            return null;
        }
    }

    public static Float a(String str, Float f) {
        if (b(str)) {
            return f;
        }
        try {
            return Float.valueOf(str);
        } catch (NumberFormatException e) {
            hw.d("StringUtils", "toFloat NumberFormatException:" + e.getClass().getSimpleName());
            return f;
        }
    }

    public static long a(String str, long j) {
        try {
            return b(str) ? j : Long.parseLong(str);
        } catch (NumberFormatException e) {
            hw.c("StringUtils", "parseLongOrDefault exception: " + e.getClass().getSimpleName());
            return j;
        }
    }

    public static int a(String str, int i) {
        try {
            return b(str) ? i : Integer.parseInt(str);
        } catch (NumberFormatException e) {
            hw.c("StringUtils", "parseIntOrDefault exception: " + e.getClass().getSimpleName());
            return i;
        }
    }
}
