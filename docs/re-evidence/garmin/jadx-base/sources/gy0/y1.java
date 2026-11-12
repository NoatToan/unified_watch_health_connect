package gy0;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lzp0/f;", "<anonymous>", "(Lo53/b0;)Lzp0/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.UploadEpicImagesUseCase$processImage$loadedImage$1", f = "UploadEpicImagesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y1 extends v13.i implements e23.p<o53.b0, t13.d<? super zp0.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f80283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bq0.k f80284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a2 a2Var, bq0.k kVar, t13.d<? super y1> dVar) {
        super(2, dVar);
        this.f80283a = a2Var;
        this.f80284b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y1(this.f80283a, this.f80284b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super zp0.f> dVar) {
        return ((y1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a2 a2Var = this.f80283a;
        bq0.c cVar = (bq0.c) a2Var.f80102c.getValue();
        Context context = a2Var.f80100a;
        int i14 = bq0.c.f19481c;
        return cVar.a(context, this.f80284b, null);
    }
}
