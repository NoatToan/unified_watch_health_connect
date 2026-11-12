package da2;

import com.garmin.device.datatypes.capabilities.CapabilitiesRegistry;

/* JADX INFO: loaded from: classes7.dex */
public class f implements CapabilitiesRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f58896a;

    private f() {
    }

    public static f a() {
        if (f58896a == null) {
            f58896a = new f();
        }
        return f58896a;
    }

    @Override // com.garmin.device.datatypes.capabilities.CapabilitiesRegistry
    public final <T> T getCapability(String str, Class<T> cls) {
        d dVarB = d.b();
        b bVar = dVarB != null ? dVarB.f58886a.f111646e : null;
        if (bVar != null) {
            return (T) bVar.getCapability(str, cls);
        }
        return null;
    }
}
