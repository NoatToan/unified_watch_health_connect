package com.mapbox.maps.extension.compose.style.precipitations;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxMap f54463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Value f54465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f54466e;

    public /* synthetic */ c(Object obj, MapboxMap mapboxMap, String str, Value value, int i14) {
        this.f54462a = i14;
        this.f54466e = obj;
        this.f54463b = mapboxMap;
        this.f54464c = str;
        this.f54465d = value;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54462a) {
            case 0:
                RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4((RainStateApplier) this.f54466e, this.f54463b, this.f54464c, this.f54465d, (String) obj);
                break;
            default:
                SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4((SnowStateApplier) this.f54466e, this.f54463b, this.f54464c, this.f54465d, (String) obj);
                break;
        }
    }
}
