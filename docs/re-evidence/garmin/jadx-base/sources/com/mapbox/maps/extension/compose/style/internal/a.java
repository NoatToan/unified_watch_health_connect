package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.maps.extension.compose.style.projection.generated.Projection;
import com.mapbox.maps.extension.style.types.PromoteId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Expected.Action, Expected.Transformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54440b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f54439a = i14;
        this.f54440b = obj;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        return ComposeTypeUtils.wrapToValue$lambda$2$lambda$0((PromoteId) this.f54440b, (String) obj);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        switch (this.f54439a) {
            case 0:
                MapStyleNode$updateProjection$1.AnonymousClass1.emit$lambda$0((Projection) this.f54440b, (None) obj);
                break;
            default:
                MapStyleNode$updateProjection$1.AnonymousClass1.emit$lambda$1((Projection) this.f54440b, (String) obj);
                break;
        }
    }
}
