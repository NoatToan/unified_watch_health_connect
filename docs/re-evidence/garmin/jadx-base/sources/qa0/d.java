package qa0;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.migration.DeviceMigrationViewModel$applySelectedBackup$1$1", f = "DeviceMigrationViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f143847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sg1.c f143848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, sg1.c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f143847b = fVar;
        this.f143848c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f143847b, this.f143848c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143846a;
        f fVar = this.f143847b;
        if (i14 == 0) {
            r.b(obj);
            rg1.a aVar2 = fVar.f143853b;
            long j8 = fVar.f143852a;
            long j14 = this.f143848c.f159207e;
            this.f143846a = 1;
            obj = aVar2.c(j8, j14, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            p2 p2Var = fVar.f143856e;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, c.a((c) value2, null, 23)));
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            p2 p2Var2 = fVar.f143856e;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, c.a((c) value, null, 15)));
        }
        return Unit.INSTANCE;
    }
}
