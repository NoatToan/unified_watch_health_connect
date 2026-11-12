package com.mapbox.maps.extension.compose.animation.viewport;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.plugin.viewport.CompletionListener;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import com.mapbox.maps.plugin.viewport.state.ViewportStateDataObserver;
import com.mapbox.maps.plugin.viewport.transition.ViewportTransition;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/compose/animation/viewport/GenericViewportTransition;", "Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;", "Lkotlin/Function2;", "Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/plugin/viewport/CompletionListener;", "Lcom/mapbox/common/Cancelable;", "doTransition", "<init>", "(Le23/p;)V", "Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "to", "completionListener", "run", "(Lcom/mapbox/maps/plugin/viewport/state/ViewportState;Lcom/mapbox/maps/plugin/viewport/CompletionListener;)Lcom/mapbox/common/Cancelable;", "Le23/p;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class GenericViewportTransition implements ViewportTransition {
    private final p<CameraOptions, CompletionListener, Cancelable> doTransition;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericViewportTransition(p<? super CameraOptions, ? super CompletionListener, ? extends Cancelable> pVar) {
        pVar.getClass();
        this.doTransition = pVar;
    }

    @Override // com.mapbox.maps.plugin.viewport.transition.ViewportTransition
    public Cancelable run(ViewportState to3, final CompletionListener completionListener) {
        to3.getClass();
        completionListener.getClass();
        final r0 r0Var = new r0();
        to3.observeDataSource(new ViewportStateDataObserver() { // from class: com.mapbox.maps.extension.compose.animation.viewport.GenericViewportTransition.run.1
            /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
            @Override // com.mapbox.maps.plugin.viewport.state.ViewportStateDataObserver
            public final boolean onNewData(CameraOptions cameraOptions) {
                cameraOptions.getClass();
                r0Var.f105810a = this.doTransition.invoke(cameraOptions, completionListener);
                return false;
            }
        });
        T t7 = r0Var.f105810a;
        if (t7 != 0) {
            return (Cancelable) t7;
        }
        s.m("cancelable");
        throw null;
    }
}
