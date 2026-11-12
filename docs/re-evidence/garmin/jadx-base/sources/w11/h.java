package w11;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import b0.l0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw11/h;", "Lb0/l0$f;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends l0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f181225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Bitmap, Unit> f181226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f181227c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(e23.a<Unit> aVar, e23.l<? super Bitmap, Unit> lVar, e23.a<Unit> aVar2) {
        this.f181225a = aVar;
        this.f181226b = lVar;
        this.f181227c = aVar2;
    }

    @Override // b0.l0.f
    public final void a() {
        this.f181225a.invoke();
    }

    @Override // b0.l0.f
    public final void b(androidx.camera.core.e eVar) throws Exception {
        eVar.getClass();
        this.f181226b.invoke(eVar.C0());
        eVar.close();
    }

    @Override // b0.l0.f
    public final void c(ImageCaptureException imageCaptureException) {
        imageCaptureException.getClass();
        this.f181227c.invoke();
    }
}
