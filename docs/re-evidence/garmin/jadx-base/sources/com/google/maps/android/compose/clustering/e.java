package com.google.maps.android.compose.clustering;

import com.google.maps.android.compose.CameraPositionState;
import p3.x3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53944b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f53943a = i14;
        this.f53944b = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f53943a) {
            case 0:
                return Boolean.valueOf(((CameraPositionState) this.f53944b).isMoving());
            default:
                return ClusteringKt$Clustering$25$1.invokeSuspend$lambda$0((x3) this.f53944b);
        }
    }
}
