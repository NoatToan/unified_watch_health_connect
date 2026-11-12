package defpackage;

import java.io.ByteArrayOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class s4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33300b;
    public long c;
    public int d;
    public long e;
    public int f;
    public int g;
    public short h;

    public void a(int i) {
        this.d = i;
    }

    public void b(long j) {
        this.c = j;
    }

    public byte[] c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(tet.p(this.f33299a));
            byteArrayOutputStream.write(tet.p(this.f33300b));
            byteArrayOutputStream.write(tet.p((int) this.c));
            byteArrayOutputStream.write(tet.p(this.d));
            byteArrayOutputStream.write(tet.q(this.e));
            byteArrayOutputStream.write(tet.p(this.f));
            byteArrayOutputStream.write(tet.s((short) this.g));
            byteArrayOutputStream.write(this.h);
        } catch (Exception unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void d(int i) {
        this.f = i;
    }

    public void e(long j) {
        this.e = j;
    }

    public void f(int i) {
        this.g = i;
    }

    public void g(int i) {
        this.f33300b = i;
    }

    public void h(int i) {
        this.f33299a = i;
    }

    public String toString() {
        return "SportGpsPoint{longitude=" + this.f33299a + ", latitude=" + this.f33300b + ", speed=" + this.c + ", altitude=" + this.d + ", timestamp=" + this.e + ", barometer=" + this.f + ", course=" + this.g + ", mode=" + ((int) this.h) + AbstractJsonLexerKt.END_OBJ;
    }
}
