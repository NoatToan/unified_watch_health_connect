package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.MapsInitializer;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.dds;
import defpackage.m2t;
import defpackage.rfs;
import defpackage.sds;
import defpackage.y5t;
import defpackage.zcs;
import defpackage.zns;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements c1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sds f6055a;
    public long d;
    public Context f;
    public zcs g;
    public cc h;
    public String i;
    public y5t j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public dds f6057k;
    public a n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6056b = 0;
    public long c = 0;
    public boolean e = true;
    public long l = 0;
    public boolean m = false;

    public interface a {
        void c();
    }

    public static class b extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f6058r;

        public b(String str) {
            this.f6058r = str;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return getURL();
        }

        @Override // com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            return this.f6058r;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final boolean isSupportIPV6() {
            return false;
        }
    }

    public f(sds sdsVar, String str, Context context, cc ccVar) throws IOException {
        this.f6055a = null;
        this.g = zcs.b(context.getApplicationContext());
        this.f6055a = sdsVar;
        this.f = context;
        this.i = str;
        this.h = ccVar;
        f();
    }

    public final void a() {
        try {
            if (!zns.j0(this.f)) {
                cc ccVar = this.h;
                if (ccVar != null) {
                    ccVar.k(cc.a.network_exception);
                    return;
                }
                return;
            }
            h();
            if (x0.f6303a != 1) {
                cc ccVar2 = this.h;
                if (ccVar2 != null) {
                    ccVar2.k(cc.a.amap_exception);
                    return;
                }
                return;
            }
            if (!g()) {
                this.e = true;
            }
            if (this.e) {
                long jI = i();
                this.d = jI;
                if (jI != -1 && jI != -2) {
                    this.c = jI;
                }
                this.f6056b = 0L;
            }
            cc ccVar3 = this.h;
            if (ccVar3 != null) {
                ccVar3.m();
            }
            if (this.f6056b >= this.c) {
                onFinish();
            } else {
                e();
                this.j.b(this);
            }
        } catch (AMapException e) {
            m2t.r(e, "SiteFileFetch", "download");
            cc ccVar4 = this.h;
            if (ccVar4 != null) {
                ccVar4.k(cc.a.amap_exception);
            }
        } catch (IOException unused) {
            cc ccVar5 = this.h;
            if (ccVar5 != null) {
                ccVar5.k(cc.a.file_io_exception);
            }
        }
    }

    public final void b(long j) {
        cc ccVar;
        long j2 = this.d;
        if (j2 <= 0 || (ccVar = this.h) == null) {
            return;
        }
        ccVar.a(j2, j);
        this.l = System.currentTimeMillis();
    }

    public final void c(a aVar) {
        this.n = aVar;
    }

    public final void d() {
        y5t y5tVar = this.j;
        if (y5tVar != null) {
            y5tVar.a();
        }
    }

    public final void e() throws IOException {
        rfs rfsVar = new rfs(this.i);
        rfsVar.setConnectionTimeout(30000);
        rfsVar.setSoTimeout(30000);
        this.j = new y5t(rfsVar, this.f6056b, this.c, MapsInitializer.getProtocol() == 2);
        this.f6057k = new dds(this.f6055a.b() + File.separator + this.f6055a.c(), this.f6056b);
    }

    public final void f() {
        File file = new File(this.f6055a.b() + this.f6055a.c());
        if (!file.exists()) {
            this.f6056b = 0L;
            this.c = 0L;
            return;
        }
        this.e = false;
        this.f6056b = file.length();
        try {
            long jI = i();
            this.d = jI;
            this.c = jI;
        } catch (IOException unused) {
            cc ccVar = this.h;
            if (ccVar != null) {
                ccVar.k(cc.a.file_io_exception);
            }
        }
    }

    public final boolean g() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6055a.b());
        sb.append(File.separator);
        sb.append(this.f6055a.c());
        return new File(sb.toString()).length() >= 10;
    }

    public final void h() throws AMapException {
        if (x0.f6303a != 1) {
            for (int i = 0; i < 3; i++) {
                try {
                    x0.c(this.f, zns.t(), "", null);
                    if (x0.f6303a == 1) {
                        return;
                    }
                } catch (Throwable th) {
                    m2t.r(th, "SiteFileFetch", "authOffLineDownLoad");
                    th.printStackTrace();
                }
            }
        }
    }

    public final long i() throws IOException {
        Map<String, String> mapQ;
        if (iu.a(this.f, zns.t()).f6352a != iu.c.SuccessCode) {
            return -1L;
        }
        String strA = this.f6055a.a();
        try {
            f1.n();
            mapQ = f1.q(new b(strA), MapsInitializer.getProtocol() == 2);
        } catch (ik e) {
            e.printStackTrace();
            mapQ = null;
        }
        int i = -1;
        if (mapQ != null) {
            for (String str : mapQ.keySet()) {
                if (HTTP.CONTENT_LEN.equalsIgnoreCase(str)) {
                    i = Integer.parseInt(mapQ.get(str));
                }
            }
        }
        return i;
    }

    public final void j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f6055a == null || jCurrentTimeMillis - this.l <= 500) {
            return;
        }
        k();
        this.l = jCurrentTimeMillis;
        b(this.f6056b);
    }

    public final void k() {
        this.g.f(this.f6055a.e(), this.f6055a.d(), this.d, this.f6056b, this.c);
    }

    @Override // com.amap.api.col.3sl.c1.a
    public final void onDownload(byte[] bArr, long j) {
        try {
            this.f6057k.a(bArr);
            this.f6056b = j;
            j();
        } catch (IOException e) {
            e.printStackTrace();
            m2t.r(e, "fileAccessI", "fileAccessI.write(byte[] data)");
            cc ccVar = this.h;
            if (ccVar != null) {
                ccVar.k(cc.a.file_io_exception);
            }
            y5t y5tVar = this.j;
            if (y5tVar != null) {
                y5tVar.a();
            }
        }
    }

    @Override // com.amap.api.col.3sl.c1.a
    public final void onException(Throwable th) {
        dds ddsVar;
        this.m = true;
        d();
        cc ccVar = this.h;
        if (ccVar != null) {
            ccVar.k(cc.a.network_exception);
        }
        if ((th instanceof IOException) || (ddsVar = this.f6057k) == null) {
            return;
        }
        ddsVar.b();
    }

    @Override // com.amap.api.col.3sl.c1.a
    public final void onFinish() {
        j();
        cc ccVar = this.h;
        if (ccVar != null) {
            ccVar.n();
        }
        dds ddsVar = this.f6057k;
        if (ddsVar != null) {
            ddsVar.b();
        }
        a aVar = this.n;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.amap.api.col.3sl.c1.a
    public final void onStop() {
        if (this.m) {
            return;
        }
        cc ccVar = this.h;
        if (ccVar != null) {
            ccVar.c();
        }
        k();
    }
}
