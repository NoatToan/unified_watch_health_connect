package com.xiaomi.push;

import android.os.Bundle;
import java.util.Objects;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class cl extends cj {
    private b n;
    private String o;
    private int p;
    private a q;

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

    public cl(Bundle bundle) {
        super(bundle);
        this.n = b.available;
        this.o = null;
        this.p = Integer.MIN_VALUE;
        this.q = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.n = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.o = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.p = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.q = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public cl(b bVar) {
        this.n = b.available;
        this.o = null;
        this.p = Integer.MIN_VALUE;
        this.q = null;
        a(bVar);
    }

    @Override // com.xiaomi.push.cj
    public Bundle a() {
        Bundle bundleA = super.a();
        b bVar = this.n;
        if (bVar != null) {
            bundleA.putString("ext_pres_type", bVar.toString());
        }
        String str = this.o;
        if (str != null) {
            bundleA.putString("ext_pres_status", str);
        }
        int i = this.p;
        if (i != Integer.MIN_VALUE) {
            bundleA.putInt("ext_pres_prio", i);
        }
        a aVar = this.q;
        if (aVar != null && aVar != a.available) {
            bundleA.putString("ext_pres_mode", aVar.toString());
        }
        return bundleA;
    }

    @Override // com.xiaomi.push.cj
    /* JADX INFO: renamed from: a */
    public String mo3639a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (p() != null) {
            sb.append(" xmlns=\"");
            sb.append(p());
            sb.append("\"");
        }
        if (j() != null) {
            sb.append(" id=\"");
            sb.append(j());
            sb.append("\"");
        }
        if (l() != null) {
            sb.append(" to=\"");
            sb.append(cu.a(l()));
            sb.append("\"");
        }
        if (m() != null) {
            sb.append(" from=\"");
            sb.append(cu.a(m()));
            sb.append("\"");
        }
        if (k() != null) {
            sb.append(" chid=\"");
            sb.append(cu.a(k()));
            sb.append("\"");
        }
        if (this.n != null) {
            sb.append(" type=\"");
            sb.append(this.n);
            sb.append("\"");
        }
        sb.append(SearchCriteria.GT);
        if (this.o != null) {
            sb.append("<status>");
            sb.append(cu.a(this.o));
            sb.append("</status>");
        }
        if (this.p != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.p);
            sb.append("</priority>");
        }
        a aVar = this.q;
        if (aVar != null && aVar != a.available) {
            sb.append("<show>");
            sb.append(this.q);
            sb.append("</show>");
        }
        sb.append(o());
        cn cnVarM3640a = m3640a();
        if (cnVarM3640a != null) {
            sb.append(cnVarM3640a.m3643a());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    public void a(int i) {
        if (i >= -128 && i <= 128) {
            this.p = i;
            return;
        }
        throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
    }

    public void a(a aVar) {
        this.q = aVar;
    }

    public void a(b bVar) {
        Objects.requireNonNull(bVar, "Type cannot be null");
        this.n = bVar;
    }

    public void a(String str) {
        this.o = str;
    }
}
