package w63;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/u;", "Lw63/l;", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class u extends l {
    @Override // w63.l
    public final f0 a(y yVar) {
        yVar.getClass();
        return new x(new FileOutputStream(yVar.toFile(), true), new h0());
    }

    @Override // w63.l
    public void c(y yVar, y yVar2) throws IOException {
        yVar.getClass();
        yVar2.getClass();
        if (yVar.toFile().renameTo(yVar2.toFile())) {
            return;
        }
        vb.h.t("failed to move ", yVar, " to ", yVar2);
    }

    @Override // w63.l
    public final void e(y yVar) throws IOException {
        yVar.getClass();
        if (yVar.toFile().mkdir()) {
            return;
        }
        k kVarP = p(yVar);
        if (kVarP == null || !kVarP.f183380b) {
            vb.h.B(yVar, "failed to create directory: ");
        }
    }

    @Override // w63.l
    public final void f(y yVar) throws IOException {
        yVar.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = yVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        vb.h.B(yVar, "failed to delete ");
    }

    @Override // w63.l
    public final List<y> l(y yVar) throws IOException {
        yVar.getClass();
        File file = yVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                vb.h.B(yVar, "failed to list ");
                return null;
            }
            vb.h.r(yVar, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(yVar.e(str));
        }
        p13.c0.t(arrayList);
        return arrayList;
    }

    @Override // w63.l
    public k p(y yVar) {
        yVar.getClass();
        File file = yVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new k(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // w63.l
    public final j s(y yVar) {
        yVar.getClass();
        return new t(false, new RandomAccessFile(yVar.toFile(), JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // w63.l
    public final f0 v(y yVar, boolean z14) throws IOException {
        yVar.getClass();
        if (!z14 || !k(yVar)) {
            return new x(new FileOutputStream(yVar.toFile(), false), new h0());
        }
        throw new IOException(yVar + " already exists.");
    }

    @Override // w63.l
    public final g0 w(y yVar) {
        yVar.getClass();
        return new s(new FileInputStream(yVar.toFile()), h0.NONE);
    }
}
