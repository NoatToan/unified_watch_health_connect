package defpackage;

import androidx.camera.core.impl.CameraCaptureFailure;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xe3 extends we3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<we3> f39039a;

    @Override // defpackage.we3
    public void a() {
        Iterator<we3> it = this.f39039a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // defpackage.we3
    public void b(ye3 ye3Var) {
        Iterator<we3> it = this.f39039a.iterator();
        while (it.hasNext()) {
            it.next().b(ye3Var);
        }
    }

    @Override // defpackage.we3
    public void c(CameraCaptureFailure cameraCaptureFailure) {
        Iterator<we3> it = this.f39039a.iterator();
        while (it.hasNext()) {
            it.next().c(cameraCaptureFailure);
        }
    }

    public List<we3> d() {
        return this.f39039a;
    }
}
