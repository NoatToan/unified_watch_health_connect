package defpackage;

import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.ZipHeader;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;

/* JADX INFO: loaded from: classes20.dex */
public class zpp extends ZipHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AesKeyStrength f54444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AesVersion f54445c;
    private int d;
    private CompressionMethod e;

    public zpp() {
        setSignature(HeaderSignature.AES_EXTRA_DATA_RECORD);
        this.d = 7;
        this.f54445c = AesVersion.TWO;
        this.f54443a = "AE";
        this.f54444b = AesKeyStrength.KEY_STRENGTH_256;
        this.e = CompressionMethod.DEFLATE;
    }

    public int d() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public AesVersion e() {
        return this.f54445c;
    }

    public void e(AesVersion aesVersion) {
        this.f54445c = aesVersion;
    }

    public String b() {
        return this.f54443a;
    }

    public void a(String str) {
        this.f54443a = str;
    }

    public AesKeyStrength a() {
        return this.f54444b;
    }

    public void a(AesKeyStrength aesKeyStrength) {
        this.f54444b = aesKeyStrength;
    }

    public CompressionMethod c() {
        return this.e;
    }

    public void d(CompressionMethod compressionMethod) {
        this.e = compressionMethod;
    }
}
