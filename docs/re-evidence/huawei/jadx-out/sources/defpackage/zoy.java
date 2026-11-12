package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: loaded from: classes20.dex */
public class zoy {
    public static zpy b(zqh zqhVar, String str) throws ZipException {
        zpy zpyVarD = d(zqhVar, str);
        if (zpyVarD != null) {
            return zpyVarD;
        }
        String strReplaceAll = str.replaceAll("\\\\", "/");
        zpy zpyVarD2 = d(zqhVar, strReplaceAll);
        return zpyVarD2 == null ? d(zqhVar, strReplaceAll.replaceAll("/", "\\\\")) : zpyVarD2;
    }

    public static String a(byte[] bArr, boolean z, Charset charset) {
        if (charset != null) {
            return new String(bArr, charset);
        }
        if (z) {
            return new String(bArr, zql.d);
        }
        try {
            return new String(bArr, "Cp437");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static byte[] a(String str, Charset charset) {
        if (charset == null) {
            return str.getBytes(zql.f54483c);
        }
        return str.getBytes(charset);
    }

    public static long b(zqh zqhVar) {
        if (zqhVar.h()) {
            return zqhVar.g().d();
        }
        return zqhVar.e().e();
    }

    private static zpy d(zqh zqhVar, String str) throws ZipException {
        if (zqhVar == null) {
            throw new ZipException("zip model is null, cannot determine file header with exact match for fileName: " + str);
        }
        if (!zqp.c(str)) {
            throw new ZipException("file name is null, cannot determine file header with exact match for fileName: " + str);
        }
        if (zqhVar.c() == null) {
            throw new ZipException("central directory is null, cannot determine file header with exact match for fileName: " + str);
        }
        if (zqhVar.c().b() == null) {
            throw new ZipException("file Headers are null, cannot determine file header with exact match for fileName: " + str);
        }
        if (zqhVar.c().b().size() == 0) {
            return null;
        }
        for (zpy zpyVar : zqhVar.c().b()) {
            String fileName = zpyVar.getFileName();
            if (zqp.c(fileName) && str.equals(fileName)) {
                return zpyVar;
            }
        }
        return null;
    }
}
