package q42;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq42/c0;", "Ld80/b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f142606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f142607b;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(e23.l<? super Boolean, Unit> lVar) {
        this.f142607b = lVar;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.DEVICES;
        aVar.getClass();
        i2.a.e(a2Var, "ERROR in DeviceSharingUtil.fetchRegisteredGCDevices");
        this.f142607b.invoke(Boolean.valueOf(this.f142606a));
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        Object obj2 = null;
        ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
        if (arrayList != null) {
            for (Object obj3 : arrayList) {
                bm2.c cVar = (bm2.c) obj3;
                if (u0.n(cVar != null ? cVar.getPartNumberPartial() : null, u0.P5)) {
                    obj2 = obj3;
                    break;
                }
            }
            if (((bm2.c) obj2) != null) {
                this.f142606a = true;
            }
        }
        this.f142607b.invoke(Boolean.valueOf(this.f142606a));
    }
}
