package a0;

import androidx.camera.core.CameraControl;
import l0.j;
import v.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f18b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f19c;

    public /* synthetic */ b(d dVar, androidx.concurrent.futures.b.a aVar, int i14) {
        this.f17a = i14;
        this.f18b = dVar;
        this.f19c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17a) {
            case 0:
                d dVar = this.f18b;
                dVar.f23b = true;
                CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options.");
                androidx.concurrent.futures.b.a<Void> aVar = dVar.f28g;
                if (aVar != null) {
                    aVar.d(operationCanceledException);
                    dVar.f28g = null;
                }
                dVar.f28g = this.f19c;
                if (dVar.f22a) {
                    l lVar = dVar.f24c;
                    lVar.getClass();
                    androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
                    androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
                    aVar2.f6080b = dVar2;
                    aVar2.f6079a = v.h.class;
                    try {
                        lVar.f173879c.execute(new v.i(lVar, aVar2, 0));
                        aVar2.f6079a = "updateSessionConfigAsync";
                    } catch (Exception e4) {
                        dVar2.a(e4);
                    }
                    j.f(dVar2).addListener(new c(dVar, 0), dVar.f25d);
                    dVar.f23b = false;
                }
                break;
            default:
                d dVar3 = this.f18b;
                dVar3.f23b = true;
                CameraControl.OperationCanceledException operationCanceledException2 = new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options.");
                androidx.concurrent.futures.b.a<Void> aVar3 = dVar3.f28g;
                if (aVar3 != null) {
                    aVar3.d(operationCanceledException2);
                    dVar3.f28g = null;
                }
                dVar3.f28g = this.f19c;
                if (dVar3.f22a) {
                    l lVar2 = dVar3.f24c;
                    lVar2.getClass();
                    androidx.concurrent.futures.b.a aVar4 = new androidx.concurrent.futures.b.a();
                    androidx.concurrent.futures.b.d<T> dVar4 = new androidx.concurrent.futures.b.d<>(aVar4);
                    aVar4.f6080b = dVar4;
                    aVar4.f6079a = v.h.class;
                    try {
                        lVar2.f173879c.execute(new v.i(lVar2, aVar4, 0));
                        aVar4.f6079a = "updateSessionConfigAsync";
                    } catch (Exception e14) {
                        dVar4.a(e14);
                    }
                    j.f(dVar4).addListener(new c(dVar3, 0), dVar3.f25d);
                    dVar3.f23b = false;
                }
                break;
        }
    }
}
