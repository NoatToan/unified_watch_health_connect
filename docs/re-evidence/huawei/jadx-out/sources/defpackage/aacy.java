package defpackage;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes46.dex */
public class aacy {
    public static void b(zzl zzlVar, SecretKey secretKey) {
        if (secretKey == null || aadd.a(secretKey)) {
            zzlVar.b(null, 8);
        } else {
            byte[] encoded = secretKey.getEncoded();
            zzlVar.b(encoded, 8);
            zzg.a(encoded);
            zzs.a(zzlVar, secretKey.getAlgorithm(), 8);
        }
    }

    public static SecretKey c(zzf zzfVar) {
        byte[] bArrJ = zzfVar.j(8);
        if (bArrJ == null) {
            return null;
        }
        if (bArrJ.length == 0) {
            throw new IllegalArgumentException("key must not be empty!");
        }
        try {
            String strE = zzs.e(zzfVar, 8);
            if (strE == null) {
                throw new IllegalArgumentException("key must have algorithm!");
            }
            SecretKey secretKeyE = aadd.e(bArrJ, strE.intern());
            zzg.a(bArrJ);
            return secretKeyE;
        } catch (Throwable th) {
            zzg.a(bArrJ);
            throw th;
        }
    }

    public static void d(zzl zzlVar, aacw aacwVar) {
        if (aacwVar == null || aadd.b(aacwVar)) {
            zzlVar.d(0, 8);
        } else {
            zzlVar.d(aacwVar.c(), 8);
            aacwVar.c(zzlVar);
        }
    }

    public static aacw d(zzf zzfVar) {
        byte[] bArrJ = zzfVar.j(8);
        if (bArrJ == null) {
            return null;
        }
        aacw aacwVarD = aadd.d(bArrJ);
        zzg.a(bArrJ);
        return aacwVarD;
    }
}
