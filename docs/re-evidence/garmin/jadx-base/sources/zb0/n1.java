package zb0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n1 implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd2.f f203584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f203585b;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(sd2.f fVar, t13.d<? super Boolean> dVar) {
        this.f203584a = fVar;
        this.f203585b = dVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        Throwable th4 = th3;
        th4.getClass();
        l1 l1Var = l1.f203565a;
        a2 a2Var = a2.DEVICES;
        String str = "removeDevice FAILURE " + th4 + " -> " + this.f203584a;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SystemBondingLostEventHandler", str);
        int i14 = o13.q.f128596b;
        this.f203585b.resumeWith(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
