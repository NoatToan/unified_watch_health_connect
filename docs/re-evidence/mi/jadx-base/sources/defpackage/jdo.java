package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class jdo implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22684b;
    public Uri c = Uri.EMPTY;
    public Map<String, List<String>> d = Collections.emptyMap();

    public jdo(a aVar) {
        this.f22683a = (a) rk1.e(aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws IOException {
        this.c = bVar.f8404a;
        this.d = Collections.emptyMap();
        long jB = this.f22683a.b(bVar);
        this.c = (Uri) rk1.e(h());
        this.d = d();
        return jB;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        this.f22683a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> d() {
        return this.f22683a.d();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void f(fxp fxpVar) {
        rk1.e(fxpVar);
        this.f22683a.f(fxpVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.f22683a.h();
    }

    public long r() {
        return this.f22684b;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f22683a.read(bArr, i, i2);
        if (i3 != -1) {
            this.f22684b += (long) i3;
        }
        return i3;
    }

    public Uri s() {
        return this.c;
    }

    public Map<String, List<String>> t() {
        return this.d;
    }

    public void u() {
        this.f22684b = 0L;
    }
}
