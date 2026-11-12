package defpackage;

import android.util.Log;
import com.huawei.openalliance.ad.constant.VastAttribute;

/* JADX INFO: loaded from: classes44.dex */
public class xej {

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f52777b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f52776a = false;
        boolean d = false;
        boolean e = false;

        a() {
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f52778a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f52779c;
        boolean e;

        b() {
        }
    }

    private static void b(char c2, char[] cArr, b bVar, a aVar) {
        int i = aVar.f52777b;
        if (i >= 3 || i < 0) {
            return;
        }
        if (c2 == 'd' && !aVar.f52776a) {
            aVar.f52777b = i + 1;
            cArr[i] = 'd';
            aVar.f52776a = true;
        } else if (bVar.e && !aVar.d) {
            aVar.f52777b = i + 1;
            cArr[i] = 'M';
            aVar.d = true;
        } else {
            if (c2 != 'y' || aVar.e) {
                Log.e("ICU", VastAttribute.ERROR);
                return;
            }
            aVar.f52777b = i + 1;
            cArr[i] = 'y';
            aVar.e = true;
        }
    }

    public static char[] c(String str) {
        char[] cArr = new char[3];
        if (str == null) {
            Log.w("ICU", "getDateFormatOrder method: parms pattern is null");
            return cArr;
        }
        a aVar = new a();
        int length = str.length();
        int iIndexOf = 0;
        while (iIndexOf < length) {
            char cCharAt = str.charAt(iIndexOf);
            b bVarB = b(cCharAt);
            if (bVarB.f52778a) {
                b(cCharAt, cArr, bVarB, aVar);
            } else if (cCharAt == 'G') {
                Log.w("TAG", "ignore");
            } else {
                if (bVarB.f52779c) {
                    Log.w("ICU", "Bad pattern character '" + cCharAt + "' in " + str);
                    return cArr;
                }
                if (cCharAt == '\'') {
                    if (iIndexOf >= str.length() - 1 || str.charAt(iIndexOf + 1) != '\'') {
                        iIndexOf = str.indexOf(39, iIndexOf + 1);
                    }
                    if (iIndexOf == -1) {
                        Log.w("ICU", "Bad quoting in " + str);
                        return cArr;
                    }
                    iIndexOf++;
                } else {
                    Log.w("TAG", "ignore");
                }
            }
            iIndexOf++;
        }
        return cArr;
    }

    private static b b(char c2) {
        boolean z = true;
        boolean z2 = c2 == 'd' || c2 == 'L' || c2 == 'M' || c2 == 'y';
        boolean z3 = c2 == 'L' || c2 == 'M';
        if ((c2 < 'a' || c2 > 'z') && (c2 < 'A' || c2 > 'Z')) {
            z = false;
        }
        b bVar = new b();
        bVar.f52778a = z2;
        bVar.e = z3;
        bVar.f52779c = z;
        return bVar;
    }
}
