package com.huawei.hms.kit.awareness.barrier.internal.b;

/* JADX INFO: loaded from: classes34.dex */
public class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f13946b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13947c;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public com.huawei.hms.kit.awareness.barrier.internal.type.f d() {
        return com.huawei.hms.kit.awareness.barrier.internal.type.f.AMBIENT;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public boolean c() {
        return this.f13947c > 0.0f;
    }

    public void a(float f) {
        this.f13947c = f;
    }

    public float a() {
        return this.f13947c;
    }

    public b(float f) {
        this.f13947c = f;
    }
}
