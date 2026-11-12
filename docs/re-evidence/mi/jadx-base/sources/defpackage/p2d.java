package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.h;
import androidx.camera.core.m;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class p2d extends h {

    public class a implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f29933a;

        public a(m mVar) {
            this.f29933a = mVar;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            this.f29933a.close();
        }
    }

    @Override // androidx.camera.core.h
    public m d(p5d p5dVar) {
        return p5dVar.e();
    }

    @Override // androidx.camera.core.h
    public void g() {
    }

    @Override // androidx.camera.core.h
    public void p(m mVar) {
        oua.b(e(mVar), new a(mVar), li3.a());
    }
}
