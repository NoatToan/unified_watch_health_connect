package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes3.dex */
public class t0e {
    public static byte[] a(s51 s51Var, gd gdVar) {
        try {
            return b(new rno(s51Var, gdVar));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(rno rnoVar) {
        try {
            return rnoVar.f(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }
}
