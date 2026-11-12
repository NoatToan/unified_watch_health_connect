package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.google.common.net.HttpHeaders;
import fa.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha.d.a f8910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8913d;

    public i(String str, boolean z14, ha.d.a aVar) {
        fa.a.a((z14 && TextUtils.isEmpty(str)) ? false : true);
        this.f8910a = aVar;
        this.f8911b = str;
        this.f8912c = z14;
        this.f8913d = new HashMap();
    }

    public final byte[] a(UUID uuid, g.a aVar) {
        String str;
        String str2 = aVar.f8903b;
        if (this.f8912c || TextUtils.isEmpty(str2)) {
            str2 = this.f8911b;
        }
        if (TextUtils.isEmpty(str2)) {
            ha.g.b bVar = new ha.g.b();
            Uri uri = Uri.EMPTY;
            bVar.f82565a = uri;
            throw new MediaDrmCallbackException(bVar.a(), uri, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = androidx.media3.common.h.f8300e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = androidx.media3.common.h.f8298c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put(HttpHeaders.CONTENT_TYPE, str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f8913d) {
            map.putAll(this.f8913d);
        }
        return d.a(this.f8910a.createDataSource(), str2, aVar.f8902a, map);
    }

    public final byte[] b(g.c cVar) {
        return d.a(this.f8910a.createDataSource(), cVar.f8905b + "&signedRequest=" + z.n(cVar.f8904a), null, Collections.EMPTY_MAP);
    }

    public i(String str, ha.d.a aVar) {
        this(str, false, aVar);
    }
}
