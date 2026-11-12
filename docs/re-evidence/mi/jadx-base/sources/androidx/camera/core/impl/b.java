package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final class b extends SurfaceConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceConfig.ConfigType f1724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceConfig.ConfigSize f1725b;

    public b(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize) {
        if (configType == null) {
            throw new NullPointerException("Null configType");
        }
        this.f1724a = configType;
        if (configSize == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f1725b = configSize;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigSize b() {
        return this.f1725b;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigType c() {
        return this.f1724a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.f1724a.equals(surfaceConfig.c()) && this.f1725b.equals(surfaceConfig.b());
    }

    public int hashCode() {
        return ((this.f1724a.hashCode() ^ 1000003) * 1000003) ^ this.f1725b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f1724a + ", configSize=" + this.f1725b + "}";
    }
}
