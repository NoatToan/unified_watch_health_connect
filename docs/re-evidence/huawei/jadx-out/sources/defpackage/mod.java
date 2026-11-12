package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42056a;
    private int h;
    private boolean g = false;
    private int i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42058c = "";
    private int k = -1;
    private int o = -1;
    private long j = -1;
    private int l = -1;
    private int d = -1;
    private int e = -1;
    private int m = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<byte[]> f42057b = Collections.synchronizedList(new ArrayList(16));
    private List<Integer> f = new ArrayList(16);

    public boolean l() {
        return this.g;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public int j() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }

    public String e() {
        return this.f42058c;
    }

    public void a(String str) {
        this.f42058c = str;
    }

    public void j(int i) {
        this.o = i;
    }

    public int k() {
        return this.o;
    }

    public void a(long j) {
        this.j = j;
    }

    public long i() {
        return this.j;
    }

    public void h(int i) {
        this.l = i;
    }

    public int m() {
        return this.l;
    }

    public void d(int i) {
        this.d = i;
    }

    public int b() {
        return this.d;
    }

    public void f(int i) {
        this.k = i;
    }

    public int f() {
        return this.k;
    }

    public void b(int i) {
        this.e = i;
    }

    public int d() {
        return this.e;
    }

    public void c(int i) {
        this.h = i;
    }

    public int g() {
        return this.h;
    }

    public void a(int i) {
        this.f42056a = i;
    }

    public int a() {
        return this.f42056a;
    }

    public void i(int i) {
        this.m = i;
    }

    public int o() {
        return this.m;
    }

    public List<byte[]> c() {
        return this.f42057b;
    }

    public List<Integer> h() {
        return this.f;
    }
}
