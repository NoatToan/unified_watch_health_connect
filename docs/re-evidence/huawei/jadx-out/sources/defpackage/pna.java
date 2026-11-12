package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes42.dex */
public class pna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gyb f45705c;
    private String d;
    private String e;
    private String f;
    private boolean g = false;
    private List<Integer> h;
    private String i;
    private List<jpg> j;
    private int k;
    private String l;
    private boolean m;
    private List<jpg> n;
    private String o;
    private String t;

    public pna(String str, int i, boolean z, String str2, String str3, String str4, List<jpg> list, String str5) {
        this.d = str;
        this.k = i;
        this.m = z;
        this.f45703a = str3;
        this.o = str2;
        this.t = str4;
        this.n = list;
        this.l = str5;
    }

    public int g() {
        return this.k;
    }

    public boolean k() {
        return this.m;
    }

    public String n() {
        return this.o;
    }

    public boolean o() {
        return this.g;
    }

    public void d(boolean z) {
        this.g = z;
    }

    public String c() {
        return this.f45703a;
    }

    public String d() {
        return this.f45704b;
    }

    public void e(String str) {
        this.f45704b = str;
    }

    public void b(String str) {
        this.e = str;
    }

    public String l() {
        return this.t;
    }

    public String h() {
        return this.f;
    }

    public void c(String str) {
        this.f = str;
    }

    public List<jpg> j() {
        return this.n;
    }

    public List<jpg> f() {
        return this.j;
    }

    public void e(List<jpg> list) {
        this.j = list;
    }

    public List<Integer> i() {
        return this.h;
    }

    public void d(List<Integer> list) {
        this.h = list;
    }

    public String m() {
        return this.l;
    }

    public String a() {
        return this.i;
    }

    public void a(String str) {
        this.i = str;
    }

    public gyb e() {
        return this.f45705c;
    }

    public void d(gyb gybVar) {
        this.f45705c = gybVar;
    }

    public String b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof pna) {
            return Objects.equals(b(), ((pna) obj).b());
        }
        return false;
    }
}
