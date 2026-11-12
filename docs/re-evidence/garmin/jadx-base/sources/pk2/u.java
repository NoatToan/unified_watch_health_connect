package pk2;

import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Llk2/x;", "<anonymous>", "(Lo53/b0;)Llk2/x;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$requestDeviceFileList$2", f = "AgentQueueHelper.kt", l = {462}, m = "invokeSuspend")
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super lk2.x>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f138484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lk2.v f138485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<f0> f138486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(b bVar, lk2.v vVar, List<? extends f0> list, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f138484b = bVar;
        this.f138485c = vVar;
        this.f138486d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f138484b, this.f138485c, this.f138486d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super lk2.x> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138483a;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar = this.f138484b;
            Logger logger = bVar.f138362e;
            String strJ = bVar.j(this.f138486d);
            StringBuilder sb3 = new StringBuilder("listFiles(");
            lk2.v vVar = this.f138485c;
            sb3.append(vVar);
            sb3.append(") for ");
            sb3.append(strJ);
            logger.info(sb3.toString());
            lk2.b bVarC = bVar.f138360c.c(bVar.f138359b.getF92741e());
            if (bVarC == null) {
                return null;
            }
            this.f138483a = 1;
            obj = bVarC.h(vVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return (lk2.x) obj;
    }
}
