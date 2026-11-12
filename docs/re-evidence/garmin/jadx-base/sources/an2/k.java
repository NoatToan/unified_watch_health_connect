package an2;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import e23.p;
import java.util.Collection;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "<anonymous>", "(Lo53/b0;)Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager$reconcileDevices$2", f = "SharedDeviceManager.kt", l = {336, 339}, m = "invokeSuspend")
public final class k extends v13.i implements p<b0, t13.d<? super Collection<? extends SharedDeviceInfo>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f4586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f4588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f4588c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f4588c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Collection<? extends SharedDeviceInfo>> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4587b;
        a aVar = this.f4588c;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th3 = this.f4586a;
                r.b(obj);
                throw th3;
            }
            r.b(obj);
            Collection<String> collection = aVar.f4494a.f4510b;
            if (collection != null && collection.isEmpty()) {
                a.d.a(a.f4492e).warn("Cannot call reconcileDevices if app provided empty deviceProductNumbers list");
                throw new IllegalStateException("Cannot call reconcileDevices if app provided empty deviceProductNumbers list");
            }
            dn2.d dVarI = aVar.f4494a.i();
            this.f4587b = 1;
            Object objA = aVar.a(dVarI, this);
            return objA == obj2 ? obj2 : objA;
        } catch (Throwable th4) {
            this.f4586a = th4;
            this.f4587b = 2;
            aVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new f(aVar, null), this);
            if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 != obj2) {
                throw th4;
            }
        }
    }
}
