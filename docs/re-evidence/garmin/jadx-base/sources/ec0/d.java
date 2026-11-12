package ec0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.AuthRegistry;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.bleupgrade.BLEUpgradeCoordinator$postBondedTasks$1", f = "BLEUpgradeCoordinator.kt", l = {129, 130}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f63780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f63781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f63780b = aVar;
        this.f63781c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f63780b, this.f63781c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r9 == r0) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f63779a;
        String str = this.f63781c;
        a aVar = this.f63780b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            int i15 = a.f63766g;
            aVar.c();
            return Unit.INSTANCE;
        }
        r.b(obj);
        int i16 = a.f63766g;
        aVar.getClass();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "BLEUpgradeCoordinator", "2.- unregisterAuthInfo");
        AuthRegistry.getInstance().unregisterAuthInfo(str);
        i2.a.b(a2Var, "BLEUpgradeCoordinator", "3.- restartConnection");
        da2.d.b().f58886a.k(str);
        this.f63779a = 1;
        if (a.a(aVar, str, this) != obj2) {
        }
        return obj2;
        this.f63779a = 2;
        int i17 = a.f63766g;
        aVar.getClass();
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, "BLEUpgradeCoordinator", "5.- clearGarminAuth");
        if (aVar.f63769c != null) {
            x53.c cVar = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new b(aVar, str, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
        } else {
            objE0 = Unit.INSTANCE;
        }
    }
}
