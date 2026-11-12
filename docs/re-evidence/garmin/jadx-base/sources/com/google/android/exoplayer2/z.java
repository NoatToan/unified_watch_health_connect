package com.google.android.exoplayer2;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class z implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53155b;

    public /* synthetic */ z(Object obj, int i14) {
        this.f53154a = i14;
        this.f53155b = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53154a) {
            case 0:
                return ((ExoPlayerImplInternal) this.f53155b).lambda$release$0();
            default:
                return Boolean.valueOf(((AtomicBoolean) this.f53155b).get());
        }
    }
}
