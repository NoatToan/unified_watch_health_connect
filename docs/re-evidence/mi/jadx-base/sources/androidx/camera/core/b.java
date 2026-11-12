package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CameraState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraState.Type f1692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraState.a f1693b;

    public b(CameraState.Type type, CameraState.a aVar) {
        if (type == null) {
            throw new NullPointerException("Null type");
        }
        this.f1692a = type;
        this.f1693b = aVar;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.a c() {
        return this.f1693b;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.Type d() {
        return this.f1692a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (this.f1692a.equals(cameraState.d())) {
            CameraState.a aVar = this.f1693b;
            if (aVar == null) {
                if (cameraState.c() == null) {
                    return true;
                }
            } else if (aVar.equals(cameraState.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f1692a.hashCode() ^ 1000003) * 1000003;
        CameraState.a aVar = this.f1693b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f1692a + ", error=" + this.f1693b + "}";
    }
}
