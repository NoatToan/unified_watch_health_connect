package h0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements androidx.camera.core.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f80533c;

    public l0(int i14, int i15, ByteBuffer byteBuffer) {
        this.f80531a = i14;
        this.f80532b = i15;
        this.f80533c = byteBuffer;
    }

    @Override // androidx.camera.core.e.a
    public final ByteBuffer d() {
        return this.f80533c;
    }

    @Override // androidx.camera.core.e.a
    public final int e() {
        return this.f80531a;
    }

    @Override // androidx.camera.core.e.a
    public final int f() {
        return this.f80532b;
    }
}
