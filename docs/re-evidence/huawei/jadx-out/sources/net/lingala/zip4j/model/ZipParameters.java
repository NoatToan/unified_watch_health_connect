package net.lingala.zip4j.model;

import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

/* JADX INFO: loaded from: classes20.dex */
public class ZipParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CompressionMethod f43017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AesKeyStrength f43018c;
    private CompressionLevel d;
    private AesVersion e;
    private EncryptionMethod f;
    private ExcludeFileFilter g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private boolean l;
    private String m;
    private boolean n;
    private String o;
    private SymbolicLinkAction p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private boolean v;

    public enum SymbolicLinkAction {
        INCLUDE_LINK_ONLY,
        INCLUDE_LINKED_FILE_ONLY,
        INCLUDE_LINK_AND_LINKED_FILE
    }

    public ZipParameters() {
        this.f43017b = CompressionMethod.DEFLATE;
        this.d = CompressionLevel.NORMAL;
        this.h = false;
        this.f = EncryptionMethod.NONE;
        this.r = true;
        this.q = true;
        this.f43018c = AesKeyStrength.KEY_STRENGTH_256;
        this.e = AesVersion.TWO;
        this.n = true;
        this.k = 0L;
        this.j = -1L;
        this.v = true;
        this.l = true;
        this.p = SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY;
    }

    public ZipParameters(ZipParameters zipParameters) {
        this.f43017b = CompressionMethod.DEFLATE;
        this.d = CompressionLevel.NORMAL;
        this.h = false;
        this.f = EncryptionMethod.NONE;
        this.r = true;
        this.q = true;
        this.f43018c = AesKeyStrength.KEY_STRENGTH_256;
        this.e = AesVersion.TWO;
        this.n = true;
        this.k = 0L;
        this.j = -1L;
        this.v = true;
        this.l = true;
        this.p = SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY;
        this.f43017b = zipParameters.a();
        this.d = zipParameters.c();
        this.h = zipParameters.k();
        this.f = zipParameters.g();
        this.r = zipParameters.p();
        this.q = zipParameters.t();
        this.f43018c = zipParameters.b();
        this.e = zipParameters.e();
        this.n = zipParameters.s();
        this.i = zipParameters.f();
        this.f43016a = zipParameters.d();
        this.m = zipParameters.m();
        this.k = zipParameters.l();
        this.j = zipParameters.j();
        this.v = zipParameters.v();
        this.l = zipParameters.r();
        this.s = zipParameters.o();
        this.o = zipParameters.h();
        this.p = zipParameters.n();
        this.g = zipParameters.i();
        this.t = zipParameters.q();
    }

    public CompressionMethod a() {
        return this.f43017b;
    }

    public void d(CompressionMethod compressionMethod) {
        this.f43017b = compressionMethod;
    }

    public boolean k() {
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public EncryptionMethod g() {
        return this.f;
    }

    public void a(EncryptionMethod encryptionMethod) {
        this.f = encryptionMethod;
    }

    public CompressionLevel c() {
        return this.d;
    }

    public void b(CompressionLevel compressionLevel) {
        this.d = compressionLevel;
    }

    public boolean p() {
        return this.r;
    }

    public boolean t() {
        return this.q;
    }

    public AesKeyStrength b() {
        return this.f43018c;
    }

    public AesVersion e() {
        return this.e;
    }

    public boolean s() {
        return this.n;
    }

    public void e(boolean z) {
        this.n = z;
    }

    public long f() {
        return this.i;
    }

    public void b(long j) {
        this.i = j;
    }

    public String d() {
        return this.f43016a;
    }

    public void b(String str) {
        this.f43016a = str;
    }

    public String m() {
        return this.m;
    }

    public void e(String str) {
        this.m = str;
    }

    public long l() {
        return this.k;
    }

    public void d(long j) {
        if (j < 0) {
            this.k = 0L;
        } else {
            this.k = j;
        }
    }

    public long j() {
        return this.j;
    }

    public void e(long j) {
        this.j = j;
    }

    public boolean v() {
        return this.v;
    }

    public void d(boolean z) {
        this.v = z;
    }

    public boolean r() {
        return this.l;
    }

    public String o() {
        return this.s;
    }

    public String h() {
        return this.o;
    }

    public SymbolicLinkAction n() {
        return this.p;
    }

    public ExcludeFileFilter i() {
        return this.g;
    }

    public boolean q() {
        return this.t;
    }
}
