package com.xiaomi.push;

import android.os.Bundle;
import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.fys;
import defpackage.uys;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class e extends fys {
    public a p;
    public final Map<String, String> q;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14035b = new a("get");
        public static final a c = new a(CourseConfigModel.DevCmd.CMD_ACTION_SET);
        public static final a d = new a("result");
        public static final a e = new a("error");
        public static final a f = new a("command");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14036a;

        public a(String str) {
            this.f14036a = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = f14035b;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = c;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = e;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = d;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = f;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f14036a;
        }
    }

    public e() {
        this.p = a.f14035b;
        this.q = new HashMap();
    }

    public synchronized void A(Map<String, String> map) {
        this.q.putAll(map);
    }

    public String B() {
        return null;
    }

    @Override // defpackage.fys
    public Bundle a() {
        Bundle bundleA = super.a();
        a aVar = this.p;
        if (aVar != null) {
            bundleA.putString("ext_iq_type", aVar.toString());
        }
        return bundleA;
    }

    @Override // defpackage.fys
    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (l() != null) {
            sb.append("id=\"" + l() + "\" ");
        }
        if (o() != null) {
            sb.append("to=\"");
            sb.append(uys.b(o()));
            sb.append("\" ");
        }
        if (q() != null) {
            sb.append("from=\"");
            sb.append(uys.b(q()));
            sb.append("\" ");
        }
        if (m() != null) {
            sb.append("chid=\"");
            sb.append(uys.b(m()));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.q.entrySet()) {
            sb.append(uys.b(entry.getKey()));
            sb.append("=\"");
            sb.append(uys.b(entry.getValue()));
            sb.append("\" ");
        }
        if (this.p == null) {
            sb.append("type=\"get\">");
        } else {
            sb.append("type=\"");
            sb.append(y());
            sb.append("\">");
        }
        String strB = B();
        if (strB != null) {
            sb.append(strB);
        }
        sb.append(u());
        f fVarB = b();
        if (fVarB != null) {
            sb.append(fVarB.b());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    public a y() {
        return this.p;
    }

    public void z(a aVar) {
        if (aVar == null) {
            this.p = a.f14035b;
        } else {
            this.p = aVar;
        }
    }

    public e(Bundle bundle) {
        super(bundle);
        this.p = a.f14035b;
        this.q = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.p = a.a(bundle.getString("ext_iq_type"));
        }
    }
}
