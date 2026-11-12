package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public abstract class cw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20572a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f20573b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SoftReference<byte[]> f20574c;

    private static String g(Context context) {
        final a aVarA = a.a(context);
        String strF = aVarA.f();
        if (!dg.b(strF)) {
            return strF;
        }
        final String strB = b(64);
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cw.1
            @Override // java.lang.Runnable
            public void run() {
                aVarA.f(strB);
            }
        });
        return strB;
    }

    private static byte[] f(Context context) {
        hw.b("SecretUtil", "regenerateWorkKey");
        a.a(context).a("");
        return ar.a(e(context));
    }

    private static String e(Context context) {
        String strB;
        if (context == null) {
            return "";
        }
        synchronized (f20572a) {
            a aVarA = a.a(context);
            String strA = aVarA.a();
            if (strA != null) {
                strB = g.b(strA, d(context));
                if (TextUtils.isEmpty(strB)) {
                }
            }
            strB = a(context, aVarA);
        }
        return strB;
    }

    private static byte[] d(Context context) {
        String str;
        if (context == null) {
            return new byte[0];
        }
        a aVarA = a.a(context);
        try {
            return a(ar.a(c(context)).toCharArray(), ar.a(aVarA.b()));
        } catch (NoSuchAlgorithmException unused) {
            str = "get userRootKey NoSuchAlgorithmException";
            hw.c("SecretUtil", str);
            return null;
        } catch (InvalidKeySpecException unused2) {
            str = "get userRootKey InvalidKeySpecException";
            hw.c("SecretUtil", str);
            return null;
        }
    }

    public static class a {
        private static final byte[] g = new byte[0];
        private static a h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SharedPreferences f20577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SharedPreferences f20578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SharedPreferences f20579c;
        private final byte[] d = new byte[0];
        private final byte[] e = new byte[0];
        private final byte[] f = new byte[0];
        private Context i;

        public void f(String str) {
            synchronized (this.f) {
                this.f20577a.edit().putString("aes_work_key1", str).apply();
            }
        }

        public String f() {
            String string;
            synchronized (this.f) {
                string = this.f20577a.getString("aes_work_key1", "");
            }
            return string;
        }

        public void e(String str) {
            synchronized (this.f) {
                SharedPreferences sharedPreferences = this.f20577a;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("pub_store_door_ks", str).apply();
                }
            }
        }

        public String e() {
            String string;
            synchronized (this.f) {
                SharedPreferences sharedPreferences = this.f20577a;
                string = sharedPreferences == null ? "" : sharedPreferences.getString("pub_store_door_ks", "");
            }
            return string;
        }

        public void d(String str) {
            synchronized (this.e) {
                if (this.f20579c != null) {
                    this.f20579c.edit().putString("read_first_chapter", g.a(str, cw.b(this.i))).apply();
                }
            }
        }

        public String d() {
            String string;
            synchronized (this.e) {
                SharedPreferences sharedPreferences = this.f20579c;
                if (sharedPreferences == null) {
                    string = "";
                } else {
                    string = sharedPreferences.getString("read_first_chapter", "");
                    if (!TextUtils.isEmpty(string)) {
                        string = g.b(string, cw.b(this.i));
                    }
                }
            }
            return string;
        }

        public void c(String str) {
            synchronized (this.f) {
                SharedPreferences sharedPreferences = this.f20577a;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("pub_store_door", str).apply();
                }
            }
        }

        public String c() {
            String string;
            synchronized (this.f) {
                SharedPreferences sharedPreferences = this.f20577a;
                string = sharedPreferences == null ? "" : sharedPreferences.getString("pub_store_door", "");
            }
            return string;
        }

        void b(String str) {
            synchronized (this.f) {
                SharedPreferences sharedPreferences = this.f20577a;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("catch_a_cat", str).commit();
                }
            }
        }

        String b() {
            synchronized (this.f) {
                SharedPreferences sharedPreferences = this.f20577a;
                if (sharedPreferences == null) {
                    return null;
                }
                String string = sharedPreferences.getString("catch_a_cat", null);
                if (string == null) {
                    string = ar.a(cw.a());
                    b(string);
                }
                return string;
            }
        }

        void a(String str) {
            synchronized (this.d) {
                SharedPreferences sharedPreferences = this.f20578b;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("get_a_book", str).commit();
                }
            }
        }

        String a() {
            synchronized (this.d) {
                SharedPreferences sharedPreferences = this.f20578b;
                if (sharedPreferences == null) {
                    return null;
                }
                return sharedPreferences.getString("get_a_book", null);
            }
        }

        public static a a(Context context) {
            a aVar;
            synchronized (g) {
                if (h == null) {
                    h = new a(context);
                }
                aVar = h;
            }
            return aVar;
        }

        private a(Context context) {
            this.f20577a = null;
            this.f20578b = null;
            this.f20579c = null;
            try {
                this.i = context.getApplicationContext();
                Context contextI = ab.i(context);
                this.f20577a = contextI.getSharedPreferences("hiad_sp_story_book_file", 4);
                this.f20578b = contextI.getSharedPreferences("hiad_sp_bed_rock_file", 4);
                this.f20579c = contextI.getSharedPreferences("hiad_sp_red_stone_file", 4);
            } catch (Throwable th) {
                hw.c("SecretUtil", "get SharedPreference error: %s", th.getClass().getSimpleName());
            }
        }
    }

    private static byte[] c(Context context) {
        return a(context, g(context));
    }

    private static SecureRandom c() {
        SecureRandom instanceStrong;
        try {
            instanceStrong = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            hw.c("SecretUtil", "getInstanceStrong, exception: %s", e.getClass().getSimpleName());
            instanceStrong = null;
        }
        return instanceStrong == null ? new SecureRandom() : instanceStrong;
    }

    public static byte[] b(Context context) {
        byte[] bArr;
        String str;
        String str2;
        byte[] bArrF;
        synchronized (f20572a) {
            SoftReference<byte[]> softReference = f20574c;
            bArr = softReference != null ? softReference.get() : null;
            if (bArr == null) {
                try {
                    bArrF = ar.b(e(context));
                } catch (UnsupportedEncodingException unused) {
                    str = "SecretUtil";
                    str2 = "getWorkKeyBytes UnsupportedEncodingException";
                    hw.c(str, str2);
                    bArrF = f(context);
                } catch (Throwable th) {
                    str = "SecretUtil";
                    str2 = "getWorkKeyBytes " + th.getClass().getSimpleName();
                    hw.c(str, str2);
                    bArrF = f(context);
                }
                bArr = bArrF;
                f20574c = new SoftReference<>(bArr);
            }
        }
        return bArr;
    }

    public static byte[] b() {
        return a(16);
    }

    private static String b(int i) {
        try {
            SecureRandom secureRandomC = c();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(Integer.toHexString(secureRandomC.nextInt(16)));
            }
            return sb.toString();
        } catch (Throwable th) {
            hw.c("SecretUtil", "generate aes key1 err:" + th.getClass().getSimpleName());
            return "";
        }
    }

    public static byte[] a(char[] cArr, byte[] bArr) {
        return SecretKeyFactory.getInstance(Build.VERSION.SDK_INT > 26 ? "PBKDF2WithHmacSHA256" : "PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, bArr, 10000, 256)).getEncoded();
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= bArr2.length) {
            bArr2 = bArr;
            bArr = bArr2;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length];
        int i = 0;
        while (i < length2) {
            bArr3[i] = (byte) (bArr2[i] ^ bArr[i]);
            i++;
        }
        while (i < bArr.length) {
            bArr3[i] = bArr[i];
            i++;
        }
        return bArr3;
    }

    private static byte[] a(String str, String str2, String str3) {
        byte[] bArrA = ar.a(str);
        byte[] bArrA2 = ar.a(str2);
        return a(a(bArrA, bArrA2), ar.a(str3));
    }

    private static byte[] a(Context context, String str) {
        return a(str, context.getString(R.string.hiad_str_2), context.getString(R.string.hiad_str_3));
    }

    public static byte[] a(Context context) {
        return a(context, df.a());
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        c().nextBytes(bArr);
        return bArr;
    }

    public static byte[] a() {
        return a(16);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        return upperCase.contains("CBC") || upperCase.contains("LOW") || upperCase.contains("MD5") || upperCase.contains("EXP") || upperCase.contains("SRP") || upperCase.contains("DSS") || upperCase.contains("PSK") || upperCase.contains("RC4") || upperCase.contains("DES") || upperCase.contains("TLS_EMPTY_RENEGOTIATION_INFO_SCSV") || upperCase.contains("TEA") || upperCase.contains("SHA0") || upperCase.contains("MD2") || upperCase.contains("MD4") || upperCase.contains("RIPEMD") || upperCase.contains("DESX") || upperCase.contains("DES40") || upperCase.contains("RC2") || upperCase.contains("ANON") || upperCase.contains("NULL") || upperCase.contains("TLS_RSA");
    }

    public static String a(String str, String str2) {
        String strB;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        synchronized (f20573b) {
            try {
                strB = g.b(str, ar.b(str2));
            } catch (Throwable th) {
                hw.c("SecretUtil", "decrypt oaid ex: %s", th.getClass().getSimpleName());
                return null;
            }
        }
        return strB;
    }

    private static String a(Context context, a aVar) {
        String strA = ar.a(b());
        aVar.a(g.a(strA, d(context)));
        return strA;
    }
}
