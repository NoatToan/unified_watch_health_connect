package com.alipay.sdk.m.q0;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.o0.b;
import com.google.common.base.Ascii;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import defpackage.nb;
import defpackage.nc;
import defpackage.nd;
import defpackage.nf;
import defpackage.nl;
import defpackage.ns;
import defpackage.nt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2122a = new Object();
    public static final String d = ".UTSystemConfig" + File.separator + "Global";
    public static d e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f2124c;
    public nl f;
    public String g;
    public String h;
    public nt i;
    public nl j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2123b = null;
    public Pattern l = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.f2124c = null;
        this.i = null;
        this.g = "xx_utdid_key";
        this.h = "xx_utdid_domain";
        this.f = null;
        this.j = null;
        this.f2124c = context;
        this.j = new nl(context, d, "Alvin2", false, true);
        this.f = new nl(context, ".DataStorage", "ContextData", false, true);
        this.i = new nt();
        this.g = String.format("K_%d", Integer.valueOf(nf.c(this.g)));
        this.h = String.format("D_%d", Integer.valueOf(nf.c(this.h)));
    }

    public final void a() {
        boolean z;
        nl nlVar = this.j;
        if (nlVar != null) {
            if (nf.b(nlVar.c("UTDID2"))) {
                String strC = this.j.c("UTDID");
                if (!nf.b(strC)) {
                    b(strC);
                }
            }
            boolean z2 = true;
            if (nf.b(this.j.c("DID"))) {
                z = false;
            } else {
                this.j.b("DID");
                z = true;
            }
            if (nf.b(this.j.c("EI"))) {
                z2 = z;
            } else {
                this.j.b("EI");
            }
            if (!nf.b(this.j.c("SI"))) {
                this.j.b("SI");
            } else if (!z2) {
                return;
            }
            this.j.b();
        }
    }

    public final void b(String str) {
        nl nlVar;
        if (d(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (nlVar = this.j) == null) {
                return;
            }
            nlVar.b("UTDID2", str);
            this.j.b();
        }
    }

    public final void c(String str) {
        nl nlVar;
        if (str == null || (nlVar = this.f) == null || str.equals(nlVar.c(this.g))) {
            return;
        }
        this.f.b(this.g, str);
        this.f.b();
    }

    public String d() {
        synchronized (this) {
            String strJ = j();
            this.f2123b = strJ;
            if (!TextUtils.isEmpty(strJ)) {
                return this.f2123b;
            }
            try {
                byte[] bArrC = c();
                if (bArrC != null) {
                    String strC = b.c(bArrC, 2);
                    this.f2123b = strC;
                    b(strC);
                    String strD = this.i.d(bArrC);
                    if (strD != null) {
                        c(strD);
                    }
                    return this.f2123b;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    public String e() {
        synchronized (this) {
            String str = this.f2123b;
            if (str != null) {
                return str;
            }
            return d();
        }
    }

    public String j() {
        synchronized (this) {
            String strB = b();
            if (d(strB)) {
                c(this.i.a(strB));
                this.f2123b = strB;
                return strB;
            }
            String strC = this.f.c(this.g);
            if (!nf.b(strC)) {
                String strC2 = new ns().c(strC);
                if (!d(strC2)) {
                    strC2 = this.i.e(strC);
                }
                if (d(strC2) && !nf.b(strC2)) {
                    this.f2123b = strC2;
                    b(strC2);
                    return this.f2123b;
                }
            }
            return null;
        }
    }

    public final String b() {
        nl nlVar = this.j;
        if (nlVar == null) {
            return null;
        }
        String strC = nlVar.c("UTDID2");
        if (nf.b(strC) || this.i.a(strC) == null) {
            return null;
        }
        return strC;
    }

    public final byte[] c() throws Exception {
        String strA;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bArrE = nd.e(iCurrentTimeMillis);
        byte[] bArrE2 = nd.e(iNextInt);
        byteArrayOutputStream.write(bArrE, 0, 4);
        byteArrayOutputStream.write(bArrE2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strA = nb.a(this.f2124c);
        } catch (Exception unused) {
            strA = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(nd.e(nf.c(strA)), 0, 4);
        byteArrayOutputStream.write(nd.e(nf.c(e(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    public static d d(Context context) {
        if (context != null && e == null) {
            synchronized (f2122a) {
                if (e == null) {
                    d dVar = new d(context);
                    e = dVar;
                    dVar.a();
                }
            }
        }
        return e;
    }

    public final boolean d(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.l.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public static String e(byte[] bArr) throws Exception {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, Ascii.ETB, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, PublicSuffixDatabase.i, -80, -68, -78, -117, 53, Ascii.RS, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(nc.b(bArr2), mac.getAlgorithm()));
        return b.c(mac.doFinal(bArr), 2);
    }
}
