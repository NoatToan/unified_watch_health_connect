package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.io.inputstream.CipherInputStream;
import net.lingala.zip4j.io.inputstream.DecompressedInputStream;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.util.PasswordCallback;

/* JADX INFO: loaded from: classes46.dex */
public class zph extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f54431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DecompressedInputStream f54432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f54433c;
    private boolean d;
    private CRC32 e;
    private zpz f;
    private PasswordCallback g;
    private PushbackInputStream h;
    private zow i;
    private char[] j;
    private boolean l;
    private zqc n;

    public zpz c(zpy zpyVar, boolean z) throws IOException {
        PasswordCallback passwordCallback;
        if (this.f != null && z) {
            d();
        }
        zpz zpzVarC = this.i.c(this.h, this.n.c());
        this.f = zpzVarC;
        if (zpzVarC == null) {
            return null;
        }
        if (zpzVarC.isEncrypted() && this.j == null && (passwordCallback = this.g) != null) {
            e(passwordCallback.getPassword());
        }
        e(this.f);
        this.e.reset();
        if (zpyVar != null) {
            this.f.setCrc(zpyVar.getCrc());
            this.f.setCompressedSize(zpyVar.getCompressedSize());
            this.f.setUncompressedSize(zpyVar.getUncompressedSize());
            this.f.setDirectory(zpyVar.isDirectory());
            this.f54431a = true;
        } else {
            this.f54431a = false;
        }
        this.f54432b = d(this.f);
        this.d = false;
        return this.f;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.l) {
            throw new IOException("Stream closed");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative read length");
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f == null) {
            return -1;
        }
        try {
            int i3 = this.f54432b.read(bArr, i, i2);
            if (i3 == -1) {
                a();
                return i3;
            }
            this.e.update(bArr, i, i3);
            return i3;
        } catch (IOException e) {
            if (b(this.f)) {
                throw new ZipException(e.getMessage(), e.getCause(), ZipException.Type.WRONG_PASSWORD);
            }
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.l) {
            return;
        }
        DecompressedInputStream decompressedInputStream = this.f54432b;
        if (decompressedInputStream != null) {
            decompressedInputStream.close();
        }
        this.l = true;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        c();
        return !this.d ? 1 : 0;
    }

    public void e(char[] cArr) {
        this.j = cArr;
    }

    private void a() throws IOException {
        this.f54432b.endOfEntryReached(this.h, this.f54432b.pushBackInputStreamIfNecessary(this.h));
        e();
        h();
        b();
        this.d = true;
    }

    private DecompressedInputStream d(zpz zpzVar) throws IOException {
        return c(a(new zpi(this.h, c(zpzVar)), zpzVar), zpzVar);
    }

    private CipherInputStream<?> a(zpi zpiVar, zpz zpzVar) throws IOException {
        if (!zpzVar.isEncrypted()) {
            return new zpb(zpiVar, zpzVar, this.j, this.n.e());
        }
        if (zpzVar.getEncryptionMethod() == EncryptionMethod.AES) {
            return new zpe(zpiVar, zpzVar, this.j, this.n.e(), this.n.b());
        }
        if (zpzVar.getEncryptionMethod() == EncryptionMethod.ZIP_STANDARD) {
            return new zpf(zpiVar, zpzVar, this.j, this.n.e(), this.n.b());
        }
        throw new ZipException(String.format("Entry [%s] Strong Encryption not supported", zpzVar.getFileName()), ZipException.Type.UNSUPPORTED_ENCRYPTION);
    }

    private DecompressedInputStream c(CipherInputStream<?> cipherInputStream, zpz zpzVar) throws ZipException {
        if (zqp.c(zpzVar) == CompressionMethod.DEFLATE) {
            return new zpa(cipherInputStream, this.n.e());
        }
        return new zpd(cipherInputStream);
    }

    private void e() throws IOException {
        if (!this.f.isDataDescriptorExists() || this.f54431a) {
            return;
        }
        zpw zpwVarE = this.i.e(this.h, c(this.f.getExtraDataRecords()));
        this.f.setCompressedSize(zpwVarE.a());
        this.f.setUncompressedSize(zpwVarE.c());
        this.f.setCrc(zpwVarE.b());
    }

    private void e(zpz zpzVar) throws IOException {
        if (e(zpzVar.getFileName()) || zpzVar.getCompressionMethod() != CompressionMethod.STORE || zpzVar.getUncompressedSize() >= 0) {
            return;
        }
        throw new IOException("Invalid local file header for: " + zpzVar.getFileName() + ". Uncompressed size has to be set for entry of compression type store which is not a directory");
    }

    private boolean c(List<zpx> list) {
        if (list == null) {
            return false;
        }
        Iterator<zpx> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a() == HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue()) {
                return true;
            }
        }
        return false;
    }

    private void h() throws IOException {
        if ((this.f.getEncryptionMethod() == EncryptionMethod.AES && this.f.getAesExtraDataRecord().e().equals(AesVersion.TWO)) || this.f.getCrc() == this.e.getValue()) {
            return;
        }
        ZipException.Type type = ZipException.Type.CHECKSUM_MISMATCH;
        if (b(this.f)) {
            type = ZipException.Type.WRONG_PASSWORD;
        }
        throw new ZipException("Reached end of entry, but crc verification failed for " + this.f.getFileName(), type);
    }

    private void b() {
        this.f = null;
        this.e.reset();
    }

    private boolean e(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }

    private long c(zpz zpzVar) throws ZipException {
        if (zqp.c(zpzVar).equals(CompressionMethod.STORE)) {
            return zpzVar.getUncompressedSize();
        }
        if (!zpzVar.isDataDescriptorExists() || this.f54431a) {
            return zpzVar.getCompressedSize() - ((long) a(zpzVar));
        }
        return -1L;
    }

    private int a(zpz zpzVar) throws ZipException {
        if (!zpzVar.isEncrypted()) {
            return 0;
        }
        if (zpzVar.getEncryptionMethod().equals(EncryptionMethod.AES)) {
            return c(zpzVar.getAesExtraDataRecord());
        }
        return zpzVar.getEncryptionMethod().equals(EncryptionMethod.ZIP_STANDARD) ? 12 : 0;
    }

    private void d() throws IOException {
        if (this.f54433c == null) {
            this.f54433c = new byte[512];
        }
        while (read(this.f54433c) != -1) {
        }
        this.d = true;
    }

    private int c(zpp zppVar) throws ZipException {
        if (zppVar == null || zppVar.a() == null) {
            throw new ZipException("AesExtraDataRecord not found or invalid for Aes encrypted entry");
        }
        return zppVar.a().getSaltLength() + 12;
    }

    private boolean b(zpz zpzVar) {
        return zpzVar.isEncrypted() && EncryptionMethod.ZIP_STANDARD.equals(zpzVar.getEncryptionMethod());
    }

    private void c() throws IOException {
        if (this.l) {
            throw new IOException("Stream closed");
        }
    }
}
