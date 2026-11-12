package ct1;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.images.ImagesPreviewCarouselKt$PageNumberIndicator$1$1", f = "ImagesPreviewCarousel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f55517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i14, p1<Boolean> p1Var, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f55516b = i14;
        this.f55517c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f55516b, this.f55517c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55515a;
        if (i14 == 0) {
            r.b(obj);
            long j8 = this.f55516b;
            this.f55515a = 1;
            if (m0.b(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f55517c.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
