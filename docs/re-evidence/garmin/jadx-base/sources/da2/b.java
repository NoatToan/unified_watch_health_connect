package da2;

import android.text.TextUtils;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes7.dex */
public class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, l> f58876a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f58877b = LoggerFactory.getLogger("GDI#ConnectedDeviceRegistry");

    public final DeviceProfile[] a(long j8) {
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.f58876a.values()) {
            DeviceProfile profile = lVar.getProfile();
            if (profile != null && profile.getF172494b() == j8) {
                arrayList.add(lVar.getProfile());
            }
        }
        return (DeviceProfile[]) arrayList.toArray(new DeviceProfile[0]);
    }

    public final String[] b(long j8) {
        String[] strArr = new String[0];
        l[] lVarArrC = c(j8);
        if (lVarArrC == null || lVarArrC.length <= 0) {
            return strArr;
        }
        String[] strArr2 = new String[lVarArrC.length];
        for (int i14 = 0; i14 < lVarArrC.length; i14++) {
            strArr2[i14] = lVarArrC[i14].getMacAddress();
        }
        return strArr2;
    }

    public final l[] c(long j8) {
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.f58876a.values()) {
            DeviceProfile profile = lVar.getProfile();
            if (profile != null && profile.getF172494b() == j8) {
                arrayList.add(lVar);
            }
        }
        return (l[]) arrayList.toArray(new l[0]);
    }

    public final DeviceProfile d(String str) {
        l lVarF = f(str);
        if (lVarF != null) {
            return lVarF.getProfile();
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.f58876a.values()) {
            if (lVar.getProfile() != null) {
                arrayList.add(lVar.getProfile());
            }
        }
        return arrayList;
    }

    public final l f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f58876a.get(str);
    }

    public final void g(String str, DeviceManager deviceManager) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f58876a.put(str, deviceManager);
        this.f58877b.debug("Registered remote device proxy: DeviceManager (hashCode=" + deviceManager.hashCode() + ", macAddress=" + str + ")");
    }

    @Override // com.garmin.device.datatypes.capabilities.CapabilitiesRegistry
    public final <T> T getCapability(String str, Class<T> cls) {
        l lVar;
        if (TextUtils.isEmpty(str) || (lVar = this.f58876a.get(str)) == null) {
            return null;
        }
        return (T) lVar.getCapability(cls);
    }

    public final void h(String str) {
        if (TextUtils.isEmpty(str) || this.f58876a.remove(str) == null) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a.w("Unregistered remote device proxy: macAddress=", str, this.f58877b);
    }
}
