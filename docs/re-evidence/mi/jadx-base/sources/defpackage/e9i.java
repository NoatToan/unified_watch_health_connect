package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e9i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityTaskManager f16418b;
    public final int c;

    public e9i(a aVar, PriorityTaskManager priorityTaskManager, int i) {
        this.f16417a = (a) rk1.e(aVar);
        this.f16418b = (PriorityTaskManager) rk1.e(priorityTaskManager);
        this.c = i;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws IOException {
        this.f16418b.b(this.c);
        return this.f16417a.b(bVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        this.f16417a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> d() {
        return this.f16417a.d();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void f(fxp fxpVar) {
        rk1.e(fxpVar);
        this.f16417a.f(fxpVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.f16417a.h();
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.f16418b.b(this.c);
        return this.f16417a.read(bArr, i, i2);
    }
}
