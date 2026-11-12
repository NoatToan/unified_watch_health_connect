package b0;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements androidx.camera.core.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.e f14037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.e f14038c;

    public /* synthetic */ n0(androidx.camera.core.e eVar, androidx.camera.core.e eVar2, int i14) {
        this.f14036a = i14;
        this.f14037b = eVar;
        this.f14038c = eVar2;
    }

    @Override // androidx.camera.core.b.a
    public final void e(androidx.camera.core.b bVar) throws Exception {
        int i14 = this.f14036a;
        androidx.camera.core.e eVar = this.f14038c;
        switch (i14) {
            case 0:
                int i15 = ImageProcessingUtil.f5418a;
                eVar.close();
                break;
            default:
                int i16 = ImageProcessingUtil.f5418a;
                eVar.close();
                break;
        }
    }
}
