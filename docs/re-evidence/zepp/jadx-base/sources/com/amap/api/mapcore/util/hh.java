package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public final class hh {
    private static int b = 100;
    private static int d = 10000;
    private Vector<he> a;
    private int c;
    private int e;

    public hh() {
        this.c = b;
        this.e = 0;
        this.c = 10;
        this.a = new Vector<>();
    }

    public final synchronized boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (this.a.size() >= this.c) {
            return true;
        }
        return this.e + str.getBytes().length > d;
    }

    public final synchronized void b() {
        this.a.clear();
        this.e = 0;
    }

    public final Vector<he> a() {
        return this.a;
    }

    public hh(byte b2) {
        this.c = b;
        this.e = 0;
        this.a = new Vector<>();
    }

    public final synchronized void a(he heVar) {
        if (heVar != null) {
            if (!TextUtils.isEmpty(heVar.b())) {
                this.a.add(heVar);
                this.e += heVar.b().getBytes().length;
            }
        }
    }
}
