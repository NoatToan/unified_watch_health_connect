package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk90/i;", "Lk90/h;", "Lk90/i0;", "getDevicePairingState", "<init>", "(Lk90/i0;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f103497a;

    static {
        new a(null);
    }

    public i(i0 i0Var) {
        i0Var.getClass();
        this.f103497a = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k90.h
    public final Object a(dk2.d dVar, v13.c cVar) throws Throwable {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f103503d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f103503d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objE0 = jVar.f103501b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f103503d;
        if (i15 == 0) {
            o13.r.b(objE0);
            if (!x80.d.c(dVar.f60239c)) {
                a2 a2Var = a2.DEVICE_SETUP;
                String str = "Device [" + dVar.f60244h + "," + dVar.f60239c + "] does not support new setup, filtering out";
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceTypeDiscoveryFilter", str);
                return Boolean.FALSE;
            }
            jVar.f103500a = dVar;
            jVar.f103503d = 1;
            i0 i0Var = this.f103497a;
            objE0 = ge1.b.e0(i0Var.f103499b, new g0(i0Var, dVar, null), jVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = jVar.f103500a;
            o13.r.b(objE0);
        }
        if (!((Boolean) objE0).booleanValue()) {
            return Boolean.TRUE;
        }
        a2 a2Var2 = a2.DEVICE_SETUP;
        String str2 = "Device [" + dVar.f60244h + "," + dVar.f60239c + "] is already paired, filtering out";
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "DeviceTypeDiscoveryFilter", str2);
        return Boolean.FALSE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk90/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
