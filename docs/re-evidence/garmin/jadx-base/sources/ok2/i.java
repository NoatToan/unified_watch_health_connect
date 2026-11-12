package ok2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$finalizeLastItem$1", f = "CoreTransferManager.kt", l = {362}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f132737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bl2.b f132738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f132739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<al2.b, CoreTransferException, Unit> f132740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(bl2.b bVar, g gVar, e23.p<? super al2.b, ? super CoreTransferException, Unit> pVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f132738c = bVar;
        this.f132739d = gVar;
        this.f132740e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f132738c, this.f132739d, this.f132740e, dVar);
        iVar.f132737b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132736a;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.b0 b0Var = (o53.b0) this.f132737b;
            bl2.b bVar = this.f132738c;
            if (bVar != null) {
                this.f132739d.f132688g.debug("await final task finish for " + bVar.f18603d.getId());
                this.f132737b = b0Var;
                this.f132736a = 1;
                if (bVar.b(this) == aVar) {
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
        g gVar = this.f132739d;
        Object obj2 = gVar.f132692k.f132601c;
        e23.p<al2.b, CoreTransferException, Unit> pVar = this.f132740e;
        synchronized (obj2) {
            bl2.b bVar2 = gVar.f132694m.get();
            if (bVar2 != null) {
                gVar.f132688g.warn("finalizeLastItem aborted, new transfer " + bVar2.f18603d.getId() + " active");
                return Unit.INSTANCE;
            }
            g0 g0Var = gVar.f132692k.f132603e;
            if (g0Var != null) {
                gVar.y(g0Var);
            } else {
                List<al2.j> list = gVar.f132695n.d().f128595b;
                if (pVar != null) {
                    al2.b bVar3 = al2.b.NO_ITEMS;
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((al2.j) next).f3804a != null);
                    al2.j jVar = (al2.j) next;
                    pVar.invoke(bVar3, jVar != null ? jVar.f3806c : null);
                }
            }
            if (gVar.f132695n.h(0, null, false)) {
                g.J(gVar, "moreRetryItems", null, false, 6);
            }
            return Unit.INSTANCE;
        }
    }
}
