package com.google.maps.android.compose.clustering;

import com.google.maps.android.compose.ComposeUiViewRenderer;
import o53.c2;
import p005kotlin.jvm.internal.m0;
import p3.x3;
import q53.t;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53948c;

    public /* synthetic */ g(int i14, Object obj, Object obj2) {
        this.f53946a = i14;
        this.f53947b = obj;
        this.f53948c = obj2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f53946a) {
            case 0:
                return Boolean.valueOf(ClusteringKt$rememberClusterManager$2$1.AnonymousClass1.invokeSuspend$lambda$0((x3) this.f53947b, (x3) this.f53948c));
            case 1:
                return ComposeUiClusterRenderer.AnonymousClass2.invokeSuspend$lambda$0((m0) this.f53947b, (t) this.f53948c);
            default:
                return ComposeUiClusterRenderer.createAndAddView$lambda$5((c2) this.f53947b, (ComposeUiViewRenderer.RenderHandle) this.f53948c);
        }
    }
}
