package et1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailsMainScreenKt$TrailsBottomSheetMainScreen$4$2$3$1$3$1", f = "TrailsMainScreen.kt", l = {498}, m = "invokeSuspend", v = 2)
public final class r1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.c f65817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f65818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je2.b<?> f65819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(pt1.c cVar, e23.a<Unit> aVar, je2.b<?> bVar, t13.d<? super r1> dVar) {
        super(2, dVar);
        this.f65817b = cVar;
        this.f65818c = aVar;
        this.f65819d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r1(this.f65817b, this.f65818c, this.f65819d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65816a;
        if (i14 == 0) {
            o13.r.b(obj);
            pt1.i iVar = this.f65817b.f140821f.f140870d;
            if (iVar != null) {
                le2.a aVar2 = iVar.f140862g;
                aVar2.getClass();
                List<ke2.b> listK = p13.x.k(aVar2.f112052a, aVar2.f112053b);
                this.f65816a = 1;
                if (this.f65819d.f(listK, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f65818c.invoke();
        return Unit.INSTANCE;
    }
}
