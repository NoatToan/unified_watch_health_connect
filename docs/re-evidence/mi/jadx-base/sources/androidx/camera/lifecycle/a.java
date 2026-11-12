package androidx.camera.lifecycle;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class a extends LifecycleCameraRepository.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f1833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraUseCaseAdapter.a f1834b;

    public a(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.a aVar) {
        if (lifecycleOwner == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f1833a = lifecycleOwner;
        if (aVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f1834b = aVar;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public CameraUseCaseAdapter.a b() {
        return this.f1834b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public LifecycleOwner c() {
        return this.f1833a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.a)) {
            return false;
        }
        LifecycleCameraRepository.a aVar = (LifecycleCameraRepository.a) obj;
        return this.f1833a.equals(aVar.c()) && this.f1834b.equals(aVar.b());
    }

    public int hashCode() {
        return ((this.f1833a.hashCode() ^ 1000003) * 1000003) ^ this.f1834b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f1833a + ", cameraId=" + this.f1834b + "}";
    }
}
