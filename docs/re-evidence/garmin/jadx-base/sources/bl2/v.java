package bl2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pk2.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpk2/f0;", "agent", "", "<anonymous>", "(Lpk2/f0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer$doExecuteWithRetry$5", f = "ReadActiveTransfer.kt", l = {171}, m = "invokeSuspend")
public final class v extends v13.i implements e23.p<f0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f18734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk2.d f18735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList<o13.p<pk2.x, List<UUID>>> f18736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r rVar, wk2.d dVar, ArrayList<o13.p<pk2.x, List<UUID>>> arrayList, t13.d<? super v> dVar2) {
        super(2, dVar2);
        this.f18734c = rVar;
        this.f18735d = dVar;
        this.f18736e = arrayList;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f18734c, this.f18735d, this.f18736e, dVar);
        vVar.f18733b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(f0 f0Var, t13.d<? super Unit> dVar) {
        return ((v) create(f0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        f0 f0Var;
        List<UUID> listV;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18732a;
        if (i14 == 0) {
            o13.r.b(obj);
            f0 f0Var2 = (f0) this.f18733b;
            this.f18733b = f0Var2;
            this.f18732a = 1;
            Object objQ = r.q(this.f18734c, f0Var2, this.f18735d, this);
            if (objQ == aVar) {
                return aVar;
            }
            f0Var = f0Var2;
            obj = objQ;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f0Var = (f0) this.f18733b;
            o13.r.b(obj);
        }
        pk2.x xVar = (pk2.x) obj;
        if (xVar != null) {
            f0Var.getClass();
            try {
                listV = f0Var.v(xVar);
            } catch (Throwable unused) {
                listV = f0Var.getF159941g().f113303b;
            }
            this.f18736e.add(new o13.p<>(xVar, listV));
        }
        return Unit.INSTANCE;
    }
}
