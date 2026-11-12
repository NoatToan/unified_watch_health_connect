package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import lh.a;
import lh.b;
import nh.d;
import nh.i;
import nh.m;
import nh.n;
import org.json.JSONObject;
import ph.c;

/* JADX INFO: loaded from: classes7.dex */
public class AuthTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28404c = i.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f28405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f28406b;

    public AuthTask(Activity activity) {
        this.f28405a = activity;
        b bVarB = b.b();
        Activity activity2 = this.f28405a;
        bVarB.getClass();
        ah.b.c();
        bVarB.f112390a = activity2.getApplicationContext();
        this.f28406b = new c(activity, this.f28405a.getString(R.string.loading_go_auth));
    }

    public final String a(Activity activity, a aVar, String str) {
        String strA = aVar.a(str);
        ArrayList arrayList = ah.a.g().f3268x;
        ah.a.g().getClass();
        if (!n.j(aVar, this.f28405a, ug.a.f170550d, true)) {
            wg.a.b("LogCalledH5", aVar);
            return d(activity, aVar, strA);
        }
        i iVar = new i(activity, aVar, new fg.a(this));
        String strC = iVar.c(strA, false);
        iVar.f126122a = null;
        iVar.f126125d = null;
        if (!TextUtils.equals(strC, "failed") && !TextUtils.equals(strC, "scheme_failed")) {
            return TextUtils.isEmpty(strC) ? ug.b.a() : strC;
        }
        wg.a.b("LogBindCalledH5", aVar);
        return d(activity, aVar, strA);
    }

    public synchronized String auth(String str, boolean z14) {
        return innerAuth(new a(this.f28405a, str, "auth"), str, z14);
    }

    public synchronized Map<String, String> authV2(String str, boolean z14) {
        a aVar;
        aVar = new a(this.f28405a, str, "authV2");
        return m.c(innerAuth(aVar, str, z14), aVar);
    }

    public final String b(a aVar, jh.b bVar) {
        String[] strArr = bVar.f98746b;
        Bundle bundle = new Bundle();
        bundle.putString("url", strArr[0]);
        Intent intent = new Intent(this.f28405a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        a.C2158a.b(aVar, intent);
        this.f28405a.startActivity(intent);
        Object obj = f28404c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return ug.b.a();
            }
        }
        String str = ug.b.f170552b;
        return TextUtils.isEmpty(str) ? ug.b.a() : str;
    }

    public final void c() {
        Activity activity;
        c cVar = this.f28406b;
        if (cVar == null || (activity = cVar.f137648b) == null) {
            return;
        }
        activity.runOnUiThread(new ph.b(cVar));
    }

    public final String d(Activity activity, a aVar, String str) {
        JSONObject jSONObject;
        Activity activity2;
        c cVar = this.f28406b;
        if (cVar != null && (activity2 = cVar.f137648b) != null) {
            activity2.runOnUiThread(new ph.a(cVar));
        }
        ug.c cVarA = null;
        try {
            try {
                try {
                    String str2 = new hh.a().a(activity, str, aVar).f71573b;
                    if (TextUtils.isEmpty(str2)) {
                        jSONObject = null;
                    } else {
                        try {
                            jSONObject = new JSONObject(str2);
                        } catch (Exception e4) {
                            d.a(e4);
                            jSONObject = null;
                        }
                    }
                    ArrayList arrayListA = jh.b.a(jSONObject.optJSONObject("form").optJSONObject("onload"));
                    c();
                    for (int i14 = 0; i14 < arrayListA.size(); i14++) {
                        if (((jh.b) arrayListA.get(i14)).f98745a == jh.a.WapPay) {
                            String strB = b(aVar, (jh.b) arrayListA.get(i14));
                            c();
                            return strB;
                        }
                    }
                    c();
                } catch (Throwable th3) {
                    wg.a.d(aVar, "biz", "H5AuthDataAnalysisError", th3);
                    c();
                }
            } catch (IOException e14) {
                cVarA = ug.c.a(ug.c.NETWORK_ERROR.f170562a);
                if (aVar != null) {
                    wg.c cVar2 = aVar.f112386k;
                    String simpleName = e14.getClass().getSimpleName();
                    cVar2.getClass();
                    cVar2.f("net", simpleName, wg.c.c(e14));
                }
                c();
            }
            if (cVarA == null) {
                cVarA = ug.c.a(ug.c.FAILED.f170562a);
            }
            return ug.b.b(cVarA.f170562a, cVarA.f170563b, "");
        } catch (Throwable th4) {
            c();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d4 A[Catch: all -> 0x0084, PHI: r10
      0x00d4: PHI (r10v12 java.lang.String) = (r10v3 java.lang.String), (r10v14 java.lang.String) binds: [B:23:0x00d2, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000d, B:9:0x0011, B:10:0x0019, B:13:0x003c, B:25:0x00dd, B:24:0x00d4, B:28:0x00e9, B:30:0x0130, B:31:0x0139, B:32:0x0143, B:22:0x008d, B:12:0x0036, B:21:0x008a), top: B:35:0x0009, inners: #1, #2 }] */
    public synchronized String innerAuth(a aVar, String str, boolean z14) {
        Activity activity;
        String strA;
        if (z14) {
            c cVar = this.f28406b;
            if (cVar != null && (activity = cVar.f137648b) != null) {
                activity.runOnUiThread(new ph.a(cVar));
            }
            b bVarB = b.b();
            Activity activity2 = this.f28405a;
            bVarB.getClass();
            ah.b.c();
            bVarB.f112390a = activity2.getApplicationContext();
            strA = ug.b.a();
            ug.a.a("");
            try {
                try {
                    strA = a(this.f28405a, aVar, str);
                    wg.a.c(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    wg.a.c(aVar, "biz", "PgReturnV", m.a(strA, "resultStatus") + "|" + m.a(strA, "memo"));
                    if (!ah.a.g().f3258n) {
                        ah.a.g().c(aVar, this.f28405a, false, 1);
                    }
                } catch (Exception e4) {
                    d.a(e4);
                    wg.a.c(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    wg.a.c(aVar, "biz", "PgReturnV", m.a(strA, "resultStatus") + "|" + m.a(strA, "memo"));
                    if (!ah.a.g().f3258n) {
                        ah.a.g().c(aVar, this.f28405a, false, 1);
                    }
                }
                c();
                wg.a.f(str, aVar.f112379d, this.f28405a, aVar);
            } catch (Throwable th3) {
                wg.a.c(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                wg.a.c(aVar, "biz", "PgReturnV", m.a(strA, "resultStatus") + "|" + m.a(strA, "memo"));
                if (!ah.a.g().f3258n) {
                    ah.a.g().c(aVar, this.f28405a, false, 1);
                }
                c();
                wg.a.f(str, aVar.f112379d, this.f28405a, aVar);
                throw th3;
            }
        } else {
            b bVarB2 = b.b();
            Activity activity3 = this.f28405a;
            bVarB2.getClass();
            ah.b.c();
            bVarB2.f112390a = activity3.getApplicationContext();
            strA = ug.b.a();
            ug.a.a("");
            strA = a(this.f28405a, aVar, str);
            wg.a.c(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
            wg.a.c(aVar, "biz", "PgReturnV", m.a(strA, "resultStatus") + "|" + m.a(strA, "memo"));
            if (!ah.a.g().f3258n) {
                ah.a.g().c(aVar, this.f28405a, false, 1);
            }
            c();
            wg.a.f(str, aVar.f112379d, this.f28405a, aVar);
        }
        throw th;
        return strA;
    }
}
