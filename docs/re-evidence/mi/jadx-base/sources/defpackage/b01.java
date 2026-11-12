package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.metv.airkan_sdk.exception.CbcKeyLengthException;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class b01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Random f3630a = new Random();

    public static l83 a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 32) {
            try {
                int length = str.length() / 2;
                l83 l83Var = new l83();
                l83Var.d(str.substring(0, length).substring(0, 16));
                l83Var.c(str.substring(length).substring(0, 16));
                return l83Var;
            } catch (CbcKeyLengthException e) {
                ycm.a(e.getMessage());
            }
        }
        return null;
    }

    public static String b(String str, int i, String str2) {
        int length = str2.length();
        int i2 = length - 3;
        int i3 = 0;
        if (str2.charAt(i2) == '=') {
            str2 = str2.substring(0, i2);
            i3 = 3;
        } else {
            int i4 = length - 2;
            if (str2.charAt(i4) == '=') {
                str2 = str2.substring(0, i4);
                i3 = 2;
            } else {
                int i5 = length - 1;
                if (str2.charAt(i5) == '=') {
                    str2 = str2.substring(0, i5);
                    i3 = 1;
                }
            }
        }
        return "device_id=" + str + gv5.CONNECT_STR + "magic=" + i + gv5.CONNECT_STR + "tail=" + i3 + gv5.CONNECT_STR + "encrypt=" + str2;
    }

    public static int c() {
        int iNextInt = f3630a.nextInt(10);
        int iNextInt2 = f3630a.nextInt(10);
        int iNextInt3 = f3630a.nextInt(10);
        int iNextInt4 = f3630a.nextInt(10);
        int iNextInt5 = f3630a.nextInt(10);
        int i = iNextInt5 + 1;
        if (i != 10) {
            iNextInt5 = i;
        }
        int i2 = (iNextInt2 % 2) + (iNextInt3 % 3) + (iNextInt4 % 4) + (iNextInt5 % 5);
        switch (i2) {
            case 0:
            case 1:
            default:
                i2 = 1;
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                i2 = 2;
                break;
            case 3:
            case 5:
            case 7:
                break;
            case 9:
                i2 = 3;
                break;
        }
        return Integer.parseInt("" + i2 + iNextInt5 + iNextInt4 + iNextInt3 + iNextInt2 + iNextInt);
    }

    public static String d(String str) {
        return e().getString(str, "");
    }

    public static SharedPreferences e() {
        sz0.f();
        return sz0.h().getSharedPreferences("airkan_sdk_pref", 0);
    }

    public static byte[] f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[1024];
        for (int i = 0; i < 1000; i++) {
            bArr[i] = bytes[i % length];
        }
        return bArr;
    }

    public static void g(String str, String str2) {
        e().edit().putString(str, str2).apply();
    }
}
