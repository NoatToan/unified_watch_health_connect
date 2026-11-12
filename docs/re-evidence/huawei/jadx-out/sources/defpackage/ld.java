package defpackage;

import android.util.Log;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f39936a = false;

    public static void e(String str, Object... objArr) {
        if (f39936a) {
            Log.d("OpenId", d(str, objArr));
        }
    }

    public static String d(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = Constants.LINK;
        }
        sb.append(String.format("[%s] ", str));
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(c(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(",");
                }
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static String c(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }
}
