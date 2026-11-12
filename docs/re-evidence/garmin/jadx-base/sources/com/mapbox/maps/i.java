package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.viewport.state.FollowPuckViewportStateImpl;
import com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl;
import com.mapbox.maps.plugin.viewport.state.ViewportStateDataObserver;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Cancelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54507c;

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f54505a = i14;
        this.f54506b = obj;
        this.f54507c = obj2;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        switch (this.f54505a) {
            case 0:
                MapboxMap.addInteraction$lambda$22((MapboxMap) this.f54506b, (Cancelable) this.f54507c);
                break;
            case 1:
                FollowPuckViewportStateImpl.observeDataSource$lambda$5((FollowPuckViewportStateImpl) this.f54506b, (ViewportStateDataObserver) this.f54507c);
                break;
            default:
                OverviewViewportStateImpl.observeDataSource$lambda$3((OverviewViewportStateImpl) this.f54506b, (ViewportStateDataObserver) this.f54507c);
                break;
        }
    }
}
