package dn2;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldn2/c;", "Ldn2/i;", "<init>", "()V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class c implements i {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object i(c cVar, SharedDeviceInfo sharedDeviceInfo, SharedDeviceInfo sharedDeviceInfo2, e23.a aVar, v13.c cVar2) {
        a aVar2;
        if (cVar2 instanceof a) {
            aVar2 = (a) cVar2;
            int i14 = aVar2.f60538d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f60538d = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(cVar, cVar2);
            }
        } else {
            aVar2 = new a(cVar, cVar2);
        }
        Object obj = aVar2.f60536b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f60538d;
        if (i15 == 0) {
            r.b(obj);
            if (sharedDeviceInfo2.isPaired() && !sharedDeviceInfo.isPaired()) {
                cVar.j(sharedDeviceInfo2);
            }
            boolean zIsPaired = sharedDeviceInfo2.isPaired();
            aVar2.f60535a = aVar;
            aVar2.f60538d = 1;
            if (cVar.l(sharedDeviceInfo, zIsPaired, aVar2) == obj2) {
                return obj2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = aVar2.f60535a;
            r.b(obj);
        }
        if (aVar != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object m(c cVar, SharedDeviceInfo sharedDeviceInfo, SharedDeviceInfo sharedDeviceInfo2, e23.a aVar, v13.c cVar2) {
        b bVar;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i14 = bVar.f60542d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f60542d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar, cVar2);
            }
        } else {
            bVar = new b(cVar, cVar2);
        }
        Object obj = bVar.f60540b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f60542d;
        if (i15 == 0) {
            r.b(obj);
            boolean z14 = false;
            if (sharedDeviceInfo2 != null && sharedDeviceInfo2.isPaired()) {
                z14 = true;
            }
            bVar.f60539a = aVar;
            bVar.f60542d = 1;
            if (cVar.l(sharedDeviceInfo, z14, bVar) == obj2) {
                return obj2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = bVar.f60539a;
            r.b(obj);
        }
        if (aVar != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // dn2.i
    public final Object a(SharedDeviceInfo sharedDeviceInfo, SharedDeviceInfo sharedDeviceInfo2, an2.h hVar, an2.g gVar) {
        return m(this, sharedDeviceInfo, sharedDeviceInfo2, hVar, gVar);
    }

    @Override // dn2.i
    public final Object b(SharedDeviceInfo sharedDeviceInfo, SharedDeviceInfo sharedDeviceInfo2, an2.h hVar, an2.g gVar) {
        return i(this, sharedDeviceInfo, sharedDeviceInfo2, hVar, gVar);
    }

    @Override // dn2.i
    public final Object d(SharedDeviceInfo sharedDeviceInfo, SharedDeviceInfo sharedDeviceInfo2, an2.g gVar) {
        if (sharedDeviceInfo.isPaired()) {
            k(sharedDeviceInfo);
        }
        Object objL = l(sharedDeviceInfo, sharedDeviceInfo2 != null ? sharedDeviceInfo2.isPaired() : false, gVar);
        return objL == u13.a.COROUTINE_SUSPENDED ? objL : Unit.INSTANCE;
    }

    @Override // dn2.i
    public final void e(SharedDeviceInfo sharedDeviceInfo) {
    }

    @Override // dn2.i
    public final Object f(SharedDeviceInfo sharedDeviceInfo, SharedDeviceInfo sharedDeviceInfo2, an2.g gVar) {
        if (sharedDeviceInfo2.isPaired() && !s.g(sharedDeviceInfo.getMacAddress(), sharedDeviceInfo2.getMacAddress())) {
            j(sharedDeviceInfo2);
        }
        k(sharedDeviceInfo);
        Object objL = l(sharedDeviceInfo, sharedDeviceInfo2.isPaired(), gVar);
        return objL == u13.a.COROUTINE_SUSPENDED ? objL : Unit.INSTANCE;
    }

    @Override // dn2.i
    public final Object g(SharedDeviceInfo sharedDeviceInfo, v13.c cVar) {
        if (sharedDeviceInfo.isPaired()) {
            j(sharedDeviceInfo);
        }
        Unit unitH = h(sharedDeviceInfo);
        return unitH == u13.a.COROUTINE_SUSPENDED ? unitH : Unit.INSTANCE;
    }

    public abstract Unit h(SharedDeviceInfo sharedDeviceInfo);

    public abstract void j(SharedDeviceInfo sharedDeviceInfo);

    public abstract void k(SharedDeviceInfo sharedDeviceInfo);

    public abstract Object l(SharedDeviceInfo sharedDeviceInfo, boolean z14, v13.c cVar);
}
