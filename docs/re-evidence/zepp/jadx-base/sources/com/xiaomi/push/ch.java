package com.xiaomi.push;

import android.os.Bundle;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class ch extends cj {
    private a n;
    private final Map<String, String> o;

    public static class a {
        public static final a a = new a("get");
        public static final a b = new a(WatchFaceArrivingEvent.CMD_SET);
        public static final a c = new a("result");
        public static final a d = new a("error");
        public static final a e = new a("command");
        private String f;

        private a(String str) {
            this.f = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = a;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = b;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = d;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = c;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = e;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f;
        }
    }

    public ch() {
        this.n = a.a;
        this.o = new HashMap();
    }

    public ch(Bundle bundle) {
        super(bundle);
        this.n = a.a;
        this.o = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.n = a.a(bundle.getString("ext_iq_type"));
        }
    }

    @Override // com.xiaomi.push.cj
    public Bundle a() {
        Bundle bundleA = super.a();
        a aVar = this.n;
        if (aVar != null) {
            bundleA.putString("ext_iq_type", aVar.toString());
        }
        return bundleA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public a m3638a() {
        return this.n;
    }

    @Override // com.xiaomi.push.cj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo3639a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (j() != null) {
            sb.append("id=\"" + j() + "\" ");
        }
        if (l() != null) {
            sb.append("to=\"");
            sb.append(cu.a(l()));
            sb.append("\" ");
        }
        if (m() != null) {
            sb.append("from=\"");
            sb.append(cu.a(m()));
            sb.append("\" ");
        }
        if (k() != null) {
            sb.append("chid=\"");
            sb.append(cu.a(k()));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.o.entrySet()) {
            sb.append(cu.a(entry.getKey()));
            sb.append("=\"");
            sb.append(cu.a(entry.getValue()));
            sb.append("\" ");
        }
        if (this.n == null) {
            str = "type=\"get\">";
        } else {
            sb.append("type=\"");
            sb.append(m3638a());
            str = "\">";
        }
        sb.append(str);
        String strB = b();
        if (strB != null) {
            sb.append(strB);
        }
        sb.append(o());
        cn cnVarM3640a = m3640a();
        if (cnVarM3640a != null) {
            sb.append(cnVarM3640a.m3643a());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    public void a(a aVar) {
        if (aVar == null) {
            aVar = a.a;
        }
        this.n = aVar;
    }

    public synchronized void a(Map<String, String> map) {
        this.o.putAll(map);
    }

    public String b() {
        return null;
    }
}
