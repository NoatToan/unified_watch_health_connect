package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ix f2541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static gd f2542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f2543c;
    private a d;
    private HandlerThread e = new HandlerThread("manifestThread") { // from class: com.amap.api.col.3sl.gd.1
        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            Thread.currentThread().setName("ManifestConfigThread");
            ix ixVarA = ft.a(false);
            gd.c(gd.f2543c);
            im.a(gd.f2543c, ixVarA, "11K;001;184;185", new im.a() { // from class: com.amap.api.col.3sl.gd.1.1
                @Override // com.amap.api.col.3sl.im.a
                public final void a(im.b bVar) {
                    a aVar;
                    JSONObject jSONObjectOptJSONObject;
                    JSONObject jSONObjectOptJSONObject2;
                    Message message = new Message();
                    if (bVar != null) {
                        try {
                            if (bVar.g != null) {
                                message.obj = new ge(bVar.g.f2778b, bVar.g.f2777a);
                            }
                        } catch (Throwable th) {
                            try {
                                fu.a(th, "ManifestConfig", "run");
                                if (aVar == null) {
                                    return;
                                }
                            } finally {
                                message.what = 3;
                                if (gd.this.d != null) {
                                    gd.this.d.sendMessage(message);
                                }
                            }
                        }
                    }
                    if (bVar != null && bVar.f != null && (jSONObjectOptJSONObject2 = bVar.f.optJSONObject("184")) != null) {
                        gd.d(jSONObjectOptJSONObject2);
                        hc.a(gd.f2543c, "amap_search", "cache_control", jSONObjectOptJSONObject2.toString());
                    }
                    if (bVar != null && bVar.f != null && (jSONObjectOptJSONObject = bVar.f.optJSONObject("185")) != null) {
                        gd.c(jSONObjectOptJSONObject);
                        hc.a(gd.f2543c, "amap_search", "parm_control", jSONObjectOptJSONObject.toString());
                    }
                    message.what = 3;
                    if (gd.this.d == null) {
                    }
                }
            });
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        try {
            String str = (String) hc.b(context, "amap_search", "cache_control", "");
            if (!TextUtils.isEmpty(str)) {
                d(new JSONObject(str));
            }
            String str2 = (String) hc.b(context, "amap_search", "parm_control", "");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c(new JSONObject(str2));
        } catch (Throwable th) {
            fu.a(th, "ManifestConfig", "ManifestConfig-readAuthFromCache");
        }
    }

    private gd(Context context) {
        f2543c = context;
        f2541a = ft.a(false);
        try {
            b();
            this.d = new a(Looper.getMainLooper());
            this.e.start();
        } catch (Throwable th) {
            fu.a(th, "ManifestConfig", "ManifestConfig");
        }
    }

    private static void b() {
        gs.a();
    }

    public static gd a(Context context) {
        if (f2542b == null) {
            f2542b = new gd(context);
        }
        return f2542b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                boolean zA = im.a(jSONObject.optString("passAreaAble"), true);
                boolean zA2 = im.a(jSONObject.optString("truckAble"), true);
                boolean zA3 = im.a(jSONObject.optString("poiPageAble"), true);
                boolean zA4 = im.a(jSONObject.optString("rideAble"), true);
                boolean zA5 = im.a(jSONObject.optString("walkAble"), true);
                boolean zA6 = im.a(jSONObject.optString("passPointAble"), true);
                boolean zA7 = im.a(jSONObject.optString("keyWordLenAble"), true);
                int iOptInt = jSONObject.optInt("poiPageMaxSize", 25);
                int iOptInt2 = jSONObject.optInt("passAreaMaxCount", 100);
                int iOptInt3 = jSONObject.optInt("walkMaxLength", 100);
                int iOptInt4 = jSONObject.optInt("passPointMaxCount", 6);
                int iOptInt5 = jSONObject.optInt("poiPageMaxNum", 100);
                int iOptInt6 = jSONObject.optInt("truckMaxLength", 5000);
                int iOptInt7 = jSONObject.optInt("rideMaxLength", 1200);
                int iOptInt8 = jSONObject.optInt("passAreaMaxArea", 100000000);
                int iOptInt9 = jSONObject.optInt("passAreaPointCount", 16);
                int iOptInt10 = jSONObject.optInt("keyWordLenMaxNum", 100);
                gw.a().a(zA);
                gw.a().c(iOptInt2);
                gw.a().i(iOptInt8);
                gw.a().j(iOptInt9);
                gw.a().b(zA2);
                gw.a().g(iOptInt6);
                gw.a().c(zA3);
                gw.a().f(iOptInt5);
                gw.a().a(iOptInt);
                gw.a().b(iOptInt10);
                gw.a().g(zA7);
                gw.a().d(zA4);
                gw.a().h(iOptInt7);
                gw.a().e(zA5);
                gw.a().d(iOptInt3);
                gw.a().f(zA6);
                gw.a().e(iOptInt4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("able")) {
                    gt.a aVarA = a(jSONObject, true, (gt.a) null);
                    gt.a().a(aVarA);
                    if (aVarA.a()) {
                        a("regeo", jSONObject, aVarA);
                        a("geo", jSONObject, aVarA);
                        a("placeText", jSONObject, aVarA);
                        a("placeAround", jSONObject, aVarA);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void a(String str, JSONObject jSONObject, gt.a aVar) {
        if (jSONObject != null && jSONObject.has(str)) {
            gt.a().a(str, a(jSONObject.optJSONObject(str), false, aVar));
        }
    }

    private static gt.a a(JSONObject jSONObject, boolean z, gt.a aVar) {
        boolean zOptBoolean;
        gt.a aVar2 = null;
        if (jSONObject != null) {
            try {
                gt.a aVar3 = new gt.a();
                boolean z2 = true;
                try {
                    if (z) {
                        String strOptString = jSONObject.optString("able");
                        if (aVar != null && !aVar.a()) {
                            z2 = false;
                        }
                        zOptBoolean = im.a(strOptString, z2);
                    } else {
                        if (aVar != null && !aVar.a()) {
                            z2 = false;
                        }
                        zOptBoolean = jSONObject.optBoolean("able", z2);
                    }
                    int iOptInt = jSONObject.optInt("timeoffset", aVar != null ? (int) aVar.b() : 86400);
                    int iOptInt2 = jSONObject.optInt("num", aVar != null ? aVar.c() : 10);
                    double dOptDouble = jSONObject.optDouble("limitDistance", aVar != null ? aVar.d() : 0.0d);
                    aVar3.a(zOptBoolean);
                    aVar3.a(iOptInt);
                    aVar3.a(iOptInt2);
                    aVar3.a(dOptDouble);
                    return aVar3;
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar3;
                    th.printStackTrace();
                    return aVar2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return aVar2;
    }

    final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f2546a;

        public a(Looper looper) {
            super(looper);
            this.f2546a = "handleMessage";
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message != null && message.what == 3) {
                try {
                    ge geVar = (ge) message.obj;
                    if (geVar == null) {
                        geVar = new ge(false, false);
                    }
                    jv.a(gd.f2543c, ft.a(geVar.a()));
                    gd.f2541a = ft.a(geVar.a());
                } catch (Throwable th) {
                    fu.a(th, "ManifestConfig", this.f2546a);
                }
            }
        }
    }
}
