package il2;

import e23.p;
import o13.r;
import o53.b0;
import ok2.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.legacy.SyncInitializerShim$initializeGCSync$3", f = "SyncInitializerShim.kt", l = {}, m = "invokeSuspend")
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f94061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<al2.p> f94062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e eVar, e23.a<? extends al2.p> aVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f94061a = eVar;
        this.f94062b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f94061a, this.f94062b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e23.a<al2.p> aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (this.f94061a.f94040b.j() && (aVar = this.f94062b) != null) {
            a0.f132585h.a().b(aVar.invoke());
        }
        return Unit.INSTANCE;
    }
}
