package k02;

import e23.p;
import f2.m;
import f2.p0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.grid.GridDragAndDropState$onDrag$1", f = "GridDragAndDropState.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f102103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f102104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f102105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Integer num, m mVar, m mVar2, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f102102b = dVar;
        this.f102103c = num;
        this.f102104d = mVar;
        this.f102105e = mVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f102102b, this.f102103c, this.f102104d, this.f102105e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102101a;
        d dVar = this.f102102b;
        if (i14 == 0) {
            r.b(obj);
            p0 p0Var = dVar.f102106a;
            int iIntValue = this.f102103c.intValue();
            int iH = dVar.f102106a.h();
            this.f102101a = 1;
            if (p0Var.j(iIntValue, iH, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        dVar.f102108c.invoke(new Integer(this.f102104d.getF62559a()), new Integer(this.f102105e.getF62559a()));
        return Unit.INSTANCE;
    }
}
