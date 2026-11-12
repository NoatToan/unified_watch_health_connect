package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import health.compact.a.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes9.dex */
public class ifp {
    public static float b(float f) {
        return f / 1000.0f;
    }

    public static int e(Object obj) {
        return d(obj, 0);
    }

    public static int d(Object obj, int i) {
        String strC = StringUtils.c(obj);
        if ("".equals(strC)) {
            return i;
        }
        try {
            return Integer.parseInt(strC);
        } catch (NumberFormatException e) {
            LogUtil.c("Suggestion_StrUtil", LogAnonymous.b(e));
            return 0;
        }
    }

    public static Long a(Object obj) {
        String strC = StringUtils.c(obj);
        if (!"".equals(strC)) {
            try {
                return Long.valueOf(strC);
            } catch (NumberFormatException e) {
                LogUtil.c("Suggestion_StrUtil", LogAnonymous.b(e));
            }
        }
        return 0L;
    }

    public static Float c(Object obj) {
        String strC = StringUtils.c(obj);
        if ("".equals(strC)) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(d(strC));
    }

    public static boolean b(Object obj) {
        String strC = StringUtils.c(obj);
        if ("".equals(strC)) {
            return false;
        }
        return Boolean.parseBoolean(strC);
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            LogUtil.c("Suggestion_StrUtil", LogAnonymous.b(e));
            return 0;
        }
    }

    public static float d(String str) {
        if (str == null) {
            return 0.0f;
        }
        try {
            float f = Float.parseFloat(str);
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            LogUtil.c("Suggestion_StrUtil", LogAnonymous.b(e));
            return 0.0f;
        }
    }

    public static String b(String[] strArr) {
        if (strArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String[] a(String str) {
        if (str == null) {
            return new String[0];
        }
        return str.split(",");
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LogUtil.c("Suggestion_StrUtil", LogAnonymous.b(e));
            return str;
        }
    }

    public static String e(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LogUtil.c("Suggestion_StrUtil", LogAnonymous.b(e));
            return str;
        }
    }

    public static TreeSet<Integer> g(String str) {
        if (str == null) {
            return new TreeSet<>();
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (String str2 : str.split(",")) {
            int iE = e((Object) str2);
            if (iE > 0) {
                treeSet.add(Integer.valueOf(iE - 1));
            }
        }
        return treeSet;
    }

    public static String d(float f) {
        return UnitUtil.e(f / 60.0f, 1, 0);
    }

    public static String a(float f) {
        return UnitUtil.e(f, 1, 0);
    }

    public static String d(Context context, int i, Object... objArr) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Suggestion_StrUtil", "getString context == null");
            return "";
        }
        return String.format(context.getApplicationContext().getResources().getString(i), objArr);
    }

    public static String c(int i, int i2, Object... objArr) {
        return BaseApplication.getContext().getResources().getQuantityString(i, i2, objArr);
    }
}
