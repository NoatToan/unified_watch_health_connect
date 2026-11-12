package defpackage;

import com.huawei.pluginmgr.filedownload.PullHealthBiListener;
import com.huawei.pluginmgr.filedownload.PullListener;

/* JADX INFO: loaded from: classes.dex */
public class pis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45457c;
    private String d;
    private PullHealthBiListener e;
    private String f;
    private boolean g;
    private PullListener h;
    private boolean i;
    private String j;
    private int k;
    private int l;
    private String m;
    private String n;
    private String o;

    public String a() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public String e() {
        return this.f45457c;
    }

    public void b(String str) {
        this.f45457c = str;
    }

    public int g() {
        return this.k;
    }

    public void e(int i) {
        this.k = i;
    }

    public String j() {
        return this.j;
    }

    public void i(String str) {
        this.j = str;
    }

    public int l() {
        return this.l;
    }

    public void a(int i) {
        this.l = i;
    }

    public void b(PullListener pullListener) {
        this.h = pullListener;
    }

    public void d(boolean z) {
        this.g = z;
    }

    public boolean c() {
        return this.g;
    }

    public void c(boolean z) {
        this.i = z;
    }

    public boolean f() {
        return this.i;
    }

    public void g(String str) {
        this.n = str;
    }

    public String k() {
        return this.n;
    }

    public String o() {
        return this.m;
    }

    public void h(String str) {
        this.m = str;
    }

    public String b() {
        return this.f45455a;
    }

    public void c(String str) {
        this.f45455a = str;
    }

    public String h() {
        return this.f;
    }

    public void d(String str) {
        this.f = str;
    }

    public String d() {
        return this.f45456b;
    }

    public void e(String str) {
        this.f45456b = str;
    }

    public String i() {
        return this.o;
    }

    public void j(String str) {
        this.o = str;
    }

    protected void c(pit pitVar) {
        int iF;
        PullListener pullListener = this.h;
        if (pullListener != null) {
            pullListener.onPullingChange(this, pitVar);
        }
        if (pitVar == null || (iF = pitVar.f()) == 0 || iF == -8) {
            return;
        }
        piu.c().b(this);
    }

    public void d(PullHealthBiListener pullHealthBiListener) {
        this.e = pullHealthBiListener;
    }

    protected void d(int i, String str) {
        PullHealthBiListener pullHealthBiListener = this.e;
        if (pullHealthBiListener != null) {
            pullHealthBiListener.onPullHealthBiCalling(i, str, this);
        }
    }
}
