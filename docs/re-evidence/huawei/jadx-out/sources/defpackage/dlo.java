package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class dlo implements Serializable {
    private static final long serialVersionUID = -5599807658382352185L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31971c;
    private int e;
    private int f;
    private int h;
    private int j;
    private int o;
    private String i = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31969a = 1;
    private String g = "";
    private int d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<dlm> f31970b = new ArrayList(2);

    public int h() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }

    public int i() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public String f() {
        return this.i;
    }

    public void b(String str) {
        this.i = str;
    }

    public int c() {
        return this.f31971c;
    }

    public void b(int i) {
        this.f31971c = i;
    }

    public int a() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public int g() {
        return this.o;
    }

    public void f(int i) {
        this.o = i;
    }

    public int b() {
        return this.f31969a;
    }

    public void e(int i) {
        this.f31969a = i;
    }

    public String d() {
        return this.g;
    }

    public void c(String str) {
        this.g = str;
    }

    public void j(int i) {
        this.d = i;
    }

    public int j() {
        return this.d;
    }

    public List<dlm> e() {
        return this.f31970b;
    }

    public int m() {
        return this.j;
    }

    public void i(int i) {
        this.j = i;
    }

    public void c(dlm dlmVar) {
        this.f31970b.add(dlmVar);
    }

    public String toString() {
        return "PageModuleObject{mName='" + this.i + "', mLayout='" + this.f31971c + "', mModuleType='" + this.e + "', mPageType='" + this.h + "', pageModuleId='" + this.f + "', mDisplay = " + this.f31969a + "', mTextPosition ='" + this.j + "', mMoreInfoUrl ='" + this.g + "', mCardItemList='" + this.f31970b.toString() + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && (obj instanceof dlo) && this.f == ((dlo) obj).f;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f));
    }
}
