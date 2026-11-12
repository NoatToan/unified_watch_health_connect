package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public final class je {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f2869b = 100;
    private static int d = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Vector<jb> f2870a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2871c;
    private int e;

    public je() {
        this.e = 0;
        this.f2871c = 10;
        this.f2870a = new Vector<>();
    }

    public je(byte b2) {
        this.f2871c = f2869b;
        this.e = 0;
        this.f2870a = new Vector<>();
    }

    public final boolean a(String str) {
        synchronized (this) {
            if (str == null) {
                return false;
            }
            if (this.f2870a.size() >= this.f2871c) {
                return true;
            }
            return this.e + str.getBytes().length > d;
        }
    }

    public final Vector<jb> a() {
        return this.f2870a;
    }

    public final void b() {
        synchronized (this) {
            this.f2870a.clear();
            this.e = 0;
        }
    }

    public final void a(jb jbVar) {
        synchronized (this) {
            if (jbVar != null) {
                if (!TextUtils.isEmpty(jbVar.b())) {
                    this.f2870a.add(jbVar);
                    this.e += jbVar.b().getBytes().length;
                }
            }
        }
    }
}
