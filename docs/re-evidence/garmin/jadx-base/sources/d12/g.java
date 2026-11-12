package d12;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.usageindicators.UsageIndicatorsRepositoryImpl$getUsageIndicators$2", f = "UsageIndicatorsRepositoryImpl.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f57099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e12.e f57100c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, e12.e eVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f57099b = iVar;
        this.f57100c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f57099b, this.f57100c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57098a;
        if (i14 == 0) {
            r.b(obj);
            i iVar = this.f57099b;
            e12.e eVar = this.f57100c;
            bo1.a aVar2 = iVar.f57105c;
            if (eVar != null) {
                synchronized (aVar2.f19237b) {
                    aVar2.f19236a = eVar;
                }
                String strA = GsonUtil.a(eVar);
                qd2.a aVarB = qd2.a.b();
                if (aVarB != null) {
                    aVarB.g(qd2.a.b.INTELLIGENT_ROLES, strA);
                }
                i2.l("SnapshotDataManager", "setIntelligentRoleDTO: Stored to cache. IntelligentRolesDTO=".concat(strA));
            } else {
                aVar2.getClass();
            }
            b bVar = this.f57099b.f57104b;
            e12.e eVar2 = this.f57100c;
            this.f57098a = 1;
            if (bVar.a(eVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
