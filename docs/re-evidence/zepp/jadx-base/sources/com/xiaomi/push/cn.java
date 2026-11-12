package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class cn {
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private List<cg> f;

    public static class a {
        public static final a a = new a("internal-server-error");
        public static final a b = new a("forbidden");
        public static final a c = new a("bad-request");
        public static final a d = new a("conflict");
        public static final a e = new a("feature-not-implemented");
        public static final a f = new a("gone");
        public static final a g = new a("item-not-found");
        public static final a h = new a("jid-malformed");
        public static final a i = new a("not-acceptable");
        public static final a j = new a("not-allowed");
        public static final a k = new a("not-authorized");
        public static final a l = new a("payment-required");
        public static final a m = new a("recipient-unavailable");
        public static final a n = new a("redirect");
        public static final a o = new a("registration-required");
        public static final a p = new a("remote-server-error");
        public static final a q = new a("remote-server-not-found");
        public static final a r = new a("remote-server-timeout");
        public static final a s = new a("resource-constraint");
        public static final a t = new a("service-unavailable");
        public static final a u = new a("subscription-required");
        public static final a v = new a("undefined-condition");
        public static final a w = new a("unexpected-request");
        public static final a x = new a("request-timeout");
        private String y;

        public a(String str) {
            this.y = str;
        }

        public String toString() {
            return this.y;
        }
    }

    public cn(int i, String str, String str2, String str3, String str4, List<cg> list) {
        this.f = null;
        this.a = i;
        this.b = str;
        this.d = str2;
        this.c = str3;
        this.e = str4;
        this.f = list;
    }

    public cn(Bundle bundle) {
        this.f = null;
        this.a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.b = bundle.getString("ext_err_type");
        }
        this.c = bundle.getString("ext_err_cond");
        this.d = bundle.getString("ext_err_reason");
        this.e = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                cg cgVarA = cg.a((Bundle) parcelable);
                if (cgVarA != null) {
                    this.f.add(cgVarA);
                }
            }
        }
    }

    public cn(a aVar) {
        this.f = null;
        b(aVar);
        this.e = null;
    }

    private void b(a aVar) {
        this.c = aVar.y;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.b;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.a);
        String str2 = this.d;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.e;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<cg> list = this.f;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            Iterator<cg> it2 = this.f.iterator();
            while (it2.hasNext()) {
                Bundle bundleA = it2.next().a();
                if (bundleA != null) {
                    bundleArr[i] = bundleA;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3643a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"");
        sb.append(this.a);
        sb.append("\"");
        if (this.b != null) {
            sb.append(" type=\"");
            sb.append(this.b);
            sb.append("\"");
        }
        if (this.d != null) {
            sb.append(" reason=\"");
            sb.append(this.d);
            sb.append("\"");
        }
        sb.append(SearchCriteria.GT);
        if (this.c != null) {
            sb.append(SearchCriteria.LT);
            sb.append(this.c);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.e != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.e);
            sb.append("</text>");
        }
        Iterator<cg> it2 = m3644a().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized List<cg> m3644a() {
        List<cg> list = this.f;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        if (str != null) {
            sb.append(str);
        }
        sb.append("(");
        sb.append(this.a);
        sb.append(")");
        if (this.e != null) {
            sb.append(" ");
            sb.append(this.e);
        }
        return sb.toString();
    }
}
