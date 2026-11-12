package ha;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f82616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f82617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f82618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f82619d;

    public m(d dVar) {
        dVar.getClass();
        this.f82616a = dVar;
        this.f82618c = Uri.EMPTY;
        this.f82619d = Collections.EMPTY_MAP;
    }

    @Override // ha.d
    public final void a(n nVar) {
        nVar.getClass();
        this.f82616a.a(nVar);
    }

    @Override // ha.d
    public final long b(g gVar) {
        d dVar = this.f82616a;
        this.f82618c = gVar.f82555a;
        this.f82619d = Collections.EMPTY_MAP;
        try {
            return dVar.b(gVar);
        } finally {
            Uri uri = dVar.getUri();
            if (uri != null) {
                this.f82618c = uri;
            }
            this.f82619d = dVar.getResponseHeaders();
        }
    }

    @Override // ha.d
    public final void close() {
        this.f82616a.close();
    }

    @Override // ha.d
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f82616a.getResponseHeaders();
    }

    @Override // ha.d
    public final Uri getUri() {
        return this.f82616a.getUri();
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) {
        int i16 = this.f82616a.read(bArr, i14, i15);
        if (i16 != -1) {
            this.f82617b += (long) i16;
        }
        return i16;
    }
}
