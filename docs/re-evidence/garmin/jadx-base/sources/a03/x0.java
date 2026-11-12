package a03;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.skydoves.flexible.core.SwipeableV2State$swipeDraggableState$1$drag$2", f = "SwipeableV2.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend")
public final class x0 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p008y1.v0, t13.d<? super Unit>, Object> f229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0.b f230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(e23.p<? super p008y1.v0, ? super t13.d<? super Unit>, ? extends Object> pVar, r0.b bVar, t13.d<? super x0> dVar) {
        super(1, dVar);
        this.f229b = pVar;
        this.f230c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x0(this.f229b, this.f230c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((x0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f228a;
        if (i14 == 0) {
            o13.r.b(obj);
            r0.b.a aVar2 = this.f230c.f186a;
            this.f228a = 1;
            if (this.f229b.invoke(aVar2, this) == aVar) {
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
