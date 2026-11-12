package ha;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.ContentDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.UdpDataSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import fa.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f82576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f82577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileDataSource f82578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AssetDataSource f82579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ContentDataSource f82580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f82581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UdpDataSource f82582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f82583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RawResourceDataSource f82584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f82585k;

    public h(Context context, String str, int i14, int i15, boolean z14) {
        i.b bVar = new i.b();
        bVar.f82606c = str;
        bVar.f82607d = i14;
        bVar.f82608e = i15;
        bVar.f82609f = z14;
        i iVar = new i(str, i14, i15, z14, false, bVar.f82604a, null, false);
        xa.h hVar = bVar.f82605b;
        if (hVar != null) {
            iVar.a(hVar);
        }
        this(context, iVar);
    }

    public static void d(d dVar, n nVar) {
        if (dVar != null) {
            dVar.a(nVar);
        }
    }

    @Override // ha.d
    public final void a(n nVar) {
        nVar.getClass();
        this.f82577c.a(nVar);
        this.f82576b.add(nVar);
        d(this.f82578d, nVar);
        d(this.f82579e, nVar);
        d(this.f82580f, nVar);
        d(this.f82581g, nVar);
        d(this.f82582h, nVar);
        d(this.f82583i, nVar);
        d(this.f82584j, nVar);
    }

    @Override // ha.d
    public final long b(g gVar) {
        fa.a.d(this.f82585k == null);
        Uri uri = gVar.f82555a;
        String scheme = uri.getScheme();
        int i14 = z.f70071a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f82575a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f82578d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f82578d = fileDataSource;
                    c(fileDataSource);
                }
                this.f82585k = this.f82578d;
            } else {
                if (this.f82579e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f82579e = assetDataSource;
                    c(assetDataSource);
                }
                this.f82585k = this.f82579e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f82579e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f82579e = assetDataSource2;
                c(assetDataSource2);
            }
            this.f82585k = this.f82579e;
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            if (this.f82580f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f82580f = contentDataSource;
                c(contentDataSource);
            }
            this.f82585k = this.f82580f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            d dVar = this.f82577c;
            if (zEquals) {
                if (this.f82581g == null) {
                    try {
                        d dVar2 = (d) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f82581g = dVar2;
                        c(dVar2);
                    } catch (ClassNotFoundException unused) {
                        fa.k.g("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e4) {
                        q2.v("Error instantiating RTMP extension", e4);
                        return 0L;
                    }
                    if (this.f82581g == null) {
                        this.f82581g = dVar;
                    }
                }
                this.f82585k = this.f82581g;
            } else if ("udp".equals(scheme)) {
                if (this.f82582h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f82582h = udpDataSource;
                    c(udpDataSource);
                }
                this.f82585k = this.f82582h;
            } else if ("data".equals(scheme)) {
                if (this.f82583i == null) {
                    c cVar = new c();
                    this.f82583i = cVar;
                    c(cVar);
                }
                this.f82585k = this.f82583i;
            } else if (com.google.android.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f82584j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.f82584j = rawResourceDataSource;
                    c(rawResourceDataSource);
                }
                this.f82585k = this.f82584j;
            } else {
                this.f82585k = dVar;
            }
        }
        return this.f82585k.b(gVar);
    }

    public final void c(d dVar) {
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f82576b;
            if (i14 >= arrayList.size()) {
                return;
            }
            dVar.a((n) arrayList.get(i14));
            i14++;
        }
    }

    @Override // ha.d
    public final void close() {
        d dVar = this.f82585k;
        if (dVar != null) {
            try {
                dVar.close();
            } finally {
                this.f82585k = null;
            }
        }
    }

    @Override // ha.d
    public final Map<String, List<String>> getResponseHeaders() {
        d dVar = this.f82585k;
        return dVar == null ? Collections.EMPTY_MAP : dVar.getResponseHeaders();
    }

    @Override // ha.d
    public final Uri getUri() {
        d dVar = this.f82585k;
        if (dVar == null) {
            return null;
        }
        return dVar.getUri();
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) {
        d dVar = this.f82585k;
        dVar.getClass();
        return dVar.read(bArr, i14, i15);
    }

    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f82586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d.a f82587b;

        public a(Context context, d.a aVar) {
            this.f82586a = context.getApplicationContext();
            aVar.getClass();
            this.f82587b = aVar;
        }

        @Override // ha.d.a
        public final d createDataSource() {
            return new h(this.f82586a, this.f82587b.createDataSource());
        }

        public a(Context context) {
            this(context, new i.b());
        }
    }

    public h(Context context, String str, boolean z14) {
        this(context, str, 8000, 8000, z14);
    }

    public h(Context context, boolean z14) {
        this(context, null, 8000, 8000, z14);
    }

    public h(Context context, d dVar) {
        this.f82575a = context.getApplicationContext();
        dVar.getClass();
        this.f82577c = dVar;
        this.f82576b = new ArrayList();
    }
}
