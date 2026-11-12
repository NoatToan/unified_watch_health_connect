package il2;

import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.legacy.SyncInitializerShim$registerLegacyTransferManager$1$1", f = "SyncInitializerShim.kt", l = {}, m = "invokeSuspend")
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection<rs2.c> f94063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f94064b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Collection<? extends rs2.c> collection, g gVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f94063a = collection;
        this.f94064b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f94063a, this.f94064b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Collection<rs2.c> collection = this.f94063a;
        ArrayList<rs2.c> arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (!cl2.c.m((rs2.c) obj2)) {
                arrayList.add(obj2);
            }
        }
        for (rs2.c cVar : arrayList) {
            g.f94051h.info("Create legacy manager for " + cVar.getF92742f() + StringUtils.SPACE + cVar.getF92741e());
            g.a(this.f94064b, cVar);
        }
        return Unit.INSTANCE;
    }
}
