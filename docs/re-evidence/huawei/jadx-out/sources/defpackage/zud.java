package defpackage;

import android.util.Log;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes20.dex */
public class zud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f54574a = new ThreadLocal<StringBuilder>() { // from class: zud.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f54575b = false;
    private static boolean d = true;

    static {
        try {
            f54575b = Log.isLoggable("HiChain", 3);
            d = Log.isLoggable("HiChain", 4);
        } catch (IllegalArgumentException unused) {
            d("HiChain", "error:getLogField--IllegalArgumentException");
        }
    }

    public static void b(String str, String str2) {
        if (d) {
            Log.i("HiChain", str + ":" + str2);
        }
    }

    public static void a(String str, Object... objArr) {
        if (d) {
            Log.i("HiChain", str + ":" + d(objArr));
        }
    }

    public static void c(String str, String str2) {
        Log.w("HiChain", str + ":" + str2);
    }

    public static void d(String str, String str2) {
        Log.e("HiChain", str + ":" + str2);
    }

    private static String d(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "NULL";
        }
        StringBuilder sbE = e();
        for (Object obj : objArr) {
            sbE.append(obj);
        }
        return sbE.toString().replaceAll("[\t" + System.lineSeparator() + "]", Constants.LINK);
    }

    private static StringBuilder e() {
        StringBuilder sb = f54574a.get();
        sb.setLength(0);
        return sb;
    }
}
