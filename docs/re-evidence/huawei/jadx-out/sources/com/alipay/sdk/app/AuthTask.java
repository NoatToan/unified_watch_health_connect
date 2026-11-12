package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.R;
import com.alipay.sdk.m.l.c;
import com.alipay.sdk.m.u.a;
import com.alipay.sdk.m.x.i;
import defpackage.ka;
import defpackage.mn;
import defpackage.mp;
import defpackage.mu;
import defpackage.mx;
import defpackage.oe;
import defpackage.of;
import defpackage.ol;
import defpackage.on;
import defpackage.oq;
import defpackage.ov;
import defpackage.ox;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes4.dex */
public class AuthTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2060c = i.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f2061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ka f2062b;

    public class d implements i.f {
        public d() {
        }

        @Override // com.alipay.sdk.m.x.i.f
        public void a() {
            AuthTask.this.a();
        }

        @Override // com.alipay.sdk.m.x.i.f
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.f2061a = activity;
        ol.e().b(this.f2061a);
        this.f2062b = new ka(activity, this.f2061a.getString(R.string.loading_go_auth));
    }

    public String auth(String str, boolean z) {
        String strInnerAuth;
        synchronized (this) {
            strInnerAuth = innerAuth(new on(this.f2061a, str, "auth"), str, z);
        }
        return strInnerAuth;
    }

    public Map<String, String> authV2(String str, boolean z) {
        Map<String, String> mapD;
        synchronized (this) {
            on onVar = new on(this.f2061a, str, "authV2");
            mapD = ov.d(onVar, innerAuth(onVar, str, z));
        }
        return mapD;
    }

    public final i.f b() {
        return new d();
    }

    public final void c() {
        ka kaVar = this.f2062b;
        if (kaVar != null) {
            kaVar.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00c1 A[Catch: all -> 0x0137, PHI: r9
      0x00c1: PHI (r9v11 java.lang.String) = (r9v2 java.lang.String), (r9v13 java.lang.String) binds: [B:16:0x00bf, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0006, B:8:0x0020, B:18:0x00ca, B:17:0x00c1, B:21:0x00d6, B:23:0x0123, B:24:0x012c, B:25:0x0136, B:15:0x0074, B:7:0x001a, B:14:0x0071), top: B:31:0x0003, inners: #0, #2 }] */
    public String innerAuth(on onVar, String str, boolean z) {
        String strD;
        synchronized (this) {
            if (z) {
                c();
                ol.e().b(this.f2061a);
                strD = mp.d();
                mn.c("");
                try {
                    try {
                        strD = a(this.f2061a, str, onVar);
                        mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                        mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                        if (!mx.c().x()) {
                            mx.c().a(onVar, this.f2061a, false, 1);
                        }
                    } catch (Exception e) {
                        oq.c(e);
                        mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                        mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                        if (!mx.c().x()) {
                            mx.c().a(onVar, this.f2061a, false, 1);
                        }
                    }
                    a();
                    mu.b(this.f2061a, onVar, str, onVar.f44353a);
                } catch (Throwable th) {
                    mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                    if (!mx.c().x()) {
                        mx.c().a(onVar, this.f2061a, false, 1);
                    }
                    a();
                    mu.b(this.f2061a, onVar, str, onVar.f44353a);
                    throw th;
                }
            } else {
                ol.e().b(this.f2061a);
                strD = mp.d();
                mn.c("");
                strD = a(this.f2061a, str, onVar);
                mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                if (!mx.c().x()) {
                    mx.c().a(onVar, this.f2061a, false, 1);
                }
                a();
                mu.b(this.f2061a, onVar, str, onVar.f44353a);
            }
            throw th;
        }
        return strD;
    }

    public final void a() {
        ka kaVar = this.f2062b;
        if (kaVar != null) {
            kaVar.c();
        }
    }

    public final String b(Activity activity, String str, on onVar) {
        c();
        c cVarA = null;
        try {
            try {
                List<of> listC = of.c(new oe().a(onVar, activity, str).c().optJSONObject("form").optJSONObject("onload"));
                a();
                for (int i = 0; i < listC.size(); i++) {
                    if (listC.get(i).e() == a.WapPay) {
                        String strA = a(onVar, listC.get(i));
                        a();
                        return strA;
                    }
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        } catch (IOException e) {
            c cVarA2 = c.a(c.NETWORK_ERROR.b());
            mu.c(onVar, "net", e);
            cVarA = cVarA2;
            a();
        } catch (Throwable th2) {
            mu.c(onVar, "biz", "H5AuthDataAnalysisError", th2);
            a();
        }
        if (cVarA == null) {
            cVarA = c.a(c.FAILED.b());
        }
        return mp.d(cVarA.b(), cVarA.a(), "");
    }

    public final String a(Activity activity, String str, on onVar) {
        String strB = onVar.b(str);
        List<mx.d> listP = mx.c().p();
        if (!mx.c().o || listP == null) {
            listP = mn.e;
        }
        if (ox.d(onVar, this.f2061a, listP, true)) {
            i iVar = new i(activity, onVar, b());
            String strB2 = iVar.b(strB, false);
            iVar.b();
            if (!TextUtils.equals(strB2, EventType.FAILED) && !TextUtils.equals(strB2, "scheme_failed")) {
                return TextUtils.isEmpty(strB2) ? mp.d() : strB2;
            }
            mu.b(onVar, "biz", "LogBindCalledH5");
            return b(activity, strB, onVar);
        }
        mu.b(onVar, "biz", "LogCalledH5");
        return b(activity, strB, onVar);
    }

    public final String a(on onVar, of ofVar) {
        String[] strArrC = ofVar.c();
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrC[0]);
        Intent intent = new Intent(this.f2061a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        on.b.d(onVar, intent);
        this.f2061a.startActivity(intent);
        Object obj = f2060c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return mp.d();
            }
        }
        String strA = mp.a();
        return TextUtils.isEmpty(strA) ? mp.d() : strA;
    }
}
