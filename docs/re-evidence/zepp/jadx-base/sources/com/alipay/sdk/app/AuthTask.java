package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.j.c;
import com.alipay.sdk.m.s.b;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.h;
import com.alipay.sdk.m.u.l;
import com.alipay.sdk.m.u.n;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AuthTask {
    public static final Object c = h.class;
    public Activity a;
    public com.alipay.sdk.m.x.a b;

    public class a implements h.e {
        public a() {
        }

        @Override // com.alipay.sdk.m.u.h.e
        public void a() {
            AuthTask.this.c();
        }

        @Override // com.alipay.sdk.m.u.h.e
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.a = activity;
        b.d().a(this.a);
        this.b = new com.alipay.sdk.m.x.a(activity, com.alipay.sdk.m.x.a.k);
    }

    private String b(com.alipay.sdk.m.s.a aVar, com.alipay.sdk.m.r.b bVar) {
        String[] strArrC = bVar.c();
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrC[0]);
        Intent intent = new Intent(this.a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        com.alipay.sdk.m.s.a.C0094a.a(aVar, intent);
        this.a.startActivity(intent);
        Object obj = c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return com.alipay.sdk.m.j.b.a();
            }
        }
        String strD = com.alipay.sdk.m.j.b.d();
        return TextUtils.isEmpty(strD) ? com.alipay.sdk.m.j.b.a() : strD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.alipay.sdk.m.x.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    private h.e d() {
        return new a();
    }

    private String e(Activity activity, String str, com.alipay.sdk.m.s.a aVar) {
        f();
        c cVarB = null;
        try {
            try {
                List<com.alipay.sdk.m.r.b> listA = com.alipay.sdk.m.r.b.a(new com.alipay.sdk.m.q.a().a(aVar, activity, str).c().optJSONObject(com.alipay.sdk.m.l.c.c).optJSONObject(com.alipay.sdk.m.l.c.d));
                c();
                for (int i = 0; i < listA.size(); i++) {
                    if (listA.get(i).a() == com.alipay.sdk.m.r.a.WapPay) {
                        String strB = b(aVar, listA.get(i));
                        c();
                        return strB;
                    }
                }
                c();
            } catch (Throwable th) {
                c();
                throw th;
            }
        } catch (IOException e) {
            c cVarB2 = c.b(c.NETWORK_ERROR.b());
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.k, e);
            cVarB = cVarB2;
            c();
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.B, th2);
            c();
        }
        if (cVarB == null) {
            cVarB = c.b(c.FAILED.b());
        }
        return com.alipay.sdk.m.j.b.a(cVarB.b(), cVarB.a(), "");
    }

    private void f() {
        com.alipay.sdk.m.x.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new com.alipay.sdk.m.s.a(this.a, str, "auth"), str, z);
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        com.alipay.sdk.m.s.a aVar;
        aVar = new com.alipay.sdk.m.s.a(this.a, str, "authV2");
        return l.a(aVar, innerAuth(aVar, str, z));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00c3 A[Catch: all -> 0x013a, PHI: r9
      0x00c3: PHI (r9v11 java.lang.String) = (r9v2 java.lang.String), (r9v13 java.lang.String) binds: [B:16:0x00c1, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0006, B:8:0x0020, B:18:0x00cc, B:17:0x00c3, B:21:0x00d8, B:23:0x0126, B:24:0x012f, B:25:0x0139, B:15:0x0075, B:7:0x001a, B:14:0x0072), top: B:29:0x0003, inners: #1, #2 }] */
    public synchronized String innerAuth(com.alipay.sdk.m.s.a aVar, String str, boolean z) {
        String strA;
        if (z) {
            f();
            b.d().a(this.a);
            strA = com.alipay.sdk.m.j.b.a();
            com.alipay.sdk.m.j.a.a("");
            try {
                try {
                    strA = a(this.a, str, aVar);
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, l.a(strA, l.a) + AESEncryptionHelper.SEPARATOR + l.a(strA, l.b));
                    if (!com.alipay.sdk.m.m.a.z().r()) {
                        com.alipay.sdk.m.m.a.z().a(aVar, this.a, false, 1);
                    }
                } catch (Exception e) {
                    e.a(e);
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, l.a(strA, l.a) + AESEncryptionHelper.SEPARATOR + l.a(strA, l.b));
                    if (!com.alipay.sdk.m.m.a.z().r()) {
                        com.alipay.sdk.m.m.a.z().a(aVar, this.a, false, 1);
                    }
                }
                c();
                com.alipay.sdk.m.k.a.b(this.a, aVar, str, aVar.d);
            } catch (Throwable th) {
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, l.a(strA, l.a) + AESEncryptionHelper.SEPARATOR + l.a(strA, l.b));
                if (!com.alipay.sdk.m.m.a.z().r()) {
                    com.alipay.sdk.m.m.a.z().a(aVar, this.a, false, 1);
                }
                c();
                com.alipay.sdk.m.k.a.b(this.a, aVar, str, aVar.d);
                throw th;
            }
        } else {
            b.d().a(this.a);
            strA = com.alipay.sdk.m.j.b.a();
            com.alipay.sdk.m.j.a.a("");
            strA = a(this.a, str, aVar);
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, l.a(strA, l.a) + AESEncryptionHelper.SEPARATOR + l.a(strA, l.b));
            if (!com.alipay.sdk.m.m.a.z().r()) {
                com.alipay.sdk.m.m.a.z().a(aVar, this.a, false, 1);
            }
            c();
            com.alipay.sdk.m.k.a.b(this.a, aVar, str, aVar.d);
        }
        throw th;
        return strA;
    }

    private String a(Activity activity, String str, com.alipay.sdk.m.s.a aVar) {
        String strA = aVar.a(str);
        List<com.alipay.sdk.m.m.a.b> listL = com.alipay.sdk.m.m.a.z().l();
        if (!com.alipay.sdk.m.m.a.z().g || listL == null) {
            listL = com.alipay.sdk.m.j.a.d;
        }
        if (!n.a(aVar, (Context) this.a, listL, true)) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.f0);
            return e(activity, strA, aVar);
        }
        h hVar = new h(activity, aVar, d());
        String strA2 = hVar.a(strA, false);
        hVar.a();
        if (!TextUtils.equals(strA2, "failed") && !TextUtils.equals(strA2, h.k)) {
            return TextUtils.isEmpty(strA2) ? com.alipay.sdk.m.j.b.a() : strA2;
        }
        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.e0);
        return e(activity, strA, aVar);
    }
}
