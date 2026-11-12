package com.xiaomi.push;

import android.os.Bundle;
import defpackage.fys;
import defpackage.uys;

/* JADX INFO: loaded from: classes11.dex */
public class hi extends fys {
    public b p;
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14057r;
    public a s;

    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public hi(b bVar) {
        this.p = b.available;
        this.q = null;
        this.f14057r = Integer.MIN_VALUE;
        this.s = null;
        A(bVar);
    }

    public void A(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Type cannot be null");
        }
        this.p = bVar;
    }

    public void B(String str) {
        this.q = str;
    }

    @Override // defpackage.fys
    public Bundle a() {
        Bundle bundleA = super.a();
        b bVar = this.p;
        if (bVar != null) {
            bundleA.putString("ext_pres_type", bVar.toString());
        }
        String str = this.q;
        if (str != null) {
            bundleA.putString("ext_pres_status", str);
        }
        int i = this.f14057r;
        if (i != Integer.MIN_VALUE) {
            bundleA.putInt("ext_pres_prio", i);
        }
        a aVar = this.s;
        if (aVar != null && aVar != a.available) {
            bundleA.putString("ext_pres_mode", aVar.toString());
        }
        return bundleA;
    }

    @Override // defpackage.fys
    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (w() != null) {
            sb.append(" xmlns=\"");
            sb.append(w());
            sb.append("\"");
        }
        if (l() != null) {
            sb.append(" id=\"");
            sb.append(l());
            sb.append("\"");
        }
        if (o() != null) {
            sb.append(" to=\"");
            sb.append(uys.b(o()));
            sb.append("\"");
        }
        if (q() != null) {
            sb.append(" from=\"");
            sb.append(uys.b(q()));
            sb.append("\"");
        }
        if (m() != null) {
            sb.append(" chid=\"");
            sb.append(uys.b(m()));
            sb.append("\"");
        }
        if (this.p != null) {
            sb.append(" type=\"");
            sb.append(this.p);
            sb.append("\"");
        }
        sb.append(">");
        if (this.q != null) {
            sb.append("<status>");
            sb.append(uys.b(this.q));
            sb.append("</status>");
        }
        if (this.f14057r != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f14057r);
            sb.append("</priority>");
        }
        a aVar = this.s;
        if (aVar != null && aVar != a.available) {
            sb.append("<show>");
            sb.append(this.s);
            sb.append("</show>");
        }
        sb.append(u());
        f fVarB = b();
        if (fVarB != null) {
            sb.append(fVarB.b());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    public void y(int i) {
        if (i >= -128 && i <= 128) {
            this.f14057r = i;
            return;
        }
        throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
    }

    public void z(a aVar) {
        this.s = aVar;
    }

    public hi(Bundle bundle) {
        super(bundle);
        this.p = b.available;
        this.q = null;
        this.f14057r = Integer.MIN_VALUE;
        this.s = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.p = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.q = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f14057r = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.s = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }
}
