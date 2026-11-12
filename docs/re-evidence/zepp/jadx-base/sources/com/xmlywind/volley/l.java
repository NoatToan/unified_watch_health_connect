package com.xmlywind.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes22.dex */
public abstract class l<T> implements Comparable<l<T>> {
    public final Object a;
    private final t.a b;
    private final int c;
    private final String d;
    private final int e;
    private n.a f;
    private Integer g;
    private m h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private p m;
    private com.xmlywind.volley.b.a n;
    private Object o;
    private a p;
    private String q;

    public interface a {
        void a(l<?> lVar);

        void a(l<?> lVar, n<?> nVar);
    }

    public enum b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public l(int i, String str, n.a aVar) {
        this.b = t.a.a ? new t.a() : null;
        this.a = new Object();
        this.i = true;
        this.j = false;
        this.k = false;
        this.l = false;
        this.n = null;
        this.c = i;
        this.d = str;
        this.f = aVar;
        a((p) new c());
        this.e = d(str);
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append(com.alipay.sdk.m.n.a.h);
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append(Typography.amp);
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    private static int d(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l<T> lVar) {
        b bVarO = o();
        b bVarO2 = lVar.o();
        return bVarO == bVarO2 ? this.g.intValue() - lVar.g.intValue() : bVarO2.ordinal() - bVarO.ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l<?> a(p pVar) {
        this.m = pVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<?> a(boolean z) {
        this.i = z;
        return this;
    }

    public abstract n<T> a(i iVar);

    public String a() {
        return "application/x-www-form-urlencoded; charset=" + m();
    }

    public void a(n<?> nVar) {
        a aVar;
        synchronized (this.a) {
            aVar = this.p;
        }
        if (aVar != null) {
            aVar.a(this, nVar);
        }
    }

    public void a(s sVar) {
        n.a aVar;
        synchronized (this.a) {
            aVar = this.f;
        }
        if (aVar != null) {
            aVar.onErrorResponse(sVar);
        }
    }

    public abstract void a(T t);

    public void a(String str) {
        if (t.a.a) {
            this.b.a(str, Thread.currentThread().getId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l<?> b(Object obj) {
        this.o = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<?> b(boolean z) {
        this.l = z;
        return this;
    }

    public s b(s sVar) {
        return sVar;
    }

    public void b(final String str) {
        m mVar = this.h;
        if (mVar != null) {
            mVar.b(this);
        }
        if (t.a.a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xmlywind.volley.l.1
                    @Override // java.lang.Runnable
                    public void run() {
                        l.this.b.a(str, id);
                        l.this.b.a(l.this.toString());
                    }
                });
            } else {
                this.b.a(str, id);
                this.b.a(toString());
            }
        }
    }

    public byte[] b() {
        Map<String, String> mapL = l();
        if (mapL == null || mapL.size() <= 0) {
            return null;
        }
        return a(mapL, m());
    }

    public Map<String, String> c() {
        return Collections.emptyMap();
    }

    public void c(String str) {
        this.q = str;
    }

    public int d() {
        return Integer.MIN_VALUE;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.e;
    }

    public String h() {
        String str = this.q;
        return str == null ? this.d : str;
    }

    public com.xmlywind.volley.b.a i() {
        return this.n;
    }

    public void j() {
        synchronized (this.a) {
            this.j = true;
            this.f = null;
        }
    }

    public boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.j;
        }
        return z;
    }

    public Map<String, String> l() {
        return null;
    }

    public String m() {
        return "UTF-8";
    }

    public final boolean n() {
        return this.l;
    }

    public b o() {
        return b.NORMAL;
    }

    public final int p() {
        return r().a();
    }

    public final int q() {
        return r().c();
    }

    public p r() {
        return this.m;
    }

    public void s() {
        synchronized (this.a) {
            this.k = true;
        }
    }

    public boolean t() {
        boolean z;
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(g());
        StringBuilder sb = new StringBuilder();
        sb.append(k() ? "[X] " : "[ ] ");
        sb.append(h());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(o());
        sb.append(" ");
        sb.append(this.g);
        return sb.toString();
    }

    public void u() {
        a aVar;
        synchronized (this.a) {
            aVar = this.p;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }
}
