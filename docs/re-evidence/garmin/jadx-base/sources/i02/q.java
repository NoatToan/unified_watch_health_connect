package i02;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableState$onDrag$1$1", f = "ReorderableState.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<Object> f86913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f86914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f86915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p<Object> pVar, Object obj, Object obj2, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f86913b = pVar;
        this.f86914c = obj;
        this.f86915d = obj2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f86913b, this.f86914c, this.f86915d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86912a;
        if (i14 == 0) {
            o13.r.b(obj);
            p<Object> pVar = this.f86913b;
            e23.p<f, f, Integer> pVar2 = pVar.f86887c;
            Object obj2 = this.f86914c;
            f fVar = new f(pVar.l(obj2), pVar.m(obj2));
            Object obj3 = this.f86915d;
            pVar2.invoke(fVar, new f(pVar.l(obj3), pVar.m(obj3)));
            int i15 = pVar.i();
            int iJ = pVar.j();
            this.f86912a = 1;
            if (pVar.x(i15, iJ, this) == aVar) {
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
