package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/v3;", "Ltv0/d;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v3 implements tv0.d {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l<zd1.a.C3809a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f104395a = new a();

        @Override // e23.l
        public final Unit invoke(zd1.a.C3809a c3809a) {
            c3809a.getClass();
            return Unit.INSTANCE;
        }
    }

    @Override // tv0.d
    public final Intent a(Context context) {
        zd1.a aVar = zd1.a.f204221a;
        a aVar2 = a.f104395a;
        aVar.getClass();
        Intent intentA = zd1.a.a(context, aVar2);
        intentA.putExtra("OPEN_LIFESTYLE_LOGGING_REMINDERS", true);
        intentA.addFlags(603979776);
        return intentA;
    }

    @Override // tv0.d
    public final void b(nw0.f fVar) {
        Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
        j83.l lVarD = j83.l.a(new jr2.f(3)).d(Schedulers.io());
        hy.d dVar = new hy.d(new iz1.f(fVar, 23), 14);
        int i14 = n83.c.f124984a;
        n83.c.b bVar = n83.c.b.INSTANCE;
        if (bVar != null) {
            lVarD.c(new j83.i(lVarD, bVar, dVar));
        } else {
            vb.h.s("onError can not be null");
        }
    }

    @Override // tv0.d
    public final void c() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.HAS_ENTERED_LIFESTYLE_LOGGING);
    }

    @Override // tv0.d
    public final boolean d() {
        tb1.c.a aVar = tb1.c.f163744a;
        i52.a.f91796a.getClass();
        ww0.a aVarL = i52.a.l();
        aVar.getClass();
        return tb1.c.a.a(aVarL);
    }

    @Override // tv0.d
    public final ArrayList e() {
        l80.b bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
        ArrayList arrayListW = bVar.w();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListW.iterator();
        while (it.hasNext()) {
            String macAddress = ((DeviceProfile) it.next()).getMacAddress();
            macAddress.getClass();
            ov0.a aVar = (ov0.a) bVar.getCapability(macAddress, ov0.a.class);
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
