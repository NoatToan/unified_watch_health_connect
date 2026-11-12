package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class als {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1186b;
    public int c;
    public int d;
    public long e;
    public int f;
    public String g;
    public int h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1187k;
    public int l;
    public int m;

    public int a() {
        return this.f1185a;
    }

    public long b() {
        return this.e;
    }

    public String c() {
        return this.f1186b;
    }

    public void d(int i) {
        this.f1185a = i;
    }

    public void e(long j) {
        this.e = j;
    }

    public void f(String str) {
        this.f1186b = str;
    }

    public int g() {
        return this.c;
    }

    public long h() {
        return this.i;
    }

    public String i() {
        return this.g;
    }

    public void j(int i) {
        this.c = i;
    }

    public void k(long j) {
        this.i = j;
    }

    public void l(String str) {
        this.g = str;
    }

    public int m() {
        return this.d;
    }

    public long n() {
        return this.j;
    }

    public void o(int i) {
        this.d = i;
    }

    public void p(long j) {
        this.j = j;
    }

    public int q() {
        return this.f;
    }

    public long r() {
        return this.f1187k;
    }

    public void s(int i) {
        this.f = i;
    }

    public void t(long j) {
        this.f1187k = j;
    }

    public String toString() {
        return "DisconnectStatsModel{count=" + this.f1185a + ", host='" + this.f1186b + "', netState=" + this.c + ", reason=" + this.d + ", pingInterval=" + this.e + ", netType=" + this.f + ", wifiDigest='" + this.g + "', connectedNetType=" + this.h + ", duration=" + this.i + ", disconnectionTime=" + this.j + ", reconnectionTime=" + this.f1187k + ", xmsfVc=" + this.l + ", androidVc=" + this.m + AbstractJsonLexerKt.END_OBJ;
    }

    public int u() {
        return this.h;
    }

    public void v(int i) {
        this.h = i;
    }

    public int w() {
        return this.l;
    }

    public void x(int i) {
        this.l = i;
    }

    public int y() {
        return this.m;
    }

    public void z(int i) {
        this.m = i;
    }
}
