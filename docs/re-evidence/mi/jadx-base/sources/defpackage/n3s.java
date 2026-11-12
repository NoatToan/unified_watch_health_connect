package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.push.g;

/* JADX INFO: loaded from: classes11.dex */
public class n3s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray<s8s.a<String, String, String>> f27521a = new das(6);

    public static int a(Context context, String str) {
        int i;
        int i2 = 0;
        if (context == null || TextUtils.isEmpty(str)) {
            x9s.o("context | packageName must not be null");
            return 0;
        }
        g.b bVarF = g.f(context, str, true);
        if (bVarF == g.b.ALLOWED) {
            i2 = 1;
        } else if (bVarF == g.b.NOT_ALLOWED) {
            i2 = 2;
        }
        if (s8s.p()) {
            Bundle bundleC = c(str);
            s8s.a<String, String, String> aVar = s8s.i;
            if (bundleC.containsKey(aVar.c)) {
                i2 |= bundleC.getBoolean(aVar.c) ? 4 : 8;
            }
            s8s.a<String, String, String> aVar2 = s8s.g;
            if (bundleC.containsKey(aVar2.c)) {
                i2 |= bundleC.getBoolean(aVar2.c) ? 16 : 32;
            }
            s8s.a<String, String, String> aVar3 = s8s.h;
            if (bundleC.containsKey(aVar3.c)) {
                i2 |= bundleC.getBoolean(aVar3.c) ? 64 : 128;
            }
            s8s.a<String, String, String> aVar4 = s8s.d;
            if (bundleC.containsKey(aVar4.c)) {
                i2 |= bundleC.getBoolean(aVar4.c) ? 256 : 512;
            }
            s8s.a<String, String, String> aVar5 = s8s.e;
            if (bundleC.containsKey(aVar5.c)) {
                i2 |= bundleC.getBoolean(aVar5.c) ? 1024 : 2048;
            }
            s8s.a<String, String, String> aVar6 = s8s.j;
            if (bundleC.containsKey(aVar6.c)) {
                return i2 | (bundleC.getBoolean(aVar6.c) ? 4096 : 8192);
            }
            return i2;
        }
        int iB = b(str, 1);
        if (iB == 1) {
            i2 |= 4;
        } else if (iB == 0) {
            i2 |= 8;
        }
        int iB2 = b(str, 4);
        if (iB2 == 1) {
            i2 |= 16;
        } else if (iB2 == 0) {
            i2 |= 32;
        }
        int iB3 = b(str, 2);
        if (iB3 == 1) {
            i2 |= 64;
        } else if (iB3 == 0) {
            i2 |= 128;
        }
        int iB4 = b(str, 8);
        if (iB4 == 1) {
            i2 |= 256;
        } else if (iB4 == 0) {
            i2 |= 512;
        }
        int iB5 = b(str, 16);
        if (iB5 == 1) {
            i2 |= 1024;
        } else if (iB5 == 0) {
            i2 |= 2048;
        }
        int iB6 = b(str, 32);
        if (iB6 == 1) {
            i = i2 | 4096;
        } else {
            if (iB6 != 0) {
                return i2;
            }
            i = i2 | 8192;
        }
        return i;
    }

    public static int b(String str, int i) {
        return s8s.c(odt.b(), str, null, f27521a.get(i));
    }

    public static Bundle c(String str) {
        return s8s.d(odt.b(), str, null);
    }
}
