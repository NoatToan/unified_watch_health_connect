package com.google.android.exoplayer2.offline;

import android.content.Context;
import com.google.android.exoplayer2.scheduler.Requirements;
import defpackage.apk;
import defpackage.b37;
import defpackage.rk1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Requirements f8050k = new Requirements(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet<InterfaceC0188a> f8052b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public List<b37> i;
    public apk j;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.a$a, reason: collision with other inner class name */
    public interface InterfaceC0188a {
        default void a(a aVar, Requirements requirements, int i) {
        }

        default void b(a aVar, boolean z) {
        }
    }

    public void a(DownloadRequest downloadRequest, int i) {
        this.c++;
        throw null;
    }

    public void b(InterfaceC0188a interfaceC0188a) {
        rk1.e(interfaceC0188a);
        this.f8052b.add(interfaceC0188a);
    }

    public List<b37> c() {
        return this.i;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.d == 0 && this.c == 0;
    }

    public boolean f() {
        return this.e;
    }

    public final void g() {
        Iterator<InterfaceC0188a> it = this.f8052b.iterator();
        while (it.hasNext()) {
            it.next().b(this, this.h);
        }
    }

    public final void h(apk apkVar, int i) {
        Requirements requirementsF = apkVar.f();
        if (this.g != i) {
            this.g = i;
            this.c++;
            throw null;
        }
        boolean zP = p();
        Iterator<InterfaceC0188a> it = this.f8052b.iterator();
        while (it.hasNext()) {
            it.next().a(this, requirementsF, i);
        }
        if (zP) {
            g();
        }
    }

    public void i() {
        m(true);
    }

    public void j() {
        this.c++;
        throw null;
    }

    public void k(String str) {
        this.c++;
        throw null;
    }

    public void l() {
        m(false);
    }

    public final void m(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        this.c++;
        throw null;
    }

    public void n(Requirements requirements) {
        if (requirements.equals(this.j.f())) {
            return;
        }
        this.j.j();
        apk apkVar = new apk(this.f8051a, null, requirements);
        this.j = apkVar;
        h(this.j, apkVar.i());
    }

    public void o(String str, int i) {
        this.c++;
        throw null;
    }

    public final boolean p() {
        boolean z;
        if (!this.f && this.g != 0) {
            int i = 0;
            while (true) {
                if (i >= this.i.size()) {
                    z = false;
                    break;
                }
                if (this.i.get(i).f3743a == 0) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z2 = this.h != z;
        this.h = z;
        return z2;
    }
}
