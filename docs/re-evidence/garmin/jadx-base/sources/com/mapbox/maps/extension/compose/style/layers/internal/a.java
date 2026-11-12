package com.mapbox.maps.extension.compose.style.layers.internal;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.extension.compose.style.StyleImage;
import o13.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54442b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f54441a = i14;
        this.f54442b = obj;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54441a) {
            case 0:
                LayerNode$addImage$1.invoke$lambda$0((StyleImage) this.f54442b, (String) obj);
                break;
            default:
                LayerNode$addModel$1.invoke$lambda$0((p) this.f54442b, (String) obj);
                break;
        }
    }
}
