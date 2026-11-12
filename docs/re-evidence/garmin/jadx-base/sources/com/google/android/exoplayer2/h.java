package com.google.android.exoplayer2;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class h implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RenderersFactory f53007b;

    public /* synthetic */ h(RenderersFactory renderersFactory, int i14) {
        this.f53006a = i14;
        this.f53007b = renderersFactory;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53006a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$2(this.f53007b);
            case 1:
                return ExoPlayer.Builder.lambda$setRenderersFactory$16(this.f53007b);
            case 2:
                return ExoPlayer.Builder.lambda$new$6(this.f53007b);
            default:
                return ExoPlayer.Builder.lambda$new$8(this.f53007b);
        }
    }
}
