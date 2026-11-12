package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk90/b;", "Lk90/a;", "Lk90/i0;", "getDevicePairingState", "<init>", "(Lk90/i0;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f103434a;

    static {
        new a(null);
    }

    public b(i0 i0Var) {
        i0Var.getClass();
        this.f103434a = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k90.a
    public final Object a(dk2.d dVar, l90.d dVar2, v13.c cVar) throws Throwable {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f103440d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f103440d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objE0 = cVar2.f103438b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f103440d;
        if (i15 == 0) {
            o13.r.b(objE0);
            String str = dVar.f60239c;
            Long l14 = dVar.f60244h;
            if (!x80.d.c(str)) {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "DeviceDiscoveryFilter", "Device [" + l14 + "," + str + "] does not support new setup, filtering out");
                return Boolean.FALSE;
            }
            if (!dVar.f()) {
                a2 a2Var = a2.DEVICE_SETUP;
                String strI = f3.i(b71.i.j("Device [", ",", str, l14, ","), dVar.f60241e, "] is not ready to pair, filtering out");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceDiscoveryFilter", strI);
                return Boolean.FALSE;
            }
            if (dVar2 != null) {
                Long l15 = dVar2.f111537a;
                boolean zG = (l14 == null || l14.longValue() == 0 || l15 == null || l15.longValue() == 0) ? true : p005kotlin.jvm.internal.s.g(l14, l15);
                boolean zG2 = p005kotlin.jvm.internal.s.g(str, dVar2.f111538b);
                if (!zG || !zG2) {
                    a2 a2Var2 = a2.DEVICE_SETUP;
                    StringBuilder sbJ = b71.i.j("Device [", ",", str, l14, "] does not match filter criteria: ");
                    sbJ.append(dVar2);
                    String string = sbJ.toString();
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "DeviceDiscoveryFilter", string);
                    return Boolean.FALSE;
                }
            }
            cVar2.f103437a = dVar;
            cVar2.f103440d = 1;
            i0 i0Var = this.f103434a;
            objE0 = ge1.b.e0(i0Var.f103499b, new g0(i0Var, dVar, null), cVar2);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = cVar2.f103437a;
            o13.r.b(objE0);
        }
        if (!((Boolean) objE0).booleanValue()) {
            return Boolean.TRUE;
        }
        a2 a2Var3 = a2.DEVICE_SETUP;
        String str2 = "Device [" + dVar.f60244h + "," + dVar.f60239c + "] is already paired, filtering out";
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "DeviceDiscoveryFilter", str2);
        return Boolean.FALSE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk90/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
