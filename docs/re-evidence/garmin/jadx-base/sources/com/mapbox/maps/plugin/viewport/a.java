package com.mapbox.maps.plugin.viewport;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Cancelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54579b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f54578a = i14;
        this.f54579b = obj;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        switch (this.f54578a) {
            case 0:
                ViewportPluginImpl.transitionTo$lambda$2$lambda$1((ViewportState) this.f54579b);
                break;
            default:
                OverviewViewportStateImpl.evaluateViewportData$lambda$1((m0) this.f54579b);
                break;
        }
    }
}
