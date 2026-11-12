package com.mapbox.maps.extension.compose.style.precipitations;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxMap f54468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Value f54470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f54471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f54472f;

    public /* synthetic */ d(Object obj, MapboxMap mapboxMap, String str, Value value, String str2, int i14) {
        this.f54467a = i14;
        this.f54472f = obj;
        this.f54468b = mapboxMap;
        this.f54469c = str;
        this.f54470d = value;
        this.f54471e = str2;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54467a) {
            case 0:
                RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2((RainStateApplier) this.f54472f, this.f54468b, this.f54469c, this.f54470d, this.f54471e, (None) obj);
                break;
            default:
                SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2((SnowStateApplier) this.f54472f, this.f54468b, this.f54469c, this.f54470d, this.f54471e, (None) obj);
                break;
        }
    }
}
