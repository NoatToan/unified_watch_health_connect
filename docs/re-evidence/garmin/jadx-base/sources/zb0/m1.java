package zb0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m1 implements e23.l<vm2.h, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd2.f f203573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f203574b;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(sd2.f fVar, t13.d<? super Boolean> dVar) {
        this.f203573a = fVar;
        this.f203574b = dVar;
    }

    @Override // e23.l
    public final Unit invoke(vm2.h hVar) {
        l1 l1Var = l1.f203565a;
        a2 a2Var = a2.DEVICES;
        StringBuilder sb3 = new StringBuilder("removeDevice SUCCESSFUL -> ");
        sd2.f fVar = this.f203573a;
        sb3.append(fVar);
        String string = sb3.toString();
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SystemBondingLostEventHandler", string);
        l1 l1Var2 = l1.f203565a;
        String strValueOf = String.valueOf(fVar.getUnitID());
        l1Var2.getClass();
        l1.a(strValueOf);
        int i14 = o13.q.f128596b;
        this.f203574b.resumeWith(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
