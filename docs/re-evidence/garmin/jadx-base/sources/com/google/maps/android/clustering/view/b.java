package com.google.maps.android.clustering.view;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53859b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f53858a = i14;
        this.f53859b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53858a) {
            case 0:
                ((ClusterRendererMultipleItems.AnimationTask) this.f53859b).cancel();
                break;
            case 1:
                ((ClusterRendererMultipleItems.ViewModifier) this.f53859b).lambda$handleMessage$0();
                break;
            case 2:
                ((DefaultAdvancedMarkersClusterRenderer.ViewModifier) this.f53859b).lambda$handleMessage$0();
                break;
            default:
                ((DefaultClusterRenderer.ViewModifier) this.f53859b).lambda$handleMessage$0();
                break;
        }
    }
}
