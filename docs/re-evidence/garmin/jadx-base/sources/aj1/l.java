package aj1;

import c80.q;
import com.garmin.android.apps.connectmobile.k1;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$getNutritionSettings$1", f = "NotificationsViewModel.kt", l = {58, 59}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f3454c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f3454c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3453b;
        p pVar = this.f3454c;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z14 = this.f3452a;
                r.b(obj);
            }
            pVar.f3481b.j(Boolean.valueOf(!z14 && ((x01.e) obj).f188255d == x01.f.ACTIVE));
            return Unit.INSTANCE;
        }
        r.b(obj);
        if (!k1.f37122a.w0()) {
            pVar.f3481b.j(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        j1 j1Var = pVar.f3487h;
        q qVar = q.NUTRITION;
        this.f3453b = 1;
        obj = j1Var.l(qVar, this);
        if (obj != aVar) {
        }
        return aVar;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        x01.i iVar = pVar.f3488i;
        this.f3452a = zBooleanValue;
        this.f3453b = 2;
        Object objA = iVar.a(true, this);
        if (objA != aVar) {
            z14 = zBooleanValue;
            obj = objA;
            pVar.f3481b.j(Boolean.valueOf(!z14 && ((x01.e) obj).f188255d == x01.f.ACTIVE));
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
