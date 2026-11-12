package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
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
public final class zdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<IAMapDelegate> f41168b;
    public Handler c;
    public d d;
    public int e = 0;
    public final Runnable f = new a();
    public final Runnable g = new b();
    public final Runnable h = new c();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (zdt.this.d == null) {
                zdt zdtVar = zdt.this;
                zdtVar.d = new d(zdtVar.f41167a, zdt.this);
            }
            pms.a().b(zdt.this.d);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IAMapDelegate iAMapDelegate = (IAMapDelegate) zdt.this.f41168b.get();
            if (iAMapDelegate != null) {
                iAMapDelegate.setOverseaAuth(true);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IAMapDelegate iAMapDelegate = (IAMapDelegate) zdt.this.f41168b.get();
            if (iAMapDelegate != null) {
                try {
                    iAMapDelegate.removecache();
                    iAMapDelegate.setOverseaAuth(false);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
            oks.b(zdt.this.f41167a, "国际图鉴权失败，当前key没有国际图的使用权限，国际图，将不会呈现！");
        }
    }

    public static class d extends f7t {
        public Context d;
        public zdt e;
        public e g;

        public d(Context context, zdt zdtVar) {
            this.d = context;
            this.e = zdtVar;
            this.g = new e(context, "");
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                f fVarM = this.g.m();
                if (fVarM == null) {
                    this.e.d(30000L);
                    return;
                }
                zdt.i(this.e);
                if (fVarM.d) {
                    this.e.j();
                } else {
                    this.e.k();
                }
            } catch (ic e) {
                e.printStackTrace();
                this.e.d(30000L);
            }
        }
    }

    public static class e extends szs<String, f> {
        public boolean w;

        public e(Context context, String str) {
            super(context, str);
            this.u = "/rest/feedback/3dmap-abroad";
            this.isPostFlag = false;
            this.w = true;
        }

        public static f o(String str) throws ic {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("info");
                String strOptString2 = jSONObject.optString("infocode");
                String strOptString3 = jSONObject.optString("status");
                boolean z = false;
                z = false;
                f fVar = new f(z ? (byte) 1 : (byte) 0);
                fVar.f41172a = strOptString;
                fVar.f41173b = strOptString2;
                fVar.c = strOptString3;
                if (!TextUtils.isEmpty(strOptString2) && TextUtils.equals(strOptString2, OfflineMapDownloadManager.RESULT_OK)) {
                    z = true;
                }
                fVar.d = z;
                return fVar;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        public static f p(byte[] bArr) throws ic {
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
        public final /* synthetic */ f e(String str) throws ic {
            return o(str);
        }

        @Override // defpackage.szs
        public final /* synthetic */ f g(byte[] bArr) throws ic {
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

    public zdt(Context context, IAMapDelegate iAMapDelegate) {
        this.f41167a = context.getApplicationContext();
        this.f41168b = new WeakReference<>(iAMapDelegate);
        h();
    }

    public static /* synthetic */ int i(zdt zdtVar) {
        zdtVar.e = 2;
        return 2;
    }

    public final int a() {
        return this.e;
    }

    public final void d(long j) {
        Handler handler = this.c;
        if (handler != null) {
            this.e = 1;
            handler.postDelayed(this.f, j);
        }
    }

    public final void f() {
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.c = null;
        }
    }

    public final void h() {
        if (this.c == null) {
            this.c = new Handler(Looper.getMainLooper());
        }
    }

    public final void j() {
        Handler handler = this.c;
        if (handler != null) {
            handler.post(this.g);
        }
    }

    public final void k() {
        Handler handler = this.c;
        if (handler != null) {
            handler.post(this.h);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f41173b;
        public String c;
        public boolean d;

        public f() {
            this.d = false;
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }
}
