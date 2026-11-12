package ki1;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$getDeviceInfo$1", f = "FindMyDeviceViewModel.kt", l = {183}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f104894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f104894c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f104894c, dVar);
        nVar.f104893b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        Object value4;
        b0 b0Var = (b0) this.f104893b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104892a;
        l lVar = this.f104894c;
        if (i14 == 0) {
            o13.r.b(obj);
            String strF = a0.f(lVar.f104852a, "[getDeviceInfo] started [deviceId=", "]");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "FindMyDeviceViewModel", strF);
            p2 p2Var = lVar.f104859h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u.b.f104908a));
            ii1.c cVar = lVar.f104853b;
            long j8 = lVar.f104852a;
            this.f104893b = b0Var;
            this.f104892a = 1;
            objA = cVar.a(j8, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objA = ((o13.q) obj).f128597a;
        }
        int i15 = o13.q.f128596b;
        if (!(objA instanceof o13.q.b)) {
            fi1.a aVar3 = (fi1.a) objA;
            String strF2 = a0.f(lVar.f104852a, "[getDeviceInfo] finished successfully [deviceId=", "]");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var2, "FindMyDeviceViewModel", strF2);
            p2 p2Var2 = lVar.f104860i;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, aVar3));
            p2 p2Var3 = lVar.f104859h;
            do {
                value4 = p2Var3.getValue();
            } while (!p2Var3.b(value4, u.c.f104909a));
        }
        Throwable thB = o13.q.b(objA);
        if (thB != null) {
            y.f136664a.getClass();
            y.a.d("FindMyDeviceViewModel", thB);
            p2 p2Var4 = lVar.f104859h;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, new u.a(thB)));
        }
        return Unit.INSTANCE;
    }
}
