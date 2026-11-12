package fm2;

import o13.p;
import p005kotlin.Metadata;
import sm2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfm2/e;", "Lea2/f$d;", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements ea2.f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w.b f72132a;

    public e(w.b bVar) {
        this.f72132a = bVar;
    }

    @Override // ea2.f.d
    public final void a(long j8, long j14) {
        this.f72132a.a(j8, j14);
    }

    @Override // ea2.f.d
    public final void b(String str) {
        this.f72132a.b(null, str);
    }

    @Override // ea2.f.d
    public final void c(byte[] bArr) {
        w.b bVar = this.f72132a;
        if (bArr != null) {
            bVar.b(new p<>(bArr, null), null);
        } else {
            bVar.b(null, null);
        }
    }
}
