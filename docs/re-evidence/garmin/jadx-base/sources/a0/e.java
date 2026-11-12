package a0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.core.impl.k0;
import b0.r;
import java.util.Collections;
import java.util.List;
import v.j0;
import v.w;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f29a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f30b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Pair<CameraCharacteristics.Key, Object>> f31c;

    private e(w wVar, List<Pair<CameraCharacteristics.Key, Object>> list) {
        this.f29a = wVar;
        this.f31c = list;
    }

    public static e a(r rVar) {
        if (rVar instanceof j0) {
            return ((j0) rVar).f173852c;
        }
        k0 implementation = ((k0) rVar).getImplementation();
        k7.h.b(implementation instanceof w, "CameraInfo doesn't contain Camera2 implementation.");
        e eVar = ((w) implementation).f174096c;
        return (!(rVar instanceof androidx.camera.core.impl.c) || ((androidx.camera.core.impl.c) rVar).f5516c == null) ? eVar : new e(eVar.f29a, Collections.EMPTY_LIST);
    }

    public e(j0 j0Var) {
        this.f30b = j0Var;
    }

    public e(w wVar) {
        this.f29a = wVar;
    }
}
