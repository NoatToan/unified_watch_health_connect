package com.mapbox.common.movement;

import com.mapbox.common.location.GoogleDeviceLocationProviderKt;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class ProxyGoogleActivityRecognitionClient$Companion$available$2 extends w implements a<Boolean> {
    public static final ProxyGoogleActivityRecognitionClient$Companion$available$2 INSTANCE = new ProxyGoogleActivityRecognitionClient$Companion$available$2();

    public ProxyGoogleActivityRecognitionClient$Companion$available$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Boolean invoke() {
        return Boolean.valueOf(GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayActivityRecognitionAvailable());
    }
}
