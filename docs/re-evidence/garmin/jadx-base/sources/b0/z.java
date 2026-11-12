package b0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z implements androidx.camera.core.impl.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<androidx.camera.core.impl.w0> f14123a;

    public z(List<androidx.camera.core.impl.w0> list) {
        if (list == null || list.isEmpty()) {
            vb.h.s("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.f14123a = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // androidx.camera.core.impl.u0
    public final List<androidx.camera.core.impl.w0> a() {
        return this.f14123a;
    }
}
