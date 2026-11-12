package dh;

import am.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import w02.b0;
import w2.a0;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static c f59534h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f59537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bh.a f59539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bh.a f59540e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f59533g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f59535i = j.o(File.separator, "Global", new StringBuilder(".UTSystemConfig"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f59536a = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pattern f59541f = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public c(Context context) {
        this.f59537b = null;
        this.f59538c = "xx_utdid_key";
        this.f59539d = null;
        this.f59540e = null;
        this.f59540e = new bh.a(context, f59535i, "Alvin2", false, true);
        this.f59539d = new bh.a(context, ".DataStorage", "ContextData", false, true);
        this.f59537b = new d();
        this.f59538c = String.format("K_%d", Integer.valueOf(zg.c.a("xx_utdid_key")));
        String.format("D_%d", Integer.valueOf(zg.c.a("xx_utdid_domain")));
    }

    public final synchronized String a() {
        SharedPreferences sharedPreferences;
        String strD = d();
        this.f59536a = strD;
        if (!TextUtils.isEmpty(strD)) {
            return this.f59536a;
        }
        try {
            byte[] bArrF = f();
            if (bArrF != null) {
                String strC = zg.a.c(bArrF);
                this.f59536a = strC;
                c(strC);
                this.f59537b.getClass();
                String strC2 = b0.c(zg.a.c(bArrF));
                if (strC2 != null) {
                    String str = this.f59538c;
                    bh.a aVar = this.f59539d;
                    if (aVar != null && !strC2.equals(aVar.a(str))) {
                        if (!zg.c.b(str) && !str.equals(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT)) {
                            if (aVar.f17910c == null && (sharedPreferences = aVar.f17909b) != null) {
                                aVar.f17910c = sharedPreferences.edit();
                            }
                            SharedPreferences.Editor editor = aVar.f17910c;
                            if (editor != null) {
                                editor.putString(str, strC2);
                            }
                        }
                        aVar.b();
                    }
                }
                return this.f59536a;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return null;
    }

    public final boolean b(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = fb1.c.m(1, 0, str);
            }
            if (24 == str.length() && !this.f59541f.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public final void c(String str) {
        bh.a aVar;
        SharedPreferences sharedPreferences;
        if (b(str)) {
            if (str.endsWith("\n")) {
                str = fb1.c.m(1, 0, str);
            }
            if (str.length() != 24 || (aVar = this.f59540e) == null) {
                return;
            }
            if (!zg.c.b("UTDID2")) {
                if (aVar.f17910c == null && (sharedPreferences = aVar.f17909b) != null) {
                    aVar.f17910c = sharedPreferences.edit();
                }
                SharedPreferences.Editor editor = aVar.f17910c;
                if (editor != null) {
                    editor.putString("UTDID2", str);
                }
            }
            aVar.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public final synchronized String d() {
        String strA;
        SharedPreferences sharedPreferences;
        bh.a aVar = this.f59540e;
        if (aVar != null) {
            strA = aVar.a("UTDID2");
            if (zg.c.b(strA)) {
                strA = null;
            } else {
                this.f59537b.getClass();
                if (b0.c(strA) == null) {
                    strA = null;
                }
            }
        } else {
            strA = null;
        }
        if (!b(strA)) {
            String strA2 = this.f59539d.a(this.f59538c);
            if (!zg.c.b(strA2)) {
                new e();
                String strE = b0.e(strA2);
                if (!b(strE)) {
                    this.f59537b.getClass();
                    strE = b0.e(strA2);
                }
                if (b(strE) && !zg.c.b(strE)) {
                    this.f59536a = strE;
                    c(strE);
                    return this.f59536a;
                }
            }
            return null;
        }
        this.f59537b.getClass();
        String strC = b0.c(strA);
        String str = this.f59538c;
        bh.a aVar2 = this.f59539d;
        if (strC != null && aVar2 != null && !strC.equals(aVar2.a(str))) {
            if (!zg.c.b(str) && !str.equals(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT)) {
                if (aVar2.f17910c == null && (sharedPreferences = aVar2.f17909b) != null) {
                    aVar2.f17910c = sharedPreferences.edit();
                }
                SharedPreferences.Editor editor = aVar2.f17910c;
                if (editor != null) {
                    editor.putString(str, strC);
                }
            }
            aVar2.b();
        }
        this.f59536a = strA;
        return strA;
    }

    public final void e() {
        boolean z14;
        bh.a aVar = this.f59540e;
        if (aVar != null) {
            if (zg.c.b(aVar.a("UTDID2"))) {
                String strA = aVar.a("UTDID");
                if (!zg.c.b(strA)) {
                    c(strA);
                }
            }
            boolean z15 = true;
            if (zg.c.b(aVar.a("DID"))) {
                z14 = false;
            } else {
                aVar.c("DID");
                z14 = true;
            }
            if (!zg.c.b(aVar.a("EI"))) {
                aVar.c("EI");
                z14 = true;
            }
            if (zg.c.b(aVar.a("SI"))) {
                z15 = z14;
            } else {
                aVar.c("SI");
            }
            if (z15) {
                aVar.b();
            }
        }
    }

    public final byte[] f() throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        String strD;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bArrD = w13.b.d(iCurrentTimeMillis);
        byte[] bArrD2 = w13.b.d(iNextInt);
        byteArrayOutputStream.write(bArrD, 0, 4);
        byteArrayOutputStream.write(bArrD2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strD = a0.d();
        } catch (Exception unused) {
            strD = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(w13.b.d(zg.c.a(strD)), 0, 4);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = {69, 114, 116, -33, 125, -54, -31, 86, -11, Ascii.VT, -78, -96, -17, -99, SignedBytes.MAX_POWER_OF_TWO, Ascii.ETB, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, Ascii.RS, -122, SignedBytes.MAX_POWER_OF_TWO, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(zg.b.a(bArr), mac.getAlgorithm()));
        byteArrayOutputStream.write(w13.b.d(zg.c.a(zg.a.c(mac.doFinal(byteArray)))));
        return byteArrayOutputStream.toByteArray();
    }
}
