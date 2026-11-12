package com.mapbox.maps.extension.compose.style.layers.internal;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54446a;

    public /* synthetic */ c(int i14) {
        this.f54446a = i14;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f54446a) {
            case 0:
                LayerNode.AnonymousClass1.invoke$lambda$0(str);
                break;
            default:
                LayerNode.addLayer$lambda$4(str);
                break;
        }
    }
}
