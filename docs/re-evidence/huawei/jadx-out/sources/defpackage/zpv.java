package defpackage;

import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.ZipHeader;

/* JADX INFO: loaded from: classes20.dex */
public class zpv extends ZipHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54452b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f54453c;
    private int d;
    private int e;
    private int f;
    private int h;
    private int i;

    public zpv() {
        setSignature(HeaderSignature.END_OF_CENTRAL_DIRECTORY);
    }

    public int d() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public int c() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public int i() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }

    public int j() {
        return this.i;
    }

    public void d(int i) {
        this.i = i;
    }

    public void e(int i) {
        this.f = i;
    }

    public long e() {
        return this.f54453c;
    }

    public void b(long j) {
        this.f54453c = j;
    }

    public long b() {
        return this.f54451a;
    }

    public void c(long j) {
        this.f54451a = j;
    }

    public String a() {
        return this.f54452b;
    }

    public void a(String str) {
        if (str != null) {
            this.f54452b = str;
        }
    }
}
