package ll2;

import e23.p;
import o13.r;
import o53.b0;
import o53.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)[B"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.mlr.MLRTransportPipe$configure$response$2", f = "MLRTransportPipe.kt", l = {379}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super byte[]>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f113470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f113470b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f113470b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super byte[]> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113469a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        s sVar = this.f113470b.f113453f;
        this.f113469a = 1;
        Object objC = sVar.C(this);
        return objC == aVar ? aVar : objC;
    }
}
