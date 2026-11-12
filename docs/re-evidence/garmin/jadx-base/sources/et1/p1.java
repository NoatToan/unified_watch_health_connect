package et1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailsMainScreenKt$TrailsBottomSheetMainScreen$4$2$3$1$1$1$1$1", f = "TrailsMainScreen.kt", l = {475}, m = "invokeSuspend", v = 2)
public final class p1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ je2.b<?> f65755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.c f65756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(je2.b<?> bVar, pt1.c cVar, t13.d<? super p1> dVar) {
        super(2, dVar);
        this.f65755b = bVar;
        this.f65756c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p1(this.f65755b, this.f65756c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65754a;
        if (i14 == 0) {
            o13.r.b(obj);
            ke2.b bVar = this.f65756c.f140819d.f140825a;
            this.f65754a = 1;
            if (this.f65755b.g(bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
