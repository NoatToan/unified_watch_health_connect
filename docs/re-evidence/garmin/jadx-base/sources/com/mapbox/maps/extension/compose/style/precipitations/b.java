package com.mapbox.maps.extension.compose.style.precipitations;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Value f54461c;

    public /* synthetic */ b(String str, Value value, int i14) {
        this.f54459a = i14;
        this.f54460b = str;
        this.f54461c = value;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54459a) {
            case 0:
                RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2$lambda$1(this.f54460b, this.f54461c, (None) obj);
                break;
            case 1:
                RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$5(this.f54460b, this.f54461c, (None) obj);
                break;
            case 2:
                RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$3(this.f54460b, this.f54461c, (String) obj);
                break;
            case 3:
                SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2$lambda$1(this.f54460b, this.f54461c, (None) obj);
                break;
            case 4:
                SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$3(this.f54460b, this.f54461c, (String) obj);
                break;
            default:
                SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$5(this.f54460b, this.f54461c, (None) obj);
                break;
        }
    }
}
