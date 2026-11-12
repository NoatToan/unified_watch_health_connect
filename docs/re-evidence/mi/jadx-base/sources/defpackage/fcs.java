package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.push.fs;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class fcs extends rds.a implements wjs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMPushService f17661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17662b;

    public static class a implements wjs.b {
        @Override // wjs.b
        public String a(String str) throws IOException {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            builderBuildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            builderBuildUpon.appendQueryParameter(CommonConstants.KEY_OS, uys.b(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            builderBuildUpon.appendQueryParameter("mi", String.valueOf(odt.a()));
            String string = builderBuildUpon.toString();
            x9s.B("fetch bucket from : " + string);
            URL url = new URL(string);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strK = obs.k(odt.b(), url);
                gvs.g(url.getHost() + ":" + port, (int) (System.currentTimeMillis() - jCurrentTimeMillis), null);
                return strK;
            } catch (IOException e) {
                gvs.g(url.getHost() + ":" + port, -1, e);
                throw e;
            }
        }
    }

    public static class b extends wjs {
        public b(Context context, tjs tjsVar, wjs.b bVar, String str) {
            super(context, tjsVar, bVar, str);
        }

        @Override // defpackage.wjs
        public String f(ArrayList<String> arrayList, String str, String str2, boolean z) throws IOException {
            try {
                if (com.xiaomi.push.b.e().k()) {
                    str2 = rds.g();
                }
                return super.f(arrayList, str, str2, z);
            } catch (IOException e) {
                gvs.d(0, fs.GSLB_ERR.a(), 1, null, obs.w(wjs.j) ? 1 : 0);
                throw e;
            }
        }
    }

    public fcs(XMPushService xMPushService) {
        this.f17661a = xMPushService;
    }

    public static void d(XMPushService xMPushService) {
        fcs fcsVar = new fcs(xMPushService);
        rds.c().j(fcsVar);
        synchronized (wjs.class) {
            wjs.k(fcsVar);
            wjs.j(xMPushService, null, new a(), "0", "push", "2.2");
        }
    }

    @Override // wjs.a
    public wjs a(Context context, tjs tjsVar, wjs.b bVar, String str) {
        return new b(context, tjsVar, bVar, str);
    }

    @Override // rds.a
    public void b(cqs cqsVar) {
    }

    @Override // rds.a
    public void c(fqs fqsVar) {
        mis misVarQ;
        if (fqsVar.p() && fqsVar.n() && System.currentTimeMillis() - this.f17662b > 3600000) {
            x9s.o("fetch bucket :" + fqsVar.n());
            this.f17662b = System.currentTimeMillis();
            wjs wjsVarC = wjs.c();
            wjsVarC.i();
            wjsVarC.s();
            gws gwsVarM829a = this.f17661a.m829a();
            if (gwsVarM829a == null || (misVarQ = wjsVarC.q(gwsVarM829a.c().j())) == null) {
                return;
            }
            ArrayList<String> arrayListC = misVarQ.c();
            Iterator<String> it = arrayListC.iterator();
            while (it.hasNext()) {
                if (it.next().equals(gwsVarM829a.d())) {
                    return;
                }
            }
            if (arrayListC.isEmpty()) {
                return;
            }
            x9s.o("bucket changed, force reconnect");
            this.f17661a.a(0, (Exception) null);
            this.f17661a.a(false);
        }
    }
}
