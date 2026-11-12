package i1;

import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.k0;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import z0.u;

/* JADX INFO: loaded from: classes.dex */
public class d implements e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f86983f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f86984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f86985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i2 f86986e;

    static {
        HashMap map = new HashMap();
        f86983f = map;
        map.put(1, u.f200713f);
        map.put(8, u.f200711d);
        map.put(6, u.f200710c);
        map.put(5, u.f200709b);
        map.put(4, u.f200708a);
        map.put(0, u.f200712e);
    }

    public d(e1 e1Var, k0 k0Var, i2 i2Var) {
        this.f86984c = e1Var;
        this.f86985d = k0Var;
        this.f86986e = i2Var;
    }

    @Override // androidx.camera.core.impl.e1
    public final f1 a(int i14) {
        if (b(i14)) {
            return this.f86984c.a(i14);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.e1
    public final boolean b(int i14) {
        if (!this.f86984c.b(i14)) {
            return false;
        }
        u uVar = (u) f86983f.get(Integer.valueOf(i14));
        if (uVar == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f86986e.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.c(this.f86985d, uVar) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).b())) {
                return false;
            }
        }
        return true;
    }
}
