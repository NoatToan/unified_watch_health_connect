package uk;

import com.dsi.vivoki.antble.gfdi.VivokiException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/dsi/vivoki/antble/gfdi/VivokiGfdiEmulator$Companion$startAntCommunication$2$1", "Lsk/l;", "L;", "reason", "", "handshakeFailed", "(L;)V", "vivoki_release"}, k = 1, mv = {1, 4, 0})
public final class m implements sk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d f171720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sk.d f171721b;

    public m(t13.d dVar, sk.d dVar2) {
        this.f171720a = dVar;
        this.f171721b = dVar2;
    }

    @Override // sk.l
    public final void a(tk.k kVar) {
        kVar.getClass();
        o13.p pVar = new o13.p(kVar, this.f171721b);
        int i14 = o13.q.f128596b;
        this.f171720a.resumeWith(pVar);
    }

    @Override // sk.l
    public final void b(String str) {
        VivokiException vivokiException = new VivokiException(str);
        int i14 = o13.q.f128596b;
        this.f171720a.resumeWith(new o13.q.b(vivokiException));
    }
}
