package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.r;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class g3d extends wd3 {
    public static final g3d c = new g3d(new h3d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3d f18547b;

    public g3d(h3d h3dVar) {
        this.f18547b = h3dVar;
    }

    @Override // defpackage.wd3, androidx.camera.core.impl.e.b
    public void a(r<?> rVar, e.a aVar) {
        super.a(rVar, aVar);
        if (!(rVar instanceof i)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        i iVar = (i) rVar;
        pe3.a aVar2 = new pe3.a();
        if (iVar.T()) {
            this.f18547b.a(iVar.L(), aVar2);
        }
        aVar.e(aVar2.c());
    }
}
