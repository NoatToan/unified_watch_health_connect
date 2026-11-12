package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.MapsInitializer;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bs implements im.a {
    public bt a;
    public long b;
    public long c;
    public long d;
    public boolean e;
    public bn f;
    public a h;
    private Context i;
    private by j;
    private String k;
    private it l;
    private bo m;
    public long g = 0;
    private boolean n = false;

    public interface a {
        void c();
    }

    public static class b extends dq {
        private final String e;

        public b(String str) {
            this.e = str;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final String getIPV6URL() {
            return getURL();
        }

        @Override // com.amap.api.mapcore.util.ir
        public final Map<String, String> getRequestHead() {
            return null;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final String getURL() {
            return this.e;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final boolean isSupportIPV6() {
            return false;
        }
    }

    public bs(bt btVar, String str, Context context, by byVar) throws IOException {
        this.a = null;
        this.b = 0L;
        this.c = 0L;
        this.e = true;
        this.f = bn.a(context.getApplicationContext());
        this.a = btVar;
        this.i = context;
        this.k = str;
        this.j = byVar;
        File file = new File(this.a.b() + this.a.c());
        if (!file.exists()) {
            this.b = 0L;
            this.c = 0L;
            return;
        }
        this.e = false;
        this.b = file.length();
        try {
            long jC = c();
            this.d = jC;
            this.c = jC;
        } catch (IOException unused) {
            by byVar2 = this.j;
            if (byVar2 != null) {
                byVar2.a(by.a.file_io_exception);
            }
        }
    }

    private long c() throws IOException {
        Map<String, String> mapE;
        String strA = this.a.a();
        try {
            iq.b();
            mapE = iq.e(new b(strA), MapsInitializer.getProtocol() == 2);
        } catch (gi e) {
            e.printStackTrace();
            mapE = null;
        }
        int i = -1;
        if (mapE != null) {
            for (String str : mapE.keySet()) {
                if ("Content-Length".equalsIgnoreCase(str)) {
                    i = Integer.parseInt(mapE.get(str));
                }
            }
        }
        return i;
    }

    private void d() {
        by byVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.a == null || jCurrentTimeMillis - this.g <= 500) {
            return;
        }
        e();
        this.g = jCurrentTimeMillis;
        long j = this.b;
        long j2 = this.d;
        if (j2 <= 0 || (byVar = this.j) == null) {
            return;
        }
        byVar.a(j2, j);
        this.g = System.currentTimeMillis();
    }

    private void e() {
        this.f.a(this.a.e(), this.a.d(), this.d, this.b, this.c);
    }

    public final void a() {
        try {
            if (!er.d(this.i)) {
                by byVar = this.j;
                if (byVar != null) {
                    byVar.a(by.a.network_exception);
                    return;
                }
                return;
            }
            if (gl.a != 1) {
                for (int i = 0; i < 3; i++) {
                    try {
                        if (gl.a(this.i, er.f())) {
                            break;
                        }
                    } catch (Throwable th) {
                        hn.c(th, "SiteFileFetch", "authOffLineDownLoad");
                        th.printStackTrace();
                    }
                }
            }
            if (gl.a != 1) {
                by byVar2 = this.j;
                if (byVar2 != null) {
                    byVar2.a(by.a.amap_exception);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.b());
            String str = File.separator;
            sb.append(str);
            sb.append(this.a.c());
            if (!(new File(sb.toString()).length() >= 10)) {
                this.e = true;
            }
            if (this.e) {
                long jC = c();
                this.d = jC;
                if (jC != -1 && jC != -2) {
                    this.c = jC;
                }
                this.b = 0L;
            }
            by byVar3 = this.j;
            if (byVar3 != null) {
                byVar3.i();
            }
            if (this.b >= this.c) {
                onFinish();
                return;
            }
            bz bzVar = new bz(this.k);
            bzVar.setConnectionTimeout(30000);
            bzVar.setSoTimeout(30000);
            this.l = new it(bzVar, this.b, this.c, MapsInitializer.getProtocol() == 2);
            this.m = new bo(this.a.b() + str + this.a.c(), this.b);
            this.l.a(this);
        } catch (AMapException e) {
            hn.c(e, "SiteFileFetch", WatchFaceApi.SORT_DOWNLOAD);
            by byVar4 = this.j;
            if (byVar4 != null) {
                byVar4.a(by.a.amap_exception);
            }
        } catch (IOException unused) {
            by byVar5 = this.j;
            if (byVar5 != null) {
                byVar5.a(by.a.file_io_exception);
            }
        }
    }

    public final void b() {
        it itVar = this.l;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // com.amap.api.mapcore.util.im.a
    public final void onDownload(byte[] bArr, long j) {
        try {
            this.m.a(bArr);
            this.b = j;
            d();
        } catch (IOException e) {
            e.printStackTrace();
            hn.c(e, "fileAccessI", "fileAccessI.write(byte[] data)");
            by byVar = this.j;
            if (byVar != null) {
                byVar.a(by.a.file_io_exception);
            }
            it itVar = this.l;
            if (itVar != null) {
                itVar.a();
            }
        }
    }

    @Override // com.amap.api.mapcore.util.im.a
    public final void onException(Throwable th) {
        bo boVar;
        this.n = true;
        b();
        by byVar = this.j;
        if (byVar != null) {
            byVar.a(by.a.network_exception);
        }
        if ((th instanceof IOException) || (boVar = this.m) == null) {
            return;
        }
        boVar.a();
    }

    @Override // com.amap.api.mapcore.util.im.a
    public final void onFinish() {
        d();
        by byVar = this.j;
        if (byVar != null) {
            byVar.j();
        }
        bo boVar = this.m;
        if (boVar != null) {
            boVar.a();
        }
        a aVar = this.h;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.amap.api.mapcore.util.im.a
    public final void onStop() {
        if (this.n) {
            return;
        }
        by byVar = this.j;
        if (byVar != null) {
            byVar.k();
        }
        e();
    }

    public final void a(a aVar) {
        this.h = aVar;
    }
}
