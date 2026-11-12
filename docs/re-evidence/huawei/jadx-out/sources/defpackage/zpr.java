package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.io.outputstream.CipherOutputStream;
import net.lingala.zip4j.io.outputstream.CompressedOutputStream;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

/* JADX INFO: loaded from: classes20.dex */
public class zpr extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zpy f54446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zpg f54447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CompressedOutputStream f54448c;
    private char[] f;
    private zpz h;
    private zqc k;
    private boolean m;
    private zqh o;
    private zov i = new zov();
    private zoz g = new zoz();
    private CRC32 e = new CRC32();
    private zqn j = new zqn();
    private long l = 0;
    private boolean d = true;

    public zpr(OutputStream outputStream, char[] cArr, zqc zqcVar, zqh zqhVar) throws IOException {
        if (zqcVar.e() < 512) {
            throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
        }
        zpg zpgVar = new zpg(outputStream);
        this.f54447b = zpgVar;
        this.f = cArr;
        this.k = zqcVar;
        this.o = c(zqhVar, zpgVar);
        this.m = false;
        d();
    }

    public void e(ZipParameters zipParameters) throws IOException {
        d(zipParameters);
        ZipParameters zipParametersA = a(zipParameters);
        c(zipParametersA);
        this.f54448c = b(zipParametersA);
        this.d = false;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        b();
        this.e.update(bArr, i, i2);
        this.f54448c.write(bArr, i, i2);
        this.l += (long) i2;
    }

    public zpy a() throws IOException {
        this.f54448c.closeEntry();
        long compressedSize = this.f54448c.getCompressedSize();
        this.f54446a.setCompressedSize(compressedSize);
        this.h.setCompressedSize(compressedSize);
        this.f54446a.setUncompressedSize(this.l);
        this.h.setUncompressedSize(this.l);
        if (e(this.f54446a)) {
            this.f54446a.setCrc(this.e.getValue());
            this.h.setCrc(this.e.getValue());
        }
        this.o.b().add(this.h);
        this.o.c().b().add(this.f54446a);
        if (this.h.isDataDescriptorExists()) {
            this.g.d(this.h, this.f54447b);
        }
        e();
        this.d = true;
        return this.f54446a;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.d) {
            a();
        }
        this.o.e().b(this.f54447b.a());
        this.g.b(this.o, this.f54447b, this.k.c());
        this.f54447b.close();
        this.m = true;
    }

    private void b() throws IOException {
        if (this.m) {
            throw new IOException("Stream is closed");
        }
    }

    private zqh c(zqh zqhVar, zpg zpgVar) {
        if (zqhVar == null) {
            zqhVar = new zqh();
        }
        if (zpgVar.e()) {
            zqhVar.b(true);
            zqhVar.d(zpgVar.c());
        }
        return zqhVar;
    }

    private void c(ZipParameters zipParameters) throws IOException {
        zpy zpyVarD = this.i.d(zipParameters, this.f54447b.e(), this.f54447b.getCurrentSplitFileCounter(), this.k.c(), this.j);
        this.f54446a = zpyVarD;
        zpyVarD.e(this.f54447b.d());
        zpz zpzVarD = this.i.d(this.f54446a);
        this.h = zpzVarD;
        this.g.a(this.o, zpzVarD, this.f54447b, this.k.c());
    }

    private void e() throws IOException {
        this.l = 0L;
        this.e.reset();
        this.f54448c.close();
    }

    private void d() throws IOException {
        if (this.f54447b.e()) {
            this.j.d(this.f54447b, (int) HeaderSignature.SPLIT_ZIP.getValue());
        }
    }

    private CompressedOutputStream b(ZipParameters zipParameters) throws IOException {
        return a(c(new zpk(this.f54447b), zipParameters), zipParameters);
    }

    private CipherOutputStream<?> c(zpk zpkVar, ZipParameters zipParameters) throws IOException {
        if (!zipParameters.k()) {
            return new zpo(zpkVar, zipParameters, null);
        }
        char[] cArr = this.f;
        if (cArr == null || cArr.length == 0) {
            throw new ZipException("password not set");
        }
        if (zipParameters.g() == EncryptionMethod.AES) {
            return new zpj(zpkVar, zipParameters, this.f, this.k.b());
        }
        if (zipParameters.g() == EncryptionMethod.ZIP_STANDARD) {
            return new zpq(zpkVar, zipParameters, this.f, this.k.b());
        }
        if (zipParameters.g() == EncryptionMethod.ZIP_STANDARD_VARIANT_STRONG) {
            throw new ZipException(EncryptionMethod.ZIP_STANDARD_VARIANT_STRONG + " encryption method is not supported");
        }
        throw new ZipException("Invalid encryption method");
    }

    private CompressedOutputStream a(CipherOutputStream<?> cipherOutputStream, ZipParameters zipParameters) {
        if (zipParameters.a() == CompressionMethod.DEFLATE) {
            return new zpm(cipherOutputStream, zipParameters.c(), this.k.e());
        }
        return new zpn(cipherOutputStream);
    }

    private void d(ZipParameters zipParameters) {
        if (zqp.a(zipParameters.m())) {
            throw new IllegalArgumentException("fileNameInZip is null or empty");
        }
        if (zipParameters.a() == CompressionMethod.STORE && zipParameters.j() < 0 && !zqk.a(zipParameters.m()) && zipParameters.v()) {
            throw new IllegalArgumentException("uncompressed size should be set for zip entries of compression type store");
        }
    }

    private boolean e(zpy zpyVar) {
        if (zpyVar.isEncrypted() && zpyVar.getEncryptionMethod().equals(EncryptionMethod.AES)) {
            return zpyVar.getAesExtraDataRecord().e().equals(AesVersion.ONE);
        }
        return true;
    }

    private ZipParameters a(ZipParameters zipParameters) {
        ZipParameters zipParameters2 = new ZipParameters(zipParameters);
        if (zqk.a(zipParameters.m())) {
            zipParameters2.d(false);
            zipParameters2.d(CompressionMethod.STORE);
            zipParameters2.b(false);
            zipParameters2.e(0L);
        }
        if (zipParameters.l() <= 0) {
            zipParameters2.d(System.currentTimeMillis());
        }
        return zipParameters2;
    }
}
