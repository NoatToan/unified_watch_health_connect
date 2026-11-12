package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import b0.b0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f180963a;

    public interface a {
        Set<b0> a();

        Set<b0> b(b0 b0Var);

        DynamicRangeProfiles c();
    }

    public d(a aVar) {
        this.f180963a = aVar;
    }

    public static d a(androidx.camera.camera2.internal.compat.h hVar) {
        DynamicRangeProfiles dynamicRangeProfilesA;
        int i14 = Build.VERSION.SDK_INT;
        d dVar = null;
        if (i14 >= 33 && (dynamicRangeProfilesA = tr2.a.a(hVar.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            k7.h.f(i14 >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
            dVar = new d(new e(dynamicRangeProfilesA));
        }
        return dVar == null ? f.f180965a : dVar;
    }
}
