package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.lvs;
import defpackage.m2t;
import defpackage.mws;
import defpackage.o0t;
import defpackage.rws;
import defpackage.sxs;
import defpackage.wts;
import defpackage.xts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class x {
    public static x c;
    public static Context d;
    public static o0t e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f6297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HandlerThread f6298b = new a("manifestThread");

    public class a extends HandlerThread {

        /* JADX INFO: renamed from: com.amap.api.col.3sl.x$a$a, reason: collision with other inner class name */
        public class C0127a implements x0.b {
            public C0127a() {
            }

            @Override // com.amap.api.col.3sl.x0.b
            public final void a(x0.c cVar) {
                b bVar;
                JSONObject jSONObject;
                JSONObject jSONObjectOptJSONObject;
                JSONObject jSONObject2;
                JSONObject jSONObjectOptJSONObject2;
                Message message = new Message();
                if (cVar != null) {
                    try {
                        x0.c.a aVar = cVar.g;
                        if (aVar != null) {
                            message.obj = new lvs(aVar.f6310b, aVar.f6309a);
                        }
                    } catch (Throwable th) {
                        try {
                            xts.i(th, "ManifestConfig", "run");
                            if (bVar == null) {
                                return;
                            }
                        } finally {
                            message.what = 3;
                            if (x.this.f6297a != null) {
                                x.this.f6297a.sendMessage(message);
                            }
                        }
                    }
                }
                if (cVar != null && (jSONObject2 = cVar.f) != null && (jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("184")) != null) {
                    x.l(jSONObjectOptJSONObject2);
                    sxs.a(x.d, "amap_search", "cache_control", jSONObjectOptJSONObject2.toString());
                }
                if (cVar != null && (jSONObject = cVar.f) != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("185")) != null) {
                    x.k(jSONObjectOptJSONObject);
                    sxs.a(x.d, "amap_search", "parm_control", jSONObjectOptJSONObject.toString());
                }
                message.what = 3;
                if (x.this.f6297a == null) {
                }
            }
        }

        public a(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            Thread.currentThread().setName("ManifestConfigThread");
            o0t o0tVarA = wts.a(false);
            x.j(x.d);
            x0.i(x.d, o0tVarA, "11K;001;184;185", new C0127a());
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6301a;

        public b(Looper looper) {
            super(looper);
            this.f6301a = "handleMessage";
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message != null && message.what == 3) {
                try {
                    lvs lvsVar = (lvs) message.obj;
                    if (lvsVar == null) {
                        lvsVar = new lvs(false, false);
                    }
                    m2t.g(x.d, wts.a(lvsVar.a()));
                    x.e = wts.a(lvsVar.a());
                } catch (Throwable th) {
                    xts.i(th, "ManifestConfig", this.f6301a);
                }
            }
        }
    }

    public x(Context context) {
        d = context;
        e = wts.a(false);
        try {
            g();
            this.f6297a = new b(Looper.getMainLooper());
            this.f6298b.start();
        } catch (Throwable th) {
            xts.i(th, "ManifestConfig", "ManifestConfig");
        }
    }

    public static x c(Context context) {
        if (c == null) {
            c = new x(context);
        }
        return c;
    }

    public static d0.a d(JSONObject jSONObject, boolean z, d0.a aVar) {
        boolean zOptBoolean;
        d0.a aVar2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            d0.a aVar3 = new d0.a();
            boolean z2 = true;
            try {
                if (z) {
                    String strOptString = jSONObject.optString("able");
                    if (aVar != null && !aVar.e()) {
                        z2 = false;
                    }
                    zOptBoolean = x0.x(strOptString, z2);
                } else {
                    if (aVar != null && !aVar.e()) {
                        z2 = false;
                    }
                    zOptBoolean = jSONObject.optBoolean("able", z2);
                }
                int iOptInt = jSONObject.optInt("timeoffset", aVar != null ? (int) aVar.f() : RepositoryManager.GAP_A_DAY);
                int iOptInt2 = jSONObject.optInt("num", aVar != null ? aVar.g() : 10);
                double dOptDouble = jSONObject.optDouble("limitDistance", aVar != null ? aVar.h() : 0.0d);
                aVar3.d(zOptBoolean);
                aVar3.c(iOptInt);
                aVar3.b(iOptInt2);
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

    public static void e(String str, JSONObject jSONObject, d0.a aVar) {
        if (jSONObject != null && jSONObject.has(str)) {
            d0.b().f(str, d(jSONObject.optJSONObject(str), false, aVar));
        }
    }

    public static void g() {
        mws.a();
    }

    public static void j(Context context) {
        try {
            String str = (String) sxs.b(context, "amap_search", "cache_control", "");
            if (!TextUtils.isEmpty(str)) {
                l(new JSONObject(str));
            }
            String str2 = (String) sxs.b(context, "amap_search", "parm_control", "");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            k(new JSONObject(str2));
        } catch (Throwable th) {
            xts.i(th, "ManifestConfig", "ManifestConfig-readAuthFromCache");
        }
    }

    public static void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                boolean zX = x0.x(jSONObject.optString("passAreaAble"), true);
                boolean zX2 = x0.x(jSONObject.optString("truckAble"), true);
                boolean zX3 = x0.x(jSONObject.optString("poiPageAble"), true);
                boolean zX4 = x0.x(jSONObject.optString("rideAble"), true);
                boolean zX5 = x0.x(jSONObject.optString("walkAble"), true);
                boolean zX6 = x0.x(jSONObject.optString("passPointAble"), true);
                boolean zX7 = x0.x(jSONObject.optString("keyWordLenAble"), true);
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
                rws.a().h(zX);
                rws.a().n(iOptInt2);
                rws.a().z(iOptInt8);
                rws.a().A(iOptInt9);
                rws.a().m(zX2);
                rws.a().w(iOptInt6);
                rws.a().p(zX3);
                rws.a().u(iOptInt5);
                rws.a().b(iOptInt);
                rws.a().i(iOptInt10);
                rws.a().x(zX7);
                rws.a().r(zX4);
                rws.a().y(iOptInt7);
                rws.a().t(zX5);
                rws.a().q(iOptInt3);
                rws.a().v(zX6);
                rws.a().s(iOptInt4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void l(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("able")) {
                    d0.a aVarD = d(jSONObject, true, null);
                    d0.b().d(aVarD);
                    if (aVarD.e()) {
                        e("regeo", jSONObject, aVarD);
                        e("geo", jSONObject, aVarD);
                        e("placeText", jSONObject, aVarD);
                        e("placeAround", jSONObject, aVarD);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
