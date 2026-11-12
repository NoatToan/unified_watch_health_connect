package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<mxm> f42646b = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42647c;
    private String d;
    private long e;
    private int h;
    private String i;
    private int j;

    public String a() {
        return this.f42645a;
    }

    public void a(String str) {
        this.f42645a = str;
    }

    public void e(long j) {
        this.e = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public void d(int i) {
        this.f42647c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.h))).intValue();
    }

    public void c(int i) {
        this.h = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void c(String str) {
        this.d = (String) lst.d(str);
    }

    public List<mxm> d() {
        return (List) lst.d(this.f42646b);
    }

    public int c() {
        return this.j;
    }

    public void b(int i) {
        this.j = i;
    }

    public String b() {
        return this.i;
    }

    public void d(String str) {
        this.i = str;
    }
}
