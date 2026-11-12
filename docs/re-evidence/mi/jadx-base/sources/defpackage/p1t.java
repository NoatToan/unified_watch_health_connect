package defpackage;

import android.text.TextUtils;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public final class p1t {
    public static int d = 100;
    public static int e = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector<g1t> f29922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29923b;
    public int c;

    public p1t() {
        this.c = 0;
        this.f29923b = 10;
        this.f29922a = new Vector<>();
    }

    public final Vector<g1t> a() {
        return this.f29922a;
    }

    public final synchronized void b(g1t g1tVar) {
        if (g1tVar != null) {
            if (!TextUtils.isEmpty(g1tVar.f())) {
                this.f29922a.add(g1tVar);
                this.c += g1tVar.f().getBytes().length;
            }
        }
    }

    public final synchronized boolean c(String str) {
        if (str == null) {
            return false;
        }
        if (this.f29922a.size() >= this.f29923b) {
            return true;
        }
        return this.c + str.getBytes().length > e;
    }

    public final synchronized void d() {
        this.f29922a.clear();
        this.c = 0;
    }

    public p1t(byte b2) {
        this.f29923b = d;
        this.c = 0;
        this.f29922a = new Vector<>();
    }
}
