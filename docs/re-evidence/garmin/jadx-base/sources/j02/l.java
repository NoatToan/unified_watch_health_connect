package j02;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.ReorderableCollectionItemScopeImpl$longPressDraggableHandle$1$2$1$1", f = "ReorderableLazyCollection.kt", l = {733}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f96105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<n4.c> f96106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<g6.m> f96107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, p1<n4.c> p1Var, p1<g6.m> p1Var2, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f96105b = mVar;
        this.f96106c = p1Var;
        this.f96107d = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f96105b, this.f96106c, this.f96107d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96104a;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = this.f96106c.getF182175a().f123544a;
            m mVar = this.f96105b;
            long jI = n4.c.i(j8, mVar.f96113c.invoke().f123544a);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
            p1<g6.m> p1Var = this.f96107d;
            float f14 = (((int) (p1Var.getF182175a().f76013a >> 32)) / 2.0f) + fIntBitsToFloat;
            float fIntBitsToFloat2 = (((int) (p1Var.getF182175a().f76013a & 4294967295L)) / 2.0f) + Float.intBitsToFloat((int) (jI & 4294967295L));
            long jFloatToRawIntBits = Float.floatToRawIntBits(f14);
            long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
            s<?> sVar = mVar.f96111a;
            Object obj2 = mVar.f96112b;
            this.f96104a = 1;
            if (sVar.g(obj2, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), this) == aVar) {
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
