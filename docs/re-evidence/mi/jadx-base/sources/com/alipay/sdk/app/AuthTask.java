package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.util.e;
import com.alipay.sdk.util.i;
import com.alipay.sdk.util.k;
import com.xiaomi.onetrack.OneTrack;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AuthTask {
    public static final Object c = e.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f5796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.alipay.sdk.widget.a f5797b;

    public AuthTask(Activity activity) {
        this.f5796a = activity;
        com.alipay.sdk.sys.b.a().b(this.f5796a);
        this.f5797b = new com.alipay.sdk.widget.a(activity, "去支付宝授权");
    }

    public final e.c a() {
        return new e.c() { // from class: com.alipay.sdk.app.AuthTask.1
            @Override // com.alipay.sdk.util.e.c
            public void a() {
            }

            @Override // com.alipay.sdk.util.e.c
            public void b() {
                AuthTask.this.g();
            }
        };
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new com.alipay.sdk.sys.a(this.f5796a, str, "auth"), str, z);
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        com.alipay.sdk.sys.a aVar;
        aVar = new com.alipay.sdk.sys.a(this.f5796a, str, "authV2");
        return i.c(aVar, innerAuth(aVar, str, z));
    }

    public final String b(Activity activity, String str, com.alipay.sdk.sys.a aVar) {
        String strB = aVar.b(str);
        List<com.alipay.sdk.data.a.C0118a> listV = com.alipay.sdk.data.a.w().v();
        if (!com.alipay.sdk.data.a.w().g || listV == null) {
            listV = a.d;
        }
        if (!k.v(aVar, this.f5796a, listV)) {
            com.alipay.sdk.app.statistic.a.b(aVar, "biz", "LogCalledH5");
            return e(activity, strB, aVar);
        }
        String strE = new e(activity, aVar, a()).e(strB);
        if (!TextUtils.equals(strE, "failed") && !TextUtils.equals(strE, "scheme_failed")) {
            return TextUtils.isEmpty(strE) ? b.f() : strE;
        }
        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "LogBindCalledH5");
        return e(activity, strB, aVar);
    }

    public final String c(com.alipay.sdk.sys.a aVar, com.alipay.sdk.protocol.b bVar) {
        String[] strArrF = bVar.f();
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrF[0]);
        Intent intent = new Intent(this.f5796a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        com.alipay.sdk.sys.a.C0120a.c(aVar, intent);
        this.f5796a.startActivity(intent);
        Object obj = c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return b.f();
            }
        }
        String strA = b.a();
        return TextUtils.isEmpty(strA) ? b.f() : strA;
    }

    public final String e(Activity activity, String str, com.alipay.sdk.sys.a aVar) {
        c cVarB;
        f();
        try {
            try {
                List<com.alipay.sdk.protocol.b> listA = com.alipay.sdk.protocol.b.a(new com.alipay.sdk.packet.impl.a().b(aVar, activity, str).c().optJSONObject("form").optJSONObject("onload"));
                g();
                for (int i = 0; i < listA.size(); i++) {
                    if (listA.get(i).d() == com.alipay.sdk.protocol.a.WapPay) {
                        String strC = c(aVar, listA.get(i));
                        g();
                        return strC;
                    }
                }
            } catch (Throwable th) {
                g();
                throw th;
            }
        } catch (IOException e) {
            c cVarB2 = c.b(c.NETWORK_ERROR.a());
            com.alipay.sdk.app.statistic.a.f(aVar, OneTrack.Param.NET, e);
            g();
            cVarB = cVarB2;
        } catch (Throwable th2) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "H5AuthDataAnalysisError", th2);
        }
        g();
        cVarB = null;
        if (cVarB == null) {
            cVarB = c.b(c.FAILED.a());
        }
        return b.b(cVarB.a(), cVarB.b(), "");
    }

    public final void f() {
        com.alipay.sdk.widget.a aVar = this.f5797b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void g() {
        com.alipay.sdk.widget.a aVar = this.f5797b;
        if (aVar != null) {
            aVar.f();
        }
    }

    public synchronized String innerAuth(com.alipay.sdk.sys.a aVar, String str, boolean z) {
        String strF;
        Activity activity;
        String str2;
        if (z) {
            try {
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
        com.alipay.sdk.sys.b.a().b(this.f5796a);
        strF = b.f();
        a.b("");
        try {
            try {
                strF = b(this.f5796a, str, aVar);
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturnV", i.a(strF, "resultStatus") + "|" + i.a(strF, "memo"));
                if (!com.alipay.sdk.data.a.w().u()) {
                    com.alipay.sdk.data.a.w().e(aVar, this.f5796a);
                }
                g();
                activity = this.f5796a;
                str2 = aVar.d;
            } catch (Throwable th2) {
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturnV", i.a(strF, "resultStatus") + "|" + i.a(strF, "memo"));
                if (!com.alipay.sdk.data.a.w().u()) {
                    com.alipay.sdk.data.a.w().e(aVar, this.f5796a);
                }
                g();
                com.alipay.sdk.app.statistic.a.g(this.f5796a, aVar, str, aVar.d);
                throw th2;
            }
        } catch (Exception e) {
            com.alipay.sdk.util.c.d(e);
            com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturnV", i.a(strF, "resultStatus") + "|" + i.a(strF, "memo"));
            if (!com.alipay.sdk.data.a.w().u()) {
                com.alipay.sdk.data.a.w().e(aVar, this.f5796a);
            }
            g();
            activity = this.f5796a;
            str2 = aVar.d;
        }
        com.alipay.sdk.app.statistic.a.g(activity, aVar, str, str2);
        return strF;
    }
}
