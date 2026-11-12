package hj;

import android.graphics.Bitmap;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements ui.j<si.a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.d f83957a;

    public h(xi.d dVar) {
        this.f83957a = dVar;
    }

    @Override // ui.j
    public final u<Bitmap> a(si.a aVar, int i14, int i15, ui.h hVar) {
        return dj.e.c(aVar.b(), this.f83957a);
    }

    @Override // ui.j
    public final /* bridge */ /* synthetic */ boolean b(si.a aVar, ui.h hVar) {
        return true;
    }
}
