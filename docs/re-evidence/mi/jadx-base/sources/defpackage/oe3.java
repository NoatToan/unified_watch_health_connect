package defpackage;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oe3 implements vg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, aqo> f29056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cc3 f29057b;

    public class a implements cc3 {
        @Override // defpackage.cc3
        public CamcorderProfile a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // defpackage.cc3
        public boolean b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public oe3(Context context, Object obj, Set<String> set) throws CameraUnavailableException {
        this(context, new a(), obj, set);
    }

    @Override // defpackage.vg3
    public SurfaceConfig a(String str, int i, Size size) {
        aqo aqoVar = this.f29056a.get(str);
        if (aqoVar != null) {
            return aqoVar.L(i, size);
        }
        return null;
    }

    @Override // defpackage.vg3
    public Map<r<?>, Size> b(String str, List<SurfaceConfig> list, List<r<?>> list2) {
        g6i.b(!list2.isEmpty(), "No new use cases to be bound.");
        aqo aqoVar = this.f29056a.get(str);
        if (aqoVar != null) {
            return aqoVar.y(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    public final void c(Context context, ih3 ih3Var, Set<String> set) throws CameraUnavailableException {
        g6i.g(context);
        for (String str : set) {
            this.f29056a.put(str, new aqo(context, str, ih3Var, this.f29057b));
        }
    }

    public oe3(Context context, cc3 cc3Var, Object obj, Set<String> set) throws CameraUnavailableException {
        this.f29056a = new HashMap();
        g6i.g(cc3Var);
        this.f29057b = cc3Var;
        c(context, obj instanceof ih3 ? (ih3) obj : ih3.a(context), set);
    }
}
