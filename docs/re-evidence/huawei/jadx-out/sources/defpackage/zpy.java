package defpackage;

import java.util.Objects;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.AbstractFileHeader;

/* JADX INFO: loaded from: classes20.dex */
public class zpy extends AbstractFileHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f54459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54460c = 0;
    private byte[] d;
    private int e;
    private long h;
    private int i;

    public zpy() {
        setSignature(HeaderSignature.CENTRAL_DIRECTORY);
    }

    public int c() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public void a(int i) {
        this.f54460c = i;
    }

    public int e() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public void d(byte[] bArr) {
        this.d = bArr;
    }

    public byte[] d() {
        return this.f54459b;
    }

    public void c(byte[] bArr) {
        this.f54459b = bArr;
    }

    public long a() {
        return this.h;
    }

    public void e(long j) {
        this.h = j;
    }

    public String b() {
        return this.f54458a;
    }

    public void b(String str) {
        this.f54458a = str;
    }

    public String toString() {
        return getFileName();
    }

    @Override // net.lingala.zip4j.model.AbstractFileHeader
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && e(this) == e((zpy) obj);
    }

    public int hashCode() {
        return Objects.hash(getFileName(), Long.valueOf(e(this)));
    }

    private long e(zpy zpyVar) {
        if (zpyVar.getZip64ExtendedInfo() != null) {
            return zpyVar.getZip64ExtendedInfo().e();
        }
        return zpyVar.a();
    }
}
