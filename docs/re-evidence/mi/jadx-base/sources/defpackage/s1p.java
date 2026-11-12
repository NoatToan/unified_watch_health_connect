package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class s1p implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f33178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo5 f33179b;
    public boolean c;
    public long d;

    public s1p(a aVar, zo5 zo5Var) {
        this.f33178a = (a) rk1.e(aVar);
        this.f33179b = (zo5) rk1.e(zo5Var);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws IOException {
        long jB = this.f33178a.b(bVar);
        this.d = jB;
        if (jB == 0) {
            return 0L;
        }
        if (bVar.h == -1 && jB != -1) {
            bVar = bVar.f(0L, jB);
        }
        this.c = true;
        this.f33179b.b(bVar);
        return this.d;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        try {
            this.f33178a.close();
        } finally {
            if (this.c) {
                this.c = false;
                this.f33179b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> d() {
        return this.f33178a.d();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void f(fxp fxpVar) {
        rk1.e(fxpVar);
        this.f33178a.f(fxpVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.f33178a.h();
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.f33178a.read(bArr, i, i2);
        if (i3 > 0) {
            this.f33179b.write(bArr, i, i3);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) i3);
            }
        }
        return i3;
    }
}
