package com.google.android.exoplayer2;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoadControl f52981b;

    public /* synthetic */ d(LoadControl loadControl, int i14) {
        this.f52980a = i14;
        this.f52981b = loadControl;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f52980a) {
            case 0:
                return ExoPlayer.Builder.lambda$setLoadControl$19(this.f52981b);
            default:
                return ExoPlayer.Builder.lambda$new$11(this.f52981b);
        }
    }
}
