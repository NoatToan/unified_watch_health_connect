package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.MapsInitializer;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class bw implements kv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    bx f2287a;
    long d;
    br f;
    a h;
    private Context i;
    private cc j;
    private String k;
    private lc l;
    private bs m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f2288b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f2289c = 0;
    boolean e = true;
    long g = 0;
    private boolean n = false;

    public interface a {
        void c();
    }

    public bw(bx bxVar, String str, Context context, cc ccVar) throws IOException {
        this.f2287a = null;
        this.f = br.a(context.getApplicationContext());
        this.f2287a = bxVar;
        this.i = context;
        this.k = str;
        this.j = ccVar;
        d();
    }

    private void c() throws IOException {
        cd cdVar = new cd(this.k);
        cdVar.setConnectionTimeout(30000);
        cdVar.setSoTimeout(30000);
        this.l = new lc(cdVar, this.f2288b, this.f2289c, MapsInitializer.getProtocol() == 2);
        this.m = new bs(this.f2287a.b() + File.separator + this.f2287a.c(), this.f2288b);
    }

    private void d() {
        File file = new File(this.f2287a.b() + this.f2287a.c());
        if (file.exists()) {
            this.e = false;
            this.f2288b = file.length();
            try {
                long jG = g();
                this.d = jG;
                this.f2289c = jG;
                return;
            } catch (IOException unused) {
                cc ccVar = this.j;
                if (ccVar != null) {
                    ccVar.a(cc.a.file_io_exception);
                    return;
                }
                return;
            }
        }
        this.f2288b = 0L;
        this.f2289c = 0L;
    }

    public final void a() {
        try {
            if (eb.d(this.i)) {
                f();
                if (im.f2768a != 1) {
                    cc ccVar = this.j;
                    if (ccVar != null) {
                        ccVar.a(cc.a.amap_exception);
                        return;
                    }
                    return;
                }
                if (!e()) {
                    this.e = true;
                }
                if (this.e) {
                    long jG = g();
                    this.d = jG;
                    if (jG != -1 && jG != -2) {
                        this.f2289c = jG;
                    }
                    this.f2288b = 0L;
                }
                cc ccVar2 = this.j;
                if (ccVar2 != null) {
                    ccVar2.m();
                }
                if (this.f2288b >= this.f2289c) {
                    onFinish();
                    return;
                } else {
                    c();
                    this.l.a(this);
                    return;
                }
            }
            cc ccVar3 = this.j;
            if (ccVar3 != null) {
                ccVar3.a(cc.a.network_exception);
            }
        } catch (AMapException e) {
            jv.c(e, "SiteFileFetch", "download");
            cc ccVar4 = this.j;
            if (ccVar4 != null) {
                ccVar4.a(cc.a.amap_exception);
            }
        } catch (IOException unused) {
            cc ccVar5 = this.j;
            if (ccVar5 != null) {
                ccVar5.a(cc.a.file_io_exception);
            }
        }
    }

    private boolean e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2287a.b());
        sb.append(File.separator);
        sb.append(this.f2287a.c());
        return new File(sb.toString()).length() >= 10;
    }

    private void f() throws AMapException {
        if (im.f2768a != 1) {
            for (int i = 0; i < 3; i++) {
                try {
                    im.a(this.i, eb.a(), "", (Map<String, String>) null);
                    if (im.f2768a == 1) {
                        return;
                    }
                } catch (Throwable th) {
                    jv.c(th, "SiteFileFetch", "authOffLineDownLoad");
                    th.printStackTrace();
                }
            }
        }
    }

    static final class b extends df {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f2290a;

        @Override // com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final boolean isSupportIPV6() {
            return false;
        }

        public b(String str) {
            this.f2290a = str;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            return this.f2290a;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return getURL();
        }
    }

    private long g() throws IOException {
        Map<String, String> mapD;
        if (iu.a(this.i, eb.a()).f2835a != iu.c.SuccessCode) {
            return -1L;
        }
        String strA = this.f2287a.a();
        try {
            kz.b();
            mapD = kz.d((la) new b(strA), MapsInitializer.getProtocol() == 2);
        } catch (ik e) {
            e.printStackTrace();
            mapD = null;
        }
        int i = -1;
        if (mapD != null) {
            for (String str : mapD.keySet()) {
                if ("Content-Length".equalsIgnoreCase(str)) {
                    i = Integer.parseInt(mapD.get(str));
                }
            }
        }
        return i;
    }

    private void h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f2287a == null || jCurrentTimeMillis - this.g <= 500) {
            return;
        }
        i();
        this.g = jCurrentTimeMillis;
        a(this.f2288b);
    }

    private void i() {
        this.f.a(this.f2287a.e(), this.f2287a.d(), this.d, this.f2288b, this.f2289c);
    }

    private void a(long j) {
        cc ccVar;
        long j2 = this.d;
        if (j2 <= 0 || (ccVar = this.j) == null) {
            return;
        }
        ccVar.a(j2, j);
        this.g = System.currentTimeMillis();
    }

    public final void b() {
        lc lcVar = this.l;
        if (lcVar != null) {
            lcVar.a();
        }
    }

    @Override // com.amap.api.col.3sl.kv.a
    public final void onStop() {
        if (this.n) {
            return;
        }
        cc ccVar = this.j;
        if (ccVar != null) {
            ccVar.o();
        }
        i();
    }

    @Override // com.amap.api.col.3sl.kv.a
    public final void onFinish() {
        h();
        cc ccVar = this.j;
        if (ccVar != null) {
            ccVar.n();
        }
        bs bsVar = this.m;
        if (bsVar != null) {
            bsVar.a();
        }
        a aVar = this.h;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.amap.api.col.3sl.kv.a
    public final void onException(Throwable th) {
        bs bsVar;
        this.n = true;
        b();
        cc ccVar = this.j;
        if (ccVar != null) {
            ccVar.a(cc.a.network_exception);
        }
        if ((th instanceof IOException) || (bsVar = this.m) == null) {
            return;
        }
        bsVar.a();
    }

    @Override // com.amap.api.col.3sl.kv.a
    public final void onDownload(byte[] bArr, long j) {
        try {
            this.m.a(bArr);
            this.f2288b = j;
            h();
        } catch (IOException e) {
            e.printStackTrace();
            jv.c(e, "fileAccessI", "fileAccessI.write(byte[] data)");
            cc ccVar = this.j;
            if (ccVar != null) {
                ccVar.a(cc.a.file_io_exception);
            }
            lc lcVar = this.l;
            if (lcVar != null) {
                lcVar.a();
            }
        }
    }

    public final void a(a aVar) {
        this.h = aVar;
    }
}
