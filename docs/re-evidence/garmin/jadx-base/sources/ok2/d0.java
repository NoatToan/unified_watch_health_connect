package ok2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.TransferManager$readFileFromDevice$2$2", f = "TransferManager.kt", l = {221}, m = "invokeSuspend")
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f132631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wk2.i f132632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f132633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f132634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(f0 f0Var, wk2.i iVar, UUID uuid, t13.d<? super Boolean> dVar, t13.d<? super d0> dVar2) {
        super(2, dVar2);
        this.f132631b = f0Var;
        this.f132632c = iVar;
        this.f132633d = uuid;
        this.f132634e = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f132631b, this.f132632c, this.f132633d, this.f132634e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132630a;
        wk2.i iVar = this.f132632c;
        f0 f0Var = this.f132631b;
        if (i14 == 0) {
            o13.r.b(obj);
            g gVar = f0Var.f132675a;
            this.f132630a = 1;
            g.b bVar = g.f132677s;
            if (gVar.G(iVar, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        g gVar2 = f0Var.f132675a;
        UUID uuid = this.f132633d;
        uuid.getClass();
        wk2.i iVarE = gVar2.f132695n.e(uuid);
        if (!p005kotlin.jvm.internal.s.g(iVarE != null ? iVarE.getF205163m() : null, iVar.getF205163m())) {
            int i15 = o13.q.f128596b;
            this.f132634e.resumeWith(new o13.q.b(new IllegalStateException("Item " + uuid + " already queued with different file metadata")));
        }
        return Unit.INSTANCE;
    }
}
