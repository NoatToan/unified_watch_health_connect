package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<IAMapDelegate> f3308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f3309c;
    private a d;
    private final Runnable e = new Runnable() { // from class: com.amap.api.col.3sl.x.1
        @Override // java.lang.Runnable
        public final void run() {
            if (x.this.d == null) {
                x xVar = x.this;
                xVar.d = new a(xVar.f3307a, x.this);
            }
            dz.a().a(x.this.d);
        }
    };
    private final Runnable f = new Runnable() { // from class: com.amap.api.col.3sl.x.2
        @Override // java.lang.Runnable
        public final void run() {
            IAMapDelegate iAMapDelegate = (IAMapDelegate) x.this.f3308b.get();
            if (iAMapDelegate != null) {
                iAMapDelegate.setTerrainAuth(false);
            }
            dh.a(x.this.f3307a, "地形图鉴权失败，当前key没有地形图的使用权限，地形图，将不会呈现！");
        }
    };

    public x(Context context, IAMapDelegate iAMapDelegate) {
        this.f3307a = context.getApplicationContext();
        this.f3308b = new WeakReference<>(iAMapDelegate);
        b();
    }

    private void b() {
        if (this.f3309c == null) {
            this.f3309c = new Handler(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Handler handler = this.f3309c;
        if (handler != null) {
            handler.postDelayed(this.f, 1000L);
        }
    }

    public final void a(long j) {
        Handler handler = this.f3309c;
        if (handler != null) {
            handler.postDelayed(this.e, j);
        }
    }

    public final void a() {
        Handler handler = this.f3309c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3309c = null;
        }
    }

    static final class a extends mb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f3312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f3313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f3314c;

        public a(Context context, x xVar) {
            this.f3312a = context;
            this.f3313b = xVar;
            this.f3314c = new b(context, "");
        }

        @Override // com.amap.api.col.p0003sl.mb
        public final void runTask() {
            try {
                c cVarD = this.f3314c.d();
                if (cVarD == null) {
                    this.f3313b.a(30000L);
                } else {
                    if (cVarD.d) {
                        return;
                    }
                    this.f3313b.c();
                }
            } catch (ic e) {
                e.printStackTrace();
                this.f3313b.a(30000L);
            }
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3317c;
        public boolean d;

        private c() {
            this.d = false;
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    static final class b extends id<String, c> {
        private boolean j;

        @Override // com.amap.api.col.p0003sl.id
        protected final String c() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final boolean isSupportIPV6() {
            return true;
        }

        @Override // com.amap.api.col.p0003sl.id
        protected final /* synthetic */ c a(String str) throws ic {
            return b(str);
        }

        @Override // com.amap.api.col.p0003sl.id
        protected final /* synthetic */ c a(byte[] bArr) throws ic {
            return b(bArr);
        }

        public b(Context context, String str) {
            super(context, str);
            this.j = true;
            this.h = "/rest/feedback/terrain";
            this.isPostFlag = false;
            this.j = true;
        }

        private static c b(byte[] bArr) throws ic {
            String str;
            try {
                str = new String(bArr, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
                str = null;
            }
            if (str == null || "".equals(str)) {
                return null;
            }
            return b(str);
        }

        private static c b(String str) throws ic {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString(CloudParamKeys.INFO);
                String strOptString2 = jSONObject.optString("infocode");
                String strOptString3 = jSONObject.optString("status");
                boolean z = false;
                z = false;
                c cVar = new c(z ? (byte) 1 : (byte) 0);
                cVar.f3315a = strOptString;
                cVar.f3316b = strOptString2;
                cVar.f3317c = strOptString3;
                if (!TextUtils.isEmpty(strOptString2) && TextUtils.equals(strOptString2, "10000")) {
                    z = true;
                }
                cVar.d = z;
                return cVar;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.amap.api.col.p0003sl.df, com.amap.api.col.p0003sl.la
        public final Map<String, String> getParams() {
            Hashtable hashtable = new Hashtable(16);
            hashtable.put(MedalConstants.EVENT_KEY, il.f(this.g));
            if (this.j) {
                hashtable.put("pname", "3dmap");
            }
            String strA = io.a();
            String strA2 = io.a(this.g, strA, iy.b(hashtable));
            hashtable.put("ts", strA);
            hashtable.put("scode", strA2);
            return hashtable;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            return "http://restsdk.amap.com" + this.h;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return eb.a(getURL());
        }
    }
}
