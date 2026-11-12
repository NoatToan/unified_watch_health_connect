package com.mapbox.maps.extension.compose.style.layers.internal;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayerNode f54448b;

    public /* synthetic */ d(LayerNode layerNode, int i14) {
        this.f54447a = i14;
        this.f54448b = layerNode;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54447a) {
            case 0:
                LayerNode.AnonymousClass1.invoke$lambda$1(this.f54448b, (None) obj);
                break;
            default:
                LayerNode.addLayer$lambda$5(this.f54448b, (None) obj);
                break;
        }
    }
}
