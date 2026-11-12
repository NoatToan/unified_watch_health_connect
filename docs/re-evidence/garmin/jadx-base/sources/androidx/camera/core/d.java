package androidx.camera.core;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class d implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f5440b;

    public d(ImageProcessingUtil.a aVar, int i14, ByteBuffer byteBuffer) {
        this.f5439a = i14;
        this.f5440b = byteBuffer;
    }

    @Override // androidx.camera.core.e.a
    public final ByteBuffer d() {
        return this.f5440b;
    }

    @Override // androidx.camera.core.e.a
    public final int e() {
        return this.f5439a;
    }

    @Override // androidx.camera.core.e.a
    public final int f() {
        return 1;
    }
}
