package com.mapbox.maps.extension.compose.style.precipitations;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Value f54457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54458d;

    public /* synthetic */ a(String str, String str2, Value value, int i14) {
        this.f54455a = i14;
        this.f54456b = str;
        this.f54457c = value;
        this.f54458d = str2;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54455a) {
            case 0:
                RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2$lambda$0(this.f54456b, this.f54457c, this.f54458d, (String) obj);
                break;
            default:
                SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2$lambda$0(this.f54456b, this.f54457c, this.f54458d, (String) obj);
                break;
        }
    }
}
