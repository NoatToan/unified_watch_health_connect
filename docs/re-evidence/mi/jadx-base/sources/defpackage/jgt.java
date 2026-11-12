package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.ic;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapDownloadManager;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class jgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f22780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<IAMapDelegate> f22781b;
    public Handler c;
    public c d;
    public final Runnable e = new a();
    public final Runnable f = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (jgt.this.d == null) {
                jgt jgtVar = jgt.this;
                jgtVar.d = new c(jgtVar.f22780a, jgt.this);
            }
            pms.a().b(jgt.this.d);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IAMapDelegate iAMapDelegate = (IAMapDelegate) jgt.this.f22781b.get();
            if (iAMapDelegate != null) {
                iAMapDelegate.setTerrainAuth(false);
            }
            oks.b(jgt.this.f22780a, "地形图鉴权失败，当前key没有地形图的使用权限，地形图，将不会呈现！");
        }
    }

    public static class c extends f7t {
        public Context d;
        public jgt e;
        public d g;

        public c(Context context, jgt jgtVar) {
            this.d = context;
            this.e = jgtVar;
            this.g = new d(context, "");
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                e eVarM = this.g.m();
                if (eVarM == null) {
                    this.e.d(30000L);
                } else {
                    if (eVarM.d) {
                        return;
                    }
                    this.e.h();
                }
            } catch (ic e) {
                e.printStackTrace();
                this.e.d(30000L);
            }
        }
    }

    public static class d extends szs<String, e> {
        public boolean w;

        public d(Context context, String str) {
            super(context, str);
            this.u = "/rest/feedback/terrain";
            this.isPostFlag = false;
            this.w = true;
        }

        public static e o(String str) throws ic {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("info");
                String strOptString2 = jSONObject.optString("infocode");
                String strOptString3 = jSONObject.optString("status");
                boolean z = false;
                z = false;
                e eVar = new e(z ? (byte) 1 : (byte) 0);
                eVar.f22784a = strOptString;
                eVar.f22785b = strOptString2;
                eVar.c = strOptString3;
                if (!TextUtils.isEmpty(strOptString2) && TextUtils.equals(strOptString2, OfflineMapDownloadManager.RESULT_OK)) {
                    z = true;
                }
                eVar.d = z;
                return eVar;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        public static e p(byte[] bArr) throws ic {
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
            return o(str);
        }

        @Override // defpackage.szs
        public final /* synthetic */ e e(String str) throws ic {
            return o(str);
        }

        @Override // defpackage.szs
        public final /* synthetic */ e g(byte[] bArr) throws ic {
            return p(bArr);
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return zns.y(getURL());
        }

        @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
        public final Map<String, String> getParams() {
            Hashtable hashtable = new Hashtable(16);
            hashtable.put("key", e0t.k(this.t));
            if (this.w) {
                hashtable.put("pname", "3dmap");
            }
            String strA = g0t.a();
            String strC = g0t.c(this.t, strA, p0t.q(hashtable));
            hashtable.put(DeviceTagInterface.TAG_DATA_START, strA);
            hashtable.put("scode", strC);
            return hashtable;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            return "http://restsdk.amap.com" + this.u;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final boolean isSupportIPV6() {
            return true;
        }
    }

    public jgt(Context context, IAMapDelegate iAMapDelegate) {
        this.f22780a = context.getApplicationContext();
        this.f22781b = new WeakReference<>(iAMapDelegate);
        f();
    }

    public final void c() {
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.c = null;
        }
    }

    public final void d(long j) {
        Handler handler = this.c;
        if (handler != null) {
            handler.postDelayed(this.e, j);
        }
    }

    public final void f() {
        if (this.c == null) {
            this.c = new Handler(Looper.getMainLooper());
        }
    }

    public final void h() {
        Handler handler = this.c;
        if (handler != null) {
            handler.postDelayed(this.f, 1000L);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f22785b;
        public String c;
        public boolean d;

        public e() {
            this.d = false;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }
}
