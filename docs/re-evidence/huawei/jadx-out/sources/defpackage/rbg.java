package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rbg implements Serializable {
    private static final long serialVersionUID = 6072518949116079534L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47084c;
    private boolean d;
    private String e;
    private String f;
    private boolean g;
    private List<rbx> h;
    private boolean i;
    private String j;
    private String l;
    private String m;
    private int n;

    public int b() {
        return this.f47084c;
    }

    public void c(int i) {
        this.f47084c = i;
    }

    public boolean i() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public String h() {
        return this.m;
    }

    public void j(String str) {
        this.m = str;
    }

    public List<rbx> e() {
        return this.h;
    }

    public String j() {
        return this.l;
    }

    public void h(String str) {
        this.l = str;
    }

    public String c() {
        return this.f47083b;
    }

    public void b(String str) {
        this.f47083b = str;
    }

    public int g() {
        return this.n;
    }

    public void a(int i) {
        this.n = i;
    }

    public boolean n() {
        return this.i;
    }

    public void e(boolean z) {
        this.i = z;
    }

    public boolean f() {
        return this.g;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(String str) {
        this.f = str;
    }

    public void d(String str) {
        this.e = str;
    }

    public String d() {
        return this.j;
    }

    public void a(String str) {
        this.j = str;
    }

    public String a() {
        return this.f47082a;
    }

    public void e(String str) {
        this.f47082a = str;
    }

    public void d(List<rbx> list) {
        this.h = list;
    }

    public String toString() {
        return "DeclarationBean{mTitle='" + this.l + "', mFeatureId='" + this.f47083b + "', mType=" + this.n + ", mIsStartBox=" + this.i + ", mIsEndBox=" + this.g + ", mVersion='" + this.m + "', mIsChecked=" + this.d + ", mShortVersion='" + this.f + "', mBaseVersion='" + this.e + "', mPrivacyVersion='" + this.j + "', mAgreementVersion='" + this.f47082a + "', mIndex=" + this.f47084c + ", mParts=" + this.h + '}';
    }
}
