package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class nuf implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43742a;
    private String aa;
    private String ab;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43744c;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String l;
    private String n;
    private String q;
    private String r;
    private String t;
    private String u;
    private String v;
    private String w;
    private String y;
    private String z;
    private long d = 0;
    private String p = "";
    private long s = 0;
    private int x = -1;
    private int m = -1;
    private int e = -1;
    private int o = 0;
    private String k = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43743b = "";

    public void j(String str) {
        this.n = str;
    }

    public String d() {
        return this.y;
    }

    public void h(String str) {
        this.y = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public void f(String str) {
        this.v = str;
    }

    public void c(String str) {
        this.f43742a = str;
    }

    public long a() {
        return this.d;
    }

    public void b(long j) {
        this.d = j;
    }

    public String g() {
        return this.aa;
    }

    public void k(String str) {
        this.aa = str;
    }

    public String i() {
        return this.w;
    }

    public void n(String str) {
        this.w = str;
    }

    public String h() {
        return this.ab;
    }

    public void m(String str) {
        this.ab = str;
    }

    public void i(String str) {
        this.l = str;
    }

    public void d(String str) {
        this.j = str;
    }

    public void d(int i) {
        this.m = i;
    }

    public void c(int i) {
        this.e = i;
    }

    public int c() {
        return this.o;
    }

    public void a(int i) {
        this.o = i;
    }

    public String e() {
        return this.k;
    }

    public void a(String str) {
        this.k = str;
    }

    public void b(String str) {
        this.f43743b = str;
    }

    public String j() {
        return this.z;
    }

    public void o(String str) {
        this.z = str;
    }

    public String b() {
        return this.t;
    }

    public void g(String str) {
        this.t = str;
    }

    public String toString() {
        return "AppNewVersionInfo{NAME='" + this.n + "', VERSION='" + this.y + "', VERSION_ID='" + this.ab + "', DESCRIPTION='" + this.i + "', URL='" + this.v + "', CREATETIME='" + this.f43742a + "', componentID=" + this.f43744c + "', FILESIZE='" + this.g + "', PACKAGENAME='" + this.q + "', FILENAME='" + this.h + "', BYTESIZE='" + this.d + "', VERSION_CODE='" + this.w + "', VERSION_NAME='" + this.aa + "', MD5='" + this.l + "', NEWMD5='" + this.p + "', NEWBYTESIZE=" + this.s + "', DPATH='" + this.j + "', SPATH='" + this.r + "', STATUS='" + this.x + "', DOWNLOADURL='" + this.f + "', STORAGEPATH='" + this.u + ", VERSION_TYPE=" + this.z + ", OS_VERSION=" + this.t + "'}";
    }
}
