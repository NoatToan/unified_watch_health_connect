package com.sogou.map.loc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes18.dex */
final class b2 {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    private byte[] e;
    public byte f;
    public byte[] g;
    public byte h;
    private List i = null;
    private List j = null;
    private v0 k = null;
    private c1 l = null;
    private e1 m = null;
    public b1 n;
    public b1 o;
    public byte[] p;
    public byte[] q;
    public byte[] r;
    public d s;
    public byte t;

    public b2() {
        d dVar = d.SG;
    }

    public final List a(boolean z) {
        return this.i;
    }

    public final void b(v0 v0Var) {
        this.k = v0Var;
    }

    public final void c(c1 c1Var) {
        this.l = c1Var;
    }

    public final void d(e1 e1Var) {
        this.m = e1Var;
    }

    public final void e(String str) {
        this.e = j0.z(str);
        if (str != null) {
            TreeSet treeSet = new TreeSet();
            for (String str2 : str.split(",")) {
                String strTrim = str2.trim();
                if (strTrim.matches("\\d{5,6}")) {
                    int i = Integer.parseInt(strTrim.substring(0, 3));
                    int i2 = Integer.parseInt(strTrim.substring(3));
                    if (j0.l(i, i2)) {
                        treeSet.add(Long.valueOf(j0.w(i, i2)));
                    }
                }
            }
            Collections.unmodifiableList(new ArrayList(treeSet));
        }
    }

    public final void f(List list) {
        this.i = list;
    }

    public final byte[] g() {
        return this.e;
    }

    public final e1 h() {
        return this.m;
    }

    public final List i(boolean z) {
        return this.j;
    }

    public final void j(List list) {
        this.j = list;
    }

    public final List k() {
        c1 c1Var = this.l;
        if (c1Var == null) {
            return null;
        }
        return c1Var.a;
    }

    public final v0 l() {
        return this.k;
    }
}
