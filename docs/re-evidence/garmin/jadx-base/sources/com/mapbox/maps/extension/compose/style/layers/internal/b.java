package com.mapbox.maps.extension.compose.style.layers.internal;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.maps.extension.compose.style.StyleImage;
import o13.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayerNode f54444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54445c;

    public /* synthetic */ b(LayerNode layerNode, Object obj, int i14) {
        this.f54443a = i14;
        this.f54444b = layerNode;
        this.f54445c = obj;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54443a) {
            case 0:
                LayerNode$addImage$1.invoke$lambda$1(this.f54444b, (StyleImage) this.f54445c, (None) obj);
                break;
            default:
                LayerNode$addModel$1.invoke$lambda$1(this.f54444b, (p) this.f54445c, (None) obj);
                break;
        }
    }
}
