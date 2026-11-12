package c1;

import ab.j;
import androidx.camera.core.impl.z1;
import java.util.Objects;
import java.util.concurrent.Executor;
import z0.a0;

/* JADX INFO: loaded from: classes.dex */
public class b implements z1.a<b1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1.c f22435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.video.internal.audio.b f22436b;

    public b(androidx.camera.video.internal.audio.b bVar, b1.c cVar) {
        this.f22436b = bVar;
        this.f22435a = cVar;
    }

    @Override // androidx.camera.core.impl.z1.a
    public final void a(b1.c.a aVar) {
        b1.c.a aVar2 = aVar;
        Objects.requireNonNull(aVar2);
        androidx.camera.video.internal.audio.b bVar = this.f22436b;
        if (bVar.f5940l == this.f22435a) {
            Objects.toString(bVar.f5936h);
            aVar2.toString();
            if (bVar.f5936h != aVar2) {
                bVar.f5936h = aVar2;
                bVar.c();
            }
        }
    }

    @Override // androidx.camera.core.impl.z1.a
    public final void onError(Throwable th3) {
        androidx.camera.video.internal.audio.b bVar = this.f22436b;
        if (bVar.f5940l == this.f22435a) {
            Executor executor = bVar.f5938j;
            a0.c cVar = bVar.f5939k;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new j(28, cVar, th3));
        }
    }
}
