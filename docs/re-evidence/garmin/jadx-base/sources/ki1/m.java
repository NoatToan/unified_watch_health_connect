package ki1;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$getCurrentLocation$1", f = "FindMyDeviceViewModel.kt", l = {248}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f104891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f104891c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f104891c, dVar);
        mVar.f104890b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        b0 b0Var = (b0) this.f104890b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104889a;
        l lVar = this.f104891c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = lVar.f104863l;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u.b.f104908a));
            String strF = a0.f(lVar.f104852a, "[getCurrentLocation] get current location [deviceId=", "]");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "FindMyDeviceViewModel", strF);
            ji1.b bVar = lVar.f104855d;
            this.f104890b = b0Var;
            this.f104889a = 1;
            obj = bVar.a(this);
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
        ji1.e eVar = (ji1.e) obj;
        if (eVar instanceof ji1.e.a) {
            String strF2 = a0.f(lVar.f104852a, "[getCurrentLocation] get current location successful [deviceId=", "]");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "FindMyDeviceViewModel", strF2);
            p2 p2Var2 = lVar.f104864m;
            do {
                value7 = p2Var2.getValue();
            } while (!p2Var2.b(value7, new a.C2008a(((ji1.e.a) eVar).f98820a)));
            p2 p2Var3 = lVar.f104863l;
            do {
                value8 = p2Var3.getValue();
            } while (!p2Var3.b(value8, u.c.f104909a));
        } else if (p005kotlin.jvm.internal.s.g(eVar, ji1.e.d.f98823a)) {
            String strF3 = a0.f(lVar.f104852a, "[getCurrentLocation] get current location unavailable [deviceId=", "]");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var3, "FindMyDeviceViewModel", strF3);
            p2 p2Var4 = lVar.f104863l;
            do {
                value6 = p2Var4.getValue();
            } while (!p2Var4.b(value6, u.c.f104909a));
        } else if (eVar instanceof ji1.e.b) {
            String strF4 = a0.f(lVar.f104852a, "[getCurrentLocation] get current location permissions denied [deviceId=", "]");
            y.f136664a.getClass();
            y.a.c("FindMyDeviceViewModel", strF4);
            p2 p2Var5 = lVar.f104863l;
            do {
                value4 = p2Var5.getValue();
            } while (!p2Var5.b(value4, new u.a(new s())));
            p2 p2Var6 = lVar.f104862k;
            do {
                value5 = p2Var6.getValue();
            } while (!p2Var6.b(value5, v.a.f104910a));
        } else {
            if (!p005kotlin.jvm.internal.s.g(eVar, ji1.e.c.f98822a)) {
                u0.r();
                return null;
            }
            String strF5 = a0.f(lVar.f104852a, "[getCurrentLocation] get current location service disabled [deviceId=", "]");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var4, "FindMyDeviceViewModel", strF5);
            p2 p2Var7 = lVar.f104863l;
            do {
                value2 = p2Var7.getValue();
            } while (!p2Var7.b(value2, new u.a(new s())));
            p2 p2Var8 = lVar.f104862k;
            do {
                value3 = p2Var8.getValue();
            } while (!p2Var8.b(value3, v.b.f104911a));
        }
        return Unit.INSTANCE;
    }
}
