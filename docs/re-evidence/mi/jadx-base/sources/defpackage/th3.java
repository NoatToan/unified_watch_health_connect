package defpackage;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraInternal;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class th3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34698a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mCamerasLock")
    public final Map<String, CameraInternal> f34699b = new LinkedHashMap();

    @GuardedBy("mCamerasLock")
    public final Set<CameraInternal> c = new HashSet();

    public LinkedHashSet<CameraInternal> a() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.f34698a) {
            linkedHashSet = new LinkedHashSet<>(this.f34699b.values());
        }
        return linkedHashSet;
    }

    public void b(ah3 ah3Var) throws InitializationException {
        synchronized (this.f34698a) {
            try {
                for (String str : ah3Var.b()) {
                    zpe.a("CameraRepository", "Added camera: " + str);
                    this.f34699b.put(str, ah3Var.a(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
