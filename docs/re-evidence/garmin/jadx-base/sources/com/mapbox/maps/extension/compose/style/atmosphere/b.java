package com.mapbox.maps.extension.compose.style.atmosphere;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Value f54429c;

    public /* synthetic */ b(String str, Value value, int i14) {
        this.f54427a = i14;
        this.f54428b = str;
        this.f54429c = value;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54427a) {
            case 0:
                AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$5(this.f54428b, this.f54429c, (None) obj);
                break;
            case 1:
                AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2$lambda$1(this.f54428b, this.f54429c, (None) obj);
                break;
            default:
                AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$3(this.f54428b, this.f54429c, (String) obj);
                break;
        }
    }
}
