package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.q.f;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.h;
import com.alipay.sdk.m.u.i;
import com.alipay.sdk.m.u.l;
import com.alipay.sdk.m.u.n;
import com.alipay.sdk.util.H5PayResultModel;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PayTask {
    public static final Object h = h.class;
    public static long i;
    public Activity a;
    public com.alipay.sdk.m.x.a b;
    public final String c = "wappaygw.alipay.com/service/rest.htm";
    public final String d = "mclient.alipay.com/service/rest.htm";
    public final String e = "mclient.alipay.com/home/exterfaceAssign.htm";
    public final String f = "mclient.alipay.com/cashier/mobilepay.htm";
    public Map<String, c> g = new HashMap();

    public class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ H5PayCallback c;

        public a(String str, boolean z, H5PayCallback h5PayCallback) {
            this.a = str;
            this.b = z;
            this.c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            H5PayResultModel h5PayResultModelH5Pay = PayTask.this.h5Pay(new com.alipay.sdk.m.s.a(PayTask.this.a, this.a, "payInterceptorWithUrl"), this.a, this.b);
            e.d(com.alipay.sdk.m.l.a.z, "inc finished: " + h5PayResultModelH5Pay.getResultCode());
            this.c.onPayResult(h5PayResultModelH5Pay);
        }
    }

    public class b implements h.e {
        public b() {
        }

        @Override // com.alipay.sdk.m.u.h.e
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // com.alipay.sdk.m.u.h.e
        public void b() {
        }
    }

    public class c {
        public String a;
        public String b;
        public String c;
        public String d;

        public c() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public String a() {
            return this.c;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public String d() {
            return this.d;
        }

        public void a(String str) {
            this.c = str;
        }

        public void b(String str) {
            this.a = str;
        }

        public void c(String str) {
            this.b = str;
        }

        public void d(String str) {
            this.d = str;
        }

        public /* synthetic */ c(PayTask payTask, a aVar) {
            this();
        }
    }

    public PayTask(Activity activity) {
        this.a = activity;
        com.alipay.sdk.m.s.b.d().a(this.a);
        this.b = new com.alipay.sdk.m.x.a(activity, com.alipay.sdk.m.x.a.j);
    }

    private h.e b() {
        return new b();
    }

    private String c(com.alipay.sdk.m.s.a aVar, com.alipay.sdk.m.r.b bVar) {
        String[] strArrC = bVar.c();
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrC[0]);
        if (strArrC.length == 2) {
            bundle.putString(AbstractJSONTokenResponse.COOKIE, strArrC[1]);
        }
        intent.putExtras(bundle);
        com.alipay.sdk.m.s.a.C0094a.a(aVar, intent);
        this.a.startActivity(intent);
        Object obj = h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.a(e);
                return com.alipay.sdk.m.j.b.a();
            }
        }
        String strD = com.alipay.sdk.m.j.b.d();
        return TextUtils.isEmpty(strD) ? com.alipay.sdk.m.j.b.a() : strD;
    }

    private String d(com.alipay.sdk.m.s.a aVar, com.alipay.sdk.m.r.b bVar, String str) {
        boolean zC;
        String strD;
        String[] strArrC = bVar.c();
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectH = n.h(new String(com.alipay.sdk.m.n.a.a(strArrC[2])));
            intent.putExtra("url", strArrC[0]);
            intent.putExtra("title", strArrC[1]);
            intent.putExtra("version", "v2");
            intent.putExtra("method", jSONObjectH.optString("method", "POST"));
            com.alipay.sdk.m.j.b.a(false);
            com.alipay.sdk.m.j.b.a((String) null);
            com.alipay.sdk.m.s.a.C0094a.a(aVar, intent);
            this.a.startActivity(intent);
            Object obj = h;
            synchronized (obj) {
                try {
                    obj.wait();
                    zC = com.alipay.sdk.m.j.b.c();
                    strD = com.alipay.sdk.m.j.b.d();
                    com.alipay.sdk.m.j.b.a(false);
                    com.alipay.sdk.m.j.b.a((String) null);
                } catch (InterruptedException e) {
                    e.a(e);
                    return com.alipay.sdk.m.j.b.a();
                }
            }
            String strA = "";
            if (zC) {
                try {
                    List<com.alipay.sdk.m.r.b> listA = com.alipay.sdk.m.r.b.a(n.h(new String(com.alipay.sdk.m.n.a.a(strD))));
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        com.alipay.sdk.m.r.b bVar2 = listA.get(i2);
                        if (bVar2.a() == com.alipay.sdk.m.r.a.SetResult) {
                            String[] strArrC2 = bVar2.c();
                            strA = com.alipay.sdk.m.j.b.a(Integer.valueOf(strArrC2[1]).intValue(), strArrC2[0], n.e(aVar, strArrC2[2]));
                            break;
                        }
                    }
                } catch (Throwable th) {
                    e.a(th);
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.A, th, strD);
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
            try {
                return com.alipay.sdk.m.j.b.a(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th2) {
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.A, th2, "endCode: " + str);
                return com.alipay.sdk.m.j.b.a(8000, "", "");
            }
        } catch (Throwable th3) {
            e.a(th3);
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.A, th3, Arrays.toString(strArrC));
            return com.alipay.sdk.m.j.b.a();
        }
    }

    private String e(com.alipay.sdk.m.s.a aVar, String str) {
        showLoading();
        com.alipay.sdk.m.j.c cVarB = null;
        try {
            try {
                try {
                    JSONObject jSONObjectC = new f().a(aVar, this.a.getApplicationContext(), str).c();
                    String strOptString = jSONObjectC.optString("end_code", null);
                    List<com.alipay.sdk.m.r.b> listA = com.alipay.sdk.m.r.b.a(jSONObjectC.optJSONObject(com.alipay.sdk.m.l.c.c).optJSONObject(com.alipay.sdk.m.l.c.d));
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        if (listA.get(i2).a() == com.alipay.sdk.m.r.a.Update) {
                            com.alipay.sdk.m.r.b.a(listA.get(i2));
                        }
                    }
                    j(aVar, jSONObjectC);
                    dismissLoading();
                    com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
                    for (int i3 = 0; i3 < listA.size(); i3++) {
                        com.alipay.sdk.m.r.b bVar = listA.get(i3);
                        if (bVar.a() == com.alipay.sdk.m.r.a.WapPay) {
                            String strC = c(aVar, bVar);
                            dismissLoading();
                            com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
                            return strC;
                        }
                        if (bVar.a() == com.alipay.sdk.m.r.a.OpenWeb) {
                            String strD = d(aVar, bVar, strOptString);
                            dismissLoading();
                            com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
                            return strD;
                        }
                    }
                    dismissLoading();
                    com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
                } catch (IOException e) {
                    com.alipay.sdk.m.j.c cVarB2 = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.NETWORK_ERROR.b());
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.k, e);
                    dismissLoading();
                    com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
                    cVarB = cVarB2;
                }
            } catch (Throwable th) {
                e.a(th);
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.A, th);
                dismissLoading();
                com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
            }
            if (cVarB == null) {
                cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.FAILED.b());
            }
            return com.alipay.sdk.m.j.b.a(cVarB.b(), cVarB.a(), "");
        } catch (Throwable th2) {
            dismissLoading();
            com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[Catch: all -> 0x01ff, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[Catch: all -> 0x01ff, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[Catch: all -> 0x01ff, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[Catch: all -> 0x01ff, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[Catch: all -> 0x01ff, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074 A[Catch: all -> 0x01ff, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0161 A[Catch: all -> 0x01ff, PHI: r9
      0x0161: PHI (r9v18 java.lang.String) = (r9v17 java.lang.String), (r9v20 java.lang.String) binds: [B:34:0x015f, B:29:0x0108] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f A[Catch: all -> 0x01ff, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[Catch: all -> 0x01ff, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016e, B:35:0x0161, B:33:0x0113, B:40:0x0195, B:42:0x01e3, B:43:0x01f0, B:44:0x01fe, B:11:0x0043, B:32:0x010c, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    private synchronized String f(com.alipay.sdk.m.s.a aVar, String str, boolean z) {
        String strA;
        String strSubstring;
        int iIndexOf;
        if (z) {
            showLoading();
            if (str.contains("payment_inst=")) {
                strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
                iIndexOf = strSubstring.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                com.alipay.sdk.m.j.a.a(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                com.alipay.sdk.m.j.a.a("");
            }
            if (str.contains(com.alipay.sdk.m.l.a.v)) {
                com.alipay.sdk.m.l.a.w = true;
            }
            if (com.alipay.sdk.m.l.a.w) {
                if (str.startsWith(com.alipay.sdk.m.l.a.x)) {
                    str = str.substring(str.indexOf(com.alipay.sdk.m.l.a.x) + 53);
                } else if (str.startsWith(com.alipay.sdk.m.l.a.y)) {
                    str = str.substring(str.indexOf(com.alipay.sdk.m.l.a.y) + 52);
                }
            }
            strA = "";
            try {
                e.d(com.alipay.sdk.m.l.a.z, "pay prepared: " + str);
                strA = g(str, aVar);
                e.d(com.alipay.sdk.m.l.a.z, "pay raw result: " + strA);
                i.a(aVar, this.a.getApplicationContext(), strA);
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, l.a(strA, l.a) + AESEncryptionHelper.SEPARATOR + l.a(strA, l.b));
                if (!com.alipay.sdk.m.m.a.z().r()) {
                    com.alipay.sdk.m.m.a.z().a(aVar, this.a.getApplicationContext(), false, 3);
                }
            } catch (Throwable th) {
                try {
                    strA = com.alipay.sdk.m.j.b.a();
                    e.a(th);
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, l.a(strA, l.a) + AESEncryptionHelper.SEPARATOR + l.a(strA, l.b));
                    if (!com.alipay.sdk.m.m.a.z().r()) {
                        com.alipay.sdk.m.m.a.z().a(aVar, this.a.getApplicationContext(), false, 3);
                    }
                } catch (Throwable th2) {
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, l.a(strA, l.a) + AESEncryptionHelper.SEPARATOR + l.a(strA, l.b));
                    if (!com.alipay.sdk.m.m.a.z().r()) {
                        com.alipay.sdk.m.m.a.z().a(aVar, this.a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    com.alipay.sdk.m.k.a.b(this.a.getApplicationContext(), aVar, str, aVar.d);
                    throw th2;
                }
            }
            dismissLoading();
            com.alipay.sdk.m.k.a.b(this.a.getApplicationContext(), aVar, str, aVar.d);
            e.d(com.alipay.sdk.m.l.a.z, "pay returning: " + strA);
        } else {
            if (str.contains("payment_inst=")) {
                strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
                iIndexOf = strSubstring.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                com.alipay.sdk.m.j.a.a(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                com.alipay.sdk.m.j.a.a("");
            }
            if (str.contains(com.alipay.sdk.m.l.a.v)) {
                com.alipay.sdk.m.l.a.w = true;
            }
            if (com.alipay.sdk.m.l.a.w) {
                if (str.startsWith(com.alipay.sdk.m.l.a.x)) {
                    str = str.substring(str.indexOf(com.alipay.sdk.m.l.a.x) + 53);
                } else if (str.startsWith(com.alipay.sdk.m.l.a.y)) {
                    str = str.substring(str.indexOf(com.alipay.sdk.m.l.a.y) + 52);
                }
            }
            strA = "";
            e.d(com.alipay.sdk.m.l.a.z, "pay prepared: " + str);
            strA = g(str, aVar);
            e.d(com.alipay.sdk.m.l.a.z, "pay raw result: " + strA);
            i.a(aVar, this.a.getApplicationContext(), strA);
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, l.a(strA, l.a) + AESEncryptionHelper.SEPARATOR + l.a(strA, l.b));
            if (!com.alipay.sdk.m.m.a.z().r()) {
                com.alipay.sdk.m.m.a.z().a(aVar, this.a.getApplicationContext(), false, 3);
            }
            dismissLoading();
            com.alipay.sdk.m.k.a.b(this.a.getApplicationContext(), aVar, str, aVar.d);
            e.d(com.alipay.sdk.m.l.a.z, "pay returning: " + strA);
        }
        throw th;
        return strA;
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            com.alipay.sdk.m.s.b.d().a(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - i < com.alipay.sdk.m.m.a.z().d()) {
                return false;
            }
            i = jElapsedRealtime;
            com.alipay.sdk.m.m.a.z().a(com.alipay.sdk.m.s.a.f(), context.getApplicationContext(), false, 4);
            return true;
        } catch (Exception e) {
            e.a(e);
            return false;
        }
        throw th;
    }

    private String g(String str, com.alipay.sdk.m.s.a aVar) {
        String strA = aVar.a(str);
        if (strA.contains("paymethod=\"expressGateway\"")) {
            return e(aVar, strA);
        }
        List<com.alipay.sdk.m.m.a.b> listL = com.alipay.sdk.m.m.a.z().l();
        if (!com.alipay.sdk.m.m.a.z().g || listL == null) {
            listL = com.alipay.sdk.m.j.a.d;
        }
        if (!n.a(aVar, (Context) this.a, listL, true)) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.f0);
            return e(aVar, strA);
        }
        h hVar = new h(this.a, aVar, b());
        e.d(com.alipay.sdk.m.l.a.z, "pay inner started: " + strA);
        String strA2 = hVar.a(strA, false);
        if (!TextUtils.isEmpty(strA2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("resultStatus={");
            com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.ACTIVITY_NOT_START_EXIT;
            sb.append(cVar.b());
            sb.append(i.d);
            if (strA2.contains(sb.toString())) {
                n.a("alipaySdk", com.alipay.sdk.m.l.b.q, this.a, aVar);
                if (com.alipay.sdk.m.m.a.z().w()) {
                    strA2 = hVar.a(strA, true);
                } else {
                    strA2 = strA2.replace("resultStatus={" + cVar.b() + i.d, "resultStatus={" + com.alipay.sdk.m.j.c.CANCELED.b() + i.d);
                }
            }
        }
        e.d(com.alipay.sdk.m.l.a.z, "pay inner raw result: " + strA2);
        hVar.a();
        if (TextUtils.equals(strA2, "failed") || TextUtils.equals(strA2, h.k)) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.e0);
            return e(aVar, strA);
        }
        if (TextUtils.isEmpty(strA2)) {
            return com.alipay.sdk.m.j.b.a();
        }
        if (!strA2.contains(PayResultActivity.b)) {
            return strA2;
        }
        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.g0);
        return a(aVar, strA, listL, strA2, this.a);
    }

    private String h(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(i.d));
    }

    private String i(String str, Map<String, String> map) throws UnsupportedEncodingException {
        boolean zEquals = "9000".equals(map.get(l.a));
        String str2 = map.get("result");
        c cVarRemove = this.g.remove(str);
        String[] strArr = new String[2];
        strArr[0] = cVarRemove != null ? cVarRemove.a() : "";
        strArr[1] = cVarRemove != null ? cVarRemove.d() : "";
        a(strArr);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strA = a(n.a("&callBackUrl=\"", "\"", str2), n.a("&call_back_url=\"", "\"", str2), n.a(com.alipay.sdk.m.l.a.t, "\"", str2), URLDecoder.decode(n.a(com.alipay.sdk.m.l.a.u, com.alipay.sdk.m.s.a.l, str2), "utf-8"), URLDecoder.decode(n.a("&callBackUrl=", com.alipay.sdk.m.s.a.l, str2), "utf-8"), n.a("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        if (cVarRemove != null) {
            String strB = zEquals ? cVarRemove.b() : cVarRemove.c();
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
        }
        return cVarRemove != null ? com.alipay.sdk.m.m.a.z().q() : "";
    }

    private void j(com.alipay.sdk.m.s.a aVar, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString(com.alipay.sdk.m.t.a.j);
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            com.alipay.sdk.m.t.a.a(com.alipay.sdk.m.s.b.d().b()).a(strOptString, strOptString2);
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.O, th);
        }
    }

    private boolean k(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i2];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i2++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        }
        if (!z) {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
            return true;
        }
        sb.append(com.alipay.sdk.m.s.a.l);
        sb.append(str);
        sb.append("=\"");
        sb.append(str2);
        sb.append("\"");
        return true;
    }

    public void dismissLoading() {
        com.alipay.sdk.m.x.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
            this.b = null;
        }
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + n.a("<request_token>", "</request_token>", n.b(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.a) + "\"";
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + n.a("<request_token>", "</request_token>", n.b(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.a) + "\"";
                    }
                }
                if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", a(this.a));
                    return com.alipay.sdk.m.s.a.A + jSONObject.toString();
                }
                a aVar = null;
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strA = n.a("?", "", str);
                    if (!TextUtils.isEmpty(strA)) {
                        Map<String, String> mapB = n.b(strA);
                        StringBuilder sb = new StringBuilder();
                        if (k(false, true, com.alipay.sdk.m.k.b.x0, sb, mapB, com.alipay.sdk.m.k.b.x0, "alipay_trade_no")) {
                            k(true, false, "pay_phase_id", sb, mapB, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str2 = mapB.get("app_name");
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(mapB.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(mapB.get("sid")) || !TextUtils.isEmpty(mapB.get("s_id")))) {
                                str2 = com.google.android.exoplayer2.text.ttml.b.s0;
                            }
                            sb.append("&app_name=\"" + str2 + "\"");
                            if (!k(true, true, "extern_token", sb, mapB, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            k(true, false, "appenv", sb, mapB, "appenv");
                            sb.append("&pay_channel_id=\"alipay_sdk\"");
                            c cVar = new c(this, aVar);
                            cVar.b(mapB.get("return_url"));
                            cVar.c(mapB.get("show_url"));
                            cVar.a(mapB.get("pay_order_id"));
                            String str3 = sb.toString() + "&bizcontext=\"" + a(this.a) + "\"";
                            this.g.put(str3, cVar);
                            return str3;
                        }
                    }
                }
                if (!strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!EnvUtils.isSandBox() || !strTrim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (com.alipay.sdk.m.m.a.z().h() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                        Uri uri = Uri.parse(strTrim);
                        String queryParameter = uri.getQueryParameter("return_url");
                        String queryParameter2 = uri.getQueryParameter("show_url");
                        String queryParameter3 = uri.getQueryParameter("pay_order_id");
                        String strA2 = a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                        String strA3 = a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                        String[] strArr = new String[4];
                        strArr[0] = uri.getQueryParameter("app_name");
                        strArr[1] = !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "";
                        strArr[2] = !TextUtils.isEmpty(uri.getQueryParameter("sid")) ? com.google.android.exoplayer2.text.ttml.b.s0 : "";
                        strArr[3] = !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? com.google.android.exoplayer2.text.ttml.b.s0 : "";
                        String strA4 = a(strArr);
                        String strA5 = a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter("sid"), uri.getQueryParameter("s_id"));
                        String strA6 = a(uri.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(strA2) && !TextUtils.isEmpty(strA4) && !TextUtils.isEmpty(strA5)) {
                            String str4 = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", strA2, strA3, strA4, strA5, strA6, a(this.a));
                            c cVar2 = new c(this, null);
                            cVar2.b(queryParameter);
                            cVar2.c(queryParameter2);
                            cVar2.a(queryParameter3);
                            cVar2.d(strA2);
                            this.g.put(str4, cVar2);
                            return str4;
                        }
                    }
                }
                String strA7 = a(this.a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", strTrim);
                jSONObject2.put("bizcontext", strA7);
                return String.format("new_external_info==%s", jSONObject2.toString());
            }
        } catch (Throwable th) {
            e.a(th);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return i.a(new com.alipay.sdk.m.s.a(this.a, "", "fetchTradeToken"), this.a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.09";
    }

    public synchronized H5PayResultModel h5Pay(com.alipay.sdk.m.s.a aVar, String str, boolean z) {
        H5PayResultModel h5PayResultModel;
        h5PayResultModel = new H5PayResultModel();
        try {
            String[] strArrSplit = f(aVar, str, z).split(";");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    map.put(strSubstring, h(str2, strSubstring));
                }
            }
            if (map.containsKey(l.a)) {
                h5PayResultModel.setResultCode(map.get(l.a));
            }
            h5PayResultModel.setReturnUrl(i(str, map));
            if (TextUtils.isEmpty(h5PayResultModel.getReturnUrl())) {
                com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.j0, "");
            }
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.k0, th);
            e.a(th);
        }
        return h5PayResultModel;
    }

    public synchronized String pay(String str, boolean z) {
        if (com.alipay.sdk.m.u.b.a()) {
            return com.alipay.sdk.m.j.b.b();
        }
        return f(new com.alipay.sdk.m.s.a(this.a, str, "pay"), str, z);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String strFetchOrderInfoFromH5PayUrl;
        strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
            e.d(com.alipay.sdk.m.l.a.z, "intercepted: " + strFetchOrderInfoFromH5PayUrl);
            new Thread(new a(strFetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        String strF;
        com.alipay.sdk.m.s.a aVar;
        if (com.alipay.sdk.m.u.b.a()) {
            aVar = null;
            strF = com.alipay.sdk.m.j.b.b();
        } else {
            com.alipay.sdk.m.s.a aVar2 = new com.alipay.sdk.m.s.a(this.a, str, "payV2");
            strF = f(aVar2, str, z);
            aVar = aVar2;
        }
        return l.a(aVar, strF);
    }

    public void showLoading() {
        com.alipay.sdk.m.x.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public static String a(Context context) {
        String str;
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = packageInfo.packageName;
            } catch (Exception e) {
                e = e;
                e.a(e);
                str2 = "";
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.alipay.sdk.m.s.a.p, com.alipay.sdk.m.l.a.f);
            jSONObject.put(com.alipay.sdk.m.s.a.q, "and_lite");
            jSONObject.put(com.alipay.sdk.m.s.a.r, "h.a.3.8.09");
            jSONObject.put(com.alipay.sdk.m.s.a.s, str2);
            jSONObject.put(com.alipay.sdk.m.s.a.u, str);
            jSONObject.put(com.alipay.sdk.m.s.a.v, System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            e.a(th);
            return "";
        }
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static String a(com.alipay.sdk.m.s.a aVar, String str, List<com.alipay.sdk.m.m.a.b> list, String str2, Activity activity) {
        n.c cVarA = n.a(aVar, activity, list);
        if (cVarA == null || cVarA.a(aVar) || cVarA.a() || !TextUtils.equals(cVarA.a.packageName, PayResultActivity.d)) {
            return str2;
        }
        e.b(com.alipay.sdk.m.l.a.z, "PayTask not_login");
        String strValueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> map = PayResultActivity.c;
        map.put(strValueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra(PayResultActivity.f, str);
        intent.putExtra(PayResultActivity.g, activity.getPackageName());
        intent.putExtra(PayResultActivity.e, strValueOf);
        com.alipay.sdk.m.s.a.C0094a.a(aVar, intent);
        activity.startActivity(intent);
        synchronized (map.get(strValueOf)) {
            try {
                e.b(com.alipay.sdk.m.l.a.z, "PayTask wait");
                map.get(strValueOf).wait();
            } catch (InterruptedException unused) {
                e.b(com.alipay.sdk.m.l.a.z, "PayTask interrupted");
                return com.alipay.sdk.m.j.b.a();
            }
        }
        String str3 = PayResultActivity.b.b;
        e.b(com.alipay.sdk.m.l.a.z, "PayTask ret: " + str3);
        return str3;
    }
}
