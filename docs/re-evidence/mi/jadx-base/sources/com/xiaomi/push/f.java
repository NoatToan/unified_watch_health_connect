package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.vxs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14038b;
    public String c;
    public String d;
    public String e;
    public List<vxs> f;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14039b = new a("internal-server-error");
        public static final a c = new a("forbidden");
        public static final a d = new a("bad-request");
        public static final a e = new a("conflict");
        public static final a f = new a("feature-not-implemented");
        public static final a g = new a("gone");
        public static final a h = new a("item-not-found");
        public static final a i = new a("jid-malformed");
        public static final a j = new a("not-acceptable");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f14040k = new a("not-allowed");
        public static final a l = new a("not-authorized");
        public static final a m = new a("payment-required");
        public static final a n = new a("recipient-unavailable");
        public static final a o = new a("redirect");
        public static final a p = new a("registration-required");
        public static final a q = new a("remote-server-error");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f14041r = new a("remote-server-not-found");
        public static final a s = new a("remote-server-timeout");
        public static final a t = new a("resource-constraint");
        public static final a u = new a("service-unavailable");
        public static final a v = new a("subscription-required");
        public static final a w = new a("undefined-condition");
        public static final a x = new a("unexpected-request");
        public static final a y = new a("request-timeout");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14042a;

        public a(String str) {
            this.f14042a = str;
        }

        public String toString() {
            return this.f14042a;
        }
    }

    public f(a aVar) {
        this.f = null;
        d(aVar);
        this.e = null;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f14038b;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f14037a);
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
        List<vxs> list = this.f;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<vxs> it = this.f.iterator();
            int i = 0;
            while (it.hasNext()) {
                Bundle bundleA = it.next().a();
                if (bundleA != null) {
                    bundleArr[i] = bundleA;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"");
        sb.append(this.f14037a);
        sb.append("\"");
        if (this.f14038b != null) {
            sb.append(" type=\"");
            sb.append(this.f14038b);
            sb.append("\"");
        }
        if (this.d != null) {
            sb.append(" reason=\"");
            sb.append(this.d);
            sb.append("\"");
        }
        sb.append(">");
        if (this.c != null) {
            sb.append("<");
            sb.append(this.c);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.e != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.e);
            sb.append("</text>");
        }
        Iterator<vxs> it = c().iterator();
        while (it.hasNext()) {
            sb.append(it.next().d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    public synchronized List<vxs> c() {
        List<vxs> list = this.f;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public final void d(a aVar) {
        this.c = aVar.f14042a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        if (str != null) {
            sb.append(str);
        }
        sb.append("(");
        sb.append(this.f14037a);
        sb.append(")");
        if (this.e != null) {
            sb.append(" ");
            sb.append(this.e);
        }
        return sb.toString();
    }

    public f(int i, String str, String str2, String str3, String str4, List<vxs> list) {
        this.f14037a = i;
        this.f14038b = str;
        this.d = str2;
        this.c = str3;
        this.e = str4;
        this.f = list;
    }

    public f(Bundle bundle) {
        this.f = null;
        this.f14037a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f14038b = bundle.getString("ext_err_type");
        }
        this.c = bundle.getString("ext_err_cond");
        this.d = bundle.getString("ext_err_reason");
        this.e = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                vxs vxsVarC = vxs.c((Bundle) parcelable);
                if (vxsVarC != null) {
                    this.f.add(vxsVarC);
                }
            }
        }
    }
}
